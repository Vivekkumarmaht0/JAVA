class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
  }
}
class LinkedList {
  private Node head;
  private Node tail;
  LinkedList() {
    this.head = null;
    this.tail = null;  
  }
  

}
public class LinkedList {
  public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
    n1.next = n2;
    n2.next = n3;
    Node temp = n1;
    while (temp != null) {
      System.out.println(temp.data); 
      temp = temp.next;
    }
  }
}
