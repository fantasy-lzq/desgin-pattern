package creation.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * 单例模式
 * 构造函数需要是 private 访问权限的，这样才能避免外部通过 new 创建实例；
 * 考虑对象创建时的线程安全问题；
 * 考虑是否支持延迟加载；
 * 考虑 getInstance() 性能是否高（是否加锁）。
 */
public class IdGenerator {

    /**
     * 饿汉
     */

//    private AtomicLong id = new AtomicLong(0);
//    private static final IdGenerator instance = new IdGenerator();
//
//    private IdGenerator() {
//    }
//
//    public static IdGenerator getInstance() {
//        return instance;
//    }
//
//    public long getId() {
//        return id.incrementAndGet();
//    }


    /**
     * 懒汉 延时加载 有性能问题,不支持高并发
     */
//    private AtomicLong id = new AtomicLong(0);
//    private static IdGenerator instance;
//
//    private IdGenerator() {
//    }
//
//    public static synchronized IdGenerator getInstance() {
//        if (instance == null) {
//            instance = new IdGenerator();
//        }
//        return instance;
//    }
//
//    public long getId() {
//        return id.incrementAndGet();
//    }


//    private AtomicLong id = new AtomicLong(0);
//    private volatile static IdGenerator instance;
//
//    private IdGenerator() {
//    }
//
//    /**
//     * 既支持延迟加载、又支持高并发的单例实现方式
//     */
//    public static IdGenerator getInstance() {
//        if (instance == null) {
//            // 类级别的锁  IdGenerator.class
//            synchronized (IdGenerator.class) {
//                if (instance == null) {
//                    /**
//                     * 指令重排:IdGenerator对象被new 出来，并且赋值给 instance 之后，还没来得及初始化就被另一个线程使用
//                     * 避免jvm指令重排
//                     * 只要把对象 new 操作和初始化操作
//                     * 设计为原子操作，就自然能禁止重排序
//                     */
//                    instance = new IdGenerator();
//                }
//            }
//        }
//
//        return instance;
//    }
//
//    public long getId() {
//        return id.incrementAndGet();
//    }


    /**
     * INSANCE 的唯一性、创建过程的线程安全性，都由
     * JVM 来保证。所以，这种实现方法既保证了线程安全，又能做到延迟加载
     * 静态内部类
     */
    private AtomicLong id = new AtomicLong(0);

    private IdGenerator() {
    }

    private static class SingletonHolder {
        private static final IdGenerator instance = new IdGenerator();
    }

    public static IdGenerator getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

}
