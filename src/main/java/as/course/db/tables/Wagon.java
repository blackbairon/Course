package as.course.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by RTCCD on 24.09.2015.
 */
@DatabaseTable(tableName = "wagon")
public class Wagon {
    @DatabaseField(generatedId = true)
    private int ID;
    @DatabaseField
    private String WagonType;
    @DatabaseField
    private float Cost;
    @DatabaseField(foreign = true)
    private Ticket TicketID;
    @DatabaseField(foreign = true)
    private Train TrainID;

}
