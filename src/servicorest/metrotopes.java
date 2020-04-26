package servicorest;

import java.text.DecimalFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/mtopeservice")
public class metrotopes {
	@GET
	@Produces("application/xml")
	public String transformarmtope() {

		Double pes;
		Double metro = 1d;
		
		pes = metro * 3.28084;
		DecimalFormat f = new DecimalFormat("0.00");
		
		String result = "\n\nFormato XML - Transformar Metro(s): "+ f.format(metro) +" em Pé(s):\n\n" + f.format(pes);
		return "<mtopeservice>" + "<metro>" + metro + "</metro>" + "<pes>" + pes + "</pes>" + "<mtopeoutput>" + result + "</mtopeoutput>" + "</mtopeservice>";
	}

	@Path("{m}")
	@GET
	@Produces("application/xml")
	public String convertMtoPefromInput(@PathParam("m") Double m) {

		Double pes;
		Double metro = m;
		
		pes = metro * 3.28084;
		DecimalFormat f = new DecimalFormat("0.00");
		
		String result = "\n\nFormato XML - Transformar Metro(s): "+ f.format(metro) +" em Pé(s):\n\n" + f.format(pes);
		return "<mtopeservice>" + "<metro>" + metro + "</metro>" + "<pes>" + pes + "</pes>" + "<mtopeoutput>" + result + "</mtopeoutput>" + "</mtopeservice>";
	}

}