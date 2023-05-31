package gr.texnikes.rest.texnikes;

public class Product{
	
	private String message;
	
	
	public Product(String message){
		
		super();
		this.message = message;
		
	}
	
	
	public String getMessage(){
		
		return message;
		
	}

	public void setMessage(String message){
		
		this.message = message;
		
	}

}
