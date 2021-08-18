package mathop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class NumberPlayList {
	public static void main(String[] args) {
		
		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int i = 0; i < 5 ; i++) myNumberList.add(i);
		
		//Traversing through Iterator
		Iterator<Integer> itr = myNumberList.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println("Method 1: Interator Value:: " +i);
		}
		
		//Traversing through Consumer Interface implementing for each loop
		class MyConsumer implements Consumer<Integer> {
			public void accept(Integer input) {
				System.out.println("Methos 2: Consumer impl Value ::" + input);
			}
		}
		
		MyConsumer action = new MyConsumer();
		myNumberList.forEach(action);
		
		
		//Traversing through Anonymous Consumer Interface
		myNumberList.forEach(new Consumer<Integer>(){
			public void accept(Integer input) {
				System.out.println("Method 3 : ForEach anonymous class Value::" +input);
				
			}
		});
		
		//Explicit Lambda Function
		Consumer<Integer> myListAction = n ->{
			System.out.println("Method4: forEach Lambda impl Value::" + n);
			
		};
		myNumberList.forEach(myListAction);
		
		//Method 5 Implicit Lambda Function
		myNumberList.forEach(n -> {
			System.out.println("Method 5 : forEach Lamda impl Value ::" + n);
		});
	}

}
