package review;

public class ReferenceTypeTestApp {
    public static void main(String[] args) {

        Car car=new Car("Audi","A4");
      //  System.out.println(car);//review.Car@6d03e736//returns me address of new car object//address is saved in car variable saves
      //  System.out.println(new Car("Audi","A4"));
int[] arr=new int[5];
        System.out.println(arr);//gives address
        Person person1= new Person("Michael",new Car("Audi","A4"));
      //  System.out.println(person1);
        Person person2= new Person("MichaelNext",new Car("BMW","3 Series"));
person1.next=person2;
        System.out.println(person1.next);//review.Person@378bf509
        System.out.println(person2);//review.Person@378bf509



    }
}
