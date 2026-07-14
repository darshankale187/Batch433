package com.tka.IPLdao;

import java.util.ArrayList;
import java.util.List;

import com.tka.IPLEntity.IPLDemo;

public class IPLDao {
	public  List<IPLDemo> getParcels() {
		List<IPLDemo> list= new ArrayList<>();
		list.add(new IPLDemo(7, "MS Dhoni", "CSK", 10000));
		list.add(new IPLDemo(18, "Virat Kohli", "RCB", 12000));
		list.add(new IPLDemo(45, "Rohit Sharma", "MI", 5000));
		list.add(new IPLDemo(1, "KL Rahul", "DC", 2000));
		list.add(new IPLDemo(99, "Hardik Pandya", "MI", 3000));
		return list;
	}
}
