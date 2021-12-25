package com.yiguan.search.po;

import com.tiantanhehe.dbs.common.util.Page;
import com.yiguan.search.model.BasOrganizeInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
public class OrgQryPartParam {

    private String keyWord;
    private String type;
    private String faxing;
    private List<String> uuids;
    private Page<BasOrganizeInfo> page;

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFaxing() {
        return faxing;
    }

    public void setFaxing(String faxing) {
        this.faxing = faxing;
    }

    public List<String> getUuids() {
        return uuids;
    }

    public void setUuids(List<String> uuids) {
        this.uuids = uuids;
    }

    public Page<BasOrganizeInfo> getPage() {
        return page;
    }

    public void setPage(Page<BasOrganizeInfo> page) {
        this.page = page;
    }
}
