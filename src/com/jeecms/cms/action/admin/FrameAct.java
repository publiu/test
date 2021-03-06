package com.jeecms.cms.action.admin;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeecms.common.util.MapUtil;
@Controller
public class FrameAct {
	// 洗衣机管理
	@RequiresPermissions("frame:machine_main")
	@RequestMapping("/frame/machine_main.do")
	public String machineMain(ModelMap model) {
		return "frame/machine_main";
	}
	
	@RequiresPermissions("frame:machine_left")
	@RequestMapping("/frame/machine_left.do")
	public String machineLeft(ModelMap model) {
		return "frame/machine_left";
	}

	@RequiresPermissions("frame:machine_right")
	@RequestMapping("/frame/machine_right.do")
	public String machineRight(ModelMap model) {
		return "frame/machine_right";
	}
	// 交易管理
	@RequiresPermissions("frame:trade_main")
	@RequestMapping("/frame/trade_main.do")
	public String tradeMain(ModelMap model) {
		return "frame/trade_main";
	}
	
	@RequiresPermissions("frame:trade_left")
	@RequestMapping("/frame/trade_left.do")
	public String tradeLeft(ModelMap model) {
		return "frame/trade_left";
	}

	@RequiresPermissions("frame:trade_right")
	@RequestMapping("/frame/trade_right.do")
	public String tradeRight(ModelMap model) {
		return "frame/trade_right";
	}
	
	@RequiresPermissions("frame:other_main")
	@RequestMapping("/frame/other_main.do")
	public String otherMain(ModelMap model) {
		return "frame/other_main";
	}

	@RequiresPermissions("frame:other_left")
	@RequestMapping("/frame/ohter_left.do")
	public String otherLeft(ModelMap model) {
		return "frame/other_left";
	}

	@RequiresPermissions("frame:other_right")
	@RequestMapping("/frame/other_right.do")
	public String otherRight(ModelMap model) {
		return "frame/other_right";
	}
	
	@RequiresPermissions("frame:config_main")
	@RequestMapping("/frame/config_main.do")
	public String configMain(ModelMap model) {
		return "frame/config_main";
	}

	@RequiresPermissions("frame:config_left")
	@RequestMapping("/frame/config_left.do")
	public String configLeft(ModelMap model) {
		return "frame/config_left";
	}

	@RequiresPermissions("frame:config_right")
	@RequestMapping("/frame/config_right.do")
	public String configRight(ModelMap model) {
		return "frame/config_right";
	}

	@RequiresPermissions("frame:user_main")
	@RequestMapping("/frame/user_main.do")
	public String userMain(ModelMap model) {
		return "frame/user_main";
	}

	@RequiresPermissions("frame:user_left")
	@RequestMapping("/frame/user_left.do")
	public String userLeft(ModelMap model) {
		return "frame/user_left";
	}

	@RequiresPermissions("frame:user_right")
	@RequestMapping("/frame/user_right.do")
	public String userRight(ModelMap model) {
		return "frame/user_right";
	}

	@RequiresPermissions("frame:maintain_main")
	@RequestMapping("/frame/maintain_main.do")
	public String maintainMain(ModelMap model) {
		return "frame/maintain_main";
	}

	@RequiresPermissions("frame:maintain_left")
	@RequestMapping("/frame/maintain_left.do")
	public String maintainLeft(ModelMap model) {
		model.addAttribute("db", db);
		return "frame/maintain_left";
	}

	@RequiresPermissions("frame:maintain_right")
	@RequestMapping("/frame/maintain_right.do")
	public String maintainRight(ModelMap model) {
		return "frame/maintain_right";
	}	

	@RequiresPermissions("frame:content_main")
	@RequestMapping("/frame/content_main.do")
	public String contentMain(String source,ModelMap model) {
		model.addAttribute("source", source);
		return "frame/content_main";
	}
	
	@RequiresPermissions("frame:statistic_main")
	@RequestMapping("/frame/statistic_main.do")
	public String statisticMain(ModelMap model) {
		return "frame/statistic_main";
	}
	
	@RequiresPermissions("frame:statistic_left")
	@RequestMapping("/frame/statistic_left.do")
	public String statisticLeft(){
		return "frame/statistic_left";
	}
	
	@RequiresPermissions("frame:statistic_right")
	@RequestMapping("/frame/statistic_right.do")
	public String statisticRight(){
		return "frame/statistic_right";
	}
	
	@RequiresPermissions("frame:monitorpoint_main")
	@RequestMapping("/frame/monitorpoint_main.do")
	public String monitorpointMain(ModelMap model) {
		return "frame/monitorpoint_main";
	}
	
