package collection;

import java.util.ArrayList;

public class Traverse {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Sanjana");
        al.add("Reddy");
        al.add("S");
        al.add("Sanju");


        System.out.println("Printing using regular for loop : ");
        for(int i =0;i<al.size();i++)
            System.out.print(al.get(i)+" ");

        System.out.println();
        System.out.println("Printing using enhanced for loop : ");
        for(String element : al)
            System.out.print(element+ " ");

    }
}
