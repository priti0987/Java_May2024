package api.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import api.payload.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DDtests {

	@Test(priority=1,dataProvider ="Data",dataProviderClass=DataProviders.class)
	public void testPostuser(String UserdID,String FirstName,String UserName,String LastName, String Email,String Password, String Phone
) {

		User userPayload = new User();
		userPayload.setId(Integer.parseInt(UserdID));
		userPayload.setUsername(UserName);
		userPayload.setFirstname(FirstName);
		userPayload.setLastname(LastName);
		userPayload.setEmail(Email);
		userPayload.setPassword(Password);
		userPayload.setPhone(Phone);
		
		Response response =UserEndpoints.createUser(userPayload);
		Assert.assertEquals(response.getStatusCode(), 200);
		}
	
	@Test(priority =2,dataProvider = "UserNames",dataProviderClass=DataProviders.class)
	public void testDeleteUserByName(String userName)
	{
		//System.out.println(userName);
		Response response = UserEndpoints.deleteUser(userName);
		
		
		Assert.assertEquals(response.getStatusCode(),404);		
	}
		
}
