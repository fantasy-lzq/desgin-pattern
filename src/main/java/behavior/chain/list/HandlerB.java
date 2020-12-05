package behavior.chain.list;

/**
 * HandlerB
 */
public class HandlerB implements IHandler {
    @Override
    public boolean handle() {
        boolean handled;
        handled = doHandle();
        return handled;
    }

    private boolean doHandle() {
        // HandleB process
        return false;
    }
}
