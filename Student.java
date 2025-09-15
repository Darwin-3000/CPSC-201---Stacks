public class Student {
    private String firstName;
    private String lastName;
    private String major;

    // Constructor
    public Student(String firstName, String lastName, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;



    }

    public String toString(){

        return firstName + " " + lastName+"(" +major +") ";

    }
}

