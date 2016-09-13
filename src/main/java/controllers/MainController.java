package controllers;

import actions.IndexAction;
import actions.RedisTestAction;
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
        return new IndexAction().execute();
    }
    @RequestMapping(value = "/redistest", method = RequestMethod.GET)
    @ResponseBody
    public String RedisTest() {
        return new RedisTestAction().execute();
    }
}
