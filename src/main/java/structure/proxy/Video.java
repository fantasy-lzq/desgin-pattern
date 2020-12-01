package structure.proxy;


/**
 * 代理模式：
 *   静态代理和动态代理
 *   在不改变原始类（或叫被代理类）代码的情况下，通过引入代理类来给原始类附加功能
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
