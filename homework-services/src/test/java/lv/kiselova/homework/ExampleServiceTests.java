package lv.kiselova.homework;

import org.springframework.beans.factory.annotation.Autowired;

import lv.kiselova.homework.ExampleService;
import lv.kiselova.homework.repository.ItemRepository;
import junit.framework.TestCase;

public class ExampleServiceTests extends TestCase {

	private ExampleService service = new ExampleService();
	

	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", service.getMessage());
	}

}
