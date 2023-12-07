@echo off

REM Salva o diretório atual
set DIR=%cd%

REM Configura o CLASSPATH
set CLASSPATH=%DIR%
javac Main.java
java Main
