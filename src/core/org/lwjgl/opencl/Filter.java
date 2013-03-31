/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

/**
 * Simple filter interface.
 *
 * @author Spasi
 */
public interface Filter<T> {

	/**
	 * Returns true if the specified object passes the filter.
	 *
	 * @param object the object to test
	 *
	 * @return true if the object is accepted
	 */
	boolean accept(T object);

}