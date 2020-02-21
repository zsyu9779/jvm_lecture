package zsy.classloader;

/**
 * @Author: Zsyu
 * @Date: 20-2-21 下午2:45
 */
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
