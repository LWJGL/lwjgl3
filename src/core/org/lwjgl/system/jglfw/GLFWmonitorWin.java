/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

public class GLFWmonitorWin extends GLFWmonitor {

	private final String adapterName;

	public GLFWmonitorWin(String name, String adapterName, int width, int height) {
		super(name, width, height);

		this.adapterName = adapterName;
	}

	public String getAdapterName() {
		return adapterName;
	}

}