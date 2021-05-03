package com.company;

public class CustomerManager implements ıCustomerManager{

    @Override
    public void addCustomer(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli oyuncu sisteme eklendi.");
    }

    @Override
    public void removeCustomer(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli oyuncu sistemden silindi.");
    }

    @Override
    public void updateCustomer(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli oyuncu sistemde güncellendi.");
    }
}
