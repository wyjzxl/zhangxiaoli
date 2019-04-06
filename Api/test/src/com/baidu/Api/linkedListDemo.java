package com.baidu.Api;
import java.util.LinkedList;
public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("范冰冰逃税");
        linkedList.add("李晨赞助2亿");
        linkedList.add("吴秀波事件");
        linkedList.addFirst("马云放弃控股权");
        linkedList.addLast("啊大苏打伟大");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        for (int i = 0; i <linkedList.size() ; i++) {
            System.out.println(linkedList.get(i));
        }
        if(linkedList.contains("吴秀波事件"))
        {
            linkedList.remove("吴秀波事件");
        }
        Object []names=linkedList.toArray();
        System.out.println(names[0]);
    }
}
