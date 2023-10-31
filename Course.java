package code;

class Course {
    private String courseName;
    // Constructor to set the initial course name

    public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }
}
