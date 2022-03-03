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
         */

        /***
         * 1. creating linked list
         */
        MyLinkedList myLinkedList = new MyLinkedList();

        /***
         * 2. adding nodes to the linked list
         */
        myLinkedList.add(56);
        myLinkedList.add(70);

        /***
         * 3. printing the linked list after adding the nodes
         */
        myLinkedList.printLinkedList();

        /***
         * 4. inserting data in between data
         */
        System.out.println("\nAfter inserting : ");
        myLinkedList.insertBetween(56,30);

        /***
         *  5. printing the linked list after inserting the data
         */
        myLinkedList.printLinkedList();
    }
}
