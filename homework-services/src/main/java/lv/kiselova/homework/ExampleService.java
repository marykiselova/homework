package lv.kiselova.homework;

import lv.kiselova.homework.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


/**
 * {@link Service} with hard-coded input data.
 */
@Component
public class ExampleService implements Service {
	
	@Autowired
	private ItemRepository itemRepository;
	
	
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return "Hello world!";	
	}

	public Long addItem(String itemName) {
		return itemRepository.addItem();
	}

}
