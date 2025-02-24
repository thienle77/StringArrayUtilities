package com.zipcodewilmington;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];

    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (value.equals(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int i = 0;
        String[] reverse = new String[array.length];
        for (i = 0; i < array.length; i++) {
            reverse[i] = array[reverse.length - 1 - i];
        }

        return reverse;
    } // create new String array that takes elements of old array
    // will loop through each element of new array
    // and assigned values in reverse

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
        public static boolean isPalindromic(String[] array) {
            //called method from above
            return Arrays.equals(array, reverse(array));

//            int i = 0;
//            String[] reverse = new String[array.length];
//            for (i = 0; i < array.length; i++) {
//                reverse[i] = array[reverse.length - 1 - i];
//                if (reverse != array) {
//                    return true;
//                }
//
//            }
//            return false;
        }

        /**
         * @param array array of String objects
         * @return true if each letter in the alphabet has been used in the array
         */ // TODO
        public static boolean isPangramic (String[]array){
                String strArray = Arrays.toString(array).toUpperCase();
                String abc = "";

                for (int i = 0; i < abc.length(); i++){
                    if (!strArray.contains(String.valueOf(abc.charAt(i)))){
                        return false;
                    }

                }
                return true;
        }

        /**
         * @param array array of String objects
         * @param value value to check array for
         * @return number of occurrences the specified `value` has occurred
         */ // TODO
        public static int getNumberOfOccurrences (String[]array, String value){
            int count = 0;

            for (int i = 0; i <= array.length - 1 ; i++){
                if (array[i].contains(value)) {
                    count++;
                }
            }
            return count;
        }

        /**
         * @param array         array of String objects
         * @param valueToRemove value to remove from array
         * @return array with identical contents excluding values of `value`
         */ // TODO
        public static String[] removeValue (String[]array, String valueToRemove){
            ArrayList<String> arr = new ArrayList<String>();

            for (int i = 0; i < array.length; i++) {
                if (array[i] != valueToRemove) {
                    arr.add(array[i]);
                }
            }
            return arr.toArray(arr.toArray(new String[0]));
        }

        /**
         * @param array array of chars
         * @return array of Strings with consecutive duplicates removes
         */ // TODO
        public static String[] removeConsecutiveDuplicates (String[]array){
            ArrayList<String> arr = new ArrayList<String>();

            for (int i =0; i < array.length - 1; i++) {
                if (array[i] != array[i + 1]){
                    arr.add(array[i]);
                }
            }

            return arr.toArray(new String[0]);
        } //return null

        /**
         * @param array array of chars
         * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
         */ // TODO
        public static String[] packConsecutiveDuplicates (String[]array){
            return null;
        }

}

