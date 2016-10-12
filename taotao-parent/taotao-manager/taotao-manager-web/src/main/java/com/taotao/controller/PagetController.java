package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 页面跳转
 * Created by yazhou on 16-9-11.
 */


@Controller
public class PagetController {

    @Autowired
    private ItemService itemService;


    /**
     *
     * @return
     * 在springmvc中配置静态资源映射
     *
     */

    //跳转到首页
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }


    /**
     *
     * @param page 对应jsp中的请求地址
     *
     *  <li data-options="attributes:{'url':'item-add'}">新增商品</li>
     *  <li data-options="attributes:{'url':'item-list'}">查询商品</li>
     *  <li data-options="attributes:{'url':'item-param-list'}">规格参数</li>
     *
     * @return
     */
    //列表页面跳转
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    /**
     *
     * 商品列表分页
     * @param page
     * @param rows
     * @return
     */

    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page,Integer rows){
        EasyUIDataGridResult result= itemService.getItemList(page,rows);
        return result;
    }

    @RequestMapping(value = "/item/save",method = RequestMethod.POST)
    @ResponseBody

    public TaotaoResult createItem(TbItem item,String desc){
        TaotaoResult result=itemService.createItem(item,desc);
        return result;
    }
}
