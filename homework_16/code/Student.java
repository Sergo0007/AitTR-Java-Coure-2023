public class Student {
    //поля
    private int id;
    private String firstName;
    private String lastname;
    private int yearOfBirth;
    private String specialization;

    public Student(int id, String firstName, String lastname, int yearOfBirth, String specialization) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void display() {
        System.out.println("ID: " + id + ", FirstName: " + firstName + ", Lastname: " + lastname +
                ", Year of birth: " + yearOfBirth + ", Specialization: " + specialization);


    }

    public void study() {
        System.out.println("I'm learning");
    }

    public void indicator() {
        System.out.println("I'm excellent student");
    }

    public void beginning() {
        System.out.println("I'm starting to learn");
    }

    public void best() {
        System.out.println("I will get a red diploma");
    }
}

