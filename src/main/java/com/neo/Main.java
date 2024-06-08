package com.neo;

import com.neo.model.Restaurant;
import com.neo.service.OTP;


public class Main {
    public static void main(String[] args){
        Restaurant r=new Restaurant();
        OTP otp=new OTP();
        Main m=new Main();
        r.selMeal();
        r.checkout();
        int otp1=otp.generate_otp();
        otp.validateotp(otp1);
    }
}