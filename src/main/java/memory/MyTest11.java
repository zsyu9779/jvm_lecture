package memory;

/**
 *
 * 虚拟机栈 Stack Frame 栈帧
 * 程序计数器（program counter）:
 * 本地方法栈：主要用于处理本地方法（native）
 * 堆（Heap）：JVM管理的最大一块内存空间，与堆相关的一个重要概念是垃圾收集器。几乎所有的垃圾收集器使用分代收集算法
 * 所以堆空间基于此进行划分：新生代和老年代
 * 方法区：（Method area）:存储元信息。从JDK1.8开始废弃了永久代，使用metaspace
 * 运行时常量池：方法区的一部分内容
 * 直接内存：Direct Memory
 *
 *关于Java对象创建的过程：
 *
 * new关键字创建对象的3个步骤：
 * 1.在堆内存中创建对象的实例。
 * 2.为对象的成员变量赋初值。
 * 3.将对象的引用返回
 *
 * 分配内存：
 * 1.指针碰撞 前提是堆中的空间被一个指针分隔，一侧未被占用，一侧已被占用
 * 2.空闲列表 堆空间已使用未使用的部分交织。通过一个列表记录那些控件可以使用，找出合适大小的空间分配内存
 *
 * 对象在内存的布局
 * 1.对象头
 * 2.实例数据（即在一个类中声明的各项信息）
 * 3.对其填充（可选）
 *
 * 引用：通过句柄或指针指向
 *
 * 方法区在堆里面吗？
 * 1、 java7之前，方法区位于永久代(PermGen)，永久代和堆相互隔离，永久代的大小在启动JVM时可以设置一个固定值，不可变；
 *
 * 2、 java7中，static变量从永久代移到堆中；
 *
 * 3、 java8中，取消永久代，方法存放于元空间(Metaspace)，元空间仍然与堆不相连，但与堆共享物理内存，逻辑上可认为在堆中
 *
 *
 * */

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zsyu
 * @Date: 20-2-17 下午5:26
 */

public class MyTest11 {
    public static void main(String[] args) {

        //-Xms5m -Xmx5m -XX:+HeapDumpOnOutOfMemoryError
        List<MyTest11> list = new ArrayList<MyTest11>();
        for (;;){
            list.add(new MyTest11());
        }



    }



}
