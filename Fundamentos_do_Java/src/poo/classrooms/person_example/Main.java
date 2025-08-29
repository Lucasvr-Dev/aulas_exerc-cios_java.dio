package poo.classrooms.person_example;


public class Main {
    public static void main(String[] args) {
       final var male = new Person("João");
       male.setAge(12);
       var female = new Person("Maria");
       female.setAge(10); 
       System.out.println("Male name: " + male.getName() + ", age: " + male.getAge());
       System.out.println("Female name: " + female.getName() + ", age: " + female.getAge());
    }

}
