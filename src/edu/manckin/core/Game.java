package edu.manckin.core;

public class Game {
	 public static void main(String[] args) {	
		 Log SystemLog = new Log();
		 SystemLog.addInfo("Создание персонажа..."+"\n");
		 Character gamer1 = new Character("Sking91");
		 SystemLog.addInfo(gamer1.getInfo());
		 SystemLog.addInfo("Генерация колоды карт игрока..."+"\n");
		 PackGenerate GamerPack = new PackGenerate();
		 SystemLog.addInfo(GamerPack.DoorsPack.getCardInfo());
		 SystemLog.addInfo(GamerPack.TreasuresPack.getCardInfo());
		 
		 SystemLog.getInfo();
	 }	
}
