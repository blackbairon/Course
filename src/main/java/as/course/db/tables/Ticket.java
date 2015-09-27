package as.course.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by RTCCD on 23.09.2015.
 */
@DatabaseTable(tableName = "ticket")
public class Ticket{
    private Connection c;
    private String tableName = "Ticket";

    @DatabaseField(generatedId = true)
    private int ID;
    @DatabaseField
    private String Direction;
    @DatabaseField
    private int TrainID;
    @DatabaseField
    private java.sql.Date DispatchDate;
    @DatabaseField
    private float Cost;
    @DatabaseField
    private int SeatNumber;
    @DatabaseField
    private String DispatchStation;
    @DatabaseField
    private String ArrivalStation;
    /*@DatabaseField(foreign = true)
    private int WagonID;
    @DatabaseField(foreign = true)
    private int CashbocID;*/



    public String toString(){
        return tableName.toUpperCase() + "\nDirection: " + Direction + "\nDispatch date: " + DispatchDate
                + "\nCost: " + Cost + "\nSeat number: " + SeatNumber
                + "\nDispatch station: " + DispatchStation + "\nArrival date: " + ArrivalStation;
    }

}
