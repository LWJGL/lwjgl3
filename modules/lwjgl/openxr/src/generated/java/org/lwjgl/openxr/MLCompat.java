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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_ML_compat">XR_ML_compat</a> extension.
 * 
 * <p>This extension provides functionality to facilitate transitioning from Magic Leap SDK to OpenXR SDK, most notably interoperability between Coordinate Frame UUIDs and {@code XrSpace}.</p>
 */
public class MLCompat {

    /** The extension specification version. */
    public static final int XR_ML_compat_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ML_COMPAT_EXTENSION_NAME = "XR_ML_compat";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COORDINATE_SPACE_CREATE_INFO_ML = 1000137000;

    protected MLCompat() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpaceFromCoordinateFrameUIDML ] ---

    /** Unsafe version of: {@link #xrCreateSpaceFromCoordinateFrameUIDML CreateSpaceFromCoordinateFrameUIDML} */
    public static int nxrCreateSpaceFromCoordinateFrameUIDML(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateSpaceFromCoordinateFrameUIDML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /**
     * Creates a space based on a cfuid.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSpaceFromCoordinateFrameUIDML CreateSpaceFromCoordinateFrameUIDML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpaceFromCoordinateFrameUIDML(
     *     XrSession                                   session,
     *     const XrCoordinateSpaceCreateInfoML *       createInfo,
     *     XrSpace*                                    space);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The service that created the underlying {@link XrCoordinateSpaceCreateInfoML}{@code ::cfuid} <b>must</b> remain active for the lifetime of the {@code XrSpace}. If {@link XR10#xrLocateSpace LocateSpace} is called on a space created from a {@code cfuid} from a no-longer-active service, the runtime <b>may</b> set {@link XrSpaceLocation}{@code ::locationFlags} to 0.</p>
     * 
     * <p>{@code XrSpace} handles are destroyed using {@link XR10#xrDestroySpace DestroySpace}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLCompat XR_ML_compat} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpaceFromCoordinateFrameUIDML CreateSpaceFromCoordinateFrameUIDML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrCoordinateSpaceCreateInfoML} structure</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
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
     * <p>{@link XrCoordinateSpaceCreateInfoML}</p>
     *
     * @param session    a handle to an {@code XrSession} previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param createInfo the {@link XrCoordinateSpaceCreateInfoML} used to specify the space.
     * @param space      the returned space handle.
     */
    @NativeType("XrResult")
    public static int xrCreateSpaceFromCoordinateFrameUIDML(XrSession session, @NativeType("XrCoordinateSpaceCreateInfoML const *") XrCoordinateSpaceCreateInfoML createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateSpaceFromCoordinateFrameUIDML(session, createInfo.address(), memAddress(space));
    }

}