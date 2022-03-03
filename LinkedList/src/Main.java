public class Main {

    /***
     * main method for manipulation
     * @param args - default param(not used)
     */
    public static void main(String[] args) {
        /***
         * PROCEDURE
         * 1. creating linked list
         * 2. adding nodes to the linked list
         * 3. printing the linked list after adding the nodes
         * 4. inserting data in between data
         * 5. printing the linked list after inserting the data
         * 6. searching an element
         * 7. deleting specific element
         * 8. deleting first element in linked list
         * 9. printing linked list after deleting first element
         * 10. deleting last element in linked list
         * 11. printing linked list after deleting last element
         */

        /***
         * 1. creating linked list
         */
        MyLinkedList myLinkedList = new MyLinkedList();

        /***
         * 2. adding nodes to the linked list
         */
        myLinkedList.add(56);
        myLinkedList.add(30);
        myLinkedList.add(70);

        /***
         * 3. printing the linked list after adding the nodes
         */
        myLinkedList.printLinkedList();

        /***
         * 4. inserting data in between data
         */
        System.out.println("\nAfter inserting : ");
        myLinkedList.insertBetween(30, 40);

        /***
         *  5. printing the linked list after inserting the data
         */
        myLinkedList.printLinkedList();

        /***
         * 6. searching an element
         */
        myLinkedList.searchElement(myLinkedList, 30);

        /***
         * 7. deleting specific element
         */
        myLinkedList.deleteSpecificElement(40);

        /***
         * 7. deleting first element in linked list
         */
        System.out.println("\nAfter deleting first element : ");
        myLinkedList.deleteFirstElement();

        /***
         * 8. printing linked list after deleting first element
         */
        myLinkedList.printLinkedList();

        /***
         * 9. deleting last element in linked list
         */
        System.out.println("\nAfter deleting last element : ");
        myLinkedList.deleteLastElement();

        /***
         * 10. printing linked list after deleting last element
         */
        myLinkedList.printLinkedList();

    }
}
