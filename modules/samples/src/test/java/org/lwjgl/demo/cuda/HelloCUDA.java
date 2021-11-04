/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.cuda;

import org.lwjgl.*;
import org.lwjgl.cuda.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.cuda.CU.*;
import static org.lwjgl.cuda.NVRTC.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Simple CUDA demo. */
public final class HelloCUDA {

    private HelloCUDA() {}

    private static final int ARRAY_SIZE = 100;

    private static final String KERNEL_CU =
        "#define N " + ARRAY_SIZE + "\n" +
        "\n" +
        "extern \"C\" __global__ void matSum(int *a, int *b, int *c)\n" +
        "{\n" +
        "    int tid = blockIdx.x;\n" +
        "    if (tid < N)\n" +
        "        c[tid] = a[tid] + b[tid];\n" +
        "}\n";

    private static final String KERNEL_NAME = "matSum";

    private static long ctx;

    public static void main(String[] args) {
        ByteBuffer PTX;
        try (MemoryStack stack = stackPush()) {
            IntBuffer major = stack.mallocInt(1);
            IntBuffer minor = stack.mallocInt(1);

            checkNVRTC(nvrtcVersion(major, minor));

            System.out.println("Compiling kernel with NVRTC v" + major.get(0) + "." + minor.get(0));

            PointerBuffer pp = stack.mallocPointer(1);

            checkNVRTC(nvrtcCreateProgram(pp, KERNEL_CU, "matSum.cu", null, null));
            long program = pp.get(0);

            int compilationStatus = nvrtcCompileProgram(program, null);
            {
                checkNVRTC(nvrtcGetProgramLogSize(program, pp));
                if (1L < pp.get(0)) {
                    ByteBuffer log = stack.malloc((int)pp.get(0) - 1);

                    checkNVRTC(nvrtcGetProgramLog(program, log));
                    System.err.println("Compilation log:");
                    System.err.println("----------------");
                    System.err.println(memASCII(log));
                }
            }
            checkNVRTC(compilationStatus);

            checkNVRTC(nvrtcGetPTXSize(program, pp));
            PTX = memAlloc((int)pp.get(0));
            checkNVRTC(nvrtcGetPTX(program, PTX));

            System.out.println("\nCompiled PTX:");
            System.out.println("-------------");
            System.out.println(memASCII(PTX));
        }

        IntBuffer hostA = memAllocInt(ARRAY_SIZE);
        IntBuffer hostB = memAllocInt(ARRAY_SIZE);
        IntBuffer hostC = memAllocInt(ARRAY_SIZE);

        // initialize host arrays
        for (int i = 0; i < ARRAY_SIZE; ++i) {
            hostA.put(i, ARRAY_SIZE - i);
            hostB.put(i, i * i);
        }

        long
            deviceA,
            deviceB,
            deviceC;

        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);
            IntBuffer     pi = stack.mallocInt(1);

            // initialize
            if (CUDA.isPerThreadDefaultStreamSupported()) {
                Configuration.CUDA_API_PER_THREAD_DEFAULT_STREAM.set(true);
            }

            System.out.format("- Initializing...\n");
            check(cuInit(0));

            check(cuDeviceGetCount(pi));
            if (pi.get(0) == 0) {
                throw new IllegalStateException("Error: no devices supporting CUDA");
            }

            // get first CUDA device
            check(cuDeviceGet(pi, 0));
            int device = pi.get(0);

            // get device name
            ByteBuffer pb = stack.malloc(100);
            check(cuDeviceGetName(pb, device));
            System.out.format("> Using device 0: %s\n", memASCII(memAddress(pb)));

            // get compute capabilities and the device name
            IntBuffer minor = stack.mallocInt(1);
            check(cuDeviceComputeCapability(pi, minor, device));
            System.out.format("> GPU Device has SM %d.%d compute capability\n", pi.get(0), minor.get(0));

            // get memory size
            check(cuDeviceTotalMem(pp, device));
            System.out.format("  Total amount of global memory:   %d bytes\n", pp.get(0));
            System.out.format("  64-bit Memory Address:           %s\n", (pp.get(0) > 4 * 1024 * 1024 * 1024L) ? "YES" : "NO");

            // create context
            check(cuCtxCreate(pp, 0, device));
            ctx = pp.get(0);

            // load kernel
            check(cuModuleLoadData(pp, PTX));
            long module = pp.get(0);

            check(cuModuleGetFunction(pp, module, KERNEL_NAME));
            long function = pp.get(0);

            // allocate memory
            check(cuMemAlloc(pp, Integer.BYTES * ARRAY_SIZE));
            deviceA = pp.get(0);

            check(cuMemAlloc(pp, Integer.BYTES * ARRAY_SIZE));
            deviceB = pp.get(0);

            check(cuMemAlloc(pp, Integer.BYTES * ARRAY_SIZE));
            deviceC = pp.get(0);

            // copy arrays to device
            check(cuMemcpyHtoD(deviceA, hostA));
            check(cuMemcpyHtoD(deviceB, hostB));

            // run
            System.out.format("# Running the kernel...\n");
            // grid for kernel: <<<N, 1>>>
            check(cuLaunchKernel(
                function, ARRAY_SIZE, 1, 1,  // Nx1x1 blocks
                1, 1, 1,            // 1x1x1 threads
                0, 0,
                // method 1: unpacked (simple, no alignment requirements)
                stack.pointers(
                    memAddress(stack.longs(deviceA)),
                    memAddress(stack.longs(deviceB)),
                    memAddress(stack.longs(deviceC))
                ),
                null/*,
                // method 2: packed (user is responsible for correct argument alignment)
                stack.pointers(
                    CU_LAUNCH_PARAM_BUFFER_POINTER, memAddress(stack.longs(
                        deviceA,
                        deviceB,
                        deviceC
                    )),
                    CU_LAUNCH_PARAM_BUFFER_SIZE, memAddress(stack.pointers(3 * Long.BYTES)),
                    CU_LAUNCH_PARAM_END
                )*/));
        }

        System.out.format("# Kernel complete.\n");

        // copy results to host and report
        check(cuMemcpyDtoH(hostC, deviceC));
        for (int i = 0; i < ARRAY_SIZE; ++i) {
            if (hostC.get(i) != hostA.get(i) + hostB.get(i)) {
                System.out.format("* Error at array position %d: Expected %d, Got %d\n", i, hostA.get(i) + hostB.get(i), hostC.get(i));
            }
        }
        System.out.format("*** All checks complete.\n");

        // finish
        System.out.format("- Finalizing...\n");
        check(cuMemFree(deviceA));
        check(cuMemFree(deviceB));
        check(cuMemFree(deviceC));
        check(cuCtxDetach(ctx));
    }

    private static void checkNVRTC(int err) {
        if (err != NVRTC_SUCCESS) {
            throw new IllegalStateException(nvrtcGetErrorString(err));
        }
    }

    private static void check(int err) {
        if (err != CUDA_SUCCESS) {
            if (ctx != NULL) {
                cuCtxDetach(ctx);
                ctx = NULL;
            }
            throw new IllegalStateException(Integer.toString(err));
        }
    }

}
