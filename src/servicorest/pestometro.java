package servicorest;


import java.text.DecimalFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/petomservice")
public class pestometro {
	@GET
	@Produces("application/xml")
	public String transformarpetom() {

		Double pes = 1d;
		Double metro;
		
		metro = pes / 3.28084;
		DecimalFormat f = new DecimalFormat("0.00");
		
		String result = "\n\nFormato XML - Transformar Pé(s): "+ f.format(pes) +" em Metro(s):\n\n" + f.format(metro);
		return "<petomservice>" + "<pes>" + pes + "</pes>" + "<metro>" + metro + "</metro>" + "<petomoutput>" + result + "</petomoutput>" + "</petomservice>";
	}

	@Path("{pe}")
	@GET
	@Produces("application/xml")
	public String convertPetoMfromInput(@PathParam("pe") Double pe) {

		Double pes = pe;
		Double metro;
		
		metro = pes / 3.28084;
		DecimalFormat f = new DecimalFormat("0.00");
		
		String result = "\n\nFormato XML - Transformar Pé(s): "+ f.format(pes) +" em Metro(s):\n\n" + f.format(metro);
		return "<petomservice>" + "<pes>" + pes + "</pes>" + "<metro>" + metro + "</metro>" + "<petomoutput>" + result + "</petomoutput>" + "</petomservice>";
	}
}