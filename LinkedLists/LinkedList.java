// The functions for the SinglyLinkedList are defined here

import java.util.*;

public class LinkedList {

	LinkedList list;
	Node head;
	Node n;
	int size;
	public LinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		n=null;
		size = 0;
	}
	
	// Case 1: Insert element at first position
	public void insertAtFirst(Object data)
	{
		Node node = new Node(data,null);
		if(head == null)
		{
			head=node;
		}
		else
		{
			node.setlink(head);
			head=node;
		}
		size++;
		System.out.println("Element inserted");
	}
	
	// Case 2: Insert element at last position	
	public void insertAtLast(Object data)
	{
		Node node = new Node(data,null);
		if(isEmpty())
		{
			insertAtFirst(data);
		}
		else
		{
			size++;
			n=head;
			while(n.link!=null)
			{
				n=n.link;
			}
			n.link=node;
			System.out.println("Element inserted");	
		}
		
	}
	
	// Case 3: Insert element at kth position
	public void insertAtPosition(Object data, int pos)
	{
		Node node = new Node(data,null);
		size++;
		n = head;
		int prev=pos-1;
		for(int i=1; i<prev;i++)
		{
			n=n.link;
		}
		Node temp = n.link;
		n.link = node;
		node.link=temp;
		System.out.println("Element inserted");
	}
	
	// Case 4: Delete element at first position
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("Linked List is empty");
		}
		else if(head.link==null)
		{
			size--;
			head=null;
		}
		else
		{
			size--;
			Node temp = head.link;
			head.link = null;
			head=temp;
		}
	}
	
	// Case 5: Delete element at last position
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("Linked list is empty");
		}
		else if(head.link==null)
		{
			deleteFirst();
		}
		else
		{
			size--;
			n = head;
			int befLast=size-1;
			for(int i=1;i<size;i++)
			{
				n=n.link;
			}
			n.setlink(null);			
		}		
	}

	// Case 6: Delete element at kth position
	public void deleteAtPosition(int pos)
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else if(pos==1)
		{
			deleteFirst();
		}
		else
		{
			size--;
			n=head;
			int prev=pos-1;
			for(int i=1;i<prev;i++)
			{
				n=n.link;
			}
			Node temp=n.link.link;
			n.link=null;
			n.link=temp;
		}
	}
	
	// Case 7: Searching an element
	public void search(Object d)
	{
		if(isEmpty())
		{
			System.out.println("Linkedlist is empty");
		}
		else
		{
			n=head;
			for(int i=0;i<size;i++)
			{
				if(n.data==d)
				{
					System.out.println("Element found at position: "+(i+1));
					break;
				}
				else
				{
					n=n.link;
				}
			}
		}
	}
	
	//Case 8: Check if linked list is empty
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else
		{
			return false;	
		}	
	}

	// Case 9: Get size of linked list
	public int getSize()
	{
		return size;
	}
	
	// Case 10: Print all elements of linked list
	public void getAllElements()
	{
		if(isEmpty())
		{
			System.out.println("Linked list is empty");
		}
		else if(head.getlink()==null)
		{
			System.out.println(head.getdata());
		}
		
		else
		{
			n=head;
			System.out.print(n.getdata()+" -> ");
			n=n.getlink();
			while(n.link!=null)
			{
				System.out.print(n.getdata()+" -> ");
				n=n.getlink();
			}
			System.out.println(n.getdata());
		}
	}
	
	// Case 11: Check for all the duplicates in a linked list
	public void checkDuplicates()
	{
		n=head;
		HashMap<Object,Boolean> hm = new HashMap<Object,Boolean>();
		boolean value;
		for(int i=0;i<size;i++)
		{
			Object key = n.getdata();
			if(hm.containsKey(key))
			{
				value=false;
				System.out.println("duplicates found. duplicate letter is: "+key);
				hm.put(key,value);
			}
			else
			{
				value = true;
				hm.put(key,value);
			}
			n=n.getlink();
		}	
	}
	
}
