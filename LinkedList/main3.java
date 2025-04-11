/*import java.util.LinkedList;

public class main3{
    public static void main(String[] args) {
        
        LinkedList<String> list=new LinkedList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("programming");
        list.addLast("oop");
        list.addFirst("css");
        list.removeFirst();
        list.removeLast();
        list.getFirst();
        list.getLast();
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}*/

import java.util.LinkedList;

public class main3{
    public static void main(String[] args) {
        
        LinkedList<Integer> list=new LinkedList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.addLast(50);
        list.addFirst(60);
        list.removeFirst();
        list.removeLast();
        
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
