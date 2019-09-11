package ArrayListPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator; 
public class ArrayLTest {

	public static void main(String[] args) {
		
		List<Integer>  li = new ArrayList<>();  
       
        li.add(22);  
        li.add(44);  
        li.add(88);  
        li.add(11);  
        li.add(33);  
        
        ListIterator<Integer> itr = null;  
        itr = li.listIterator();  
        System.out.println("In actual order :");  
        
        while (itr.hasNext()) {  
              System.out.println(itr.next());  
          }  
        System.out.println("In reverse order :");  
         
        
        while (itr.hasPrevious()) {  
              System.out.println(""+itr.previous());  
       }  		
		
		
		/*ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(15);
		al.add(17);
		System.out.println(al);*/
		List<Integer> li1 = new ArrayList<>();
		
		li1.add(1);  
        li1.add(2);  
        li1.add(3);  
        li1.add(4);  
        li1.add(6);  
		
		//al.addAll(0,l);
		//System.out.println(al);
		//System.out.println("size"+al.size());
		/*Iterator i= l.iterator();
		while(i.hasNext()) {
			System.out.println("next: "+i.next());
		}*/
	 
        ListIterator<Integer> it = null; 
		it = li1.listIterator();
		
        System.out.println("B -----  In actual order :");  
        
        while (it.hasNext()) {  
              System.out.println(it.next());  
          } 
		
		while(it.hasPrevious()) {
			System.out.println("B -----  Previous"+it.previous());
		}
       //------------------------------------------------- 
        /*List<Integer>  l2 = new ArrayList<>();  
        
        l2.add(22);  
        l2.add(44);  
        l2.add(88);  
        l2.add(11);  
        l2.add(33);  
        
        ListIterator<Integer> itr1 = null;  
        itr1 = l2.listIterator();  
        System.out.println("In actual order :");  
        
        while (itr1.hasNext()) {  
              System.out.println(itr1.next());  
          }  
        System.out.println("In reverse order :");  
         
        
        while (itr1.hasPrevious()) {  
              System.out.println(""+itr1.previous());  
       }  		*/
		
		
		
	}

}
