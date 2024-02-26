package edu.neu.mgen;

public class LabPartOne {
    public static void main(String[] args) {
        int []x = {3, 8, 12, 5, 9};
        int []y = {6, 4, 11, 7, 10};
        int []z = new int[5];
        for(int i =0;i < z.length;i++) {
            z[i] = Math.max(x[i],y[i]);
        }
        System.out.print("Array x = {");
        for(int i =0;i < x.length;i++) {
            if(i == x.length -1) {
                System.out.print(x[i]);
                break;
            }
            System.out.print(x[i]+",");
        }
        System.out.print("}");
        System.out.println();
        System.out.print("Array y = {");
        for(int i =0;i < y.length;i++) {
            if(i == y.length -1) {
                System.out.print(y[i]);
                break;
            }
            System.out.print(y[i]+",");
        }
        System.out.print("}");
        System.out.println();
        System.out.print("Array z = x + y = {");
        for(int i =0;i < z.length;i++) {
            if(i == z.length -1) {
                System.out.print(z[i]);
                break;
            }
            System.out.print(z[i]+",");
        }
        System.out.print("}");
    }
}
