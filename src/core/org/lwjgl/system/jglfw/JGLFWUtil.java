/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryUtil.*;

final class JGLFWUtil {

	private JGLFWUtil() {
	}

	static void zeroMemory(long address, int bytes) {
		memSet(address, 0, bytes);
	}

	static void zeroMemory(ByteBuffer buffer, int bytes) {
		memSet(memAddress(buffer), 0, bytes);
	}

}