package as.course.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by RTCCD on 24.09.2015.
 */
@DatabaseTable(tableName = "tickettype")
public class TicketType {
    @DatabaseField(generatedId = true)
    private int ID;
    @DatabaseField
    private String Direction;
    @DatabaseField(foreign = true)
    private int TrainID;
    @DatabaseField
    private String DispatchDate;
    @DatabaseField
    private float Cost;
    @DatabaseField
    private int SeatNumber;
    @DatabaseField
    private String DispatchStation;
    @DatabaseField
    private String ArrivalStation;
    @DatabaseField(foreign = true)
    private Wagon WagonID;
    @DatabaseField(foreign = true)
    private Cashbox CashbocID;

}
