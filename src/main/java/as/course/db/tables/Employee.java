package as.course.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by RTCCD on 24.09.2015.
 */
@DatabaseTable(tableName = "employee")
public class Employee {
    @DatabaseField(generatedId = true)
    private int ID;
    @DatabaseField
    private String FullName;
    @DatabaseField
    private String Post;
    @DatabaseField
    private float Salary;
}
