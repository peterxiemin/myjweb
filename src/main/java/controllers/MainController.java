package controllers;

import actions.IndexAction;
import actions.MysqlTestAction;
import actions.RedisTestAction;
import actions.RestClientTestAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by peter on 2016/9/9.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String Index() {
        return "Hello World";
    }

    @RequestMapping(value = "/mysqltest", method = RequestMethod.GET)
    @ResponseBody
    public String MysqlTest() {
        return new MysqlTestAction().execute();
    }


    @RequestMapping(value = "/redistest", method = RequestMethod.GET)
    @ResponseBody
    public String RedisTest() {
        return new RedisTestAction().execute();
    }

    @RequestMapping(value = "/restclientest", method = RequestMethod.GET)
    @ResponseBody
    public String RestClientTest() {
        return new RestClientTestAction().execute();
    }
}
