package net.manage;

import   static  org.junit.Assert.assertEquals;
import  org.junit.Test;
import  org.junit.runner.RunWith;
import  org.junit.runners.Parameterized;
import  org.junit.runners.Parameterized.Parameters;
import  java.util.Arrays;
import  java.util.Collection;
@RunWith(Parameterized. class )

 public   class  SquareTest {
     private   static  Cal1 calculator  =   new  Cal1();
     private   int  param;
     private   int  result;
    @Parameters
      public   static  Collection data(){
          return  Arrays.asList( new  Object[][]{
            { 2 ,  4 } ,
            { 0 ,  0 } ,
            {-3 ,  9 } , } );

    } 


// ���캯�����Ա������г�ʼ�� 

      public  SquareTest( int  param,  int  result){

         this .param  =  param;

         this .result  =  result;
    } 
    @Test
    public   void  square(){
        calculator.square(param);
        assertEquals(result, calculator.getResult());
        System.out.print(result+"--");

    } 
} 
