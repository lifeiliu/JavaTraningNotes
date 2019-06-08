package com.marlabs.day1.constructors;

public class MarlabsTraineeAssociate {
	int traineeId;
	String traineeName;
	String traininedOn;
	String trainingLocation;
	String preferredLocation;
	String depolyedLocation;

	public MarlabsTraineeAssociate() {
		System.out.println("I Am From Default Cons");
		preferredLocation = "London";
		depolyedLocation = "NJ";
	}

	/**
	 * @param traineeId
	 * @param traineeName
	 * @param traininedOn
	 * @param trainingLocation
	 */
	public MarlabsTraineeAssociate(int traineeId, String traineeName,
			String traininedOn, String trainingLocation) {
		this();// this at constructor level
		System.out.println("I Am From 4 Params Cons");
		this.traineeId = traineeId; // this at variable level
		this.traineeName = traineeName;
		this.traininedOn = traininedOn;
		this.trainingLocation = trainingLocation;
		// this.display(); this at Method Level
		// display();
	}

	public MarlabsTraineeAssociate display() {
		// this as Method argument
		System.out.println(this);// this represents current Object
		return this; // this as Method return Type
	}

	/**
	 * @param traineeId
	 * @param traineeName
	 * @param traininedOn
	 * @param trainingLocation
	 * @param preferredLocation
	 * @param depolyedLocation
	 */
	public MarlabsTraineeAssociate(int traineeId, String traineeName,
			String traininedOn, String trainingLocation,
			String preferredLocation, String depolyedLocation) {
		// this(traineeId, traineeName, traininedOn, trainingLocation);
		System.out.println("I Am From All Params Cons");
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traininedOn = traininedOn;
		this.trainingLocation = trainingLocation;
		this.preferredLocation = preferredLocation;
		this.depolyedLocation = depolyedLocation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MarlabsTraineeAssociate [traineeId=" + traineeId
				+ ", traineeName=" + traineeName + ", traininedOn="
				+ traininedOn + ", trainingLocation=" + trainingLocation
				+ ", preferredLocation=" + preferredLocation
				+ ", depolyedLocation=" + depolyedLocation + "]";
	}

}
