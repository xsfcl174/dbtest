package com.fancl.db.mybatis.bean;

import java.io.Serializable;

public class SysRoleSubFunc extends SysRoleSubFuncKey implements Serializable {
    private Short psfIsFunc;

    private static final long serialVersionUID = 1L;

    public Short getPsfIsFunc() {
        return psfIsFunc;
    }

    public void setPsfIsFunc(Short psfIsFunc) {
        this.psfIsFunc = psfIsFunc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", psfIsFunc=").append(psfIsFunc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}