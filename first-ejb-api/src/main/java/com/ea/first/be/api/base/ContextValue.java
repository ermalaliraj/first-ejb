package com.ea.first.be.api.base;


import java.io.Serializable;

/**
 * Interface for values stored in the context map.
 * 
 */
public interface ContextValue extends Serializable {

	/**
	 * return the array of class fields. This array will be accessed during
	 * serialization and deserialization so it must include all the fields of
	 * the object with the right order for proper object construction.
	 * 
	 * @return
	 */
	Object[] getFields();

	/**
	 * Returns the weight of the entry. There is no unit for entry weights;
	 * rather they are simply relative to each other.
	 * 
	 * @return the weight of the entry; must be non-negative
	 */
	int getWeight();

}
