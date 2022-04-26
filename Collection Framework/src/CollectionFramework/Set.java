package CollectionFramework;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Double> nms= new HashSet<>();
        nms.add(14.14);
        nms.add(2.546);

        //boxing
        nms.add(new Double(53.1458));

        nms.add(99.3);
        //duplicates are not allowed
        nms.add(99.3);
        //will print only one 99.3

        System.out.println(nms);
        //after output we can see that order is not preserved
        //it may or may not appear in the order values are stored
        //HashSet doesn't have "get" and some extra method


        //sorted tree
        TreeSet<Double> Tset = new TreeSet<>();
        Tset.addAll(nms);

        //will output all items ascending order(sorted)
        System.out.println(Tset);





    }
}
