

public class Hey {
    public static void main(String[] args) {
        System.out.println("new dawn, ew day");
        weave(diagonal(11, 11));
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

    public static String[][] diagonal(int width, int height) {
        String[][] rug = new String[width][height];
// prints an array that contains a pattern that creates a diagonal design of the emojis
        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                if(i % 2 == 0 && j % 2 != 0) {
                    rug[i][j] = "🩵"; 
                } else if (i % 2 == 0 && j % 2 == 0) {
                    rug[i][j] = "🤍";
                } // the emojis change in every other position with the 🤍 and 🩵 depending on whether the position in the row is even or not
                if(i % 2 != 0 && j % 2 == 0) {
                    rug[i][j] = "🩵"; 
                } else if (i % 2 != 0 && j % 2 != 0) {
                    rug[i][j] = "🤍";
                } //the emojis change in every other position with the 🤍 and 🩵 depending on whether the position in the column is even or not
            }
        }

        return rug;
    }
}