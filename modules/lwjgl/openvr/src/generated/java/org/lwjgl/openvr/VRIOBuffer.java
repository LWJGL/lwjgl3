/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRIOBuffer {

    protected VRIOBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRIOBuffer_Open ] ---

    /** {@code EIOBufferError VRIOBuffer_Open(char const * pchPath, EIOBufferMode mode, uint32_t unElementSize, uint32_t unElements, IOBufferHandle_t * pulBuffer)} */
    public static int nVRIOBuffer_Open(long pchPath, int mode, int unElementSize, int unElements, long pulBuffer) {
        long __functionAddress = OpenVR.VRIOBuffer.Open;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchPath, mode, unElementSize, unElements, pulBuffer, __functionAddress);
    }

    /** {@code EIOBufferError VRIOBuffer_Open(char const * pchPath, EIOBufferMode mode, uint32_t unElementSize, uint32_t unElements, IOBufferHandle_t * pulBuffer)} */
    @NativeType("EIOBufferError")
    public static int VRIOBuffer_Open(@NativeType("char const *") ByteBuffer pchPath, @NativeType("EIOBufferMode") int mode, @NativeType("uint32_t") int unElementSize, @NativeType("uint32_t") int unElements, @NativeType("IOBufferHandle_t *") LongBuffer pulBuffer) {
        if (CHECKS) {
            checkNT1(pchPath);
            check(pulBuffer, 1);
        }
        return nVRIOBuffer_Open(memAddress(pchPath), mode, unElementSize, unElements, memAddress(pulBuffer));
    }

    /** {@code EIOBufferError VRIOBuffer_Open(char const * pchPath, EIOBufferMode mode, uint32_t unElementSize, uint32_t unElements, IOBufferHandle_t * pulBuffer)} */
    @NativeType("EIOBufferError")
    public static int VRIOBuffer_Open(@NativeType("char const *") CharSequence pchPath, @NativeType("EIOBufferMode") int mode, @NativeType("uint32_t") int unElementSize, @NativeType("uint32_t") int unElements, @NativeType("IOBufferHandle_t *") LongBuffer pulBuffer) {
        if (CHECKS) {
            check(pulBuffer, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchPath, true);
            long pchPathEncoded = stack.getPointerAddress();
            return nVRIOBuffer_Open(pchPathEncoded, mode, unElementSize, unElements, memAddress(pulBuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRIOBuffer_Close ] ---

    /** {@code EIOBufferError VRIOBuffer_Close(IOBufferHandle_t ulBuffer)} */
    @NativeType("EIOBufferError")
    public static int VRIOBuffer_Close(@NativeType("IOBufferHandle_t") long ulBuffer) {
        long __functionAddress = OpenVR.VRIOBuffer.Close;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulBuffer, __functionAddress);
    }

    // --- [ VRIOBuffer_Read ] ---

    /** {@code EIOBufferError VRIOBuffer_Read(IOBufferHandle_t ulBuffer, void * pDst, uint32_t unBytes, uint32_t * punRead)} */
    public static int nVRIOBuffer_Read(long ulBuffer, long pDst, int unBytes, long punRead) {
        long __functionAddress = OpenVR.VRIOBuffer.Read;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulBuffer, pDst, unBytes, punRead, __functionAddress);
    }

    /** {@code EIOBufferError VRIOBuffer_Read(IOBufferHandle_t ulBuffer, void * pDst, uint32_t unBytes, uint32_t * punRead)} */
    @NativeType("EIOBufferError")
    public static int VRIOBuffer_Read(@NativeType("IOBufferHandle_t") long ulBuffer, @NativeType("void *") ByteBuffer pDst, @NativeType("uint32_t *") IntBuffer punRead) {
        if (CHECKS) {
            check(punRead, 1);
        }
        return nVRIOBuffer_Read(ulBuffer, memAddress(pDst), pDst.remaining(), memAddress(punRead));
    }

    // --- [ VRIOBuffer_Write ] ---

    /** {@code EIOBufferError VRIOBuffer_Write(IOBufferHandle_t ulBuffer, void * pSrc, uint32_t unBytes)} */
    public static int nVRIOBuffer_Write(long ulBuffer, long pSrc, int unBytes) {
        long __functionAddress = OpenVR.VRIOBuffer.Write;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulBuffer, pSrc, unBytes, __functionAddress);
    }

    /** {@code EIOBufferError VRIOBuffer_Write(IOBufferHandle_t ulBuffer, void * pSrc, uint32_t unBytes)} */
    @NativeType("EIOBufferError")
    public static int VRIOBuffer_Write(@NativeType("IOBufferHandle_t") long ulBuffer, @NativeType("void *") ByteBuffer pSrc) {
        return nVRIOBuffer_Write(ulBuffer, memAddress(pSrc), pSrc.remaining());
    }

    // --- [ VRIOBuffer_PropertyContainer ] ---

    /** {@code PropertyContainerHandle_t VRIOBuffer_PropertyContainer(IOBufferHandle_t ulBuffer)} */
    @NativeType("PropertyContainerHandle_t")
    public static long VRIOBuffer_PropertyContainer(@NativeType("IOBufferHandle_t") long ulBuffer) {
        long __functionAddress = OpenVR.VRIOBuffer.PropertyContainer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJ(ulBuffer, __functionAddress);
    }

    // --- [ VRIOBuffer_HasReaders ] ---

    /** {@code bool VRIOBuffer_HasReaders(IOBufferHandle_t ulBuffer)} */
    @NativeType("bool")
    public static boolean VRIOBuffer_HasReaders(@NativeType("IOBufferHandle_t") long ulBuffer) {
        long __functionAddress = OpenVR.VRIOBuffer.HasReaders;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(ulBuffer, __functionAddress);
    }

}