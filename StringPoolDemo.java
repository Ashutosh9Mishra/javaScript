import java.util.ArrayList;

class Pool{
	String name;
	int id;
	static private ArrayList<Pool> poollist = new ArrayList<>();
	
	static public Pool Intern(String name,int id){
		
		if(poollist.size()==0){
			Pool obj = new Pool(name, id);	
			poollist.add(obj);
			System.out.println("Fresh Object");
			return obj;
		}
		else
		{
			for(Pool obj1:poollist){
				Pool obj = new Pool(name, id);	
				if(obj1.id==id&&obj1.name.equals(name)){
					System.out.println("Obj is already present in list");
					return obj1;
				}
				else{
					poollist.add(obj);
					System.out.println("New Object  add in the list");
				
					return obj;}
				
			}
		}
		return null;
	}
	
	public Pool(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	
}


public class StringPoolDemo {

	public static void main(String[] args) {
		Pool obj1 = Pool.Intern("aazam", 12);
		Pool obj2 = Pool.Intern("ahutosh", 22);
		Pool obj3 = Pool.Intern("aazam", 12);
		Pool obj4 = Pool.Intern("tejus", 32);
		if(obj1==obj2){
			System.out.println("same");
		}
		else{
			System.out.println("Diff");
		}
		if(obj1==obj3){
			System.out.println("same");
		}
		else{
			System.out.println("Diff");
		}
	    
//		String s = "aazam";
//		String s1 = "aazam";
//		
//		if(s==s1){
//			System.out.println("same");
//		}
//		else
//		{
//			System.out.println();
//		}
		
	}

}
