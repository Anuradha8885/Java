// public class solve{

//     void add(int a, int b){
//         System.out.println("int :"+(a+b));
//     }

//      void add(int a, int b , int c){
//         System.out.println("int :"+(a+b+c));
//     }
    
//     public static void main (String[] args)
//     {
//         solve s= new solve();
//         s.add(10,20);
//         s.add(10,20,30);
//     }
// }

public class Solve{

    void add(String name){
        System.out.println("string :"+name);
    }

     void add(int age){
        System.out.println("int :"+age);
    }
    
    public static void main (String[] args)
    {
        Solve s= new Solve();
        s.add("Anu");
        s.add(21);
    }

 }
