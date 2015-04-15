/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opencl.CLPlatform.Filter;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CL11.*;
import static org.lwjgl.opencl.CLUtil.*;
import static org.lwjgl.opencl.Info.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.testng.Assert.*;

@Test
public class CLTest {

	private static final Filter<CLPlatform> CL11_FILTER = new Filter<CLPlatform>() {
		@Override
		public boolean accept(CLPlatform platform) {
			return platform.getCapabilities().OpenCL11;

		}
	};

	private static final Filter<CLPlatform> CL12_FILTER = new Filter<CLPlatform>() {
		@Override
		public boolean accept(CLPlatform platform) {
			return platform.getCapabilities().OpenCL12;

		}
	};

	private static final CLCreateContextCallback CREATE_CONTEXT_CALLBACK = new CLCreateContextCallback() {
		@Override
		public void invoke(long errinfo, long private_info, long cb, long user_data) {
			System.err.println("[LWJGL] cl_create_context_callback");
			System.err.println("\tInfo: " + memDecodeUTF8(errinfo));
		}
	};

	@BeforeClass
	private void createCL() {
		try {
			CL.getFunctionProvider();
		} catch (Throwable t) {
			throw new SkipException("Skipped because OpenCL initialization failed [" + t.getMessage() + "]");
		} finally {
			CL.destroy();
		}
	}

	public void testLifecycle() {
		try {
			CL.create();
			List<CLPlatform> platforms = CLPlatform.getPlatforms();
			assertFalse(platforms.isEmpty());

			for ( CLPlatform platform : platforms ) {
				List<CLDevice> devices = platform.getDevices(CL_DEVICE_TYPE_ALL);
				assertFalse(devices.isEmpty());
			}
		} finally {
			CL.destroy();
		}
	}

	private interface ContextTest {

		void test(CLPlatform platform, PointerBuffer ctxProps, CLDevice device);
	}

	private static void contextTest(ContextTest test) {
		contextTest(null, test);
	}

	private static void contextTest(Filter<CLPlatform> platformFilter, ContextTest test) {
		try {
			CL.create();
			List<CLPlatform> platforms = CLPlatform.getPlatforms(platformFilter);
			if ( platforms.isEmpty() ) {
				assert platformFilter != null;
				throw new SkipException("Skipped because the platform filter did not match with any cl_platform.");
			} else {
				for ( CLPlatform platform : platforms ) {
					PointerBuffer ctxProps = BufferUtils.createPointerBuffer(3);
					ctxProps.put(CL_CONTEXT_PLATFORM).put(platform).put(0).flip();

					List<CLDevice> devices = platform.getDevices(CL_DEVICE_TYPE_ALL);
					for ( CLDevice device : devices )
						test.test(platform, ctxProps, device);
				}
			}
		} finally {
			CL.destroy();
		}
	}

	public void testContext() {
		contextTest(new ContextTest() {
			@Override
			public void test(CLPlatform platform, PointerBuffer ctxProps, CLDevice device) {
				IntBuffer errcode_ret = BufferUtils.createIntBuffer(1);

				long context = clCreateContext(ctxProps, device.getPointer(), CREATE_CONTEXT_CALLBACK, NULL, errcode_ret);
				checkCLError(errcode_ret);
				assertNotNull(context);

				long queue = clCreateCommandQueue(context, device.getPointer(), 0, errcode_ret);
				checkCLError(errcode_ret);
				assertNotNull(queue);

				long buffer = clCreateBuffer(context, CL_MEM_READ_ONLY, 128, errcode_ret);
				checkCLError(errcode_ret);
				assertNotNull(buffer);

				checkCLError(clReleaseCommandQueue(queue));
				checkCLError(clReleaseMemObject(buffer));
				checkCLError(clReleaseContext(context));
			}
		});
	}

