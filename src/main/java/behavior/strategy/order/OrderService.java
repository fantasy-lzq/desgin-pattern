package behavior.strategy.order;

import java.math.BigDecimal;

/**
 * 订单服务
 */
public class OrderService {
    public BigDecimal discount(Order order) {
        OrderType type = order.getOrderType();
        // use discountStrategy
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(type);
        return discountStrategy.calDiscount(order);
    }
}
