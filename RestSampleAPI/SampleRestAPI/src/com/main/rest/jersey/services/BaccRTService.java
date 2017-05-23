package com.main.rest.jersey.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.main.rest.jersey.domain.BaccRT;

@Path("/BaccRTService")
public class BaccRTService {
	
	/*@Inject
	CassendraDbService csdbService;*/
	
	@GET
	@Path("/baccRTInfo")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BaccRT> getBaccRTInfoById() {
		List<BaccRT> baccRtList = new ArrayList<>();
		BaccRT b1 = new BaccRT((long) 1,"mac-id-testdata-1","testdata1");
		BaccRT b2 = new BaccRT((long) 2,"mac-id-testdata-2","testdata2");
		BaccRT b3 = new BaccRT((long) 3,"mac-id-testdata-3","testdata3");
		BaccRT b4 = new BaccRT((long) 4,"mac-id-testdata-4","testdata4");
		BaccRT b5 = new BaccRT((long) 5,"mac-id-testdata-5","testdata5");
		baccRtList.add(b1);
		baccRtList.add(b2);
		baccRtList.add(b3);
		baccRtList.add(b4);
		baccRtList.add(b5);
		return baccRtList;
	}
	
	@GET
	@Path("/baccRTInfoByMacId/{macId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BaccRT> getBaccRTInfoByMacId(@PathParam("macId") String macId) {
		System.out.println("passed Mac Id --------->"+macId);
		List<BaccRT> baccRtList = new ArrayList<>();
		BaccRT b1 = new BaccRT((long) 1,"mac-id-testdata-1","testdata1");
		BaccRT b2 = new BaccRT((long) 2,"mac-id-testdata-2","testdata2");
		BaccRT b3 = new BaccRT((long) 3,"mac-id-testdata-3","testdata3");
		BaccRT b4 = new BaccRT((long) 4,"mac-id-testdata-4","testdata4");
		BaccRT b5 = new BaccRT((long) 5,"mac-id-testdata-5","testdata5");
		baccRtList.add(b1);
		baccRtList.add(b2);
		baccRtList.add(b3);
		baccRtList.add(b4);
		baccRtList.add(b5);
		return baccRtList;
	}
	
	
}
