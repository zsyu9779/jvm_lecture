package zsy.classloader;


/*
* 常量在编译阶段会存入调用这个常量的方法所在的类的常量池当中
* 本质上调用类并没有直接引用常量的类，因此并不会触发定义常量的类的初始化
* 注意：这里指的是常量放入了Mytest2的常量池中，之后与Myparent2无关了
* 甚至可以将Myparent的class文件删除
* 当一个常量的值非编译器可以确定的，那么其值就不会被放到调用类的常量池中，
* 这时程序在运行中会主动使用这个常量所在的类，显然会导致这个类被初始化
*
* */



/*
*助记符：
* ldc：表示将int float 或是String类型的常量值推送至栈顶
* bipush:表示将单字节的常量（-128~127）推送至栈顶
* sipush：表示将一个短整型常量（-32768~32767）推送至栈顶
* iconst_1:
*
* */

import java.util.UUID;

/**
 * @Author: Zsyu
 * @Date: 20-2-21 上午2:01
 */
public class MyTest2 {

    public static void main(String[] args) {
        //System.out.println(Myparent2.string);
        System.out.println(My3.s);
    }
}
class Myparent2{
    public static final String string = "hello world";
    static {
        System.out.println("parent2");
    }

}
class  My3{
    public static final String s = UUID.randomUUID().toString();
    static {
        System.out.println("aaaaaaa");
    }
}
