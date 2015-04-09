/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux;

import java.nio.ByteBuffer;

public final class XMacros {

	private XMacros() {
	}

	public static void XISetMask(ByteBuffer ptr, int event) {
		int index = ptr.position() + (event >> 3);
		ptr.put(index, (byte)(ptr.get(index) | (1 << (event & 7))));
	}

	public static void XIClearMask(ByteBuffer ptr, int event) {
		int index = ptr.position() + (event >> 3);
		ptr.put(index, (byte)(ptr.get(index) & ~(1 << (event & 7))));
	}

	public static boolean XIMaskIsSet(ByteBuffer ptr, int event) {
		int index = ptr.position() + (event >> 3);
		return (ptr.get(index) & (1 << (event & 7))) != 0;
	}

	public static int XIMaskLen(int event) {
		return event >> 3;
	}

}