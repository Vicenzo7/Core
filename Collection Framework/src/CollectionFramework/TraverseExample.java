package CollectionFramework;

import java.util.*;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Deepraj");
        names.add("Raj");
        names.add("Ronaldo");
        names.add("Messi");
        names.add("Raj");

        //for each loop
        for(String str:names)
        {
            System.out.print(str +"\t"+ str.length()+ "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }

        //Divider
        System.out.println("______________________________");

        //Traversing using ITERATOR: Forward traversing
        System.out.println("Traversing using ITERATOR: Forward traversing");
        Iterator<String> itr = names.iterator();

        while(itr.hasNext())
        {
            String next = itr.next();
            System.out.println(next);
        }

        System.out.println("______________________________");
        //Traversing using LIST ITERATOR: Backward traversing
        System.out.println("Traversing using LIST ITERATOR: Backward traversing");

        ListIterator<String> litr = names.listIterator(names.size()); //size is passed because the cursor should start from last
        while(litr.hasPrevious())
        {
            String previous = litr.previous();
            System.out.println(previous);

        }



        System.out.println("______________________________");
        Vector<String> vector = new Vector<>();

        //if we want the same values present in names
        vector.addAll(names);

        //Traversing vector using enumeration
        System.out.println("Traversing vector using enumeration");
        Enumeration<String> ele = vector.elements();
        while(ele.hasMoreElements())
        {
            String s = ele.nextElement();
            System.out.println(s);
        }

        System.out.println("______________________________");
        //Traversing using for each method
        System.out.println("Traversing  using for each method");

        // e is called lamda, we can use any variable not one e we can use str also
        names.forEach(e -> {
            System.out.println(e);
        });


        //for sets
        System.out.println("______________________________");
        //Traversing using for each method
        System.out.println("Traversing  using for each method for sets ");
        System.out.println("Names in sorted order ");
        TreeSet<String> set = new TreeSet<>();
        set.addAll(names);
        set.forEach(str ->{
            System.out.println(str);
        });



    }
}
