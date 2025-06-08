// plugins/api/PricingStrategy.java
package plugins.api;

import core.db.Flight;
import core.engine.PricingContext;

public interface PricingStrategy {
    double apply(Flight flight, PricingContext context);
}