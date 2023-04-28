@echo off
javac *.java
javac ./assignment6/*.java
java FirstProject.java autosar.arxml
echo File autosar.arxml has ben processed.
echo press any key to process the second file.
pause
java FirstProject.java wrongtype.txt
echo File wrongtype.txt has been processed.
echo press any key to process the second file.
pause
java FirstProject.java empty.arxml
echo File empty.arxml has been processed.
echo all files has been processed
pause
