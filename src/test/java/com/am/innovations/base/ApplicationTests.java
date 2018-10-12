package com.am.innovations.base;

import static org.hamcrest.CoreMatchers.is;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class ApplicationTests {
    Logger logger = Logger.getLogger(ApplicationTests.class.getSimpleName());

    @Autowired
    private UserRespository repository;

    @Test
    public void testSave() {
        String whoIsCalling = "<Ao-oM> Calling Optimus Prime...";
        User user = repository.save(new User(whoIsCalling));
        Assert.assertNotNull(user);
        Assert.assertThat(user.getName(), is(whoIsCalling));
        Assert.assertNotNull(user.getCreatedAt());
        Assert.assertNotNull(user.getId());
        Assert.assertNotNull(user.getUpdatedAt());
        Assert.assertNotNull(user.getVersion());
        logger.info(user.toString());
    }

}