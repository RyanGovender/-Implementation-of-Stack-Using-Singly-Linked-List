/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedliststack;

import java.util.EmptyStackException;

/**
 *
 * @author 21614
 */
public class Stack<T> implements SinglyLinkedListStackInterface<T> {
   ListNode head;
   int size;
   
   Stack()
   {
       head=null;
       size=0;
   }
   
   @Override
   public boolean isEmpty()
   {
       return size==0;
   }
   
   @Override
   public int Size()
   {
       return size;
   }
   @Override
   public void push(T item)
   {
       head = new ListNode(item,head);
       size++;
   }
   
   @Override
   public T pop()
   {
       if(isEmpty())throw new EmptyStackException();
       
       T top= (T) head.getItem();
       head=head.getNext();
       size--;
       return top;
   }
   
   @Override
   public T peek()
   {
       if(isEmpty())throw new EmptyStackException();
       
       return (T) head.getItem();
   }

 
}
