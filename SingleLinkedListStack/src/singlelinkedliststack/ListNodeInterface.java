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
public interface ListNodeInterface<T> {
    public void setNext(ListNode n);
 
    public ListNode getNext();

    public void setItem(T item);
  
    public T getItem();
}
