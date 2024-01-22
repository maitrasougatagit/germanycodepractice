package com.algo.dp.fibo;


public class Fibonaciidp {
    public static void main(String args []){
        int fibonith = 20;
        int arr [] = new int [fibonith+1];
        Fibonaciidp fibo = new Fibonaciidp();
        int response = fibo.calculateFibo(fibonith,arr);
        System.out.println(" The nth fibio nacii"+response);
        System.out.println(" The int max value"+Integer.MAX_VALUE);


    }


    public int calculateFibo(int n, int arr[]){

        if(arr[n] != 0){


            return arr[n];
        }
        if(n <=2){
            arr[n] = 1;
            return 1;
        }

        int nthFibo = calculateFibo(n-1,arr)+calculateFibo(n-2,arr);
        arr[n] = nthFibo;
        return nthFibo;
    }
}
