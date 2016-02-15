package com.oracle.pts.util;

import java.util.Random;

public class FusionUtil {
    static Random  generator = new Random(System.currentTimeMillis());
    public FusionUtil() {
        super();
    }
    public static String getSystemGeneratedNumber(){
        String returnString = String.valueOf(System.currentTimeMillis());
        return returnString;
    }
    public static int getRandomNumber(int num){
        
        int randomNumber = generator.nextInt(num);
        return randomNumber;
    }
    public static long getRandomNumberFixLength() {
       
        return 1000000000L + generator.nextInt(2000000000);
    }
    public static boolean convertStringToBoolean(String pValue){
        boolean returnValue = false;
        if(pValue.equals("T")){
            returnValue = true;
        }
        return returnValue;
        
    }
    public static String convertBooleanToString(boolean pValue){
        String returnValue = "F";
        if(pValue==true){
            returnValue = "T";
        }
        return returnValue;
        
    }    
}
