

public class Plaid {
    public static void main(String[] args) {
        System.out.println("new dawn, ew day");
        weave(plaid(11, 11));
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

    public static String[][] plaid(int width, int height) {
        String[][] rug = new String[width][height];

        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    rug[i][j] = "🪷";
                } else { // if the row and column is even, then the 🪷 is printed, if not then the 🌸 is printed
                    rug[i][j] = "🌸";
                }
            }
        }

        return rug;
    }
}