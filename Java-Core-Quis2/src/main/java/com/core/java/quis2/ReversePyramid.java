package com.core.java.quis2;

/**
 * ReversePyramid
 */
public class ReversePyramid {

    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                    System.out.print(j+" ");
            }
            System.out.println();
        }

    }

}