@echo off

javac -d . -cp lib\* PrimeFactors.java && java -cp .;lib\* org.junit.runner.JUnitCore com.pillartechnology.practice.PrimeFactors | find /V "at org.junit" | find /V "at sun.reflect" | find /V "java.lang"

