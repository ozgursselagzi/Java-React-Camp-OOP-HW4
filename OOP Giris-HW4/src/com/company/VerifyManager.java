package com.company;

public class VerifyManager {

    public void verify(Customer customer){

        if (customer.getNationalId().length()==11 && customer.getLastName().length()>0){

            System.out.println("DOĞRULAMA TAMAMLANDI!");

        }else{

            System.out.println("DOĞRULAMA YAPILAMADI!");

        }

    }
}
