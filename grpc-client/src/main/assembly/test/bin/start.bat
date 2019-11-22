chcp 65001
@echo off
::需要用>Java 8 u162
::https://stackoverflow.com/questions/6481627/java-security-illegal-key-size-or-default-parameters
set path=E:\DEV\java\jdk\jdk8u231\bin
set jarName=grpc-client-1.0-SNAPSHOT.jar
set className=top.creambing.grpc.server.GrpcClientApplication
set binPath=%~dp0
cd ..
set projectPath=%cd%
set confPath=%projectPath%\config
set jarPath=%projectPath%\%jarName%
echo %jarPath%
%path%\java -cp %confPath%;%jarPath% -Dfile.encoding=UTF-8  %className%
pause