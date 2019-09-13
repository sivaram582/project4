
public class Employee_details implements Company
{
	int employee_id;
	String employee_name;
	String employee_address;
	int companyid;
	String company_address;
	String company_counrty;
	
	public void employee1_details(int empid, String empname, String empadd)
	{
		this.employee_id=empid;
		this.employee_name=empname;
		this.employee_address=empadd;
		
		
	}
	public void employee2_details(int empid, String empname, String empadd)
	{
		this.employee_id=empid;
		this.employee_name=empname;
		this.employee_address=empadd;
	}
	@Override
	public void companydetails(int company_id) 
	{
		// TODO Auto-generated method stub
		this.companyid=company_id;
		
		
		
		
	}
	
	@Override
	public void companyaddress(String companyadd, String companycount) 
	{
		this.company_address=companyadd;
		this.company_counrty=companycount;
		
		
	}

}
