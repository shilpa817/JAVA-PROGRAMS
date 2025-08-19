package cseproject1;

public class Slinkedlist {
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node Head=null;
	void insertatfront(int value)
	{
		Node newNode=new Node(value);
		if(Head==null)
		{
		Head=newNode;
		}
		else
		{
			newNode.next=Head;
			Head=newNode;
		}
	}
	//void insertatmiddle()
	//{
		
	//}
	
	void insertatend(int value)
	{
		Node newNode=new Node(value);
		if(Head==null)
		{
			Head=newNode;
		}
		else
		{
			Node temp=Head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}
	void display()
	{
		Node temp=Head;
		while(temp!=null)
		{
			System.out.println(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}

	public static void main(String[] args) {
		Slinkedlist sll=new Slinkedlist();
		sll.insertatfront(10);
		sll.insertatfront(21);
		sll.insertatend(10);
		sll.insertatend(20);
		sll.display();
	}
}
