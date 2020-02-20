package Classloader;


/*
* 常量在编译阶段会存入调用这个常量的方法所在的类的常量池当中
* 本质上调用类并没有直接引用常量的类，因此并不会触发定义常量的类的初始化
* 注意：这里指的是常量放入了Mytest2的常量池中，之后与Myparent2无关了
* 甚至可以将Myparent的class文件删除
*
*
* */
/**
 * @Author: Zsyu
 * @Date: 20-2-21 上午2:01
 */
public class MyTest2 {

    public static void main(String[] args) {
        System.out.println(Myparent2.string);
    }
}
class Myparent2{
    public static final String string = "hello world";
    static {
        System.out.println("parent2");
    }
}
