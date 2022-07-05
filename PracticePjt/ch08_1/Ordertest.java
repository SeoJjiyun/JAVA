package ch08_1;

public class Ordertest {

	public static void main(String[] args) {
		
		Orderdelivery orderDel = new Orderdelivery();
		orderDel.deliveryNum = "202011020003";
		orderDel.phoneNum = "0102345001";
		orderDel.address = "서울시 강남구 역삼동 111-333";
		orderDel.date = "20201102";
		orderDel.clock = "130258";
		orderDel.price = 35000;
		orderDel.menuId = "0003";
		
		orderDel.showOrderinfo();
	}

}
