  package com.uws.softeng.week6.srp.excercise1;

public class Employee
{
    private static final int LEAVES_ALLOWED = 27;
    private int _empId;
    private String _name;
    private double _monthlySalary;
    private String _manager;
    private int _leavesTaken;
    private int _yearsInOrg;
    private int[] _leavesLeftPreviously;


    public Employee(int empId, double monthlySalary, String manager, String name, int leavesTaken,
                    int[] leavesLeftPreviously)
    {
        _empId = empId;
        _name = name;
        _monthlySalary = monthlySalary;
        _manager = manager;
        _leavesTaken = leavesTaken;
        _leavesLeftPreviously = leavesLeftPreviously;
        _yearsInOrg = leavesLeftPreviously.length;
    }

    public String prettyPrintEmployeeInHTML()
    {
        String str = "<div>" +
                     "<h1>Employee Info</h1>" +
                     "<div id='emp" + _empId + "'>" +
                     "<span>" + _name + "</span>" +
                     "<div class='left'>" +
                     "<span>Leaves Left :</span>" +
                     "<span>Annual salary:</span>" +
                     "<span>Manager:</span>" +
                     "<span>Reimbursable leaves:</span>" +
                     "</div>";
        str += "<div class='right'><span>" + (LEAVES_ALLOWED - _leavesTaken) + "</span>";
        str += "<span>" + Math.round(_monthlySalary * 12) + "</span>";
        if (_manager != null) {
            str += "<span>" + _manager + "</span>";
        } else {
            str += "<span>None</span>";
        }
        int years = 3;
        if (_yearsInOrg < 3) {
            years = _yearsInOrg;
        }
        int leavesLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            leavesLeftPreviously += _leavesLeftPreviously[_yearsInOrg - i - 1];
        }
        str += "<span>" + leavesLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
    
    public String prettyPrintEmployeeInHTMLinText() {
    	String str = "Employee Info" + "/n" +
                "----------------------------" +
                "Name:" + _name + "/n" +
                "Leaves Left :" + (LEAVES_ALLOWED - _leavesTaken) + "/n" +
                "Annual salary:" + Math.round(_monthlySalary * 12) +"/n" +
                "Manager:";
    	if (_manager != null) {
    	  str += _manager + "/n";
    	} else {
    	  str += "None /n";
    	}
    	str += "Reimbursable leaves:";           
    	int years = 3;
    	if (_yearsInOrg < 3) {
    		years = _yearsInOrg;
    	}
    	int leavesLeftPreviously = 0;
    	for (int i = 0; i < years; i++) {
    		leavesLeftPreviously += _leavesLeftPreviously[_yearsInOrg - i - 1];
    	}
    	str += leavesLeftPreviously + "/n ----------------------- /n";
		return str;
    }
}
