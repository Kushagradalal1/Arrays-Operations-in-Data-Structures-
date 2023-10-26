package ArrayListExample;
/*
Resizing is possible : Dynamic Size Array :

-> Advantages of ArrayList :
1) Dynamic Arrays : if we allocate the size of an Arrays that is not a good pratices.
2) Rich Library Functions : contains function is there!!, add func , remove func.

package : java.util.ArrayList;

 */
public class ArrayList {
    public static void main(String[] args) {
        //Integer is of non-primitive types..
        java.util.ArrayList<Integer> al=new java.util.ArrayList<>();
        al.add(20);
        al.add(10);
        al.add(30);
        //Arrays printing ..
        System.out.println(al);
    }
}
