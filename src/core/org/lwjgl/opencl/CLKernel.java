/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.PointerBuffer;

import java.nio.ByteBuffer;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This class is a wrapper around a cl_kernel pointer. */
public class CLKernel extends CLObjectChild<CLProgram> {

	private CLKernel(long pointer, CLProgram program) {
		super(pointer, program);
	}

	public static CLKernel create(long cl_kernel, CLProgram program) {
		if ( cl_kernel == NULL )
			return null;

		return new CLKernel(cl_kernel, program);
	}

	/**
	 * Sets a kernel argument at the specified index to the specified
	 * byte value.
	 *
	 * @param index the argument index
	 * @param value the argument value
	 *
	 * @return this CLKernel object
	 */
	public CLKernel setArg(int index, byte value) {
		ByteBuffer __buffer = apiBuffer().buffer();
		__buffer.put(0, value);
		clSetKernelArg(this, index, 1, __buffer);
		return this;
	}

	/**
	 * Sets a kernel argument at the specified index to the specified
	 * byte value.
	 *
	 * @param index the argument index
	 * @param value the argument value
	 *
	 * @return this CLKernel object
	 */
	public CLKernel setArg(int index, short value) {
		ByteBuffer __buffer = apiBuffer().buffer();
		__buffer.putShort(0, value);
		clSetKernelArg(this, index, 2, __buffer);
		return this;
	}

	@Override
	protected int getInfo(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		return nclGetKernelInfo(pointer, param_name, param_value_size, param_value, param_value_size_ret, getCapabilities().__CL10.GetKernelInfo);
	}

	/**
	 * Sets a kernel argument at the specified index to the specified
	 * int value.
	 *
	 * @param index the argument index
	 * @param value the argument value
	 *
	 * @return this CLKernel object
	 */
	public CLKernel setArg(int index, int value) {
		ByteBuffer __buffer = apiBuffer().buffer();
		__buffer.putInt(0, value);
		clSetKernelArg(this, index, 4, __buffer);
		return this;
	}

	/**
	 * Sets a kernel argument at the specified index to the specified
	 * long value.
	 *
	 * @param index the argument index
	 * @param value the argument value
	 *
	 * @return this CLKernel object
	 */
	public CLKernel setArg(int index, long value) {
		ByteBuffer __buffer = apiBuffer().buffer();
		__buffer.putLong(0, value);
		clSetKernelArg(this, index, 8, __buffer);
		return this;
	}

	/**
	 * Sets a kernel argument at the specified index to the specified
	 * float value.
	 *
	 * @param index the argument index
	 * @param value the argument value
	 *
	 * @return this CLKernel object
	 */
	public CLKernel setArg(int index, float value) {
		ByteBuffer __buffer = apiBuffer().buffer();
		__buffer.putFloat(0, value);
		clSetKernelArg(this, index, 4, __buffer);
		return this;
	}

	/**
	 * Sets a kernel argument at the specified index to the specified
	 * double value.
	 *
	 * @param index the argument index
	 * @param value the argument value
	 *
	 * @return this CLKernel object
	 */
	public CLKernel setArg(int index, double value) {
		ByteBuffer __buffer = apiBuffer().buffer();
		__buffer.putDouble(0, value);
		clSetKernelArg(this, index, 8, __buffer);
		return this;
	}

	/**
	 * Sets a kernel argument at the specified index to the specified
	 * pointer value.
	 *
	 * @param index the argument index
	 * @param value the argument value
	 *
	 * @return this CLKernel object
	 */
	public CLKernel setArg(int index, CLObject value) {
		ByteBuffer __buffer = apiBuffer().buffer();
		PointerBuffer.put(__buffer, 0, value.getPointer());
		clSetKernelArg(this, index, POINTER_SIZE, __buffer);
		return this;
	}

	/**
	 * Sets the size of a __local kernel argument at the specified index.
	 *
	 * @param index the argument index
	 * @param size  the argument size
	 *
	 * @return this CLKernel object
	 */
	public CLKernel setArgSize(int index, long size) {
		clSetKernelArg(this, index, size);
		return this;
	}

}