/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Map;

import static org.lwjgl.opencl.CL10.*;

public final class CLUtil {

	/** Maps OpenCL error token values to their String representations. */
	private static final Map<Integer, String> CL_ERROR_TOKENS = LWJGLUtil.getClassTokens(new LWJGLUtil.TokenFilter() {
		public boolean accept(Field field, int value) {
			return value < 0; // Currently, all OpenCL errors have negative values.
		}
	}, null, CL10.class, CL11.class, CL12.class, KHRGLSharing.class, KHRICD.class, APPLEGLSharing.class/*, EXTDeviceFission.class*/);

	private CLUtil() {}

	public static void checkCLError(ByteBuffer errcode_ret) {
		checkCLError(errcode_ret.getInt(errcode_ret.position()));
	}

	public static void checkCLError(IntBuffer errcode_ret) {
		checkCLError(errcode_ret.get(errcode_ret.position()));
	}

	public static void checkCLError(int errcode) {
		if ( errcode != CL_SUCCESS )
			throwCLError(errcode);
	}

	private static void throwCLError(int errcode) {
		String errname = CL_ERROR_TOKENS.get(errcode);
		if ( errname == null )
			errname = "UNKNOWN";
		throw new OpenCLException("Error Code: " + errname);
	}

}