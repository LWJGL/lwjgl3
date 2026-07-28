/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTInteractionRenderModel {

    public static final int XR_EXT_interaction_render_model_SPEC_VERSION = 1;

    public static final String XR_EXT_INTERACTION_RENDER_MODEL_EXTENSION_NAME = "XR_EXT_interaction_render_model";

    public static final int
        XR_TYPE_INTERACTION_RENDER_MODEL_IDS_ENUMERATE_INFO_EXT           = 1000301000,
        XR_TYPE_INTERACTION_RENDER_MODEL_SUBACTION_PATH_INFO_EXT          = 1000301001,
        XR_TYPE_EVENT_DATA_INTERACTION_RENDER_MODELS_CHANGED_EXT          = 1000301002,
        XR_TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT = 1000301003;

    public static final int XR_ERROR_NOT_INTERACTION_RENDER_MODEL_EXT = -1000301000;

    protected EXTInteractionRenderModel() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateInteractionRenderModelIdsEXT ] ---

    /** {@code XrResult xrEnumerateInteractionRenderModelIdsEXT(XrSession session, XrInteractionRenderModelIdsEnumerateInfoEXT const * getInfo, uint32_t renderModelIdCapacityInput, uint32_t * renderModelIdCountOutput, XrRenderModelIdEXT * renderModelIds)} */
    public static int nxrEnumerateInteractionRenderModelIdsEXT(XrSession session, long getInfo, int renderModelIdCapacityInput, long renderModelIdCountOutput, long renderModelIds) {
        long __functionAddress = session.getCapabilities().xrEnumerateInteractionRenderModelIdsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(session.address(), getInfo, renderModelIdCapacityInput, renderModelIdCountOutput, renderModelIds, __functionAddress);
    }

    /** {@code XrResult xrEnumerateInteractionRenderModelIdsEXT(XrSession session, XrInteractionRenderModelIdsEnumerateInfoEXT const * getInfo, uint32_t renderModelIdCapacityInput, uint32_t * renderModelIdCountOutput, XrRenderModelIdEXT * renderModelIds)} */
    @NativeType("XrResult")
    public static int xrEnumerateInteractionRenderModelIdsEXT(XrSession session, @NativeType("XrInteractionRenderModelIdsEnumerateInfoEXT const *") XrInteractionRenderModelIdsEnumerateInfoEXT getInfo, @NativeType("uint32_t *") IntBuffer renderModelIdCountOutput, @NativeType("XrRenderModelIdEXT *") @Nullable LongBuffer renderModelIds) {
        if (CHECKS) {
            check(renderModelIdCountOutput, 1);
        }
        return nxrEnumerateInteractionRenderModelIdsEXT(session, getInfo.address(), remainingSafe(renderModelIds), memAddress(renderModelIdCountOutput), memAddressSafe(renderModelIds));
    }

    // --- [ xrEnumerateRenderModelSubactionPathsEXT ] ---

    /** {@code XrResult xrEnumerateRenderModelSubactionPathsEXT(XrRenderModelEXT renderModel, XrInteractionRenderModelSubactionPathInfoEXT const * info, uint32_t pathCapacityInput, uint32_t * pathCountOutput, XrPath * paths)} */
    public static int nxrEnumerateRenderModelSubactionPathsEXT(XrRenderModelEXT renderModel, long info, int pathCapacityInput, long pathCountOutput, long paths) {
        long __functionAddress = renderModel.getCapabilities().xrEnumerateRenderModelSubactionPathsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(renderModel.address(), info, pathCapacityInput, pathCountOutput, paths, __functionAddress);
    }

    /** {@code XrResult xrEnumerateRenderModelSubactionPathsEXT(XrRenderModelEXT renderModel, XrInteractionRenderModelSubactionPathInfoEXT const * info, uint32_t pathCapacityInput, uint32_t * pathCountOutput, XrPath * paths)} */
    @NativeType("XrResult")
    public static int xrEnumerateRenderModelSubactionPathsEXT(XrRenderModelEXT renderModel, @NativeType("XrInteractionRenderModelSubactionPathInfoEXT const *") @Nullable XrInteractionRenderModelSubactionPathInfoEXT info, @NativeType("uint32_t *") IntBuffer pathCountOutput, @NativeType("XrPath *") @Nullable LongBuffer paths) {
        if (CHECKS) {
            check(pathCountOutput, 1);
        }
        return nxrEnumerateRenderModelSubactionPathsEXT(renderModel, memAddressSafe(info), remainingSafe(paths), memAddress(pathCountOutput), memAddressSafe(paths));
    }

    // --- [ xrGetRenderModelPoseTopLevelUserPathEXT ] ---

    /** {@code XrResult xrGetRenderModelPoseTopLevelUserPathEXT(XrRenderModelEXT renderModel, XrInteractionRenderModelTopLevelUserPathGetInfoEXT const * info, XrPath * topLevelUserPath)} */
    public static int nxrGetRenderModelPoseTopLevelUserPathEXT(XrRenderModelEXT renderModel, long info, long topLevelUserPath) {
        long __functionAddress = renderModel.getCapabilities().xrGetRenderModelPoseTopLevelUserPathEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrInteractionRenderModelTopLevelUserPathGetInfoEXT.validate(info);
        }
        return callPPPI(renderModel.address(), info, topLevelUserPath, __functionAddress);
    }

    /** {@code XrResult xrGetRenderModelPoseTopLevelUserPathEXT(XrRenderModelEXT renderModel, XrInteractionRenderModelTopLevelUserPathGetInfoEXT const * info, XrPath * topLevelUserPath)} */
    @NativeType("XrResult")
    public static int xrGetRenderModelPoseTopLevelUserPathEXT(XrRenderModelEXT renderModel, @NativeType("XrInteractionRenderModelTopLevelUserPathGetInfoEXT const *") XrInteractionRenderModelTopLevelUserPathGetInfoEXT info, @NativeType("XrPath *") LongBuffer topLevelUserPath) {
        if (CHECKS) {
            check(topLevelUserPath, 1);
        }
        return nxrGetRenderModelPoseTopLevelUserPathEXT(renderModel, info.address(), memAddress(topLevelUserPath));
    }

}