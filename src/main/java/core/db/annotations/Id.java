
// core/db/annotations/Id.java
package core.db.annotations;
/*@Id
– Identifikon fushën që është çelësi primar i tabelës.
– Ndihmon FlightRepository të dijë se cilën kolona e përdorim për WHERE id = ?*/
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Id { }
