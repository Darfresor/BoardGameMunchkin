package edu.manckin.core;

public class Character {
	String sNickName;
	Integer numLvl;
	Integer numBonuses;
	Doors DoorsPack;
	Treasures TreasuresPack;
	
	public Character(String NickName){
		sNickName = NickName;
		numLvl = 1;
		numBonuses = 0;
		DoorsPack = new Doors("Теневой Нос",12);
		TreasuresPack = new Treasures("Меч убийства всего и вся кроме кальмаров",3);
	}
	
	String getCharacterInfo(){
		String sResult;
		sResult ="Характеристики персонажа"+"\n";
		sResult = sResult +"Никнейм: " + sNickName + "\n";
		sResult = sResult +"Уровень: " + numLvl + "\n";
		sResult = sResult +"Сила: " + numBonuses + "\n";
		
		System.out.println("Характеристики персонажа");
		System.out.println("Никнейм: " + sNickName);
		System.out.println("Уровень: " + numLvl);
		System.out.println("Сила: " + numBonuses);
		System.out.println("");
		return sResult;
	}
	String getCardInfoString(){
		String sResult;
		sResult ="Карты игрока "+sNickName+" \n";
		sResult = sResult +DoorsPack.getCardInfo() + "\n";
		sResult = sResult +TreasuresPack.getCardInfo() + "\n";
		
		return sResult;
	}
	

}
