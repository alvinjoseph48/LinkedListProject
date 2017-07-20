package model;


public class MasterLinkList {
	private MasterLink first;
	private MasterLink last;

	public MasterLinkList() {
		first = null;
		last = null;
	}

	public boolean add(String data) {
		MasterLink current = first;
		while (current != null) {
			if (current.getData().equals(data)) {
				return false;
			}
			current = current.getNextLink();
		}
		insertLast(data);
		return true;
	}

	public String getNextWord(String key) {
		MasterLink current = first;
		while (current != null) {
			if (current.getData().equals(key)) {
				return current.getBabyLinkList().getNextWord();
			}
			current = current.getNextLink();
		}
		return null;
	}

	public void addToFollowing(String key, String s) {
		MasterLink current = first;
		while (current != null) {
			if (current.getData().equals(key)) {
				current.getBabyLinkList().add(s);
			}
			current = current.getNextLink();
		}
	}

	public MasterLink find(String key) {
		MasterLink currentLink = first;
		while (!currentLink.getData().equals(key)) {
			if (currentLink.getNextLink() == null) {
				return null;
			}
			currentLink = currentLink.getNextLink();
		}
		return currentLink;
	}

	public void insertFirst(String s) {
		MasterLink newLink = new MasterLink(s);
		if (isEmpty()) {
			last = newLink;
		}
		newLink.setNextLink(first);
		first = newLink;
	}
	public void insertLast(String s) {
		MasterLink newLink = new MasterLink(s);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.setNextLink(newLink);
		}
		last = newLink;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public String peek() {
		return first.getData();
	}
	public void displayList() {
		MasterLink currentLink = first;
		while (currentLink != null) {
			currentLink.display();
			currentLink = currentLink.getNextLink();
		}
		System.out.println();
	}
	public void displayBabyList(){
		MasterLink currentLink = first;
		while(currentLink!= null){
			currentLink.getBabyLinkList().displayList();
			currentLink = currentLink.getNextLink();
		}
		System.out.println();
	}

	public MasterLink getFirst() {
		return first;
	}

	public void setFirst(MasterLink first) {
		this.first = first;
	}

	public MasterLink getLast() {
		return last;
	}

	public void setLast(MasterLink last) {
		this.last = last;
	}
	
	
}
