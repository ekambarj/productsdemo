package uk.co.o2.tariff;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiError;
import com.wordnik.swagger.annotations.ApiErrors;
import com.wordnik.swagger.annotations.ApiOperation;

import uk.co.o2.vo.Tariff;



@Path("/tariffs")
@Api(value = "/tariffs", description = "Manage Tariff details")
@Produces({MediaType.APPLICATION_JSON})
public class TariffResource {

	@GET
	@Path("/")
	@ApiOperation(value = "Returns list of all available tariffs", notes = "Returns all the tariffs available", responseClass = "uk.co.o2.vo.Tariff" , multiValueResponse = true)
	@ApiErrors(value = { @ApiError(code = 404, reason = "Tariffs not found") })
	@Produces({MediaType.APPLICATION_JSON})
	public List<Tariff> tariff() {
		 return getTariffs();
	}

	@GET
	@Path("/{tariffId}")
	@ApiOperation(value = "Get tariff details by tariff id", 
	notes = "Returns tariff details for the given tariff id", responseClass = "uk.co.o2.vo.Tariff")
    @ApiErrors(value = { @ApiError(code = 400, reason = "Invalid Tariff ID"),
    @ApiError(code = 404, reason = "Tariff not found") })
	@Produces({MediaType.APPLICATION_JSON})
	public Tariff tariff(@PathParam("tariffId") int tariffId) {
		
		 return getTariff(tariffId);
	}

	
	/**
	 * Returns tariff VO
	 * @param tariffId - The tariff id for which tariff details is required
	 * @return Tariff - The tariff data object
	 */
	private Tariff getTariff(int tariffId)
	{
		Tariff tariff = new Tariff();
		tariff.setTariffId(6);
		tariff.setName("O2 Unlimited");
		tariff.setDescription("Free unlimited texts or free unlimited texts and minutes to other O2 numbers in the UK");
		tariff.setType("CONSUMER");
		tariff.setStatus("CURRENT");
		tariff.setAllowance("6");
		
		return tariff;
		
	}
	
	/**
	 * Returns lsit of tariffs
	 * @return List<Tariff> - The list of tariff VO
	 */
	private List<Tariff> getTariffs()
	{
		ArrayList<Tariff> lst = new ArrayList<Tariff>();
		
		Tariff tariff1 = new Tariff();
		tariff1.setTariffId(6);
		tariff1.setName("O2 Unlimited");
		tariff1.setDescription("Free unlimited texts or free unlimited texts and minutes to other O2 numbers in the UK");
		tariff1.setType("CONSUMER");
		tariff1.setStatus("CURRENT");
		tariff1.setAllowance("6");
		
		Tariff tariff2 = new Tariff();
		tariff2.setTariffId(2);
		tariff2.setName("Talkalotmore");
		tariff2.setDescription("Free evening and weekend minutes to standard UK mobiles and standard UK landlines");
		tariff2.setType("CONSUMER");
		tariff2.setStatus("CURRENT");
		tariff2.setAllowance("1");
		
		lst.add(tariff1);
		lst.add(tariff2);
		
		return lst;
		
	}

}
