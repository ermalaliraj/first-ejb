package com.ea.first.be.bl.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
public class NameEntity implements Serializable {

	private static final long serialVersionUID = -4337041024452939917L;

	@Id
	@GeneratedValue
	private Long id;
	private String name;	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		NameEntity cat = new NameEntity();
		cat.id = id;
		cat.name = name;
		return cat;
	}
	
	public boolean equals(final Object other) {
        if (!(other instanceof NameEntity))
            return false;
        NameEntity o = (NameEntity) other;
      
        return new EqualsBuilder()
        	.append(id, o.id)
        	.append(name, o.name)
			.isEquals()
			;
    }
	
    public int hashCode() {
        return new HashCodeBuilder()
        		.append(id)
        		.append(name)
        		.toHashCode();
    }
    
	public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        	.appendSuper(super.toString())
        	.append("id", id)
        	.append("name", name)
        	.toString();
    }
	
	public String toStringShort() {
        return new ToStringBuilder(this, ToStringStyle.NO_FIELD_NAMES_STYLE)
        	.appendSuper(super.toString())
        	.append("id", id)
        	.append("name", name)
        	.toString();
    }

}
