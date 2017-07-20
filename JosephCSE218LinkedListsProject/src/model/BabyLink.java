package model;


public class BabyLink {
	private String iData;
	private BabyLink nextLink;

	public BabyLink(String iData) {
		this.iData = iData;
	}

	public void displayLink() {
		System.out.print(iData + " ");
	}

	public String getiData() {
		return iData;
	}

	public void setiData(String iData) {
		this.iData = iData;
	}

	public BabyLink getNext() {
		return nextLink;
	}

	public void setNext(BabyLink first) {
		this.nextLink = first;
	}

	public BabyLink getLink() {
		return nextLink;
	}

	public void display() {
		System.out.println(iData + " ");
	}
}
