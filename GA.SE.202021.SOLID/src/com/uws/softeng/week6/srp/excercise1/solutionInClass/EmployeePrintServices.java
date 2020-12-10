package com.uws.softeng.week6.srp.excercise1.solutionInClass;

public class EmployeePrintServices {
	
	
	private Employee _EmployeeToPrint;

	public EmployeePrintServices(Employee toPrint) {
		this._EmployeeToPrint = toPrint;
	}
	

    public String prettyPrintEmployeeInHTML()
    {
        String str = "<div>" +
                     "<h1>Employee Info</h1>" +
                     "<div id='emp" + this._EmployeeToPrint.get_empId() + "'>" +
                     "<span>" + this._EmployeeToPrint.get_name() + "</span>" +
                     "<div class='left'>" +
                     "<span>Leaves Left :</span>" +
                     "<span>Annual salary:</span>" +
                     "<span>Manager:</span>" +
                     "<span>Reimbursable leaves:</span>" +
                     "</div>";
        str += "<div class='right'><span>" + (EmployeeLeaveHelperService.calculateReinbursableLeaveDays(this._EmployeeToPrint.get_leavesTaken())) + "</span>";
        str += "<span>" + Math.round(this._EmployeeToPrint.get_monthlySalary() * 12) + "</span>";
        if (this._EmployeeToPrint.get_manager()  != null) {
            str += "<span>" + this._EmployeeToPrint.get_manager() + "</span>";
        } else {
            str += "<span>None</span>";
        }
        str += "<span>" + EmployeeLeaveHelperService.calculateRemainingLeaveDays(this._EmployeeToPrint.get_yearsInOrg(), this._EmployeeToPrint.get_leavesLeftPreviously()) + "</span>";
        return str + "</div> </div>";
    }
    
    /* TODO At HOME
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
    */

}
