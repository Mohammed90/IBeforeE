import java.util.*;
import java.io.*;

public class IBeforeE {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("words.txt");
		Scanner in = new Scanner(file);
		String read = new String("");
		String ie = "ie";
		String cei = "cei";
		String ei = "ei";
		String cie = "cie";
		int countCEI = 0;
		int countIE = 0;
		int countEI = 0;
		int countCIE = 0;
		while(in.hasNextLine()){
			read = in.nextLine();
			if(read.length() > 2){
				if(read.contains(ei)){
					countEI++;
				}
				if(read.contains(ie)){
					countIE++;
				}
				if(read.contains(cei)){
					countCEI++;
				}
				if(read.contains(cie)){
					countCIE++;
				}
			}
		}
		in.close();
		System.out.println("IE: " + countIE);
		System.out.println("EI: " + countEI);
		System.out.println("CEI: " + countCEI);
		System.out.println("CIE: " + countCIE);

	}

}
