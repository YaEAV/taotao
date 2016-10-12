package com.taotao.service;

import com.taotao.common.pojo.PictureResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by yazhou on 16-10-8.
 */
public interface PictureService {
    PictureResult uploadPic(MultipartFile picfile);
}
