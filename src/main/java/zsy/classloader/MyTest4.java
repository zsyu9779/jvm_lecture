package zsy.classloader;

/**
 * 当一个接口在初始化时并不要求其父接口都完成了初始化
 * 只有在真正使用父接口时（如引用接口中所定义的常量），才会初始化
 *
 * 在初始化一个类时，并不会先初始化它所实现的接口。
 * 在初始化一个接口时并不会先初始化它的父接口
 */
public class MyTest4 {

    public static void main(String[] args) {
        System.out.println(Mychild4.b);
    }
}
//只会加载不会初始化
interface Mparent4 {
    public static Thread thread = new Thread(){
        {
            System.out.println("被初始化");
        }
    };

}
interface Mychild4 extends Mparent4{
    public static int b = 6;
}
