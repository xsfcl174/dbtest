package com.fancl.db.mybatis.bean;

import java.io.Serializable;

public class SysRoleSubFuncKey implements Serializable {
    private Integer psfRoleId;

    private Integer psfSfId;

    private static final long serialVersionUID = 1L;

    public Integer getPsfRoleId() {
        return psfRoleId;
    }

    public void setPsfRoleId(Integer psfRoleId) {
        this.psfRoleId = psfRoleId;
    }

    public Integer getPsfSfId() {
        return psfSfId;
    }

    public void setPsfSfId(Integer psfSfId) {
        this.psfSfId = psfSfId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", psfRoleId=").append(psfRoleId);
        sb.append(", psfSfId=").append(psfSfId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}