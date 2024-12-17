/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class FBScene {

    public static final int XR_FB_scene_SPEC_VERSION = 4;

    public static final String XR_FB_SCENE_EXTENSION_NAME = "XR_FB_scene";

    public static final int
        XR_TYPE_SEMANTIC_LABELS_FB              = 1000175000,
        XR_TYPE_ROOM_LAYOUT_FB                  = 1000175001,
        XR_TYPE_BOUNDARY_2D_FB                  = 1000175002,
        XR_TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB = 1000175010;

    public static final int
        XR_SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB       = 0x1,
        XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB = 0x2,
        XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_INVISIBLE_WALL_FACE_BIT_FB     = 0x4;

    protected FBScene() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetSpaceBoundingBox2DFB ] ---

    /** {@code XrResult xrGetSpaceBoundingBox2DFB(XrSession session, XrSpace space, XrRect2Df * boundingBox2DOutput)} */
    public static int nxrGetSpaceBoundingBox2DFB(XrSession session, XrSpace space, long boundingBox2DOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceBoundingBox2DFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), boundingBox2DOutput, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceBoundingBox2DFB(XrSession session, XrSpace space, XrRect2Df * boundingBox2DOutput)} */
    @NativeType("XrResult")
    public static int xrGetSpaceBoundingBox2DFB(XrSession session, XrSpace space, @NativeType("XrRect2Df *") XrRect2Df boundingBox2DOutput) {
        return nxrGetSpaceBoundingBox2DFB(session, space, boundingBox2DOutput.address());
    }

    // --- [ xrGetSpaceBoundingBox3DFB ] ---

    /** {@code XrResult xrGetSpaceBoundingBox3DFB(XrSession session, XrSpace space, XrRect3DfFB * boundingBox3DOutput)} */
    public static int nxrGetSpaceBoundingBox3DFB(XrSession session, XrSpace space, long boundingBox3DOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceBoundingBox3DFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), boundingBox3DOutput, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceBoundingBox3DFB(XrSession session, XrSpace space, XrRect3DfFB * boundingBox3DOutput)} */
    @NativeType("XrResult")
    public static int xrGetSpaceBoundingBox3DFB(XrSession session, XrSpace space, @NativeType("XrRect3DfFB *") XrRect3DfFB boundingBox3DOutput) {
        return nxrGetSpaceBoundingBox3DFB(session, space, boundingBox3DOutput.address());
    }

    // --- [ xrGetSpaceSemanticLabelsFB ] ---

    /** {@code XrResult xrGetSpaceSemanticLabelsFB(XrSession session, XrSpace space, XrSemanticLabelsFB * semanticLabelsOutput)} */
    public static int nxrGetSpaceSemanticLabelsFB(XrSession session, XrSpace space, long semanticLabelsOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceSemanticLabelsFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), semanticLabelsOutput, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceSemanticLabelsFB(XrSession session, XrSpace space, XrSemanticLabelsFB * semanticLabelsOutput)} */
    @NativeType("XrResult")
    public static int xrGetSpaceSemanticLabelsFB(XrSession session, XrSpace space, @NativeType("XrSemanticLabelsFB *") XrSemanticLabelsFB semanticLabelsOutput) {
        return nxrGetSpaceSemanticLabelsFB(session, space, semanticLabelsOutput.address());
    }

    // --- [ xrGetSpaceBoundary2DFB ] ---

    /** {@code XrResult xrGetSpaceBoundary2DFB(XrSession session, XrSpace space, XrBoundary2DFB * boundary2DOutput)} */
    public static int nxrGetSpaceBoundary2DFB(XrSession session, XrSpace space, long boundary2DOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceBoundary2DFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), boundary2DOutput, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceBoundary2DFB(XrSession session, XrSpace space, XrBoundary2DFB * boundary2DOutput)} */
    @NativeType("XrResult")
    public static int xrGetSpaceBoundary2DFB(XrSession session, XrSpace space, @NativeType("XrBoundary2DFB *") XrBoundary2DFB boundary2DOutput) {
        return nxrGetSpaceBoundary2DFB(session, space, boundary2DOutput.address());
    }

    // --- [ xrGetSpaceRoomLayoutFB ] ---

    /** {@code XrResult xrGetSpaceRoomLayoutFB(XrSession session, XrSpace space, XrRoomLayoutFB * roomLayoutOutput)} */
    public static int nxrGetSpaceRoomLayoutFB(XrSession session, XrSpace space, long roomLayoutOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceRoomLayoutFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), roomLayoutOutput, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceRoomLayoutFB(XrSession session, XrSpace space, XrRoomLayoutFB * roomLayoutOutput)} */
    @NativeType("XrResult")
    public static int xrGetSpaceRoomLayoutFB(XrSession session, XrSpace space, @NativeType("XrRoomLayoutFB *") XrRoomLayoutFB roomLayoutOutput) {
        return nxrGetSpaceRoomLayoutFB(session, space, roomLayoutOutput.address());
    }

}