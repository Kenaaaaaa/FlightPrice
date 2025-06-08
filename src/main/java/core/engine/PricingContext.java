/**
 * Contextual information for pricing calculations.
 */
// core/engine/PricingContext.java
package core.engine;
/*PricingContext
– Mban informacionin kontekstual (data/orari, metadata) për llogaritjen e çmimit.
– Lejon plugin-at të marrin parametrat shtesë (p.sh. “peak hours”, “holiday flag”).*/
import java.time.LocalDateTime;
import java.util.Map;

public class PricingContext {
    private LocalDateTime timestamp;
    private Map<String, Object> metadata;

    public PricingContext(LocalDateTime timestamp, Map<String, Object> metadata) {
        this.timestamp = timestamp;
        this.metadata = metadata;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Object get(String key) {
        return metadata.get(key);
    }
}