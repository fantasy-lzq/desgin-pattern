package behavior.chain.list;

/**
 * HandlerA
 */
public class HandlerA implements IHandler {
    @Override
    public boolean handle() {
        boolean handled;
        handled = doHandle();
        return handled;
    }

    private boolean doHandle() {
        // HandleA process
        System.out.println("HandleA process...");
        System.out.println("HandleA process completed...");
        return Boolean.TRUE;
    }
}
