package com.logicalProgramming;

public class CouponNumber {

    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int maximum = 100000000;
        int random = (int) (Math.random() * maximum);
        StringBuffer stringBuffer = new StringBuffer();

        while (random > 0) {
            stringBuffer.append(chars[random % chars.length]);
            random /= chars.length;
        }

        String couponCode = stringBuffer.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
}