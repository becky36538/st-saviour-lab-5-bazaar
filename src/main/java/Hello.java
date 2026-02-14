package main.java;

public class Hello {
    public static void main(String[] args) {
        System.out.println("new dawn, ew day");
        weave(vertical(11, 11));
    }
    public static void weave(String[][] rug) {
        // method to print 2d emooji arrays
        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                System.out.print(rug[i][j]);
            }
            // break line at end of every row
            System.out.println("");
        }
    }

    public static String[][] solid(int width, int height) {
        String[][] rug = new String[width][height];

        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                rug[i][j] = "🩷";
                // forms i (rows) and j (columns) as full solid pattern of 🩷
            }
        }

        return rug;
    }

     public static String[][] horizontal(int width, int height) {
        String[][] rug = new String[width][height];
// returns an array that makes the emojis change every other column
        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                if (i % 2 == 0) {
                    rug[i][j] = "🦋";
                    // when the column is even, a 🦋 is printed
                } else {
                    rug[i][j] = "🪷";
                    // if the colum isnt even, a 🪷 is printed
                }

            }
        }

        return rug;
    }

    public static String[][] vertical(int width, int height) {
        String[][] rug = new String[width][height];
// returns an array that makes the emojis change every other column
        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                if (j % 2 != 0) {
                    rug[i][j] = "🦋";
                    // when the column is even, a 🦋 is printed
                } else {
                    rug[i][j] = "🪷";
                    // if the colum isnt even, a 🪷 is printed
                }

            }
        }

        return rug;
    }

    }
