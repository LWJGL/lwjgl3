/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_container = "FBSpatialEntityContainer".nativeClassXR("FB_spatial_entity_container", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_spatial_entity_container">XR_FB_spatial_entity_container</a> extension.

        This extension expands on the concept of spatial entities to include a way for one spatial entity to contain multiple child spatial entities, forming a hierarchy.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_spatial_entity_container_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "FB_SPATIAL_ENTITY_CONTAINER_EXTENSION_NAME".."XR_FB_spatial_entity_container"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPACE_CONTAINER_FB".."1000199000"
    )

    XrResult(
        "GetSpaceContainerFB",
        """
        Gets a XrSpaceContainerFB which lists contained spaces.

        <h5>C Specification</h5>
        The #GetSpaceContainerFB() function is defined as:

        <pre><code>
￿XrResult xrGetSpaceContainerFB(
￿    XrSession                                   session,
￿    XrSpace                                     space,
￿    XrSpaceContainerFB*                         spaceContainerOutput);</code></pre>

        <h5>Description</h5>
        The #GetSpaceContainerFB() function is used by an application to perform the two calls required to obtain information about which spatial entities are contained by a specified spatial entity.

        The #SPACE_COMPONENT_TYPE_SPACE_CONTAINER_FB component type <b>must</b> be enabled, otherwise this function will return #ERROR_SPACE_COMPONENT_NOT_ENABLED_FB.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityContainer XR_FB_spatial_entity_container} extension <b>must</b> be enabled prior to calling #GetSpaceContainerFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code spaceContainerOutput} <b>must</b> be a pointer to an ##XrSpaceContainerFB structure</li>
            <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
                <li>#ERROR_SPACE_COMPONENT_NOT_ENABLED_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpaceContainerFB
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpace("space", "a handle to an {@code XrSpace}."),
        XrSpaceContainerFB.p("spaceContainerOutput", "the output parameter that points to an ##XrSpaceContainerFB containing information about which spaces are contained by {@code space}.")
    )
}