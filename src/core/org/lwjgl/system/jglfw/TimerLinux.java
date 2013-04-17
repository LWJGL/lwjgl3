/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import org.lwjgl.BufferUtils;
import org.lwjgl.system.linux.timespec;
import org.lwjgl.system.linux.timeval;

import java.nio.ByteBuffer;

import static org.lwjgl.system.linux.Time.*;

class TimerLinux {

	private final ByteBuffer time = BufferUtils.createByteBuffer(Math.max(timespec.SIZEOF, timeval.SIZEOF));

	private final TimeSource timeSource;

	private long base;

	TimerLinux() {
		if ( clock_gettime(CLOCK_MONOTONIC, time) == 0 ) {
			timeSource = new TimeSource() {
				@Override
				public double getResolution() {
					return 1e-9;
				}

				@Override
				public long getRawTime() {
					clock_gettime(CLOCK_MONOTONIC, time);
					return timespec.secGet(time) * 1000000000L + timespec.nsecGet(time);
				}
			};
		} else {
			timeSource = new TimeSource() {
				@Override
				public double getResolution() {
					return 1e-6;
				}

				@Override
				public long getRawTime() {
					gettimeofday(time, null);
					return timeval.secGet(time) * 1000000L + timeval.usecGet(time);
				}
			};
		}
	}

	public void init() {
		base = timeSource.getRawTime();
	}

	public double getTime() {
		return (double)(timeSource.getRawTime() - base) * timeSource.getResolution();
	}

	public void setTime(double time) {
		base = timeSource.getRawTime() - (long)(time / timeSource.getResolution());
	}

	private interface TimeSource {

		double getResolution();

		long getRawTime();

	}

}