package java_review;

import java.util.*;

/**
 * Created by jiangdongcheng on 16/8/13.
 */
public class ch10_list_set_map_etc {


    public static void main(String[] args) {
        //eg1  List集合
//        String a = "A";String b = "B";String c = "C";String d = "D";
//        List<String> strings = new LinkedList<>();
//        strings.add(a);
//        strings.add(b);
//        strings.add(d);
//
//        Iterator<String> firstIterator = strings.iterator();  //创建迭代器
//        System.out.println("修改前集合中的元素是:");
//        while (firstIterator.hasNext()){
//            System.out.print(firstIterator.next()+",");
//        }
//        String before = strings.set(0,c);
//        System.out.println();
//        System.out.println("原来的元素是:"+before);
//        strings.add(c);
//        Iterator<String> secondIterator = strings.iterator();
//        System.out.println("修改后集合中的元素是:");
//        while(secondIterator.hasNext()){
//            System.out.println(secondIterator.next()+",");
//        }
        //重点:List中可以包含重复对象;通过indexOf()和lastIndexof()可以得到集合中包含的元素的正向第一次出现的位置和逆向第一次出现的位置

      //eg2 set集合去重的作用
//        String a = "A";String b = "B";String c = "C";String d = "D";
//        List<String> strings = new LinkedList<>();
//        strings.add(a);
//        strings.add(b);
//        strings.add(c);
//        strings.add(d);
//        strings.add(a);
//        strings.add(b);
//        strings.add(c);
//        strings.add(d);
//        Iterator<String> iterator = strings.iterator();
//        System.out.println("未去重前:");
//        while(iterator.hasNext()){
//            System.out.print(iterator.next()+",");
//        }
//        System.out.println();
//        System.out.println("去重后:");
//        Set<String> sets = new HashSet<>();
//        sets.addAll(strings);
//        Iterator<String> iterator1 = sets.iterator();
//        while(iterator1.hasNext()){
//            System.out.print(iterator1.next()+",");
//        }
        //重点:set集合不允许出现重复值,可以利用这一特性将list集合通过set.addAll()将list集合加入到set集合中,起到去重的效果.

        //eg3 map集合

        //eg4 List接口的实现类
        //重点:ArrayList底层是用数组实现的,查询效率高,插入删除的效率比较低;
            //LinkedList底层是用链表实现的,查询效率低,插入删除的效率高.
        //eg5 set接口的实现类
        //重点:HashSet和TreeSet.set是不允许重复的.

    }
}
