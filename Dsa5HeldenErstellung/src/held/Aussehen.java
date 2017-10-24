package held;

/**
 * folgnde Ethnien sind möglich:
 * Mittellaender, Nivese, Norbade, Thorwaler, Tulamide, Waldmensch, Utulu,
 * Auelfe, Firnelfe, Waldelfe,
 * Halbelfe,
 * Zwerge
 */

import java.util.Random;

public class Aussehen {
    
    private String haarf;
    private String augenf;
    private int gewicht;
    private int groese;
    private Random randomno;
    
    Aussehen(){
	randomno = new Random();
	haarf = "schwarz";
	augenf = "schwarz";
	gewicht = 150;
	groese = gewicht - 100;
    }

    Aussehen(String ethnie){
	randomno = new Random();
	haarf = "schwarz";
	augenf = "schwarz";
	gewicht = 150;
	groese = gewicht - 100;
    }
    
    void randomHaarf(String ethnie){
	int b = randomno.nextInt(20) + 1;
	switch(ethnie) {
	case "Mittellaender":
	    switch(b){
		case 1:
		case 2:
		case 3:
		    haarf = "schwarz";
		    break;
		case 4:
		case 5:
		case 6:
		case 7:
		    haarf = "braun";
		    break;
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		    haarf = "dunkelblond";
		    break;
		case 13:
		case 14:
		case 15:
		case 16:
		    haarf = "blond";
		    break;
		case 17:
		case 18:
		    haarf = "weißblond";
		    break;
		case 19:
		case 20:
		    haarf = "rot";
	    }
	    break;
	case "Nivese":
	    switch(b){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		    haarf = "kupferrot";
		    break;
		case 16:
		    haarf = "blond";
		    break;
		case 17:
		case 18:
		    haarf = "braun";
		    break;
		case 19:
		    haarf = "dunkelblond";
		    break;
		case 20:
		    haarf = "schwarz";
	    }
	    break;
	case "Norbade":
	    switch(b){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		    haarf = "schwarz";
		    break;
		case 18:
		case 19:
		    haarf = "kupferrot";
		    break;
		case 20:
		    haarf = "blond";
	    }
	    break;
	case "Thorwaler":
	    switch(b){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		    haarf = "blond";
		    break;
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		    haarf = "rotblond";
		    break;
		case 14:
		case 15:
		    haarf = "weißblond";
		    break;
		case 16:
		case 17:
		    haarf = "rot";
		    break;
		case 18:
		    haarf = "dunkelblond";
		    break;
		case 19:
		case 20:
		    haarf = "grau";
	    }
	    break;
	case "Tulamide":
	    switch(b){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		    haarf = "schwarz";
		    break;
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		    haarf = "dunkelbraun";
		    break;
		case 13:
		case 14:
		    haarf = "mittelbraun";
		    break;
		case 15:
		case 16:
		case 17:
		    haarf = "hellbraun";
		    break;
		case 18:
		case 19:
		    haarf = "blond";
		    break;
		case 20:
		    haarf = "rot";
	    }
	    break;
	case "Waldmensch":
	    switch(b){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		    haarf = "schwarz";
		    break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		    haarf = "blauschwarz";
		    break;
		case 20:
		    haarf = "dunkelbraun";
	    }
	    break;
	case "Utulu":
	    switch(b){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		    haarf = "schwarz";
		    break;
		case 18:
		case 19:
		case 20:
		    haarf = "blauschwarz";
	    }
	    break;
	case "Auelf":
	    switch(b){
		case 1:
		    haarf = "blauschwarz";
		    break;
		case 2:
		case 3:
		    haarf = "schwarz";
		    break;
		case 4:
		case 5:
		    haarf = "silbern";
		    break;
		case 6:
		case 7:
		    haarf = "weißblond";
		    break;
		case 8:
		case 9:
		case 10:
		case 11:
		    haarf = "hellblond";
		    break;
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		    haarf = "mittelblond";
		    break;
		case 18:
		case 19:
		case 20:
		    haarf = "mittelblond";
	    }
	    break;
	case "Firnelfe":
	    switch(b){
		case 1:
		    haarf = "blauschwarz";
		    break;
		case 2:
		    haarf = "schwarz";
		    break;
		case 3:
		case 4:
		case 5:
		    haarf = "silbern";
		    break;
		case 6:
		case 7:
		case 8:
		case 9:
		    haarf = "schneeweiß";
		    break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		    haarf = "weißblond";
		    break;
		case 15:
		case 16:
		case 17:
		    haarf = "hellblond";
		    break;
		case 18:
		case 19:
		    haarf = "mittelblond";
		    break;
		case 20:
		    haarf = "goldbblond";
	    }
	    break;
	case "Waldelfe":
	    switch(b){
		case 1:
		case 2:
		case 3:
		    haarf = "blauschwarz";
		    break;
		case 4:
		case 5:
		case 6:
		case 7:
		    haarf = "schwarz";
		    break;
		case 8:
		case 9:
		case 10:
		    haarf = "silbern";
		    break;
		case 11:
		    haarf = "weißblond";
		    break;
		case 12:
		case 13:
		case 14:
		    haarf = "weißblond";
		    break;
		case 15:
		case 16:
		case 17:
		    haarf = "hellblond";
		    break;
		case 18:
		case 19:
		    haarf = "mittelblond";
		    break;
		case 20:
		    haarf = "goldbblond";
	    }
	    break;
	case "Halbelf":
	    switch(b){
		case 1:
		case 2:
		case 3:
		    haarf = "rot";
		    break;
		case 4:
		case 5:
		case 6:
		    haarf = "braun";
		    break;
		case 7:
		case 8:
		case 9:
		case 10:
		    haarf = "dunkelblond";
		    break;
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		    haarf = "hellblond";
		    break;
		case 16:
		case 17:
		    haarf = "weißblond";
		    break;
		case 18:
		case 19:
		    haarf = "schwarz";
		    break;
		case 20:
		    haarf = "blauschwarz";
	    }
	    break;
	case "Zwerg":
	    switch(b){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		    haarf = "blond";
		    break;
		case 6:
		case 7:
		case 8:
		case 9:
		    haarf = "schwarz";
		    break;
		case 10:
		case 11:
		    haarf = "dunkelgrau";
		    break;
		case 12:
		case 13:
		    haarf = "hellgrau";
		    break;
		case 14:
		    haarf = "salzweiß";
		    break;
		case 15:
		    haarf = "silberweiß";
		    break;
		case 16:
		case 17:
		    haarf = "feuerrot";
		    break;
		case 18:
		case 19:
		    haarf = "kupferrot";
		    break;
		case 20:
		    haarf = "blauschwarz";
	    }
	    break;
	}
    }
    
