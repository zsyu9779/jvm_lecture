package memory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @Author: Zsyu
 * @Date: 20-2-27 下午9:39
 */
public class MyTest4 {
    public static void main(final String[] args) {
        for (;;){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(MyTest4.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor)(obj,method,args1,proxy)->
                    proxy.invokeSuper(obj,args1));
            System.out.println("helllo");
            enhancer.create();
        }
    }
}
