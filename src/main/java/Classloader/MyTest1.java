package Classloader;


/**
 * 对于静态字段来说，只有直接定义了字段的类才会被初始化 （Myparent1）
 *
 * 初始化一个类的子类是主动使用的一种，所以主动使用child时，child被初始化导致parent初始化，static block调用
 *
 *  */

/**
 * @Author: Zsyu
 * @Date: 20-2-17 下午5:04
 */

public class MyTest1 {

    public static void main(String[] args) {
        System.out.println(Mychild1.str);//运行结果1
        //System.out.println(Mychild1.str2);//运行结果2
    }
}

class Myparent1{
    public static String str = "hello world";

    static {
        System.out.println("parent static");
    }
}

class Mychild1 extends Myparent1{
    public static String str2 = "hello";
    static {
        System.out.println("child static");
    }
}


/**
 * 运行结果1：
 * parent static
 * hello world
 * 运行结果2：
 * parent static
 * child static
 * hello
 *
 * */