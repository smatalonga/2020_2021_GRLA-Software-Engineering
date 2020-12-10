  package com.uws.softeng.week6.srp.excercise1.solutionInClass;

public class Employee
{
    
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

	public int get_empId() {
		return _empId;
	}

	public void set_empId(int _empId) {
		this._empId = _empId;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public double get_monthlySalary() {
		return _monthlySalary;
	}

	public void set_monthlySalary(double _monthlySalary) {
		this._monthlySalary = _monthlySalary;
	}

	public String get_manager() {
		return _manager;
	}

	public void set_manager(String _manager) {
		this._manager = _manager;
	}

	public int get_leavesTaken() {
		return _leavesTaken;
	}

	public void set_leavesTaken(int _leavesTaken) {
		this._leavesTaken = _leavesTaken;
	}

	public int get_yearsInOrg() {
		return _yearsInOrg;
	}

	public void set_yearsInOrg(int _yearsInOrg) {
		this._yearsInOrg = _yearsInOrg;
	}

	public int[] get_leavesLeftPreviously() {
		return _leavesLeftPreviously;
	}

	public void set_leavesLeftPreviously(int[] _leavesLeftPreviously) {
		this._leavesLeftPreviously = _leavesLeftPreviously;
	}
}
