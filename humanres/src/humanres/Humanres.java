package humanres;

import humanres.db.db;
import humanres.db.zaposleni;
import humanres.ui.ui;
import java.sql.SQLException;
import java.util.Scanner;

public class Humanres {

    public static void main(String[] args) throws SQLException {
//        Scanner sc = new Scanner(System.in);

        zaposleni z = new zaposleni();

        z.id = 2;
        z.adresa = "nema";
        z.brojGodina = 22;
        z.ime = "Internet";
        z.dohodak = 2.2;
        db db = new db();
        db.updateZaposlenih(z);

    }

}
