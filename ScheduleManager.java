package schedule.mvp.com350;

import java.util.Stack;


public class ScheduleManager {


    public User user;
    private Stack<Schedule> editHistory;
    private Stack<Schedule> undoneHistory;
    public Schedule currentSchedule;
    public Search currentSearch;



    public void LoadSchedule(String name) {
        // Load a schedule by name
    }

    private void GetProfessorRatings() {
        // Retrieve and store professor ratings
    }

    private void RetrieveCourseList() {
        // Fetch and store course list
    }

    public boolean CreateEvent(Event e) {
        // Attempt to create an event in the current schedule
        return true; // Placeholder
    }

    public boolean AddCourse(Course c) {
        // Add a course to the current schedule
        return true; // Placeholder
    }

    public void NewSchedule(String name) {
        // Create a new schedule with the given name
    }

    public void RemCourse(Course c) {
        // Remove a course from the schedule
    }

    public void Redo() {
        // Redo last undone action
    }

    public void Undo() {
        // Undo last action
    }


}
