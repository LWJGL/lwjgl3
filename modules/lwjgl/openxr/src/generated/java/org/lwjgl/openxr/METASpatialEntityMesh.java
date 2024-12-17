/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class METASpatialEntityMesh {

    public static final int XR_META_spatial_entity_mesh_SPEC_VERSION = 1;

    public static final String XR_META_SPATIAL_ENTITY_MESH_EXTENSION_NAME = "XR_META_spatial_entity_mesh";

    public static final int XR_SPACE_COMPONENT_TYPE_TRIANGLE_MESH_META = 1000269000;

    public static final int
        XR_TYPE_SPACE_TRIANGLE_MESH_GET_INFO_META = 1000269001,
        XR_TYPE_SPACE_TRIANGLE_MESH_META          = 1000269002;

    protected METASpatialEntityMesh() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetSpaceTriangleMeshMETA ] ---

    /** {@code XrResult xrGetSpaceTriangleMeshMETA(XrSpace space, XrSpaceTriangleMeshGetInfoMETA const * getInfo, XrSpaceTriangleMeshMETA * triangleMeshOutput)} */
    public static int nxrGetSpaceTriangleMeshMETA(XrSpace space, long getInfo, long triangleMeshOutput) {
        long __functionAddress = space.getCapabilities().xrGetSpaceTriangleMeshMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(space.address(), getInfo, triangleMeshOutput, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceTriangleMeshMETA(XrSpace space, XrSpaceTriangleMeshGetInfoMETA const * getInfo, XrSpaceTriangleMeshMETA * triangleMeshOutput)} */
    @NativeType("XrResult")
    public static int xrGetSpaceTriangleMeshMETA(XrSpace space, @NativeType("XrSpaceTriangleMeshGetInfoMETA const *") XrSpaceTriangleMeshGetInfoMETA getInfo, @NativeType("XrSpaceTriangleMeshMETA *") XrSpaceTriangleMeshMETA triangleMeshOutput) {
        return nxrGetSpaceTriangleMeshMETA(space, getInfo.address(), triangleMeshOutput.address());
    }

}