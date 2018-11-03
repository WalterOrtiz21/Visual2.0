package api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
@Path("/estudiante")
public class Servicios {
	@POST
	@Path("/agregar")
	@Consumes("application/json")
			public Response agregarProducto(String json){
				ABMestudiante ABMestudiante= new  ABMestudiante();
				Gson gson= new Gson();
				System.out.println(json);
				Entidad estudiante =gson.fromJson(json, Entidad.class);
				boolean respuesta = ABMestudiante.agregarproducto(estudiante.getNombre_compleo(),estudiante.getCi(),estudiante.getFacultad(),estudiante.getPromocion());
						if(respuesta)
							return Response.status(200).entity("Se agregoo").build();
						return Response.status(407).entity("No se puedo agregar el estudiante").build();
				}
				

}

