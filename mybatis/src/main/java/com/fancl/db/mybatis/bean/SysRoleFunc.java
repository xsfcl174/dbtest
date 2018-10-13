package com.fancl.db.mybatis.bean;

import java.io.Serializable;

public class SysRoleFunc extends SysRoleFuncKey implements Serializable {
    private Short pfIsFunc;

    private static final long serialVersionUID = 1L;

    public Short getPfIsFunc() {
        return pfIsFunc;
    }

    public void setPfIsFunc(Short pfIsFunc) {
        this.pfIsFunc = pfIsFunc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pfIsFunc=").append(pfIsFunc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}