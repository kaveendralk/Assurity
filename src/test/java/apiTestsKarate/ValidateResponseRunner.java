package apiTestsKarate;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateResponseRunner {
	@Test
    public void testParallel() {
        Results results = Runner.path("classpath:/apiTestsKarate").tags("~@ignore").parallel(1);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }
}
