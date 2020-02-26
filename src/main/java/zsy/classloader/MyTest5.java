package zsy.classloader;

/**
 * @Author: Zsyu
 * @Date: 20-2-21 下午2:45
 */

/**
 * 类加载三个阶段：
 * 加载：查找并加载类的二进制数据
 * 连接：1验证：确保被加载类的正确性
 *      2准备：为类的静态变量分配内存，并将其初始化为默认值
 *      3解析：把类中的符号引用转换位直接引用
 * 初始化：为类的静态变量赋予正确的初始值
 *
 *
 * 有两种类型的类加载器：
 *  Java虚拟机自带的加载器：
 *      根类加载器
 *      扩展类加载器
 *      系统（应用）类加载器
 *  用户自定义的加载器
 *      java.lang.Classloader的子类
 *      用户可以自定义类的加载方式
 * */
public class MyTest5 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("counter1: "+Singleton.counter1);
        System.out.println("counter2: "+Singleton.counter2);
    }


}
class Singleton {
    public static int counter1;


    private static Singleton singleton = new Singleton();

    private Singleton(){
        counter1++;
        counter2++;//准备阶段的重要意义
    }
    public static int counter2 = 0;

    public static Singleton getInstance(){
        return singleton;
    }
}
