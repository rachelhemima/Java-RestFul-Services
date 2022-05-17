package ai.jobiak.lombok.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
//@ToString(exclude= {"custId"})
//@EqualsAndHashCode
//@ReqArgsConstructor
@Data
public class Customer 
{
	@Setter
	@Getter
	private Long custId;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	private double balance;





}