package behavior.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 为策略模式会包含一组策略，在使用它们的时候，一般会通过类型（type）来判断创建
 * 哪个策略来使用。为了封装创建逻辑，我们需要对客户端代码屏蔽创建细节
 *
 * 如果策略类是有状态的，根据业务场景的需要，我们希望每次从工厂方法中，获得的
 * 都是新创建的策略对象，而不是缓存好可共享的策略对象这种处理方式是不适用的
 */
public class StrategyFactory {
    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyA());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        Strategy strategy = strategies.get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("could not find a strategy for type:" + type);
        }
        return strategy;
    }
}
