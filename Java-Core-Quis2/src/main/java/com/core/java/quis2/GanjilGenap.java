package com.core.java.quis2;

public class GanjilGenap {
    
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 5; j++) {
                if(i % 2 == 0){
                    System.out.print((i*j) + " ");
                }else{
                    System.out.print((Math.pow(i,j)) + " ");
                }
            }
            System.out.println();
        }
    }

}
