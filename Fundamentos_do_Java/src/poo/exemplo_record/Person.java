package poo.exemplo_record;

public record Person(String name, int age) {


    public Person{
        System.out.println("========");
        System.out.println(name);
        System.out.println(age);
        System.out.println("========end");
    }
    

}
