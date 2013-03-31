/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;

import java.lang.reflect.Method;

import static org.lwjgl.opencl.CL10.*;

/**
 * Instances of this class may be passed to the {@link CL11#clSetEventCallback(CLEvent, int, CLEventCallback)} method. Instances may be re-used after the
 * callback function has been invoked.
 * <p/>
 * Override the {@link #invoke(long, int)} method to implement any necessary actions. The default implementation prints a simple description in the standard
 * output stream.
 */
public class CLEventCallback {

	static final long CALLBACK;

	static {
		try {
			CALLBACK = setCallback(CLEventCallback.class.getDeclaredMethod(
				"invoke", long.class, int.class
			));
		} catch (Exception e) {
			throw new OpenCLException(e);
		}
	}

	public CLEventCallback() {
	}

	private static native long setCallback(Method callback);

	/**
	 * Called when the execution status of the command associated with {@code event} changes to an execution status equal to or past the status specified by
	 * {@code command_exec_status}.
	 *
	 * @param cl_event            the cl_event
	 * @param command_exec_status the new command execution status
	 */
	public void invoke(long cl_event, int command_exec_status) {
		String description;
		switch ( command_exec_status ) {
			case CL_SUBMITTED:
				description = "SUBMITTED";
				break;
			case CL_RUNNING:
				description = "RUNNING";
				break;
			case CL_COMPLETE:
				description = "COMPLETE";
				break;
			default:
				if ( command_exec_status < 0 )
					description = "Error (" + command_exec_status + ")";
				else
					description = "Unknown (" + LWJGLUtil.toHexString(command_exec_status) + ")";
		}
		System.out.println("[LWJGL] cl_event [" + LWJGLUtil.toHexString(cl_event) + "] status changed to " + description);
	}

}