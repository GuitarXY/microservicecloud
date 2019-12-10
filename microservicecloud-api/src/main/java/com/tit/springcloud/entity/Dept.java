package com.tit.springcloud.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * @ClassName:  Dept 
 * @author:     卧雪钓月
 * @Description:TODO(这里用一句话描述这个类的作用)  
 * @date:       2019年8月7日 下午2:12:59   
 */
@SuppressWarnings("serial")
//@NoArgsConstructor
//@Data
//@Accessors(chain=true)
//@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class Dept implements Serializable{
    private Long deptno;    //主键
    private String dname;    //部门名称
    private String db_source;  //来源数据库，因为微服务架构 可以一个服务对应 一个数据库，同一个信息被存储到不同数据库

    public Long getDeptno() {
		return deptno;
	}
	public String getDname() {
		return dname;
	}
	public String getDb_source() {
		return db_source;
	}
	public Dept(String dname) {
        super();
        this.dname = dname;
    }
    public Dept() {
        super();
    }
    public Dept(Long deptno,String dname,String db_source) {
        super();
        this.dname = dname;
        this.deptno = deptno;
        this.db_source = db_source;
    }
    public void setDeptno(Long deptno) {
    	 this.deptno = deptno;
    }
    public void setDname(String dname) {
   	 this.dname = dname;
   }
    public void setDb_source(String db_source) {
   	 this.db_source = db_source;
   }
    
/*    
 * 链式写法 在实体类上加上  @Accessors(chain=true)
   public static void main(String[] args) {
        Dept dep = new Dept();
        dep.setDb_source("").setDeptno(123L).setName("部门");
        
    }
*/    
}
