package com.cg.service;
import java.util.List;

import com.cg.client.*;
import com.cg.model.Athlete;


public class AthleteServiceImpl implements AthleteService  {
	
@Override
	public void addAthelete(List<Athlete> athletes,Athlete athlete) {
		athletes.add(athlete);
		
	}

	@Override
	public Athlete searchAthlete(List<Athlete> athletes,int athleteId) {
		// TODO Auto-generated method stub
		
		int flag=0;
		for(Athlete a:athletes) {
			if(a.getAtheleteId() == athleteId) {
				flag=1;
				System.out.println(a);
			}
		}
		if(flag==0) {
			System.out.println("Athlete with id" + athleteId +"does not exist" );
		}
		return null;
	}

	@Override
	public void displayAllAthlete(List<Athlete> athletes) {
		// TODO Auto-generated method stub
		System.out.println(athletes);
		
	}

	

}
