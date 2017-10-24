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

	// get id
	public String getId() {

		return this.character.getName();

	}

	// singleton method
	// Get all character
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

	// Add new character with default attribute
	public boolean AddnewPlayer() {
		try {
			Character newplayer = new Character();
			instance.add(newplayer);
			return true;
		} catch (Exception e) {
			System.out.println("This is log of error " + e);
			return false;
		}

	}

	// Update the existing character
	public boolean UpdateCharacter(String nameOfCharacter, Character c) {

		try {
			for (Character a : ToonService.instance) {
				if (a.getName().equals(nameOfCharacter)) {
					a.setName(c.getName());
					a.setLevel(c.getLevel());
					a.setExperience(c.getExperience());
					a.setHealth(c.getHealth());
					return true;
				}
			}
			return false;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("This is log of error " + e);
			return false;
		}

	}

	// Delete existing character
	public boolean DeleteCharacter(String nameOfcharacter) {
		try {
			for (Character a : instance) {
				if (a.getName().equals(nameOfcharacter)) {
					instance.remove(a);
					return true;
				}
			
		}return false;
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println("This is log of error " + e);
			return false;
		}
		
		

	}
}

