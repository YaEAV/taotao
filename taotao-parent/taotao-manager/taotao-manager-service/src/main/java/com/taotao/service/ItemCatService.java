package com.taotao.service;

import com.taotao.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * Created by yazhou on 16-9-11.
 */
public interface ItemCatService {

    List<EasyUITreeNode> getItemCatList(Long parent);
}
