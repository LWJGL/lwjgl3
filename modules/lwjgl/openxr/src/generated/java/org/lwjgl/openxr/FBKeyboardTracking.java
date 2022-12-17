/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_keyboard_tracking">XR_FB_keyboard_tracking</a> extension.
 * 
 * <p>This extension allows the application to query the system for a supported trackable keyboard type and obtain an {@code XrSpace} handle to track it. It also provides relevant metadata about the keyboard itself, including bounds and a human readable identifier.</p>
 */
public class FBKeyboardTracking {

    /** The extension specification version. */
    public static final int XR_FB_keyboard_tracking_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_KEYBOARD_TRACKING_EXTENSION_NAME = "XR_FB_keyboard_tracking";

    /** XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB */
    public static final int XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB = 128;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB TYPE_KEYBOARD_SPACE_CREATE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_KEYBOARD_TRACKING_QUERY_FB TYPE_KEYBOARD_TRACKING_QUERY_FB}</li>
     * <li>{@link #XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB          = 1000116009,
        XR_TYPE_KEYBOARD_TRACKING_QUERY_FB             = 1000116004,
        XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB = 1000116002;

    /**
     * XrKeyboardTrackingFlagBitsFB - XrKeyboardTrackingFlagBitsFB
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_KEYBOARD_TRACKING_EXISTS_BIT_FB KEYBOARD_TRACKING_EXISTS_BIT_FB} — indicates that the system has a physically tracked keyboard to report.  If not set then no other bits should be considered to be valid or meaningful.  If set either XR_KEYBOARD_TRACKING_LOCAL_BIT_FB or XR_KEYBOARD_TRACKING_REMOTE_BIT_FB must also be set.</li>
     * <li>{@link #XR_KEYBOARD_TRACKING_LOCAL_BIT_FB KEYBOARD_TRACKING_LOCAL_BIT_FB} — indicates that the physically tracked keyboard is intended to be used in a local pairing with the system.  Mutally exclusive with XR_KEYBOARD_TRACKING_REMOTE_BIT_FB.</li>
     * <li>{@link #XR_KEYBOARD_TRACKING_REMOTE_BIT_FB KEYBOARD_TRACKING_REMOTE_BIT_FB} — indicates that the physically tracked keyboard is intended to be used while paired to a separate remote computing device. Mutally exclusive with XR_KEYBOARD_TRACKING_LOCAL_BIT_FB.</li>
     * <li>{@link #XR_KEYBOARD_TRACKING_CONNECTED_BIT_FB KEYBOARD_TRACKING_CONNECTED_BIT_FB} — indicates that the physically tracked keyboard is actively connected to the headset and capable of sending key data</li>
     * </ul>
     */
    public static final int
        XR_KEYBOARD_TRACKING_EXISTS_BIT_FB    = 0x1,
        XR_KEYBOARD_TRACKING_LOCAL_BIT_FB     = 0x2,
        XR_KEYBOARD_TRACKING_REMOTE_BIT_FB    = 0x4,
        XR_KEYBOARD_TRACKING_CONNECTED_BIT_FB = 0x8;

    /**
     * XrKeyboardTrackingQueryFlagBitsFB - XrKeyboardTrackingQueryFlagBitsFB
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB} — indicates the query is for the physically tracked keyboard that is intended to be used in a local pairing with the System. Mutally exclusive with XR_KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB.</li>
     * <li>{@link #XR_KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB} — indicates the query is for the physically tracked keyboard that may be connected to a separate remote computing device. Mutally exclusive with XR_KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB.</li>
     * </ul>
     */
    public static final int
        XR_KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB  = 0x2,
        XR_KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB = 0x4;

    protected FBKeyboardTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrQuerySystemTrackedKeyboardFB ] ---

    /** Unsafe version of: {@link #xrQuerySystemTrackedKeyboardFB QuerySystemTrackedKeyboardFB} */
    public static int nxrQuerySystemTrackedKeyboardFB(XrSession session, long queryInfo, long keyboard) {
        long __functionAddress = session.getCapabilities().xrQuerySystemTrackedKeyboardFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), queryInfo, keyboard, __functionAddress);
    }

    /**
     * Queries the system keyboard.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrQuerySystemTrackedKeyboardFB QuerySystemTrackedKeyboardFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrQuerySystemTrackedKeyboardFB(
     *     XrSession                                   session,
     *     const XrKeyboardTrackingQueryFB*            queryInfo,
     *     XrKeyboardTrackingDescriptionFB*            keyboard);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrQuerySystemTrackedKeyboardFB QuerySystemTrackedKeyboardFB} function populates an {@link XrKeyboardTrackingDescriptionFB} structure with enough information to describe a keyboard that the system can locate.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to calling {@link #xrQuerySystemTrackedKeyboardFB QuerySystemTrackedKeyboardFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code queryInfo} <b>must</b> be a pointer to a valid {@link XrKeyboardTrackingQueryFB} structure</li>
     * <li>{@code keyboard} <b>must</b> be a pointer to an {@link XrKeyboardTrackingDescriptionFB} structure</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrKeyboardTrackingDescriptionFB}, {@link XrKeyboardTrackingQueryFB}</p>
     *
     * @param session   the session that will be associated with a keyboard space.
     * @param queryInfo the {@link XrKeyboardTrackingQueryFB} that describes the type of keyboard to return. queryInfo must have either {@link #XR_KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB} or {@link #XR_KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB} set.
     * @param keyboard  the {@link XrKeyboardTrackingDescriptionFB} output structure.
     */
    @NativeType("XrResult")
    public static int xrQuerySystemTrackedKeyboardFB(XrSession session, @NativeType("XrKeyboardTrackingQueryFB const *") XrKeyboardTrackingQueryFB queryInfo, @NativeType("XrKeyboardTrackingDescriptionFB *") XrKeyboardTrackingDescriptionFB keyboard) {
        return nxrQuerySystemTrackedKeyboardFB(session, queryInfo.address(), keyboard.address());
    }

    // --- [ xrCreateKeyboardSpaceFB ] ---

    /** Unsafe version of: {@link #xrCreateKeyboardSpaceFB CreateKeyboardSpaceFB} */
    public static int nxrCreateKeyboardSpaceFB(XrSession session, long createInfo, long keyboardSpace) {
        long __functionAddress = session.getCapabilities().xrCreateKeyboardSpaceFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, keyboardSpace, __functionAddress);
    }

    /**
     * Create a foveation profile.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateKeyboardSpaceFB CreateKeyboardSpaceFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateKeyboardSpaceFB(
     *     XrSession                                   session,
     *     const XrKeyboardSpaceCreateInfoFB*          createInfo,
     *     XrSpace*                                    keyboardSpace);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrCreateKeyboardSpaceFB CreateKeyboardSpaceFB} function returns an {@code XrSpace} that can be used to locate a physical keyboard in space. The origin of the created {@code XrSpace} is located in the center of the bounding box in the x and z axes, and at the top of the y axis (meaning the keyboard is located entirely in negative y).</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to calling {@link #xrCreateKeyboardSpaceFB CreateKeyboardSpaceFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrKeyboardSpaceCreateInfoFB} structure</li>
     * <li>{@code keyboardSpace} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrKeyboardSpaceCreateInfoFB}</p>
     *
     * @param session       the session that will be associated with the returned keyboard space.
     * @param createInfo    the {@link XrKeyboardSpaceCreateInfoFB} that describes the type of keyboard to track.
     * @param keyboardSpace the {@code XrSpace} output structure.
     */
    @NativeType("XrResult")
    public static int xrCreateKeyboardSpaceFB(XrSession session, @NativeType("XrKeyboardSpaceCreateInfoFB const *") XrKeyboardSpaceCreateInfoFB createInfo, @NativeType("XrSpace *") PointerBuffer keyboardSpace) {
        if (CHECKS) {
            check(keyboardSpace, 1);
        }
        return nxrCreateKeyboardSpaceFB(session, createInfo.address(), memAddress(keyboardSpace));
    }

}