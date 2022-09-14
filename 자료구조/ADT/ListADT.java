public interface ListADT<E> {
    /*Add element x to List index i*/
    public void add(int i, E x);

    /*Add element x to the end of the list*/
    public void append(E x);

    /*delete the index i-th element*/
    public E remove(int i);

    /*delete the first x in List*/
    public boolean removeItem(E x);

    /*return the i-th element*/
    public E get(int i);

    /*Change the value of the i-th element to x*/
    public void set(int i, E x);

    /*What is the index of the element?*/
    public int indexOf(E x);

    /*total number of elements*/
    public int len();

    public boolean isEmpty();

    /*reset all elements in list*/
    public void clear();
}
