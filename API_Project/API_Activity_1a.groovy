package Groovy_Practices

class API_Activity_1a {
	static void main (def args) {
		//heterogeneous list
		def list = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		
		def List1 = list.minus([11, 2, 19, 5]);
		println ("Sorted String list: " + List1.sort());
		
		def List2 = list.minus(["Mango", "Apple", "Watermelon"]);
		println ("Sorted Integer list: " + List2.sort());
			
	}
}
