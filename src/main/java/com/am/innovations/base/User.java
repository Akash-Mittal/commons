package com.am.innovations.base;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.am.innovations.entities.base.AuditEntity;

@Entity
@Table(name = "user")
public class User extends AuditEntity {
    /**
     * 
     */
    private static final long serialVersionUID = -5877209196935430734L;

    @Override
    public String toString() {
        return "User [name=" + name + ", id=" + id + ", getName()=" + getName() + ", getCreatedAt()=" + getCreatedAt()
                + ", getUpdatedAt()=" + getUpdatedAt() + ", toString()=" + super.toString() + ", getId()=" + getId()
                + ", getVersion()=" + getVersion() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + "]";
    }

    private String name;

    public User(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}