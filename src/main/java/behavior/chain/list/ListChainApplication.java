package behavior.chain.list;


/**
 * 职责链应用
 */
public class ListChainApplication {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
