// Node in a linked list contains data and a link to the next node
public class Node {
	Object data;
	Node node;
	Node link;

	public Node(Object d) {
		// TODO Auto-generated constructor stub
		data=d;
	}
	public Node(Object d, Node l){
		data=d;
		link=l;
	}
	public Object getdata(){
		return data;
	}
	public Node getlink(){
		return link;
	}
	public void setlink(Node linkNode){
		link=linkNode;
	}
}
