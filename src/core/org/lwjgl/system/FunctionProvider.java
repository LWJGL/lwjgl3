/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

public interface FunctionProvider {

	long getFunctionAddress(String functionName);

}