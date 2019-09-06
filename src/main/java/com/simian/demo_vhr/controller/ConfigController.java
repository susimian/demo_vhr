package com.simian.demo_vhr.controller;

import com.simian.demo_vhr.pojo.Menu;
import com.simian.demo_vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    MenuService menuService;
    @RequestMapping("sysmenu")
    public List<Menu> sysmenu(){
        return menuService.getMenusByHrId();
    }
}
