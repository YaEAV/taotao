package com.taotao.service.impl;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemCatExample.Criteria;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yazhou on 16-9-11.
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{

    @Autowired
    private TbItemCatMapper tbItemCatMapper;


    @Override
    public List<EasyUITreeNode> getItemCatList(Long parentId) {
        TbItemCatExample example=new TbItemCatExample();
        Criteria criteria= example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> list=tbItemCatMapper.selectByExample(example);
        List<EasyUITreeNode> easyUITreeNodeList=new ArrayList<>();
        for (TbItemCat tbItemCat:list){
            EasyUITreeNode easyUITreeNode=new EasyUITreeNode();
            easyUITreeNode.setId(tbItemCat.getId());
            easyUITreeNode.setText(tbItemCat.getName());
            easyUITreeNode.setState(tbItemCat.getIsParent()?"closed":"open");
            easyUITreeNodeList.add(easyUITreeNode);
        }
        return easyUITreeNodeList;
    }
}
