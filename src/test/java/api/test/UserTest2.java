package api.test;


import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import io.restassured.response.*;
import api.endpoints.UserEndpoints2;
import api.payload.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class UserTest2 {

	
	Faker faker;
	User userPayload;
	public Logger logger;	
	
	@BeforeClass
	public void setupData() {
	
		faker = new Faker();
		userPayload= new User();
		
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setFirstname(faker.name().firstName());
		userPayload.setLastname(faker.name().lastName());
		userPayload.setUsername(faker.name().username());
		userPayload.setPassword(faker.internet().password(5,10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
		
		//Logs
		logger = LogManager.getLogger(this.getClass());
		
	}
	
	
	@Test(priority = 1)
	public void testPostUser() {
	
		logger.info("**************** Creating User *******************");
		Response response = UserEndpoints2.createUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);

		logger.info("**************** User is Created *******************");

	}
	
	@Test(priority = 2)
	public void testGetUserByName() {

		logger.info("**************** Reading User Info *******************");

		Response response = UserEndpoints2.readUser(this.userPayload.getUsername());
		response.then().log().all();
		//getStatus code used in assertion and .statuscode give 200 directly
		Assert.assertEquals(response.getStatusCode(),200);
		logger.info("**************** User Info Displayed *******************");

	}

	
	@Test(priority = 3)
	public void testUpdateUserByName() {
		//update data using payload
		logger.info("****************  User Info Updated *******************");

		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setFirstname(faker.name().firstName());
		userPayload.setLastname(faker.name().lastName());
		
		
		Response response = UserEndpoints2.updateUser(this.userPayload.getUsername(),userPayload);
		//chai assertion 
		response.then().log().body().statusCode(200);
		response.then().log().all();
		response.then().log().body();
		//testng assertion
		Assert.assertEquals(response.getStatusCode(),200);
		//checking data after updation
		
		Response responseafterupdate = UserEndpoints2.readUser(this.userPayload.getUsername());
		responseafterupdate.then().log().all();
		responseafterupdate.then().log().body();
		Assert.assertEquals(responseafterupdate.getStatusCode(),200);
		
		logger.info("****************  User Info Updation Done *******************");
		
	}
	@Test(priority = 4)
	public void testDeleteUserName() {
		logger.info("****************  Deleteing User*******************");

		Response response = UserEndpoints2.deleteUser(this.userPayload.getUsername());
		Assert.assertEquals(response.getStatusCode(),200);
		logger.info("****************  Deleteing User Done *******************");
		
	}

	
	
}
