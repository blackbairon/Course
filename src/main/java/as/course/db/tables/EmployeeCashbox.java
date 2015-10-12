package as.course.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by RTCCD on 24.09.2015.
 */
@DatabaseTable(tableName = "employee-cashbox")
public class EmployeeCashbox {
    @DatabaseField(generatedId = true, foreign = true)
    private Cashbox CashboxID;
    @DatabaseField(foreign = true)
    private Employee EmployeeID;
}
