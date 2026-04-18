package org.example.colletions;
import java.util.*;

class Demo{
    public static void  m2(ArrayList<String> arrayList){
        Set<String>  hashset = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String>  hashset2= new HashSet<>(Arrays.asList("E","D","C"));
        Set<String>  result = new HashSet<>();

        for(String s:hashset){
            if(!hashset2.contains(s)){
                result.add(s);
            }
        }

        for (String  s:hashset2){
            if(hashset.contains(s)){
                result.add(s);
            }
        }

        System.out.println("duplicates using hashset ");

        for(String  s : arrayList){
            if(!hashset.add(s)){
                System.out.println(s);
            }

        }

    }
    public static String m1(ArrayList<String> arrayList){
        String duplicate="";
        for (int i = 0; i < arrayList.size(); i++) {
            String s=arrayList.get(i);
            for (int j = i+1; j < arrayList.size(); j++) {
                if(s.equals(arrayList.get(j))){
                    System.out.println(s);
                duplicate +=" "+arrayList.get(i) ;
                }
            }
        }
        return  duplicate;
    }
}
public class Program1 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter count of  number  of people \n");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s1=sc.next();
            arrayList.add(s1);
        }

      String duplicate=  Demo.m1(arrayList);

        System.out.println(arrayList);
        System.out.println("Duplicate Value "+duplicate);


        Set<String> hasSet = new HashSet<>();

        System.out.println(hasSet.add("kuswanth"));

        Demo.m2(arrayList);
    }
}


