package as.course.db;

import as.course.db.tables.Ticket;
import as.course.db.tables.Train;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP PC on 17.09.2015.
 */
public class DBase {
    static private ConnectionSource source;
    static private Dao<Ticket, String> dao;
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        Class.forName("org.sqlite.JDBC");

        Connection connection = null;
        source = new JdbcConnectionSource("jdbc:sqlite:NewDB.db3");

        dao = new DaoManager().createDao(source,Ticket.class);
        List<Ticket> list = dao.queryForAll();
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
