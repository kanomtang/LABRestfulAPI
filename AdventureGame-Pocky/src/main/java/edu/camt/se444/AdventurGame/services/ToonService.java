package edu.camt.se444.AdventurGame.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.camt.se444.AdventureGame.model.Character;

@Service
public class ToonService {

	Character character;
	private static ArrayList<Character> instance;

	// singleton method

	public String getId() {

		return this.character.getName();

	}

	public ArrayList<Character> getEntireCharacter() {

		if (instance == null) {
			instance = new ArrayList<Character>();
			Character newplayer1 = new Character();
			newplayer1.setName("Ken");
			newplayer1.setLevel(20);
			Character newplayer2 = new Character();
			newplayer2.setName("Ryu");
			newplayer2.setLevel(20);
			instance.add(newplayer1);
			instance.add(newplayer2);
		}

		return instance;
	}
	public boolean AddnewPlayer(){
		try{
		Character newplayer = new Character();
		instance.add(newplayer);
		return true;	
		}catch(Exception e){
			System.out.println("This is log of error "+ e);
			return false;	
		}
		
	}
}
