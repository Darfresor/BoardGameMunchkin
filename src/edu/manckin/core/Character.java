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
		sResult ="�������������� ������"+"\n";
		sResult = sResult +"�������: " + sNickName + "\n";
		sResult = sResult +"�������: " + numLvl + "\n";
		sResult = sResult +"�������� ����: " + numBonuses + "\n";
		
		return sResult;
	}
}
