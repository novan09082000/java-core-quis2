package com.core.java.quis2;

public class StarPyramidTwo {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i ; j++) {
                if(i % 2 == 0) break;
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
