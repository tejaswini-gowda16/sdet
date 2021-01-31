package JavaActivity3_1;

import java.util.ArrayList;

public class Activity3_1 {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Orange");
        fruitList.add(3, "Grapes");
        fruitList.add(1, "Papaya");
        
        System.out.println("Print All the Objects:");
        for(String s:fruitList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + fruitList.get(2));
        System.out.println("Is Chicku is in list: " + fruitList.contains("Mango"));
        System.out.println("Size of ArrayList: " + fruitList.size());
        
        fruitList.remove("Papaya");
        
        System.out.println("New Size of ArrayList: " + fruitList.size());
    }
}