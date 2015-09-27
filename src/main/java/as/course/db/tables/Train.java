package as.course.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by RTCCD on 24.09.2015.
 */
@DatabaseTable(tableName = "train")
public class Train {
    @DatabaseField(generatedId = true)
    private int ID;
    @DatabaseField
    private String Direction;
    @DatabaseField
    private int SeatNumber;
    @DatabaseField
    private String DispatchDate;
    @DatabaseField
    private String ArrivalDate;
    @DatabaseField(foreign = true)
    private int EmployeeID;
}
