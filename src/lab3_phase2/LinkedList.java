package lab3_phase2;

public class LinkedList {
	private ListElement first;
	private ListElement last;
	private ListElement tail;
	
	public void addElement(ListElement le)
	{
		if (first != null)
		{
			le.setNext(first);
			first.setPrevous(le);
			first = le;
		}
		else
		{
			le.setNext(first);
			first = le;
			last = le;
		}
	}
	public ListElement getElement(int index)
	{
		ListElement temp = first;
		while (temp != null)
		{
			if (temp.getData() == index)
			{
				break;
			}
			else
			{
				temp = temp.getNext();
			}
		}
		
		return temp;
		
	}
	
	public ListElement deleteElement(int index)
	{
		ListElement tempCurrent = first;
		ListElement tempPrevious = first;
		while (tempCurrent.getData() != index)
		{
			if (tempCurrent.getNext() == null)
			{
				return null;
			}
			else
			{
				tempPrevious = tempCurrent;
				tempCurrent = tempCurrent.getNext();
			}
		}
		if (tempCurrent != first)
		{
			tempPrevious.setNext(tempCurrent.getNext());
			tempCurrent.getNext().setPrevous(tempPrevious);
		}
		else
		{
			first = first.getNext();
			tempCurrent = first;
			tempCurrent.setPrevous(null);

			
		}
		
		return tempCurrent;
	}
	

	
	public void printLinkedListTail()
	{
		ListElement temp = last;
		while (temp != null)
		{
			temp.display();
			temp = temp.getPrevious();
		}
	}
	
	public void printLinkedListHead()
	{
		ListElement temp = first;
		while (temp != null)
		{
			temp.display();
			temp = temp.getNext();
		}
	}
	
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		ListElement le = new ListElement(5);
		ListElement sample1 = new ListElement(1);
		ListElement sample2 = new ListElement(2);
		ListElement sample3 = new ListElement(3);
		list.addElement(le);
		list.addElement(sample1);
		list.addElement(sample2);
		list.addElement(sample3);
		list.printLinkedListTail();
		System.out.println();
		
		list.printLinkedListHead();
		System.out.println();
		
		list.getElement(3);
		list.deleteElement(2);
		list.printLinkedListTail();
		System.out.println();
		
		list.printLinkedListHead();
		System.out.println();
	}

}
