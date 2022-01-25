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

/** The FB_passthrough extension. */
public class FBPassthrough {

    /** The extension specification version. */
    public static final int XR_FB_passthrough_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_PASSTHROUGH_EXTENSION_NAME = "XR_FB_passthrough";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB}</li>
     * <li>{@link #XR_TYPE_PASSTHROUGH_CREATE_INFO_FB TYPE_PASSTHROUGH_CREATE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_PASSTHROUGH_LAYER_CREATE_INFO_FB TYPE_PASSTHROUGH_LAYER_CREATE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB}</li>
     * <li>{@link #XR_TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB}</li>
     * <li>{@link #XR_TYPE_PASSTHROUGH_STYLE_FB TYPE_PASSTHROUGH_STYLE_FB}</li>
     * <li>{@link #XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB}</li>
     * <li>{@link #XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_PASSTHROUGH_STATE_CHANGED_FB TYPE_EVENT_DATA_PASSTHROUGH_STATE_CHANGED_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB        = 1000118000,
        XR_TYPE_PASSTHROUGH_CREATE_INFO_FB              = 1000118001,
        XR_TYPE_PASSTHROUGH_LAYER_CREATE_INFO_FB        = 1000118002,
        XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB        = 1000118003,
        XR_TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB        = 1000118004,
        XR_TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB          = 1000118005,
        XR_TYPE_PASSTHROUGH_STYLE_FB                    = 1000118020,
        XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB   = 1000118021,
        XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB   = 1000118022,
        XR_TYPE_EVENT_DATA_PASSTHROUGH_STATE_CHANGED_FB = 1000118030;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB}</li>
     * <li>{@link #XR_ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB}</li>
     * <li>{@link #XR_ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB}</li>
     * <li>{@link #XR_ERROR_NOT_PERMITTED_PASSTHROUGH_FB ERROR_NOT_PERMITTED_PASSTHROUGH_FB}</li>
     * <li>{@link #XR_ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB}</li>
     * <li>{@link #XR_ERROR_UNKNOWN_PASSTHROUGH_FB ERROR_UNKNOWN_PASSTHROUGH_FB}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB        = -1000118000,
        XR_ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB = -1000118001,
        XR_ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB        = -1000118002,
        XR_ERROR_NOT_PERMITTED_PASSTHROUGH_FB           = -1000118003,
        XR_ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB  = -1000118004,
        XR_ERROR_UNKNOWN_PASSTHROUGH_FB                 = -1000118050;

    /** XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB */
    public static final int XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB = 256;

    /**
     * Extends {@code XrObjectType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_OBJECT_TYPE_PASSTHROUGH_FB OBJECT_TYPE_PASSTHROUGH_FB}</li>
     * <li>{@link #XR_OBJECT_TYPE_PASSTHROUGH_LAYER_FB OBJECT_TYPE_PASSTHROUGH_LAYER_FB}</li>
     * <li>{@link #XR_OBJECT_TYPE_GEOMETRY_INSTANCE_FB OBJECT_TYPE_GEOMETRY_INSTANCE_FB}</li>
     * </ul>
     */
    public static final int
        XR_OBJECT_TYPE_PASSTHROUGH_FB       = 1000118000,
        XR_OBJECT_TYPE_PASSTHROUGH_LAYER_FB = 1000118002,
        XR_OBJECT_TYPE_GEOMETRY_INSTANCE_FB = 1000118004;

    /** XrPassthroughFlagBitsFB */
    public static final int XR_PASSTHROUGH_IS_RUNNING_AT_CREATION_BIT_FB = 0x1;

    /**
     * XrPassthroughLayerPurposeFB - Layer purpose
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_PASSTHROUGH_LAYER_PURPOSE_RECONSTRUCTION_FB PASSTHROUGH_LAYER_PURPOSE_RECONSTRUCTION_FB} — Reconstruction passthrough (full screen environment)</li>
     * <li>{@link #XR_PASSTHROUGH_LAYER_PURPOSE_PROJECTED_FB PASSTHROUGH_LAYER_PURPOSE_PROJECTED_FB} — Projected passthrough (using a custom surface)</li>
     * <li>{@link FBPassthroughKeyboardHands#XR_PASSTHROUGH_LAYER_PURPOSE_TRACKED_KEYBOARD_HANDS_FB PASSTHROUGH_LAYER_PURPOSE_TRACKED_KEYBOARD_HANDS_FB} — Passthrough layer purpose for keyboard hands presence.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPassthroughLayerCreateInfoFB}</p>
     */
    public static final int
        XR_PASSTHROUGH_LAYER_PURPOSE_RECONSTRUCTION_FB = 0,
        XR_PASSTHROUGH_LAYER_PURPOSE_PROJECTED_FB      = 1;

    /**
     * XrPassthroughStateChangedFlagBitsFB
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_PASSTHROUGH_STATE_CHANGED_REINIT_REQUIRED_BIT_FB PASSTHROUGH_STATE_CHANGED_REINIT_REQUIRED_BIT_FB}</li>
     * <li>{@link #XR_PASSTHROUGH_STATE_CHANGED_NON_RECOVERABLE_ERROR_BIT_FB PASSTHROUGH_STATE_CHANGED_NON_RECOVERABLE_ERROR_BIT_FB}</li>
     * <li>{@link #XR_PASSTHROUGH_STATE_CHANGED_RECOVERABLE_ERROR_BIT_FB PASSTHROUGH_STATE_CHANGED_RECOVERABLE_ERROR_BIT_FB}</li>
     * <li>{@link #XR_PASSTHROUGH_STATE_CHANGED_RESTORED_ERROR_BIT_FB PASSTHROUGH_STATE_CHANGED_RESTORED_ERROR_BIT_FB}</li>
     * </ul>
     */
    public static final int
        XR_PASSTHROUGH_STATE_CHANGED_REINIT_REQUIRED_BIT_FB       = 0x1,
        XR_PASSTHROUGH_STATE_CHANGED_NON_RECOVERABLE_ERROR_BIT_FB = 0x2,
        XR_PASSTHROUGH_STATE_CHANGED_RECOVERABLE_ERROR_BIT_FB     = 0x4,
        XR_PASSTHROUGH_STATE_CHANGED_RESTORED_ERROR_BIT_FB        = 0x8;

    protected FBPassthrough() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreatePassthroughFB ] ---

    /** Unsafe version of: {@link #xrCreatePassthroughFB CreatePassthroughFB} */
    public static int nxrCreatePassthroughFB(XrSession session, long createInfo, long outPassthrough) {
        long __functionAddress = session.getCapabilities().xrCreatePassthroughFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, outPassthrough, __functionAddress);
    }

    /**
     * Create a passthrough feature.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreatePassthroughFB CreatePassthroughFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreatePassthroughFB(
     *     XrSession                                   session,
     *     const XrPassthroughCreateInfoFB*            createInfo,
     *     XrPassthroughFB*                            outPassthrough);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrPassthroughFB} handle. The returned passthrough handle <b>may</b> be subsequently used in API calls.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrCreatePassthroughFB CreatePassthroughFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrPassthroughCreateInfoFB} structure</li>
     * <li>{@code outPassthrough} <b>must</b> be a pointer to an {@code XrPassthroughFB} handle</li>
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
     * <li>{@link #XR_ERROR_UNKNOWN_PASSTHROUGH_FB ERROR_UNKNOWN_PASSTHROUGH_FB}</li>
     * <li>{@link #XR_ERROR_NOT_PERMITTED_PASSTHROUGH_FB ERROR_NOT_PERMITTED_PASSTHROUGH_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPassthroughCreateInfoFB}</p>
     *
     * @param session        the {@code XrSession}.
     * @param createInfo     the {@link XrPassthroughCreateInfoFB}.
     * @param outPassthrough the {@code XrPassthroughFB}.
     */
    @NativeType("XrResult")
    public static int xrCreatePassthroughFB(XrSession session, @NativeType("XrPassthroughCreateInfoFB const *") XrPassthroughCreateInfoFB createInfo, @NativeType("XrPassthroughFB *") PointerBuffer outPassthrough) {
        if (CHECKS) {
            check(outPassthrough, 1);
        }
        return nxrCreatePassthroughFB(session, createInfo.address(), memAddress(outPassthrough));
    }

    // --- [ xrDestroyPassthroughFB ] ---

    /**
     * Destroy a passthrough feature.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyPassthroughFB DestroyPassthroughFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyPassthroughFB(
     *     XrPassthroughFB                             passthrough);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Destroys an {@code XrPassthroughFB} handle.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrDestroyPassthroughFB DestroyPassthroughFB}</li>
     * <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughFB} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code passthrough}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * @param passthrough the {@code XrPassthroughFB} to be destroyed.
     */
    @NativeType("XrResult")
    public static int xrDestroyPassthroughFB(XrPassthroughFB passthrough) {
        long __functionAddress = passthrough.getCapabilities().xrDestroyPassthroughFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(passthrough.address(), __functionAddress);
    }

    // --- [ xrPassthroughStartFB ] ---

    /**
     * Start a passthrough feature.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrPassthroughStartFB PassthroughStartFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrPassthroughStartFB(
     *     XrPassthroughFB                             passthrough);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Starts an {@code XrPassthroughFB} feature. If the feature is not started, either explicitly with a call to {@link #xrPassthroughStartFB PassthroughStartFB}, or implicitly at creation using the behavior flags, it is considered paused. When the feature is paused, runtime will stop rendering and compositing all passthrough layers produced on behalf of the application, and may free up some or all the resources used to produce passthrough until {@link #xrPassthroughStartFB PassthroughStartFB} is called.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrPassthroughStartFB PassthroughStartFB}</li>
     * <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughFB} handle</li>
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
     * <li>{@link #XR_ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param passthrough the {@code XrPassthroughFB} to be started.
     */
    @NativeType("XrResult")
    public static int xrPassthroughStartFB(XrPassthroughFB passthrough) {
        long __functionAddress = passthrough.getCapabilities().xrPassthroughStartFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(passthrough.address(), __functionAddress);
    }

    // --- [ xrPassthroughPauseFB ] ---

    /**
     * Pause a passthrough feature.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrPassthroughPauseFB PassthroughPauseFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrPassthroughPauseFB(
     *     XrPassthroughFB                             passthrough);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Pauses an {@code XrPassthroughFB} feature. When the feature is paused, runtime will stop rendering and compositing all passthrough layers produced on behalf of the application, and may free up some or all the resources used to produce passthrough until {@link #xrPassthroughStartFB PassthroughStartFB} is called.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrPassthroughPauseFB PassthroughPauseFB}</li>
     * <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughFB} handle</li>
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
     * <li>{@link #XR_ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param passthrough the {@code XrPassthroughFB} to be paused.
     */
    @NativeType("XrResult")
    public static int xrPassthroughPauseFB(XrPassthroughFB passthrough) {
        long __functionAddress = passthrough.getCapabilities().xrPassthroughPauseFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(passthrough.address(), __functionAddress);
    }

    // --- [ xrCreatePassthroughLayerFB ] ---

    /** Unsafe version of: {@link #xrCreatePassthroughLayerFB CreatePassthroughLayerFB} */
    public static int nxrCreatePassthroughLayerFB(XrSession session, long createInfo, long outLayer) {
        long __functionAddress = session.getCapabilities().xrCreatePassthroughLayerFB;
        if (CHECKS) {
            check(__functionAddress);
            XrPassthroughLayerCreateInfoFB.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, outLayer, __functionAddress);
    }

    /**
     * Create a passthrough layer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreatePassthroughLayerFB CreatePassthroughLayerFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreatePassthroughLayerFB(
     *     XrSession                                   session,
     *     const XrPassthroughLayerCreateInfoFB*       createInfo,
     *     XrPassthroughLayerFB*                       outLayer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrPassthroughLayerFB} handle. The returned layer handle <b>may</b> be subsequently used in API calls. Layer objects may be used to specify rendering properties of the layer, such as styles, and compositing rules.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrCreatePassthroughLayerFB CreatePassthroughLayerFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrPassthroughLayerCreateInfoFB} structure</li>
     * <li>{@code outLayer} <b>must</b> be a pointer to an {@code XrPassthroughLayerFB} handle</li>
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
     * <li>{@link #XR_ERROR_UNKNOWN_PASSTHROUGH_FB ERROR_UNKNOWN_PASSTHROUGH_FB}</li>
     * <li>{@link #XR_ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPassthroughLayerCreateInfoFB}</p>
     *
     * @param session    the {@code XrSession}.
     * @param createInfo the {@link XrPassthroughLayerCreateInfoFB}.
     * @param outLayer   the {@code XrPassthroughLayerFB}.
     */
    @NativeType("XrResult")
    public static int xrCreatePassthroughLayerFB(XrSession session, @NativeType("XrPassthroughLayerCreateInfoFB const *") XrPassthroughLayerCreateInfoFB createInfo, @NativeType("XrPassthroughLayerFB *") PointerBuffer outLayer) {
        if (CHECKS) {
            check(outLayer, 1);
        }
        return nxrCreatePassthroughLayerFB(session, createInfo.address(), memAddress(outLayer));
    }

    // --- [ xrDestroyPassthroughLayerFB ] ---

    /**
     * Destroy a passthrough layer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyPassthroughLayerFB DestroyPassthroughLayerFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyPassthroughLayerFB(
     *     XrPassthroughLayerFB                        layer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Destroys an {@code XrPassthroughLayerFB} handle.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrDestroyPassthroughLayerFB DestroyPassthroughLayerFB}</li>
     * <li>{@code layer} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code layer}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * @param layer the {@code XrPassthroughLayerFB} to be destroyed.
     */
    @NativeType("XrResult")
    public static int xrDestroyPassthroughLayerFB(XrPassthroughLayerFB layer) {
        long __functionAddress = layer.getCapabilities().xrDestroyPassthroughLayerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(layer.address(), __functionAddress);
    }

    // --- [ xrPassthroughLayerPauseFB ] ---

    /**
     * Pause a passthrough layer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrPassthroughLayerPauseFB PassthroughLayerPauseFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrPassthroughLayerPauseFB(
     *     XrPassthroughLayerFB                        layer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Pauses an {@code XrPassthroughLayerFB} layer. Runtime will not render or composite paused layers.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrPassthroughLayerPauseFB PassthroughLayerPauseFB}</li>
     * <li>{@code layer} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
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
     * <li>{@link #XR_ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param layer the {@code XrPassthroughLayerFB} to be paused.
     */
    @NativeType("XrResult")
    public static int xrPassthroughLayerPauseFB(XrPassthroughLayerFB layer) {
        long __functionAddress = layer.getCapabilities().xrPassthroughLayerPauseFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(layer.address(), __functionAddress);
    }

    // --- [ xrPassthroughLayerResumeFB ] ---

    /**
     * Resume a passthrough layer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrPassthroughLayerResumeFB PassthroughLayerResumeFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrPassthroughLayerResumeFB(
     *     XrPassthroughLayerFB                        layer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Resumes an {@code XrPassthroughLayerFB} layer.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrPassthroughLayerResumeFB PassthroughLayerResumeFB}</li>
     * <li>{@code layer} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
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
     * <li>{@link #XR_ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param layer the {@code XrPassthroughLayerFB} to be resumed.
     */
    @NativeType("XrResult")
    public static int xrPassthroughLayerResumeFB(XrPassthroughLayerFB layer) {
        long __functionAddress = layer.getCapabilities().xrPassthroughLayerResumeFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(layer.address(), __functionAddress);
    }

    // --- [ xrPassthroughLayerSetStyleFB ] ---

    /** Unsafe version of: {@link #xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB} */
    public static int nxrPassthroughLayerSetStyleFB(XrPassthroughLayerFB layer, long style) {
        long __functionAddress = layer.getCapabilities().xrPassthroughLayerSetStyleFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(layer.address(), style, __functionAddress);
    }

    /**
     * Set style on a passthrough layer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrPassthroughLayerSetStyleFB(
     *     XrPassthroughLayerFB                        layer,
     *     const XrPassthroughStyleFB*                 style);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Sets an {@link XrPassthroughStyleFB} style on an {@code XrPassthroughLayerFB} layer.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB}</li>
     * <li>{@code layer} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
     * <li>{@code style} <b>must</b> be a pointer to a valid {@link XrPassthroughStyleFB} structure</li>
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
     * <p>{@link XrPassthroughStyleFB}</p>
     *
     * @param layer the {@code XrPassthroughLayerFB} to get the style.
     * @param style the {@link XrPassthroughStyleFB} to be set.
     */
    @NativeType("XrResult")
    public static int xrPassthroughLayerSetStyleFB(XrPassthroughLayerFB layer, @NativeType("XrPassthroughStyleFB const *") XrPassthroughStyleFB style) {
        return nxrPassthroughLayerSetStyleFB(layer, style.address());
    }

    // --- [ xrCreateGeometryInstanceFB ] ---

    /** Unsafe version of: {@link #xrCreateGeometryInstanceFB CreateGeometryInstanceFB} */
    public static int nxrCreateGeometryInstanceFB(XrSession session, long createInfo, long outGeometryInstance) {
        long __functionAddress = session.getCapabilities().xrCreateGeometryInstanceFB;
        if (CHECKS) {
            check(__functionAddress);
            XrGeometryInstanceCreateInfoFB.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, outGeometryInstance, __functionAddress);
    }

    /**
     * Create a triangle mesh.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateGeometryInstanceFB CreateGeometryInstanceFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateGeometryInstanceFB(
     *     XrSession                                   session,
     *     const XrGeometryInstanceCreateInfoFB*       createInfo,
     *     XrGeometryInstanceFB*                       outGeometryInstance);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrGeometryInstanceFB} handle. Geometry instance functionality requires <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#XR_FB_triangle_mesh">XR_FB_triangle_mesh</a> extension to be enabled. An {@code XrGeometryInstanceFB} connects a layer, a mesh, and a transformation, with the semantics that a specific mesh will be instantiated in a specific layer with a specific transformation. A mesh can be instantiated multiple times, in the same or in different layers.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrCreateGeometryInstanceFB CreateGeometryInstanceFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrGeometryInstanceCreateInfoFB} structure</li>
     * <li>{@code outGeometryInstance} <b>must</b> be a pointer to an {@code XrGeometryInstanceFB} handle</li>
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
     * <li>{@link #XR_ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrGeometryInstanceCreateInfoFB}</p>
     *
     * @param session             the {@code XrSession}.
     * @param createInfo          the {@link XrGeometryInstanceCreateInfoFB}.
     * @param outGeometryInstance the {@code XrGeometryInstanceFB}.
     */
    @NativeType("XrResult")
    public static int xrCreateGeometryInstanceFB(XrSession session, @NativeType("XrGeometryInstanceCreateInfoFB const *") XrGeometryInstanceCreateInfoFB createInfo, @NativeType("XrGeometryInstanceFB *") PointerBuffer outGeometryInstance) {
        if (CHECKS) {
            check(outGeometryInstance, 1);
        }
        return nxrCreateGeometryInstanceFB(session, createInfo.address(), memAddress(outGeometryInstance));
    }

    // --- [ xrDestroyGeometryInstanceFB ] ---

    /**
     * Destroy a geometry instance.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyGeometryInstanceFB DestroyGeometryInstanceFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyGeometryInstanceFB(
     *     XrGeometryInstanceFB                        instance);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Destroys an {@code XrGeometryInstanceFB} handle. Destroying an {@code XrGeometryInstanceFB} does not destroy a mesh and does not free mesh resources. Destroying a layer invalidates all geometry instances attached to it. Destroying a mesh invalidates all its instances.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrDestroyGeometryInstanceFB DestroyGeometryInstanceFB}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrGeometryInstanceFB} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code instance}, and any child handles, <b>must</b> be externally synchronized</li>
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
     */
    @NativeType("XrResult")
    public static int xrDestroyGeometryInstanceFB(XrGeometryInstanceFB instance) {
        long __functionAddress = instance.getCapabilities().xrDestroyGeometryInstanceFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(instance.address(), __functionAddress);
    }

    // --- [ xrGeometryInstanceSetTransformFB ] ---

    /** Unsafe version of: {@link #xrGeometryInstanceSetTransformFB GeometryInstanceSetTransformFB} */
    public static int nxrGeometryInstanceSetTransformFB(XrGeometryInstanceFB instance, long transformation) {
        long __functionAddress = instance.getCapabilities().xrGeometryInstanceSetTransformFB;
        if (CHECKS) {
            check(__functionAddress);
            XrGeometryInstanceTransformFB.validate(transformation);
        }
        return callPPI(instance.address(), transformation, __functionAddress);
    }

    /**
     * Create a triangle mesh.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGeometryInstanceSetTransformFB GeometryInstanceSetTransformFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGeometryInstanceSetTransformFB(
     *     XrGeometryInstanceFB                        instance,
     *     const XrGeometryInstanceTransformFB*        transformation);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Sets an {@link XrGeometryInstanceTransformFB} transform on an {@code XrGeometryInstanceFB} geometry instance.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrGeometryInstanceSetTransformFB GeometryInstanceSetTransformFB}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrGeometryInstanceFB} handle</li>
     * <li>{@code transformation} <b>must</b> be a pointer to a valid {@link XrGeometryInstanceTransformFB} structure</li>
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
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrGeometryInstanceTransformFB}</p>
     */
    @NativeType("XrResult")
    public static int xrGeometryInstanceSetTransformFB(XrGeometryInstanceFB instance, @NativeType("XrGeometryInstanceTransformFB const *") XrGeometryInstanceTransformFB transformation) {
        return nxrGeometryInstanceSetTransformFB(instance, transformation.address());
    }

}