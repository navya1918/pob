package com.cg.client;
import java.util.List;

import com.cg.model.*;

public interface AthleteService {
	public void addAthelete(List<Athlete> athletes,Athlete athlete);
	public Athlete searchAthlete(List<Athlete> athletes,int athleteId);
	public void displayAllAthlete(List<Athlete> Athletes);
	

}
