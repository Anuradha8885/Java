abstract class Animal{
    public abstract void sound();

     public void sleep(){
        System.out.println("this animal is sleeping");
     }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("the dog barks");
    }
}
class Main{
    public static void main(String[] args){
        Animal a = new Dog();
        a.sleep();
        a.sound();
    }
}
