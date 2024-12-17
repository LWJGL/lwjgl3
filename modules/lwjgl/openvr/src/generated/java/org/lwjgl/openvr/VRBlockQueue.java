/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRBlockQueue {

    protected VRBlockQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRBlockQueue_Create ] ---

    /** {@code EBlockQueueError VRBlockQueue_Create(PropertyContainerHandle_t * pulQueueHandle, char * pchPath, uint32_t unBlockDataSize, uint32_t unBlockHeaderSize, uint32_t unBlockCount, uint32_t unFlags)} */
    public static int nVRBlockQueue_Create(long pulQueueHandle, long pchPath, int unBlockDataSize, int unBlockHeaderSize, int unBlockCount, int unFlags) {
        long __functionAddress = OpenVR.VRBlockQueue.Create;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pulQueueHandle, pchPath, unBlockDataSize, unBlockHeaderSize, unBlockCount, unFlags, __functionAddress);
    }

    /** {@code EBlockQueueError VRBlockQueue_Create(PropertyContainerHandle_t * pulQueueHandle, char * pchPath, uint32_t unBlockDataSize, uint32_t unBlockHeaderSize, uint32_t unBlockCount, uint32_t unFlags)} */
    @NativeType("EBlockQueueError")
    public static int VRBlockQueue_Create(@NativeType("PropertyContainerHandle_t *") LongBuffer pulQueueHandle, @NativeType("char *") @Nullable ByteBuffer pchPath, @NativeType("uint32_t") int unBlockDataSize, @NativeType("uint32_t") int unBlockHeaderSize, @NativeType("uint32_t") int unBlockCount, @NativeType("uint32_t") int unFlags) {
        if (CHECKS) {
            check(pulQueueHandle, 1);
            checkNT1Safe(pchPath);
        }
        return nVRBlockQueue_Create(memAddress(pulQueueHandle), memAddressSafe(pchPath), unBlockDataSize, unBlockHeaderSize, unBlockCount, unFlags);
    }

    // --- [ VRBlockQueue_Connect ] ---

    /** {@code EBlockQueueError VRBlockQueue_Connect(PropertyContainerHandle_t * pulQueueHandle, char * pchPath)} */
    public static int nVRBlockQueue_Connect(long pulQueueHandle, long pchPath) {
        long __functionAddress = OpenVR.VRBlockQueue.Connect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pulQueueHandle, pchPath, __functionAddress);
    }

    /** {@code EBlockQueueError VRBlockQueue_Connect(PropertyContainerHandle_t * pulQueueHandle, char * pchPath)} */
    @NativeType("EBlockQueueError")
    public static int VRBlockQueue_Connect(@NativeType("PropertyContainerHandle_t *") LongBuffer pulQueueHandle, @NativeType("char *") @Nullable ByteBuffer pchPath) {
        if (CHECKS) {
            check(pulQueueHandle, 1);
            checkNT1Safe(pchPath);
        }
        return nVRBlockQueue_Connect(memAddress(pulQueueHandle), memAddressSafe(pchPath));
    }

    // --- [ VRBlockQueue_Destroy ] ---

    /** {@code EBlockQueueError VRBlockQueue_Destroy(PropertyContainerHandle_t ulQueueHandle)} */
    @NativeType("EBlockQueueError")
    public static int VRBlockQueue_Destroy(@NativeType("PropertyContainerHandle_t") long ulQueueHandle) {
        long __functionAddress = OpenVR.VRBlockQueue.Destroy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulQueueHandle, __functionAddress);
    }

    // --- [ VRBlockQueue_AcquireWriteOnlyBlock ] ---

    /** {@code EBlockQueueError VRBlockQueue_AcquireWriteOnlyBlock(PropertyContainerHandle_t ulQueueHandle, PropertyContainerHandle_t * pulBlockHandle, void ** ppvBuffer)} */
    public static int nVRBlockQueue_AcquireWriteOnlyBlock(long ulQueueHandle, long pulBlockHandle, long ppvBuffer) {
        long __functionAddress = OpenVR.VRBlockQueue.AcquireWriteOnlyBlock;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulQueueHandle, pulBlockHandle, ppvBuffer, __functionAddress);
    }

    /** {@code EBlockQueueError VRBlockQueue_AcquireWriteOnlyBlock(PropertyContainerHandle_t ulQueueHandle, PropertyContainerHandle_t * pulBlockHandle, void ** ppvBuffer)} */
    @NativeType("EBlockQueueError")
    public static int VRBlockQueue_AcquireWriteOnlyBlock(@NativeType("PropertyContainerHandle_t") long ulQueueHandle, @NativeType("PropertyContainerHandle_t *") LongBuffer pulBlockHandle, @NativeType("void **") PointerBuffer ppvBuffer) {
        if (CHECKS) {
            check(pulBlockHandle, 1);
            check(ppvBuffer, 1);
        }
        return nVRBlockQueue_AcquireWriteOnlyBlock(ulQueueHandle, memAddress(pulBlockHandle), memAddress(ppvBuffer));
    }

    // --- [ VRBlockQueue_ReleaseWriteOnlyBlock ] ---

    /** {@code EBlockQueueError VRBlockQueue_ReleaseWriteOnlyBlock(PropertyContainerHandle_t ulQueueHandle, PropertyContainerHandle_t ulBlockHandle)} */
    @NativeType("EBlockQueueError")
    public static int VRBlockQueue_ReleaseWriteOnlyBlock(@NativeType("PropertyContainerHandle_t") long ulQueueHandle, @NativeType("PropertyContainerHandle_t") long ulBlockHandle) {
        long __functionAddress = OpenVR.VRBlockQueue.ReleaseWriteOnlyBlock;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJI(ulQueueHandle, ulBlockHandle, __functionAddress);
    }

    // --- [ VRBlockQueue_WaitAndAcquireReadOnlyBlock ] ---

    /** {@code EBlockQueueError VRBlockQueue_WaitAndAcquireReadOnlyBlock(PropertyContainerHandle_t ulQueueHandle, PropertyContainerHandle_t * pulBlockHandle, void ** ppvBuffer, EBlockQueueReadType eReadType, uint32_t unTimeoutMs)} */
    public static int nVRBlockQueue_WaitAndAcquireReadOnlyBlock(long ulQueueHandle, long pulBlockHandle, long ppvBuffer, int eReadType, int unTimeoutMs) {
        long __functionAddress = OpenVR.VRBlockQueue.WaitAndAcquireReadOnlyBlock;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulQueueHandle, pulBlockHandle, ppvBuffer, eReadType, unTimeoutMs, __functionAddress);
    }

    /** {@code EBlockQueueError VRBlockQueue_WaitAndAcquireReadOnlyBlock(PropertyContainerHandle_t ulQueueHandle, PropertyContainerHandle_t * pulBlockHandle, void ** ppvBuffer, EBlockQueueReadType eReadType, uint32_t unTimeoutMs)} */
    @NativeType("EBlockQueueError")
    public static int VRBlockQueue_WaitAndAcquireReadOnlyBlock(@NativeType("PropertyContainerHandle_t") long ulQueueHandle, @NativeType("PropertyContainerHandle_t *") LongBuffer pulBlockHandle, @NativeType("void **") PointerBuffer ppvBuffer, @NativeType("EBlockQueueReadType") int eReadType, @NativeType("uint32_t") int unTimeoutMs) {
        if (CHECKS) {
            check(pulBlockHandle, 1);
            check(ppvBuffer, 1);
        }
        return nVRBlockQueue_WaitAndAcquireReadOnlyBlock(ulQueueHandle, memAddress(pulBlockHandle), memAddress(ppvBuffer), eReadType, unTimeoutMs);
    }

    // --- [ VRBlockQueue_AcquireReadOnlyBlock ] ---

    /** {@code EBlockQueueError VRBlockQueue_AcquireReadOnlyBlock(PropertyContainerHandle_t ulQueueHandle, PropertyContainerHandle_t * pulBlockHandle, void ** ppvBuffer, EBlockQueueReadType eReadType)} */
    public static int nVRBlockQueue_AcquireReadOnlyBlock(long ulQueueHandle, long pulBlockHandle, long ppvBuffer, int eReadType) {
        long __functionAddress = OpenVR.VRBlockQueue.AcquireReadOnlyBlock;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulQueueHandle, pulBlockHandle, ppvBuffer, eReadType, __functionAddress);
    }

    /** {@code EBlockQueueError VRBlockQueue_AcquireReadOnlyBlock(PropertyContainerHandle_t ulQueueHandle, PropertyContainerHandle_t * pulBlockHandle, void ** ppvBuffer, EBlockQueueReadType eReadType)} */
    @NativeType("EBlockQueueError")
    public static int VRBlockQueue_AcquireReadOnlyBlock(@NativeType("PropertyContainerHandle_t") long ulQueueHandle, @NativeType("PropertyContainerHandle_t *") LongBuffer pulBlockHandle, @NativeType("void **") PointerBuffer ppvBuffer, @NativeType("EBlockQueueReadType") int eReadType) {
        if (CHECKS) {
            check(pulBlockHandle, 1);
            check(ppvBuffer, 1);
        }
        return nVRBlockQueue_AcquireReadOnlyBlock(ulQueueHandle, memAddress(pulBlockHandle), memAddress(ppvBuffer), eReadType);
    }

    // --- [ VRBlockQueue_ReleaseReadOnlyBlock ] ---

    /** {@code EBlockQueueError VRBlockQueue_ReleaseReadOnlyBlock(PropertyContainerHandle_t ulQueueHandle, PropertyContainerHandle_t ulBlockHandle)} */
    @NativeType("EBlockQueueError")
    public static int VRBlockQueue_ReleaseReadOnlyBlock(@NativeType("PropertyContainerHandle_t") long ulQueueHandle, @NativeType("PropertyContainerHandle_t") long ulBlockHandle) {
        long __functionAddress = OpenVR.VRBlockQueue.ReleaseReadOnlyBlock;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJI(ulQueueHandle, ulBlockHandle, __functionAddress);
    }

    // --- [ VRBlockQueue_QueueHasReader ] ---

    /** {@code EBlockQueueError VRBlockQueue_QueueHasReader(PropertyContainerHandle_t ulQueueHandle, bool * pbHasReaders)} */
    public static int nVRBlockQueue_QueueHasReader(long ulQueueHandle, long pbHasReaders) {
        long __functionAddress = OpenVR.VRBlockQueue.QueueHasReader;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulQueueHandle, pbHasReaders, __functionAddress);
    }

    /** {@code EBlockQueueError VRBlockQueue_QueueHasReader(PropertyContainerHandle_t ulQueueHandle, bool * pbHasReaders)} */
    @NativeType("EBlockQueueError")
    public static int VRBlockQueue_QueueHasReader(@NativeType("PropertyContainerHandle_t") long ulQueueHandle, @NativeType("bool *") ByteBuffer pbHasReaders) {
        if (CHECKS) {
            check(pbHasReaders, 1);
        }
        return nVRBlockQueue_QueueHasReader(ulQueueHandle, memAddress(pbHasReaders));
    }

}