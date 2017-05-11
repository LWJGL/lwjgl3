/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.opencl;

import org.lwjgl.*;
import org.lwjgl.opencl.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.concurrent.*;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CL11.*;
import static org.lwjgl.opencl.InfoUtil.*;
import static org.lwjgl.opencl.KHRICD.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

public final class CLDemo {

    private CLDemo() {
    }

    public static void main(String[] args) {
        try (MemoryStack stack = stackPush()) {
            demo(stack);
        }
    }

    private static void demo(MemoryStack stack) {
        IntBuffer pi = stack.mallocInt(1);
        checkCLError(clGetPlatformIDs(null, pi));
        if (pi.get(0) == 0) {
            throw new RuntimeException("No OpenCL platforms found.");
        }

        PointerBuffer platforms = stack.mallocPointer(pi.get(0));
        checkCLError(clGetPlatformIDs(platforms, (IntBuffer)null));

        PointerBuffer ctxProps = stack.mallocPointer(3);
        ctxProps
            .put(0, CL_CONTEXT_PLATFORM)
            .put(2, 0);

        IntBuffer errcode_ret = stack.callocInt(1);
        for (int p = 0; p < platforms.capacity(); p++) {
            long platform = platforms.get(p);
            ctxProps.put(1, platform);

            System.out.println("\n-------------------------");
            System.out.printf("NEW PLATFORM: [0x%X]\n", platform);

            CLCapabilities platformCaps = CL.createPlatformCapabilities(platform);

            printPlatformInfo(platform, "CL_PLATFORM_PROFILE", CL_PLATFORM_PROFILE);
            printPlatformInfo(platform, "CL_PLATFORM_VERSION", CL_PLATFORM_VERSION);
            printPlatformInfo(platform, "CL_PLATFORM_NAME", CL_PLATFORM_NAME);
            printPlatformInfo(platform, "CL_PLATFORM_VENDOR", CL_PLATFORM_VENDOR);
            printPlatformInfo(platform, "CL_PLATFORM_EXTENSIONS", CL_PLATFORM_EXTENSIONS);
            if (platformCaps.cl_khr_icd) {
                printPlatformInfo(platform, "CL_PLATFORM_ICD_SUFFIX_KHR", CL_PLATFORM_ICD_SUFFIX_KHR);
            }
            System.out.println("");

            checkCLError(clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL, null, pi));

            PointerBuffer devices = stack.mallocPointer(pi.get(0));
            checkCLError(clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL, devices, (IntBuffer)null));

