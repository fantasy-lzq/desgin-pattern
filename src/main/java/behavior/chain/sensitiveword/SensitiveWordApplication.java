package behavior.chain.sensitiveword;

/**
 * 敏感词过滤应用
 */
public class SensitiveWordApplication {

    public static void main(String[] args) {
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new AdsWordFilter());
        filterChain.addFilter(new SexyWordFilter());
        filterChain.addFilter(new PoliticalWordFilter());
        boolean legal = filterChain.filter(new Content());
        if (!legal) {
            // 内容发表
        } else {
            // 有敏感词汇发表不予发表
        }
    }

}
