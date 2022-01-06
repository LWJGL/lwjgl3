/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_visibility_mask = "KHRVisibilityMask".nativeClassXR("KHR_visibility_mask", type = "instance", postfix = "KHR") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_visibility_mask_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_VISIBILITY_MASK_EXTENSION_NAME".."XR_KHR_visibility_mask"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_VISIBILITY_MASK_KHR".."1000031000",
        "TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR".."1000031001"
    )

    EnumConstant(
        """
        XrVisibilityMaskTypeKHR - Visibility Mask Type

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR refers to a two dimensional triangle mesh on the view surface which <b>should</b> not be drawn to by the application. ##XrVisibilityMaskKHR refers to a set of triangles identified by vertices and vertex indices. The index count will thus be a multiple of three. The triangle vertices will be returned in counter-clockwise order as viewed from the user perspective.</li>
            <li>#VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR refers to a two dimensional triangle mesh on the view surface which <b>should</b> be drawn to by the application. ##XrVisibilityMaskKHR refers to a set of triangles identified by vertices and vertex indices. The index count will thus be a multiple of three. The triangle vertices will be returned in counter-clockwise order as viewed from the user perspective.</li>
            <li>#VISIBILITY_MASK_TYPE_LINE_LOOP_KHR refers to a single multi-segmented line loop on the view surface which encompasses the view area which <b>should</b> be drawn by the application. It is the border that exists between the visible and hidden meshes identified by #VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR and #VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR. The line is counter-clockwise, contiguous, and non-self crossing, with the last point implicitly connecting to the first point. There is one vertex per point, the index count will equal the vertex count, and the indices will refer to the vertices.</li>
        </ul>

        <h5>See Also</h5>
        #GetVisibilityMaskKHR()
        """,

        "VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR".."1",
        "VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR".."2",
        "VISIBILITY_MASK_TYPE_LINE_LOOP_KHR".."3"
    )

    XrResult(
        "GetVisibilityMaskKHR",
        """
        Gets visibility mask.

        <h5>C Specification</h5>
        The #GetVisibilityMaskKHR() function is defined as:

        <pre><code>
￿XrResult xrGetVisibilityMaskKHR(
￿    XrSession                                   session,
￿    XrViewConfigurationType                     viewConfigurationType,
￿    uint32_t                                    viewIndex,
￿    XrVisibilityMaskTypeKHR                     visibilityMaskType,
￿    XrVisibilityMaskKHR*                        visibilityMask);</code></pre>

        <h5>Description</h5>
        #GetVisibilityMaskKHR() retrieves the view mask for a given view. This function follows the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#buffer-size-parameters">two-call idiom</a> for filling multiple buffers in a struct. Specifically, if either {@code vertexCapacityInput} or {@code indexCapacityInput} is 0, the runtime <b>must</b> respond as if both fields were set to 0, returning the vertex count and index count through {@code vertexCountOutput} or {@code indexCountOutput} respectively. If a view mask for the specified view isn’t available, the returned vertex and index counts <b>must</b> be 0.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRVisibilityMask XR_KHR_visibility_mask} extension <b>must</b> be enabled prior to calling #GetVisibilityMaskKHR()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
            <li>{@code visibilityMaskType} <b>must</b> be a valid {@code XrVisibilityMaskTypeKHR} value</li>
            <li>{@code visibilityMask} <b>must</b> be a pointer to an ##XrVisibilityMaskKHR structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVisibilityMaskKHR
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        XrViewConfigurationType("viewConfigurationType", "the view configuration from which to retrieve mask information."),
        uint32_t("viewIndex", "the individual view within the view configuration from which to retrieve mask information."),
        XrVisibilityMaskTypeKHR("visibilityMaskType", "the type of visibility mask requested."),
        XrVisibilityMaskKHR.p("visibilityMask", "an input/output struct which specifies the view mask.")
    )
}