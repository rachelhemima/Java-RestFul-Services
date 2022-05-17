package ai.jobiak.lombok.model;
import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class Product {

	private int productId;
	private String description;
	private double price;
	
}
