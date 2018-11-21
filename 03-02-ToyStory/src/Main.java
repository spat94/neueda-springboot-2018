import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Toy woody = new Toy("Woody", "Tom", "Hanks");
		Toy buzz = new Toy("Buzz", "Tim", "Allen");
		Toy slinky = new Toy("Slinky", "Jim", "Varney");
		Toy hamm = new Toy("Hamm", "John", "Ratzenberger");
		Toy rex = new Toy("Rex", "Wallace", "Shawn");
		Toy mrpotatohead = new Toy("Mr Potato Head", "Don", "Rickles");

		ArrayList<Toy> toys = new ArrayList<Toy>();
		toys.add(woody);
		toys.add(buzz);
		toys.add(slinky);
		toys.add(hamm);
		toys.add(rex);
		toys.add(mrpotatohead);
		
		for(Toy toy:toys)
		{
			System.out.println(toy.getName() +"; "+ toy.getActfname() +" "+ toy.getActsname());
		}
	}

}
