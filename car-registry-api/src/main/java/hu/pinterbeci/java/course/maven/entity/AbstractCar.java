package hu.pinterbeci.java.course.maven.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractCar extends AbstractEntity {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_date")
    private Date modifiedDate;

    @Column(name = "created_user_id", nullable = false)
    private Long createdUserID;

    @Column(name = "modifier_user_id")
    private Long modifierUserID;

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Long getCreatedUserID() {
        return createdUserID;
    }

    public void setCreatedUserID(Long createdUserID) {
        this.createdUserID = createdUserID;
    }

    public Long getModifierUserID() {
        return modifierUserID;
    }

    public void setModifierUserID(Long modifierUserID) {
        this.modifierUserID = modifierUserID;
    }
}
