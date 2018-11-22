public class List
{
      Node head;
	  class Node
	  {
	        int data;
			Node next;
			public Node(int data)
			{
				this.data=data;
			}
	  }
	  public void append(int data)
	  {
	       Node new_node=new Node(data);
		   new_node.next=null;
		   if(head==null)
		   {
		       head=new_node;
		   }
		   else
		   {
		       new_node.next=head;
			   head=new_node;
		   }
	  }
	  public void nth(int n)
	  {
			Node f=head;
			Node s=head;
			while(n>=1)
			{
			    f=f.next;
				n--;
		    }
			while(f!=null)
			{
			    f=f.next;
				s=s.next;
		    }
			System.out.println(s.data);
	  }
	  public void print()
	  {
	       Node p=head;
		   while(p!=null)
		   {
		       System.out.println(p.data+" ");
			   p=p.next;
		   }
	  }
	  public void even_odd()
	  {
			Node end=head;
			while(end.next!=null)
			{
					end=end.next;
			}
			Node new_end=end;
			while(head.data%2!=0&&head!=end)
			{
				Node r=head;
				head=head.next;
				end.next=r;
				r.next=null;
				end=r;
			}
			if(head.data%2==0)
			{
				Node prev=head;
                Node cur=head.next;
                while(prev!=new_end)
                {
					if(cur.data%2!=0)
					{
						prev.next=cur.next;
						end.next=cur;
						cur.next=null;
						end=cur;
						cur=prev.next;
					}else
					{
					    prev=cur;
						cur=cur.next;
					}
                }				
			}
	  }
	  public void reverse()
	  {
			Node prev=null;
			Node cur=head;
			Node nex=cur.next;
			while(nex!=null)
			{
				cur.next=prev;
				prev=cur;
				cur=nex;
				nex=nex.next;
			}
			cur.next=prev;
			head=cur;
	  }
	  public static void main(String args[])
	  {
	        List l=new List();
			l.append(6);
			l.append(5);
			l.append(4);
			l.append(3);
			l.append(2);
			l.append(1);
			l.print();
			//l.nth(5);
			//l.even_odd();
			l.reverse();
			l.print();
	  }
}