@echo off 

java -version 2>nul 
if errorlevel 1 ( 
   echo ksr: java not found 

   pause 
   exit 1 
) 

java -jar ../lib/ksr.jar 

pause 
