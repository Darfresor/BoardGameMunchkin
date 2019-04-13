package edu.manckin.core;

public class Treasures {
	String 	Name; //название карты
	Integer Bonus; //Количество бонусов
	
	public Treasures(String sName, Integer  numBonus){
		Name = sName;
		Bonus = numBonus; 
 }
	
	String getCardInfo(){
		String sResult;
		sResult ="Карты сокровищ"+"\n";
		sResult = sResult +"Имя предмета: " +Name+"\n";;
		sResult = sResult +"Бонусы: " +Bonus+"\n";;
		
		return sResult;
	}
	
}
