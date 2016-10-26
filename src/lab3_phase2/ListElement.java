package lab3_phase2;

public class ListElement {
		private ListElement next;
		private ListElement previous;
		private int data;
		
		public ListElement(int data)
		{
			this.data = data;
			this.next = null;
			this.previous = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
		public void setNext(ListElement  next)
		{
			this.next = next;
		}
		public ListElement getNext()
		{
			return next;
		}
		
		public void setPrevous (ListElement previous)
		{
			this.previous = previous;
		}
		public ListElement getPrevious()
		{
			return previous;
		}
		 
		public void display(){ 
	     	System.out.print(this.data); 
		} 

		
		
		
}
