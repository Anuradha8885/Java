// public class Main{
//     public static void main(String[] args) {
        
//         int[] myObj={1,2,3,4,5};
//         System.out.println(myObj[]); //ArrayIndexOutOfBoundsException:
//     }
// }


// public class Main{
//     public static void main(String[] args) {
//         try{
        
//         int[] myObj={1,2,3,4,5};
//         System.out.println(myObj[10]); //ArrayIndexOutOfBoundsException:
//     }
//     catch(Exception e){
//         System.out.println("Something went wrong");
//     }
//     finally{
//         System.out.println("This is finally block");
//     }
// }
// }

public class Main{
    static void checkAge(int age){
        if( age < 18){
          throw new ArithmeticException("Access denied - you must be at least 18 years old.");
        }else{
            System.out.println("Access granted - you are old enough!");
        }
    }

    public static void main(String[] args) {
        {
            checkAge(12);
        }
    }
}
