package behavior.chain.node;

/**
 * HandlerA
 */
public class HandlerA extends Handler {

    @Override
    protected boolean doHandle() {
        boolean handled = false;
        // HandleA processing
        if (!handled && successor != null) {
            System.out.println("HandlerA processing...");
            System.out.println("HandlerA processing completed...");
        }
        return handled;
    }
}
