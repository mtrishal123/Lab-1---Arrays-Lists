package edu.neu.mgen;

import java.util.ArrayList;

public class LabPartTwo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> switchedNames = new ArrayList<String>();
        names.add("Surya");
        names.add("Rahul");
        names.add("Aggie");
        names.add("Max");
        names.add("Amir");
        for(String str:names) {
            int len = str.length();
            String middleWord = str.substring(1,len-1);  // extracting the middle part of the name excluding first and last letters
            char firstLetter = Character.toUpperCase(str.charAt(len-1));
            char lastLetter = Character.toLowerCase(str.charAt(0));  
            switchedNames.add(firstLetter+middleWord+lastLetter);
        }
        System.out.print("Names = {");
        for(int i =0;i< names.size();i++) {
            if(i == names.size()-1) {
                System.out.print(names.get(i));
                break;
            }           
            System.out.print(names.get(i)+",");
        }
        System.out.print("}");
        System.out.println();
        System.out.print("Names (switched) = {");
        for(int i =0;i< switchedNames.size();i++) {
            if(i == switchedNames.size()-1) {
                System.out.print(switchedNames.get(i));
                break;
            }           
            System.out.print(switchedNames.get(i)+",");
        }
        System.out.print("}");
        // System.out.println(switchedNames);
    }
}
