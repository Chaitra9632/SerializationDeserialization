package practice;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClass.EmpDetailsObject;
import pojoClass.Spouse;

public class SerializationUsingObject {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		int[] arr = {1234,12345};
		Spouse spouse = new Spouse("ABC", "Xylem", 123);
		
		EmpDetailsObject e3 = new EmpDetailsObject(3, "Chaitra", arr, spouse, "banglore");
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./SampleObject.json"), e3);
	}

}
