package com.cubic.training.heirrachy;

 class Motorcycle extends Bicycle {
	
	 String define_me () {
			return "a cycle with an engine.";
		}
		
		Motorcycle () {
			System.out.println("Hello I am a motorcycle, I am "+ define_me ());
			//Bicycle e = new Bicycle();
			//String temp=e.define_me();
					    
			String temp=super.define_me(); 

			
	         System.out.println("My ancestor is a cycle who is "+ temp);
	         
	        
	                           }
		public static void main(String[] args) {
		Motorcycle a = new Motorcycle();
		a.Motorcycle();

}

		private void Motorcycle() {
			// TODO Auto-generated method stub
			
		}}
