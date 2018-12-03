package uk.ac.belfastmet.dwarf.service;

import java.util.ArrayList;

import uk.ac.belfastmet.dwarf.domain.Dwarf;

public class DwarfService {

	
	public DwarfService()
	{
		super();
	}
	
	public ArrayList<Dwarf> getDisneyDwarfs()
	
	{	
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "sleepy.png");
		dwarfs.add(sleepy);
		Dwarf happy = new Dwarf("Happy", "Disney", "happy.png");
		dwarfs.add(happy);		
		Dwarf bashful = new Dwarf("Bashful", "Disney", "bashful.png");
		dwarfs.add(bashful);		
		Dwarf dopey = new Dwarf("Dopey", "Disney", "dopey.png");
		dwarfs.add(dopey);		
		Dwarf doc = new Dwarf("Doc", "Disney", "doc.png");
		dwarfs.add(doc);		
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", "sneezy.png");
		dwarfs.add(sneezy);		
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "grumpy.png");
		dwarfs.add(grumpy);
		
		return dwarfs;
	}
	
	public ArrayList<Dwarf> getTolkienDwarfs()
	
	{
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		Dwarf thorin = new Dwarf("Thorin", "Tolkien", "thorin.png");
		dwarfs.add(thorin);
		Dwarf balin = new Dwarf("Balin", "Tolkien", "balin.png");
		dwarfs.add(balin);		
		Dwarf kili = new Dwarf("Kili", "Tolkien", "kili.png");
		dwarfs.add(kili);		
		Dwarf fili = new Dwarf("Fili", "Tolkien", "fili.png");
		dwarfs.add(fili);		
		Dwarf dori = new Dwarf("Dori", "Tolkien", "dori.png");
		dwarfs.add(dori);		
		Dwarf nori = new Dwarf("Nori", "Tolkien", "nori.png");
		dwarfs.add(nori);		
		Dwarf ori = new Dwarf("Ori", "Tolkien", "ori.png");
		dwarfs.add(ori);		
		Dwarf oin = new Dwarf("Oin", "Tolkien", "oin.png");
		dwarfs.add(oin);		
		Dwarf gloin = new Dwarf("Gloin", "Tolkien", "gloin.png");
		dwarfs.add(gloin);		
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", "bifur.png");
		dwarfs.add(bifur);	
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "bofur.png");
		dwarfs.add(bofur);		
		Dwarf bombur = new Dwarf("Bombur", "Tolkien", "bombur.png");
		dwarfs.add(bombur);		
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "dwalin.png");
		dwarfs.add(dwalin);
		
		return dwarfs;
	}
}
