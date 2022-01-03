package oop;

class Person {
    String name;
    String email;
    String phone;

    void walk() {
        System.out.println(name + " is walking");

    }

    void eat() {
        System.out.println(name + " is eating");

    }

    void sleep() {
        System.out.println(name + " is sleeping");

    }

}

public class Demo {
    public static void main(String[] args) {
        //Instantiate an object
        Person person1 = new Person();

        //Define some properties
        person1.name = "Joe";
        person1.email = "joe@testemail.com";
        person1.phone = "7897894564";

        //Absctraction
        person1.walk();

        Person person2 = new Person();
        person2.name = "Sarah";
        person2.email = "sarah@testemail.com";
        person2.phone = "123565236";

        person2.sleep();


        // person1.eat();


      /*  //Person -

        //Attributes, variables, adjectives, descriptors
        String name = "Joe";
        String email = "joe@testemail.com";
        String phone = "7897894564";

        //Actions, activity, behavior
       // System.out.println(name + " is walking");
        walking(name);
        System.out.println(name + " is eating");

        //What if we want to do it for other person
        String name2 = "Sara";
        String email2 = "sara@testemail.com";
        String phone2 = "123565236";

        //Actions, activity, behavior
        //System.out.println(name2 + " is walking");
        walking(name2);
        System.out.println(name2 + " is eating");

        //What about binding attributes and properties together
    }

        //Enhance by adding functions to minimize code
        static void walking(String name){
            System.out.println(name + " is walking");


    }*/


    }
}
