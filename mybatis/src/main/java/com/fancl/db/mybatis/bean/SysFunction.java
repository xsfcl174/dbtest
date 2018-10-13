package com.fancl.db.mybatis.bean;

import java.io.Serializable;

public class SysFunction implements Serializable {
    private Integer fnId;

    private String fnShortName;

    private String fnName;

    private String fnUrl;

    private Integer fnParentId;

    private Short fnIsLeaf;

    private String fnTreeLayer;

    private String fnReverse1;

    private String fnReverse2;

    private static final long serialVersionUID = 1L;

    public Integer getFnId() {
        return fnId;
    }

    public void setFnId(Integer fnId) {
        this.fnId = fnId;
    }

    public String getFnShortName() {
        return fnShortName;
    }

    public void setFnShortName(String fnShortName) {
        this.fnShortName = fnShortName == null ? null : fnShortName.trim();
    }

    public String getFnName() {
        return fnName;
    }

    public void setFnName(String fnName) {
        this.fnName = fnName == null ? null : fnName.trim();
    }

    public String getFnUrl() {
        return fnUrl;
    }

    public void setFnUrl(String fnUrl) {
        this.fnUrl = fnUrl == null ? null : fnUrl.trim();
    }

    public Integer getFnParentId() {
        return fnParentId;
    }

    public void setFnParentId(Integer fnParentId) {
        this.fnParentId = fnParentId;
    }

    public Short getFnIsLeaf() {
        return fnIsLeaf;
    }

    public void setFnIsLeaf(Short fnIsLeaf) {
        this.fnIsLeaf = fnIsLeaf;
    }

    public String getFnTreeLayer() {
        return fnTreeLayer;
    }

    public void setFnTreeLayer(String fnTreeLayer) {
        this.fnTreeLayer = fnTreeLayer == null ? null : fnTreeLayer.trim();
    }

    public String getFnReverse1() {
        return fnReverse1;
    }

    public void setFnReverse1(String fnReverse1) {
        this.fnReverse1 = fnReverse1 == null ? null : fnReverse1.trim();
    }

    public String getFnReverse2() {
        return fnReverse2;
    }

    public void setFnReverse2(String fnReverse2) {
        this.fnReverse2 = fnReverse2 == null ? null : fnReverse2.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fnId=").append(fnId);
        sb.append(", fnShortName=").append(fnShortName);
        sb.append(", fnName=").append(fnName);
        sb.append(", fnUrl=").append(fnUrl);
        sb.append(", fnParentId=").append(fnParentId);
        sb.append(", fnIsLeaf=").append(fnIsLeaf);
        sb.append(", fnTreeLayer=").append(fnTreeLayer);
        sb.append(", fnReverse1=").append(fnReverse1);
        sb.append(", fnReverse2=").append(fnReverse2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}