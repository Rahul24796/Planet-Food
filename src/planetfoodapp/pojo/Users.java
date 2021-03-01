
package planetfoodapp.pojo;


public class Users {
    private  static String userId ,userName,empId,password,UserType; 
    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        Users.userId = userId;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        Users.userName = userName;
    }

    public static String getEmpId() {
        return empId;
    }

    public static void setEmpId(String empId) {
        Users.empId = empId;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Users.password = password;
    }

    public static String getUserType() {
        return UserType;
    }

    public static void setUserType(String UserType) {
        Users.UserType = UserType;
    }
 
   
}    

