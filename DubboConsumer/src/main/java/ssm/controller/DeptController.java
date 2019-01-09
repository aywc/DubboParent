package ssm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.service.DeptService;

/**
 * className:DeptController
 * discriptoin:
 * author:邢博
 * createTime:2018-12-29 17:07
 */
@Controller
public class DeptController {

    @Autowired
    DeptService deptService;

    @ResponseBody
    @RequestMapping("list")
    public Object list(){
        return deptService.getPage(null);
    }

    @RequestMapping("toList")
    public String toList(){
        return "dept/list";
    }
}
