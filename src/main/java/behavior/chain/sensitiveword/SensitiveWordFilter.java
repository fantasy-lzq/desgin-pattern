package behavior.chain.sensitiveword;

/**
 * 对于支持 UGC（User Generated Content，用户生成内容）的应用（比如论坛）来说，
 * 用户生成的内容（比如，在论坛中发表的帖子）可能会包含一些敏感词（比如涉黄、广告、
 * 反动等词汇）。针对这个应用场景，我们就可以利用职责链模式来过滤这些敏感词。
 * 对于包含敏感词的内容，直接禁止发布
 */
public interface SensitiveWordFilter {
    boolean doFilter(Content content);
}
