class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int average = 0;
        for(int i = 0; i < testScores.length; i++){
            average += testScores[i];
        }
        average = average / testScores.length;

        if(average >= 90) {
            return 'O'; // Outstanding
        }
        else if(average >= 80) {
            return 'E'; // Exceeds Expectations
        }
        else if(average >= 70) {
            return 'A'; // Acceptable
        }
        else if(average >= 55) {
            return 'P'; // Poor
        }
        else if(average >= 40) {
            return 'D'; // Dreadful
        }
        else {
            return 'T'; // Troll
        }
    }
}
