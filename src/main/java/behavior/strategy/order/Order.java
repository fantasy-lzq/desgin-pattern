package behavior.strategy.order;

import java.math.BigDecimal;

/**
 * 订单模型
 */

public class Order {
    private BigDecimal totalAmount;
    private OrderType orderType;


    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

}
