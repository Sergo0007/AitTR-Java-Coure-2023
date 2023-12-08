package hw_59;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private int britDay;
    private String gender;
    private String country;
    private int course;
    private int groupNum;

    public Student(long id, String firstName, String lastName, int age, int britDay, String gender, String country, int course, int groupNum) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.britDay = britDay;
        this.gender = gender;
        this.country = country;
        this.course = course;
        this.groupNum = groupNum;
    }

    public long getId() {
        return id;


    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBritDay() {
        return britDay;
    }

    public void setBritDay(int britDay) {
        this.britDay = britDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", britDay='" + britDay + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", course=" + course +
                ", groupNum=" + groupNum +
                '}';
    }
}
