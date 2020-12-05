package behavior.strategy;

/**
 *具体策略A实现
 */
public class ConcreteStrategyA implements Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("this is StrategyA");
    }
}
