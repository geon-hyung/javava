package day9;

public class IPTV extends TvMain{
	String ip;
	IPTV (String ip, int size, int color){
//		super(size,color); 
		this.ip = ip;
	}
     void printProperty() {
//    	 결과 : 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
    	 System.out.print("나의 IPTV는" +ip + "주소의");
//     super.printProperty(); //32인치와 2048컬러는 부모에게 있는걸 가져와서 사용한다.
     }

}
