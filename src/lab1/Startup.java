package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        Employee employee = new Employee();
        
        //These fields are not used in any way after they are set, so I
        //decided to "remove" them through commenting.
        
        //employee.firstName = "Peter";
        //employee.lastName = "Piper";
        //employee.ssn = "333-1234";
        
        //meetWithHr must come first, because order matters.
        employee.meetWithHr();
        employee.meetDepartmentStaff();
        employee.reviewDeptPolicies();
        //Added a few new employee.'s to test stuff.
        employee.moveIntoCubicle();
        employee.getStatus();

        System.out.println("The employee's status is: " + employee.getStatus());
    }
    
    
}
