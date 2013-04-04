/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import static org.lwjgl.Pointer.*;
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
		clSetKernelArg(this, index, 1, apiBuffer().byteValue(0, value).buffer());
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
		clSetKernelArg(this, index, 2, apiBuffer().shortValue(0, value).buffer());
		return this;
	}

	@Override
	protected int getInfo(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		return nclGetKernelInfo(pointer, param_name, param_value_size, param_value, param_value_size_ret, getCapabilities().__CL10.clGetKernelInfo);
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
		clSetKernelArg(this, index, 4, apiBuffer().intValue(0, value).buffer());
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
		clSetKernelArg(this, index, 8, apiBuffer().longValue(0, value).buffer());
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
		clSetKernelArg(this, index, 4, apiBuffer().floatValue(0, value).buffer());
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
		clSetKernelArg(this, index, 8, apiBuffer().doubleValue(0, value).buffer());
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
		clSetKernelArg(this, index, POINTER_SIZE, apiBuffer().pointerValue(0, value).buffer());
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