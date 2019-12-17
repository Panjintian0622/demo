package com.ayeng.demo;

import com.ayeng.demo.service.hourse.IQiNiuService;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

public class QiNiuServiceTest extends DemoApplicationTests {
    @Autowired
    private IQiNiuService iQiNiuService;

    @Test
    public void testUploadFile() {
        String fileName = "/Users/tal/Desktop/75769bed78f538cd7890ba1931904cf4662ef7d7.jpg";
        File file = new File(fileName);
        Assert.assertTrue(file.exists());
        try {
            Response response = iQiNiuService.uploadFile(file);
            Assert.assertTrue(response.isOK());
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDelte(){
        String key = "FqeBoHgp9RNL_TrrXfQOp7qn--jr";
        try{
            Response response = iQiNiuService.delete(key);
            Assert.assertTrue(response.isOK());
        }catch (QiniuException e){
            e.printStackTrace();
        }
    }
}
