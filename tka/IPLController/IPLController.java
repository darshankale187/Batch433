package com.tka.IPLController;
import com.tka.IPLdao.IPLDao;
import com.tka.IPLServices.IPLServices;
import com.tka.IPLEntity.IPLDemo;
public class IPLController {
	private IPLServices iplServices;
	public IPLController() {
	
	}
	public IPLController(IPLServices iplServices) {
		super();
		this.setIplServices(iplServices);
	}
	public IPLServices getIplServices() {
		return iplServices;
	}
	public void setIplServices(IPLServices iplServices) {
		this.iplServices = iplServices;
	}
	public void displaYPlayers() {
		for(IPLDemo player: iplServices.getParcels()) {
			System.out.println(player);
		}
	}
	public static void main(String[] args) {
		IPLDao iplDao = new IPLDao();
		IPLServices iplServices = new IPLServices(iplDao);
		IPLController iplController = new IPLController(iplServices);
		iplController.displaYPlayers();
	}

}
