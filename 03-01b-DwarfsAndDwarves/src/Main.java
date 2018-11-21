import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		sleepy.setImage("sleepy.png");
		
		Dwarf happy = new Dwarf();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		happy.setImage("happy.png");
		
		Dwarf dopey = new Dwarf();
		dopey.setName("Dopey");
		dopey.setAuthor("Disney");
		dopey.setImage("dopey.png");
		
		Dwarf bashful = new Dwarf();
		bashful.setName("Bashful");
		bashful.setAuthor("Disney");
		bashful.setImage("bashful.png");
		
		Dwarf grumpy = new Dwarf();
		grumpy.setName("Grumpy");
		grumpy.setAuthor("Disney");
		grumpy.setImage("grumpy.png");
		
		Dwarf doc = new Dwarf();
		doc.setName("Doc");
		doc.setAuthor("Disney");
		doc.setImage("doc.png");
		
		Dwarf sneezy = new Dwarf();
		sneezy.setName("Sneezy");
		sneezy.setAuthor("Disney");
		sneezy.setImage("sneezy.png");
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		dwarfs.add(sleepy);
		dwarfs.add(happy);
		dwarfs.add(dopey);
		dwarfs.add(bashful);
		dwarfs.add(grumpy);
		dwarfs.add(doc);
		dwarfs.add(sneezy);
		
		for(Dwarf dwarf:dwarfs)
		{
			System.out.println(dwarf.getName());
		}
		
		Dwarf thorin = new Dwarf("Thorin", "Tolkein", "thorin.png");
		Dwarf balin = new Dwarf("Balin", "Tolkein", "balin.png");
		Dwarf kili = new Dwarf("Kili", "Tolkein", "kili.png");
		Dwarf fili = new Dwarf("Fili", "Tolkein", "fili.png");
		Dwarf dori = new Dwarf("Dori", "Tolkein", "dori.png");
		Dwarf nori = new Dwarf("Nori", "Tolkein", "nori.png");
		Dwarf ori = new Dwarf("Ori", "Tolkein", "ori.png");
		Dwarf oin = new Dwarf("Oin", "Tolkein", "oin.png");
		Dwarf gloin = new Dwarf("Gloin", "Tolkein", "gloin.png");
		Dwarf bifur = new Dwarf("Bifur", "Tolkein", "bifur.png");
		Dwarf bofur = new Dwarf("Bofur", "Tolkein", "bofur.png");
		Dwarf bombur = new Dwarf("Bombur", "Tolkein", "bombur.png");
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkein", "dwalin.png");
		
		dwarfs.add(thorin);
		dwarfs.add(balin);
		dwarfs.add(kili);
		dwarfs.add(fili);
		dwarfs.add(dori);
		dwarfs.add(nori);
		dwarfs.add(ori);
		dwarfs.add(oin);
		dwarfs.add(gloin);
		dwarfs.add(bifur);
		dwarfs.add(bofur);
		dwarfs.add(bombur);
		dwarfs.add(dwalin);
	
	}
	//Dwalin, Balin, Kili, Fili, Dori, Nori, Ori, Oin, Gloin, Bifur, Bofur, Bombur, Thorin
}
