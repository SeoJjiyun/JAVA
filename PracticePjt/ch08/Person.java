package ch08;

public class Person {
	
	public int height;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	public void showinfo()
	{
		System.out.println("키가" + height + "이고, 몸무게가" + weight +"킬로인 " + gender + "가 있습니다." );
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "세 입니다.");
	}
}
