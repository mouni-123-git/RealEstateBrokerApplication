package com.cg.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.entity.Property;
import com.cg.exception.PropertyNotFoundException;
import com.cg.pojo.PropertyCriteria;
import com.cg.repository.IPropertyRepo;
import com.cg.service.IPropertyService;

public class IPropertyServiceImpl implements IPropertyService {
	@Autowired
	IPropertyRepo repo;

	@Override
	public Property addProperty(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property editProperty(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property removeProperty(int propId) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property viewProperty(int propId) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> listAllProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> listPropertyByCriteria(PropertyCriteria criteria) {
		// TODO Auto-generated method stub
		List<Property> property = repo.findAll();
		return property;
	}

}
