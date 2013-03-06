/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*

fun GLFW() = "GLFW".nativeClass(packageName = GLFW_PACKAGE, prefix = "GLFW") {
	nativeImport (
		"glfw3.h"
	)

	javaDoc("Native bindings to GLFW functionality.")

	IntConstant.block(
		"Input handling definitions",
		"RELEASE" _ 0,
		"PRESS" _ 1
	)

	GLFWmonitor.func(
	    "GetPrimaryMonitor",
	    "Returns the primary monitor"
	)

	int.func(
        "Init",
        """
        Before most GLFW functions can be used, GLFW must be initialized, and before
        a program terminates GLFW should be terminated in order to free allocated
        resources, memory, etc.
        """
	)

	VOID.func(
        "Terminate",
        """
        Terminates the GLFW library
        """
	)

    VOID.func(
        "GetVersion",
        """
        Retrieves the version of the GLFW library.
        """,
        int_p.OUT("major", "major version number"),
        int_p.OUT("minor", "minor version number"),
        int_p.OUT("rev", "revision number")
	)

	GLFWmonitor_p.func(
        "GetMonitors",
        "Returns the currently connected monitors",
        autoSizeResult _ int_p.OUT("count", "number of monitors returned")
	)

	charASCII_p.func(
        "GetMonitorName",
        "",
        GLFWmonitor.IN("monitor", "monitor to get name for")
	)
}

