package com.mangocity.test;

import java.util.Arrays;

public class ArrayBox {
    public int[] elementData=new int[10];
    public int size;
    private void ensureCapacityInternal(int capacity){
        if(capacity-elementData.length>0){
            this.grow(capacity);
        }
    }
    private void grow(int capacity){
        int oldCapacity=elementData.length;

        int newCapacity=oldCapacity+(oldCapacity>>1);
        if(newCapacity-capacity<0){
            newCapacity=capacity;
        }
        elementData= Arrays.copyOf(elementData,newCapacity);
    }
    public boolean add(int object){

        this.ensureCapacityInternal(size+1);
        elementData[size++]=object;
        return true;
    }
}
