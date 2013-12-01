/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import java.lang.reflect.Method;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.system.APIUtil.*;

/** Instances of this interface may be passed to the {@link CL11#clSetEventCallback(long, int, CLEventCallback) SetEventCallback} method. */
/*@FunctionalInterface*/
public interface CLEventCallback {

	/**
	 * Called when the execution status of the command associated with {@code event} changes to an execution status equal to or past the status specified by
	 * {@code command_exec_status}.
	 *
	 * @param cl_event            the cl_event
	 * @param command_exec_status the new command execution status
	 */
	void invoke(long cl_event, int command_exec_status);

	final class Util {

		static final long CALLBACK = setCallback(apiCallbackMethod(CLEventCallback.class, long.class, int.class));

		private static final CLEventCallback DEFAULT = new CLEventCallback() {
			@Override
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
						description = String.format(command_exec_status < 0 ? "Error (%d)" : "Unknown (0x%X)", command_exec_status);
				}
				System.out.printf("[LWJGL] cl_event [0x%X] status changed to %s\n", cl_event, description);
			}
		};

		private Util() {
		}

		private static native long setCallback(Method callback);

		/**
		 * Returns a default {@code CLEventCallback} implementation that prints a simple description in the standard output stream.
		 *
		 * @return the default implementation
		 */
		public static CLEventCallback getDefault() {
			return DEFAULT;
		}

	}

}