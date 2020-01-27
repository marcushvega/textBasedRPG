package extra;

import java.util.HashMap;

public class DungeonMap
{
    class Room{
        public int positionX;
        public int positionY;
        public int[] doors; //an array to keep track of where the doors are in the room 0=N, 1=E, 2=S, 3=W

        public Room(int inX, int inY){
            positionX = inX;
            positionY = inY;
        }
    }

    public int[][] levelMap;
    private HashMap<Item, Boolean> items;   // Item Class, Found=true / NotFound=false
    private int[][] exploredMap;            // [x][y] positions of explored and unexplored areas of the map

    private void setMapSize(){
        int mapLength = 3;
        int mapHeight = 3;
        levelMap = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                new Room(i,j);
            }
        }
    }



}


