package com.marlabs.day1.constructors;

public class ThisDemo {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		MarlabsTraineeAssociate traineeAssociate = new MarlabsTraineeAssociate(
				2001, "Vasu", "Java", "NJ", "NY", "NY");
		System.out.println(traineeAssociate.toString());

		MarlabsTraineeAssociate traineeAssociate2 = new MarlabsTraineeAssociate(
				3001, "Srini", "Java&UI", "NJ");
		System.out.println(traineeAssociate2);
		System.out.println("End Of Main Method");
	}
}
