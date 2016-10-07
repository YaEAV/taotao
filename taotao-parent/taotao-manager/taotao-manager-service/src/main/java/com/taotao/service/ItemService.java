package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

/**
 * Created by yazhou on 16-9-11.
 */

public interface ItemService {

    TbItem getItemById(Long itemId);

    EasyUIDataGridResult getItemList(int page,int rows);
}
