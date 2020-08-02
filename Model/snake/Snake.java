package Model.snake;

import java.util.LinkedList;

public class Snake {


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

    // formal content
    private LinkedList<Node> body = new LinkedList<>();

    public Node eat(Node food){
        // 如果food和头部相邻，则把food加入到链表头，并且更新链表
        // 返回food?
    }

    public Node move(Direction direction){
        // 根据方向移动
        // 实现方法为: 在该方向前一格坐标增加一个Node, 移除body尾部node
        // 返回?  
    }

    public Node getHead(){
        return body.getFirst();
    }

    public Node getTail(){
        return body.getLast();
    }

    public LinkedList<Node> getBody(){
        return body;
    }

    private boolean isNeighbor(Node a, Node b){
        // 判断 a, b Node 是否相邻
    }



}