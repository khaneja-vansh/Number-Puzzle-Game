/*
    Number Puzzle Game
    --> GameSetup.java


    Developed 25 Feb 2023
    by Vansh Khaneja
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameSetup {

    public int[] userChoice(String[][] data){                     // This method asks user the number to slide
        GameEngine engine = new GameEngine();


        Scanner input = new Scanner(System.in);
        int[] index = engine.numToIndex(" ",data);


        System.out.print("Enter Number to Slide  :");
        String numSlide = input.nextLine();                       // Inputs the number to slide


        ArrayList<Integer> arr = engine.possibleInputs(index,data);

        for(int i = 0;i<arr.size();i++){
            if(arr.get(i)==Integer.parseInt(numSlide)){
                return engine.numToIndex(numSlide,data);
            }

        }

        return new int[]{-1, -1};


    }
    public String[][] shuffleNum() {        // Generates a grid with numbers at random locations
        GameEngine engine = new GameEngine();
        Random random = new Random();
        String[][] data = {{"1","2","3"},{"4","5","6"},{"7","8"," "}};


        for(int i = 0;i<100;i++) {
            int[] spaceind = engine.numToIndex(" ", data);
            ArrayList<Integer> posinp = engine.possibleInputs(spaceind, data);
            int inp = posinp.get(random.nextInt(0, posinp.size()));
            int[] numind = engine.numToIndex(String.valueOf(inp), data);
            engine.switchVal(numind[0], numind[1], spaceind[0], spaceind[1], data);

        }
        return data;


    }








}
