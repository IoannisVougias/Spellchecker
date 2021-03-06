# Spellchecker
### Team Name: **Dirty Bits**

Spellchecker is a Java application which checks the spelling in Greek or English. It can check the spelling either on a text the user has typed or on a provided txt file.

Spellchecker is a team project assigned by Diomidis Spinellis for the course of Programming II at the Department of Management Science and Technology (DMST) of the Athens University of Economics and Business (AUEB).

## Authors

* **8160017 Βούγιας Ιωάννης - IoannisVougias**

* **8160020 Γεωργούλη Χριστιάννα - javalicious**

* **8160035 Κακουλάκη Μαρίνα - MarinaKakoulaki**

* **8160058 Λαζαρίδη Ιωάννα - ioannalaza**

* **8160059 Λαζαρίδου Ιωάννα - ioannalazaridou**

* **8160078 Μπαμπέτας Κωνσταντίνος - kbabetas**

* **8160105 Παυλίδη Μαρία Μαρίνα - marininapav**

* **8160121 Σπέρτου Χρυσή - chrysasp**

## To Build:
Primary build is supported with **maven**.
```
mvn package
```
Artifacts:
* ``` Spellchecker/target/Spellchecker.jar ```

## Installation
There are two install options: a bat file or a self-contained jar file.

To start from the bat file, simply double click on the ``` run_Spellchecker.bat ```

If you would like to run the ```Spellchecker.jar ```, change the directory to ```Spellchecker\target```, then execute:

``` 
java -jar Spellchecker.jar
```

After installation, the output should contain:

```
Active code page: 737
Press 1 for Greek/ Πιέστε 1 για ελληνικά:
Press 2 for English/ Πιέστε 2 για αγγλικά:
Press 3 to exit/ Πιέστε 3 για έξοδο:

1

Πληκτρολόγησε 1 άμα θέλεις να γράψεις ένα δικό σου  κείμενο:
Πληκτρολόγησε 2 άμα θέλεις να ελέγξεις ορθογραφικά ένα αρχείο της επιλογής σου:

1

Πληκτρολόγησε ένα κείμενο στα ελληνικά και θα ελέγξουμε άμα είναι ορθογραφικά σωστό:

Καλησπέρα, αυτώ ειναι ένα παράδειγμα ορθογραφικού ελέγχου.

Προτεινόμενες λέξεις για: αυτώ :
αιτώ
αυτά
αυτέ
αυτή
αυτί
αυτό
αυτών
παυτώ
ψαυτώ
-
Προτεινόμενες λέξεις για: ειναι :
είναι
-

Οι λάθος λέξεις είναι :

αυτώ
ειναι
```
## Javadocs

There are two ways to run the javadocs of this project: a bat file or manually through the console

To start from the bat file, simply double click on the ``` run_Javadoc.bat ```

If you would like to run javadocs manually through the console, change the directory to ```SpellChecker\src\main\java ```, then execute:

``` 
javadoc -encoding cp737 -d ..\..\..\doc gr.aueb.dmst.dirtybits
```

After that, a folder named doc will be created in the Spellchecker folder and inside it will contain the javadocs.

## Requirements

* [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html)
* [Maven](https://maven.apache.org/)

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [CheckStyle](http://checkstyle.sourceforge.net/) - Checking Code Standard
* [FindBugs](http://findbugs.sourceforge.net/) - Static Analysis Tool for Bugs
* [Error-Prone](http://errorprone.info/) - Static Analysis Tool for Compile-Time Errors
* [PMD](http://pmd.sourceforge.net/pmd-5.0.0/) - Source Code Analyzer
* [JUnit](http://junit.org/junit5) - Testing Unit Framework

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

