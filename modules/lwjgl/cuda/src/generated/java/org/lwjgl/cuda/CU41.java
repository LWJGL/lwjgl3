/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU41 extends CU40 {

    public static final int CU_IPC_HANDLE_SIZE = 64;

    /**
     * CUDA Ipc Mem Flags. ({@code CUipcMem_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_IPC_MEM_LAZY_ENABLE_PEER_ACCESS IPC_MEM_LAZY_ENABLE_PEER_ACCESS} - Automatically enable peer access between remote devices as needed</li>
     * </ul>
     */
    public static final int CU_IPC_MEM_LAZY_ENABLE_PEER_ACCESS = 0x1;

    protected CU41() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DeviceGetByPCIBusId = apiGetFunctionAddress(CU.getLibrary(), "cuDeviceGetByPCIBusId"),
            DeviceGetPCIBusId   = apiGetFunctionAddress(CU.getLibrary(), "cuDeviceGetPCIBusId"),
            IpcGetEventHandle   = apiGetFunctionAddress(CU.getLibrary(), "cuIpcGetEventHandle"),
            IpcGetMemHandle     = apiGetFunctionAddress(CU.getLibrary(), "cuIpcGetMemHandle"),
            IpcCloseMemHandle   = apiGetFunctionAddress(CU.getLibrary(), "cuIpcCloseMemHandle");

    }

    // --- [ cuDeviceGetByPCIBusId ] ---

    public static int ncuDeviceGetByPCIBusId(long dev, long pciBusId) {
        long __functionAddress = Functions.DeviceGetByPCIBusId;
        return callPPI(dev, pciBusId, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceGetByPCIBusId(@NativeType("CUdevice *") IntBuffer dev, @NativeType("char const *") ByteBuffer pciBusId) {
        if (CHECKS) {
            check(dev, 1);
            checkNT1(pciBusId);
        }
        return ncuDeviceGetByPCIBusId(memAddress(dev), memAddress(pciBusId));
    }

    @NativeType("CUresult")
    public static int cuDeviceGetByPCIBusId(@NativeType("CUdevice *") IntBuffer dev, @NativeType("char const *") CharSequence pciBusId) {
        if (CHECKS) {
            check(dev, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pciBusId, true);
            long pciBusIdEncoded = stack.getPointerAddress();
            return ncuDeviceGetByPCIBusId(memAddress(dev), pciBusIdEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuDeviceGetPCIBusId ] ---

    public static int ncuDeviceGetPCIBusId(long pciBusId, int len, int dev) {
        long __functionAddress = Functions.DeviceGetPCIBusId;
        return callPI(pciBusId, len, dev, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceGetPCIBusId(@NativeType("char *") ByteBuffer pciBusId, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetPCIBusId(memAddress(pciBusId), pciBusId.remaining(), dev);
    }

    // --- [ cuIpcGetEventHandle ] ---

    public static int ncuIpcGetEventHandle(long pHandle, long event) {
        long __functionAddress = Functions.IpcGetEventHandle;
        if (CHECKS) {
            check(event);
        }
        return callPPI(pHandle, event, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuIpcGetEventHandle(@NativeType("CUipcEventHandle *") CUIPCEventHandle pHandle, @NativeType("CUevent") long event) {
        return ncuIpcGetEventHandle(pHandle.address(), event);
    }

    // --- [ cuIpcGetMemHandle ] ---

    public static int ncuIpcGetMemHandle(long pHandle, long dptr) {
        long __functionAddress = Functions.IpcGetMemHandle;
        if (CHECKS) {
            check(dptr);
        }
        return callPPI(pHandle, dptr, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuIpcGetMemHandle(@NativeType("CUipcMemHandle *") CUIPCMemHandle pHandle, @NativeType("CUdeviceptr") long dptr) {
        return ncuIpcGetMemHandle(pHandle.address(), dptr);
    }

    // --- [ cuIpcCloseMemHandle ] ---

    @NativeType("CUresult")
    public static int cuIpcCloseMemHandle(@NativeType("CUdeviceptr") long dptr) {
        long __functionAddress = Functions.IpcCloseMemHandle;
        if (CHECKS) {
            check(dptr);
        }
        return callPI(dptr, __functionAddress);
    }

}