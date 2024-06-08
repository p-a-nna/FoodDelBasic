package com.neo.service;
import java.util.*;

public class OTP {
    public static final long duration=10*1000;
    public long genTime;

    public boolean isExpired()
    {
        long current=System.currentTimeMillis();
        return (current - genTime)>duration;
    }


    public int generate_otp()
    {
        int otp;
        UUID uuid=UUID.randomUUID();
        otp=Math.abs(uuid.hashCode() % 999999)+100000;
        genTime=System.currentTimeMillis();
        System.out.println("your one time 6 digit code is:"+otp);
        return otp;
    }

    public void validateotp(int otp)
    {
        Scanner sc=new Scanner(System.in);
        OTP otp1=new OTP();
        int received; int resend;
        System.out.println("enter the recieved 6 digit number");
        received=sc.nextInt();
            if (isExpired()) {
                System.out.println("The OTP has expired. Generating a new OTP.");
                generate_otp();
            }
            System.out.println("Enter the received 6 digit number:");
            received = sc.nextInt();
        if(received!=otp)
        {
            System.out.println("your purchase is invalid, press 0 to resend");
            resend=sc.nextInt();
            if(resend==0)
            {
                otp=otp1.generate_otp();
                System.out.println("New OTP has been sent.");
                System.out.println("Enter the received 6 digit number:");
                received = sc.nextInt();
            }
        }
        else
            System.out.println("Your purchase is successful, enjoy your meal");

    }
}


