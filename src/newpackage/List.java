package newpackage;


import java.util.Collection;

public interface List<E> extends Collection<E> {

    /**
     * Returns <tt>true</tt> if this list contains the specified element. More
     * formally, returns <tt>true</tt> if and only if this list contains at
     * least one element <tt>e</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
     * 
     * @param o
     *            element whose presence in this list is to be tested
     * @return <tt>true</tt> if this list contains the specified element
     * @throws ClassCastException
     *             if the type of the specified element is incompatible with
     *             this list (<a
     *             href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException
     *             if the specified element is null and this list does not
     *             permit null elements (<a
     *             href="Collection.html#optional-restrictions">optional</a>)
     */
    boolean contains(Object o);

    // Modification Operations

    /**
     * Appends the specified element to the end of this list (optional
     * operation).
     * 
     * <p>
     * Lists that support this operation may place limitations on what elements
     * may be added to this list. In particular, some lists will refuse to add
     * null elements, and others will impose restrictions on the type of
     * elements that may be added. List classes should clearly specify in their
     * documentation any restrictions on what elements may be added.
     * 
     * @param e
     *            element to be appended to this list
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     * @throws UnsupportedOperationException
     *             if the <tt>add</tt> operation is not supported by this list
     * @throws ClassCastException
     *             if the class of the specified element prevents it from being
     *             added to this list
     * @throws NullPointerException
     *             if the specified element is null and this list does not
     *             permit null elements
     * @throws IllegalArgumentException
     *             if some property of this element prevents it from being added
     *             to this list
     */
    boolean add(E e);

    /**
     * Removes the first occurrence of the specified element from this list, if
     * it is present (optional operation). If this list does not contain the
     * element, it is unchanged. More formally, removes the element with the
     * lowest index <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>
     * (if such an element exists). Returns <tt>true</tt> if this list contained
     * the specified element (or equivalently, if this list changed as a result
     * of the call).
     * 
     * @param o
     *            element to be removed from this list, if present
     * @return <tt>true</tt> if this list contained the specified element
     * @throws ClassCastException
     *             if the type of the specified element is incompatible with
     *             this list (<a
     *             href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException
     *             if the specified element is null and this list does not
     *             permit null elements (<a
     *             href="Collection.html#optional-restrictions">optional</a>)
     * @throws UnsupportedOperationException
     *             if the <tt>remove</tt> operation is not supported by this
     *             list
     */
    boolean remove(Object o);

    /**
     * Removes all of the elements from this list (optional operation). The list
     * will be empty after this call returns.
     * 
     * @throws UnsupportedOperationException
     *             if the <tt>clear</tt> operation is not supported by this list
     */
    void clear();

    // Comparison and hashing

    /**
     * Compares the specified object with this list for equality. Returns
     * <tt>true</tt> if and only if the specified object is also a list, both
     * lists have the same size, and all corresponding pairs of elements in the
     * two lists are <i>equal</i>. (Two elements <tt>e1</tt> and <tt>e2</tt> are
     * <i>equal</i> if <tt>(e1==null ? e2==null :
     * e1.equals(e2))</tt>.) In other words, two lists are defined to be equal
     * if they contain the same elements in the same order. This definition
     * ensures that the equals method works properly across different
     * implementations of the <tt>List</tt> interface.
     * 
     * @param o
     *            the object to be compared for equality with this list
     * @return <tt>true</tt> if the specified object is equal to this list
     */
    boolean equals(Object o);

    /**
     * Returns the hash code value for this list. The hash code of a list is
     * defined to be the result of the following calculation:
     * 
     * <pre>
     * int hashCode = 1;
     * for (E e : list)
     *     hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
     * </pre>
     * 
     * This ensures that <tt>list1.equals(list2)</tt> implies that
     * <tt>list1.hashCode()==list2.hashCode()</tt> for any two lists,
     * <tt>list1</tt> and <tt>list2</tt>, as required by the general contract of
     * {@link Object#hashCode}.
     * 
     * @return the hash code value for this list
     * @see Object#equals(Object)
     * @see #equals(Object)
     */
    int hashCode();

    // Positional Access Operations

    /**
     * Returns the element at the specified position in this list.
     * 
     * @param index
     *            index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException
     *             if the index is out of range (
     *             <tt>index &lt; 0 || index &gt;= size()</tt>)
     */
    E get(int index);

    /**
     * Inserts the specified element at the specified position in this list
     * (optional operation). Shifts the element currently at that position (if
     * any) and any subsequent elements to the right (adds one to their
     * indices).
     * 
     * @param index
     *            index at which the specified element is to be inserted
     * @param element
     *            element to be inserted
     * @throws UnsupportedOperationException
     *             if the <tt>add</tt> operation is not supported by this list
     * @throws ClassCastException
     *             if the class of the specified element prevents it from being
     *             added to this list
     * @throws NullPointerException
     *             if the specified element is null and this list does not
     *             permit null elements
     * @throws IllegalArgumentException
     *             if some property of the specified element prevents it from
     *             being added to this list
     * @throws IndexOutOfBoundsException
     *             if the index is out of range (
     *             <tt>index &lt; 0 || index &gt; size()</tt>)
     */
    void add(int index, E element);

    /**
     * Removes the element at the specified position in this list (optional
     * operation). Shifts any subsequent elements to the left (subtracts one
     * from their indices). Returns the element that was removed from the list.
     * 
     * @param index
     *            the index of the element to be removed
     * @return the element previously at the specified position
     * @throws UnsupportedOperationException
     *             if the <tt>remove</tt> operation is not supported by this
     *             list
     * @throws IndexOutOfBoundsException
     *             if the index is out of range (
     *             <tt>index &lt; 0 || index &gt;= size()</tt>)
     */
    E remove(int index);

    // Search Operations

    /**
     * Returns the index of the first occurrence of the specified element in
     * this list, or -1 if this list does not contain the element. More
     * formally, returns the lowest index <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
     * or -1 if there is no such index.
     * 
     * @param o
     *            element to search for
     * @return the index of the first occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     * @throws ClassCastException
     *             if the type of the specified element is incompatible with
     *             this list (<a
     *             href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException
     *             if the specified element is null and this list does not
     *             permit null elements (<a
     *             href="Collection.html#optional-restrictions">optional</a>)
     */
    int indexOf(Object o);
}

