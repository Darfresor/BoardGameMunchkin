package edu.manckin.core;

public class Log {
	String GameLog;
 public Log(){
	 GameLog = "Ициниализация лога игры"+"\n";;
 }
 
 /**
  * добавление информации в лог
  */
 void addInfo(String sTxt){
	 GameLog = GameLog +sTxt+"\n";
 }
 
 
 void getInfo(){
	 System.out.println(GameLog);
 }
}
