package ai.jobiak.empapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/catalog")
public class Product {

@GetMapping("/mobile")
public String showCatalog()
{
return new String("Samsung E2FH,Dual Camera,32GB Memory,49,999,I got you");	
}
	
@GetMapping("/intro")
public String introduction()
{
return new String("The #1 Manufactures of Digital Modiles in Asia");	
}
	
@GetMapping("/search/{modelId}")
public String searchModel(@PathVariable(value="modelId")String ModelId)
{
return new String(ModelId+"it is avaliable in Blue and Black colors,canb be delivetred in 24 hours");	
}
	

@GetMapping("/search/{modelId}/brand/{brand}")
public String searchModel(@PathVariable(value="modelId")String ModelId,@PathVariable(value="brand")String brand)
{
return new String("Mobile Id:"+ModelId+" Phone Brand: "+brand+"Currently not available for your location");	
}


























}
