/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_META_virtual_keyboard">XR_META_virtual_keyboard</a> extension.
 * 
 * <p>The virtual keyboard extension provides a system-driven localized keyboard that the application has full control over in terms of positioning and rendering.</p>
 * 
 * <p>This is achieved by giving the application the data required to drive rendering and animation of the keyboard in response to interaction data passed from the application to the runtime.</p>
 * 
 * <p>This approach is an alternative to a potential system keyboard overlay solution and provides a keyboard that can seamlessly blend into the application environment, since it is rendered by the same system, and avoids input focus issues that might come with a system overlay.</p>
 * 
 * <p>The API is also designed to work with custom hand and/or controller models in various games and applications.</p>
 */
public class METAVirtualKeyboard {

    /** The extension specification version. */
    public static final int XR_META_virtual_keyboard_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_VIRTUAL_KEYBOARD_EXTENSION_NAME = "XR_META_virtual_keyboard";

    /** XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META */
    public static final int XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META = 3992;

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_VIRTUAL_KEYBOARD_META = 1000219000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META}</li>
     * <li>{@link #XR_TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META}</li>
     * <li>{@link #XR_TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META}</li>
     * <li>{@link #XR_TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META}</li>
     * <li>{@link #XR_TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META}</li>
     * <li>{@link #XR_TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META}</li>
     * <li>{@link #XR_TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META}</li>
     * <li>{@link #XR_TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META}</li>
     * <li>{@link #XR_TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META}</li>
     * <li>{@link #XR_TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_SHOWN_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_SHOWN_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_HIDDEN_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_HIDDEN_META}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META         = 1000219001,
        XR_TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META               = 1000219002,
        XR_TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META         = 1000219003,
        XR_TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META             = 1000219004,
        XR_TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META = 1000219005,
        XR_TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META           = 1000219006,
        XR_TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META    = 1000219007,
        XR_TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META              = 1000219009,
        XR_TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META                = 1000219010,
        XR_TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META  = 1000219011,
        XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META    = 1000219014,
        XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META      = 1000219015,
        XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META          = 1000219016,
        XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_SHOWN_META          = 1000219017,
        XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_HIDDEN_META         = 1000219018;

    /**
     * XrVirtualKeyboardLocationTypeMETA - Enum describing keyboard placement types
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META} Indicates that the application will provide the position and scale of the keyboard.</li>
     * <li>{@link #XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_FAR_META VIRTUAL_KEYBOARD_LOCATION_TYPE_FAR_META} Indicates that the runtime will set the position and scale for far field keyboard.</li>
     * <li>{@link #XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_DIRECT_META VIRTUAL_KEYBOARD_LOCATION_TYPE_DIRECT_META} Indicates that the runtime will set the position and scale for direct interaction keyboard.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVirtualKeyboardLocationInfoMETA}, {@link XrVirtualKeyboardSpaceCreateInfoMETA}</p>
     */
    public static final int
        XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META = 0,
        XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_FAR_META    = 1,
        XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_DIRECT_META = 2;

    /**
     * XrVirtualKeyboardInputSourceMETA - Enum describing keyboard input source types
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_LEFT_META VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_LEFT_META}</td><td>Left controller ray.</td></tr>
     * <tr><td>{@link #XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_RIGHT_META VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_RIGHT_META}</td><td>Right controller ray.</td></tr>
     * <tr><td>{@link #XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_LEFT_META VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_LEFT_META}</td><td>Left hand ray.</td></tr>
     * <tr><td>{@link #XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_RIGHT_META VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_RIGHT_META}</td><td>Right hand ray.</td></tr>
     * <tr><td>{@link #XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_LEFT_META VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_LEFT_META}</td><td>Left controller direct touch.</td></tr>
     * <tr><td>{@link #XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_RIGHT_META VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_RIGHT_META}</td><td>Right controller direct touch.</td></tr>
     * <tr><td>{@link #XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_LEFT_META VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_LEFT_META}</td><td>Left hand direct touch.</td></tr>
     * <tr><td>{@link #XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_RIGHT_META VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_RIGHT_META}</td><td>Right hand direct touch.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVirtualKeyboardInputInfoMETA}</p>
     */
    public static final int
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_LEFT_META         = 1,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_RIGHT_META        = 2,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_LEFT_META               = 3,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_RIGHT_META              = 4,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_LEFT_META      = 5,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_RIGHT_META     = 6,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_LEFT_META  = 7,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_RIGHT_META = 8;

    /**
     * XrVirtualKeyboardInputStateFlagBitsMETA - XrVirtualKeyboardInputStateFlagBitsMETA
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_VIRTUAL_KEYBOARD_INPUT_STATE_PRESSED_BIT_META VIRTUAL_KEYBOARD_INPUT_STATE_PRESSED_BIT_META} — If the input source is considered 'pressed' at all. Pinch for hands, Primary button for controllers.</li>
     * </ul>
     */
    public static final int XR_VIRTUAL_KEYBOARD_INPUT_STATE_PRESSED_BIT_META = 0x1;

    protected METAVirtualKeyboard() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateVirtualKeyboardMETA ] ---

    /** Unsafe version of: {@link #xrCreateVirtualKeyboardMETA CreateVirtualKeyboardMETA} */
    public static int nxrCreateVirtualKeyboardMETA(XrSession session, long createInfo, long keyboard) {
        long __functionAddress = session.getCapabilities().xrCreateVirtualKeyboardMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, keyboard, __functionAddress);
    }

    /**
     * Create a virtual keyboard.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateVirtualKeyboardMETA CreateVirtualKeyboardMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateVirtualKeyboardMETA(
     *     XrSession                                   session,
     *     const XrVirtualKeyboardCreateInfoMETA*      createInfo,
     *     XrVirtualKeyboardMETA*                      keyboard);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrCreateVirtualKeyboardMETA CreateVirtualKeyboardMETA} creates an {@code XrVirtualKeyboardMETA} handle and establishes a keyboard within the runtime {@code XrSession}. The returned virtual keyboard handle <b>may</b> be subsequently used in API calls.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling {@link #xrCreateVirtualKeyboardMETA CreateVirtualKeyboardMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrVirtualKeyboardCreateInfoMETA} structure</li>
     * <li>{@code keyboard} <b>must</b> be a pointer to an {@code XrVirtualKeyboardMETA} handle</li>
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
     * <p>{@link XrVirtualKeyboardCreateInfoMETA}</p>
     *
     * @param session    the {@code XrSession}.
     * @param createInfo the {@link XrVirtualKeyboardCreateInfoMETA}.
     * @param keyboard   the returned {@code XrVirtualKeyboardMETA}.
     */
    @NativeType("XrResult")
    public static int xrCreateVirtualKeyboardMETA(XrSession session, @NativeType("XrVirtualKeyboardCreateInfoMETA const *") XrVirtualKeyboardCreateInfoMETA createInfo, @NativeType("XrVirtualKeyboardMETA *") PointerBuffer keyboard) {
        if (CHECKS) {
            check(keyboard, 1);
        }
        return nxrCreateVirtualKeyboardMETA(session, createInfo.address(), memAddress(keyboard));
    }

    // --- [ xrDestroyVirtualKeyboardMETA ] ---

    /**
     * Destroy a virtual keyboard.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyVirtualKeyboardMETA DestroyVirtualKeyboardMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyVirtualKeyboardMETA(
     *     XrVirtualKeyboardMETA                       keyboard);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling {@link #xrDestroyVirtualKeyboardMETA DestroyVirtualKeyboardMETA}</li>
     * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code keyboard}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param keyboard the {@code XrVirtualKeyboardMETA} handle to the keyboard to destroy.
     */
    @NativeType("XrResult")
    public static int xrDestroyVirtualKeyboardMETA(XrVirtualKeyboardMETA keyboard) {
        long __functionAddress = keyboard.getCapabilities().xrDestroyVirtualKeyboardMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(keyboard.address(), __functionAddress);
    }

    // --- [ xrCreateVirtualKeyboardSpaceMETA ] ---

    /** Unsafe version of: {@link #xrCreateVirtualKeyboardSpaceMETA CreateVirtualKeyboardSpaceMETA} */
    public static int nxrCreateVirtualKeyboardSpaceMETA(XrSession session, XrVirtualKeyboardMETA keyboard, long createInfo, long keyboardSpace) {
        long __functionAddress = session.getCapabilities().xrCreateVirtualKeyboardSpaceMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrVirtualKeyboardSpaceCreateInfoMETA.validate(createInfo);
        }
        return callPPPPI(session.address(), keyboard.address(), createInfo, keyboardSpace, __functionAddress);
    }

    /**
     * Create a virtual keyboard space.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateVirtualKeyboardSpaceMETA CreateVirtualKeyboardSpaceMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateVirtualKeyboardSpaceMETA(
     *     XrSession                                   session,
     *     XrVirtualKeyboardMETA                       keyboard,
     *     const XrVirtualKeyboardSpaceCreateInfoMETA* createInfo,
     *     XrSpace*                                    keyboardSpace);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrSpace} handle and places the keyboard in this space. The returned space handle <b>may</b> be subsequently used in API calls.</p>
     * 
     * <p>Once placed, the application <b>should</b> query the keyboard’s location each frame using {@link XR10#xrLocateSpace LocateSpace}. It is important to do this every frame as the runtime is in control of the keyboard’s movement.</p>
     * 
     * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID} if {@code session} is different than what is used to create {@code keyboard}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling {@link #xrCreateVirtualKeyboardSpaceMETA CreateVirtualKeyboardSpaceMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrVirtualKeyboardSpaceCreateInfoMETA} structure</li>
     * <li>{@code keyboardSpace} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
     * <li>{@code keyboard} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVirtualKeyboardSpaceCreateInfoMETA}</p>
     *
     * @param session       the {@code XrSession}.
     * @param keyboard      the {@code XrVirtualKeyboardMETA} handle.
     * @param createInfo    the {@link XrVirtualKeyboardSpaceCreateInfoMETA}.
     * @param keyboardSpace the returned space handle.
     */
    @NativeType("XrResult")
    public static int xrCreateVirtualKeyboardSpaceMETA(XrSession session, XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardSpaceCreateInfoMETA const *") XrVirtualKeyboardSpaceCreateInfoMETA createInfo, @NativeType("XrSpace *") PointerBuffer keyboardSpace) {
        if (CHECKS) {
            check(keyboardSpace, 1);
        }
        return nxrCreateVirtualKeyboardSpaceMETA(session, keyboard, createInfo.address(), memAddress(keyboardSpace));
    }

    // --- [ xrSuggestVirtualKeyboardLocationMETA ] ---

    /** Unsafe version of: {@link #xrSuggestVirtualKeyboardLocationMETA SuggestVirtualKeyboardLocationMETA} */
    public static int nxrSuggestVirtualKeyboardLocationMETA(XrVirtualKeyboardMETA keyboard, long locationInfo) {
        long __functionAddress = keyboard.getCapabilities().xrSuggestVirtualKeyboardLocationMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrVirtualKeyboardLocationInfoMETA.validate(locationInfo);
        }
        return callPPI(keyboard.address(), locationInfo, __functionAddress);
    }

    /**
     * Suggest a virtual keyboard location.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSuggestVirtualKeyboardLocationMETA SuggestVirtualKeyboardLocationMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSuggestVirtualKeyboardLocationMETA(
     *     XrVirtualKeyboardMETA                       keyboard,
     *     const XrVirtualKeyboardLocationInfoMETA*    locationInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling {@link #xrSuggestVirtualKeyboardLocationMETA SuggestVirtualKeyboardLocationMETA}</li>
     * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
     * <li>{@code locationInfo} <b>must</b> be a pointer to a valid {@link XrVirtualKeyboardLocationInfoMETA} structure</li>
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
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVirtualKeyboardLocationInfoMETA}</p>
     *
     * @param keyboard     the {@code XrVirtualKeyboardMETA} handle.
     * @param locationInfo the desired {@link XrVirtualKeyboardLocationInfoMETA}.
     */
    @NativeType("XrResult")
    public static int xrSuggestVirtualKeyboardLocationMETA(XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardLocationInfoMETA const *") XrVirtualKeyboardLocationInfoMETA locationInfo) {
        return nxrSuggestVirtualKeyboardLocationMETA(keyboard, locationInfo.address());
    }

    // --- [ xrGetVirtualKeyboardScaleMETA ] ---

    /** Unsafe version of: {@link #xrGetVirtualKeyboardScaleMETA GetVirtualKeyboardScaleMETA} */
    public static int nxrGetVirtualKeyboardScaleMETA(XrVirtualKeyboardMETA keyboard, long scale) {
        long __functionAddress = keyboard.getCapabilities().xrGetVirtualKeyboardScaleMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(keyboard.address(), scale, __functionAddress);
    }

    /**
     * Get virtual keyboard scale.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetVirtualKeyboardScaleMETA GetVirtualKeyboardScaleMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetVirtualKeyboardScaleMETA(
     *     XrVirtualKeyboardMETA                       keyboard,
     *     float*                                      scale);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>With both the pose and scale, the application has all the information to draw the virtual keyboard render model.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling {@link #xrGetVirtualKeyboardScaleMETA GetVirtualKeyboardScaleMETA}</li>
     * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
     * <li>{@code scale} <b>must</b> be a pointer to a {@code float} value</li>
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
     * @param keyboard the {@code XrVirtualKeyboardMETA} handle.
     * @param scale    a float value of the current scale of the keyboard.
     */
    @NativeType("XrResult")
    public static int xrGetVirtualKeyboardScaleMETA(XrVirtualKeyboardMETA keyboard, @NativeType("float *") FloatBuffer scale) {
        if (CHECKS) {
            check(scale, 1);
        }
        return nxrGetVirtualKeyboardScaleMETA(keyboard, memAddress(scale));
    }

    // --- [ xrSetVirtualKeyboardModelVisibilityMETA ] ---

    /** Unsafe version of: {@link #xrSetVirtualKeyboardModelVisibilityMETA SetVirtualKeyboardModelVisibilityMETA} */
    public static int nxrSetVirtualKeyboardModelVisibilityMETA(XrVirtualKeyboardMETA keyboard, long modelVisibility) {
        long __functionAddress = keyboard.getCapabilities().xrSetVirtualKeyboardModelVisibilityMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(keyboard.address(), modelVisibility, __functionAddress);
    }

    /**
     * Set virtual keyboard model visibility.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetVirtualKeyboardModelVisibilityMETA SetVirtualKeyboardModelVisibilityMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSetVirtualKeyboardModelVisibilityMETA(
     *     XrVirtualKeyboardMETA                       keyboard,
     *     const XrVirtualKeyboardModelVisibilitySetInfoMETA* modelVisibility);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Note that the runtime has final control of the model visibility. The runtime <b>may</b> also change the visible state in certain situations. To get the actual visibility state of the render model, the application <b>should</b> wait for the {@link XrEventDataVirtualKeyboardShownMETA} and {@link XrEventDataVirtualKeyboardHiddenMETA} events.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling {@link #xrSetVirtualKeyboardModelVisibilityMETA SetVirtualKeyboardModelVisibilityMETA}</li>
     * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
     * <li>{@code modelVisibility} <b>must</b> be a pointer to a valid {@link XrVirtualKeyboardModelVisibilitySetInfoMETA} structure</li>
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
     * <p>{@link XrVirtualKeyboardModelVisibilitySetInfoMETA}</p>
     *
     * @param keyboard        the {@code XrVirtualKeyboardMETA} handle.
     * @param modelVisibility the {@link XrVirtualKeyboardModelVisibilitySetInfoMETA}.
     */
    @NativeType("XrResult")
    public static int xrSetVirtualKeyboardModelVisibilityMETA(XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardModelVisibilitySetInfoMETA const *") XrVirtualKeyboardModelVisibilitySetInfoMETA modelVisibility) {
        return nxrSetVirtualKeyboardModelVisibilityMETA(keyboard, modelVisibility.address());
    }

    // --- [ xrGetVirtualKeyboardModelAnimationStatesMETA ] ---

    /** Unsafe version of: {@link #xrGetVirtualKeyboardModelAnimationStatesMETA GetVirtualKeyboardModelAnimationStatesMETA} */
    public static int nxrGetVirtualKeyboardModelAnimationStatesMETA(XrVirtualKeyboardMETA keyboard, long animationStates) {
        long __functionAddress = keyboard.getCapabilities().xrGetVirtualKeyboardModelAnimationStatesMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(keyboard.address(), animationStates, __functionAddress);
    }

    /**
     * Get model animation states.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetVirtualKeyboardModelAnimationStatesMETA GetVirtualKeyboardModelAnimationStatesMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetVirtualKeyboardModelAnimationStatesMETA(
     *     XrVirtualKeyboardMETA                       keyboard,
     *     XrVirtualKeyboardModelAnimationStatesMETA*  animationStates);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This function follows the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#buffer-size-parameters">two-call idiom</a> for filling the {@code states} array in the {@link XrVirtualKeyboardModelAnimationStatesMETA} structure. Note that new animations may be added after the runtime processes inputs from {@link #xrSendVirtualKeyboardInputMETA SendVirtualKeyboardInputMETA}. Therefore, after sending new keyboard inputs the application <b>should</b> query the buffer size again before getting any animation data.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling {@link #xrGetVirtualKeyboardModelAnimationStatesMETA GetVirtualKeyboardModelAnimationStatesMETA}</li>
     * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
     * <li>{@code animationStates} <b>must</b> be a pointer to an {@link XrVirtualKeyboardModelAnimationStatesMETA} structure</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVirtualKeyboardModelAnimationStatesMETA}</p>
     *
     * @param keyboard        the {@code XrVirtualKeyboardMETA} handle.
     * @param animationStates the {@link XrVirtualKeyboardModelAnimationStatesMETA}.
     */
    @NativeType("XrResult")
    public static int xrGetVirtualKeyboardModelAnimationStatesMETA(XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardModelAnimationStatesMETA *") XrVirtualKeyboardModelAnimationStatesMETA animationStates) {
        return nxrGetVirtualKeyboardModelAnimationStatesMETA(keyboard, animationStates.address());
    }

    // --- [ xrGetVirtualKeyboardDirtyTexturesMETA ] ---

    /**
     * Unsafe version of: {@link #xrGetVirtualKeyboardDirtyTexturesMETA GetVirtualKeyboardDirtyTexturesMETA}
     *
     * @param textureIdCapacityInput the capacity of the {@code textureIds} array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrGetVirtualKeyboardDirtyTexturesMETA(XrVirtualKeyboardMETA keyboard, int textureIdCapacityInput, long textureIdCountOutput, long textureIds) {
        long __functionAddress = keyboard.getCapabilities().xrGetVirtualKeyboardDirtyTexturesMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(keyboard.address(), textureIdCapacityInput, textureIdCountOutput, textureIds, __functionAddress);
    }

    /**
     * Get model textures that are dirty.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetVirtualKeyboardDirtyTexturesMETA GetVirtualKeyboardDirtyTexturesMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetVirtualKeyboardDirtyTexturesMETA(
     *     XrVirtualKeyboardMETA                       keyboard,
     *     uint32_t                                    textureIdCapacityInput,
     *     uint32_t*                                   textureIdCountOutput,
     *     uint64_t*                                   textureIds);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This function follows the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#buffer-size-parameters">two-call idiom</a> for filling the {@code textureIds} array. Note that new texture data may be added after the runtime processes inputs from {@link #xrSendVirtualKeyboardInputMETA SendVirtualKeyboardInputMETA}. Therefore, after sending new keyboard inputs the application <b>should</b> query the buffer size again before getting any texture data.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling {@link #xrGetVirtualKeyboardDirtyTexturesMETA GetVirtualKeyboardDirtyTexturesMETA}</li>
     * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
     * <li>{@code textureIdCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code textureIdCapacityInput} is not 0, {@code textureIds} <b>must</b> be a pointer to an array of {@code textureIdCapacityInput} {@code uint64_t} values</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param keyboard             the {@code XrVirtualKeyboardMETA} handle.
     * @param textureIdCountOutput filled in by the runtime with the count of texture IDs written or the required capacity in the case that {@code textureIdCapacityInput} is insufficient.
     * @param textureIds           the array of texture IDs that need to be updated.
     */
    @NativeType("XrResult")
    public static int xrGetVirtualKeyboardDirtyTexturesMETA(XrVirtualKeyboardMETA keyboard, @NativeType("uint32_t *") IntBuffer textureIdCountOutput, @Nullable @NativeType("uint64_t *") LongBuffer textureIds) {
        if (CHECKS) {
            check(textureIdCountOutput, 1);
        }
        return nxrGetVirtualKeyboardDirtyTexturesMETA(keyboard, remainingSafe(textureIds), memAddress(textureIdCountOutput), memAddressSafe(textureIds));
    }

    // --- [ xrGetVirtualKeyboardTextureDataMETA ] ---

    /** Unsafe version of: {@link #xrGetVirtualKeyboardTextureDataMETA GetVirtualKeyboardTextureDataMETA} */
    public static int nxrGetVirtualKeyboardTextureDataMETA(XrVirtualKeyboardMETA keyboard, long textureId, long textureData) {
        long __functionAddress = keyboard.getCapabilities().xrGetVirtualKeyboardTextureDataMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(keyboard.address(), textureId, textureData, __functionAddress);
    }

    /**
     * Get the data to update a model texture.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetVirtualKeyboardTextureDataMETA GetVirtualKeyboardTextureDataMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetVirtualKeyboardTextureDataMETA(
     *     XrVirtualKeyboardMETA                       keyboard,
     *     uint64_t                                    textureId,
     *     XrVirtualKeyboardTextureDataMETA*           textureData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This function follows the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#buffer-size-parameters">two-call idiom</a> for filling the {@code textureBytes} array in the {@link XrVirtualKeyboardTextureDataMETA} structure. Note that new texture data may be added after the runtime processes inputs from {@link #xrSendVirtualKeyboardInputMETA SendVirtualKeyboardInputMETA}. Therefore, after sending new keyboard inputs the application <b>should</b> query the buffer size again before getting any texture data.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling {@link #xrGetVirtualKeyboardTextureDataMETA GetVirtualKeyboardTextureDataMETA}</li>
     * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
     * <li>{@code textureData} <b>must</b> be a pointer to an {@link XrVirtualKeyboardTextureDataMETA} structure</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVirtualKeyboardTextureDataMETA}</p>
     *
     * @param keyboard    the {@code XrVirtualKeyboardMETA} handle.
     * @param textureId   the ID of the texture that the application is querying data for.
     * @param textureData the returned {@link XrVirtualKeyboardTextureDataMETA}.
     */
    @NativeType("XrResult")
    public static int xrGetVirtualKeyboardTextureDataMETA(XrVirtualKeyboardMETA keyboard, @NativeType("uint64_t") long textureId, @NativeType("XrVirtualKeyboardTextureDataMETA *") XrVirtualKeyboardTextureDataMETA textureData) {
        return nxrGetVirtualKeyboardTextureDataMETA(keyboard, textureId, textureData.address());
    }

    // --- [ xrSendVirtualKeyboardInputMETA ] ---

    /** Unsafe version of: {@link #xrSendVirtualKeyboardInputMETA SendVirtualKeyboardInputMETA} */
    public static int nxrSendVirtualKeyboardInputMETA(XrVirtualKeyboardMETA keyboard, long info, long interactorRootPose) {
        long __functionAddress = keyboard.getCapabilities().xrSendVirtualKeyboardInputMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(keyboard.address(), info, interactorRootPose, __functionAddress);
    }

    /**
     * Send virtual keyboard input.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSendVirtualKeyboardInputMETA SendVirtualKeyboardInputMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSendVirtualKeyboardInputMETA(
     *     XrVirtualKeyboardMETA                       keyboard,
     *     const XrVirtualKeyboardInputInfoMETA*       info,
     *     XrPosef*                                    interactorRootPose);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>can</b> use values like a pointer pose as the {@code inputPoseInSpace} for {@code XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_*} or {@code XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_*} input sources, a point on a controller model for {@code XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_*} input sources and the hand index tip pose for {@code XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_*}. Different input poses can be used to accommodate application specific controller or hand models.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling {@link #xrSendVirtualKeyboardInputMETA SendVirtualKeyboardInputMETA}</li>
     * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrVirtualKeyboardInputInfoMETA} structure</li>
     * <li>{@code interactorRootPose} <b>must</b> be a pointer to an {@link XrPosef} structure</li>
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
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPosef}, {@link XrVirtualKeyboardInputInfoMETA}</p>
     *
     * @param keyboard           the {@code XrVirtualKeyboardMETA} handle.
     * @param info               the {@link XrVirtualKeyboardInputInfoMETA} detailing the input being sent to the runtime.
     * @param interactorRootPose an {@link XrPosef} defining the root pose of the input source. The runtime <b>may</b> modify this value to aid keyboard input perception.
     */
    @NativeType("XrResult")
    public static int xrSendVirtualKeyboardInputMETA(XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardInputInfoMETA const *") XrVirtualKeyboardInputInfoMETA info, @NativeType("XrPosef *") XrPosef interactorRootPose) {
        return nxrSendVirtualKeyboardInputMETA(keyboard, info.address(), interactorRootPose.address());
    }

    // --- [ xrChangeVirtualKeyboardTextContextMETA ] ---

    /** Unsafe version of: {@link #xrChangeVirtualKeyboardTextContextMETA ChangeVirtualKeyboardTextContextMETA} */
    public static int nxrChangeVirtualKeyboardTextContextMETA(XrVirtualKeyboardMETA keyboard, long changeInfo) {
        long __functionAddress = keyboard.getCapabilities().xrChangeVirtualKeyboardTextContextMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrVirtualKeyboardTextContextChangeInfoMETA.validate(changeInfo);
        }
        return callPPI(keyboard.address(), changeInfo, __functionAddress);
    }

    /**
     * Change virtual keyboard text context.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrChangeVirtualKeyboardTextContextMETA ChangeVirtualKeyboardTextContextMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrChangeVirtualKeyboardTextContextMETA(
     *     XrVirtualKeyboardMETA                       keyboard,
     *     const XrVirtualKeyboardTextContextChangeInfoMETA* changeInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling {@link #xrChangeVirtualKeyboardTextContextMETA ChangeVirtualKeyboardTextContextMETA}</li>
     * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
     * <li>{@code changeInfo} <b>must</b> be a pointer to a valid {@link XrVirtualKeyboardTextContextChangeInfoMETA} structure</li>
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
     * <p>{@link XrVirtualKeyboardTextContextChangeInfoMETA}</p>
     *
     * @param keyboard the {@code XrVirtualKeyboardMETA} handle.
     */
    @NativeType("XrResult")
    public static int xrChangeVirtualKeyboardTextContextMETA(XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardTextContextChangeInfoMETA const *") XrVirtualKeyboardTextContextChangeInfoMETA changeInfo) {
        return nxrChangeVirtualKeyboardTextContextMETA(keyboard, changeInfo.address());
    }

}