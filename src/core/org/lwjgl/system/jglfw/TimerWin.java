/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import org.lwjgl.BufferUtils;
import org.lwjgl.system.windows.LARGE_INTEGER;

import java.nio.ByteBuffer;

import static org.lwjgl.system.windows.Mmsystem.*;
import static org.lwjgl.system.windows.WinBase.*;

class TimerWin {

	boolean hasPC;
	double  resolution;
	int     t0_32;
	long    t0_64;

	private final ByteBuffer lint = BufferUtils.createAlignedByteBuffer(8, 8);

	TimerWin() {
	}

	public void init() {

		if ( QueryPerformanceFrequency(lint) != 0 ) {
			hasPC = true;
			resolution = 1.0 / (double)LARGE_INTEGER.QuadPartGet(lint);
			QueryPerformanceCounter(lint);
			t0_64 = LARGE_INTEGER.QuadPartGet(lint);
		} else {
			hasPC = false;
			resolution = 0.001; // winmm resolution is 1ms
			t0_32 = timeGetTime();
		}
	}

	public double getTime() {
		double t;

		if ( hasPC ) {
			QueryPerformanceCounter(lint);
			t = (double)(LARGE_INTEGER.QuadPartGet(lint) - t0_64);
		} else
			t = (double)(timeGetTime() - t0_32);

		return t * resolution;
	}

	public void setTime(double t) {
		if ( hasPC ) {
			QueryPerformanceCounter(lint);
			t0_64 = LARGE_INTEGER.QuadPartGet(lint) - (long)(t / resolution);
		} else
			t0_32 = timeGetTime() - (int)(t * 1000.0);
	}

}