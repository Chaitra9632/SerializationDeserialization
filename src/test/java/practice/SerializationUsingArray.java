package practice;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClass.EmpDetailsArray;

public class SerializationUsingArray {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		int[] arr = {123,12345};
		EmpDetailsArray e2 = new EmpDetailsArray(2, "Chaitra", arr, "Banglore");
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./SampleArray.json"), e2);
	}
	

}
