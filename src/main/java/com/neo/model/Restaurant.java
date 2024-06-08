package com.neo.model;
import java.util.*;

public class Restaurant {

    public  Menu menu=new Menu();
    public Item[] items=menu.fillMenu();
    int n=items.length;
    int[] wanted=new int[n];

    public void selMeal()
    {
        Scanner sc=new Scanner(System.in);
        for (Item item : items) {
            System.out.print("Item Name: " + item.getName()+", ");
            System.out.println("Item Price: " + item.getPrice());
        }

        System.out.println("Select the items u want by entering their indexes and enter 0 to exit");
        for(int i=0;i<n;i++)
        {
            wanted[i]=sc.nextInt();
            if(wanted[i]==0)
            {
                System.out.println("selection stopped");
                break;
            }
            if(wanted[i]>n||wanted[i]<1)
            {
                System.out.println("invalid item number");
                break;
            }
        }

    }

    public void checkout()
    {
        double total=0;
        int i;
        int k=wanted.length;
        System.out.println("The final items:");
        for(i=0;i<k;i++)
        {
            if (wanted[i] > 0 && wanted[i] <= n) {
                Item selectedItem = items[wanted[i] - 1]; // Adjust index to match array
                System.out.print("Item Name: " + selectedItem.getName()+", ");
                System.out.println("Item Price: " + selectedItem.getPrice());
                total += selectedItem.getPrice();
            }
        }
        System.out.println("Total Price: " + total);
    }

}
