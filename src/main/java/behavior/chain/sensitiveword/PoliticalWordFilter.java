package behavior.chain.sensitiveword;


public class PoliticalWordFilter implements SensitiveWordFilter{
    @Override
    public boolean doFilter(Content content) {
        return false;
    }
}
