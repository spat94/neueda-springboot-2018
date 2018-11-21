import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<String> dwarfs = new ArrayList<String>();
		dwarfs.add("Doc");
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Grumpy");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Dopey");
		
		System.out.println("The Disney Dwarfs Are:");
		for(String dwarf:dwarfs) 
		{
			System.out.println(dwarf);
		}
		
		ArrayList<String> dwarves = new ArrayList<String>();
		dwarves.add("Thorin");
		dwarves.add("Fili");
		dwarves.add("Kili");
		dwarves.add("Oin");
		dwarves.add("Gloin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Ori");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");

		System.out.println("\nThe Tolkien Dwarves Are:");
		for(String dwarf:dwarves) 
		{
			System.out.println(dwarf);
		}
		
	}

}
