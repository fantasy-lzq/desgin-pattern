package behavior.chain.node;

/**
 * 职责链应用
 */
public class NodeChainApplication {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
