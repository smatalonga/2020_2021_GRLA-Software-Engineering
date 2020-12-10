package com.uws.softeng.week6.srp.excercise1.solutionInClass;

public class EmployeeLeaveHelperService {

	private static final int CutoffYears = 3;
	private static final int LEAVES_ALLOWED = 27;
	
	public static int calculateReinbursableLeaveDays(int daysTakensofar) {
		return LEAVES_ALLOWED - daysTakensofar;
	}
	
	public static int calculateRemainingLeaveDays(int yearsInOrg, int[] leavesLeftPreviously) {
		int years = CutoffYears;
        if (yearsInOrg < 3) {
            years = yearsInOrg;
        }
        int out_leavesLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
        	out_leavesLeftPreviously += leavesLeftPreviously[yearsInOrg - i - 1];
        }
        return out_leavesLeftPreviously;
	}
	
	
}
