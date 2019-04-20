package edu.manckin.core;

public class Treasures {
	String 	Name; //имя
	Integer Bonus; //сила
	
	public Treasures(String sName, Integer  numBonus){
		Name = sName;
		Bonus = numBonus; 
 }
	
	String getCardInfo(){
		String sResult;
		sResult ="Карты сокровищ"+"\n";
		sResult = sResult +"Название: " +Name+"\n";;
		sResult = sResult +"Бонус: " +Bonus+"\n";;
		
		return sResult;
	}
	
}
