package day12;

import java.util.ArrayList;

public class Lisst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>  list=
					new ArrayList<>(); //숫자를 관리하는 리스트가 만들어진다
		//리스트 안에 값을 넣는 add,  put, set 세가지를 사용한다 list.( ) 
		list.add(10);
		list.add(15);
		list.add(20);
		
		System.out.println(list);
		list.add(1, 100);    //1번 자리에 숫자 100이 들어간다 
		System.out.println(list);
		
		int sum = 0 ;     //크기를 찾는다 size or lenght;
		for(int i = 0; i < list.size(); i++) {
			sum+= list.get(i) ; 
		}
	}

}
