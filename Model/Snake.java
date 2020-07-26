package Model;

public class Snake {
    public class Node {
        private final int x;
        private final int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
    }

    // for test
    private Node head;
    public Snake(int x, int y){
        this.head = new Node(x, y);
    }
    public void printHead(){
        int x = this.head.getX();
        int y = this.head.getY();
        System.out.printf("head coord is (%d , %d)",x,y);
        return;
    }
}