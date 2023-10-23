package practice.sentencies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {
    Sentence sentence;//поле класса типа Sentence

    @BeforeEach
    void setUp() {
        sentence = new Sentence();//вызвали пустой конструктор,котрый есть по умолчанию у всех обьктов
    }

    @Test
    void countWordsTest(){
        String str = "One two three.";
        assertEquals(3,sentence.countWords(str));
    }
    @Test
    void countSymbolsTest(){
        String str = "One two $ three = ";
        assertEquals(16,sentence.countSymbols(str));

    }
}