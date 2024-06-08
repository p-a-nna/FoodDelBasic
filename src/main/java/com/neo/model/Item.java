package com.neo.model;
import java.util.*;

public class Item {
    public double price;
    public String name;
    public void getDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Name:"+" ");
        name=sc.nextLine();
        System.out.println("Price:");
        price=sc.nextDouble();
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
