package schedule.mvp.com350;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;
    public int idNumber;
    public String major;
    public int year;
    public ArrayList<Schedule> mySchedules;

    public void SaveSchedule(Schedule s) {
        // Save a schedule
    }

    public void DeleteSchedule(Schedule s) {
        // Delete a schedule
    }

    public void RenameSchedule(Schedule s, String name) {
        // Rename a schedule
    }
}