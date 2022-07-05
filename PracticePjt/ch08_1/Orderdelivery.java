package ch08_1;

public class Orderdelivery {
	
	public String deliveryNum;
	public String phoneNum;
	public String address;
	public String date;
	public String clock;
	public int price;
	public String menuId;
	
	public void showOrderinfo() {
		System.out.println("주문 접수 번호: " + deliveryNum);
		System.out.println("주문 핸드폰 번호: " + phoneNum);
		System.out.println("주문 집 주소: " + address);
		System.out.println("주문 날짜: " + date );
		System.out.println("주문 가격: " + price);
		System.out.println("메뉴 번호: " + menuId );		
	}

}
