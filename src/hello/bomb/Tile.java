package hello.bomb;

public class Tile {
   // attributes
    boolean bomb;
    boolean reveal;
    int adjacent_bombs;

    // contructors
    public Tile(boolean bomb, int adjacent_bombs){
        this.reveal = false;
    }

    public boolean get_result() {
        return bomb;
    }
    public boolean get_rev () {return reveal;}
    public int get_ad_number () {
        return adjacent_bombs;
    }

}

//use gettors and settors here