package com.cg.client;
import com.cg.model.*;
import com.cg.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends AthleteServiceImpl {
	
	public static void main(String args[]) {
		AthleteServiceImpl as = new AthleteServiceImpl();
		List<Athlete> athletes = new ArrayList<Athlete>();
		
		Athlete a1=new Athlete(101, "Arun", "Male", "shankar69great@gmail.com", 9876543454L);
		
		//adding elements to arrayList
		as.addAthelete(athletes,a1);
		as.addAthelete(athletes,new Athlete(102,"Bindhu", "Female", "bindhu@gmail.com", 76543454567L) );
		as.addAthelete(athletes,new Athlete(103, "Cathrene", "Female", "cathrene@gmail.com", 76543454567L));
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter athleteId:");
		int aId = sc.nextInt();
		
		
		//getting details of specific athlete
		as.searchAthlete(athletes,aId );
		
		
		//displaying all the elements of arraylist
		as.displayAllAthlete(athletes);
		
		
		
		
		
		
		
		
	}

	

}
