package gr.texnikes.rest.texnikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController{
	
	@Autowired
	private IProductService productService;
	
	//mapping the getProduct() method to /product
	@GetMapping(value = "/product")
	public String getProduct(){   
		
		String products = productService.findAll();
		
		//returns the product list
		return products;
	}
}