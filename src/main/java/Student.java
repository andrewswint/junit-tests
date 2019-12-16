public class Student {

    private long userID;
    private String userName;
    private double userGrade;

    public Student(long userID, String userName, double userGrade) {
        this.userID = userID;
        this.userName = userName;
        this.userGrade = userGrade;
    }

    public long getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public double getUserGrade() {
        return userGrade;
    }

}
