/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.PointerBuffer;

import java.nio.ByteBuffer;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This class is a wrapper around a cl_context pointer. */
public class CLContext extends CLObjectChild<CLPlatform> {

	private final long contextCallback;

	private CLContext(long pointer, CLPlatform platform, long contextCallback) {
		super(pointer, platform);

		this.contextCallback = contextCallback;
	}

	public static CLContext create(long cl_context, CLPlatform platform) {
		return create(cl_context, platform, NULL, NULL);
	}

	/** Used internally only. */
	static CLContext create(long cl_context, CLPlatform platform, long pfn_notify, long user_data) {
		if ( cl_context == NULL )
			return null;

		return new CLContext(cl_context, platform, NULL);
	}

	/** Used internally only. */
	static CLContext create(long cl_context, CLPlatform platform, CLContextCallback pfn_notify, long user_data) {
		if ( cl_context == NULL ) {
			if ( user_data != NULL )
				memGlobalRefDeleteWeak(user_data);

			return null;
		}

		return new CLContext(cl_context, platform, user_data);
	}

	@Override
	protected int getInfo(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		return nclGetContextInfo(pointer, param_name, param_value_size, param_value, param_value_size_ret, getCapabilities().__CL10.clGetContextInfo);
	}

	@Override
	protected void finalize() throws Throwable {
		if ( contextCallback != NULL )
			memGlobalRefDeleteWeak(contextCallback);
	}

	// -- [ INTERNAL ] --

	static CLPlatform getPlatform(ByteBuffer properties) {
		return getPlatform(new PointerBuffer(properties));
	}

	static CLPlatform getPlatform(PointerBuffer properties) {
		long platformID = 0;

		int keys = properties.remaining() >> 1;
		for ( int k = 0; k < keys; k++ ) {
			long key = properties.get(k << 1);
			if ( key == 0 )
				break;

			if ( key == CL_CONTEXT_PLATFORM ) {
				platformID = properties.get((k << 1) + 1);
				break;
			}
		}

		if ( platformID == 0 )
			throw new OpenCLException("Could not find CL_CONTEXT_PLATFORM in cl_context_properties.");

		CLPlatform platform = CLPlatform.get(platformID);
		if ( platform == null )
			throw new OpenCLException("Could not find a valid CLPlatform. Make sure clGetPlatformIDs has been used before.");

		return platform;
	}

}