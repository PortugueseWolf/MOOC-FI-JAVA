package list;

public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        firstFreeIndex = 0;
    }

    public void add(Type value) {
        if (firstFreeIndex == values.length) {
            grow();
        }
        values[firstFreeIndex] = value;
        firstFreeIndex ++;
    }

    private void grow() {
        int newSize = values.length + values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        values = newValues;
    }

    public boolean contains(Type value) {
        if (indexOfValue(value) > 0) {
            return true;
        }
            return false;
        }

    public int indexOfValue(Type value) {
        for (int i = 0; i < firstFreeIndex; i++) {
            if (values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < firstFreeIndex; i++) {
            values[i] = values[i+1];
        }
    }

    public void remove(Type value) {
        int index = indexOfValue(value);
        if (index < 0) {
            return;
        }
        moveToTheLeft(index);
        firstFreeIndex --;
    }

    public Type value(int index) {
        if (index < 0 || index >= firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0," + firstFreeIndex + "]");
        }
        return values[index];
    }

    public int sizeOfList() {
        return firstFreeIndex + 1;
    }
}
