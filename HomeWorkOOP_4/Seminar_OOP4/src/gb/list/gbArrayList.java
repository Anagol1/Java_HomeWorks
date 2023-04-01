package gb.list;

import gb.GBList;

import java.util.Iterator;

public class gbArrayList<T> implements GBList<T>{

    private T[] values;
    private int capacity = 6;
    private int size = 0;
    public gbArrayList() {

        this.values = (T[]) new Object[capacity]; //эта запись нужна, т.к при компиляции стираются типы и все становится Object
    }

    @Override
    public boolean add(T type) {
        try {
            if (this.size < capacity) {
                for (int i = 0; i < capacity; i++) {
                    this.values[this.size] = type;
                }
                this.size++;
            }
            else{
                int newCapacity = this.capacity *2;
                T[] temp = values;
                values = (T[]) new Object[newCapacity];
                System.arraycopy(temp, 0, values, 0, temp.length);
                for (int i = this.size+1; i < newCapacity; i++) {
                    this.values[this.size] = type;
                }
                this.size++;
            }

                return true;
            }

        catch(ClassCastException e){
                e.printStackTrace(); // выводит ошибку в консоль
            }
            return false;
        }

    @Override
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length-1];
            System.arraycopy(temp,0,values,0,index);
            int elemsAfterIndexMoved = temp.length - index - 1;
            System.arraycopy(temp,index + 1,values,index,elemsAfterIndexMoved);
            this.size--;

        }catch (ClassCastException e) {
            throw new RuntimeException(e); //оборачиваем ошибкой времени выполнения кода
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
//        return values.length;
        return this.size;
    }

    @Override
    public void update(int index, T type) {
        values[index] = type;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }
}
