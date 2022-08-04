class checkArray{
	public static void main(String args[]){
	int a[] ={10,20,30};
	int b[] ={10,20,30};

	boolean result = true;
	if(a.length == b.length){
		for(int i=0;i<=a.length-1;i++){
		if(a[i] != b[i]){
		result=false;
		}
	}
	}
	else{
	result = false;
	}
	if(result == true){
	System.out.println("array is equal");
	}else{
	System.out.println("array is not equal");
	}
}
}