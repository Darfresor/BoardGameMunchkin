package edu.manckin.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
	
	
	
	/**
	 * Выводит игровое меню на экран
	 * @param MenuType - номер пункта меню
	 * @return
	 */
	 static String ShowMenu(Integer MenuType){
		 String sResult = null;
		if(MenuType ==1){
			sResult ="Выберите действие:"+"\n";
			sResult = sResult + "1.Статус персонажа(игрок)"+"\n";
			sResult = sResult + "2.Экипировка"+"\n";
			sResult = sResult + "3.Открыть дверь"+"\n";
			sResult = sResult + "0.Выход"+"\n";	
			
			System.out.println(sResult); //тест кодировки часть2
		}
		return sResult;
	}
	 
	 
	 
	
	 public static void main(String[] args) {	
		 Integer isMenuPoint = -1;
		 
		 
		 Log SystemLog = new Log();
		 SystemLog.addInfo("Генерация колоды карт..."+"\n");
		 PackGenerate GamerPack = new PackGenerate();
		 SystemLog.addInfo("Создание персонажа и раздача ему карт..."+"\n");
		 Character gamer1 = new Character("Sking91");
		 SystemLog.addInfo(gamer1.getCharacterInfo());
		 SystemLog.addInfo(gamer1.getCardInfoString());
		 
		 SystemLog.addInfo("*Системная информация.Карты находящиеся в колодах"+"\n");
		 SystemLog.addInfo(GamerPack.DoorsPack.getCardInfo());
		 SystemLog.addInfo(GamerPack.TreasuresPack.getCardInfo()); 
		 SystemLog.getInfo();
		 
		 
		 
		 while(isMenuPoint != 0){
			 SystemLog.addInfo(ShowMenu(1));
			 String sAction = null; 
		        int nAction = 1; 
		        try {
		            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		            sAction = reader.readLine();
		            nAction = Integer.parseInt(sAction);
		            isMenuPoint = nAction;
		        }
		        catch (IOException e) {
		            e.printStackTrace();
		        }
		      
		        if(isMenuPoint==1) {
		        	gamer1.getCharacterInfo();
		      }
		        
		 }
		 
		 SystemLog.addInfo("Игра завершена");
		 
	 }	
}
