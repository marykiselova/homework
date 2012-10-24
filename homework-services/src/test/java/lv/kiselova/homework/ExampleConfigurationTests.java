package lv.kiselova.homework;

import static org.junit.Assert.assertNotNull;

import lv.kiselova.homework.Service;
import lv.kiselova.homework.repository.ItemRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class ExampleConfigurationTests {
	
	@Autowired
	private Service service;
	
	@Autowired
	private ItemRepository itemRepository;
	

	@Test
	public void testSimpleProperties() throws Exception {
		assertNotNull(service);
	}
	
	@Test
	public void testRepositoryConfig(){
		itemRepository.addItem();
	}
	
}
