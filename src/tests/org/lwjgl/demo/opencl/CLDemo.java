/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.opencl;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opencl.*;
import org.lwjgl.system.FunctionProviderLocal;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CL11.*;
import static org.lwjgl.opencl.CLUtil.*;
import static org.lwjgl.opencl.KHRICD.*;

public final class CLDemo {

	private CLDemo() {
	}

	public static void main(String[] args) {
		CL.create();

		List<CLPlatform> platforms = CLPlatform.getPlatforms();
		if ( platforms == null )
			throw new RuntimeException("No OpenCL platforms found.");

		IntBuffer errcode_ret = BufferUtils.createIntBuffer(1);

		for ( CLPlatform platform : platforms ) {
			System.out.println("\n-------------------------");
			System.out.println("NEW PLATFORM: " + platform.getPointer());

			System.out.println(platform.getCapabilities());
			System.out.println("-------------------------");
			printPlatformInfo(platform, "CL_PLATFORM_PROFILE", CL_PLATFORM_PROFILE);
			printPlatformInfo(platform, "CL_PLATFORM_VERSION", CL_PLATFORM_VERSION);
			printPlatformInfo(platform, "CL_PLATFORM_NAME", CL_PLATFORM_NAME);
			printPlatformInfo(platform, "CL_PLATFORM_VENDOR", CL_PLATFORM_VENDOR);
			printPlatformInfo(platform, "CL_PLATFORM_EXTENSIONS", CL_PLATFORM_EXTENSIONS);
			if ( platform.getCapabilities().cl_khr_icd )
				printPlatformInfo(platform, "CL_PLATFORM_ICD_SUFFIX_KHR", CL_PLATFORM_ICD_SUFFIX_KHR);
			System.out.println("");

			PointerBuffer ctxProps = BufferUtils.createPointerBuffer(3);
			ctxProps.put(CL_CONTEXT_PLATFORM).put(platform.getPointer()).put(0).flip();

			List<CLDevice> devices = platform.getDevices(CL_DEVICE_TYPE_ALL);
			for ( CLDevice device : devices ) {
				CLCapabilities caps = device.getCapabilities();

				System.out.println("\n\tNEW DEVICE: " + device.getPointer());
				System.out.print("\t");
				System.out.println(caps);
				System.out.println("\t-------------------------");

				System.out.println("\tCL_DEVICE_TYPE = " + device.getInfoLong(CL_DEVICE_TYPE));
				System.out.println("\tCL_DEVICE_VENDOR_ID = " + device.getInfoInt(CL_DEVICE_VENDOR_ID));
				System.out.println("\tCL_DEVICE_MAX_COMPUTE_UNITS = " + device.getInfoInt(CL_DEVICE_MAX_COMPUTE_UNITS));
				System.out.println("\tCL_DEVICE_MAX_WORK_ITEM_DIMENSIONS = " + device.getInfoInt(CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS));
				System.out.println("\tCL_DEVICE_MAX_WORK_GROUP_SIZE = " + device.getInfoSize(CL_DEVICE_MAX_WORK_GROUP_SIZE));
				System.out.println("\tCL_DEVICE_MAX_CLOCK_FREQUENCY = " + device.getInfoInt(CL_DEVICE_MAX_CLOCK_FREQUENCY));
				System.out.println("\tCL_DEVICE_ADDRESS_BITS = " + device.getInfoInt(CL_DEVICE_ADDRESS_BITS));
				System.out.println("\tCL_DEVICE_AVAILABLE = " + device.getInfoBoolean(CL_DEVICE_AVAILABLE));
				System.out.println("\tCL_DEVICE_COMPILER_AVAILABLE = " + device.getInfoBoolean(CL_DEVICE_COMPILER_AVAILABLE));

				printDeviceInfo(device, "CL_DEVICE_NAME", CL_DEVICE_NAME);
				printDeviceInfo(device, "CL_DEVICE_VENDOR", CL_DEVICE_VENDOR);
				printDeviceInfo(device, "CL_DRIVER_VERSION", CL_DRIVER_VERSION);
				printDeviceInfo(device, "CL_DEVICE_PROFILE", CL_DEVICE_PROFILE);
				printDeviceInfo(device, "CL_DEVICE_VERSION", CL_DEVICE_VERSION);
				printDeviceInfo(device, "CL_DEVICE_EXTENSIONS", CL_DEVICE_EXTENSIONS);
				if ( caps.OpenCL11 )
					printDeviceInfo(device, "CL_DEVICE_OPENCL_C_VERSION", CL_DEVICE_OPENCL_C_VERSION);

				CLContext context = clCreateContext(ctxProps, device, CLContextCallback.Util.getDefault(), errcode_ret);
				checkCLError(errcode_ret);

				CLMem buffer = clCreateBuffer(context, CL_MEM_READ_ONLY, 128, errcode_ret);
				checkCLError(errcode_ret);

				int errcode;

				if ( caps.OpenCL11 ) {
					errcode = clSetMemObjectDestructorCallback(buffer, new CLMemObjectDestructorCallback() {
						@Override
						public void invoke(long cl_mem) {
							System.out.println("\t\tBuffer destructed (1): " + cl_mem);
						}
					});
					checkCLError(errcode);

					errcode = clSetMemObjectDestructorCallback(buffer, new CLMemObjectDestructorCallback() {
						@Override
						public void invoke(long cl_mem) {
							System.out.println("\t\tBuffer destructed (2): " + cl_mem);
						}
					});
					checkCLError(errcode);
				}

				CLMem subbuffer = null;
				if ( caps.OpenCL11 ) {
					ByteBuffer buffer_region = cl_buffer_region.malloc(0, 64);

					subbuffer = clCreateSubBuffer(buffer, CL_MEM_READ_ONLY, CL_BUFFER_CREATE_TYPE_REGION, buffer_region, errcode_ret);
					checkCLError(errcode_ret);

					errcode = clSetMemObjectDestructorCallback(subbuffer, new CLMemObjectDestructorCallback() {
						@Override
						public void invoke(long cl_mem) {
							System.out.println("\t\tSub Buffer destructed: " + cl_mem);
						}
					});
					checkCLError(errcode);
				}

				long exec_caps = device.getInfoLong(CL_DEVICE_EXECUTION_CAPABILITIES);
				if ( (exec_caps & CL_EXEC_NATIVE_KERNEL) == CL_EXEC_NATIVE_KERNEL ) {
					System.out.println("\t\t-TRYING TO EXEC NATIVE KERNEL-");
					CLCommandQueue queue = clCreateCommandQueue(context, device, 0L, errcode_ret);

					PointerBuffer ev = BufferUtils.createPointerBuffer(1);

					ByteBuffer kernelArgs = BufferUtils.createByteBuffer(POINTER_SIZE * 2 + 4);
					kernelArgs.putInt(POINTER_SIZE, 1337);

					errcode = clEnqueueNativeKernel(queue, new CLNativeKernel.BufAdapter() {
						@Override
						public void invoke(ByteBuffer args) {
							System.out.println("\t\tKERNEL EXEC arguments: " + args.getInt(0) + ", should be 1337");
						}
					}, kernelArgs, null, null, null, ev);
					checkCLError(errcode);

					CLEvent e = CLEvent.create(ev.get(0), context);

					final CountDownLatch latch = new CountDownLatch(1);
					errcode = clSetEventCallback(e, CL_COMPLETE, new CLEventCallback() {
						@Override
						public void invoke(long cl_event, int command_exec_status) {
							System.out.println("\t\tEvent callback status: " + getEventStatusName(command_exec_status));
							latch.countDown();
						}
					});
					checkCLError(errcode);

					try {
						boolean expired = !latch.await(500, TimeUnit.MILLISECONDS);
						if ( expired )
							System.out.println("\t\tKERNEL EXEC FAILED!");
					} catch (InterruptedException exc) {
						exc.printStackTrace();
					}

					errcode = clReleaseEvent(e);
					checkCLError(errcode);

					kernelArgs = BufferUtils.createByteBuffer(POINTER_SIZE * 2);

					CLNativeKernel kernel = new CLNativeKernel() {
						@Override
						public void invoke(long args, int cb_args) {
						}
					};

					long time = System.nanoTime();
					int REPEAT = 100000;
					for ( int i = 0; i < REPEAT; i++ )
						clEnqueueNativeKernel(queue, kernel, kernelArgs, null, null, null, null);
					clFinish(queue);
					time = System.nanoTime() - time;

					System.out.printf("\n\t\tEMPTY NATIVE KERNEL AVG EXEC TIME: %.4fus\n", (double)time / (REPEAT * 1000));

					errcode = clReleaseCommandQueue(queue);
					checkCLError(errcode);
				}

				System.out.println();

				if ( subbuffer != null ) {
					errcode = clReleaseMemObject(subbuffer);
					checkCLError(errcode);
				}

				errcode = clReleaseMemObject(buffer);
				checkCLError(errcode);

				errcode = clReleaseContext(context);
				checkCLError(errcode);
			}
		}
	}

	public static void get(FunctionProviderLocal provider, long platform, String name) {
		System.out.println(name + ": " + provider.getFunctionAddress(platform, name));
	}

	private static void printPlatformInfo(CLPlatform platform, String param_name, int param) {
		System.out.println("\t" + param_name + " = " + platform.getInfoStringUTF8(param));
	}

	private static void printDeviceInfo(CLDevice device, String param_name, int param) {
		System.out.println("\t" + param_name + " = " + device.getInfoStringUTF8(param));
	}

	private static String getEventStatusName(int status) {
		switch ( status ) {
			case CL_QUEUED:
				return "CL_QUEUED";
			case CL_SUBMITTED:
				return "CL_SUBMITTED";
			case CL_RUNNING:
				return "CL_RUNNING";
			case CL_COMPLETE:
				return "CL_COMPLETE";
			default:
				throw new IllegalArgumentException(String.format("Unsupported event status: 0x%X", status));
		}
	}

}