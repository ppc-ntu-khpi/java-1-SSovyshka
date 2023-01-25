package test;

import src.domain.Customer;

public class CustomerTest {
    public static void main (String[] args){
        Customer customer = new Customer();
        customer.displayCustomerInfo();

        Customer customer2 = new Customer(0, null, -10);
        customer2.displayCustomerInfo();

        Customer customer3 = new Customer(20, false, 1200);
        customer3.setNew(true);
        customer3.setTotal(1300);
        customer3.displayCustomerInfo();
    }
}
