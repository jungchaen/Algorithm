public interface ListADT<E> {
    /*Add element x to List index i*/
    public void add(int index, E item);

    /*Add element x to the end of the list*/
    public void append(E item);

    /*delete the index i-th element*/
    public E remove(int index);

    /*delete the first x in List*/
    public boolean removeItem(E item);

    /*return the i-th element*/
    public E get(int index);

    /*Change the value of the i-th element to x*/
    public void set(int index, E item);

    /*What is the index of the element?*/
    public int indexOf(E item);

    /*total number of elements*/
    public int len();

    public boolean isEmpty();

    /*reset all elements in list*/
    public void clear();
}
