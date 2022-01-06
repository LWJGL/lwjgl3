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

/** The EXT_conformance_automation extension. */
public class EXTConformanceAutomation {

    /** The extension specification version. */
    public static final int XR_EXT_conformance_automation_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String XR_EXT_CONFORMANCE_AUTOMATION_EXTENSION_NAME = "XR_EXT_conformance_automation";

    protected EXTConformanceAutomation() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetInputDeviceActiveEXT ] ---

    /**
     * Sets the active state of the input device.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrSetInputDeviceActiveEXT(
     *     XrSession                                   session,
     *     XrPath                                      interactionProfile,
     *     XrPath                                      topLevelPath,
     *     XrBool32                                    isActive);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid session handle.</li>
     * <li>{@code topLevelPath} <b>must</b> be a valid top level path.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTConformanceAutomation XR_EXT_conformance_automation} extension <b>must</b> be enabled prior to calling {@link #xrSetInputDeviceActiveEXT SetInputDeviceActiveEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session            the {@code XrSession} to set the input device state in.
     * @param interactionProfile the path representing the interaction profile of the input device (e.g. pathname:/interaction_profiles/khr/simple_controller).
     * @param topLevelPath       the path representing the input device (e.g. pathname:/user/hand/left).
     * @param isActive           the requested activation state of the input device.
     */
    @NativeType("XrResult")
    public static int xrSetInputDeviceActiveEXT(XrSession session, @NativeType("XrPath") long interactionProfile, @NativeType("XrPath") long topLevelPath, @NativeType("XrBool32") boolean isActive) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceActiveEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(session.address(), interactionProfile, topLevelPath, isActive ? 1 : 0, __functionAddress);
    }

    // --- [ xrSetInputDeviceStateBoolEXT ] ---

    /**
     * Sets the state of a boolean input source on the input device.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrSetInputDeviceStateBoolEXT(
     *     XrSession                                   session,
     *     XrPath                                      topLevelPath,
     *     XrPath                                      inputSourcePath,
     *     XrBool32                                    state);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid session handle.</li>
     * <li>{@code topLevelPath} <b>must</b> be a valid top level path.</li>
     * <li>{@code inputSourcePath} <b>must</b> be a valid input source path.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTConformanceAutomation XR_EXT_conformance_automation} extension <b>must</b> be enabled prior to calling {@link #xrSetInputDeviceStateBoolEXT SetInputDeviceStateBoolEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session         the {@code XrSession} to set the input device state in.
     * @param topLevelPath    the path representing the input device (e.g. pathname:/user/hand/left).
     * @param inputSourcePath the full path of the input component for which we wish to set the state for (e.g. pathname:/user/hand/left/input/select/click).
     * @param state           the requested boolean state of the input device.
     */
    @NativeType("XrResult")
    public static int xrSetInputDeviceStateBoolEXT(XrSession session, @NativeType("XrPath") long topLevelPath, @NativeType("XrPath") long inputSourcePath, @NativeType("XrBool32") boolean state) {
        long __functionAddress = session.getCapabilities().xrSetInputDeviceStateBoolEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(session.address(), topLevelPath, inputSourcePath, state ? 1 : 0, __functionAddress);
    }

    // --- [ xrSetInputDeviceStateFloatEXT ] ---

    /**
     * Sets the state of a float input source on the input device.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrSetInputDeviceStateFloatEXT(
     *     XrSession                                   session,
     *     XrPath                                      topLevelPath,
     *     XrPath                                      inputSourcePath,
     *     float                                       state);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid session handle.</li>
     * <li>{@code topLevelPath} <b>must</b> be a valid top level path.</li>
     * <li>{@code inputSourcePath} <b>must</b> be a valid input source path.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTConformanceAutomation XR_EXT_conformance_automation} extension <b>must</b> be enabled prior to calling {@link #xrSetInputDeviceStateFloatEXT SetInputDeviceStateFloatEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session         the {@code XrSession} to set the input device state in.
     * @param topLevelPath    the path representing the input device (e.g. pathname:/user/hand/left).
     * @param inputSourcePath the full path of the input component for which we wish to set the state for (e.g. pathname:/user/hand/left/input/trigger/value).
     * @param state           the requested float state of the input device.
     */
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

    /** Unsafe version of: {@link #xrSetInputDeviceStateVector2fEXT SetInputDeviceStateVector2fEXT} */
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

    /**
     * Sets the state of a 2D vector input source on the input device.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrSetInputDeviceStateVector2fEXT(
     *     XrSession                                   session,
     *     XrPath                                      topLevelPath,
     *     XrPath                                      inputSourcePath,
     *     XrVector2f                                  state);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid session handle.</li>
     * <li>{@code topLevelPath} <b>must</b> be a valid top level path.</li>
     * <li>{@code inputSourcePath} <b>must</b> be a valid input source path.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTConformanceAutomation XR_EXT_conformance_automation} extension <b>must</b> be enabled prior to calling {@link #xrSetInputDeviceStateVector2fEXT SetInputDeviceStateVector2fEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVector2f}</p>
     *
     * @param session         the {@code XrSession} to set the input device state in.
     * @param topLevelPath    the path representing the input device (e.g. pathname:/user/hand/left).
     * @param inputSourcePath the full path of the input component for which we wish to set the state for (e.g. pathname:/user/hand/left/input/thumbstick).
     * @param state           the requested two-dimensional state of the input device.
     */
    @NativeType("XrResult")
    public static int xrSetInputDeviceStateVector2fEXT(XrSession session, @NativeType("XrPath") long topLevelPath, @NativeType("XrPath") long inputSourcePath, XrVector2f state) {
        return nxrSetInputDeviceStateVector2fEXT(session, topLevelPath, inputSourcePath, state.address());
    }

    // --- [ xrSetInputDeviceLocationEXT ] ---

    private static final FFICIF xrSetInputDeviceLocationEXTCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint64, ffi_type_uint64, ffi_type_pointer, apiCreateStruct(apiCreateStruct(ffi_type_float, ffi_type_float, ffi_type_float, ffi_type_float), apiCreateStruct(ffi_type_float, ffi_type_float, ffi_type_float))
    );

    /** Unsafe version of: {@link #xrSetInputDeviceLocationEXT SetInputDeviceLocationEXT} */
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

    /**
     * Sets the effective location of a pose input source on the input device.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrSetInputDeviceLocationEXT(
     *     XrSession                                   session,
     *     XrPath                                      topLevelPath,
     *     XrPath                                      inputSourcePath,
     *     XrSpace                                     space,
     *     XrPosef                                     pose);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid session handle.</li>
     * <li>{@code topLevelPath} <b>must</b> be a valid top level path.</li>
     * <li>{@code inputSourcePath} <b>must</b> be a valid input source path.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTConformanceAutomation XR_EXT_conformance_automation} extension <b>must</b> be enabled prior to calling {@link #xrSetInputDeviceLocationEXT SetInputDeviceLocationEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPosef}</p>
     *
     * @param session         the {@code XrSession} to set the input device state in.
     * @param topLevelPath    the path representing the input device (e.g. pathname:/user/hand/left).
     * @param inputSourcePath the full path of the input component for which we wish to set the pose for (e.g. pathname:/user/hand/left/input/grip/pose).
     * @param pose            the requested pose state of the input device.
     */
    @NativeType("XrResult")
    public static int xrSetInputDeviceLocationEXT(XrSession session, @NativeType("XrPath") long topLevelPath, @NativeType("XrPath") long inputSourcePath, XrSpace space, XrPosef pose) {
        return nxrSetInputDeviceLocationEXT(session, topLevelPath, inputSourcePath, space, pose.address());
    }

}