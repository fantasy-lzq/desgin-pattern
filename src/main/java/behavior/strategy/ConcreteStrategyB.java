package behavior.strategy;

/**
 *具体策略B实现
 */
public class ConcreteStrategyB implements Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("this is StrategyB");
    }
}
