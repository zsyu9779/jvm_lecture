package zsy.classloader;

/**
 *  对于数组实例来说，其类型是由JVM在运行期动态生成的，表示为[Lclassloader.Myparent4
 *  这种形式.动态生成的的类型，其父类型就是Object
 *
 *  对于数组来说，JavaDoc经常将构成数组的元素为component，实际就是将数组降低一个维度后的类型
 *  助记符：
 *  anewarray:表示创建了一个引用类型（类，接口...）的数组,并将其的值压入栈顶
 *  newarray:表示创建了一个指定的原始类型（int，float，char等）的数组，并将其引用压入栈顶
**/
public class MyTest3 {
    public static void main(String[] args) {
        //Myparent4 myparent4 = new Myparent4();
        Myparent4[] myparent4s = new Myparent4[1];
        System.out.println(myparent4s.getClass());
        System.out.println(myparent4s.getClass().getSuperclass());

    }
}
class Myparent4{
    static {
        System.out.println("44444444");
    }
}
