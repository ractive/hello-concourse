package ch.local.concourse.helloconcourse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloConcourseApplicationTests {

	private static final Logger LOG = LoggerFactory.getLogger(HelloConcourseApplicationTests.class);

	@Test
	public void contextLoads() {
		LOG.info("Hello concourse test!");
	}

}
