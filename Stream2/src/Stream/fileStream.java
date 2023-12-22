package Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class fileStream {
    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("애국가-Utf8nb.txt"));
        lines.forEach(System.out::println);
        lines.close();

        Stream<Path> list = Files.list(Paths.get("/"));
        list.forEach(p -> System.out.println(p.getFileName()));
        list.close();
    }
}
