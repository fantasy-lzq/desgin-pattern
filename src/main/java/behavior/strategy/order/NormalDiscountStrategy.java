package behavior.strategy.order;

import java.math.BigDecimal;

/**
 * 普通订单
 */
public class NormalDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal calDiscount(Order order) {
        return order.getTotalAmount();
    }
}
