package edu.manckin.core;

public class Doors {
	String 	Name; //название карты
	Integer Lvl; //уровень монстра
	
	public Doors(String sName, Integer numLvl){
		Name =sName;
		Lvl = numLvl;
	}

	String getCardInfo(){
		String sResult;
		sResult ="Карты дверей"+"\n";
		sResult = sResult +"Имя Монстра: " +Name+"\n";
		sResult = sResult +"Уровень Монстра: " +Lvl+"\n";
		
		return sResult;
	}
}
