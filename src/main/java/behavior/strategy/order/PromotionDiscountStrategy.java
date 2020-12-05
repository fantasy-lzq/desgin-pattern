package behavior.strategy.order;

import java.math.BigDecimal;

/**
 * 促销订单
 */
public class PromotionDiscountStrategy implements DiscountStrategy {

    BigDecimal promotionDiscountCoefficient = new BigDecimal("0.5");

    @Override
    public BigDecimal calDiscount(Order order) {
        return order.getTotalAmount().multiply(promotionDiscountCoefficient);
    }
}
