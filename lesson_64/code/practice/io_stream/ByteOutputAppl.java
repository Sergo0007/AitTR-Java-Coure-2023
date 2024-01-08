package practice.io_stream;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

public class ByteOutputAppl {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("./dest/test.txt" )) {
            fout.write(65);
            fout.write(66);
            fout.write(27);
            fout.write(257);
            fout.write(1);
            fout.write(67);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





