package com.company;

import java.util.Arrays;

public class Main {


        public static void main(String[] args) {

            int [] array ={1,2,0,3,0,4,6,0,9,0};
            int i;
            for (i = 0 ; i< array.length ; i++){
                if(array[i] == 0){
                    int temp = array[i+1];
                    array[i+1] = 0;

                    if(array.length == i+2){
                        break;
                    }
                    else{
                        array[i+2] = temp;
                        i+=2;
                    }
                }
            }


            System.out.println(Arrays.toString(array));
        }
    }

