import com.nagasystems.datastructures.linkedlists.LinkedList;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        //test addLast
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        //test indexOf
//        System.out.println(list.indexOf(30));
//        //test contains
//        System.out.println(list.contains(40));
//        System.out.println(list.contains(10));
        //test removefirst
        list.removeFirst();
        System.out.println(list.indexOf(10));
        //test removeLast
        list.removeLast();
        System.out.println(list.indexOf(10));
        //print size
        System.out.println(list.size());
        //convert this to regular array
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        //reverse a linkedList
        list.reverse();
        //find kth node from end
        list.getKthFromTheEnd(2);
        //has loop
        list.hasLoop();
        //print middle
        list.printMiddle();
    }
}