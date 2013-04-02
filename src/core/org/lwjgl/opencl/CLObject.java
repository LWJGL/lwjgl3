/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.PointerWrapper;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.opencl.CLUtil.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Base super-class for all OpenCL classes.
 * <p/>
 * This classes provides <strong>getInfo&lt;Type&gt;</strong> methods that can be used to query information about the CL object. Which one of these methods
 * should be used depends on the type of the information being queried.
 * <p/>
 * The implementation calls the appropriate CL function based on the concrete {@code CLObject} class, e.g. {@link CL10#clGetPlatformInfo} for {@link CLPlatform}.
 */
public abstract class CLObject extends PointerWrapper {

	CLObject(long pointer) {
		super(pointer);
	}

	/** Returns the {@link CLCapabilities} instance associated with this {@code CLObject}. */
	public abstract CLCapabilities getCapabilities();

	protected abstract int getInfo(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret);

	/**
	 * Returns the integer value for the given {@code param_name}, converted to a boolean.
	 *
	 * @param param_name the parameter to query
	 *
	 * @return the parameter's boolean value
	 */
	public boolean getInfoBoolean(int param_name) {
		return getInfoInt(param_name) != 0;
	}

	/**
	 * Returns the integer value for the given {@code param_name}.
	 *
	 * @param param_name the parameter to query
	 *
	 * @return the parameter's int value
	 */
	public int getInfoInt(int param_name) {
		APIBuffer __buffer = apiBuffer();
		int errcode = getInfo(getPointer(), param_name, 4L, __buffer.address(), 0L);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.intValue(0);
	}

	/**
	 * Returns the long value for the given {@code param_name}.
	 *
	 * @param param_name the parameter to query
	 *
	 * @return the parameter's long value
	 */
	public long getInfoLong(int param_name) {
		APIBuffer __buffer = apiBuffer();
		int errcode = getInfo(getPointer(), param_name, 8L, __buffer.address(), 0L);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.longValue(0);
	}

	/**
	 * Returns the value for the given {@code param_name} that represents a size (may be 32-bit or 64-bit in length), converted to a long.
	 *
	 * @param param_name the parameter to query
	 *
	 * @return the parameter's long value
	 */
	public long getInfoSize(int param_name) {
		return getInfoPointer(param_name);
	}

	/**
	 * Returns the pointer value for the given {@code param_name}.
	 *
	 * @param param_name the parameter to query
	 *
	 * @return the parameter's pointer value
	 */
	public long getInfoPointer(int param_name) {
		APIBuffer __buffer = apiBuffer();
		int errcode = getInfo(getPointer(), param_name, POINTER_SIZE, __buffer.address(), 0L);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.pointerValue(0);
	}

	/**
	 * Writes the pointer list for the given {@code param_name} into {@code target}.
	 *
	 * @param param_name the parameter to query
	 * @param target     the buffer in which to put the returned pointer list
	 *
	 * @return how many pointers were actually returned
	 */
	public int getInfoPointers(int param_name, PointerBuffer target) {
		APIBuffer __buffer = apiBuffer();
		int errcode = getInfo(getPointer(), param_name, target.remaining() * POINTER_SIZE, memAddress(target), __buffer.address());
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return (int)(__buffer.pointerValue(0) >> POINTER_SHIFT);
	}

	/**
	 * Returns the string value for the given {@code param_name}. The raw bytes returned are assumed to be ASCII encoded.
	 *
	 * @param param_name the parameter to query
	 *
	 * @return the parameter's string value
	 */
	public String getInfoStringASCII(int param_name) {
		APIBuffer __buffer = apiBuffer();
		int bytes = getInfoString(param_name, __buffer);
		return __buffer.stringValueASCII(0, bytes);
	}

	/**
	 * Returns the string value for the given {@code param_name}. The raw bytes returned are assumed to be ASCII encoded and have length equal to {@code param_value_size}.
	 *
	 * @param param_name       the parameter to query
	 * @param param_value_size the explicit string length
	 *
	 * @return the parameter's string value
	 */
	public String getInfoStringASCII(int param_name, int param_value_size) {
		APIBuffer __buffer = apiBuffer();
		int errcode = getInfo(getPointer(), param_name, param_value_size, __buffer.address(), 0L);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.stringValueASCII(0, param_value_size);
	}

	/**
	 * Returns the string value for the given {@code param_name}. The raw bytes returned are assumed to be UTF-8 encoded.
	 *
	 * @param param_name the parameter to query
	 *
	 * @return the parameter's string value
	 */
	public String getInfoStringUTF8(int param_name) {
		APIBuffer __buffer = apiBuffer();
		int bytes = getInfoString(param_name, __buffer);
		return __buffer.stringValueUTF8(0, bytes);
	}

	/**
	 * Returns the string value for the given {@code param_name}. The raw bytes returned are assumed to be UTF-8 encoded and have length equal to {@code param_value_size}.
	 *
	 * @param param_name       the parameter to query
	 * @param param_value_size the explicit string length
	 *
	 * @return the parameter's string value
	 */
	public String getInfoStringUTF8(int param_name, int param_value_size) {
		APIBuffer __buffer = apiBuffer();
		int errcode = getInfo(getPointer(), param_name, param_value_size, __buffer.address(), 0L);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.stringValueUTF8(0, param_value_size);
	}

	private int getInfoString(int param_name, APIBuffer __buffer) {
		// Get string length
		int errcode = getInfo(getPointer(), param_name, 0, 0L, __buffer.address());
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);

		int bytes = __buffer.intValue(0);
		__buffer.bufferParam(bytes);

		// Get string
		errcode = getInfo(getPointer(), param_name, bytes, __buffer.address(), 0L);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);

		return bytes - 1; // all OpenCL char[] parameters are null-terminated
	}

}