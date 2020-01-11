package com.bridgelabz.demo;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import com.bridgelabz.dto.UserDTO;
import com.bridgelabz.model.User;

/*************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Explicit Model Mapper      
 *
 ***********************************************************************************/
public class ModelmapperExplicitMappingApplication {

	public static void main(String[] args) {
		explicitModelMappingDemo();
	}

	private static void explicitModelMappingDemo() {
		User sourceUser = new User(1, "Pramila", "pramila@gmail.com", "86417361", "Mumbai");

		UserDTO targetUserDTO = new UserDTO();

		ModelMapper modelMapper = new ModelMapper();

		modelMapper.addMappings(new PropertyMap<User, UserDTO>() {
			protected void configure() {
				map().setUserCity(source.getCity());
			}
		});

		modelMapper.map(sourceUser, targetUserDTO);

		System.out.println(targetUserDTO.getName());
		System.out.println(targetUserDTO.getEmailAddress());
		System.out.println(targetUserDTO.getMobileNumber());
		System.out.println(targetUserDTO.getUserCity());
	}
}
