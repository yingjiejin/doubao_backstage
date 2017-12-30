/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.job.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.job.entity.Job;
import com.thinkgem.jeesite.modules.job.dao.JobDao;

/**
 * 工作Service
 * @author jyj
 * @version 2017-12-26
 */
@Service
@Transactional(readOnly = true)
public class JobService extends CrudService<JobDao, Job> {

	public Job get(String id) {
		return super.get(id);
	}
	
	public List<Job> findList(Job job) {
		return super.findList(job);
	}
	
	public Page<Job> findPage(Page<Job> page, Job job) {
		return super.findPage(page, job);
	}
	
	@Transactional(readOnly = false)
	public void save(Job job) {
		super.save(job);
	}
	
	@Transactional(readOnly = false)
	public void delete(Job job) {
		super.delete(job);
	}
	
}