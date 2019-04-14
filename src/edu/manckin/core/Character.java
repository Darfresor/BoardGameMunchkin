package edu.manckin.core;

public class Character {
	String sNickName;
	Integer numLvl;
	Integer numBonuses;
	
	public Character(String NickName){
		sNickName = NickName;
		numLvl = 1;
		numBonuses = 0;
	}
	
	String getInfo(){
		String sResult;
		sResult ="Характеристики персонажа"+"\n";
		sResult = sResult +"Никнейм: " + sNickName + "\n";
		sResult = sResult +"Уровень: " + numLvl + "\n";
		sResult = sResult +"Сила: " + numBonuses + "\n";
		
		return sResult;
	}
}
