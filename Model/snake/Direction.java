package Model.snake;

public enum Direction {
    UP(0),
    RIGHT(1),
    DOWN(2),
    LEFT(3);

    private final int direction_code;
    public int direction_code(){
        return direction_code;
    }
    Direction(int direction_code){
        this.direction_code = direction_code;
    }
}
