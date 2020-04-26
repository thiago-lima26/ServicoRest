package servicorest;

import java.text.DecimalFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/poltopeservice")
public class poltopes {
	@GET
	@Produces("application/xml")
	public String transformarpoltopes() {

		Double pes;
		Double polegada = 1d;
		
		pes = polegada * 0.0833333;
		DecimalFormat f = new DecimalFormat("0.00");
		
		String result = "\nFormato XML - Transformar Polegada(s): "+ f.format(polegada) +" em Pé(s):\n" + f.format(pes);
		return "<poltopeservice>" + "<polegada>" + polegada + "</polegada>" + "<pes>" + pes + "</pes>" + "<poltopeoutput>" + result + "</poltopeoutput>" + "</poltopeservice>";
	}

	@Path("{pe}")
	@GET
	@Produces("application/xml")
	public String convertPoltoPefromInput(@PathParam("pe") Double pe) {

		Double pes;
		Double polegada = pe;
		
		pes = polegada * 0.0833333;
		DecimalFormat f = new DecimalFormat("0.00");
		
		String result = "\nFormato XML - Transformar Polegada(s): "+ f.format(polegada) +" em Pé(s):\n" + f.format(pes);
		return "<poltopeservice>" + "<polegada>" + polegada + "</polegada>" + "<pes>" + pes + "</pes>" + "<poltopeoutput>" + result + "</poltopeoutput>" + "</poltopeservice>";
	}
}