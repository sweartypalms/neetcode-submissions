class DynamicArray {
    int size = 0;
    int[] array;
    public DynamicArray(int capacity) {
        array = new int[capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if(size < array.length) {
            array[size] = n;
        } else if(size == array.length) {
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
        int newCapacity = array.length * 2;
        int[] newArray = new int[newCapacity];
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
