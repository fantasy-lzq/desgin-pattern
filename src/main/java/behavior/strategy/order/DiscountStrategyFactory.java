package behavior.strategy.order;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建策略
 */
public class DiscountStrategyFactory {
    private static final Map<OrderType, DiscountStrategy> strategies = new HashMap<>();

    static {
        strategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
        strategies.put(OrderType.GROUPON, new GroupDiscountStrategy());
        strategies.put(OrderType.PROMOTION, new PromotionDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(OrderType type) {
        if (Objects.isNull(type)) {
            throw new IllegalArgumentException("Order type can not be null");
        }
        DiscountStrategy discountStrategy = strategies.get(type);
        if (Objects.isNull(discountStrategy)) {
            throw new IllegalStateException("Unexpected Discount Strategy Type: " + type + "Please Impl DiscountStrategy Interface...");
        }
        return discountStrategy;
    }
}
