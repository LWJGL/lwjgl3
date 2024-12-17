/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_scene_understanding_serialization = "MSFTSceneUnderstandingSerialization".nativeClassXR("MSFT_scene_understanding_serialization", type = "instance", postfix = "MSFT") {
    IntConstant(
        "MSFT_scene_understanding_serialization_SPEC_VERSION".."2"
    )

    StringConstant(
        "MSFT_SCENE_UNDERSTANDING_SERIALIZATION_EXTENSION_NAME".."XR_MSFT_scene_understanding_serialization"
    )

    EnumConstant(
        "TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT".."1000098000",
        "TYPE_SCENE_DESERIALIZE_INFO_MSFT".."1000098001"
    )

    EnumConstant(
        "SCENE_COMPUTE_FEATURE_SERIALIZE_SCENE_MSFT".."1000098000"
    )

    EnumConstant(
        "SCENE_COMPONENT_TYPE_SERIALIZED_SCENE_FRAGMENT_MSFT".."1000098000"
    )

    XrResult(
        "DeserializeSceneMSFT",

        XrSceneObserverMSFT("sceneObserver"),
        XrSceneDeserializeInfoMSFT.const.p("deserializeInfo")
    )

    XrResult(
        "GetSerializedSceneFragmentDataMSFT",

        XrSceneMSFT("scene"),
        XrSerializedSceneFragmentDataGetInfoMSFT.const.p("getInfo"),
        AutoSize("buffer")..uint32_t("countInput"),
        Check(1)..uint32_t.p("readOutput"),
        nullable..uint8_t.p("buffer")
    )
}