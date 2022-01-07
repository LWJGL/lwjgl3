/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The MSFT_scene_understanding_serialization extension. */
public class MSFTSceneUnderstandingSerialization {

    /** The extension specification version. */
    public static final int XR_MSFT_scene_understanding_serialization_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_MSFT_SCENE_UNDERSTANDING_SERIALIZATION_EXTENSION_NAME = "XR_MSFT_scene_understanding_serialization";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_DESERIALIZE_INFO_MSFT TYPE_SCENE_DESERIALIZE_INFO_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT = 1000098000,
        XR_TYPE_SCENE_DESERIALIZE_INFO_MSFT                  = 1000098001;

    /** Extends {@code XrSceneComputeFeatureMSFT}. */
    public static final int XR_SCENE_COMPUTE_FEATURE_SERIALIZE_SCENE_MSFT = 1000098000;

    /** Extends {@code XrSceneComponentTypeMSFT}. */
    public static final int XR_SCENE_COMPONENT_TYPE_SERIALIZED_SCENE_FRAGMENT_MSFT = 1000098000;

    protected MSFTSceneUnderstandingSerialization() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrDeserializeSceneMSFT ] ---

    /** Unsafe version of: {@link #xrDeserializeSceneMSFT DeserializeSceneMSFT} */
    public static int nxrDeserializeSceneMSFT(XrSceneObserverMSFT sceneObserver, long deserializeInfo) {
        long __functionAddress = sceneObserver.getCapabilities().xrDeserializeSceneMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(sceneObserver.address(), deserializeInfo, __functionAddress);
    }

    /**
     * Deserialize scene.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDeserializeSceneMSFT DeserializeSceneMSFT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDeserializeSceneMSFT(
     *     XrSceneObserverMSFT                         sceneObserver,
     *     const XrSceneDeserializeInfoMSFT*           deserializeInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrDeserializeSceneMSFT DeserializeSceneMSFT} function begins deserializing a list of serialized scene fragments. The runtime <b>must</b> return quickly without waiting for the deserialization to complete. The application <b>should</b> use {@link MSFTSceneUnderstanding#xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT} to inspect the completeness of the deserialization.</p>
     * 
     * <p>The {@link MSFTSceneUnderstanding#xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT} function <b>must</b> return {@link MSFTSceneUnderstanding#XR_SCENE_COMPUTE_STATE_UPDATING_MSFT SCENE_COMPUTE_STATE_UPDATING_MSFT} while the deserialization is in progress, and {@link MSFTSceneUnderstanding#XR_SCENE_COMPUTE_STATE_COMPLETED_MSFT SCENE_COMPUTE_STATE_COMPLETED_MSFT} when the deserialization has completed successfully. If the runtime fails to deserialize the binary stream, {@link MSFTSceneUnderstanding#xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT} <b>must</b> return {@link MSFTSceneUnderstanding#XR_SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT} to indicate that the deserialization has completed but an error occurred.</p>
     * 
     * <p>When {@link MSFTSceneUnderstanding#xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT} returns {@link MSFTSceneUnderstanding#XR_SCENE_COMPUTE_STATE_COMPLETED_MSFT SCENE_COMPUTE_STATE_COMPLETED_MSFT}, the application <b>may</b> call {@link MSFTSceneUnderstanding#xrCreateSceneMSFT CreateSceneMSFT} to create the {@code XrSceneMSFT} handle. If {@link MSFTSceneUnderstanding#xrCreateSceneMSFT CreateSceneMSFT} is called while {@link MSFTSceneUnderstanding#xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT} returns {@link MSFTSceneUnderstanding#XR_SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT}, a valid {@code XrSceneMSFT} handle <b>must</b> be returned, but that handle <b>must</b> contain zero scene components.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstandingSerialization XR_MSFT_scene_understanding_serialization} extension <b>must</b> be enabled prior to calling {@link #xrDeserializeSceneMSFT DeserializeSceneMSFT}</li>
     * <li>{@code sceneObserver} <b>must</b> be a valid {@code XrSceneObserverMSFT} handle</li>
     * <li>{@code deserializeInfo} <b>must</b> be a pointer to a valid {@link XrSceneDeserializeInfoMSFT} structure</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSceneDeserializeInfoMSFT}</p>
     *
     * @param sceneObserver   a handle to an {@code XrSceneObserverMSFT} previously created with {@link MSFTSceneUnderstanding#xrCreateSceneObserverMSFT CreateSceneObserverMSFT}.
     * @param deserializeInfo a pointer to an {@link XrSceneDeserializeInfoMSFT} structure.
     */
    @NativeType("XrResult")
    public static int xrDeserializeSceneMSFT(XrSceneObserverMSFT sceneObserver, @NativeType("XrSceneDeserializeInfoMSFT const *") XrSceneDeserializeInfoMSFT deserializeInfo) {
        return nxrDeserializeSceneMSFT(sceneObserver, deserializeInfo.address());
    }

    // --- [ xrGetSerializedSceneFragmentDataMSFT ] ---

    /**
     * Unsafe version of: {@link #xrGetSerializedSceneFragmentDataMSFT GetSerializedSceneFragmentDataMSFT}
     *
     * @param countInput the number of bytes that should be read.
     */
    public static int nxrGetSerializedSceneFragmentDataMSFT(XrSceneMSFT scene, long getInfo, int countInput, long readOutput, long buffer) {
        long __functionAddress = scene.getCapabilities().xrGetSerializedSceneFragmentDataMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(scene.address(), getInfo, countInput, readOutput, buffer, __functionAddress);
    }

    /**
     * Get serialized scene fragment data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application <b>can</b> call the {@link #xrGetSerializedSceneFragmentDataMSFT GetSerializedSceneFragmentDataMSFT} function to read the binary data of a serialized scene fragment from the {@code XrSceneMSFT} handle. This function follows the two-call idiom for filling the buffer.</p>
     * 
     * <p>The {@link #xrGetSerializedSceneFragmentDataMSFT GetSerializedSceneFragmentDataMSFT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSerializedSceneFragmentDataMSFT(
     *     XrSceneMSFT                                 scene,
     *     const XrSerializedSceneFragmentDataGetInfoMSFT* getInfo,
     *     uint32_t                                    countInput,
     *     uint32_t*                                   readOutput,
     *     uint8_t*                                    buffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The runtime <b>must</b> return {@link MSFTSceneUnderstanding#XR_ERROR_SCENE_COMPONENT_ID_INVALID_MSFT ERROR_SCENE_COMPONENT_ID_INVALID_MSFT} if the given scene fragment {@link XrUuidMSFT} was not found.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstandingSerialization XR_MSFT_scene_understanding_serialization} extension <b>must</b> be enabled prior to calling {@link #xrGetSerializedSceneFragmentDataMSFT GetSerializedSceneFragmentDataMSFT}</li>
     * <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrSerializedSceneFragmentDataGetInfoMSFT} structure</li>
     * <li>{@code readOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code countInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code countInput} {@code uint8_t} values</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSerializedSceneFragmentDataGetInfoMSFT}</p>
     *
     * @param scene      the {@code XrSceneMSFT} handle to read from.
     * @param getInfo    a pointer to an {@link XrSerializedSceneFragmentDataGetInfoMSFT} structure.
     * @param readOutput the number of bytes read.
     * @param buffer     a pointer to the buffer where the data should be copied.
     */
    @NativeType("XrResult")
    public static int xrGetSerializedSceneFragmentDataMSFT(XrSceneMSFT scene, @NativeType("XrSerializedSceneFragmentDataGetInfoMSFT const *") XrSerializedSceneFragmentDataGetInfoMSFT getInfo, @NativeType("uint32_t *") IntBuffer readOutput, @Nullable @NativeType("uint8_t *") ByteBuffer buffer) {
        if (CHECKS) {
            check(readOutput, 1);
        }
        return nxrGetSerializedSceneFragmentDataMSFT(scene, getInfo.address(), remainingSafe(buffer), memAddress(readOutput), memAddressSafe(buffer));
    }

}