/**
 * Contextual information for pricing calculations.
 */
// core/engine/PricingContext.java
package core.engine;

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