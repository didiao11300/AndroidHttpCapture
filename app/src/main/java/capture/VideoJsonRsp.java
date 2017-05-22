/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package capture;

/**
 * Created by youfeimacpro on 2017/5/22.
 */

public class VideoJsonRsp {
    public DataBean data;
    public String message;
    public int code;
    public int total;

    public static class DataBean {
        public int status;
        public String user_id;
        public String video_id;
        public double video_duration;
        public VideoListBean video_list;

        public static class VideoListBean {
            public VideoBean video_1;
            public VideoBean video_2;
            public VideoBean video_3;

            public static class VideoBean {
                public String backup_url_1;
                public int bitrate;
                public String definition;
                public String main_url;
                public int preload_interval;
                public int preload_max_step;
                public int preload_min_step;
                public int preload_size;
                public double size;
                public double socket_buffer;
                public int user_video_proxy;
                public int vheight;
                public String vtype;
                public int vwidth;
            }

        }
    }
}
