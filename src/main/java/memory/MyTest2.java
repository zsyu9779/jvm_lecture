package memory;

/**
 * @Author: Zsyu
 * @Date: 20-2-27 下午5:03
 */
public class MyTest2 {

    private int length = 0;

    public int getLength() {
        return length;
    }
    public void test(){
        this.length++;

        test();
    }

    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();
        try {
            myTest2.test();
        }catch (Throwable e){
            System.out.println(myTest2.getLength());
            e.printStackTrace();
        }
    }
}
