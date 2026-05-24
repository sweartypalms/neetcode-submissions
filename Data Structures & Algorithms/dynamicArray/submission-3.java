class DynamicArray {
    int size = 0;
    int capacity;
    int[] array;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        array = new int[this.capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if(size < capacity) {
            array[size] = n;
        } else if(size == capacity) {
            resize();
            array[size] = n;
        }
        size++;
    }

    public int popback() {
        this.size--;
        return array[this.size];
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArray = new int[capacity];
        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return array.length;
    }
}
