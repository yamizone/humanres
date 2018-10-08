package humanres.ui;

import humanres.db.zaposleni;
import java.util.Scanner;


public class ui {
    
    public void updateZaposleni(zaposleni zaposleni){
       Scanner sc = new Scanner(System.in);
        

            System.out.println("Ime zaposlenog: ");
            String ime = sc.nextLine();
            if(!ime.isEmpty()){
                zaposleni.ime = ime;
            }
        
            System.out.println("Unesite broj godina: ");
            int godine = sc.nextInt();
            if(godine >= 0){
                zaposleni.brojGodina = godine;
            }
        
    }
    public zaposleni getZaposleni(){
        zaposleni res = new zaposleni();
        
        Scanner sc = new Scanner(System.in);
        
        while(res.ime == null){
            System.out.println("Ime zaposlenog: ");
            String ime = sc.nextLine();
            if(ime.isEmpty()){
                System.out.println("Ime ne može biti prazno!");
                continue;
        }
        res.ime = ime;
            System.out.println("Unesite broj godina: ");
        res.brojGodina = sc.nextInt();
        }
        
        return res;
    }  
    public int getID(){
        int selectedID = 0;
        Scanner sc = new Scanner(System.in);
         while(true){
             System.out.println("Molim Vas izaberite ID zaposlenog: ");
        try{
            selectedID = Integer.parseInt(sc.nextLine());
            break;
        } catch(Exception ex){
            System.out.println("Molim Vas izaberite validan broj zaposlenog.");
        }
        }
        return selectedID;
    }  
    public int menu(){
        System.out.printf("1. Prikaz zaposlenih %n2. Prikaz zaposlenih po nekom od kriterijuma %n"
                + "3. Izmena zaposlenih na osnovu kriterijuma %n4. Brisanje zaposlenog po osovu kriterijuma %n5. Unos novih zaposlenih %n");
        
        Scanner sc = new Scanner(System.in);
        int selectedOption = 0;
        
        //metod menija
        while(true){
        try{
            selectedOption = Integer.parseInt(sc.nextLine());
                if(selectedOption < 1 || selectedOption > 5){
                    System.out.println("Molim Vas izaberite validan broj menija.");
                    continue;
                }
            break;
        
        } catch(Exception ex){
            System.out.println("Molim Vas izaberite validan broj menija.");
        }
        }
        return selectedOption;
        
    }
}
