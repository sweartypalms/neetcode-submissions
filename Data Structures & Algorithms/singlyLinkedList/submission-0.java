

class LinkedList {
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        int position = 0;
        Node current = head;

        while(current != null) {
            if(position == index) {
                return current.data;
            }
            current = current.next;
            position++;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        Node current = head;
        if(current == null) {
            head = newNode;
            return;
        }
        while(current.next != null) {
            current = current.next;   
        }
        current.next = newNode;
    }

    public boolean remove(int index) {
        if (head == null) return false;
        if (index == 0) {
            head = head.next;
            return true;
        }
        
        int position = 0;
        Node current = head;
        while (current != null && position < index - 1) {
            current = current.next;
            position++;
        }

        if (current == null || current.next == null) {
            return false;
        }

        current.next = current.next.next;
        return true;
    }                                                                                                                                                                       
    
    

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Node current = head;
        while(current != null) {
            arrayList.add(current.data);
            current = current.next;
        }
        return arrayList;
    }
}
