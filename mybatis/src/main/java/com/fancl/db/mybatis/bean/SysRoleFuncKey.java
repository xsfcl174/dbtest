package com.fancl.db.mybatis.bean;

import java.io.Serializable;

public class SysRoleFuncKey implements Serializable {
    private Integer pfRoleId;

    private Integer pfFnId;

    private static final long serialVersionUID = 1L;

    public Integer getPfRoleId() {
        return pfRoleId;
    }

    public void setPfRoleId(Integer pfRoleId) {
        this.pfRoleId = pfRoleId;
    }

    public Integer getPfFnId() {
        return pfFnId;
    }

    public void setPfFnId(Integer pfFnId) {
        this.pfFnId = pfFnId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pfRoleId=").append(pfRoleId);
        sb.append(", pfFnId=").append(pfFnId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}