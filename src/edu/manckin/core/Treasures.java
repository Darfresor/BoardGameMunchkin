package edu.manckin.core;

public class Treasures {
	String 	Name; //�������� �����
	Integer Bonus; //���������� �������
	
	public Treasures(String sName, Integer  numBonus){
		Name = sName;
		Bonus = numBonus; 
 }
	
	String getCardInfo(){
		String sResult;
		sResult ="����� ��������"+"\n";
		sResult = sResult +"��� ��������: " +Name+"\n";;
		sResult = sResult +"������: " +Bonus+"\n";;
		
		return sResult;
	}
	
}
