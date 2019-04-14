package edu.manckin.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
	
	 static String ShowMenu(Integer MenuType){
		 String sResult = null;
		if(MenuType ==1){
			sResult ="�������� ��������:"+"\n";
			sResult = sResult + "1.������� ������"+"\n";
			sResult = sResult + "2.����������"+"\n";
			sResult = sResult + "3.������� �����"+"\n";
			sResult = sResult + "0.�����"+"\n";	
			
			System.out.println(sResult); //тест кодировки часть2
		}
		return sResult;
	}
	
	 public static void main(String[] args) {	
		 Integer isMenuPoint = -1;
		 
		 
		 Log SystemLog = new Log();
		 SystemLog.addInfo("�������� ���������..."+"\n");
		 Character gamer1 = new Character("Sking91");
		 SystemLog.addInfo(gamer1.getInfo());
		 SystemLog.addInfo("��������� ������ ���� ������..."+"\n");
		 PackGenerate GamerPack = new PackGenerate();
		 SystemLog.addInfo(GamerPack.DoorsPack.getCardInfo());
		 SystemLog.addInfo(GamerPack.TreasuresPack.getCardInfo()); 
		 SystemLog.getInfo();
		 
		 
		 
		 while(isMenuPoint != 0){
			 SystemLog.addInfo(ShowMenu(1));
			 String sAction = null; // ���������� � ������� ������� ���� ������������
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
		 
		 SystemLog.addInfo("���� ���������");
		 
	 }	
}
