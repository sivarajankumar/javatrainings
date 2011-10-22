/**
 * Copyright 2011 Joao Miguel Pereira
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package eu.jpereira.trainings.designpatterns.creational.flyweight.dao;


import static org.junit.Assert.*;

import org.junit.Test;

import eu.jpereira.trainings.designpatterns.creational.flyweight.fakes.FakeCityDao;
import eu.jpereira.trainings.designpatterns.creational.flyweight.model.City;
/**
 * @author jpereira
 *
 */
public class FakeCityDaoTest {

	
	@Test
	public void testGetCity() {
		//Create test dao
		Dao<City> dao = createTestDao();
		
		String cityName = "aveiro";
		assertNotNull(dao.findBy("name", cityName));
		assertNotNull(dao.findBy("name", cityName).findNearestStation("111", "112"));
		assertNotNull(dao.findBy("name", cityName).findNearestStation("111", "112").getControler());
		assertEquals("87", dao.findBy("name", cityName).findNearestStation("111", "112").getControler().getHumidityValue());
		
		assertEquals("26", dao.findBy("name", cityName).findNearestStation("111", "112").getControler().getWindValue());
		
		assertEquals("21", dao.findBy("name", cityName).findNearestStation("111", "112").getControler().getTemperatureValue());
		
		
		
	}

	/**
	 * @return
	 */
	private Dao<City> createTestDao() {

		return new FakeCityDao();
	}
	
}
