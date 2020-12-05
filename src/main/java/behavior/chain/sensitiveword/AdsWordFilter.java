package behavior.chain.sensitiveword;

/**
 * 广告词过滤
 */
public class AdsWordFilter implements SensitiveWordFilter{
    @Override
    public boolean doFilter(Content content) {
        return false;
    }
}
