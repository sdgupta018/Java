class DataHiding{
	
	public static void main(String Args[]){
		
		DHExample obj = new DHExample();
		obj.i=10;
		obj.setJ(20);
		obj.setJ(20, "Value sent.");
		
		System.out.println("Obj.i: " + obj.i);
		System.out.println("Obj.j: " + obj.getJ());
	}
}

class DHExample{
	
	public int i;
	private int j;
	
	public void setJ(int val){
	
		j=val;
		System.out.println(msg);
	}
	
	public void setJ(int val, String msg){
	
		j=val;
		System.out.println(msg);
	}
	
	public int getJ(){
		return j;
	}
}