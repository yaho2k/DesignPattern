package Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("obj1 and obj2 is same instance");
        }else{
            System.out.println("obj1 and obj2 is different instance");
        }
        System.out.println("End");
    }
}