    void randomAugenf(String ethnie){
	int b = randomno.nextInt(20) + 1;
	switch(ethnie) {
	case "Mittellaender":
	    switch(b){
		case 1:
		case 2:
		    augenf = "dunkelbraun";
		    break;
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		    augenf = "braun";
		    break;
		case 10:
		case 11:
		    augenf = "grün";
		    break;
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		    augenf = "blau";
		    break;
		case 18:
		case 19:
		    augenf = "grau";
		    break;
		case 20:
		    augenf = "schwarz";
	    }
	    break;
	case "Nivese":
	    switch(b){
		case 1:
		case 2:
		    augenf = "braun";
		    break;
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		    augenf = "hellbraun";
		    break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		    augenf = "bernsteinfarbend";
		    break;
		case 15:
		case 16:
		case 17:
		    augenf = "grün";
		    break;
		case 18:
		case 19:
		    augenf = "blau";
		    break;
		case 20:
		    augenf = "grau";
	    }
	    break;
	case "Norbade":
	    switch(b){
		case 1:
		case 2:
		case 3:
		    augenf = "schwarz";
		    break;
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		    augenf = "dunkelbraun";
		    break;
		case 14:
		case 15:
		case 16:
		case 17:
		    augenf = "braun";
		    break;
		case 18:
		case 19:
		    augenf = "grün";
		    break;
		case 20:
		    augenf = "blau";
	    }
	    break;
	case "Thorwaler":
	    switch(b){
		case 1:
		case 2:
		    augenf = "dunkelbraun";
		    break;
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		    augenf = "braun";
		    break;
		case 8:
		case 9:
		case 10:
		case 11:
		    augenf = "grün";
		    break;
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		    augenf = "blau";
		    break;
		case 19:
		case 20:
		    augenf = "grau";
	    }
	    break;
	case "Tulamide":
	    switch(b){
		case 1:
		case 2:
		case 3:
		case 4:
		    augenf = "schwarz";
		    break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		    augenf = "dunkelbraun";
		    break;
		case 13:
		case 14:
		case 15:
		case 16:
		    augenf = "braun";
		    break;
		case 17:
		case 18:
		    augenf = "grau";
		    break;
		case 19:
		    augenf = "grün";
		    break;
		case 20:
		    augenf = "blau";
	    }
	    break;
	case "Waldmensch":
	    switch(b){
		case 1:
		case 2:
		case 3:
		    augenf = "hellbraun";
		    break;
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		    augenf = "dunkelbraun";
		    break;
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		    augenf = "schwarz";
	    }
	    break;
	case "Utulu":
	    switch(b){
		case 1:
		case 2:
		case 3:
		    augenf = "hellbraun";
		    break;
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		    augenf = "dunkelbraun";
		    break;
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		    augenf = "schwarz";
	    }
	    break;
	case "Auelf":
	    switch(b){
		case 1:
		case 2:
		    augenf = "schwarzbraun";
		    break;
		case 3:
		case 4:
		    augenf = "graublau";
		    break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		    augenf = "saphirblau";
		    break;
		case 10:
		case 11:
		case 12:
		    augenf = "smaragdgrün";
		    break;
		case 13:
		case 14:
		case 15:
		case 16:
		    augenf = "dunkelviolett";
		    break;
		case 17:
		case 18:
		    augenf = "bernsteinfarbend";
		    break;
		case 19:
		    augenf = "goldgesprenkelt";
		    break;
		case 20:
		    augenf = "rubinrot";
	    }
	    break;
	case "Firnelfe":
	    switch(b){
		case 1:
		    augenf = "schwarz";
		    break;
		case 2:
		case 3:
		    augenf = "silbergrau";
		    break;
		case 4:
		case 5:
		case 6:
		case 7:
		    augenf = "eisgrau";
		    break;
		case 8:
		case 9:
		case 10:
		case 11:
		    augenf = "saphirblau";
		    break;
		case 12:
		case 13:
		case 14:
		case 15:
		    augenf = "smaragdgrün";
		    break;
		case 16:
		case 17:
		case 18:
		    augenf = "bernsteinfarbend";
		    break;
		case 19:
		    augenf = "goldgesprenkelt";
		    break;
		case 20:
		    augenf = "rubinrot";
	    }
	    break;
	case "Waldelfe":
	    switch(b){
		case 1:
		case 2:
		    augenf = "schwarz";
		    break;
		case 3:
		case 4:
		    augenf = "saphirblau";
		    break;
		case 5:
		case 6:
		case 7:
		case 8:
		    augenf = "smaragdgrün";
		    break;
		case 9:
		case 10:
		case 11:
		case 12:
		    augenf = "dunkelbraun";
		    break;
		case 13:
		case 14:
		case 15:
		case 16:
		    augenf = "bernsteinfarbend";
		    break;
		case 17:
		    augenf = "goldgesprenkelt";
		    break;
		case 18:
		case 19:
		    augenf = "rubinrot";
		    break;
		case 20:
		    augenf = "amethystviolett";
	    }
	    break;
	case "Halbelf":
	    switch(b){
		case 1:
		case 2:
		case 3:
		    augenf = "schwarz";
		    break;
		case 4:
		case 5:
		case 6:
		    augenf = "grau";
		    break;
		case 7:
		case 8:
		case 9:
		case 10:
		    augenf = "blau";
		    break;
		case 11:
		case 12:
		case 13:
		case 14:
		    augenf = "grün";
		    break;
		case 15:
		case 16:
		    augenf = "dunkelbraun";
		    break;
		case 17:
		case 18:
		    augenf = "hellbraun";
		    break;
		case 19:
		    augenf = "bernsteinfarben";
		    break;
		case 20:
		    augenf = "goldgesprenkelt";
	    }
	    break;
	case "Zwerg":
	    switch(b){
		case 1:
		case 2:
		    augenf = "dunkelbraun";
		    break;
		case 3:
		case 4:
		case 5:
		    augenf = "braun";
		    break;
		case 6:
		case 7:
		case 8:
		case 9:
		    augenf = "grün";
		    break;
		case 10:
		    augenf = "blau";
		    break;
		case 11:
		case 12:
		case 13:
		case 14:
		    augenf = "grau";
		    break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		    augenf = "schwarz";
	    }
	    break;
	}
    }

