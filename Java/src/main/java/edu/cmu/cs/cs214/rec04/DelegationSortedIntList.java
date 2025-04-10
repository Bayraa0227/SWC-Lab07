package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private SortedIntList list;
    private int totalAdded;

    public DelegationSortedIntList() {
        list = new SortedIntList();
        totalAdded = 0;
    }

    public boolean add(int num) {
        totalAdded += 1;
        return list.add(num);
    }

    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return this.list.addAll(list);
    }

    /**
     * Жагсаалтад хэдэн удаа элемент нэмснийг буцаана.
     * 
     * @return элемент нэмсэн удаагийн тоо
     */
    public int getTotalAdded() {
        return totalAdded;
    }

    public int size() {
        return list.size();
    }

    public int get(int index) {
        return list.get(index);
    }

    public boolean remove(int num) {
        return list.remove(num);
    }

    public boolean removeAll(IntegerList list) {
        return this.list.removeAll(list);
    }

}