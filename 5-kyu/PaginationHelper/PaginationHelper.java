package org.example.kyu_5.paginationhelper;

import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */

    private final List<I> collection;
    private final int itemsPerPage;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((double) itemCount() / itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int lastPage = pageCount() - 1;

        if (pageIndex > lastPage || pageIndex < 0) return -1;
        return (pageIndex != lastPage) ? itemsPerPage : itemCount() - (lastPage * itemsPerPage);
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        int lastItem = itemCount() - 1;

        if (itemIndex > lastItem || itemIndex < 0) return -1;
        return itemIndex / itemsPerPage;
    }
}
