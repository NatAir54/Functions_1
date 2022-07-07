package com.epam.rd.autotasks;
import java.util.stream.IntStream;

class FunctionsTask1 {
   /**
   * <summary>
   * Implement code according to description of task.
   * </summary>
   * if set invalid arguments in method, then method must throws
   * IllegalArgumentException
   */

   public static boolean isSorted(int[] array, SortOrder order) {
       try {
           if (array==null && order==null) {
               throw new IllegalArgumentException();
           }
           if (array.length!=0 && order!=null) {
               int j;
               if (order==SortOrder.ASC) {
                   for (j=0; j<array.length-1; j++) {
                       if(array[j]>array[j+1])
                           return false;
                   }
                    return true;
               }
               else if (order==SortOrder.DESC) {
                   for (j=0; j<array.length-1; j++) {
                       if(array[j]<array[j+1])
                           return false;
                   }
                   return true;
               }
           }   else throw new IllegalArgumentException();
       }
       catch (NullPointerException e) {
           return false;
       }

       return false;
   }
}
