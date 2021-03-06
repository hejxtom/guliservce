package com.atguigu.aliyunvod;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoRequest;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthRequest;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthResponse;
import org.junit.Test;

import java.util.List;

/**
 * @Classname VodSdkTest
 * @Description TODO
 * @Date 10:16 2021/2/21
 * @Created by hejx
 */

public class VodSdkTest {

    /**client初始化
     *
     * @param accessKeyId
     * @param accessKeySecret
     * @return
     */
    public static DefaultAcsClient initVodClient(String accessKeyId, String accessKeySecret) {
        String regionId = "cn-shanghai";  // 点播服务接入区域
        DefaultProfile profile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        return client;
    }

    /**
     * 获取播放地址函数
     *
     *
     */
    public static GetPlayInfoResponse getPlayInfo(DefaultAcsClient client) throws Exception {
        GetPlayInfoRequest request = new GetPlayInfoRequest();
        request.setVideoId("9490b7acfbec47c9946bac0c32ebaa8c");
        request.setResultType("Multiple"); //如果视频id是加密视频的id，则需要设置此参数。但只能获取文件地址无法解密播放
        return client.getAcsResponse(request);
    }

    /**获取播放地址测试
     *
     */

    @Test
    public void testGetPlayInfo(){
        //初始化
        DefaultAcsClient client = initVodClient("", "");
        GetPlayInfoResponse response = new GetPlayInfoResponse();

        try {
            //获取播放地址
            response = getPlayInfo(client);
            List<GetPlayInfoResponse.PlayInfo> playInfoList = response.getPlayInfoList();
            //播放地址
            for (GetPlayInfoResponse.PlayInfo playInfo : playInfoList) {
                System.out.print("PlayInfo.PlayURL = " + playInfo.getPlayURL() + "\n");
            }
            //Base信息
            System.out.print("VideoBase.Title = " + response.getVideoBase().getTitle() + "\n");
        } catch (Exception e) {
            System.out.print("ErrorMessage = " + e.getLocalizedMessage());
        }
        System.out.print("RequestId = " + response.getRequestId() + "\n");
    }



    /**获取播放凭证
     *
     * @param client
     * @return
     * @throws Exception
     */

    /*获取播放凭证函数*/
    public static GetVideoPlayAuthResponse getVideoPlayAuth(DefaultAcsClient client) throws Exception {
        GetVideoPlayAuthRequest request = new GetVideoPlayAuthRequest();
        request.setVideoId("9490b7acfbec47c9946bac0c32ebaa8c");
        request.setAuthInfoTimeout(3000L);
        return client.getAcsResponse(request);
    }

    /*以下为调用示例*/
    @Test
    public void testGetVideoPlayAuth() {

        DefaultAcsClient client = initVodClient("", "");
        GetVideoPlayAuthResponse response = new GetVideoPlayAuthResponse();
        try {
            response = getVideoPlayAuth(client);
            //播放凭证
            System.out.print("PlayAuth = " + response.getPlayAuth() + "\n");
            //VideoMeta信息
            System.out.print("VideoMeta.Title = " + response.getVideoMeta().getTitle() + "\n");
        } catch (Exception e) {
            System.out.print("ErrorMessage = " + e.getLocalizedMessage());
        }
        System.out.print("RequestId = " + response.getRequestId() + "\n");
    }

}