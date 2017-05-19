/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package capture;

import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 * Created by youfeimacpro on 2017/5/15.
 */

public class VideoInfoRsp {

    public String message;
    public DataBean data;

    public static class DataBean {
        public long media_user_id;
        public String content;
        public H5ExtraBean h5_extra;
        public long item_id;
        public int is_wenda;
        public long group_id;
        public int aggr_type;
        public List<?> webp_image_detail;
        public List<?> image_detail;
        public List<?> webp_thumb_image;
        public List<?> thumb_image;

        public static class H5ExtraBean {
            public String publish_time;
            public boolean is_original;
            public String str_item_id;
            public String title;
            public MediaBean media;
            public String media_user_id;
            public String src_link;
            public String source;
            public String publish_stamp;
            public String str_group_id;

            public static class MediaBean {
                public String description;
                public String pgc_custom_menu;
                public boolean can_be_praised;
                public String name;
                public long creator_id;
                public String avatar_url;
                public boolean v;
                public long id;
                public String auth_info;
                public boolean show_pgc_component;
                public boolean user_verified;
                public String user_auth_info;
                public List<?> authors;
            }
        }
    }
    public String toJsonString(){
        String s = JSON.toJSONString(this);
        return s;
    }
}
