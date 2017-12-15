package board;

import rooms.Room;

public class Board {


    private Room[][] houseMap;



    public Board(Room[][] schoolMap)
    {
        this.houseMap = schoolMap;
    }

    public void printMap()
    {


        for(Room[] row : houseMap)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
    public Room[][] getSchoolMap() {
        return houseMap;
    }

    public void setSchoolMap(Room[][] houseMap) {
        this.houseMap = houseMap;
    }


}
