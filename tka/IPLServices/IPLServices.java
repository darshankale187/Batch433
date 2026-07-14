package com.tka.IPLServices;

import java.util.List;

import com.tka.IPLEntity.IPLDemo;
import com.tka.IPLdao.IPLDao;

public class IPLServices {
	private IPLDao iplDao;
	public IPLServices() {
	
	}
	public IPLServices(IPLDao iplDao) {
		super();
		this.iplDao = iplDao;
	}
	public IPLDao getIplDao() {
		return iplDao;
	}

	public void setIplDao(IPLDao iplDao) {
		this.iplDao = iplDao;
	}
	public List<IPLDemo> getParcels() {
		return iplDao.getParcels();
	}
}
