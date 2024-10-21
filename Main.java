class Main {
  public static void main(String[] args) {
    
    // Create a new, empty linked list
   IntList nums_list = new IntList();

    // Test 1
    System.out.println("Expected output: * empty list *");
    nums_list.displayList();
    System.out.println();

    // Insert node to empty listed list
    nums_list.insert(40);

    // Test 2
    System.out.println("Expected output: 40");
    nums_list.displayList();
    System.out.println();

    // Insert nodes to existing linked list
    nums_list.insert(10);
    nums_list.insert(30);

    // Test 3
    System.out.println("Expected output: 10 30 40");
    nums_list.displayList();
  }
}
