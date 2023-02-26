/*
    Number Puzzle Game
    --> FrameWork.java


    Developed 25 Feb 2023
    by Vansh Khaneja
 */


public class FrameWork {
    public String[][] frame;
    void getFrame(){                // This method creates a basic grid frame

        System.out.print ("_________________________\n");
        System.out.print ("|       |       |       |\n");
        System.out.printf("|   %s   |   %s   |   %s   |\n",frame[0][0],frame[0][1],frame[0][2]);
        System.out.print ("|_______|_______|_______|\n");
        System.out.print ("|       |       |       |\n");
        System.out.printf("|   %s   |   %s   |   %s   |\n",frame[1][0],frame[1][1],frame[1][2]);
        System.out.print ("|_______|_______|_______|\n");
        System.out.print ("|       |       |       |\n");
        System.out.printf("|   %s   |   %s   |   %s   |\n",frame[2][0],frame[2][1],frame[2][2]);
        System.out.print ("|_______|_______|_______|\n");

    }


}
