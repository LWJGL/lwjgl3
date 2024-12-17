/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTConformanceAutomation {

    public static final int XR_EXT_conformance_automation_SPEC_VERSION = 3;

    public static final String XR_EXT_CONFORMANCE_AUTOMATION_EXTENSION_NAME = "XR_EXT_conformance_automation";

    protected EXTConformanceAutomation() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetInputDeviceActiveEXT ] ---

    /** {@code XrResult xrSetInputDeviceActiveEXT(XrSession session, XrPath interactionProfile, XrPath topLevelPath, XrBool32 isActive)} */
    @NativeType("XrResult")
    public static int xrSetInputDeviceActiveEXT(XrSession session, @NativeType("XrPath") long interactionProfile, @NativeType("XrPath") long topLevelPath, @NativeType("XrBool32") boolean isActive) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceActiveEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(session.address(), interactionProfile, topLevelPath, isActive ? 1 : 0, __functionAddress);
    }

    // --- [ xrSetInputDeviceStateBoolEXT ] ---

    /** {@code XrResult xrSetInputDeviceStateBoolEXT(XrSession session, XrPath topLevelPath, XrPath inputSourcePath, XrBool32 state)} */
    @NativeType("XrResult")
    public static int xrSetInputDeviceStateBoolEXT(XrSession session, @NativeType("XrPath") long topLevelPath, @NativeType("XrPath") long inputSourcePath, @NativeType("XrBool32") boolean state) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceStateBoolEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(session.address(), topLevelPath, inputSourcePath, state ? 1 : 0, __functionAddress);
    }

    // --- [ xrSetInputDeviceStateFloatEXT ] ---

    /** {@code XrResult xrSetInputDeviceStateFloatEXT(XrSession session, XrPath topLevelPath, XrPath inputSourcePath, float state)} */
    @NativeType("XrResult")
    public static int xrSetInputDeviceStateFloatEXT(XrSession session, @NativeType("XrPath") long topLevelPath, @NativeType("XrPath") long inputSourcePath, float state) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceStateFloatEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(session.address(), topLevelPath, inputSourcePath, state, __functionAddress);
    }

    // --- [ xrSetInputDeviceStateVector2fEXT ] ---

    private static final FFICIF xrSetInputDeviceStateVector2fEXTCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint64, ffi_type_uint64, apiCreateStruct(ffi_type_float, ffi_type_float)
    );

    /** {@code XrResult xrSetInputDeviceStateVector2fEXT(XrSession session, XrPath topLevelPath, XrPath inputSourcePath, XrVector2f state)} */
    public static int nxrSetInputDeviceStateVector2fEXT(XrSession session, long topLevelPath, long inputSourcePath, long state) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceStateVector2fEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 4);
            memPutAddress(arguments, stack.npointer(session));
            memPutAddress(arguments + POINTER_SIZE, stack.nlong(topLevelPath));
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.nlong(inputSourcePath));
            memPutAddress(arguments + 3 * POINTER_SIZE, state);

            nffi_call(xrSetInputDeviceStateVector2fEXTCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code XrResult xrSetInputDeviceStateVector2fEXT(XrSession session, XrPath topLevelPath, XrPath inputSourcePath, XrVector2f state)} */
    @NativeType("XrResult")
    public static int xrSetInputDeviceStateVector2fEXT(XrSession session, @NativeType("XrPath") long topLevelPath, @NativeType("XrPath") long inputSourcePath, XrVector2f state) {
        return nxrSetInputDeviceStateVector2fEXT(session, topLevelPath, inputSourcePath, state.address());
    }

    // --- [ xrSetInputDeviceLocationEXT ] ---

    private static final FFICIF xrSetInputDeviceLocationEXTCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint64, ffi_type_uint64, ffi_type_pointer, apiCreateStruct(apiCreateStruct(ffi_type_float, ffi_type_float, ffi_type_float, ffi_type_float), apiCreateStruct(ffi_type_float, ffi_type_float, ffi_type_float))
    );

    /** {@code XrResult xrSetInputDeviceLocationEXT(XrSession session, XrPath topLevelPath, XrPath inputSourcePath, XrSpace space, XrPosef pose)} */
    public static int nxrSetInputDeviceLocationEXT(XrSession session, long topLevelPath, long inputSourcePath, XrSpace space, long pose) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceLocationEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 5);
            memPutAddress(arguments, stack.npointer(session));
            memPutAddress(arguments + POINTER_SIZE, stack.nlong(topLevelPath));
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.nlong(inputSourcePath));
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.npointer(space));
            memPutAddress(arguments + 4 * POINTER_SIZE, pose);

            nffi_call(xrSetInputDeviceLocationEXTCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code XrResult xrSetInputDeviceLocationEXT(XrSession session, XrPath topLevelPath, XrPath inputSourcePath, XrSpace space, XrPosef pose)} */
    @NativeType("XrResult")
    public static int xrSetInputDeviceLocationEXT(XrSession session, @NativeType("XrPath") long topLevelPath, @NativeType("XrPath") long inputSourcePath, XrSpace space, XrPosef pose) {
        return nxrSetInputDeviceLocationEXT(session, topLevelPath, inputSourcePath, space, pose.address());
    }

}