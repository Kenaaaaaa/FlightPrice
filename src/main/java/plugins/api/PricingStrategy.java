// plugins/api/PricingStrategy.java
package plugins.api;
/*– Është kontrata (API) që çdo plugin çmimi duhet të zbatojë.
– Falë interface-it, PricingService mund t’i thërrasë të gjitha strategjitë njësoj, pa e ditur implementimin e brendshëm.


 * */
import core.db.Flight;
import core.engine.PricingContext;

public interface PricingStrategy {
    double apply(Flight flight, PricingContext context);
}