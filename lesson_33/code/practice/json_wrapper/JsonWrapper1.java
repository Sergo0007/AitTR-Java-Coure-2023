package practice.json_wrapper;
//имя : Сергей,возраст 46 - это данные в одной программе
//{name: Sergej,age:46} это Json,который передают другой программе и она его может "прочитать"(parsing)


public class JsonWrapper1 {

    // field Class
    private Object value;
    //конуструктор


    public JsonWrapper1(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value + "}";
    }
}
