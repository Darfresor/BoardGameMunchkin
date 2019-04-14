package edu.manckin.core;

public class Doors {
	String 	Name; //имя карты
	Integer Lvl; //уровень монстра
	
	public Doors(String sName, Integer numLvl){
		Name =sName;
		Lvl = numLvl;
	}

	String getCardInfo(){
		String sResult;
		sResult ="Карты дверей"+"\n";
		sResult = sResult +"Имя Монстра: " +Name+"\n";
		sResult = sResult +"Уровень монстра: " +Lvl+"\n";
		
		return sResult;
	}
}
