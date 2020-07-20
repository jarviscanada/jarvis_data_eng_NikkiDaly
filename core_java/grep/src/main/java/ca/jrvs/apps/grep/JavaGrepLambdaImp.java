package ca.jrvs.apps.grep;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaGrepLambdaImp extends JavaGrepImp {

  public static void main(String[] args) {
    if (args.length != 3) {
      throw new IllegalArgumentException("USAGE: JavaGrep regex rootDir outFile");
    }

    JavaGrepLambdaImp javaGrepLambdaImp = new JavaGrepLambdaImp();
    javaGrepLambdaImp.setRegex(args[0]);
    javaGrepLambdaImp.setRootPath(args[1]);
    javaGrepLambdaImp.setOutFile(args[2]);

    try {
      javaGrepLambdaImp.process();
    } catch (Exception ex) {
      javaGrepLambdaImp.logger.error("Failed to start the process", ex);
    }
  }

  /**
   * Implemented using lambda and Stream APIs
   *
   * @param inputFile file to be read
   * @return
   */
  @Override
  public List<String> readLines(File inputFile) {
    if (!inputFile.isFile()) {
      throw new IllegalArgumentException("ERROR: inputFile is not a file.");
    }
    List<String> lines = new ArrayList<>();
    try {
      Stream<String> stream = Files.lines(inputFile.toPath());
      lines = stream.collect(Collectors.toList());
    } catch (Exception ex) {
      logger.error("ERROR: Failed to read file", ex);
    }
    return lines;
  }

  /**
   * Implemented using lambda and Stream APIs
   *
   * @param rootDir input Directory
   * @return
   */
  @Override
  public List<File> listFiles(String rootDir) {
    List<File> files = new ArrayList<File>();
    try {
      Stream<Path> fileStream = Files.walk(Paths.get(rootDir));
      fileStream.filter(Files::isRegularFile).forEach(file -> files.add(file.toFile()));
    } catch (Exception ex) {
      logger.error("ERROR: Failed to retrieve file");
    }
    return files;
  }
}
