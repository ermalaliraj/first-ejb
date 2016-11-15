package com.ea.first.be.api.dto;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class NameDTO implements Serializable {

	private static final long serialVersionUID = -4337041024452939917L;

	private Long id;
	private String name;
	
	public NameDTO() {
	}
	
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

	public NameDTO(String name) {
		this.name = name;
	}
	
	public boolean equals(final Object other) {
        if (!(other instanceof NameDTO))
            return false;
        NameDTO o = (NameDTO) other;
      
        return new EqualsBuilder()
        		.append(name, o.name)
        		.isEquals();
    }
    public int hashCode() {
        return new HashCodeBuilder()
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

}
