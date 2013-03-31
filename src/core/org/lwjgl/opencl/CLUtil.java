/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.APIUtil;

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
	}, null, CL10.class, CL11.class, CL12.class, KHRGLSharing.class, KHRIcd.class, APPLEGLSharing.class/*, EXTDeviceFission.class*/);

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

	interface StringInfoProvider<T extends CLObject> {

		int getInfo(T t, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret);

	}

	private static <T extends CLObject> int getInfoString(T object, int param_name, StringInfoProvider<T> provider, APIBuffer __buffer) {
		// Get string length
		int errcode = provider.getInfo(object, param_name, 0L, null, __buffer.buffer());
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);

		int bytes = __buffer.intValue(0);
		__buffer.bufferParam(bytes);

		// Get string
		errcode = provider.getInfo(object, param_name, bytes, __buffer.buffer(), null);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);

		return bytes - 1; // all OpenCL char[] parameters are null-terminated
	}

	static <T extends CLObject> String getInfoStringASCII(T object, int param_name, StringInfoProvider<T> provider) {
		APIBuffer __buffer = APIUtil.apiBuffer();
		int bytes = getInfoString(object, param_name, provider, __buffer);
		return __buffer.stringValueASCII(0, bytes);
	}

	static <T extends CLObject> String getInfoStringUTF8(T object, int param_name, StringInfoProvider<T> provider) {
		APIBuffer __buffer = APIUtil.apiBuffer();
		int bytes = getInfoString(object, param_name, provider, __buffer);
		return __buffer.stringValueUTF8(0, bytes);
	}

}