	public void testNativeKernel() {
		contextTest(new ContextTest() {
			@Override
			public void test(CLPlatform platform, PointerBuffer ctxProps, CLDevice device) {
				if ( (clGetDeviceInfoLong(device.getPointer(), CL_DEVICE_EXECUTION_CAPABILITIES) & CL_EXEC_NATIVE_KERNEL) == 0 )
					return;

				IntBuffer errcode_ret = BufferUtils.createIntBuffer(1);

				long context = clCreateContext(ctxProps, device.getPointer(), CREATE_CONTEXT_CALLBACK, NULL, errcode_ret);
				checkCLError(errcode_ret);

				long queue = clCreateCommandQueue(context, device.getPointer(), 0, errcode_ret);
				checkCLError(errcode_ret);

				// Create a buffer
				final long buffer = clCreateBuffer(context, CL_MEM_READ_ONLY, 128, errcode_ret);
				checkCLError(errcode_ret);

				final int BUFFER_SIZE = (int)clGetMemObjectInfoPointer(buffer, CL_MEM_SIZE);
				assertEquals(BUFFER_SIZE, 128);

				// Fill with non-random data
				ByteBuffer bufferContents = BufferUtils.createByteBuffer(BUFFER_SIZE);
				for ( int i = 0; i < bufferContents.capacity(); i++ )
					bufferContents.put(i, (byte)i);

				checkCLError(clEnqueueWriteBuffer(queue, buffer, CL_TRUE, 0, bufferContents, null, null));

				// Prepare enqueue arguments

				ByteBuffer args = BufferUtils.createByteBuffer(4 * 2 + POINTER_SIZE);

				// non-random numbers
				args.putInt(0xDEADBEEF);
				args.putInt(1337);

				// a cl_mem object
				PointerBuffer mem_list = BufferUtils.createPointerBuffer(1);
				mem_list.put(0, buffer);

				// offset to where the pointer to global memory for the cl_mem object will be placed
				PointerBuffer args_mem_loc = BufferUtils.createPointerBuffer(1);
				args_mem_loc.put(0, args); // current args position
				args.clear();

				// A cl_event will be stored here that will let us know when the native kernel has been called.
				PointerBuffer eventOut = BufferUtils.createPointerBuffer(1);

				CLNativeKernel kernel;
				checkCLError(
					clEnqueueNativeKernel(queue, kernel = new CLNativeKernel() {
						@Override
						public void invoke(long args) {
							ByteBuffer arguments = memByteBuffer(args, 4 * 2 + POINTER_SIZE);

							assertEquals(arguments.getInt(0), 0xDEADBEEF);
							assertEquals(arguments.getInt(4), 1337);

							long memAddress = PointerBuffer.get(arguments, 8);
							assertTrue(memAddress != NULL);
							assertTrue(memAddress != buffer);

							ByteBuffer kernelBuffer = memByteBuffer(memAddress, BUFFER_SIZE);
							for ( int i = 0; i < kernelBuffer.capacity(); i++ )
								assertEquals(kernelBuffer.get(i), i);
						}
					}, args, mem_list, args_mem_loc, null, eventOut)
				);

				long e = eventOut.get(0);
				assertNotNull(e);

				final CountDownLatch latch = new CountDownLatch(1);
				CLEventCallback eventCallback;
				checkCLError(
					clSetEventCallback(e, CL_COMPLETE, eventCallback = new CLEventCallback() {
						@Override
						public void invoke(long event, int event_command_exec_status, long user_data) {
							latch.countDown();
						}
					}, NULL)
				);

				try {
					latch.await();
					kernel.release();
				} catch (InterruptedException exc) {
					exc.printStackTrace();
				}

				checkCLError(clReleaseEvent(e));
				eventCallback.release();
				checkCLError(clReleaseCommandQueue(queue));
				checkCLError(clReleaseContext(context));
			}
		});
	}

