public class MagazineRack {
    private ListNode head;
    private ListNode tail;

    public MagazineRack() {
        this.head = null;
        this.tail = null;
    }

    // Adds a magazine at the end
    public void addMagazine(String magazine) {
        ListNode newNode = new ListNode(magazine, null, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.setNext(head);
            newNode.setPrevious(tail);
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
            tail.setNext(head);
            head.setPrevious(tail);
        }
    }

    // Removes a magazine by name
    public void removeMagazine(String magazine) {
        if (head == null) return;

        ListNode current = head;
        do {
            if (current.getValue().equals(magazine)) {
                if (current == head) {
                    head = head.getNext();
                    tail.setNext(head);
                    head.setPrevious(tail);
                    if (head == tail) {
                        head = null;
                        tail = null;
                    }
                } else if (current == tail) {
                    tail = tail.getPrevious();
                    tail.setNext(head);
                    head.setPrevious(tail);
                } else {
                    current.getPrevious().setNext(current.getNext());
                    current.getNext().setPrevious(current.getPrevious());
                }
                return;
            }
            current = current.getNext();
        } while (current != head);
    }

    // Prints the magazines from front to back
    public void printFromFront() {
        if (head == null) return;

        ListNode current = head;
        do {
            System.out.println(current.getValue());
            current = current.getNext();
        } while (current != head);
    }

    // Prints the magazines from back to front
    public void printFromBack() {
        if (tail == null) return;

        ListNode current = tail;
        do {
            System.out.println(current.getValue());
            current = current.getPrevious();
        } while (current != tail);
    }

    public static void main(String[] args) {
        MagazineRack rack = new MagazineRack();

        // Adding magazines
        rack.addMagazine("National Geographic");
        rack.addMagazine("Time");
        rack.addMagazine("People");
        rack.addMagazine("Sports");

        System.out.println("Printing from front:");
        rack.printFromFront();

        System.out.println("\nPrinting from back:");
        rack.printFromBack();


        rack.removeMagazine("Time");
        System.out.println("\nAfter removing Time, printing from front:");
        rack.printFromFront();
    }
}
