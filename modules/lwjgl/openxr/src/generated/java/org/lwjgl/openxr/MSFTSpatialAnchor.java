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

/** The MSFT_spatial_anchor extension. */
public class MSFTSpatialAnchor {

    /** The extension specification version. */
    public static final int XR_MSFT_spatial_anchor_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_MSFT_SPATIAL_ANCHOR_EXTENSION_NAME = "XR_MSFT_spatial_anchor";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT       = 1000039000,
        XR_TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT = 1000039001;

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_SPATIAL_ANCHOR_MSFT = 1000039000;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT = -1000039001;

    protected MSFTSpatialAnchor() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorMSFT ] ---

    /** Unsafe version of: {@link #xrCreateSpatialAnchorMSFT CreateSpatialAnchorMSFT} */
    public static int nxrCreateSpatialAnchorMSFT(XrSession session, long createInfo, long anchor) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorCreateInfoMSFT.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, anchor, __functionAddress);
    }

    /**
     * Creates a spatial anchor.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSpatialAnchorMSFT CreateSpatialAnchorMSFT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpatialAnchorMSFT(
     *     XrSession                                   session,
     *     const XrSpatialAnchorCreateInfoMSFT*        createInfo,
     *     XrSpatialAnchorMSFT*                        anchor);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrSpatialAnchorMSFT} handle representing a spatial anchor that will track a fixed location in the physical world over time. That real-world location is specified by the position and orientation of the specified {@code pose} within {@code space} at {@code time}.</p>
     * 
     * <p>If {@code space} cannot be located relative to the environment at the moment of the call to {@link #xrCreateSpatialAnchorMSFT CreateSpatialAnchorMSFT}, the runtime <b>must</b> return {@link #XR_ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT}.</p>
     * 
     * <p>After the anchor is created, the runtime <b>should</b> then adjust its position and orientation over time relative to other spaces so as to maintain maximum alignment to its original real-world location, even if that changes the anchor’s relationship to the original {@code space} used to initialize it.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialAnchor XR_MSFT_spatial_anchor} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpatialAnchorMSFT CreateSpatialAnchorMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorCreateInfoMSFT} structure</li>
     * <li>{@code anchor} <b>must</b> be a pointer to an {@code XrSpatialAnchorMSFT} handle</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link #XR_ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorCreateInfoMSFT}</p>
     *
     * @param session    a handle to an {@code XrSession}.
     * @param createInfo a pointer to an {@link XrSpatialAnchorCreateInfoMSFT} structure containing information about how to create the anchor.
     * @param anchor     a pointer to a handle in which the created {@code XrSpatialAnchorMSFT} is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorMSFT(XrSession session, @NativeType("XrSpatialAnchorCreateInfoMSFT const *") XrSpatialAnchorCreateInfoMSFT createInfo, @NativeType("XrSpatialAnchorMSFT *") PointerBuffer anchor) {
        if (CHECKS) {
            check(anchor, 1);
        }
        return nxrCreateSpatialAnchorMSFT(session, createInfo.address(), memAddress(anchor));
    }

    // --- [ xrCreateSpatialAnchorSpaceMSFT ] ---

    /** Unsafe version of: {@link #xrCreateSpatialAnchorSpaceMSFT CreateSpatialAnchorSpaceMSFT} */
    public static int nxrCreateSpatialAnchorSpaceMSFT(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorSpaceMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorSpaceCreateInfoMSFT.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /**
     * Creates a space from a spatial anchor.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSpatialAnchorSpaceMSFT CreateSpatialAnchorSpaceMSFT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpatialAnchorSpaceMSFT(
     *     XrSession                                   session,
     *     const XrSpatialAnchorSpaceCreateInfoMSFT*   createInfo,
     *     XrSpace*                                    space);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrSpace} handle based on a spatial anchor. Application <b>can</b> provide an {@link XrPosef} to define the position and orientation of the new space’s origin relative to the anchor’s natural origin.</p>
     * 
     * <p>Multiple {@code XrSpace} handles may exist for a given {@code XrSpatialAnchorMSFT} simultaneously, up to some limit imposed by the runtime. The {@code XrSpace} handle must be eventually freed via the {@link XR10#xrDestroySpace DestroySpace} function or by destroying the parent {@code XrSpatialAnchorMSFT} handle.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialAnchor XR_MSFT_spatial_anchor} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpatialAnchorSpaceMSFT CreateSpatialAnchorSpaceMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorSpaceCreateInfoMSFT} structure</li>
     * <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorSpaceCreateInfoMSFT}</p>
     *
     * @param session    a handle to an {@code XrSession}.
     * @param createInfo a pointer to an {@link XrSpatialAnchorSpaceCreateInfoMSFT} structure containing information about how to create the anchor.
     * @param space      a pointer to a handle in which the created {@code XrSpace} is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorSpaceMSFT(XrSession session, @NativeType("XrSpatialAnchorSpaceCreateInfoMSFT const *") XrSpatialAnchorSpaceCreateInfoMSFT createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateSpatialAnchorSpaceMSFT(session, createInfo.address(), memAddress(space));
    }

    // --- [ xrDestroySpatialAnchorMSFT ] ---

    /**
     * Destroys a spatial anchor.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroySpatialAnchorMSFT DestroySpatialAnchorMSFT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroySpatialAnchorMSFT(
     *     XrSpatialAnchorMSFT                         anchor);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code XrSpatialAnchorMSFT} handles are destroyed using {@link #xrDestroySpatialAnchorMSFT DestroySpatialAnchorMSFT}. By destroying an anchor, the runtime <b>can</b> stop spending resources used to maintain tracking for that anchor’s origin.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialAnchor XR_MSFT_spatial_anchor} extension <b>must</b> be enabled prior to calling {@link #xrDestroySpatialAnchorMSFT DestroySpatialAnchorMSFT}</li>
     * <li>{@code anchor} <b>must</b> be a valid {@code XrSpatialAnchorMSFT} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code anchor}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateSpatialAnchorMSFT CreateSpatialAnchorMSFT}</p>
     *
     * @param anchor a handle to an {@code XrSpatialAnchorMSFT} previously created by {@link #xrCreateSpatialAnchorMSFT CreateSpatialAnchorMSFT}.
     */
    @NativeType("XrResult")
    public static int xrDestroySpatialAnchorMSFT(XrSpatialAnchorMSFT anchor) {
        long __functionAddress = anchor.getCapabilities().xrDestroySpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(anchor.address(), __functionAddress);
    }

}