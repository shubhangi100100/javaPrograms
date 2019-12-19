package com.eshop.Controllers;

	
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import com.eshop.Daos.ProductDao;
    import com.eshop.OnlineStore_Backend.Product;

@Controller
public class HomeController {
	
		@Autowired
		ProductDao productDao;
		
		@RequestMapping(value="/", method= RequestMethod.GET)
		public String addProduct(ModelMap map) {
			map.addAttribute("myData", "welcome to our product store");
			return "HomePage";
		}
		
		@RequestMapping(value="/SignUp", method= RequestMethod.GET)
		public String newProduct(ModelMap map) {
			map.addAttribute("uObj", new Product());
			return "RegisterPage";
		
		
		}
		
		@RequestMapping(value="/registerProduct", method=RequestMethod.POST)
		public String addNewProduct(ModelMap map, Product uObj) {
			productDao.addProduct(uObj);
			map.addAttribute("msg", "You have successfully registered the product");
			return "Success";
		}
		
		@RequestMapping(value="/AllProd", method=RequestMethod.GET)
		public String allProducts(ModelMap map) {
			List<Product> pObj= productDao.getAllProducts();
			map.addAttribute("msg", pObj);
		 return "ProdList";
		 
			
			
			
		}
		@RequestMapping(value="/UpdateProd", method=RequestMethod.GET)
		public String updateProduct(ModelMap map, Product uObj) {
			productDao.updateProduct(uObj);
			map.addAttribute("msg", "Product deleted successfully");
			return "Updated";
			
		}
		
		
	}


