package edu.manckin.core;

public class Doors {
	String 	Name; //�������� �����
	Integer Lvl; //������� �������
	
	public Doors(String sName, Integer numLvl){
		Name =sName;
		Lvl = numLvl;
	}

	String getCardInfo(){
		String sResult;
		sResult ="����� ������"+"\n";
		sResult = sResult +"��� �������: " +Name+"\n";
		sResult = sResult +"������� �������: " +Lvl+"\n";
		
		return sResult;
	}
}
