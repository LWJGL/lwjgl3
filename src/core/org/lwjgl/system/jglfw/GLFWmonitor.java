/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import java.nio.ByteBuffer;
import java.util.List;

public class GLFWmonitor {

	private final String name;
	private final String description;

	private final int width;
	private final int height;

	private List<GLFWvidmode> vidmodes;

	private ByteBuffer originalGammaRamp;

	public GLFWmonitor(String name, String description, int width, int height) {
		this.name = name;
		this.description = description;
		this.width = width;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	void setVidmodes(List<GLFWvidmode> vidmodes) {
		this.vidmodes = vidmodes;
	}

	List<GLFWvidmode> getVidmodes() {
		return vidmodes;
	}

	ByteBuffer getOriginalGammaRamp() {
		return originalGammaRamp;
	}

	void setOriginalGammaRamp(ByteBuffer originalGammaRamp) {
		this.originalGammaRamp = originalGammaRamp;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("GLFWmonitor{");
		sb.append("name='").append(name).append('\'');
		sb.append(", description='").append(description).append('\'');
		sb.append(", width=").append(width);
		sb.append(", height=").append(height);
		sb.append('}');
		return sb.toString();
	}

}