    void randomGroese(String ethnie){
	int wz1 = randomno.nextInt(20) + 1;
	int wz2 = randomno.nextInt(20) + 1;
	int ws1 = randomno.nextInt(20) + 1;
	int ws2 = randomno.nextInt(20) + 1;
	int ws3 = randomno.nextInt(20) + 1;
	int ws4 = randomno.nextInt(20) + 1;
	switch(ethnie) {
	case "Mittellaender":
	    groese = 160 + wz1 + wz2; 
	    break;
	case "Nivese":
	    groese = 155 + wz1 + wz2;
	    break;
	case "Norbade":
	    groese = 158 + wz1 + wz2;
	    break;
	case "Thorwaler":
	    groese = 168 + wz1 + wz2;
	    break;
	case "Tulamide":
	    groese = 155 + wz1 + wz2;
	    break;
	case "Waldmensch":
	    groese = 152 + ws1 + ws2 + ws3;
	    break;
	case "Utulu":
	    groese = 165 + wz1 + wz2;
	    break;
	case "Auelf":
	case "Firnelfe":
	case "Waldelfe":
	    groese = 168 + wz1 + wz2;
	    break;
	case "Halbelf":
	    groese = 158 + wz1 + ws1 + ws2 + ws3 + ws4;
	    break;
	case "Zwerg":
	    groese = 128 + ws1 + ws2;
	    break;
	}
    }
}   