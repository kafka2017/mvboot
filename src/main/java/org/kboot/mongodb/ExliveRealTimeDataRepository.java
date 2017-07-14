package org.kboot.mongodb;

import org.kboot.bean.ExliveRealTimeData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExliveRealTimeDataRepository extends MongoRepository<ExliveRealTimeData,String> {

	public ExliveRealTimeData findById(String id);
}
