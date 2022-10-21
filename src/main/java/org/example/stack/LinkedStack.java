package org.example.stack;

public class LinkedStack {
    public class Node {

        private Object data;
        private Node nextNode;

        public Node(Object data){
            this.data = data;
            this.nextNode = null;

        }

        //해당 노드를 원하는 노드(Node top)와 연결해주는 메소드
        public void linkNode(Node top){
            this.nextNode = top;
        }

        //해당 노드의 데이터를 가져오는 get메소드
        public Object getData(){
            return this.data;
        }

        //해당 노드와 연결된 노드를 가져오는 get메소드
        public Node getNextNode(){
            return this.nextNode;
        }
    }

    private Node top;

    public LinkedStack(){
        top = null;
    }

    public boolean isEmpty(){
        return (top==null);
    }

    public void push(Object item){
        Node newNode = new Node(item);
        newNode.linkNode(top);
        top = newNode;
    }

    public Object peek(){
        return top.getData();
    }

    public Object pop(){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
        else{
            Object item = peek();
            top = top.getNextNode();
            return item;
        }
    }
}
