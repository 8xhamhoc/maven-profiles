package com.csam.wsc.swisscard.dip.cache.dao.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class SwisscardBase implements Serializable {

    private Date created = Calendar.getInstance().getTime();
    private Date lastUpdated = Calendar.getInstance().getTime();

    public void setUpdateDate() {
        lastUpdated = Calendar.getInstance().getTime();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
