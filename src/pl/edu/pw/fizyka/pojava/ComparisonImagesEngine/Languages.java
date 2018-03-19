package pl.edu.pw.fizyka.pojava.ComparisonImagesEngine;

public class Languages {

	int number = 10;// liczba nazw (definicji)
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
		languageStrings [0][5] = "Zakończ";
		languageStrings[0][6] = " Przycisk 'Wczytaj obrazy' służy do wgrywania danych o pacjentach, czyli zdjęć oraz ich nazwisk. "
				+ "'Analiza błędów przedstawi zależnoci błędów okrelenia ortocentrum dla poszczególnych pacjentów \n"
				+ "'Analiza statystyczna' otworzy okno z rozkładem błędu oraz dystrybuantš empirycznš. \n"
				+ "W polu 'Pacjenci' można wyszukiwać wczytanego już wczeniej pacjenta przez wpisanie jego danych \n"
				+ "Pole 'Zakończ' konćzy pracę programu" ;
		languageStrings [0][7] = "<html>Obiektem symulacji jest próbka, w której znajduje się N cząstek uranu235. Cząstka<br>"
				+ " ulegająca rozpadowi emituje po jednej cząsteczce kryptonu92 i baru 141, oraz trzy neutrony. Neutrony<br>"
				+ " poruszają się w losowych kierunkach, w przypadku zderzenia z cząsteczką uranu mają szansę B na spowodowanie<br>"
				+ " wymuszonego rozszczepienia, szansę C na odbicie się w innym, losowym kierunku. Poniżej pewnej masy,<br>"
				+ " nazywanej masą krytyczną, energia emitowana przez próbkę pochodzi głównie ze spontanicznych rozszczepień<br>"
				+ " atomów, powyżej tej masy reakcje rozszczepienia zachodzą w sposób łańcuchowy i w tej sytuacji próbka<br>"
				+ " zachowuje się jak bomba atomowa.</html>";
		languageStrings [0][8]="Comparison Images Engine";
		languageStrings [0][9]="Pomoc";
		languageStrings [1][0] = "VIEW";
		languageStrings [1][1] = "mass function";
		languageStrings [1][2] = "time function";
		languageStrings [1][3] = "2D simulation";
		languageStrings [1][4] = "SIZE";
		languageStrings [1][5] = "Start simulate";
		
		languageStrings [1][6] = "<html>The user can choose one from three options: mass function, time function, 2D simulation,<br>"
				+ " and then he have to press start simulation button (on the right side the selected option will appear).<br>"
				+ " When the user choose the mass function option, he see the line chart of efficiency(a ratio of released<br>"
				+ " energy to whole energy possible to release), which is expressed in percent, depending on the number of<br>"
				+ " atoms in mass function. The time function option shows a chart of released energy in time domain. The<br>"
				+ " option simulation 2D allows the user to see the visualization 2D of reactions occurred in the atomic bomb<br>"
				+ " for one million particles (uranium particles are represented by green points, krypton and barium particles<br>"
				+ " are represented by red points). On the screen the new frame will appear and when the user will clicked<br>"
				+ " shutting button, the new frame will disappear. The slider allows the user to choose the number of atoms,<br>"
				+ " which create the bomb (the option is only available for time function charts). If the user change the number<br>"
				+ " of atoms during drawing the chart, drawing will stop. Options can be changing during current simulation:<br>"
				+ " the user have to mark desired option and press start simulation button or he can halt the simulation.<br>"
				+ " The user can halt the simulation by stop simulation button. The save chart button lets the user save the<br>"
				+ " chart, which is currently displayed into file.</html";
		languageStrings [1][7] = "<html>The object of the simulation is the sample, which consists of N uranium235  particles.<br>"
				+ " The particle, which undergo a decay, emits one krypton92 particle, one barium 141 particle and three<br>"
				+ " neutrons. The neutrons are moving in random directions, when a neutron collide with a uranium particle,<br>"
				+ " they have a B chance to a cause forced split, C chance to reflect themselves in a different, random<br>"
				+ " direction. Under the critical mass, the energy, which is emitted by the sample, issues mainly from<br>"
				+ " spontaneous atomic decays, above this mass the fission reactions occur in catenary way and in this situation<br>"
				+ " the sample behaves like atomic bomb.</html>";
		languageStrings [1][8]="Comparison Images Engine";
		languageStrings [1][9]="Help";
		languageStrings [2][0] = "AUSSICHT";
		languageStrings [2][1] = " Die Gewichtsfunktion";
		languageStrings [2][2] = "Die Zeitfunktion";
		languageStrings[2][3] = "Die 2D simulation";
		languageStrings [2][4] = " DIE GRÖßE";
		languageStrings [2][5] = "Starten die Simulation";
		
		languageStrings [2][6] = "<html>Sie müssen die Taste die Gewichtsfunktion  auswählen, und auf der rechten Seite erscheint<br>"
				+ "der graphischen Darstellung Effizienz in Prozent (der Beziehung von Verlustenergie zu möglicher Gesamtverlustleistung)<br>"
				+ "von der Anzahl der Atome in einer Gewichtsfunktion ausgedrückt. Die Taste „Funktion der Zeit“ zeigt Grafik die Verlustleistung in der Zeitdomäne.<br>"
				+ "Die Option „2D-Simulation“ erlaubt Visualisierung 2D-Reaktionen in einer Atombombe zu einer Million Teilchen erscheinen zu sehen<br>"
				+ "(Zum Beispiel wird die grünen Felder von Zellmolekülen von Uran repräsentieren, rote Zellen mit Partikeln von Barium und Krypton und dergleichen.<br>"
				+ "Der Schieberegler erlaubt Benutzer die Anzahl der Atome ,die Bombe bilden wählen (Nur für Diagramme „Funktion der Zeit“). Wenn Sie die Taste<br>"
				+ "„START SIMULATION“ im rechten Teil des Bildschirms pressen, wird einer von seiner gewählten Option erscheinen. Die Optionen können während<br>"
				+ "der aktuellen Simulation verändert durch andere Option einstellen und klicken Sie auf „START SIMULATION“  oder auf bereits laufenden Simulation zu stoppen.<br>"
				+ "Die Simulationen können durch Taste „STOP SIMULATION“ pressen werden. Die „Grafik speichern“ ermöglicht dem Benutzer das Diagramm zu speichern,<br>"
				+ "die derzeit auf der rechten Seite des Rahmens angezeigt ist, in eine Datei. </html>";
		languageStrings [2][7] = "<html>Der Objekt der Simulation ist eine Probe, in der, die ist est N die Teilchen von uran235. Zerfallende Teilchen emittiert ein Molekül Krypton92<br>"
				+ "und Barium141, und drei Neutronen. Die Neutronen bewegen sich in zufällige Richtungen, im Falle einer Kollision haben mit einem Molekül von Uran , eine B Chance eine<br>"
				+ "erzwungene Spaltung zu verursachen, für eine  C Chance aufprallen sich in eine andere zufällige Richtung zurück. Unterhalb einer bestimmten Masse, die so genannte<br>"
				+ "kritische Masse, die energie emittiert von der Probe, stammt hauptsächlich aus spontanen fissions Kohlen, oberhalb dieses Gewicht auftreten Spaltungsreaktionen in<br>"
				+ "einer Kette und in diesem Fall verhält sich die Probe wie eine Atombombe.</html>";
		languageStrings [2][8]="Comparison Images Engine";
		languageStrings [2][9]="Help";
	}
}

