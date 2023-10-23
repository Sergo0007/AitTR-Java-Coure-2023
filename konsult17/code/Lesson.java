public class Lesson {

    private  int id;
    private String plan;
    private String theory;
    private String homeWord;
    private String code;

    public Lesson(int id, String plan, String theory, String homeWord, String code) {
        this.id = id;
        this.plan = plan;
        this.theory = theory;
        this.homeWord = homeWord;
        this.code = code;
    }

    public Lesson(){
        System.out.println("i am empty constructor");
    }


}
