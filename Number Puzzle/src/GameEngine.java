/*
    Number Puzzle Game
    --> GameEngine.java


    Developed 25 Feb 2023
    by Vansh Khaneja
 */

import java.util.ArrayList;

public class GameEngine {
    public boolean checkWin(String[][] data){       // Checks weather its a win win case or not
        String[][] winCase = {{"1", "2", "3"},{"4", "5", "6"},{"7", "8", " "}};
        boolean win =true;
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++) {
                if (!winCase[i][j].equals(data[i][j])) {
                    win = false;
                    break;
                }
            }

        }

        return win;
    }

    public void switchVal(int row_num,int col_num,int row_space,int col_space,String[][] data){     // Interchanges the empty block with number
        String temp = data[row_num][col_num];
        data[row_num][col_num] = data[row_space][col_space];
        data[row_space][col_space] = temp;


    }


    public int[] numToIndex(String num,String[][] data){       // Finds out the index of the number
        int index[] = new int[2];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++) {
                if (data[i][j].equals(num)) {
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }

        }
        return index;
    }
    public int indexToNum(int[] index, String[][] data){        // Finds out the number at the index
        //int index[] = new int[2];
        int row = index[0];
        int col = index[1];
        int num = Integer.parseInt(data[row][col]);
        return num;
    }

    public ArrayList<Integer> possibleInputs(int[] index, String[][] data){     // Finds the all possible numbers player can switch
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] left = {index[0],index[1]-1};
        int[] right = {index[0],index[1]+1};
        int[] top = {index[0]-1,index[1]};
        int[] bottom = {index[0]+1,index[1]};




        try {
            numbers.add(indexToNum(left,data));
        }
        catch (Exception ignored){

        }

        try{
            numbers.add(indexToNum(right,data));
        }
        catch(Exception ignored){

        }
        try {
            numbers.add(indexToNum(top,data));
        }
        catch (Exception ignored){

        }
        try {
            numbers.add(indexToNum(bottom,data));
        }
        catch (Exception ignored){

        }

        return numbers;
    }
}
