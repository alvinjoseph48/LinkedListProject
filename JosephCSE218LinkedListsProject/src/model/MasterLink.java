package model;

public class MasterLink {
	private String data;
	private MasterLink nextLink;
	private BabyLinkList babyLinkList;

	public MasterLink(String data) {
		this.data = data;
		this.babyLinkList = new BabyLinkList();
	}

	public BabyLinkList getBabyLinkList() {
		return babyLinkList;
	}

	public void setBabyLinkList(BabyLinkList babyLinkList) {
		this.babyLinkList = babyLinkList;
	}

	public String getData() {
		return data;
	}

	public MasterLink getNextLink() {
		return nextLink;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setNextLink(MasterLink nextLink) {
		this.nextLink = nextLink;
	}

	public void display() {
		System.out.print(data + " ");
	}

	@Override
	public String toString() {
		return "Link [data=" + data + ", nextLink=" + nextLink + "]";
	}

}
