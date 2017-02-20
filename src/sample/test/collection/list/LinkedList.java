package sample.test.collection.list;


public class LinkedList<T> {
	
	Node <T> head ;
	Node <T> temp ;
	LinkedList(){
	}
	
	private static class Node<T>{
		T data;
		 Node<T> next;
	}
	
	public void add(T d){
		
		Node <T> obj = new Node<T>();
		obj.data = d;
		obj.next = null;
		if( head == null) head = temp =obj;
		else{
			temp.next = obj;
			temp = temp.next;
		}
	}
	
	public void printAll(){
		Node<T> start = head;
		while(start != null){
			System.out.println(start.data);
			start = start.next;
		}
	}
	
	public void deleteEven(){
		Node<T> start = head;
		Node<T> temp = null;
		Node <T> root =null;
		while(start != null){
			if((Integer)start.data % 2 != 0)
			{
				if(root == null){
					root  = temp = start;
					start = start.next;
					root.next = null;
			        temp.next = null;
				}else{
					temp.next = start;
					temp = temp.next;
					start = start.next;
				}
			}else{
				temp.next = null;
				start = start.next;
			}
			
		}
		head = root;
	}
}