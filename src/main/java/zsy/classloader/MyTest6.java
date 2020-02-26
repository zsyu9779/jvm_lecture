package zsy.classloader;

/**
 * @Author: Zsyu
 * @Date: 20-2-27 上午2:32
 */
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
