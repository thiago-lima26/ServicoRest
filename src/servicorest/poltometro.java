package servicorest;

import java.text.DecimalFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/poltomservice")
public class poltometro {

	@GET
	@Produces("application/json")
	public Response transformarpoltom() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double metro;
		Double polegada = 1d;
		
		metro = polegada / 39.3701;
		DecimalFormat f = new DecimalFormat("0.00");
		
		jsonObject.put("Metro(s)", f.format(metro));
		jsonObject.put("Polegada(s)", f.format(polegada));

		String result = "@Produces(\"application/json\") Output: \n\nTransformar Polegadas em Metros Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}

	@Path("{p}")
	@GET
	@Produces("application/json")
	public Response convertPoltoMfromInput(@PathParam("p") Double p) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double metro;
		Double polegada = p;

		metro = polegada / 39.3701;
		DecimalFormat f = new DecimalFormat("0.00");
		
		jsonObject.put("Metro(s)", f.format(metro));
		jsonObject.put("Polegada(s)", f.format(polegada));

		String result = "@Produces(\"application/json\") Output: \n\nTransformar Polegadas em Metros Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
}