package com.pach.models;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImpl {

   public Boolean priorityBasedOnQuantity(Store store){
       List<Product> productList = store.getProducts();
       Customer customer = new Customer();
       Cashier cashier = new Cashier();
       PriorityQueue<Customer> priorityQueue = new PriorityQueue<>();
       priorityQueue.addAll(store.getCustomerList());
           for (int i = 0; i <6; i++) {
               System.out.println(priorityQueue.poll());
               System.out.println(cashier.sell(store.getCustomerList().get(i),productList.get(i)));
               System.out.println("********************************");
//               try {
//                   if (customer.getTotalQuantitySumInCart() == 0){
//                       System.out.println(priorityQueue.remove());
//                   }
//               }catch (Exception e){
//                   System.out.println(priorityQueue.poll());
//                   System.out.println("Your Cart Cannot be Empty!");
//               }
           }
        return true;
   }

    public Boolean priorityBasedOnFIFO(Store store){
        List<Product> productList = store.getProducts();
        Customer customer = new Customer();
        Cashier cashier = new Cashier();
        Queue<Customer> queue = new LinkedList<>();
        queue.addAll(store.getCustomerList());
        for (int i = 0; i <6; i++) {
            System.out.println(queue.poll());
            System.out.println(cashier.sell(store.getCustomerList().get(i),productList.get(i)));
            System.out.println("********************************");
        }return true;
    }


}
