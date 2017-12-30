/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.job.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.job.entity.Job;

/**
 * 工作DAO接口
 * @author jyj
 * @version 2017-12-26
 */
@MyBatisDao
public interface JobDao extends CrudDao<Job> {
	
}