package edu.manckin.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
	
	 static String ShowMenu(Integer MenuType){
		 String sResult = null;
		if(MenuType ==1){
			sResult ="Выберите действие:"+"\n";
			sResult = sResult + "1.Текущий статус"+"\n";
			sResult = sResult + "2.Экипировка"+"\n";
			sResult = sResult + "3.Открыть двери"+"\n";
			sResult = sResult + "0.Выход"+"\n";	
			
			System.out.println(sResult); //тест
		}
		return sResult;
	}
	
	 public static void main(String[] args) {	
		 Integer isMenuPoint = -1;
		 
		 
		 Log SystemLog = new Log();
		 SystemLog.addInfo("Создание персонажа..."+"\n");
		 Character gamer1 = new Character("Sking91");
		 SystemLog.addInfo(gamer1.getInfo());
		 SystemLog.addInfo("Генерация колоды карт игрока..."+"\n");
		 PackGenerate GamerPack = new PackGenerate();
		 SystemLog.addInfo(GamerPack.DoorsPack.getCardInfo());
		 SystemLog.addInfo(GamerPack.TreasuresPack.getCardInfo()); 
		 SystemLog.getInfo();
		 
		 
		 
		 while(isMenuPoint != 0){
			 SystemLog.addInfo(ShowMenu(1));
			 String sAction = null; // Переменная с текстом который ввел пользователь
		        int nAction = 1; //
		        try {
		            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		            sAction = reader.readLine();
		            nAction = Integer.parseInt(sAction);
		            isMenuPoint = nAction;
		        }
		        catch (IOException e) {
		            e.printStackTrace();
		        }
		        
		 }
		 
		 SystemLog.addInfo("Игра завершена");
		 
	 }	
}
