package at.aaron_frick.swp.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] thorwarray = new  int[6];

        thorwarray[3] = 9;


        //wenn wir die ausgabe neben einander haben wollen können wir nur "print" anstatt println
        for (int i = 0; i < thorwarray.length; i++) {
            System.out.println(thorwarray[i]);
        }

        int[][] tictactoe = new int[3][3];
        
        tictactoe[0][0] = 1;
        System.out.println("------------");
        for (int row = 0; row < tictactoe.length; row++) {
            for (int col = 0; col < tictactoe.length; col++) {
                System.out.print(tictactoe[row][col] + " ");
            }
            System.out.println();
        }
    }
}
