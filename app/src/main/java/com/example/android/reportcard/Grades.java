package com.example.android.reportcard;

public class Grades {
    /** The courses*/
    private String mCourses;
    /** The grades*/
    private String mGrades;


    /**
     *
     * Create a new grades object
     * @param Courses
     * @param Grades
     */
    public Grades(String Courses,String Grades){

        mCourses = Courses;

        mGrades = Grades;

    }

    /**
     * Get the courses
     * @return
     */
    public String getmCourses() {
        return mCourses;
    }

    /**
     *
     * Get the grades
     * @return
     */
    public String getmGrades() {
        return mGrades;
    }
}
