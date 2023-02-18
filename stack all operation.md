# firstproject

 package com.sample;
import java.util.*;
class Dummy
{

    Scanner s=new Scanner(System.in);

    int stack[];                                       //declare aray
    int[] sdm(int m,int n)                                     // int[] to return complete array
    {
        stack=new int[m];                                   //initilize mathod
        System.out.println("Enter"+n+" element ");
        for(int i=0;i<n;i++)
        {
            stack[i]=s.nextInt();                          //get value in array from user
        }
        return stack;


   }

    void pdm(){
        System.out.println("Existing array ");

        for(int i=0;i<stack.length;i++)              //it can not get n so yse array.length for condin
        {
            System.out.println(stack[i]);
        }
    }
}

//-----insertion------------

class Push
{
    int[] push(int [] stack,int x,int max,int top )
    {

        if(top<max)                              //check the value of top<max then insert otherwise not
        {
            stack[top]=x;                                  //insert value
            top++;
        }
        else
        {
            System.out.println("Stack is full");
        }
        return stack;
    }
}

//-----deletion
class Pop
{
    void pop(int n)
    {


    }
}

class Dum {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int A[];

        System.out.println("Enter maxstack size of stack");
        int m = s.nextInt();
        System.out.println("Enter size of Dummy stack");
        int n = s.nextInt();
        Dummy d = new Dummy();

        A = d.sdm(m, n);
        d.pdm();

        System.out.println("after storing array");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }


        Push p = new Push();
        Pop p1 = new Pop();

        System.out.println("Enter element ");
        int x = s.nextInt();

        int C[];
        C = p.push(A, x, m, n);
        System.out.println("after storing array");
        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }






    }
}
