package held;

import java.util.Random;

public class Geburtstag {
    
    private int tag;
    private int monat;
    private Random randomno;
    
    Geburtstag(){
	randomno = new Random();
	setTag(1);
	setMonat(1);
    }
    
    Geburtstag(int t, int m){
	setTag(t);
	setMonat(m);
	randomno = new Random();
    }
    
    // liegt zwischen 1-30 nur am 13. Monat gibt es 5 Tage.
    void setTag(int t) {
	if (monat == 13) {
	    if (t < 6 && t > 0) {
		tag = t;
	    }
	} else { if (t < 31 && t > 0) {
	    tag = t;
	} else {
	    System.out.println("Das Datum ist nicht möglich!");
	}
      }
   }
    
    // liegt zwischen 1-13 nur am 13. Monat gibt es nur 5 Tage.
    void setMonat(int m) {
	if (tag < 6 && tag > 0) {
	    if (m == 13) {
		monat = m;
	    } else { if (m > 0 && m < 13) {
		monat = m;
	    } else {
		System.out.println("Das Datum ist nicht möglich!");
	    }
	}
    }
}
    
    int getTag() {
	return tag;
    }
    
    int getMonat() {
	return monat;
    }
    
    //gibt den Namen eines Monats an.
    static String getMonatName(int m) {
	String s = "";
	switch(m) {
	case 1: s = "Praios";
	break;
	case 2: s = "Rondra";
	break;
	case 3: s = "Efferd";
	break;
	case 4: s = "Travia";
	break;
	case 5: s = "Boron";
	break;
	case 6: s = "Hesinde";
	break;
	case 7: s = "Firun";
	break;
	case 8: s = "Tsa";
	break;
	case 9: s = "Phex";
	break;
	case 10: s = "Peraine";
	break;
	case 11: s = "Ingerimm";
	break;
	case 12: s = "Rahja";
	break;
	case 13: s = "Namenloser";
	break;
	}
	return s;
    }
    

    String getGeburtstag(){
	String s = tag + ". " + getMonatName(monat);
	return s;
    }
    
    void randomGebutstag(){
	int b = randomno.nextInt(30) + 1;
	tag = b;
	int m = randomno.nextInt(20) + 1;
	switch(m){
	case 1:
	case 2:
	    monat = 1;
	    break;
	case 3:
	case 4:
	    monat = 2;
	    break;
	case 5:
	case 6:
	    monat = 3;
	    break;
	case 7:
	case 8:
	    monat = 4;
	    break;
	case 9:
	case 10:
	    monat = 5;
	    break;
	case 11:
	    monat = 6;
	    break;
	case 12:
	    monat = 7;
	    break;
	case 13:
	    monat = 8;
	    break;
	case 14:
	case 15:
	case 16:
	    monat = 9;
	    break;
	case 17:
	    monat = 10;
	    break;
	case 18:
	    monat = 11;
	    break;
	case 19:
	    monat = 12;
	    break;
	case 20:
	    int n = randomno.nextInt(20) + 1;
	    if(n < 16){
		monat = 12;
		} else {
		    monat = 13;
		    switch(n){
	    case 16:
		tag = 1;
		break;
	    case 17:
		tag = 2;
		break;
	    case 18:
		tag = 3;
		break;
	    case 19:
		tag = 4;
		break;
	    case 20:
		tag = 5;
		break;
	    }
	}
	setTag(tag);
	setMonat(monat);
	}
    }



}
    
