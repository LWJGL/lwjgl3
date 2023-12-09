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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_HTC_anchor">XR_HTC_anchor</a> extension.
 * 
 * <p>This extension allows an application to create a spatial anchor to track a point in the physical environment. The runtime adjusts the pose of the anchor over time to align it with the real world.</p>
 */
public class HTCAnchor {

    /** The extension specification version. */
    public static final int XR_HTC_anchor_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_HTC_ANCHOR_EXTENSION_NAME = "XR_HTC_anchor";

    /** XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC */
    public static final int XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC = 256;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC   = 1000319000,
        XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC = 1000319001;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_NOT_AN_ANCHOR_HTC = -1000319000;

    protected HTCAnchor() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorHTC ] ---

    /** Unsafe version of: {@link #xrCreateSpatialAnchorHTC CreateSpatialAnchorHTC} */
    public static int nxrCreateSpatialAnchorHTC(XrSession session, long createInfo, long anchor) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorHTC;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorCreateInfoHTC.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, anchor, __functionAddress);
    }

    /**
     * Creates a spatial anchor.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSpatialAnchorHTC CreateSpatialAnchorHTC} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpatialAnchorHTC(
     *     XrSession                                   session,
     *     const XrSpatialAnchorCreateInfoHTC*         createInfo,
     *     XrSpace*                                    anchor);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrCreateSpatialAnchorHTC CreateSpatialAnchorHTC} function creates a spatial anchor with specified base space and pose in the space. The anchor is represented by an {@code XrSpace} and its pose can be tracked via {@link XR10#xrLocateSpace LocateSpace}. Once the anchor is no longer needed, call {@link XR10#xrDestroySpace DestroySpace} to erase the anchor.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCAnchor XR_HTC_anchor} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpatialAnchorHTC CreateSpatialAnchorHTC}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorCreateInfoHTC} structure</li>
     * <li>{@code anchor} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
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
     * <li>{@link XR10#XR_ERROR_NAME_INVALID ERROR_NAME_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorCreateInfoHTC}</p>
     *
     * @param session    the {@code XrSession} to create the anchor in.
     * @param createInfo the {@link XrSpatialAnchorCreateInfoHTC} used to specify the anchor.
     * @param anchor     the returned {@code XrSpace} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorHTC(XrSession session, @NativeType("XrSpatialAnchorCreateInfoHTC const *") XrSpatialAnchorCreateInfoHTC createInfo, @NativeType("XrSpace *") PointerBuffer anchor) {
        if (CHECKS) {
            check(anchor, 1);
        }
        return nxrCreateSpatialAnchorHTC(session, createInfo.address(), memAddress(anchor));
    }

    // --- [ xrGetSpatialAnchorNameHTC ] ---

    /** Unsafe version of: {@link #xrGetSpatialAnchorNameHTC GetSpatialAnchorNameHTC} */
    public static int nxrGetSpatialAnchorNameHTC(XrSpace anchor, long name) {
        long __functionAddress = anchor.getCapabilities().xrGetSpatialAnchorNameHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(anchor.address(), name, __functionAddress);
    }

    /**
     * Get name of a spatial anchor.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpatialAnchorNameHTC GetSpatialAnchorNameHTC} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpatialAnchorNameHTC(
     *     XrSpace                                     anchor,
     *     XrSpatialAnchorNameHTC*                     name);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetSpatialAnchorNameHTC GetSpatialAnchorNameHTC} function gets the name of an anchor. If the provided {@code space} is a valid space handle but was <b>not</b> created with {@link #xrCreateSpatialAnchorHTC CreateSpatialAnchorHTC}, the runtime <b>must</b> return {@link #XR_ERROR_NOT_AN_ANCHOR_HTC ERROR_NOT_AN_ANCHOR_HTC}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCAnchor XR_HTC_anchor} extension <b>must</b> be enabled prior to calling {@link #xrGetSpatialAnchorNameHTC GetSpatialAnchorNameHTC}</li>
     * <li>{@code anchor} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code name} <b>must</b> be a pointer to an {@link XrSpatialAnchorNameHTC} structure</li>
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
     * <li>{@link #XR_ERROR_NOT_AN_ANCHOR_HTC ERROR_NOT_AN_ANCHOR_HTC}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorNameHTC}</p>
     *
     * @param anchor the {@code XrSpace} created by {@link #xrCreateSpatialAnchorHTC CreateSpatialAnchorHTC}.
     * @param name   a pointer to output {@link XrSpatialAnchorNameHTC}.
     */
    @NativeType("XrResult")
    public static int xrGetSpatialAnchorNameHTC(XrSpace anchor, @NativeType("XrSpatialAnchorNameHTC *") XrSpatialAnchorNameHTC name) {
        return nxrGetSpatialAnchorNameHTC(anchor, name.address());
    }

}