            for (int d = 0; d < devices.capacity(); d++) {
                long device = devices.get(d);

                CLCapabilities caps = CL.createDeviceCapabilities(device, platformCaps);

                System.out.printf("\n\t** NEW DEVICE: [0x%X]\n", device);

                System.out.println("\tCL_DEVICE_TYPE = " + getDeviceInfoLong(device, CL_DEVICE_TYPE));
                System.out.println("\tCL_DEVICE_VENDOR_ID = " + getDeviceInfoInt(device, CL_DEVICE_VENDOR_ID));
                System.out.println("\tCL_DEVICE_MAX_COMPUTE_UNITS = " + getDeviceInfoInt(device, CL_DEVICE_MAX_COMPUTE_UNITS));
                System.out
                    .println("\tCL_DEVICE_MAX_WORK_ITEM_DIMENSIONS = " + getDeviceInfoInt(device, CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS));
                System.out.println("\tCL_DEVICE_MAX_WORK_GROUP_SIZE = " + getDeviceInfoPointer(device, CL_DEVICE_MAX_WORK_GROUP_SIZE));
                System.out.println("\tCL_DEVICE_MAX_CLOCK_FREQUENCY = " + getDeviceInfoInt(device, CL_DEVICE_MAX_CLOCK_FREQUENCY));
                System.out.println("\tCL_DEVICE_ADDRESS_BITS = " + getDeviceInfoInt(device, CL_DEVICE_ADDRESS_BITS));
                System.out.println("\tCL_DEVICE_AVAILABLE = " + (getDeviceInfoInt(device, CL_DEVICE_AVAILABLE) != 0));
                System.out.println("\tCL_DEVICE_COMPILER_AVAILABLE = " + (getDeviceInfoInt(device, CL_DEVICE_COMPILER_AVAILABLE) != 0));

                printDeviceInfo(device, "CL_DEVICE_NAME", CL_DEVICE_NAME);
                printDeviceInfo(device, "CL_DEVICE_VENDOR", CL_DEVICE_VENDOR);
                printDeviceInfo(device, "CL_DRIVER_VERSION", CL_DRIVER_VERSION);
                printDeviceInfo(device, "CL_DEVICE_PROFILE", CL_DEVICE_PROFILE);
                printDeviceInfo(device, "CL_DEVICE_VERSION", CL_DEVICE_VERSION);
                printDeviceInfo(device, "CL_DEVICE_EXTENSIONS", CL_DEVICE_EXTENSIONS);
                if (caps.OpenCL11) {
                    printDeviceInfo(device, "CL_DEVICE_OPENCL_C_VERSION", CL_DEVICE_OPENCL_C_VERSION);
                }

                CLContextCallback contextCB;
                long context = clCreateContext(ctxProps, device, contextCB = CLContextCallback.create((errinfo, private_info, cb, user_data) -> {
                    System.err.println("[LWJGL] cl_context_callback");
                    System.err.println("\tInfo: " + memUTF8(errinfo));
                }), NULL, errcode_ret);
                checkCLError(errcode_ret);

                long buffer = clCreateBuffer(context, CL_MEM_READ_ONLY, 128, errcode_ret);
                checkCLError(errcode_ret);

                CLMemObjectDestructorCallback bufferCB1 = null;
                CLMemObjectDestructorCallback bufferCB2 = null;

                long subbuffer = NULL;

                CLMemObjectDestructorCallback subbufferCB = null;

                int errcode;

                CountDownLatch destructorLatch;

                if (caps.OpenCL11) {
                    destructorLatch = new CountDownLatch(3);

                    errcode = clSetMemObjectDestructorCallback(buffer, bufferCB1 = CLMemObjectDestructorCallback.create((memobj, user_data) -> {
                        System.out.println("\t\tBuffer destructed (1): " + memobj);
                        destructorLatch.countDown();
                    }), NULL);
                    checkCLError(errcode);

                    errcode = clSetMemObjectDestructorCallback(buffer, bufferCB2 = CLMemObjectDestructorCallback.create((memobj, user_data) -> {
                        System.out.println("\t\tBuffer destructed (2): " + memobj);
                        destructorLatch.countDown();
                    }), NULL);
                    checkCLError(errcode);

                    try (CLBufferRegion buffer_region = CLBufferRegion.malloc()) {
                        buffer_region.origin(0);
                        buffer_region.size(64);

                        subbuffer = nclCreateSubBuffer(buffer,
                            CL_MEM_READ_ONLY,
                            CL_BUFFER_CREATE_TYPE_REGION,
                            buffer_region.address(),
                            memAddress(errcode_ret));
                        checkCLError(errcode_ret);
                    }

                    errcode = clSetMemObjectDestructorCallback(subbuffer, subbufferCB = CLMemObjectDestructorCallback.create((memobj, user_data) -> {
                        System.out.println("\t\tSub Buffer destructed: " + memobj);
                        destructorLatch.countDown();
                    }), NULL);
                    checkCLError(errcode);
                } else {
                    destructorLatch = null;
                }

                long exec_caps = getDeviceInfoLong(device, CL_DEVICE_EXECUTION_CAPABILITIES);
                if ((exec_caps & CL_EXEC_NATIVE_KERNEL) == CL_EXEC_NATIVE_KERNEL) {
                    System.out.println("\t\t-TRYING TO EXEC NATIVE KERNEL-");
                    long queue = clCreateCommandQueue(context, device, NULL, errcode_ret);

                    PointerBuffer ev = BufferUtils.createPointerBuffer(1);

                    ByteBuffer kernelArgs = BufferUtils.createByteBuffer(4);
                    kernelArgs.putInt(0, 1337);

                    CLNativeKernel kernel;
                    errcode = clEnqueueNativeKernel(queue, kernel = CLNativeKernel.create(
                        args -> System.out.println("\t\tKERNEL EXEC argument: " + memByteBuffer(args, 4).getInt(0) + ", should be 1337")
                    ), kernelArgs, null, null, null, ev);
                    checkCLError(errcode);

                    long e = ev.get(0);

                    CountDownLatch latch = new CountDownLatch(1);

                    CLEventCallback eventCB;
                    errcode = clSetEventCallback(e, CL_COMPLETE, eventCB = CLEventCallback.create((event, event_command_exec_status, user_data) -> {
                        System.out.println("\t\tEvent callback status: " + getEventStatusName(event_command_exec_status));
                        latch.countDown();
                    }), NULL);
                    checkCLError(errcode);

                    try {
                        boolean expired = !latch.await(500, TimeUnit.MILLISECONDS);
                        if (expired) {
                            System.out.println("\t\tKERNEL EXEC FAILED!");
                        }
                    } catch (InterruptedException exc) {
                        exc.printStackTrace();
                    }
                    eventCB.free();

                    errcode = clReleaseEvent(e);
                    checkCLError(errcode);
                    kernel.free();

                    kernelArgs = BufferUtils.createByteBuffer(POINTER_SIZE * 2);

                    kernel = CLNativeKernel.create(args -> {
                    });

                    long time   = System.nanoTime();
                    int  REPEAT = 1000;
                    for (int i = 0; i < REPEAT; i++) {
                        clEnqueueNativeKernel(queue, kernel, kernelArgs, null, null, null, null);
                    }
                    clFinish(queue);
                    time = System.nanoTime() - time;

                    System.out.printf("\n\t\tEMPTY NATIVE KERNEL AVG EXEC TIME: %.4fus\n", (double)time / (REPEAT * 1000));

                    errcode = clReleaseCommandQueue(queue);
                    checkCLError(errcode);
                    kernel.free();
                }

                System.out.println();

                if (subbuffer != NULL) {
                    errcode = clReleaseMemObject(subbuffer);
                    checkCLError(errcode);
                }

                errcode = clReleaseMemObject(buffer);
                checkCLError(errcode);

                if (destructorLatch != null) {
                    // mem object destructor callbacks are called asynchronously on Nvidia

                    try {
                        destructorLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    subbufferCB.free();

                    bufferCB2.free();
                    bufferCB1.free();
                }

                errcode = clReleaseContext(context);
                checkCLError(errcode);

                contextCB.free();
            }
        }
    }

    public static void get(FunctionProviderLocal provider, long platform, String name) {
        System.out.println(name + ": " + provider.getFunctionAddress(platform, name));
    }

    private static void printPlatformInfo(long platform, String param_name, int param) {
        System.out.println("\t" + param_name + " = " + getPlatformInfoStringUTF8(platform, param));
    }

    private static void printDeviceInfo(long device, String param_name, int param) {
        System.out.println("\t" + param_name + " = " + getDeviceInfoStringUTF8(device, param));
    }

    private static String getEventStatusName(int status) {
        switch (status) {
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