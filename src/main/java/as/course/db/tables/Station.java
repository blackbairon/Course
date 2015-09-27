package as.course.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by RTCCD on 24.09.2015.
 */
@DatabaseTable(tableName = "station")
public class Station {
    @DatabaseField(generatedId = true)
    private int ID;
    @DatabaseField
    private String StationName;

}
