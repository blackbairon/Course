package as.course.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by RTCCD on 24.09.2015.
 */
@DatabaseTable(tableName = "cashbox")
public class Cashbox {

    @DatabaseField(generatedId = true)
    private int ID;
    @DatabaseField(foreign = true)
    private Station StationID;
    @DatabaseField(foreign = true)
    private Employee EmployeeID;


}
