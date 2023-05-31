package gr.texnikes.rest.texnikes;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{
	
	@Override
	public String findAll() {
		
		String text ="Your Lucky Number is 18";
		
		return text;
		
	}
}
