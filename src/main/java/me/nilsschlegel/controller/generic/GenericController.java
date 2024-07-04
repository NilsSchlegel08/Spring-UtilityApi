/*
 * This Project is under the MIT License.
 * Public repository: github.com/NilsSchlegel08/Spring-UtilityApi
 * Hosted: utils.nilsschlegel.me
 */

/*
 * This Project is under the MIT License.
 * Public repository: github.com/NilsSchlegel08/Spring-UtilityApi
 * Hosted: utils.nilsschlegel.me
 */
package me.nilsschlegel.controller.generic;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * This class is the generic controller for the Utility API.
 * It provides the index and ping routes.
 */

@RestController
public class GenericController {

    /*
     * This method is so you don't get a 404 error when you visit the root of the API.
     */
    @GetMapping("/")
    public ResponseEntity<Map<String, String>> index() {
        Map<String, String> response = new HashMap<>();
        response.put("site", "https://utils.nilsschlegel.me");
        response.put("documentation", "https://github.com/NilsSchlegel08/Spring-UtilityApi");
        response.put("statusCode", "200");
        response.put("status", "success");
        response.put("message", "Welcome to the Utility API");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /*
     * This method is so you can check if the API is online.
     */
    @GetMapping("/ping")
    public ResponseEntity<Map<String, String>> ping() {
        Map<String, String> response = new HashMap<>();
        response.put("statusCode", "200");
        response.put("status", "success");
        response.put("message", "Pong");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}