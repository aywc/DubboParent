package ssm.entity;

import java.io.Serializable;

/**
 * className:Dept
 * discriptoin:
 * author:邢博
 * createTime:2018-12-29 16:56
 */
public class Dept implements Serializable {
    private Integer deptNo;
    private String dname;
    private String loc;

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