	public void testMemObjectDestructor() {
		contextTest(CL11_FILTER, new ContextTest() {
			@Override
			public void test(CLPlatform platform, PointerBuffer ctxProps, CLDevice device) {
				IntBuffer errcode_ret = BufferUtils.createIntBuffer(1);

				long context = clCreateContext(ctxProps, device.getPointer(), CREATE_CONTEXT_CALLBACK, NULL, errcode_ret);
				checkCLError(errcode_ret);

				long buffer = clCreateBuffer(context, CL_MEM_READ_ONLY, 128, errcode_ret);
				checkCLError(errcode_ret);
				assertNotNull(buffer);

				final CountDownLatch eventLatch = new CountDownLatch(1);

				CLMemObjectDestructorCallback memDestructorCallback;
				checkCLError(
					clSetMemObjectDestructorCallback(buffer, memDestructorCallback = new CLMemObjectDestructorCallback() {
						@Override
						public void invoke(long memobj, long user_data) {
							eventLatch.countDown();
						}
					}, NULL)
				);
				assertEquals(clGetMemObjectInfoInt(buffer, CL_MEM_REFERENCE_COUNT), 1);

				checkCLError(clRetainMemObject(buffer));
				assertEquals(clGetMemObjectInfoInt(buffer, CL_MEM_REFERENCE_COUNT), 2);

				checkCLError(clReleaseMemObject(buffer));
				assertEquals(clGetMemObjectInfoInt(buffer, CL_MEM_REFERENCE_COUNT), 1);
				assertEquals(eventLatch.getCount(), 1L);

				checkCLError(clReleaseMemObject(buffer));

				try {
					if ( !eventLatch.await(100, TimeUnit.MILLISECONDS) )
						throw new IllegalStateException("MemObjectDestructor callback failed.");
				} catch (InterruptedException exc) {
					exc.printStackTrace();
				} finally {
					memDestructorCallback.release();
				}

				checkCLError(clReleaseContext(context));
			}
		});
	}

	public void testEventCallback() {
		contextTest(CL11_FILTER, new ContextTest() {
			@Override
			public void test(CLPlatform platform, PointerBuffer ctxProps, CLDevice device) {
				IntBuffer errcode_ret = BufferUtils.createIntBuffer(1);

				long context = clCreateContext(ctxProps, device.getPointer(), CREATE_CONTEXT_CALLBACK, NULL, errcode_ret);
				checkCLError(errcode_ret);
				assertNotNull(context);

				final long e = clCreateUserEvent(context, errcode_ret);
				checkCLError(errcode_ret);
				assertNotNull(e);

				final CountDownLatch eventLatch = new CountDownLatch(1);

				CLEventCallback eventCallback;
				checkCLError(
					clSetEventCallback(e, CL_COMPLETE, eventCallback = new CLEventCallback() {
						@Override
						public void invoke(long event, int event_command_exec_status, long user_data) {
							assertEquals(event, e);
							assertEquals(event_command_exec_status, CL_COMPLETE);

							eventLatch.countDown();
						}
					}, NULL)
				);

				checkCLError(clSetUserEventStatus(e, CL_COMPLETE));

				try {
					if ( !eventLatch.await(100, TimeUnit.MILLISECONDS) )
						throw new IllegalStateException("Event callback failed.");
				} catch (InterruptedException exc) {
					exc.printStackTrace();
				}

				checkCLError(clReleaseEvent(e));
				eventCallback.release();
				checkCLError(clReleaseContext(context));
			}
		});
	}

	public void testSubBuffer() {
		contextTest(CL11_FILTER, new ContextTest() {
			@Override
			public void test(CLPlatform platform, PointerBuffer ctxProps, CLDevice device) {
				IntBuffer errcode_ret = BufferUtils.createIntBuffer(1);

				long context = clCreateContext(ctxProps, device.getPointer(), CREATE_CONTEXT_CALLBACK, NULL, errcode_ret);
				checkCLError(errcode_ret);
				assertNotNull(context);

				long buffer = clCreateBuffer(context, CL_MEM_READ_ONLY, 128, errcode_ret);
				checkCLError(errcode_ret);
				assertNotNull(buffer);

				ByteBuffer bufferRegion = CLBufferRegion.malloc(0, 64);

				long subbuffer = clCreateSubBuffer(buffer, CL_MEM_READ_ONLY, CL_BUFFER_CREATE_TYPE_REGION, bufferRegion, errcode_ret);
				checkCLError(errcode_ret);
				assertNotNull(subbuffer);

				checkCLError(clReleaseMemObject(buffer));
				checkCLError(clReleaseMemObject(subbuffer));
				checkCLError(clReleaseContext(context));
			}
		});
	}

}