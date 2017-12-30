/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.job.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.job.entity.Job;
import com.thinkgem.jeesite.modules.job.service.JobService;

/**
 * 工作Controller
 * @author jyj
 * @version 2017-12-26
 */
@Controller
@RequestMapping(value = "${adminPath}/job/job")
public class JobController extends BaseController {

	@Autowired
	private JobService jobService;
	
	@ModelAttribute
	public Job get(@RequestParam(required=false) String id) {
		Job entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = jobService.get(id);
		}
		if (entity == null){
			entity = new Job();
		}
		return entity;
	}
	
	@RequiresPermissions("job:job:view")
	@RequestMapping(value = {"list", ""})
	public String list(Job job, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Job> page = jobService.findPage(new Page<Job>(request, response), job); 
		model.addAttribute("page", page);
		return "modules/job/jobList";
	}

	@RequiresPermissions("job:job:view")
	@RequestMapping(value = "form")
	public String form(Job job, Model model) {
		model.addAttribute("job", job);
		return "modules/job/jobForm";
	}

	@RequiresPermissions("job:job:edit")
	@RequestMapping(value = "save")
	public String save(Job job, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, job)){
			return form(job, model);
		}
		jobService.save(job);
		addMessage(redirectAttributes, "保存工作成功");
		return "redirect:"+Global.getAdminPath()+"/job/job/?repage";
	}
	
	@RequiresPermissions("job:job:edit")
	@RequestMapping(value = "delete")
	public String delete(Job job, RedirectAttributes redirectAttributes) {
		jobService.delete(job);
		addMessage(redirectAttributes, "删除工作成功");
		return "redirect:"+Global.getAdminPath()+"/job/job/?repage";
	}

}