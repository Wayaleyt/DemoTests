package api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.*;

public class APITest {
    private final String url = "https://reqres.in";

    @DisplayName("Создание пользователя")
    @Test
    void userCreationTest() {
        String creds = "{ \"name\": \"test\", \"job\": \"tester\" }";
        given()
                .baseUri(url)
                .contentType(JSON)
                .body(creds)
                .post("/api/users")
                .then()
                .statusCode(201)
                .body("name", is("test"));

    }

    @DisplayName("Обновление пользователя")
    @Test
    void userUpdateTest() {
        String creds = "{ \"name\": \"test\", \"job\": \"dishwasher\" }";
        given()
                .baseUri(url)
                .contentType(JSON)
                .body(creds)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .body("job", is("dishwasher"));

    }

    @DisplayName("Удаление пользователя")
    @Test
    void userDeleteTest() {
        given()
                .baseUri(url)
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204)
                .assertThat().body(emptyOrNullString());
    }

    @DisplayName("Проверка имени пользователя")
    @Test
    void checkUserNameTest() {
        given()
                .baseUri(url)
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200)
                .body("data.first_name", is("Janet"));
    }

    @DisplayName("Регистрация пользователя")
    @Test
    void userRegisterTest() {
        String creds = "{\"email\": \"eve.holt@reqres.in\",\"password\": \"pistol\"}";
        given()
                .baseUri(url)
                .contentType(JSON)
                .body(creds)
                .when()
                .post("/api/register")
                .then()
                .statusCode(200)
                .body("token", is(notNullValue()));

    }

    @DisplayName("Проверка несуществующего пользователя")
    @Test
    void checkUserNotFoundTest() {
        given()
                .baseUri(url)
                .when()
                .get("https://reqres.in/api/users/23")
                .then()
                .statusCode(404)
                .assertThat().body(is("{}"));
    }


}
