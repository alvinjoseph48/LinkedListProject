package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Generate {
	private MasterLinkList masterLinkList;

	private int counter;
	private String lyrics;

	public Generate() {
		masterLinkList = new MasterLinkList();
		counter = 0;
	}

	public void readFile(File file) throws FileNotFoundException {
		String previous;
		String current;
		Scanner in = new Scanner(file);
		previous = in.next();
		masterLinkList.add(previous);

		while (in.hasNext()) {
			current = in.next();
			masterLinkList.add(current);
			masterLinkList.addToFollowing(previous, current);
			previous = current;
		}
		masterLinkList.displayList();
		masterLinkList.displayBabyList();
		System.out.println(counter);

	}

	public void writeFile() {
		try {
			PrintWriter pw = new PrintWriter("output/output.txt");
			pw.write(lyrics);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public boolean generateLyrics(String string) {

		MasterLink currentLink = masterLinkList.find(string);
		if (currentLink == null) {
			return false;
		}
		String babyLinkWord = null;
		lyrics = currentLink.getData() + " ";
		counter--;
		for (int i = 0; i < counter; i++) {
			babyLinkWord = masterLinkList.getNextWord(currentLink.getData());
			lyrics += babyLinkWord + " ";
			currentLink = masterLinkList.find(babyLinkWord);
		}
		return true;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
