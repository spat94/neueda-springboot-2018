package uk.ac.belfastmet.movies.service;

import java.util.ArrayList;

import uk.ac.belfastmet.movies.domain.Chars;


public class CharService {
	
	
	public CharService()
	{
		super();
	}

	public ArrayList<Chars> getShrekChars() 
	
	{
		ArrayList<Chars> chars = new ArrayList<Chars>();
		Chars shrek = new Chars("Shrek", "Shrek", "shrek.png");
		chars.add(shrek);
		Chars donkey = new Chars("Donkey", "Shrek", "donkey.png");
		chars.add(donkey);
		Chars fiona = new Chars("Princess Fiona", "Shrek", "fiona.png");
		chars.add(fiona);
		Chars ginger = new Chars("Gingerbread Man", "Shrek", "ginger.png");
		chars.add(ginger);
		Chars dragon = new Chars("Dragon", "Shrek", "dragon.png");
		chars.add(dragon);
		
		return chars;
	}
	
	public ArrayList<Chars> getToyStoryChars()
	
	{
		ArrayList<Chars> chars = new ArrayList<Chars>();
		Chars woody = new Chars("Woody", "Toy Story", "woody.png");
		chars.add(woody);
		Chars buzz = new Chars("Buzz", "Toy Story", "Buzz.png");
		chars.add(buzz);
		Chars slinky = new Chars("Slinky", "Toy Story", "slinky.png");
		chars.add(slinky);
		Chars hamm = new Chars("Hamm", "Toy Story", "hamm.png");
		chars.add(hamm);
		Chars bopeep = new Chars("Bopeep", "Toy Story", "bopeep.png");
		chars.add(bopeep);
		return chars;
	}
	
}
