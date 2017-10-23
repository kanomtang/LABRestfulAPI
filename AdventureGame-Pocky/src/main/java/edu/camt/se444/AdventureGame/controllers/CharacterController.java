package edu.camt.se444.AdventureGame.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.camt.se444.AdventurGame.services.ToonService;
import edu.camt.se444.AdventureGame.model.*;
import edu.camt.se444.AdventureGame.model.Character;
@RestController
public class CharacterController {

	
		
		ToonService toonservice ;
		private static ArrayList<Character> characterList; 
		@Autowired
		public void setToonList(ToonService toonServiceParam){
			this.toonservice = toonServiceParam;
		}
		
	
		@RequestMapping("/characters")
		public ArrayList<Character> getAllToon(){
			characterList = toonservice.getEntireCharacter();
			return toonservice.getEntireCharacter(); 
		}

	
		@RequestMapping("/characters/{id}")
		public String getByID (@PathVariable String id){
			String Result="";
			for(Character a:characterList) {
				if(a.getName().equals(id)){
					return Result = id;
				}
			}
			return Result;
 
		}
		
		@RequestMapping("/characters/addNewCharacter")
		public boolean AddnewPlayer(){
			
			return toonservice.AddnewPlayer(); 
		}
 
}
	

