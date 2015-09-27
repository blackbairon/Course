package as.course.db.tables;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by RTCCD on 23.09.2015.
 */
public interface Table {
    ArrayList<String> getAll() throws SQLException;
    void insertData(String data);

}
