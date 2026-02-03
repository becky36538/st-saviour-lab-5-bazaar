package main.java;

public class hello {
    public static void main(String[] args) {
        System.out.println("new dawn, ew day");
        weave(solid(11, 11));
    }
    public static void weave(String[] rug) {
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
            }
        }

        return rug;
    }

}