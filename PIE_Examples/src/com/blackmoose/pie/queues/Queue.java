package com.blackmoose.pie.queues;
import java.util.ArrayList;
import java.util.List;


public class Queue<E> {
	private List<E> queue;
	private Integer head;
	private Integer tail;
	
	public Queue(){
		queue = new ArrayList<E>();
		head = tail = 0;
	}
	
	public void enQueue(E data){
		

		queue.add(head, data);
		head++;				
	}
	
	public E deQueue(){

		if (isEmpty()){
			return null;
		}
		E data = queue.get(tail);
		tail++;
		return data;
	}
	
	
	public Integer size(){
		return head - tail ;
	}

	public Boolean isEmpty(){
		return head == tail ;
	}
	
}
