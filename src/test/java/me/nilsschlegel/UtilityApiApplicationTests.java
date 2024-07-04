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

package me.nilsschlegel;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Repeat;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UtilityApiApplicationTests {

    private final Random random = new Random();

    @Test
    @DisplayName("Context loads")
    @Repeat(5)
    void contextLoads() {
        boolean current = random.nextBoolean();

        if (current) {
            assertThat(current).isTrue();
        } else {
            assertThat(current).isFalse();
        }
    }
}
