/*
    Number Puzzle Game
    --> Main.java


    Developed 25 Feb 2023
    by Vansh Khaneja
 */

public class Main {
    public static void main(String[] args) {
        FrameWork frameWork = new FrameWork();
        GameSetup setup = new GameSetup();
        GameEngine engine = new GameEngine();
        frameWork.frame=setup.shuffleNum();     // Creates a grid
        frameWork.getFrame();                   // Prints the grid





        while (!engine.checkWin(frameWork.frame)){  // Check for win after every iteration
            int indexOfNum[] = setup.userChoice(frameWork.frame);   // Takes the user input
            int row_num = indexOfNum[0];
            int col_num = indexOfNum[1];


            int indexOfSpace[] = engine.numToIndex(" ",frameWork.frame);    // Finds the index of the empty box
            int row_space = indexOfSpace[0];
            int col_space = indexOfSpace[1];

            if(!(row_num == -1) && !(col_num == -1)){   // Checks if the user has entered correct number
                engine.switchVal(row_num,col_num,row_space,col_space,frameWork.frame);
            }
            else{
                System.out.println("Wrong input !!");
            }
            frameWork.getFrame();          // Prints the grid
        }
    }
}