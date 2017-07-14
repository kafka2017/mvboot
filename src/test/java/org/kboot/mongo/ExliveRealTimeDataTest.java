package org.kboot.mongo;

import org.junit.Test;
import org.kboot.bean.ExliveRealTimeData;
import org.kboot.commons.JSONHelper;
import org.kboot.mongodb.ExliveRealTimeDataRepository;
import org.kboot.test.SpringBaseTest;
import org.springframework.beans.factory.annotation.Autowired;

public class ExliveRealTimeDataTest extends SpringBaseTest{

	@Autowired
	ExliveRealTimeDataRepository ercRepository;
	
	@Test
	public void ert(){
		ExliveRealTimeData ex = ercRepository.findById("594120b6efdc8d184044b293");
		System.err.println(JSONHelper.toString(ex));
	}
	
}
