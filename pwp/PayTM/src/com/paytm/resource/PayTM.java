package com.paytm.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/wallet")
public class PayTM {
	@GET
	@Produces("text/plain")
	public double getBalance(@QueryParam("mobileNo")String mobileNo) {
		return 50.50;
	}

}
