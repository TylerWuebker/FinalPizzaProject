package classes;

import java.util.LinkedList;

public class QueueLL {
	LinkedList<PizzaOrder> LL = new LinkedList<PizzaOrder>();
	
	
	//construct
	public QueueLL() {
		
	}
	
	
	//methods
	public void enqueue(PizzaOrder e) {
		this.LL.addLast(e);
	}
	
	public PizzaOrder dequeue() {
		return this.LL.removeFirst();
	}
	
	public boolean isEmpty() {
		return this.LL.isEmpty();
	}
	
	public int size() {
		return this.LL.size();
	}
	
	public PizzaOrder front() {
		return this.LL.peekFirst();
	}
	
	public PizzaOrder rear() {
		return this.LL.peekLast();
	}
	
	public void printQueue() {
		for(PizzaOrder temp : LL) {
			temp.display();
		}
	}
	
	
	
	
	
	
	
	
}
