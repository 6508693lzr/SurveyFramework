/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survey;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author httle
 */
public class SurveyMethods {//implements Survey{
static int nRow;
private static void display(ArrayList<Object[]> arr){
    arr.forEach(ld -> {
        System.out.print(ld[0]+" ");
        });
    System.out.println();
}

public static boolean swap(int up,int down,ArrayList<Object[]>arr){
    if(up>=0&&down<nRow)    
    if(arr.get(up)[0].toString().compareToIgnoreCase(arr.get(down)[0].toString())>0){
        Object[] copy=new Object[3];
        copy=arr.get(up);
        arr.set(up, arr.get(down));
        arr.set(down, copy);
    return true;//true mean finish swap
    }
    else
        return false;//false mean stop swapping
    else
        return false;
}
public static void OriginSort(int index,int offset, ArrayList<Object[]> arr){
    int nRow=arr.size();
        if(offset==1&&index<nRow-1)
        if(arr.get(index)[0].toString().compareToIgnoreCase(arr.get(index+offset)[0].toString())>0){
        Object[] copy=new Object[3];
        copy=arr.get(index);
        arr.set(index, arr.get(index+offset));
        arr.set(index+offset,copy);      
        OriginSort(index,-1,arr);
        OriginSort(index+1,1,arr);
        }
        else{
            OriginSort(index+1,1,arr);
        }
        else if(offset==-1&&index>0)
            if(arr.get(index)[0].toString().compareToIgnoreCase(arr.get(index+offset)[0].toString())<0){
                Object[] copy=new Object[3];
                copy=arr.get(index);
                arr.set(index, arr.get(index+offset));
                arr.set(index+offset,copy);      
                OriginSort(index-1,-1,arr);
            }
}
    public static void bubbleSort(ArrayList<Object[]> arr) 
    {
        for(int j=0; j<arr.size(); j++) 
        {  
            for(int i=1; i<arr.size(); i++)
            {  
                if((arr.get(i)[1]).toString().compareToIgnoreCase(arr.get(i-1)[1].toString())<0)
                {  
                   Object[] words = arr.get(i); 
                   arr.set(i, arr.get(i-1));
                   arr.set(i-1, words);
                }  
            }  
        }  
    }   
public static void selectionSort(ArrayList<Object[]> arr)
{
int n=arr.size(); //length of the array
for(int i=0;i<n-1;i++)
{
int MIN=i; //set the first position as minimum
//Find the smallest element by comparing with the element in MIN position
for(int j=i+1;j<n;j++)
{
if(arr.get(j)[2].toString().compareToIgnoreCase(arr.get(MIN)[2].toString())<0)
MIN=j;
}
//Swap the smallest element with element in MIN position
Object[] temp=arr.get(i);
arr.set(i, arr.get(MIN));
arr.set(MIN,temp);
}
}
    
//    @Override
//    public void netAdapter() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void setBtns() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void setLabels() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void setTextBox() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void exportText() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void BinaryTree() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void outputLinked() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void SaveInput() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
}
