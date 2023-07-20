package com.contact.contact_service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;
import com.contact.contact_service.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list = List.of(
			new Contact(1l,"nikhil@gmail","nikhil",1l),
			new Contact(2l,"amit@gmail","amit",1l),
			new Contact(3l,"jadhav@gmail","nikhil",1l)
			
			);
	@Override
	public List<Contact> getContactOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact-> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
