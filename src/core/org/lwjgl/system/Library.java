/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

public interface Library {

	String getName();

	long getProcAddress(String name);

	void destroy();

}