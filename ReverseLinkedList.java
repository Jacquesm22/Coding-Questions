import java.util.LinkedList;

// HOW TO REVERSE A LINKED LIST

public class ReverseLinkedList {

  public static void main(String[] args) {
    // Declare linked list
    LinkedList<Integer> link = new LinkedList<>();

    // Add elements to linked list
    link.add(1);
    link.add(2);
    link.add(3);

    // Display elements in current linked list
    System.out.println("Original List: " + link);

    // Create a new linked list
    LinkedList<Integer> link1 = new LinkedList<>();
    // Reverse the original linked list
    link.descendingIterator().forEachRemaining(link1::add);
    // Display output
    System.out.println("Reversed List: " + link1);
  }
}
