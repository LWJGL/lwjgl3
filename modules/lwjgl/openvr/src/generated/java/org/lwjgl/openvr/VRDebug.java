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
import static org.lwjgl.system.MemoryUtil.*;

public class VRDebug {

    protected VRDebug() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRDebug_EmitVrProfilerEvent ] ---

    /** {@code EVRDebugError VRDebug_EmitVrProfilerEvent(char * pchMessage)} */
    public static int nVRDebug_EmitVrProfilerEvent(long pchMessage) {
        long __functionAddress = OpenVR.VRDebug.EmitVrProfilerEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchMessage, __functionAddress);
    }

    /** {@code EVRDebugError VRDebug_EmitVrProfilerEvent(char * pchMessage)} */
    @NativeType("EVRDebugError")
    public static int VRDebug_EmitVrProfilerEvent(@NativeType("char *") ByteBuffer pchMessage) {
        if (CHECKS) {
            checkNT1(pchMessage);
        }
        return nVRDebug_EmitVrProfilerEvent(memAddress(pchMessage));
    }

    // --- [ VRDebug_BeginVrProfilerEvent ] ---

    /** {@code EVRDebugError VRDebug_BeginVrProfilerEvent(VrProfilerEventHandle_t * pHandleOut)} */
    public static int nVRDebug_BeginVrProfilerEvent(long pHandleOut) {
        long __functionAddress = OpenVR.VRDebug.BeginVrProfilerEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pHandleOut, __functionAddress);
    }

    /** {@code EVRDebugError VRDebug_BeginVrProfilerEvent(VrProfilerEventHandle_t * pHandleOut)} */
    @NativeType("EVRDebugError")
    public static int VRDebug_BeginVrProfilerEvent(@NativeType("VrProfilerEventHandle_t *") LongBuffer pHandleOut) {
        if (CHECKS) {
            check(pHandleOut, 1);
        }
        return nVRDebug_BeginVrProfilerEvent(memAddress(pHandleOut));
    }

    // --- [ VRDebug_FinishVrProfilerEvent ] ---

    /** {@code EVRDebugError VRDebug_FinishVrProfilerEvent(VrProfilerEventHandle_t hHandle, char * pchMessage)} */
    public static int nVRDebug_FinishVrProfilerEvent(long hHandle, long pchMessage) {
        long __functionAddress = OpenVR.VRDebug.FinishVrProfilerEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(hHandle, pchMessage, __functionAddress);
    }

    /** {@code EVRDebugError VRDebug_FinishVrProfilerEvent(VrProfilerEventHandle_t hHandle, char * pchMessage)} */
    @NativeType("EVRDebugError")
    public static int VRDebug_FinishVrProfilerEvent(@NativeType("VrProfilerEventHandle_t") long hHandle, @NativeType("char *") ByteBuffer pchMessage) {
        if (CHECKS) {
            checkNT1(pchMessage);
        }
        return nVRDebug_FinishVrProfilerEvent(hHandle, memAddress(pchMessage));
    }

    // --- [ VRDebug_DriverDebugRequest ] ---

    /** {@code uint32_t VRDebug_DriverDebugRequest(TrackedDeviceIndex_t unDeviceIndex, char * pchRequest, char * pchResponseBuffer, uint32_t unResponseBufferSize)} */
    public static int nVRDebug_DriverDebugRequest(int unDeviceIndex, long pchRequest, long pchResponseBuffer, int unResponseBufferSize) {
        long __functionAddress = OpenVR.VRDebug.DriverDebugRequest;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unDeviceIndex, pchRequest, pchResponseBuffer, unResponseBufferSize, __functionAddress);
    }

    /** {@code uint32_t VRDebug_DriverDebugRequest(TrackedDeviceIndex_t unDeviceIndex, char * pchRequest, char * pchResponseBuffer, uint32_t unResponseBufferSize)} */
    @NativeType("uint32_t")
    public static int VRDebug_DriverDebugRequest(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("char *") ByteBuffer pchRequest, @NativeType("char *") ByteBuffer pchResponseBuffer) {
        if (CHECKS) {
            checkNT1(pchRequest);
        }
        return nVRDebug_DriverDebugRequest(unDeviceIndex, memAddress(pchRequest), memAddress(pchResponseBuffer), pchResponseBuffer.remaining());
    }

}