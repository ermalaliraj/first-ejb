package com.ea.first.be.api.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Base Asia Common utility class
 * @deprecated
 */
public class CommonUtils {

	public static String bean2stringMultiLine(Object o) {
		String result = "";
		try {
			result = ReflectionToStringBuilder.toString(o, ToStringStyle.MULTI_LINE_STYLE);
		} catch (Exception e) {
		}
		return result;
	}

	public static <T> List<T> arrayToList(T[] entities) {
		if (entities == null || entities.length < 1) {
			return null;
		}
		List<T> ret = new ArrayList<T>();
		for (int i = 0; i < entities.length; i++) {
			ret.add(entities[i]);
		}
		return ret;
	}

	/**
	 * convert a list to an array
	 * 
	 * @param entities
	 *            a list of results (obtained from an ORM, for example )
	 * @return null if entities is empty, a full array otherwise
	 */
	public static <T> T[] listToArray(List<T> entities) {
		return listToArray(null, entities, true);
	}

	/**
	 * convert a list to an array
	 * 
	 * @param myType
	 *            the class type of the array: if null, the class is guessed from the first record in the entities list
	 * @param entities
	 *            the list of entities
	 * @param returnNullIfEmpty
	 *            applied when entities has no elements or is null.<BR>
	 *            if false, it returns an empty array, if true it returns null
	 * @return an array of the type specified or guessed
	 */
	@SuppressWarnings("unchecked")
	public static <T> T[] listToArray(Class<T> myType, List<T> entities, boolean returnNullIfEmpty) {
		Class<T> finalType = myType;
		if (entities != null && entities.size() > 0) {
			if (myType == null) {
				finalType = (Class<T>) entities.get(0).getClass();
			}
			T[] reals = createEmptyArray(finalType, entities.size());
			for (int i = 0; i < reals.length; i++) {
				reals[i] = entities.get(i);
			}
			return reals;
		} else {
			if (myType == null || returnNullIfEmpty) {
				return null;
			} else {
				T[] reals = (T[]) createEmptyArray(myType, 0);
				return reals;
			}
		}
	}

	public static <T> void sortAndRemoveDuplicateSlow(List<T> list, Comparator<? super T> comp) {
		if (list == null)
			return;
		Collections.sort(list, comp);
		LinkedHashSet<T> set = new LinkedHashSet<T>();
		for (T t : list) {
			set.add(t);
		}
		list.clear();
		list.addAll(set);
	}

	/**
	 * Crea un array di oggetti di tipo passato in input
	 * 
	 * @param clazz
	 * @param size
	 * @return
	 */
	public static <T> T[] createEmptyArray(Class<T> clazz, int size) {
		@SuppressWarnings("unchecked")
		T[] reals = (T[]) Array.newInstance(clazz, size);
		return reals;
	}
}
