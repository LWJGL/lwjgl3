/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.testng.*;
import org.testng.annotations.*;

import java.nio.*;
import java.util.concurrent.*;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CL11.*;
import static org.lwjgl.opencl.InfoUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.testng.Assert.*;

@Test
public class CLTest {

    private static CLContextCallback CONTEXT_CALLBACK;

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

            try (MemoryStack stack = stackPush()) {
                IntBuffer pi = stack.mallocInt(1);
                checkCLError(clGetPlatformIDs(null, pi));
                assertNotEquals(pi.get(0), 0);

                PointerBuffer platforms = stack.mallocPointer(pi.get(0));
                checkCLError(clGetPlatformIDs(platforms, (IntBuffer)null));

                for (int i = 0; i < platforms.capacity(); i++) {
                    long platform = platforms.get(0);

                    checkCLError(clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL, null, pi));
                    assertNotEquals(pi.get(0), 0);
                }
            }
        } finally {
            CL.destroy();
        }
    }

    private interface ContextTest {
        void test(long platform, PointerBuffer ctxProps, long device);
    }

    private static void contextTest(ContextTest test) {
        try {
            CONTEXT_CALLBACK = CLContextCallback.create((errinfo, private_info, cb, user_data) -> {
                System.err.println("[LWJGL] cl_context_callback");
                System.err.println("\tInfo: " + memUTF8(errinfo));
            });

            CL.create();

            try (MemoryStack stack = stackPush()) {
                IntBuffer pi = stack.mallocInt(1);
                checkCLError(clGetPlatformIDs(null, pi));

                PointerBuffer platforms = stack.mallocPointer(pi.get(0));
                checkCLError(clGetPlatformIDs(platforms, (IntBuffer)null));

                for (int i = 0; i < platforms.capacity(); i++) {
                    long platform = platforms.get(0);

                    checkCLError(clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL, null, pi));

                    PointerBuffer devices = stack.mallocPointer(pi.get(0));
                    checkCLError(clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL, devices, (IntBuffer)null));

                    PointerBuffer ctxProps = stack.mallocPointer(3);
                    ctxProps
                        .put(0, CL_CONTEXT_PLATFORM)
                        .put(1, platform)
                        .put(2, 0);

                    for (int j = 0; j < devices.capacity(); j++) {
                        test.test(platform, ctxProps, devices.get(j));
                    }
                }
            }
        } finally {
            CL.destroy();

            CONTEXT_CALLBACK.free();
        }
    }

    public void testContext() {
        contextTest((platform, ctxProps, device) -> {
            IntBuffer errcode_ret = BufferUtils.createIntBuffer(1);

            long context = clCreateContext(ctxProps, device, CONTEXT_CALLBACK, NULL, errcode_ret);
            checkCLError(errcode_ret);
            assertNotNull(context);

            long queue = clCreateCommandQueue(context, device, 0, errcode_ret);
            checkCLError(errcode_ret);
            assertNotNull(queue);

            long buffer = clCreateBuffer(context, CL_MEM_READ_ONLY, 128, errcode_ret);
            checkCLError(errcode_ret);
            assertNotNull(buffer);

            checkCLError(clReleaseCommandQueue(queue));
            checkCLError(clReleaseMemObject(buffer));
            checkCLError(clReleaseContext(context));
        });
    }

    public void testNativeKernel() {
        contextTest((platform, ctxProps, device) -> {
            if ((getDeviceInfoLong(device, CL_DEVICE_EXECUTION_CAPABILITIES) & CL_EXEC_NATIVE_KERNEL) == 0) {
                return;
            }

            IntBuffer errcode_ret = BufferUtils.createIntBuffer(1);

            long context = clCreateContext(ctxProps, device, CONTEXT_CALLBACK, NULL, errcode_ret);
            checkCLError(errcode_ret);

            long queue = clCreateCommandQueue(context, device, 0, errcode_ret);
            checkCLError(errcode_ret);

            // Create a buffer
            long buffer = clCreateBuffer(context, CL_MEM_READ_ONLY, 128, errcode_ret);
            checkCLError(errcode_ret);

            int BUFFER_SIZE = (int)getMemObjectInfoPointer(buffer, CL_MEM_SIZE);
            assertEquals(BUFFER_SIZE, 128);

            // Fill with non-random data
            ByteBuffer bufferContents = BufferUtils.createByteBuffer(BUFFER_SIZE);
            for (int i = 0; i < bufferContents.capacity(); i++) {
                bufferContents.put(i, (byte)i);
            }

            checkCLError(clEnqueueWriteBuffer(queue, buffer, true, 0, bufferContents, null, null));

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
                clEnqueueNativeKernel(queue, kernel = CLNativeKernel.create(argAddress -> {
                    ByteBuffer arguments = memByteBuffer(argAddress, 4 * 2 + POINTER_SIZE);

                    assertEquals(arguments.getInt(0), 0xDEADBEEF);
                    assertEquals(arguments.getInt(4), 1337);

                    long memAddress = PointerBuffer.get(arguments, 8);
                    assertTrue(memAddress != NULL);
                    assertTrue(memAddress != buffer);

                    ByteBuffer kernelBuffer = memByteBuffer(memAddress, BUFFER_SIZE);
                    for (int i = 0; i < kernelBuffer.capacity(); i++) {
                        assertEquals(kernelBuffer.get(i), i);
                    }
                }), args, mem_list, args_mem_loc, null, eventOut)
            );

            long e = eventOut.get(0);
            assertNotNull(e);

            CountDownLatch  latch = new CountDownLatch(1);
            CLEventCallback eventCallback;
            checkCLError(
                clSetEventCallback(e, CL_COMPLETE, eventCallback = CLEventCallback.create(
                    (event, event_command_exec_status, user_data) -> latch.countDown()
                ), NULL)
            );

            try {
                latch.await();
                kernel.free();
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }

            checkCLError(clReleaseEvent(e));
            eventCallback.free();
            checkCLError(clReleaseCommandQueue(queue));
            checkCLError(clReleaseContext(context));
        });
    }

    public void testMemObjectDestructor() {
        contextTest((platform, ctxProps, device) -> {
            IntBuffer errcode_ret = BufferUtils.createIntBuffer(1);

            long context = clCreateContext(ctxProps, device, CONTEXT_CALLBACK, NULL, errcode_ret);
            checkCLError(errcode_ret);

            long buffer = clCreateBuffer(context, CL_MEM_READ_ONLY, 128, errcode_ret);
            checkCLError(errcode_ret);
            assertNotNull(buffer);

            CountDownLatch eventLatch = new CountDownLatch(1);

            CLMemObjectDestructorCallback memDestructorCallback;
            checkCLError(
                clSetMemObjectDestructorCallback(buffer, memDestructorCallback = CLMemObjectDestructorCallback.create(
                    (memobj, user_data) -> eventLatch.countDown()
                ), NULL)
            );
            assertEquals(getMemObjectInfoInt(buffer, CL_MEM_REFERENCE_COUNT), 1);

            checkCLError(clRetainMemObject(buffer));
            assertEquals(getMemObjectInfoInt(buffer, CL_MEM_REFERENCE_COUNT), 2);

            checkCLError(clReleaseMemObject(buffer));
            assertEquals(getMemObjectInfoInt(buffer, CL_MEM_REFERENCE_COUNT), 1);
            assertEquals(eventLatch.getCount(), 1L);

            checkCLError(clReleaseMemObject(buffer));

            try {
                if (!eventLatch.await(100, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("MemObjectDestructor callback failed.");
                }
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            } finally {
                memDestructorCallback.free();
            }

            checkCLError(clReleaseContext(context));
        });
    }

    public void testEventCallback() {
        contextTest((platform, ctxProps, device) -> {
            IntBuffer errcode_ret = BufferUtils.createIntBuffer(1);

            long context = clCreateContext(ctxProps, device, CONTEXT_CALLBACK, NULL, errcode_ret);
            checkCLError(errcode_ret);
            assertNotNull(context);

            long e = clCreateUserEvent(context, errcode_ret);
            checkCLError(errcode_ret);
            assertNotNull(e);

            CountDownLatch eventLatch = new CountDownLatch(1);

            CLEventCallback eventCallback;
            checkCLError(
                clSetEventCallback(e, CL_COMPLETE, eventCallback = CLEventCallback.create((event, event_command_exec_status, user_data) -> {
                    assertEquals(event, e);
                    assertEquals(event_command_exec_status, CL_COMPLETE);

                    eventLatch.countDown();
                }), NULL)
            );

            checkCLError(clSetUserEventStatus(e, CL_COMPLETE));

            try {
                if (!eventLatch.await(100, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Event callback failed.");
                }
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }

            checkCLError(clReleaseEvent(e));
            eventCallback.free();
            checkCLError(clReleaseContext(context));
        });
    }

    public void testSubBuffer() {
        contextTest((platform, ctxProps, device) -> {
            IntBuffer errcode_ret = BufferUtils.createIntBuffer(1);

            long context = clCreateContext(ctxProps, device, CONTEXT_CALLBACK, NULL, errcode_ret);
            checkCLError(errcode_ret);
            assertNotNull(context);

            long buffer = clCreateBuffer(context, CL_MEM_READ_ONLY, 128, errcode_ret);
            checkCLError(errcode_ret);
            assertNotNull(buffer);

            long subbuffer;
            try (CLBufferRegion bufferRegion = CLBufferRegion.malloc()) {
                bufferRegion.origin(0);
                bufferRegion.size(64);

                subbuffer = nclCreateSubBuffer(buffer, CL_MEM_READ_ONLY, CL_BUFFER_CREATE_TYPE_REGION, bufferRegion.address(), memAddress(errcode_ret));
                checkCLError(errcode_ret);
            }
            assertNotNull(subbuffer);

            checkCLError(clReleaseMemObject(buffer));
            checkCLError(clReleaseMemObject(subbuffer));
            checkCLError(clReleaseContext(context));
        });
    }

}