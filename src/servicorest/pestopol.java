package servicorest;

import java.text.DecimalFormat;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/petopolservice")
public class pestopol {
	@GET
	@Produces("application/xml")
	public String transformarmtopol() {

		Double polegada;
		Double pes = 1d;

		polegada = pes * 12;
		DecimalFormat f = new DecimalFormat("0.00");
		
		String result = "\n\nFormato XML - Transformar Pé(s): "+ f.format(pes) +" em Polegada(s):\n\n" + f.format(polegada);
		return "<petopolservice>" + "<pes>" + pes + "</pes>" + "<polegada>" + polegada + "</polegada>" + "<petopoloutput>" + result + "</petopoloutput>" + "</petopolservice>";
	}

	@Path("{pe}")
	@GET
	@Produces("application/xml")
	public String convertMtoPolfromInput(@PathParam("pe") Double pe) {

		Double polegada;
		Double pes = pe;

		polegada = pes * 12;
		DecimalFormat f = new DecimalFormat("0.00");
		
		String result = "\n\nFormato XML - Transformar Pé(s): "+ f.format(pes) +" em Polegada(s):\n\n" + f.format(polegada);
		return "<petopolservice>" + "<pes>" + pes + "</pes>" + "<polegada>" + polegada + "</polegada>" + "<petopoloutput>" + result + "</petopoloutput>" + "</petopolservice>";
	}
}