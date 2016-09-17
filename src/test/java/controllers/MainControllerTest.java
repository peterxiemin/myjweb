package controllers;

import org.apache.log4j.chainsaw.Main;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 2016/9/17.
 */
public class MainControllerTest {
    private MainController mt = new MainController();
    @Test
    public void index() throws Exception {
        System.out.println(mt.Index());
    }

    @Test
    public void mysqlTest() throws Exception {

    }

    @Test
    public void redisTest() throws Exception {

    }

}