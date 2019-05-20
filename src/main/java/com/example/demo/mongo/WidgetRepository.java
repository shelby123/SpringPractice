package com.example.demo.mongo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface WidgetRepository extends CrudRepository<Widget, Long>{

	List<Widget> findByNumparts(int numparts);
	
	Widget findOneById(String id);
}
