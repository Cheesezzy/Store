package com.pach.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueImplTest {

    // test to assert true when the priority queue method is called
    @Test
    void priorityBasedOnQuantity() {
        Store store = new Store();
        store.readFromFile();
        store.setupCustomers();
        PriorityQueueImpl p = new PriorityQueueImpl();
        Boolean result = p.priorityBasedOnQuantity(store);
        Boolean responce = true;
        assertEquals(responce,result);
    }

    @Test
    void priorityBasedOnFIFO() {
        Store store = new Store();
        store.readFromFile();
        store.setupCustomers();
        PriorityQueueImpl p = new PriorityQueueImpl();
        Boolean result = p.priorityBasedOnFIFO(store);
        Boolean responce = true;
        assertEquals(responce,result);

    }
}