#Java Grep Application

## Introduction
This project is a Java implementation of the `grep` command line utility found on Linux 
machines. The application recursively searches a root directory for a specified regex pattern. 
It finds the corresponding lines and saves them to an output file. The purpose of this project 
was to further improve core Java skills as well as computer science basics. This application
required learning about the Java I/O functions as well as Lambda and Stream APIs. 
  
## Usage 
This application can be run from the main method of either the JavaGrepImp class or the 
JavaGrepLambdaImp class. It takes three arguments which are as follows:

|Argument|Meaning|Example|
|--------|-------|-------|
|regex|Regex pattern to be searched for in the directory|.\*IllegalArgumentException.\* |
|rootDir|Root directory to recursively search|./grep/src|
|outFile|Output file to save the matching lines to |/tmp/grep.out|

## Pseudocode
The Java Grep app has a method called process that defines the workflow of the application. 
The pseudocode of the `process()` method is as follows:
```
matchedLines = []
for file in listFilesRecursively(rootDir)
  for line in readLines(file)
      if containsPattern(line)
        matchedLines.add(line)
writeToFile(matchedLines)
```

## Performance Issue
This application has performance issues when performed on very large files. The original 
implementation stores every line being read into memory. If the files are
too large the process may time out and there will not be enough available memory.
The JavaGrepLambdaImp class addresses these issues by utilizing the Java Stream
and Lambda functionality. Java Streams support functional programming such as map-reduce 
transformations on collections without storing the data. 

## Improvement 
1. Have the application display the filename and line number where the matching regex pattern was found. 
2. Have the application output something to the user to inform them that the search was successful, 
for example if the pattern was found anywhere, or how many lines were found. This would save the
user time from opening the output file to confirm. 
3. Implement something that will inform the user if there is enough memory space to conduct the 
search. 