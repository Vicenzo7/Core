package CollectionFramework;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

                //key   value
        HashMap<String,Integer> courses = new HashMap<>();
        //adding method
        courses.put("Core JAVA",4000);
        courses.put("Basic Python",3500);
        courses.put("Spring",8000);
        courses.put("Andriod",4000);
        //duplicate keys are not allowed so the above one will get inserted and the value will change from 4000 to 6000
//        courses.put("Andriod",6000);

        System.out.println(courses);

//        //to print element one by one
//        courses.forEach((e1,e2)->{
//            System.out.println(e1+"=>"+e2);
//        });
//
        // much better way
        courses.forEach((key,value)->{
            System.out.print(key);
            System.out.print("=>");
            System.out.println(value);
            System.out.println();
        });

        //to get single value pass the key in get method

        System.out.println(courses.get("Core JAVA"));



    }
}
