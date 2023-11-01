import java.util.List;
import java.util.ArrayList;
import javax.xml.transform.Source;

// Write a method, linkedListValues, that takes in the head of a linked list 
// as an argument. The method should return an List containing all values of
// the nodes in the linked list.

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    ArrayList<String> c = new ArrayList<String>();
    while (head.val != null ) {
      c.add(head.val);
      if (head.next == null)
      break;
    }
    head = head.next;

    return c;
  }

  public static void main() {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    // Solution.linkedListValues(a); 
    System.out.println(Solution.linkedListValues(a));
    // -> [ "a", "b", "c", "d" ]
  }
}
