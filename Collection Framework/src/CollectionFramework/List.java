package CollectionFramework;
//import util package[all classes]
import java.util.*;
public class List {
    public static void main(String[] args) {
        System.out.println();

        /*
        creating collection
        1)Type Safe:-same types of elements(objects) are added to collection

        2)Un-typed Safe:-different types of elements(objects) are added to collection
         */

        //Type Safe Collection
        ArrayList<String> names = new ArrayList<>();
        names.add("Deepraj");
        names.add("Raj");
        names.add("Ronaldo");
        names.add("Messi");
        names.add("Raj");

        System.out.println(names);
                                //to get
//        System.out.println(names.get(0));


//        //Un-typed Safe collection
//        LinkedList list = new LinkedList();
//        list.add("Sachin");
//        list.add(101);
//        list.add(452.32);
//        list.add(true);
//        System.out.println(list);

        //remove
        names.remove("Raj");

        System.out.println(names);

        //size
        System.out.println("SIZE: "+names.size());

        //to check item  is present or not
        //calls the equals' method of the data type in below example for Strings.
        System.out.println(names.contains("Deepraj"));

        //check for empty
        System.out.println(names.isEmpty());

        //setting value:removes whats there at index 3 and adds new vale provided
        names.set(2,"Neymar");
        System.out.println(names);

        //to replace at a particular index
        names.add(2,"Messi");
        System.out.println(names);

        //remove all elements
//        names.clear();
//        System.out.println(names);


        //to create vector
        Vector<String> vector = new Vector<>();

        //if we want the same values present in names
        vector.addAll(names);
        System.out.println("VECTOR: "+vector);





    }
}
