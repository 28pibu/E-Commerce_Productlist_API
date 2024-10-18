package com.jvlcode.jvlcraft;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jvlcode.jvlcraft.models.Product;
import com.jvlcode.jvlcraft.repositories.ProductRepository;

@Component // This is to inform to springboot this class is a component.
public class DataSeeder implements CommandLineRunner { // This implement is to call the run method  
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String ...args) throws Exception{
		//Check if the table is empty
		if(productRepository.count()==0) {
			//Seed demo data(Adding data)
			List<Product> products = Arrays.asList(
					new Product("OPPO F21s Pro 5G",245.67,"OPPO F21s Pro 5G is a powerful device with a Ram extension feature, that offers brilliant operational speed to user.",4.5,"Mobile Phones","Amazon",5,15),
					new Product("WRISTIO HD, Bluetooth Calling Smart Watch",150,"Minix watches are exclusively designed to fulfill the advanced tech need of today's generation.",3.5,"Accessories","Amazon",9,5),
					new Product("Dell Inspiron 3511 Laptop",440.57,"Dell Inspiron 3511 11th Generation Intel Core i5-1135G7 Processor (8MB Cache, up to 4.2 GHz); Operation System: windows 10 Home Single Language, English",2,"Laptops","Ebay",9,1),
					new Product("Lenovo IdeaPad Slim 3 Laptop",250.45,"Lenovo IdeaPad Slim 311th Gen Intel core i5-1135G7 | speed: 2.4GHz (Base) - 4.2 GHz (Max) | 4 cores | 8 Threads |8 Mb Cache",4,"Laptops","Ebay",9,12),
					new Product("ASUS VivoBook 15 Laptop",767.32,"ASUS VivoBook 15 15.6-inch (39.62 cm) HD, Dual Core Intel Celeron N4020, Thin and Light Laptop (4GB RAM/256GB SSD/Integrated Graphics/Windows 11 Home/Tranparent Silver/1.8kg), X515",4.5,"Mobile Phones","Amazon",5,15),
					new Product("PTron Newly Launched Tangent Sports, 60Hrs Playtme",15.46,"Gigantic 60+Hours of music playtime on a single charge; BT5.2 Wireless headphones with ENC (Enviromental Noise Cancellation) Technology",4.5,"Mobile Phones","Amazon",5,15),
					new Product("Campus Men's Maxico Running Shoes",10.12,"The high raised back cover with extra padding",3,"Sports","Ebay",6,9)
					);
			productRepository.saveAll(products);//To saving all records
			System.out.println("Demo data Seeded");
		}
	}
}
