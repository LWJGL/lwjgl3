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

    /** Unsafe version of: {@link #VRIOBuffer_Open Open} */
    public static int nVRIOBuffer_Open(long pchPath, int mode, int unElementSize, int unElements, long pulBuffer) {
        long __functionAddress = OpenVR.VRIOBuffer.Open;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchPath, mode, unElementSize, unElements, pulBuffer, __functionAddress);
    }

    /**
     * Opens an existing or creates a new {@code IOBuffer} of {@code unSize} bytes.
     *
     * @param mode one of:<br><table><tr><td>{@link VR#EIOBufferMode_IOBufferMode_Read}</td><td>{@link VR#EIOBufferMode_IOBufferMode_Write}</td></tr><tr><td>{@link VR#EIOBufferMode_IOBufferMode_Create}</td></tr></table>
     */
    @NativeType("EIOBufferError")
    public static int VRIOBuffer_Open(@NativeType("char const *") ByteBuffer pchPath, @NativeType("EIOBufferMode") int mode, @NativeType("uint32_t") int unElementSize, @NativeType("uint32_t") int unElements, @NativeType("IOBufferHandle_t *") LongBuffer pulBuffer) {
        if (CHECKS) {
            checkNT1(pchPath);
            check(pulBuffer, 1);
        }
        return nVRIOBuffer_Open(memAddress(pchPath), mode, unElementSize, unElements, memAddress(pulBuffer));
    }

    /**
     * Opens an existing or creates a new {@code IOBuffer} of {@code unSize} bytes.
     *
     * @param mode one of:<br><table><tr><td>{@link VR#EIOBufferMode_IOBufferMode_Read}</td><td>{@link VR#EIOBufferMode_IOBufferMode_Write}</td></tr><tr><td>{@link VR#EIOBufferMode_IOBufferMode_Create}</td></tr></table>
     */
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

    /** Closes a previously opened or created buffer. */
    @NativeType("EIOBufferError")
    public static int VRIOBuffer_Close(@NativeType("IOBufferHandle_t") long ulBuffer) {
        long __functionAddress = OpenVR.VRIOBuffer.Close;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulBuffer, __functionAddress);
    }

    // --- [ VRIOBuffer_Read ] ---

    /** Unsafe version of: {@link #VRIOBuffer_Read Read} */
    public static int nVRIOBuffer_Read(long ulBuffer, long pDst, int unBytes, long punRead) {
        long __functionAddress = OpenVR.VRIOBuffer.Read;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulBuffer, pDst, unBytes, punRead, __functionAddress);
    }

    /** Reads up to {@code unBytes} from buffer into {@code *pDst}, returning number of bytes read in {@code *punRead} */
    @NativeType("EIOBufferError")
    public static int VRIOBuffer_Read(@NativeType("IOBufferHandle_t") long ulBuffer, @NativeType("void *") ByteBuffer pDst, @NativeType("uint32_t *") IntBuffer punRead) {
        if (CHECKS) {
            check(punRead, 1);
        }
        return nVRIOBuffer_Read(ulBuffer, memAddress(pDst), pDst.remaining(), memAddress(punRead));
    }

    // --- [ VRIOBuffer_Write ] ---

    /** Unsafe version of: {@link #VRIOBuffer_Write Write} */
    public static int nVRIOBuffer_Write(long ulBuffer, long pSrc, int unBytes) {
        long __functionAddress = OpenVR.VRIOBuffer.Write;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulBuffer, pSrc, unBytes, __functionAddress);
    }

    /** Writes {@code unBytes} of data from {@code *pSrc} into a buffer. */
    @NativeType("EIOBufferError")
    public static int VRIOBuffer_Write(@NativeType("IOBufferHandle_t") long ulBuffer, @NativeType("void *") ByteBuffer pSrc) {
        return nVRIOBuffer_Write(ulBuffer, memAddress(pSrc), pSrc.remaining());
    }

    // --- [ VRIOBuffer_PropertyContainer ] ---

    /** Retrieves the property container of a buffer. */
    @NativeType("PropertyContainerHandle_t")
    public static long VRIOBuffer_PropertyContainer(@NativeType("IOBufferHandle_t") long ulBuffer) {
        long __functionAddress = OpenVR.VRIOBuffer.PropertyContainer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJ(ulBuffer, __functionAddress);
    }

    // --- [ VRIOBuffer_HasReaders ] ---

    /** Inexpensively checks for readers to allow writers to fast-fail potentially expensive copies and writes. */
    @NativeType("bool")
    public static boolean VRIOBuffer_HasReaders(@NativeType("IOBufferHandle_t") long ulBuffer) {
        long __functionAddress = OpenVR.VRIOBuffer.HasReaders;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(ulBuffer, __functionAddress);
    }

}