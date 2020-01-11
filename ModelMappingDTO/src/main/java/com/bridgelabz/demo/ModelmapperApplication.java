package com.bridgelabz.demo;
import org.modelmapper.ModelMapper;
import com.bridgelabz.dto.UserDTO;
import com.bridgelabz.model.User;

/*************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Implicit Model Mapper
 *
 ***********************************************************************************/
public class ModelmapperApplication {

	public static void main(String[] args) {
		simpleModelMappingDemo();
	}

	private static void simpleModelMappingDemo() {
		User sourceUser = new User(1, "Pramila", "pramila@gmail.com", "86417361");

		UserDTO targetUserDTO = new UserDTO();

		ModelMapper modelMapper = new ModelMapper();

		modelMapper.map(sourceUser, targetUserDTO);

		System.out.println(targetUserDTO.getName());
		System.out.println(targetUserDTO.getEmailAddress());
		System.out.println(targetUserDTO.getMobileNumber());
		System.out.println(targetUserDTO.getUserCity());

		// Here city is getting null because we want it to map explicitely
		// see the ModelmapperExplicitMappingApplication Class
	}
}
