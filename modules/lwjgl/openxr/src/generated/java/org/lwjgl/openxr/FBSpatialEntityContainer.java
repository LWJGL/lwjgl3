/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_spatial_entity_container">XR_FB_spatial_entity_container</a> extension.
 * 
 * <p>This extension expands on the concept of spatial entities to include a way for one spatial entity to contain multiple child spatial entities, forming a hierarchy.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public class FBSpatialEntityContainer {

    /** The extension specification version. */
    public static final int XR_FB_spatial_entity_container_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_FB_SPATIAL_ENTITY_CONTAINER_EXTENSION_NAME = "XR_FB_spatial_entity_container";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_SPACE_CONTAINER_FB = 1000199000;

    protected FBSpatialEntityContainer() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetSpaceContainerFB ] ---

    /** Unsafe version of: {@link #xrGetSpaceContainerFB GetSpaceContainerFB} */
    public static int nxrGetSpaceContainerFB(XrSession session, XrSpace space, long spaceContainerOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceContainerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), spaceContainerOutput, __functionAddress);
    }

    /**
     * Gets a XrSpaceContainerFB which lists contained spaces.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpaceContainerFB GetSpaceContainerFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpaceContainerFB(
     *     XrSession                                   session,
     *     XrSpace                                     space,
     *     XrSpaceContainerFB*                         spaceContainerOutput);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetSpaceContainerFB GetSpaceContainerFB} function is used by an application to perform the two calls required to obtain information about which spatial entities are contained by a specified spatial entity.</p>
     * 
     * <p>The {@link FBSpatialEntity#XR_SPACE_COMPONENT_TYPE_SPACE_CONTAINER_FB SPACE_COMPONENT_TYPE_SPACE_CONTAINER_FB} component type <b>must</b> be enabled, otherwise this function will return {@link FBSpatialEntity#XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB ERROR_SPACE_COMPONENT_NOT_ENABLED_FB}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntityContainer XR_FB_spatial_entity_container} extension <b>must</b> be enabled prior to calling {@link #xrGetSpaceContainerFB GetSpaceContainerFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code spaceContainerOutput} <b>must</b> be a pointer to an {@link XrSpaceContainerFB} structure</li>
     * <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
     * <li>{@link FBSpatialEntity#XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB ERROR_SPACE_COMPONENT_NOT_ENABLED_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceContainerFB}</p>
     *
     * @param session              a handle to an {@code XrSession}.
     * @param space                a handle to an {@code XrSpace}.
     * @param spaceContainerOutput the output parameter that points to an {@link XrSpaceContainerFB} containing information about which spaces are contained by {@code space}.
     */
    @NativeType("XrResult")
    public static int xrGetSpaceContainerFB(XrSession session, XrSpace space, @NativeType("XrSpaceContainerFB *") XrSpaceContainerFB spaceContainerOutput) {
        return nxrGetSpaceContainerFB(session, space, spaceContainerOutput.address());
    }

}