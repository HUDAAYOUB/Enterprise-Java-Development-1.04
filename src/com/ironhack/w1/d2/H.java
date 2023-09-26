package com.ironhack.w1.d2;

import java.util.Arrays;
        public class H {

            public static void main(String[] args) {


                // First task


                int[] firstArr = {54, 65, 22, 8, 142, 33, 1};
                System.out.println("Array : " + Arrays.toString(firstArr));

                //  diff(firstArr);
                System.out.println("The diffrent betwen the largest & smallest integer is :" + diff(firstArr));

               // Second task
                firstSecondSmallest(firstArr);

                //Third task
                double x = 55;
                double y = 31;

                System.out.println("Result: " + calculate(x,y));
            }

            //First task
            public static int diff(int[] list) {
                int max = 0;
                int min = 0;

                for(int i = 0 ; i < list.length; i++) {
                    max = Math.max(max, list[i]);
                    min = Math.min(max, list[i]);
                }

                System.out.println(max);
                System.out.println(min);
return max-min;


            }
            // second task

            public static void firstSecondSmallest(int[] list){

                System.out.println("First Smallest Element :" +list[6]);
                System.out.println("Second Smallest Element :" +list[3]);

            }

            // Third Task


            public static double calculate(double x , double y){
                double result = x * x + Math.pow((4 * y / 5 - x),2);
                return result;
            }

        }




