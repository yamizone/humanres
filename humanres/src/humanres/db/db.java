package humanres.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class db {
    public Connection connect() throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/humanresources", "root", "electricdata");
        return conn;
    }
    
    public void insertZaposlenih(zaposleni zaposleni) throws SQLException{
        Connection conn = connect();
        Statement st = conn.createStatement();
        String query = "insert into humans values(null,'"+zaposleni.ime+"','"+zaposleni.brojGodina+"','"+zaposleni.adresa+"','"+zaposleni.dohodak+"')";
        st.execute(query);
        st.close();
        conn.close();
    }
    
    public void deleteZaposlenih(int id) throws SQLException{
        Connection conn = connect();
        Statement st = conn.createStatement();
        String query = "delete from humans where id = "+id;
        st.execute(query);
        st.close();
        conn.close();
    }
    
    public void updateZaposlenih(zaposleni zaposleni) throws SQLException {
        Connection conn = connect();
        PreparedStatement st = conn.prepareStatement("update humans set ime=?, set godine=?, set adresa=?, set dohodak=? where id=?");
        st.setString(1, zaposleni.ime);
        st.setInt(2, zaposleni.brojGodina);
        st.setString(3, zaposleni.adresa);
        st.setDouble(4, zaposleni.dohodak);
        st.setInt(5, zaposleni.id);
        st.execute();
        st.close();
        conn.close();
    }
}
