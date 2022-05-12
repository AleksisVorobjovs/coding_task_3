import java.util.ArrayList;
import java.util.Locale;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // 1.1. declare and initialize String array with 7 arbitrary colors.
        String[] colorArray = {"green","red","pink","yellow","black","white","gray"};
        // 1.2. Create new list "colors" (ArrayList) of type String
        ArrayList<String> colors = new ArrayList<String>();
        // 1.3. Copy/add all elements from String array to colors list
        for(String color : colorArray){
            colors.add(colors.size(),color);
        }
        // 1.4. Remove 3rd element from colors list
        colors.remove(2);
        // 1.5. Add new color at the end of the colors list
        colors.add(colors.size(),"blue");
        // 1.6. Add new color at the beginning of the colors list
        colors.add(0,"brown");
        // 1.7. Loop through colors list and output all values (use for each loop)
        System.out.println("First colors ArrayList:");
        colors.forEach(color -> {
            System.out.println(color);
        });
        // 1.8. Create new list (colorsSublist) which will be sublist of the colors list (will contain elements from index 2 to index 5
        ArrayList<String> colorsSublist = new ArrayList<>(colors.subList(2,6));
        // 1.9. Use for loop to output each element of colorsSublist list
        System.out.println("Second colorsSublist ArrayList:");
        for(int i=0;i<colorsSublist.size();i++){
            System.out.println(colorsSublist.get(i));
        }
        //2. Write a program which counts how many unique words are in text (see class Text, variable TEXT as a comment here)
        String TEXT =
                "Polymorphism is the ability of an object to take on many forms The most common use of polymorphism in " +
                        "OOP occurs when a parent class reference is used to refer to a child class object\n" +
                        "\n" +
                        "Any Java object that can pass more than one IS-A test is considered to be polymorphic In Java all " +
                        "Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object\n" +
                        "\n" +
                        "It is important to know that the only possible way to access an object is through a reference variable " +
                        "A reference variable can be of only one type Once declared the type of a reference variable cannot be changed\n" +
                        "\n" +
                        "The reference variable can be reassigned to other objects provided that it is not declared final The " +
                        "type of the reference variable would determine the methods that it can invoke on the object\n" +
                        "\n" +
                        "A reference variable can refer to any object of its declared type or any subtype of its declared type" +
                        " A reference variable can be declared as a class or interface type";

        TreeSet<String> uniqueWords = new TreeSet<>();
        String[] wordArray = TEXT.toLowerCase().split("\\s");
        for(String word : wordArray){
            uniqueWords.add(word);
        }
        uniqueWords.remove("");
        System.out.println(uniqueWords.size());
        //uniqueWords.forEach(word -> {
        //    System.out.println(word);
        //});

    }
}