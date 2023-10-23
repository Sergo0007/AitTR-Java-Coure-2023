package practice.string_builder;

public class StringBuilderAppl {
    public static void main(String[] args) {
        //StringBuilder - это класс.в нем есть полезные методы для работы со строками
        //append - добавление притягивание
        String str = "Java";
        //str = str + "_" + 11
        str = str.concat("_");//concat- это склеивание
        str = str.concat("" + 11);// к строке добавляем примитив int
        System.out.println(str);

        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append("-").append(11);
        System.out.println(sb);//обьект sb - мутирует
        sb.reverse();//строка задом наперед
        System.out.println(sb);
        // можно ли вернуть тип StringBuilder  обратно в тип String?
        str = sb.toString();// да, можно
        System.out.println(str);




    }
}
