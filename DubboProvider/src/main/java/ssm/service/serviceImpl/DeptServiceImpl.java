package ssm.service.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.DeptDao;
import ssm.entity.Dept;
import ssm.service.DeptService;

import java.util.List;
import java.util.Map;

/**
 * className:EmpServiceImpl
 * discriptoin:
 * author:邢博
 * createTime:2018-11-07 15:16
 */
@Service//交给spring管理
public class DeptServiceImpl implements DeptService {

    @Autowired//依赖注入
    private DeptDao deptDao;

    /*@Autowired
    private JedisDao jedisDao;

    @Override
    public List<Dept> getPage(Map map) {
        Object depts = jedisDao.getObject("deptList");
        if(depts!=null){
            System.out.println("缓存中存在，从缓存中取。。。。。");
            return ((List<Dept>) depts);
        }else{
            System.out.println("缓存中不存在，从数据库取，放入缓存。。。。。。。");
            List<Dept> page = deptDao.getPage(map);
            jedisDao.putObject("deptList",page);
            return page;
        }
    }*/
//    @Autowired
//    private JedisClusterInterF jedisClusterInterF;
    @Override
    public List<Dept> getPage(Map map) {
        /*Object depts = jedisClusterInterF.getObject("deptList");
        if(depts!=null){
            System.out.println("缓存中存在，从缓存中取。。。。。");
            return ((List<Dept>) depts);
        }else{
            System.out.println("缓存中不存在，从数据库取，放入缓存。。。。。。。");
            jedisClusterInterF.putObject("deptList",page);*/
            List<Dept> page = deptDao.getPage(map);
            return page;
       // }
    }

}
