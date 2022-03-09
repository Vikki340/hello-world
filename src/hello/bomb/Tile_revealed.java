package hello.bomb;


public class Tile_revealed {
    //attributes
    boolean bomb;
    int adjacent_bombs;

    public Tile_revealed(boolean bomb, int adjacent_bombs) {
        this.bomb = bomb;
        this.adjacent_bombs = adjacent_bombs;
    }
    public boolean get_result() {
        return bomb;
    }
    public int get_ad_number () {
        return adjacent_bombs;
    }
}



//boolean bomb = true;
// has it been revealed
//how many mines, how far is it from one