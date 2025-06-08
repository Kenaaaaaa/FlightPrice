// core/engine/Main.java
package core.engine;
/*Startup → Main krijon PluginManager dhe ngarkon plugin-at.

Kërkesë çmimi → PricingService.calculatePrice(flight, ctx) iteron mbi të gjitha PricingStrategy.

Metodat e plugin-eve → secila metodë e shënuar @PricingRule ekzekutohet në rendin e priority.

DB access → FlightRepository merret me ngarkimin/shtimin e objektit Flight në tabelë.*/
public class Main {
    public static void main(String[] args) throws Exception {
        PluginManager pluginManager = new PluginManager("plugins");
        pluginManager.loadPlugins();

        System.out.println("Loaded pricing strategies:");
        pluginManager.getStrategies().forEach(s ->
                System.out.println(" - " + s.getClass().getSimpleName())
        );
    }
}