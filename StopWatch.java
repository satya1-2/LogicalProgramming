package com.logicalProgramming;
import java.util.*;

public class StopWatch {
    public static void main(String[] args) {
        try{
            long Start=System.currentTimeMillis();//this system use for current date or time
            System.out.println(new Date() + "\n");
            Thread.sleep(5*60*10);//want to get  date and time later after some milli second sleep
            System.out.println(new Date() + "\n");
            long end=System.currentTimeMillis();
            long diffrence=end-Start;
            System.out.println("diffrence is :" + diffrence);
        }
        catch(Exception e){
            System.out.println("got an exception");
        }
    }
}
