
// core/db/FlightRepository.java
package core.db;
/*FlightRepository
– Përmban metodat CRUD: findById(id) dhe save(flight).
– Zbaton JDBC të pastër (PreparedStatement, try-with-resources) për siguri dhe pastrim të kodit.*/
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FlightRepository {
    private final DataSource ds;

    public FlightRepository(DataSource ds) {
        this.ds = ds;
    }

    public Flight findById(long id) throws Exception {
        String sql = "SELECT id, base_price FROM flights WHERE id = ?";
        try (Connection conn = ds.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Flight f = new Flight();
                    f.setId(rs.getLong("id"));
                    f.setBasePrice(rs.getDouble("base_price"));
                    return f;
                }
            }
        }
        return null;
    }

    public void save(Flight flight) throws Exception {
        String sql = "INSERT INTO flights (id, base_price) VALUES (?, ?)";
        try (Connection conn = ds.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, flight.getId());
            ps.setDouble(2, flight.getBasePrice());
            ps.executeUpdate();
        }
    }
}