package model;

public class BabyLinkList {
	private BabyLink first;
	private BabyLink last;
	private int counter;

	public BabyLinkList() {
		first = null;
		last = null;
		counter = 0;
	}

	public void add(String s) {
		BabyLink newLink = new BabyLink(s);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.setNext(newLink);
		}
		last = newLink;
		counter++;
	}

	public String getNextWord() {
		int number = (int) (Math.random() * counter);
		BabyLink current = first;
		for (int i = 0; i < number; i++) {
			current = current.getNext();
		}
		return current.getiData();
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int getCounter() {
		return counter;
	}
	public void displayList() {
		BabyLink currentLink = first;
		while (currentLink != null) {
			currentLink.display();
			currentLink = currentLink.getNext();
		}
		System.out.println();
	}

	public BabyLink getFirst() {
		return first;
	}
	

}
