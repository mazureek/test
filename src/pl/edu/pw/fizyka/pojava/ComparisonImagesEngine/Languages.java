package pl.edu.pw.fizyka.pojava.ComparisonImagesEngine;

public class Languages {

	int number = 20;// liczba nazw (definicji)
	String [][] languageStrings = new String [3][number];

	public Languages(){
		
		for(int languages=0; languages<3; languages++){ //uzupełnia wyrazy w macierzy
			for(int components=0; components<number; components++){
				languageStrings[languages][components]= new String();//tworzy tablice 
			}
		}
		languageStrings [0][0] = "Wczytaj obrazy";
		languageStrings [0][1] = "Analiza błędów";
		languageStrings [0][2] = "Analiza statystyczna";
		languageStrings [0][3] = "Pacjenci";
		languageStrings [0][4] = "Pomoc";
		languageStrings [0][5] = "Zapisz i zakończ";
		languageStrings[0][6] = "<html>Przycisk 'Wczytaj obrazy' służy do wgrywania danych o pacjentach, czyli zdjęć oraz ich nazwisk.<br> "
				+ "'Analiza błędów przedstawi zależnoci błędów okrelenia ortocentrum dla poszczególnych pacjentów <br>"
				+ "'Analiza statystyczna' otworzy okno z rozkładem błędu oraz dystrybuantš empirycznš. <br>"
				+ "W polu 'Pacjenci' można wyszukiwać wczytanego już wczeniej pacjenta przez wpisanie jego danych<br>"
				+ "Pole 'Zakończ' konćzy pracę programu.</html>";
		languageStrings [0][7] = "Comparison Images Engine";
		languageStrings [0][8]="Pomoc";
		languageStrings [0][9]="Zdjęcia pacjenta";
		languageStrings [0][10]="Ujednolicenie tła";
		languageStrings [0][11]="Kontrast";
		languageStrings [0][12]="Menu";
		languageStrings [0][13]="Symulacja";
		languageStrings [0][14]="Manual";
		languageStrings [0][15]="Zapisz dane";
		languageStrings [0][16]="Zakończ";
		languageStrings [0][17]="Dalej";
		languageStrings [0][18]="Następny";
		languageStrings [0][19]="Anuluj";
		
		languageStrings [1][0] = "Load images";
		languageStrings [1][1] = "Errors analysis";
		languageStrings [1][2] = "Statistical analysis";
		languageStrings [1][3] = "Patient";
		languageStrings [1][4] = "Help";
		languageStrings [1][5] = "End";
		
		
		languageStrings [1][6] = "<html>The 'Load images' button is used to upload data about patients, i.e. pictures and their names. <br>" + 
				"'Error analysis' will show the error dependence of the orthocenter specification for individual patients. <br>" + 
				"'Statistical analysis' will open a window with the error distribution and empirical cumulative distribution.  <br>" + 
				"In the 'Patients' field you can search for a previously loaded patient by entering his data.  <br>" + 
				"Field 'End' finishes the program work.</html>";
				
		
		languageStrings [1][7]="Comparison Images Engine";
		languageStrings [1][8]="Help";
		languageStrings [1][9]="Pictures of the patient";
		languageStrings [2][0] = "Einleisen die Fotos";
		languageStrings [2][1] = " Die Fehleranalyse";
		languageStrings [2][2] = "Die Statistischanalyse";
		languageStrings [2][3] = "Die Patienten";
		languageStrings [2][4] = " Die Hilfe";
		languageStrings [2][5] = "Beenden";
		
		languageStrings [2][6] = "<html>Die Schaltfläche 'Eineleisen die Fotos' wird verwendet, um Daten über Patienten, d. H. Bilder und deren Namen, hochzuladen.<br>" + 
				" 'Fehleranalyse' zeigt die Fehlerabhängigkeit der Orthocenter-Spezifikation für einzelne Patienten an.<br>" + 
				"'Statistische Analyse' 'öffnet ein Fenster mit der Fehlerverteilung und der empirischen kumulativen Verteilung.<br>" + 
				" Im Feld 'Patienten' können Sie nach einem zuvor geladenen Patienten suchen, indem Sie seine Daten eingeben. <br>" + 
				"+ Feld 'Beenden' endet Sie die Programmarbeit.</html>";
		languageStrings [2][7]="Comparison Images Engine";
		languageStrings [2][8] = "Beenden";
		languageStrings [2][9]="Die Paitentenfotos";
	}
}

