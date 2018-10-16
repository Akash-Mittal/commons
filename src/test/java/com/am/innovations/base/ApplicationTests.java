// package com.am.innovations.base;
//
// import static org.hamcrest.CoreMatchers.is;
//
// import java.util.logging.Logger;
//
// import org.junit.Assert;
// import org.junit.Test;
// import org.springframework.beans.factory.annotation.Autowired;
//
// @RunWith(SpringRunner.class)
// @SpringBootTest
// @ActiveProfiles("test")
// Disabled Due to https://github.com/Akash-Mittal/commons/issues/1
// public class ApplicationTests {
// Logger logger = Logger.getLogger(ApplicationTests.class.getSimpleName());
//
// @Autowired
// private UserRespository repository;
//
// @Test
// public void testSave() {
// String whoIsCalling = "<Ao-oM> Calling Optimus Prime...";
// User user = repository.save(new User(whoIsCalling));
// Assert.assertNotNull(user);
// Assert.assertThat(user.getName(), is(whoIsCalling));
// Assert.assertNotNull(user.getCreatedAt());
// Assert.assertNotNull(user.getId());
// Assert.assertNotNull(user.getUpdatedAt());
// Assert.assertNotNull(user.getVersion());
// logger.info(user.toString());
// }
//
// }