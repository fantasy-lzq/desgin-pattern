package behavior.chain.node;

/**
 * HandlerB
 */
public class HandlerB extends Handler {

    @Override
    protected boolean doHandle() {
        boolean handled = false;
        // HandleA processing
        if (!handled && successor != null) {
            System.out.println("HandlerB processing...");
            System.out.println("HandlerB processing completed...");
        }
        return handled;
    }
}
