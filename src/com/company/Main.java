package com.company;

public class Main {

    public static void main(String[] args) {
        // it is a  rule, that a>>n = a/(Math.pow(2,n))    (if a>0)

        // but my theory is, that if a< 0 and a % (Math.pow(2,n)) !=0,
        // than a>>n = a/(Math.pow(2,n)) - 1, else a>>n = a/(Math.pow(2,n))

	// Checking for all integer numbers, if my theory is right
        int programShift;
        int myShift;
        for (int i=-1; i>-Integer.MIN_VALUE;i--){
            for (int j=1; j<=31;j++){
                programShift = i >> j;
                if ((i % (int) Math.pow(2,j))!=0) {
                    myShift=(i/(int) Math.pow(2,j)) -1;
                } else  myShift=i/(int) Math.pow(2,j);

                if (programShift!= myShift){
                    System.out.println("i= "+i + " j= "+ j+ " programShift " + programShift + " myShift = "+ myShift);

               }
            }
        }
        System.out.println("Yes, my theory is right!");
    }
}