	@RequiresPermissions("frame:monitorpoint_left")
	@RequestMapping("/frame/monitorpoint_left.do")
	public String monitorpointLeft(){
		return "frame/monitorpoint_left";
	}
	
	@RequiresPermissions("frame:car_main")
	@RequestMapping("/frame/car_main.do")
	public String carMain(ModelMap model) {
		return "frame/car_main";
	}
	
	@RequiresPermissions("frame:car_left")
	@RequestMapping("/frame/car_left.do")
	public String carLeft(){
		return "frame/car_left";
	}
	
	@RequiresPermissions("frame:order_main")
	@RequestMapping("/frame/order_main.do")
	public String orderMain(ModelMap model) {
		return "frame/order_main";
	}
	
	@RequiresPermissions("frame:order_left")
	@RequestMapping("/frame/order_left.do")
	public String orderLeft(){
		return "frame/order_left";
	}
	
	@RequiresPermissions("frame:business_main")
	@RequestMapping("/frame/business_main.do")
	public String businessMain(ModelMap model) {
		return "frame/business_main";
	}
	
	@RequiresPermissions("frame:business_left")
	@RequestMapping("/frame/business_left.do")
	public String businessLeft(){
		return "frame/business_left";
	}
	
	@RequiresPermissions("frame:expand_main")
	@RequestMapping("/frame/expand_main.do")
	public String expandMain(ModelMap model) {
		return "frame/expand_main";
	}
	
	@RequiresPermissions("frame:expand_left")
	@RequestMapping("/frame/expand_left.do")
	public String expandLeft(ModelMap model){
		if(getMenuUrls()==null){
			Map<String,String>menus=getMenus();
			Map<String,String>tops=getTops();
			Map<String,Map<String,String>>menuNames=new HashMap<String,Map<String,String>>();
			Map<String,String>menuUrls=new HashMap<String,String>();
			Map<String,String>menuPerms=new HashMap<String,String>();
			Iterator<String>it=tops.keySet().iterator();
			while(it.hasNext()){
				String priority=it.next();
				Set<String> menuKeySet=menus.keySet();
				List<String> menuKeyList=new ArrayList<String>();
				menuKeyList.addAll(menuKeySet);
				Collections.sort(menuKeyList);
				Map<String,String> menuNameM=new HashMap<String,String>();
				for(String m:menuKeyList){
					if(m.startsWith(priority+".")){
						String str=menus.get(m);
						String[]array=str.split(";");
						menuNameM.put(m,array[0]);
						if(StringUtils.isNotBlank(array[1])&&array[1].contains("http://")){
							menuUrls.put(m,array[1]);
						}else{
							menuUrls.put(m,"../"+array[1]);
						}
						menuPerms.put(m,array[2]);
					}
					menuNames.put(priority,  MapUtil.sortMapByKey(menuNameM));
				}
			}
			setMenuNames(menuNames);
			setMenuUrls(menuUrls);
			setMenuPerms(menuPerms);
			setTops(MapUtil.sortMapByKey(tops));
		}
		model.addAttribute("menuNames", getMenuNames());
		model.addAttribute("menuUrls", getMenuUrls());
		model.addAttribute("menuPerms", getMenuPerms());
		model.addAttribute("tops", getTops());
		return "frame/expand_left";
	}
	
	@RequiresPermissions("frame:expand_right")
	@RequestMapping("/frame/expand_right.do")
	public String expandRight(){
		return "frame/expand_right";
	}
	private Map<String,String> menus;
	private Map<String,String> tops;
	private Map<String,String>menuUrls;
	private Map<String,String>menuPerms;
	private Map<String,Map<String,String>>menuNames;
	//数据库种类(mysql、oracle、sqlserver、db2)
	private String db;

	public Map<String, String> getMenus() {
		return menus;
	}

	public void setMenus(Map<String, String> menus) {
		this.menus = menus;
	}
	
	public Map<String, String> getTops() {
		return tops;
	}

	public void setTops(Map<String, String> tops) {
		this.tops = tops;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public Map<String, String> getMenuUrls() {
		return menuUrls;
	}

	public void setMenuUrls(Map<String, String> menuUrls) {
		this.menuUrls = menuUrls;
	}

	public Map<String, String> getMenuPerms() {
		return menuPerms;
	}

	public void setMenuPerms(Map<String, String> menuPerms) {
		this.menuPerms = menuPerms;
	}

	public Map<String, Map<String, String>> getMenuNames() {
		return menuNames;
	}

	public void setMenuNames(Map<String, Map<String, String>> menuNames) {
		this.menuNames = menuNames;
	}
	
	
}
