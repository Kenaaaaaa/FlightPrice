// core/db/DataSourceFactory.java
package core.db;
/*DataSourceFactory
– Konfiguron dhe kthen një instance të HikariCP DataSource.
– Merret me pool-in e lidhjeve JDBC për performancë optimale.*/
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;

public class DataSourceFactory {
    public static DataSource getDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/flights");
        config.setUsername("user");
        config.setPassword("pass");
        return new HikariDataSource(config);
    }
}