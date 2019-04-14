package edu.manckin.core;

public class Log {
	String GameLog;
 public Log(){
	 GameLog = "Запуск игры"+"\n";;
 }
 
 /**
  * Добавление информации в лог
  */
 void addInfo(String sTxt){
	 GameLog = GameLog +sTxt+"\n";
 }
 
 
 void getInfo(){
	 System.out.println(GameLog);
 }
}
