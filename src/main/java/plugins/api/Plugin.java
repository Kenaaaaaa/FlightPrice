// plugins/api/Plugin.java
package plugins.api;
/*@Plugin(name="…")
– Shënon klasat që do të konsiderohen “plugin” të çmimit.
– PluginManager i gjen këto klasa në jar-at në folder-in /plugins.*/
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Plugin {
    String name();
}