package humanres.db;
public class zaposleni {
   public int id;
   public String ime;
   public int brojGodina;
   public String adresa;
   public double dohodak;  

    @Override
    public String toString() {
        return id + "\t" + ime + "\t" + brojGodina + "\t" + adresa + "\t" + dohodak;
    }
   
}
    