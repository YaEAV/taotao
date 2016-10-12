package com.taotao.fastcast;

import com.taotao.common.utils.FastDFSClient;
import org.junit.Test;

/**
 * Created by yazhou on 16-10-8.
 */
public class TestCase {
    @Test
    public void test1() throws Exception {
        FastDFSClient client=new FastDFSClient("/home/yazhou/Document/java/Java练习/SSM/taotao/taotao-parent/taotao-manager/taotao-manager-web/src/main/resources/properties/fdfs_client.conf");
        String url= client.uploadFile("/home/yazhou/Pictures/BG/1352113505895.jpg","jpg");
        System.out.println(url);
    }
}
