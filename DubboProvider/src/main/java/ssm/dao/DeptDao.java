package ssm.dao;

import ssm.entity.Dept;

import java.util.List;
import java.util.Map;

/**
 * className:DeptDao
 * discriptoin:
 * author:zz
 * createTime:2018-12-29 16:58
 */
public interface DeptDao {
    /**
     * 员工列表
     * @return
     */
    List<Dept> getPage(Map map);

}
