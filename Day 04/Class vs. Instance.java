public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if (initialAge < 0){
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
        else {
            this.age = initialAge;
        }
        
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String ageCondition = "";
        if (age >= 18){
            ageCondition = "You are old.";
        }
        else if (age >= 13){
            ageCondition = "You are a teenager.";
        }
        else{
            ageCondition = "You are young.";
        }
        System.out.println(ageCondition);
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age++;
	}
