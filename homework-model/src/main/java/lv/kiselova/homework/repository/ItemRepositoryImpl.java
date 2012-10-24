package lv.kiselova.homework.repository;

import lv.kiselova.homework.Item;
import lv.kiselova.homework.Order;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public Long addItem(){
		Session session = sessionFactory.getCurrentSession();
		Item item = new Item();
		session.save(item);
			
		return item.getId();
	}

}
