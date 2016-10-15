// Implementing a Singly linked list.
// All the challenging problems in linked list require a solid understanding of the following operations.  

import java.util.*;

public class SinglyLinkedList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		LinkedList list = new LinkedList(); 
		
		do
		{
			System.out.println("What do you want to do? ");
			System.out.println("1. Enter element at first position");
			System.out.println("2. Enter element at last position");
			System.out.println("3. Enter element at kth position");
			System.out.println("4. Delete element at first position");
			System.out.println("5. Delete element at last position");
			System.out.println("6. Delete element at kth position");
			System.out.println("7. Search element at kth position");
			System.out.println("8. Check if linked list is empty");
			System.out.println("9. Get Size of Linked list");
			System.out.println("10. Print elements of Linked list");
			System.out.println("11. Remove duplicates");
			Scanner sc = new Scanner(System.in);
			int index=sc.nextInt();
			switch(index)
			{
			case 1: System.out.println("enter the element you want to insert at first: ");
					list.insertAtFirst(sc.next());
					break;
					
			case 2: System.out.println("Enter the element you want to insert at last: ");
					list.insertAtLast(sc.next());
					break;
					
			case 3: System.out.println("Enter the element you want to insert: ");
					Object e=sc.next();
					System.out.println("Enter the position where you want to insert");
					int p=sc.nextInt();
					list.insertAtPosition(e,p);
					break;
			
			case 4: list.deleteFirst();
					System.out.println("First element deleted");
					break;
					
			case 5: list.deleteLast();
					System.out.println("Last element deleted");
					break;
					
			case 6: System.out.println("Enter the position where you want to delete element: ");
					list.deleteAtPosition(sc.nextInt());
					System.out.println("Element deleted");
					break;
					
			case 7: System.out.println("enter the element you want to search: ");
					list.search(sc.next());
					break;
					
			case 8: if(list.isEmpty())
					{
						System.out.println("Linked list is empty");
					}
					else
					{
						 System.out.println("Linked list is not empty");
					}
					break;
			
			case 9: int size=list.getSize();
					System.out.println("Size of Linkedlist is: "+size);
					break;
			
			case 10: System.out.println("Elements of linked list are");
					 list.getAllElements();
					 break;
					 
			case 11: list.checkDuplicates();
					 break;
					 
			default: System.out.println("Wrong entry");	 
			}
			
			System.out.println("do you want to continue?(y/n): ");
			c=sc.next().charAt(0);
		}while(c=='Y'||c=='y');
		System.out.println("Thank you!!");
	}

}
