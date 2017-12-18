package game;

import game.Item;
import rooms.*;
import game.Person;

import java.util.Scanner;

public class GameRunner {

    public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        for (int j = 0; j<map.length; j++)
        {
        	Room[] row = map[j];
            for (int i = 0; i<row.length;i++)
            {
                boolean[] doors = {true,true,true,true};
                Person[] people = {};
                Item[] items = {};
                
                row[i] = new Hallway(doors, people, items, i, j);
            }

        }

        House tech = new House(map);


        boolean gameOn = true;
        Person player1 = Person.createPerson();
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("You are now under the chimney, Santa's Helper, " + player1.getFirstName());
            map[0][0].addOccupant(player1);

            tech.printMap();
            player1.printRoom();
            String move = player1.chooseMove();
            Utilities.movePlayer(tech, player1,move);
           // gameOn = false;
            







        }
		in.close();
    }

}



