package UMLPrac;

import java.util.ArrayList;

public class JustPrac {
	
	ArrayList<String> list = new ArrayList<>();
	
	String str = new String("¡§¿Œº∑");
	
	public void add(){
		
		list.add(str);
		list.add(str);
		list.add(str);		
	}
	
	public void print(){
		for(String str : list){
			System.out.println(str);
		}
	}

}
