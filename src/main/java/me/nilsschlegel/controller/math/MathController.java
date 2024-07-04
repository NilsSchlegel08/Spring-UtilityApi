/*
 * This Project is under the MIT License.
 * Public repository: github.com/NilsSchlegel08/Spring-UtilityApi
 * Hosted: utils.nilsschlegel.me
 */
package me.nilsschlegel.controller.math;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/pi")
    public ResponseEntity<Map<String, Double>> getPi() {
        return ResponseEntity.ok(Map.of("pi", Math.PI));
    }

    @GetMapping("/e")
    public ResponseEntity<Map<String, Double>> getE() {
        return ResponseEntity.ok(Map.of("e", Math.E));
    }

    @GetMapping("/sqrt/{number}")
    public ResponseEntity<Map<String, Double>> getSqrt(
      @PathVariable("number") double number
    ) {
        if (number < 0) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(Map.of("sqrt", Math.sqrt(number)));
    }
}