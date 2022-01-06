/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_scene_understanding_serialization = "MSFTSceneUnderstandingSerialization".nativeClassXR("MSFT_scene_understanding_serialization", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_scene_understanding_serialization_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_SCENE_UNDERSTANDING_SERIALIZATION_EXTENSION_NAME".."XR_MSFT_scene_understanding_serialization"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT".."1000098000",
        "TYPE_SCENE_DESERIALIZE_INFO_MSFT".."1000098001"
    )

    EnumConstant(
        "Extends {@code XrSceneComputeFeatureMSFT}.",

        "SCENE_COMPUTE_FEATURE_SERIALIZE_SCENE_MSFT".."1000098000"
    )

    EnumConstant(
        "Extends {@code XrSceneComponentTypeMSFT}.",

        "SCENE_COMPONENT_TYPE_SERIALIZED_SCENE_FRAGMENT_MSFT".."1000098000"
    )

    XrResult(
        "DeserializeSceneMSFT",
        """
        Deserialize scene.

        <h5>C Specification</h5>
        The #DeserializeSceneMSFT() function is defined as:

        <pre><code>
￿XrResult xrDeserializeSceneMSFT(
￿    XrSceneObserverMSFT                         sceneObserver,
￿    const XrSceneDeserializeInfoMSFT*           deserializeInfo);</code></pre>

        <h5>Description</h5>
        The #DeserializeSceneMSFT() function begins deserializing a list of serialized scene fragments. The runtime <b>must</b> return quickly without waiting for the deserialization to complete. The application <b>should</b> use #GetSceneComputeStateMSFT() to inspect the completeness of the deserialization.

        The #GetSceneComputeStateMSFT() function <b>must</b> return #SCENE_COMPUTE_STATE_UPDATING_MSFT while the deserialization is in progress, and #SCENE_COMPUTE_STATE_COMPLETED_MSFT when the deserialization has completed successfully. If the runtime fails to deserialize the binary stream, #GetSceneComputeStateMSFT() <b>must</b> return #SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT to indicate that the deserialization has completed but an error occurred.

        When #GetSceneComputeStateMSFT() returns #SCENE_COMPUTE_STATE_COMPLETED_MSFT, the application <b>may</b> call #CreateSceneMSFT() to create the {@code XrSceneMSFT} handle. If #CreateSceneMSFT() is called while #GetSceneComputeStateMSFT() returns #SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT, a valid {@code XrSceneMSFT} handle <b>must</b> be returned, but that handle <b>must</b> contain zero scene components.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstandingSerialization XR_MSFT_scene_understanding_serialization} extension <b>must</b> be enabled prior to calling #DeserializeSceneMSFT()</li>
            <li>{@code sceneObserver} <b>must</b> be a valid {@code XrSceneObserverMSFT} handle</li>
            <li>{@code deserializeInfo} <b>must</b> be a pointer to a valid ##XrSceneDeserializeInfoMSFT structure</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSceneDeserializeInfoMSFT
        """,

        XrSceneObserverMSFT("sceneObserver", "a handle to an {@code XrSceneObserverMSFT} previously created with #CreateSceneObserverMSFT()."),
        XrSceneDeserializeInfoMSFT.const.p("deserializeInfo", "a pointer to an ##XrSceneDeserializeInfoMSFT structure.")
    )

    XrResult(
        "GetSerializedSceneFragmentDataMSFT",
        """
        Get serialized scene fragment data.

        <h5>C Specification</h5>
        The application <b>can</b> call the #GetSerializedSceneFragmentDataMSFT() function to read the binary data of a serialized scene fragment from the {@code XrSceneMSFT} handle. This function follows the two-call idiom for filling the buffer.

        The #GetSerializedSceneFragmentDataMSFT() function is defined as:

        <pre><code>
￿XrResult xrGetSerializedSceneFragmentDataMSFT(
￿    XrSceneMSFT                                 scene,
￿    const XrSerializedSceneFragmentDataGetInfoMSFT* getInfo,
￿    uint32_t                                    countInput,
￿    uint32_t*                                   readOutput,
￿    uint8_t*                                    buffer);</code></pre>

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_SCENE_COMPONENT_ID_INVALID_MSFT if the given scene fragment ##XrUuidMSFT was not found.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstandingSerialization XR_MSFT_scene_understanding_serialization} extension <b>must</b> be enabled prior to calling #GetSerializedSceneFragmentDataMSFT()</li>
            <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrSerializedSceneFragmentDataGetInfoMSFT structure</li>
            <li>{@code readOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code countInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code countInput} {@code uint8_t} values</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSerializedSceneFragmentDataGetInfoMSFT
        """,

        XrSceneMSFT("scene", "the {@code XrSceneMSFT} handle to read from."),
        XrSerializedSceneFragmentDataGetInfoMSFT.const.p("getInfo", "a pointer to an ##XrSerializedSceneFragmentDataGetInfoMSFT structure."),
        AutoSize("buffer")..uint32_t("countInput", "the number of bytes that should be read."),
        Check(1)..uint32_t.p("readOutput", "the number of bytes read."),
        nullable..uint8_t.p("buffer", "a pointer to the buffer where the data should be copied.")
    )
}