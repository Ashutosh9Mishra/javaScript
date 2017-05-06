import java.util.HashSet;

class Customer{
	String name;
	int id;
	double salary;
	public Customer(String name, int id, double salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString(){
		return "name "+ name +" id "+id+" salary "+salary+" \n";
	}
	
	
	
}


public class HasSetDemo {

	

	

	public static void main(String[] args) {
		HashSet<Customer> obj=new HashSet<>();
		Customer ashu=new Customer("ashutosh",100,200);
		Customer aazam=new Customer("aazam",400,300);
		Customer annu=new Customer("annu",200,400);
		obj.add(ashu);
		obj.add(aazam);
		obj.add(annu);
		System.out.println(obj);
		
	}

}
