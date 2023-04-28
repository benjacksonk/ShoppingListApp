package com.learntocode;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + ".");
    }

    public void myShoppingList() {
        String[] shoppingList = {
                "eggs",
                "milk",
                "rice",
                "cereal",
                "bananas",
                "ice cream",
                "cranberry juice",
                "lettuce",
                "wrshsrhr saus",
                "cinnamon"
        };

        for (String item: shoppingList) {
            System.out.println(item);
        }
    }
}
