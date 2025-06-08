// core/engine/PricingService.java
package core.engine;
/*Merret me rrjedhën kryesore të llogaritjes: merr një Flight dhe PricingContext,
i kalon ato radhazi te secila PricingStrategy.apply(...) dhe rikthen çmimin final.*/
import core.db.Flight;
import plugins.api.PricingStrategy;
import java.util.List;

public class PricingService {
    private final List<PricingStrategy> strategies;

    public PricingService(PluginManager manager) {
        this.strategies = manager.getStrategies();
    }

    public double calculatePrice(Flight flight, PricingContext context) {
        double price = flight.getBasePrice();
        for (PricingStrategy strat : strategies) {
            price = strat.apply(flight, context);
        }
        return price;
    }
}