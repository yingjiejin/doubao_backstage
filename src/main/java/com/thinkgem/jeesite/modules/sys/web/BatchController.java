package com.thinkgem.jeesite.modules.sys.web;

import com.thinkgem.jeesite.common.web.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 批量Controller
 */
@Controller
@RequestMapping(value = "${adminPath}/sys/batch")
public class BatchController extends BaseController {

    @RequiresPermissions("sys:menu:view")
    @RequestMapping(value = {"list", ""})
    public String list(Model model) {
        return null;
    }


}
