package servicorest;

import java.text.DecimalFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/mtopolservice")
public class metrotopol {
	@GET
	@Produces("application/xml")
	public String transformarmtopol() {

		Double polegada;
		Double metro = 1d;

		polegada = metro * 39.3701;
		DecimalFormat f = new DecimalFormat("0.00");
		
		String result = "\n\nFormato XML - Transformar Metro(s): "+ f.format(metro) +" em Polegada(s):\n\n" + f.format(polegada);
		return "<mtopolservice>" + "<metro>" + metro + "</metro>" + "<polegada>" + polegada + "</polegada>" + "<mtopoloutput>" + result + "</mtopoloutput>" + "</mtopolservice>";
	}

	@Path("{m}")
	@GET
	@Produces("application/xml")
	public String convertMtoPolfromInput(@PathParam("m") Double m) {

		Double polegada;
		Double metro = m;
		
		polegada = metro * 39.3701;
		DecimalFormat f = new DecimalFormat("0.00");

		String result = "\n\nFormato XML - Transformar Metro(s): "+ f.format(metro) +" em Polegada(s):\n\n" + f.format(polegada);
		return "<mtopolservice>" + "<metro>" + metro + "</metro>" + "<polegada>" + polegada + "</polegada>" + "<mtopoloutput>" + result + "</mtopoloutput>" + "</mtopolservice>";
	}
}