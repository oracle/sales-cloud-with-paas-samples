package com.oracle.ptsdemo.healthcare.business.util;

import java.util.Random;

/**
 */
public class FusionUtil {
    static Random  generator = new Random(System.currentTimeMillis());

    /**
     */
    public FusionUtil() {
        super();
    }

    /**
     * @return
     */
    public static String getSystemGeneratedNumber(){
        String returnString = String.valueOf(System.currentTimeMillis());
        return returnString;
    }

    /**
     * @param num
     * @return
     */
    public static int getRandomNumber(int num){
        
        int randomNumber = generator.nextInt(num);
        return randomNumber;
    }

    /**
     * @return
     */
    public static long getRandomNumberFixLength() {
       
        return 1000000000L + generator.nextInt(2000000000);
    }

    /**
     * @param pValue
     * @return
     */
    public static boolean convertStringToBoolean(String pValue){
        boolean returnValue = false;
        if("T".equals(pValue)){
            returnValue = true;
        }
        return returnValue;
        
    }

    /**
     * @param pValue
     * @return
     */
    public static String convertBooleanToString(boolean pValue){
        String returnValue = "F";
        if(!pValue){
            returnValue = "T";
        }
        return returnValue;
        
    }    
}
