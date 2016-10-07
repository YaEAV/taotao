package org.csource;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by yazhou on 16-10-7.
 */
public class FastDFSClient {
    private TrackerClient trackerClient=null;
    private TrackerServer trackerServer=null;
    private StorageClient storageClient=null;
    private StorageServer storageServer=null;

    public FastDFSClient(String conf) throws IOException, MyException {
        //if (conf.contains("classpath:")){
        //    conf=conf.replace("classpath:",this.getClass().getResource("/").getPath());
        //}
        ClientGlobal.init(conf);
        trackerClient =new TrackerClient();
        trackerServer =trackerClient.getConnection();
        storageServer=null;
        storageClient=new StorageClient1(trackerServer,storageServer);
    }

    /**
     * 上传文件方法
     *
     */

    public String uploadFile(String fileName, String extName, NameValuePair[] metas) throws Exception {
        String[] result=storageClient.upload_file(fileName,extName,metas);
        String list= Arrays.toString(result);
        String ss=list.replaceAll(", ","/");
        StringBuffer buffer=new StringBuffer(ss);
        buffer.delete(0,1);
        buffer.delete(ss.length()-2,ss.length()-1);
        String lists= buffer.toString();
        return lists;
    }

    public String uploadFile(String fileName, String extName) throws Exception {
        return uploadFile(fileName,extName,null);
    }

    public String uploadFile(String fileName) throws Exception {
        return uploadFile(fileName,null,null);
    }

    public String uploadFile(byte[] fileContent, String extName, NameValuePair[] metas) throws Exception {
        String[] result=storageClient.upload_file(fileContent,extName,metas);
        String list= Arrays.toString(result);
        String ss=list.replaceAll(", ","/");
        StringBuffer buffer=new StringBuffer(ss);
        buffer.delete(0,1);
        buffer.delete(ss.length()-2,ss.length()-1);
        String lists= buffer.toString();
        return lists;
    }

    public String uploadFile(byte[] fileContent, String extName) throws Exception {
        return uploadFile(fileContent, extName,null);
    }

    public String uploadFile(byte[] fileContent) throws Exception {
        return uploadFile(fileContent,null,null);
    }
}
