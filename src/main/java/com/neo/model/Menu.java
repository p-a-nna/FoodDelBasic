package com.neo.model;
import java.util.*;

public class Menu {
    public Item[] fillMenu()
    {
        Scanner sc=new Scanner(System.in);
        int n; int i;
        String name;
        System.out.println("Enter the name of the restaurant u want to eat from");
        name=sc.next();
        System.out.println("Enter the number of items");
        n=sc.nextInt();
        Item[] items=new Item[n];
        System.out.println("Enter the item details:");
        for(i=0;i<n;i++)
        {
            items[i]=new Item();
            items[i].getDetails();
        }

        return items;
    }
}
