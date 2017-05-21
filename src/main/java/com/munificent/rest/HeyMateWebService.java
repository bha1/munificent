package com.munificent.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.munificent.string.StringOperationAPI;

@Path("/heymate")
public class HeyMateWebService {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg){
		String output = "Jersey says :"+msg;
		
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/subseq/{subSequence}/{superString}")
	public Response containsSubSequence(@PathParam("subSequence") String subSequence,@PathParam("superString") String superString){
		StringOperationAPI api = new StringOperationAPI();
		String output = subSequence + " present in " + superString + " : " + api.containsSubSequence(subSequence, superString) ;
		
		return Response.status(200).entity(output).build();
	}
}
