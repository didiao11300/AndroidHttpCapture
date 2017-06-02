/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package capture.request;

import java.util.List;

import com.alibaba.fastjson.JSON;

import capture.VideoItem;
import capture.request.base.BaseReqBody;

/**
 * Created by youfeimacpro on 2017/5/22.
 */

public class MyVideoInfoReq extends BaseReqBody {
    /**
     * 视频文章已读数量，没看完
     */
    public int read_count;
    /**
     * 视频ID 全网唯一
     */
    public String video_id;
    /**
     * 视频持续时间秒
     */
    public int video_duration;
    /**
     * 视频评论量
     */
    public int comment_count;
    /**
     * 视频播放的网络地址,注意:这里不是下载地址
     */
    public String article_url;
    /**
     * 视频/文章被分享次数，也可以用来做大数据
     */
    public int share_count;
    /**
     * 视频属性 video_funny
     */
    public String tag;
    /**
     * 视频标题
     */
    public String title;
    /**
     * 视频关键字 "祛斑,生姜,大妈"
     */
    public String keywords;
    /**
     * 视频搜索关键字["生姜","祛斑"]
     */
    public List<String> search_labels;
    /**
     * 视频/文章发布时间
     */
    public int publish_time;
    /**
     * 视频??是不是重复观看次数
     */
    public int repin_count;
    /**
     * 视频等级，待分析？
     */
    public int level;
    /**
     * 视频收藏数量？？
     */
    public int like_count;
    /**
     * 视频订阅数量？？
     */
    public int digg_count;
    /**
     * 热度持续时间？？
     */
    public int behot_time;
    /**
     * 视频观看量
     */
    public int video_watch_count;

    /**
     * 用户头像
     */
    public String avatar_url;
    /**
     * 用户id
     */
    public long user_id;
    /**
     * 用户名称
     */
    public String name;
    /**
     * 用户签名
     */
    public String description;

    /**
     * 视频滤波器,重要:系统关于视频的评价,比如重复推荐，视频质量差;
     */
    public List<VideoItem.FilterWordsBean> filter_words;

    /**
     * 视频下载地址
     */
    public String downloadUrl;

    /**
     * 视频类型
     */
    public String vtype;

//    public String toJsonString() {
//        String s = JSON.toJSONString(this);
//        return s;
//    }
}
