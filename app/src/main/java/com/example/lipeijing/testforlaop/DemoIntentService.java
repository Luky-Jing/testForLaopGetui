package com.example.lipeijing.testforlaop;

import android.content.Context;

import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.message.GTCmdMessage;
import com.igexin.sdk.message.GTTransmitMessage;

/**
 * Created by LiPeijing on 2017/7/5.
 */
/**
 * 继承 GTIntentService 接收来⾃自个推的消息, 所有消息在线程中回调, 如果注册了了该服务, 则务必要在 AndroidManifest中声明, 否则⽆无法接 受消息<br>
 *     onReceiveMessageData 处理理透传消息<br>
 *     onReceiveClientId 接收 cid <br>
 *     onReceiveOnlineState cid 离线上线通知 <br>
 *     onReceiveCommandResult 各种事件处理理回执 <br>
 */
public class DemoIntentService extends GTIntentService {

    public DemoIntentService() {

    }
    @Override
    public void onReceiveServicePid(Context context, int i) {

    }

    @Override
    public void onReceiveClientId(Context context, String s) {

    }

    @Override
    public void onReceiveMessageData(Context context, GTTransmitMessage gtTransmitMessage) {

    }

    @Override
    public void onReceiveOnlineState(Context context, boolean b) {

    }

    @Override
    public void onReceiveCommandResult(Context context, GTCmdMessage gtCmdMessage) {

    }
}
