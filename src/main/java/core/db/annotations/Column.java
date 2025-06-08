// core/db/annotations/Column.java
package core.db.annotations;
/*@Column(name="…")
– Shënon fushat (fields) e klasës si kolona të caktuara në tabelë.
– Gjithashtu përdoret për të gjeneruar automatikisht SELECT/INSERT pa gabime emrash.*/
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {
    String name();
}