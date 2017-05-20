/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package capture;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Created by youfeimacpro on 2017/5/18.
 */

public class VideoItemRsp {
    public LogPbBean log_pb;
    /**
     * 视频文章已读数量，没看完
     */
    public int read_count;
    /**
     * 视频ID 全网唯一
     */
    public String video_id;
    public String media_name;
    public int ban_comment;
    @SerializedName("abstract")
    public String abstractX;
    public VideoDetailInfoBean video_detail_info;
    public boolean has_video;
    public int article_type;
    public String tag;
    public ForwardInfoBean forward_info;
    public int has_m3u8_video;
    public String keywords;
    /**
     * 视频持续时间秒
     */
    public int video_duration;
    public boolean show_portrait_article;
    public int user_verified;
    public int aggr_type;
    public int cell_type;
    public int article_sub_type;
    public int group_flags;
    public int bury_count;
    public String title;
    public int ignore_web_transform;
    public int source_icon_style;
    public int tip;
    public int hot;
    /**
     * 视频分享链接
     */
    public String share_url;
    public int has_mp4_video;
    public String source;
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
    public String rid;
    /**
     * 视频/文章发布时间
     */
    public int publish_time;
    public int cell_layout_style;
    public long tag_id;
    public String action_extra;
    public int video_style;
    public String verified_content;
    public String display_url;
    public long item_id;
    public boolean is_subject;
    public boolean show_portrait;
    /**
     * 视频??是不是重复观看次数
     */
    public int repin_count;
    public int cell_flag;
    /**
     * 发布的用户信息
     */
    public UserInfoBean user_info;
    public String source_open_url;
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
    public long cursor;
    public String url;
    public int preload_web;
    public int user_repin;
    public boolean has_image;
    public int item_version;
    public MediaInfoBean media_info;
    public long group_id;
    public MiddleImageBean middle_image;
    public List<?> image_list;
    /**
     * 视频滤波器,重要:系统关于视频的评价,比如重复推荐，视频质量差;
     */
    public List<FilterWordsBean> filter_words;
    public List<String> search_labels;
    public List<ActionListBean> action_list;
    public List<LargeImageListBean> large_image_list;

    public static class LogPbBean {
        public String impr_id;
    }

    public static class VideoDetailInfoBean {
        public int group_flags;
        public int video_type;
        public int video_preloading_flag;
        public int direct_play;
        public DetailVideoLargeImageBean detail_video_large_image;
        public int show_pgc_subscribe;
        public String video_third_monitor_url;
        public String video_id;
        public int video_watching_count;
        /**
         * 视频观看量
         */
        public int video_watch_count;
        public List<?> video_url;

        public static class DetailVideoLargeImageBean {
            public String url;
            public int width;
            public String uri;
            public int height;
            public List<UrlListBean> url_list;

            public static class UrlListBean {
                public String url;
            }
        }
    }

    public static class ForwardInfoBean {
        public int forward_count;
    }

    public static class UserInfoBean {
        public String verified_content;
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
        public int follower_count;
        public boolean follow;
        public String user_auth_info;
        public boolean user_verified;
        /**
         * 用户签名
         */
        public String description;
    }

    public static class MediaInfoBean {
        public long user_id;
        public String verified_content;
        public String avatar_url;
        public long media_id;
        public String name;
        public int recommend_type;
        public boolean follow;
        public String recommend_reason;
        public boolean is_star_user;
        public boolean user_verified;
    }

    public static class MiddleImageBean {
        public String url;
        public int width;
        public String uri;
        public int height;
        public List<UrlListBean> url_list;

        public static class UrlListBean {
            public String url;
        }
    }

    public static class FilterWordsBean {
        public String id;
        public String name;
        public boolean is_selected;
    }

    public static class ActionListBean {
        public int action;
        public ExtraBean extra;
        public String desc;

        public static class ExtraBean {
        }
    }

    public static class LargeImageListBean {
        public String url;
        public int width;
        public String uri;
        public int height;
        public List<UrlListBean> url_list;

        public static class UrlListBean {
            public String url;
        }
    }
}
