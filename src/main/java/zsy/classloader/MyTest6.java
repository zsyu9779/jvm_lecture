package zsy.classloader;

/**
 * @Author: Zsyu
 * @Date: 20-2-27 上午2:32
 */

/**
 * 双亲委派模式优势
 *     采用双亲委派模式的是好处是Java类随着它的类加载器一起具备了一种带有优先级的层次关系，通过这种层级关可以避免类的重复加载，
 * 当父亲已经加载了该类时，就没有必要子ClassLoader再加载一次。
 *     其次是考虑到安全因素，java核心api中定义类型不会被随意替换，假设通过网络传递一个名为java.lang.Integer的类，通过双亲
 * 委托模式传递到启动类加载器，而启动类加载器在核心Java API发现这个名字的类，发现该类已被加载，并不会重新加载网络传递的过来的
 * java.lang.Integer，而直接返回已加载过的Integer.class，这样便可以防止核心API库被随意篡改。
 *
 * */
public class MyTest6 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        Class<?> clazz2 = Class.forName("zsy.classloader.C");
        System.out.println(clazz2.getClassLoader());
    }
}
class C{

}
