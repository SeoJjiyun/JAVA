package gradeprogramwithoutinterface;

import java.util.ArrayList;

public class Subject {
	
	private String sbName;
	private int sbId;
	private ArrayList<Student> StdArray = new ArrayList<>();
	
	public Subject(String sbName,int sbId) {
		this.sbName = sbName;
		this.sbId = sbId;
	}
	
	public String getSbName() {
		return sbName;
	}

	public void setSbName(String sbName) {
		this.sbName = sbName;
	}
	
	public int getSbId() {
		return sbId;
	}

	public void setSbId(int sbId) {
		this.sbId = sbId;
	}

	public ArrayList<Student> getStdArray() {
		return StdArray;
	}

	public void setStdArray(ArrayList<Student> StdArray) {
		this.StdArray = StdArray;
	}

	public void showTitleinfo() {
		System.out.println("-----------------------------------");
		System.out.println("\t" + sbName + " ������  ����");
		System.out.println("�̸� |  �й�  |��������| ���� ");	
		System.out.println("-----------------------------------");
	}
}
