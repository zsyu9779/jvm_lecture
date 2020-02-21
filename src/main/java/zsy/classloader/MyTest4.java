package zsy.classloader;

/**
 *当一个接口在初始化时并不要求其父接口都完成了初始化
 * 只有在真正使用父接口时（如引用接口中所定义的常量），才会初始化
 */
public class MyTest4 {

    public static void main(String[] args) {
        System.out.println(Mychild4.b);
    }
}
interface Mparent4 {
    public static int a = 5;

}
interface Mychild4 extends Mparent4{
    public static int b = 6;
}
