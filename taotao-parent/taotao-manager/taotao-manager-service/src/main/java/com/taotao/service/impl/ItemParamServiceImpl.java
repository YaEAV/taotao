package com.taotao.service.impl;


import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbItemParamMapper;
import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import com.taotao.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yazhou on 16-10-12.
 */

@Service
public class ItemParamServiceImpl implements ItemParamService {
    @Autowired
    private TbItemParamMapper itemParamMapper;

    @Override
    public TaotaoResult getItemParamByCid(Long cid) {
        TbItemParamExample example=new TbItemParamExample();
        TbItemParamExample.Criteria criteria=example.createCriteria();
        criteria.andItemCatIdEqualTo(cid);
        List<TbItemParam> list= itemParamMapper.selectByExample(example);

        if (list !=null && list.size()>0){
            TbItemParam itemParam=list.get(0);
            return TaotaoResult.ok(itemParam);
        }
        return TaotaoResult.ok();
    }
}
