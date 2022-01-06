/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The KHR_visibility_mask extension. */
public class KHRVisibilityMask {

    /** The extension specification version. */
    public static final int XR_KHR_visibility_mask_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_KHR_VISIBILITY_MASK_EXTENSION_NAME = "XR_KHR_visibility_mask";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_VISIBILITY_MASK_KHR TYPE_VISIBILITY_MASK_KHR}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_VISIBILITY_MASK_KHR                    = 1000031000,
        XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR = 1000031001;

    /**
     * XrVisibilityMaskTypeKHR - Visibility Mask Type
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR} refers to a two dimensional triangle mesh on the view surface which <b>should</b> not be drawn to by the application. {@link XrVisibilityMaskKHR} refers to a set of triangles identified by vertices and vertex indices. The index count will thus be a multiple of three. The triangle vertices will be returned in counter-clockwise order as viewed from the user perspective.</li>
     * <li>{@link #XR_VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR} refers to a two dimensional triangle mesh on the view surface which <b>should</b> be drawn to by the application. {@link XrVisibilityMaskKHR} refers to a set of triangles identified by vertices and vertex indices. The index count will thus be a multiple of three. The triangle vertices will be returned in counter-clockwise order as viewed from the user perspective.</li>
     * <li>{@link #XR_VISIBILITY_MASK_TYPE_LINE_LOOP_KHR VISIBILITY_MASK_TYPE_LINE_LOOP_KHR} refers to a single multi-segmented line loop on the view surface which encompasses the view area which <b>should</b> be drawn by the application. It is the border that exists between the visible and hidden meshes identified by {@link #XR_VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR} and {@link #XR_VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR}. The line is counter-clockwise, contiguous, and non-self crossing, with the last point implicitly connecting to the first point. There is one vertex per point, the index count will equal the vertex count, and the indices will refer to the vertices.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrGetVisibilityMaskKHR GetVisibilityMaskKHR}</p>
     */
    public static final int
        XR_VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR  = 1,
        XR_VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR = 2,
        XR_VISIBILITY_MASK_TYPE_LINE_LOOP_KHR             = 3;

    protected KHRVisibilityMask() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetVisibilityMaskKHR ] ---

    /** Unsafe version of: {@link #xrGetVisibilityMaskKHR GetVisibilityMaskKHR} */
    public static int nxrGetVisibilityMaskKHR(XrSession session, int viewConfigurationType, int viewIndex, int visibilityMaskType, long visibilityMask) {
        long __functionAddress = session.getCapabilities().xrGetVisibilityMaskKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), viewConfigurationType, viewIndex, visibilityMaskType, visibilityMask, __functionAddress);
    }

    /**
     * Gets visibility mask.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetVisibilityMaskKHR GetVisibilityMaskKHR} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetVisibilityMaskKHR(
     *     XrSession                                   session,
     *     XrViewConfigurationType                     viewConfigurationType,
     *     uint32_t                                    viewIndex,
     *     XrVisibilityMaskTypeKHR                     visibilityMaskType,
     *     XrVisibilityMaskKHR*                        visibilityMask);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetVisibilityMaskKHR GetVisibilityMaskKHR} retrieves the view mask for a given view. This function follows the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#buffer-size-parameters">two-call idiom</a> for filling multiple buffers in a struct. Specifically, if either {@code vertexCapacityInput} or {@code indexCapacityInput} is 0, the runtime <b>must</b> respond as if both fields were set to 0, returning the vertex count and index count through {@code vertexCountOutput} or {@code indexCountOutput} respectively. If a view mask for the specified view isn’t available, the returned vertex and index counts <b>must</b> be 0.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHRVisibilityMask XR_KHR_visibility_mask} extension <b>must</b> be enabled prior to calling {@link #xrGetVisibilityMaskKHR GetVisibilityMaskKHR}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
     * <li>{@code visibilityMaskType} <b>must</b> be a valid {@code XrVisibilityMaskTypeKHR} value</li>
     * <li>{@code visibilityMask} <b>must</b> be a pointer to an {@link XrVisibilityMaskKHR} structure</li>
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
     * <li>{@link XR10#XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVisibilityMaskKHR}</p>
     *
     * @param session               an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param viewConfigurationType the view configuration from which to retrieve mask information.
     * @param viewIndex             the individual view within the view configuration from which to retrieve mask information.
     * @param visibilityMaskType    the type of visibility mask requested.
     * @param visibilityMask        an input/output struct which specifies the view mask.
     */
    @NativeType("XrResult")
    public static int xrGetVisibilityMaskKHR(XrSession session, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t") int viewIndex, @NativeType("XrVisibilityMaskTypeKHR") int visibilityMaskType, @NativeType("XrVisibilityMaskKHR *") XrVisibilityMaskKHR visibilityMask) {
        return nxrGetVisibilityMaskKHR(session, viewConfigurationType, viewIndex, visibilityMaskType, visibilityMask.address());
    }

}