// core/db/annotations/Entity.java
package core.db.annotations;
/*@Entity(table="…")
– Përcakton që një klasë Java përfaqëson një tabelë në bazën e të dhënave.
– Lejon që me reflection të nxirret emri i tabelës pa e “hard-code” në SQL*/
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Entity {
    String table();
}