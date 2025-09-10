public class DynamicArray {
    public int[] arr = new int[10];
    public int index = 0;
    public int capacity = 10;

    public void add(int a) {
        if (index < capacity) {
            arr[index++] = a;
        } else {
            resize();
            arr[index++] = a;
        }

    }

    public int get(int index) throws ArrayIndexOutOfBoundsException {
        if (this.index >= index)
            return arr[index];
        else {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
    }

    public int size() {
        return index;
    }

    public void resize() {
        int[] newArr = new int[capacity * 2];
        capacity *= 2;
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
        System.out.println(arr.length);
    }

    public String toString() {
        StringBuilder res = new StringBuilder("[");
        for (int i = 0; i < index; i++) {
            res.append(" " + arr[i]);
            if (i < index - 1)
                res.append(",");
        }
        res.append(" ]");

        return new String(res);

    }

    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        System.out.println(d.capacity);
        System.out.println(d.arr.length);
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        System.out.println(d);
        d.add(50);
        System.out.println(d);
    }

}
