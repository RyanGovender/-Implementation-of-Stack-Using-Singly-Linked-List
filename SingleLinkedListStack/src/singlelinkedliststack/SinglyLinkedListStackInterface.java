/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedliststack;

/**
 *
 * @author 21614
 */
public interface SinglyLinkedListStackInterface<T>{
    public void push(T item);
    public T pop();
    public T peek();
    public int Size();
    public boolean isEmpty();
}
