import java.util.*;
class Item{
	Integer item_id;
	String item_name;
	Item(int item_id,String item_name  ){
		this.item_name=item_name;
		this.item_id=item_id;
	}
	Item(){}
	void setitem_id(int item_id){
		this.item_id=item_id;
	}
	void setitem_name(String item_name){
		this.item_name=item_name;
	}
	public String toString(){
		return this.item_id+" "+this.item_name;
	}
	@Override
	public boolean equals(Object o){
		if(o instanceof Item){
				Item temp= (Item) o;
				if(this.item_id.equals(temp.item_id) && (this.item_name.equals(temp.item_name) )){
					return true;
				}
			}
		return false;
	}
	@Override
	public int hashCode(){
		//System.out.println("hashCode invoked!!");
		int prime = 13;
		int val = 1;
		val = val*prime + this.item_id.hashCode();
		val = val*prime + this.item_name.hashCode();
		return val;
		//return 40;
	}
	
}
class namesort implements Comparator<Item>{
	public int compare(Item I1,Item I2){
		return I1.item_name.compareTo(I2.item_name);
	}
}
class idsort implements Comparator<Item>{
	public int compare(Item I1,Item I2){
		return I1.item_id-(I2.item_id);
	}
}




class Inventory{
	static Item I=new Item();
	static ArrayList<Item> list=new ArrayList<> ();
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice;
		Item I1=new Item(1,"A");
		Item I2=new Item(3,"R");
		Item I3=new Item(2,"Z");
		Item I4=new Item(4,"H");
		Item I5=new Item(10,"M");
		list.add(I1);
		list.add(I2);
		list.add(I3);
		list.add(I4);
		list.add(I5);
		do{
		System.out.println("Enter your choice ==");
	    System.out.println("1) Add Item.\n2) Display complete inventory in sorted order of item names as well as item_id.\n3) Remove Item.\n4) Exit");
		
		 choice=sc.nextInt();
		switch(choice){
			case 1:
					System.out.println("Enter your details  as follows");
					System.out.println("Enter Item you want add");
					//int n=sc.nextInt();
					
					for(int i=1;i<=1;i++){
						System.out.println("Enter id of item ");
						int d=sc.nextInt();
						I.setitem_id(d);
						System.out.println("Enter name of item ");
						sc.nextLine();
						String ss=sc.nextLine();
						I.setitem_name(ss);
						if (!list.contains(I)){
						list.add(I);}
	
					}
					System.out.println("Added items  as follows");
					System.out.println(list);
						break;
				case 2:
						System.out.println("before sorting");
						System.out.println(list);
						System.out.println("Sorting by id");
						idsort n2=new idsort();
						Collections.sort(list,n2);
						System.out.println(list);
						System.out.println("Sorting by name");
						namesort n1=new namesort();
						Collections.sort(list,n1);
						System.out.println(list);
						break;
				case 3:
						System.out.println("List as follows");
						System.out.println(list);
						System.out.println("Enter index od item which you want to remove index start from 0");
						int re=sc.nextInt();
						list.remove(re);
						System.out.println("List after removal");
						System.out.println(list);
						break;
				case 4:
						System.out.println("Thank you");
						break;			
		}
		}while(choice!=4);
		

	}
	
}