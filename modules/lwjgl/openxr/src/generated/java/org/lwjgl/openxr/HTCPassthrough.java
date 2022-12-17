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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_HTC_passthrough">XR_HTC_passthrough</a> extension.
 * 
 * <p>This extension enables an application to show the passthrough image to see the surrounding environment from the VR headset. The application is allowed to configure the passthrough image with the different appearances according to the demand of the application.</p>
 * 
 * <p>The passthrough configurations that runtime provides to applications contain:</p>
 * 
 * <ul>
 * <li>Decide the passthrough layer shown over or under the frame submitted by the application.</li>
 * <li>Specify the passthrough form with full of the entire screen or projection onto the mesh specified by the application.</li>
 * <li>Set the alpha blending level for the composition of the passthrough layer.</li>
 * </ul>
 */
public class HTCPassthrough {

    /** The extension specification version. */
    public static final int XR_HTC_passthrough_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_HTC_PASSTHROUGH_EXTENSION_NAME = "XR_HTC_passthrough";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_PASSTHROUGH_HTC = 1000317000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_PASSTHROUGH_CREATE_INFO_HTC TYPE_PASSTHROUGH_CREATE_INFO_HTC}</li>
     * <li>{@link #XR_TYPE_PASSTHROUGH_COLOR_HTC TYPE_PASSTHROUGH_COLOR_HTC}</li>
     * <li>{@link #XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC}</li>
     * <li>{@link #XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_PASSTHROUGH_CREATE_INFO_HTC         = 1000317001,
        XR_TYPE_PASSTHROUGH_COLOR_HTC               = 1000317002,
        XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC = 1000317003,
        XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC   = 1000317004;

    /**
     * XrPassthroughFormHTC - Describes the form of passthrough.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_PASSTHROUGH_FORM_PLANAR_HTC PASSTHROUGH_FORM_PLANAR_HTC} — Presents the passthrough with full of the entire screen.</li>
     * <li>{@link #XR_PASSTHROUGH_FORM_PROJECTED_HTC PASSTHROUGH_FORM_PROJECTED_HTC} — Presents the passthrough projecting onto a custom mesh.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPassthroughCreateInfoHTC}</p>
     */
    public static final int
        XR_PASSTHROUGH_FORM_PLANAR_HTC    = 0,
        XR_PASSTHROUGH_FORM_PROJECTED_HTC = 1;

    protected HTCPassthrough() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreatePassthroughHTC ] ---

    /** Unsafe version of: {@link #xrCreatePassthroughHTC CreatePassthroughHTC} */
    public static int nxrCreatePassthroughHTC(XrSession session, long createInfo, long passthrough) {
        long __functionAddress = session.getCapabilities().xrCreatePassthroughHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, passthrough, __functionAddress);
    }

    /**
     * Create a passthrough handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreatePassthroughHTC CreatePassthroughHTC} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreatePassthroughHTC(
     *     XrSession                                   session,
     *     const XrPassthroughCreateInfoHTC*           createInfo,
     *     XrPassthroughHTC*                           passthrough);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrPassthroughHTC} handle.</p>
     * 
     * <p>If the function successfully returned, the output {@code passthrough} <b>must</b> be a valid handle.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCPassthrough XR_HTC_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrCreatePassthroughHTC CreatePassthroughHTC}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrPassthroughCreateInfoHTC} structure</li>
     * <li>{@code passthrough} <b>must</b> be a pointer to an {@code XrPassthroughHTC} handle</li>
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
     * <p>{@link XrPassthroughCreateInfoHTC}</p>
     *
     * @param session     an {@code XrSession} in which the passthrough will be active.
     * @param createInfo  a pointer to an {@link XrPassthroughCreateInfoHTC} structure containing information about how to create the passthrough.
     * @param passthrough a pointer to a handle in which the created {@code XrPassthroughHTC} is returned.
     */
    @NativeType("XrResult")
    public static int xrCreatePassthroughHTC(XrSession session, @NativeType("XrPassthroughCreateInfoHTC const *") XrPassthroughCreateInfoHTC createInfo, @NativeType("XrPassthroughHTC *") PointerBuffer passthrough) {
        if (CHECKS) {
            check(passthrough, 1);
        }
        return nxrCreatePassthroughHTC(session, createInfo.address(), memAddress(passthrough));
    }

    // --- [ xrDestroyPassthroughHTC ] ---

    /**
     * Destroy a passthrough handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyPassthroughHTC DestroyPassthroughHTC} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyPassthroughHTC(
     *     XrPassthroughHTC                            passthrough);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrDestroyPassthroughHTC DestroyPassthroughHTC} function releases the passthrough and the underlying resources.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCPassthrough XR_HTC_passthrough} extension <b>must</b> be enabled prior to calling {@link #xrDestroyPassthroughHTC DestroyPassthroughHTC}</li>
     * <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughHTC} handle</li>
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
     * </ul></dd>
     * </dl>
     *
     * @param passthrough the {@code XrPassthroughHTC} to be destroyed.
     */
    @NativeType("XrResult")
    public static int xrDestroyPassthroughHTC(XrPassthroughHTC passthrough) {
        long __functionAddress = passthrough.getCapabilities().xrDestroyPassthroughHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(passthrough.address(), __functionAddress);
    }

}