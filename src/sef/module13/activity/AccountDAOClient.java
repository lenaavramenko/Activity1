package sef.module13.activity;
//Needs to be completed

import java.util.List;

public class AccountDAOClient{

    public static void main(String[] args) {
        AccountDAO obj = new AccountDAOImpl();

        try {

            //Test1 - Type code to test findAccount("1")
            Account account = obj.findAccount("1");

            //Test2 - Type code to test findAccount("J","D"). How many records do you get?
            obj.findAccount("J","D");

            //Test3 - Type code to test insertAccount("6","Sasha","Kohli","sasha.kohli@gmail.com",90000)
            obj.insertAccount("6","Sasha","Kohli","sasha.kohli@gmail.com",90000);

            //Test4 - Type code to test deposit("1",2000)
            obj.deposit("1",2000);

            //Test5 - Type code to test deposit("2",3000)
            obj.deposit("2",3000);

            //Test6 - Type code to test deleteAccount("6")
            obj.deleteAccount("6");


        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}