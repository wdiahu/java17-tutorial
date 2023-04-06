package ahu.wudi.java9.TryResource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class tryCatchTest {

    public static void main(String[] args) throws IOException {

        //java 7
        try (InputStream stream = Files.newInputStream(Paths.get("resource/a.txt"))) {

        } catch (Exception e) {

        }

        //java 9
        InputStream stream = Files.newInputStream(Paths.get("resource/a.txt"));
        try (stream) {

        } catch (Exception e) {

        }

    }
}
