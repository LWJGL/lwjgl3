/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTRenderModel {

    public static final int XR_EXT_render_model_SPEC_VERSION = 1;

    public static final String XR_EXT_RENDER_MODEL_EXTENSION_NAME = "XR_EXT_render_model";

    public static final int XR_NULL_RENDER_MODEL_ID_EXT = 0;

    public static final int XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT = 64;

    public static final int
        XR_OBJECT_TYPE_RENDER_MODEL_EXT       = 1000300000,
        XR_OBJECT_TYPE_RENDER_MODEL_ASSET_EXT = 1000300001;

    public static final int
        XR_TYPE_RENDER_MODEL_CREATE_INFO_EXT               = 1000300000,
        XR_TYPE_RENDER_MODEL_PROPERTIES_GET_INFO_EXT       = 1000300001,
        XR_TYPE_RENDER_MODEL_PROPERTIES_EXT                = 1000300002,
        XR_TYPE_RENDER_MODEL_SPACE_CREATE_INFO_EXT         = 1000300003,
        XR_TYPE_RENDER_MODEL_STATE_GET_INFO_EXT            = 1000300004,
        XR_TYPE_RENDER_MODEL_STATE_EXT                     = 1000300005,
        XR_TYPE_RENDER_MODEL_ASSET_CREATE_INFO_EXT         = 1000300006,
        XR_TYPE_RENDER_MODEL_ASSET_DATA_GET_INFO_EXT       = 1000300007,
        XR_TYPE_RENDER_MODEL_ASSET_DATA_EXT                = 1000300008,
        XR_TYPE_RENDER_MODEL_ASSET_PROPERTIES_GET_INFO_EXT = 1000300009,
        XR_TYPE_RENDER_MODEL_ASSET_PROPERTIES_EXT          = 1000300010;

    public static final int
        XR_ERROR_RENDER_MODEL_ID_INVALID_EXT              = -1000300000,
        XR_ERROR_RENDER_MODEL_ASSET_UNAVAILABLE_EXT       = -1000300001,
        XR_ERROR_RENDER_MODEL_GLTF_EXTENSION_REQUIRED_EXT = -1000300002;

    protected EXTRenderModel() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateRenderModelEXT ] ---

    /** {@code XrResult xrCreateRenderModelEXT(XrSession session, XrRenderModelCreateInfoEXT const * createInfo, XrRenderModelEXT * renderModel)} */
    public static int nxrCreateRenderModelEXT(XrSession session, long createInfo, long renderModel) {
        long __functionAddress = session.getCapabilities().xrCreateRenderModelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, renderModel, __functionAddress);
    }

    /** {@code XrResult xrCreateRenderModelEXT(XrSession session, XrRenderModelCreateInfoEXT const * createInfo, XrRenderModelEXT * renderModel)} */
    @NativeType("XrResult")
    public static int xrCreateRenderModelEXT(XrSession session, @NativeType("XrRenderModelCreateInfoEXT const *") XrRenderModelCreateInfoEXT createInfo, @NativeType("XrRenderModelEXT *") PointerBuffer renderModel) {
        if (CHECKS) {
            check(renderModel, 1);
        }
        return nxrCreateRenderModelEXT(session, createInfo.address(), memAddress(renderModel));
    }

    // --- [ xrDestroyRenderModelEXT ] ---

    /** {@code XrResult xrDestroyRenderModelEXT(XrRenderModelEXT renderModel)} */
    @NativeType("XrResult")
    public static int xrDestroyRenderModelEXT(XrRenderModelEXT renderModel) {
        long __functionAddress = renderModel.getCapabilities().xrDestroyRenderModelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(renderModel.address(), __functionAddress);
    }

    // --- [ xrGetRenderModelPropertiesEXT ] ---

    /** {@code XrResult xrGetRenderModelPropertiesEXT(XrRenderModelEXT renderModel, XrRenderModelPropertiesGetInfoEXT const * getInfo, XrRenderModelPropertiesEXT * properties)} */
    public static int nxrGetRenderModelPropertiesEXT(XrRenderModelEXT renderModel, long getInfo, long properties) {
        long __functionAddress = renderModel.getCapabilities().xrGetRenderModelPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(renderModel.address(), getInfo, properties, __functionAddress);
    }

    /** {@code XrResult xrGetRenderModelPropertiesEXT(XrRenderModelEXT renderModel, XrRenderModelPropertiesGetInfoEXT const * getInfo, XrRenderModelPropertiesEXT * properties)} */
    @NativeType("XrResult")
    public static int xrGetRenderModelPropertiesEXT(XrRenderModelEXT renderModel, @NativeType("XrRenderModelPropertiesGetInfoEXT const *") @Nullable XrRenderModelPropertiesGetInfoEXT getInfo, @NativeType("XrRenderModelPropertiesEXT *") XrRenderModelPropertiesEXT properties) {
        return nxrGetRenderModelPropertiesEXT(renderModel, memAddressSafe(getInfo), properties.address());
    }

    // --- [ xrCreateRenderModelSpaceEXT ] ---

    /** {@code XrResult xrCreateRenderModelSpaceEXT(XrSession session, XrRenderModelSpaceCreateInfoEXT const * createInfo, XrSpace * space)} */
    public static int nxrCreateRenderModelSpaceEXT(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateRenderModelSpaceEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrRenderModelSpaceCreateInfoEXT.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /** {@code XrResult xrCreateRenderModelSpaceEXT(XrSession session, XrRenderModelSpaceCreateInfoEXT const * createInfo, XrSpace * space)} */
    @NativeType("XrResult")
    public static int xrCreateRenderModelSpaceEXT(XrSession session, @NativeType("XrRenderModelSpaceCreateInfoEXT const *") XrRenderModelSpaceCreateInfoEXT createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateRenderModelSpaceEXT(session, createInfo.address(), memAddress(space));
    }

    // --- [ xrCreateRenderModelAssetEXT ] ---

    /** {@code XrResult xrCreateRenderModelAssetEXT(XrSession session, XrRenderModelAssetCreateInfoEXT const * createInfo, XrRenderModelAssetEXT * asset)} */
    public static int nxrCreateRenderModelAssetEXT(XrSession session, long createInfo, long asset) {
        long __functionAddress = session.getCapabilities().xrCreateRenderModelAssetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, asset, __functionAddress);
    }

    /** {@code XrResult xrCreateRenderModelAssetEXT(XrSession session, XrRenderModelAssetCreateInfoEXT const * createInfo, XrRenderModelAssetEXT * asset)} */
    @NativeType("XrResult")
    public static int xrCreateRenderModelAssetEXT(XrSession session, @NativeType("XrRenderModelAssetCreateInfoEXT const *") XrRenderModelAssetCreateInfoEXT createInfo, @NativeType("XrRenderModelAssetEXT *") PointerBuffer asset) {
        if (CHECKS) {
            check(asset, 1);
        }
        return nxrCreateRenderModelAssetEXT(session, createInfo.address(), memAddress(asset));
    }

    // --- [ xrDestroyRenderModelAssetEXT ] ---

    /** {@code XrResult xrDestroyRenderModelAssetEXT(XrRenderModelAssetEXT asset)} */
    @NativeType("XrResult")
    public static int xrDestroyRenderModelAssetEXT(XrRenderModelAssetEXT asset) {
        long __functionAddress = asset.getCapabilities().xrDestroyRenderModelAssetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(asset.address(), __functionAddress);
    }

    // --- [ xrGetRenderModelAssetDataEXT ] ---

    /** {@code XrResult xrGetRenderModelAssetDataEXT(XrRenderModelAssetEXT asset, XrRenderModelAssetDataGetInfoEXT const * getInfo, XrRenderModelAssetDataEXT * buffer)} */
    public static int nxrGetRenderModelAssetDataEXT(XrRenderModelAssetEXT asset, long getInfo, long buffer) {
        long __functionAddress = asset.getCapabilities().xrGetRenderModelAssetDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(asset.address(), getInfo, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetRenderModelAssetDataEXT(XrRenderModelAssetEXT asset, XrRenderModelAssetDataGetInfoEXT const * getInfo, XrRenderModelAssetDataEXT * buffer)} */
    @NativeType("XrResult")
    public static int xrGetRenderModelAssetDataEXT(XrRenderModelAssetEXT asset, @NativeType("XrRenderModelAssetDataGetInfoEXT const *") @Nullable XrRenderModelAssetDataGetInfoEXT getInfo, @NativeType("XrRenderModelAssetDataEXT *") XrRenderModelAssetDataEXT buffer) {
        return nxrGetRenderModelAssetDataEXT(asset, memAddressSafe(getInfo), buffer.address());
    }

    // --- [ xrGetRenderModelAssetPropertiesEXT ] ---

    /** {@code XrResult xrGetRenderModelAssetPropertiesEXT(XrRenderModelAssetEXT asset, XrRenderModelAssetPropertiesGetInfoEXT const * getInfo, XrRenderModelAssetPropertiesEXT * properties)} */
    public static int nxrGetRenderModelAssetPropertiesEXT(XrRenderModelAssetEXT asset, long getInfo, long properties) {
        long __functionAddress = asset.getCapabilities().xrGetRenderModelAssetPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(asset.address(), getInfo, properties, __functionAddress);
    }

    /** {@code XrResult xrGetRenderModelAssetPropertiesEXT(XrRenderModelAssetEXT asset, XrRenderModelAssetPropertiesGetInfoEXT const * getInfo, XrRenderModelAssetPropertiesEXT * properties)} */
    @NativeType("XrResult")
    public static int xrGetRenderModelAssetPropertiesEXT(XrRenderModelAssetEXT asset, @NativeType("XrRenderModelAssetPropertiesGetInfoEXT const *") @Nullable XrRenderModelAssetPropertiesGetInfoEXT getInfo, @NativeType("XrRenderModelAssetPropertiesEXT *") XrRenderModelAssetPropertiesEXT properties) {
        return nxrGetRenderModelAssetPropertiesEXT(asset, memAddressSafe(getInfo), properties.address());
    }

    // --- [ xrGetRenderModelStateEXT ] ---

    /** {@code XrResult xrGetRenderModelStateEXT(XrRenderModelEXT renderModel, XrRenderModelStateGetInfoEXT const * getInfo, XrRenderModelStateEXT * state)} */
    public static int nxrGetRenderModelStateEXT(XrRenderModelEXT renderModel, long getInfo, long state) {
        long __functionAddress = renderModel.getCapabilities().xrGetRenderModelStateEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(renderModel.address(), getInfo, state, __functionAddress);
    }

    /** {@code XrResult xrGetRenderModelStateEXT(XrRenderModelEXT renderModel, XrRenderModelStateGetInfoEXT const * getInfo, XrRenderModelStateEXT * state)} */
    @NativeType("XrResult")
    public static int xrGetRenderModelStateEXT(XrRenderModelEXT renderModel, @NativeType("XrRenderModelStateGetInfoEXT const *") XrRenderModelStateGetInfoEXT getInfo, @NativeType("XrRenderModelStateEXT *") XrRenderModelStateEXT state) {
        return nxrGetRenderModelStateEXT(renderModel, getInfo.address(), state.address());
    }

}