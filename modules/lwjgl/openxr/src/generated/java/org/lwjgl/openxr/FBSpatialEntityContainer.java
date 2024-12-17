/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class FBSpatialEntityContainer {

    public static final int XR_FB_spatial_entity_container_SPEC_VERSION = 2;

    public static final String XR_FB_SPATIAL_ENTITY_CONTAINER_EXTENSION_NAME = "XR_FB_spatial_entity_container";

    public static final int XR_TYPE_SPACE_CONTAINER_FB = 1000199000;

    protected FBSpatialEntityContainer() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetSpaceContainerFB ] ---

    /** {@code XrResult xrGetSpaceContainerFB(XrSession session, XrSpace space, XrSpaceContainerFB * spaceContainerOutput)} */
    public static int nxrGetSpaceContainerFB(XrSession session, XrSpace space, long spaceContainerOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceContainerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), spaceContainerOutput, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceContainerFB(XrSession session, XrSpace space, XrSpaceContainerFB * spaceContainerOutput)} */
    @NativeType("XrResult")
    public static int xrGetSpaceContainerFB(XrSession session, XrSpace space, @NativeType("XrSpaceContainerFB *") XrSpaceContainerFB spaceContainerOutput) {
        return nxrGetSpaceContainerFB(session, space, spaceContainerOutput.address());
    }

}