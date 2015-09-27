package as.course.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by RTCCD on 24.09.2015.
 */
@DatabaseTable(tableName = "employee-train")
public class EmployeeTrain {
    @DatabaseField(generatedId = true, foreign = true)
    private int TrainID;
    @DatabaseField(generatedId = true, foreign = true)
    private int EmployeeID;
}
