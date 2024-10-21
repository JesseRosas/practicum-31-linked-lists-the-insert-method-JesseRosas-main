// IntList Class to Complete
public class IntList {
  private IntNode head;

  public IntList() {
  // Inits as empty list
    head = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  // ** TO COMPLETE **
  public void insert(int new_value) {
    IntNode newNode = new IntNode(new_value);

    // Case 1: Empty list or new value should be inserted at the front
    if (head == null || new_value < head.getValue()) {
      newNode.setNext(head); // new node points to the current head
      head = newNode; // new node becomes the head
    } else {
      // Case 2: Traverse the list to find the correct position
      IntNode current = head;
      while (current.getNext() != null && current.getNext().getValue() < new_value) {
        current = current.getNext(); // Move to the next node
      }
      newNode.setNext(current.getNext()); // new node points to the next node
      current.setNext(newNode); // current node points to the new node
    }
  }



    
  // Display Method
  public void displayList() {
    if(head == null) 
      System.out.println("* empty list * ");
    else {
      IntNode tempPtr = head;
      
      while(tempPtr != null) {
        System.out.println(tempPtr.getValue());
        tempPtr = tempPtr.getNext();
      }
    }
  }
}
