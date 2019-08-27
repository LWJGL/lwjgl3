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

    /** Unsafe version of: {@link #VRDebug_EmitVrProfilerEvent EmitVrProfilerEvent} */
    public static int nVRDebug_EmitVrProfilerEvent(long pchMessage) {
        long __functionAddress = OpenVR.VRDebug.EmitVrProfilerEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchMessage, __functionAddress);
    }

    /**
     * Creates a vr profiler discrete event (point).
     * 
     * <p>The event will be associated with the message provided in {@code pchMessage}, and the current time will be used as the event timestamp.</p>
     */
    @NativeType("EVRDebugError")
    public static int VRDebug_EmitVrProfilerEvent(@NativeType("char *") ByteBuffer pchMessage) {
        if (CHECKS) {
            checkNT1(pchMessage);
        }
        return nVRDebug_EmitVrProfilerEvent(memAddress(pchMessage));
    }

    // --- [ VRDebug_BeginVrProfilerEvent ] ---

    /** Unsafe version of: {@link #VRDebug_BeginVrProfilerEvent BeginVrProfilerEvent} */
    public static int nVRDebug_BeginVrProfilerEvent(long pHandleOut) {
        long __functionAddress = OpenVR.VRDebug.BeginVrProfilerEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pHandleOut, __functionAddress);
    }

    /**
     * Creates an vr profiler duration event (line).
     * 
     * <p>The current time will be used as the timestamp for the start of the line. On success, {@code pHandleOut} will contain a handle valid for terminating
     * this event.</p>
     */
    @NativeType("EVRDebugError")
    public static int VRDebug_BeginVrProfilerEvent(@NativeType("VrProfilerEventHandle_t *") LongBuffer pHandleOut) {
        if (CHECKS) {
            check(pHandleOut, 1);
        }
        return nVRDebug_BeginVrProfilerEvent(memAddress(pHandleOut));
    }

    // --- [ VRDebug_FinishVrProfilerEvent ] ---

    /** Unsafe version of: {@link #VRDebug_FinishVrProfilerEvent FinishVrProfilerEvent} */
    public static int nVRDebug_FinishVrProfilerEvent(long hHandle, long pchMessage) {
        long __functionAddress = OpenVR.VRDebug.FinishVrProfilerEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(hHandle, pchMessage, __functionAddress);
    }

    /**
     * Terminates a vr profiler event.
     * 
     * <p>The event associated with {@code hHandle} will be considered completed when this method is called. The current time will be used associated to the
     * termination time of the event, and {@code pchMessage} will be used as the event title.</p>
     */
    @NativeType("EVRDebugError")
    public static int VRDebug_FinishVrProfilerEvent(@NativeType("VrProfilerEventHandle_t") long hHandle, @NativeType("char *") ByteBuffer pchMessage) {
        if (CHECKS) {
            checkNT1(pchMessage);
        }
        return nVRDebug_FinishVrProfilerEvent(hHandle, memAddress(pchMessage));
    }

    // --- [ VRDebug_DriverDebugRequest ] ---

    /** Unsafe version of: {@link #VRDebug_DriverDebugRequest DriverDebugRequest} */
    public static int nVRDebug_DriverDebugRequest(int unDeviceIndex, long pchRequest, long pchResponseBuffer, int unResponseBufferSize) {
        long __functionAddress = OpenVR.VRDebug.DriverDebugRequest;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unDeviceIndex, pchRequest, pchResponseBuffer, unResponseBufferSize, __functionAddress);
    }

    /**
     * Sends a request to the driver for the specified device and returns the response.
     * 
     * <p>The maximum response size is 32k, but this method can be called with a smaller buffer. If the response exceeds the size of the buffer, it is truncated.
     * The size of the response including its terminating null is returned.</p>
     */
    @NativeType("uint32_t")
    public static int VRDebug_DriverDebugRequest(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("char *") ByteBuffer pchRequest, @NativeType("char *") ByteBuffer pchResponseBuffer) {
        if (CHECKS) {
            checkNT1(pchRequest);
        }
        return nVRDebug_DriverDebugRequest(unDeviceIndex, memAddress(pchRequest), memAddress(pchResponseBuffer), pchResponseBuffer.remaining());
    }

}