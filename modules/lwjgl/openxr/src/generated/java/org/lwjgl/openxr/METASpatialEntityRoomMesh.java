/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class METASpatialEntityRoomMesh {

    public static final int XR_META_spatial_entity_room_mesh_SPEC_VERSION = 1;

    public static final String XR_META_SPATIAL_ENTITY_ROOM_MESH_EXTENSION_NAME = "XR_META_spatial_entity_room_mesh";

    public static final int XR_SPACE_COMPONENT_TYPE_ROOM_MESH_META = 1000553000;

    public static final int
        XR_TYPE_ROOM_MESH_FACE_INDICES_META   = 1000553000,
        XR_TYPE_SPACE_ROOM_MESH_GET_INFO_META = 1000553001,
        XR_TYPE_ROOM_MESH_META                = 1000553002;

    protected METASpatialEntityRoomMesh() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetSpaceRoomMeshMETA ] ---

    /** {@code XrResult xrGetSpaceRoomMeshMETA(XrSpace space, XrSpaceRoomMeshGetInfoMETA const * getInfo, XrRoomMeshMETA * roomMeshOutput)} */
    public static int nxrGetSpaceRoomMeshMETA(XrSpace space, long getInfo, long roomMeshOutput) {
        long __functionAddress = space.getCapabilities().xrGetSpaceRoomMeshMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(space.address(), getInfo, roomMeshOutput, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceRoomMeshMETA(XrSpace space, XrSpaceRoomMeshGetInfoMETA const * getInfo, XrRoomMeshMETA * roomMeshOutput)} */
    @NativeType("XrResult")
    public static int xrGetSpaceRoomMeshMETA(XrSpace space, @NativeType("XrSpaceRoomMeshGetInfoMETA const *") XrSpaceRoomMeshGetInfoMETA getInfo, @NativeType("XrRoomMeshMETA *") XrRoomMeshMETA roomMeshOutput) {
        return nxrGetSpaceRoomMeshMETA(space, getInfo.address(), roomMeshOutput.address());
    }

    // --- [ xrGetSpaceRoomMeshFaceIndicesMETA ] ---

    /** {@code XrResult xrGetSpaceRoomMeshFaceIndicesMETA(XrSpace space, XrUuid const * faceUuid, XrRoomMeshFaceIndicesMETA * roomMeshFaceIndicesOutput)} */
    public static int nxrGetSpaceRoomMeshFaceIndicesMETA(XrSpace space, long faceUuid, long roomMeshFaceIndicesOutput) {
        long __functionAddress = space.getCapabilities().xrGetSpaceRoomMeshFaceIndicesMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(space.address(), faceUuid, roomMeshFaceIndicesOutput, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceRoomMeshFaceIndicesMETA(XrSpace space, XrUuid const * faceUuid, XrRoomMeshFaceIndicesMETA * roomMeshFaceIndicesOutput)} */
    @NativeType("XrResult")
    public static int xrGetSpaceRoomMeshFaceIndicesMETA(XrSpace space, @NativeType("XrUuid const *") XrUuid faceUuid, @NativeType("XrRoomMeshFaceIndicesMETA *") XrRoomMeshFaceIndicesMETA roomMeshFaceIndicesOutput) {
        return nxrGetSpaceRoomMeshFaceIndicesMETA(space, faceUuid.address(), roomMeshFaceIndicesOutput.address());
    }

}