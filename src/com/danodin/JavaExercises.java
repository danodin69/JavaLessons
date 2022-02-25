package com.danodin;

public class JavaExercises {
    public static void runTask() {
        System.out.println("\n");

        System.out.println("Exercise 1.1: \n");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun\n");

        System.out.println("\n");
        System.out.println("Exercise 1.2: \n");
        for (int i=0; i<5; i++){
            System.out.println("Java a is cool programming language");
        }

        System.out.println("\n");
        System.out.println("Exercise 1.3: \n");
        MakePatternOf.letterJ();
        MakePatternOf.letterA();
        MakePatternOf.letterV();
        MakePatternOf.letterA();

        System.out.println("\n");
        System.out.println("Exercise 1.4: \n");
        PrintATable.table();


    }
}


class MakePatternOf{


    static void letterA()
    {
        System.out.print("\n");
        for (int i = 0; i < 8; i++) {
            System.out.print(" ");
            for (int a = 0; a < 8; a++) {
                if (i == 0 && (a == 0 || a == 7))
                    System.out.print(" ");
                else if (a < 3 || a > 4) {
                    System.out.print("A");
                }
                else if (i < 2 || (i == 3)) {
                    System.out.print("A");
                }

                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }



    static void letterJ()
    {
        System.out.print("\n");
        for (int i = 0; i < 8; i++) {
            System.out.print(" ");

            for (int h = 0; h < 8; h++) {
                if (i < 1) {
                    System.out.print( "J");
                }
                else if (i == 5 && h < 1) {
                    System.out.print( "J");
                }
                else if (i < 7 && h > 5) {
                    System.out.print( "J");
                }
                else if (i == 7
                        && (h == 0 || h == 7))
                    System.out.print(" ");
                else if (i > 5) {
                    System.out.print("J");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    static void letterV()
    {
        System.out.print("\n");
        for (int i = 0; i < 8; i++) {
            System.out.print(" ");
            for (int v = 0; v < 8; v++)
                if ((v == 0 || v == 7)
                        && i < 4) {
                    System.out.print( "VV");
                }
                else if ((v == i - 4 || v == 11 - i)
                        && i >= 4) {
                    System.out.print( "VV");
                }
                else
                    System.out.print(" ");
            System.out.print("\n");
        }
    }
}


class PrintATable{
    
    static void table(){
        
        String[] [] multiplicationTable = new String[5][];
        multiplicationTable[0] = new String [] {"a","a^2","a^3"};
        multiplicationTable[1] = new String [] {"1","1","1"};
        multiplicationTable[2] = new String [] {"2","4","8"};
        multiplicationTable[3] = new String [] {"3","9","27"};
        multiplicationTable[4] = new String [] {"4","16","64"};
        
        for (String[] row: multiplicationTable){
            System.out.format("%15s %15s %15s %n", row);
            
        }
    }
}