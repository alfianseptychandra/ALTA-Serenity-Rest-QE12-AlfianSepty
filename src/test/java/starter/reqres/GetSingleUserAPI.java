package starter.reqres;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

public class GetSingleUserAPI {

    public static String GET_SINGLE_USER = Constants.BASE_URL+"/api/users/{id}";

    @Step("Get single user")
    public void getSingleUser(int id){
        SerenityRest.given()
                .pathParam("id",id);
    }
}
