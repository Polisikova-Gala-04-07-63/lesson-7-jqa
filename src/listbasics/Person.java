package listbasics;

public class Person {

    private int age;

    public Person(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Age = " + age;
    }
}
