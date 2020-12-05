package behavior.chain.sensitiveword;

/**
 * 没干次过滤
 */
public class SexyWordFilter implements SensitiveWordFilter{
    @Override
    public boolean doFilter(Content content) {
        return false;
    }
}
