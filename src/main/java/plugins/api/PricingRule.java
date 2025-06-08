// plugins/api/PricingRule.java
package plugins.api;
/*@PricingRule(priority=…)
– Aplikohet mbi metoda brenda një plugin-i për të treguar rregulla të veçanta.
– Prioriteti përdoret nga PricingRuleExecutor për t’i ekzekutuar në rendin e duhur.*/
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PricingRule {
    int priority() default 0;
}