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

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_MSFT_scene_marker">XR_MSFT_scene_marker</a> extension.
 * 
 * <p>This extension enables the application to observe the tracked markers, such as the QR Code markers in <a href="https://www.iso.org/standard/62021.html">ISO/IEC 18004:2015</a>. This extension also enables future extensions to easily add new types of marker tracking.</p>
 * 
 * <p>The application <b>must</b> enable both {@link MSFTSceneMarker XR_MSFT_scene_marker} and {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} in order to use this extension.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>A typical use of this extension is:</p>
 * 
 * <ul>
 * <li>Verify if marker detection is supported by calling {@link MSFTSceneUnderstanding#xrEnumerateSceneComputeFeaturesMSFT EnumerateSceneComputeFeaturesMSFT} and validate that the returned supported features include {@link #XR_SCENE_COMPUTE_FEATURE_MARKER_MSFT SCENE_COMPUTE_FEATURE_MARKER_MSFT}.</li>
 * <li>If supported, create an {@code XrSceneObserverMSFT} handle.</li>
 * <li>Pass in {@link #XR_SCENE_COMPUTE_FEATURE_MARKER_MSFT SCENE_COMPUTE_FEATURE_MARKER_MSFT} as requested feature when starting the scene compute by calling {@link MSFTSceneUnderstanding#xrComputeNewSceneMSFT ComputeNewSceneMSFT} function.</li>
 * <li>Inspect the completion of computation by polling {@link MSFTSceneUnderstanding#xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT}.</li>
 * <li>Once compute is successfully completed, create an {@code XrSceneMSFT} handle to the result by calling {@link MSFTSceneUnderstanding#xrCreateSceneMSFT CreateSceneMSFT}.</li>
 * <li>Get the list of detected markers using {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT}:
 * 
 * <ul>
 * <li><b>optionally</b> filter the type of the returned markers using {@link XrSceneMarkerTypeFilterMSFT}.</li>
 * <li><b>optionally</b> retrieve additional marker properties by chaining {@link XrSceneMarkersMSFT} and/or {@link XrSceneMarkerQRCodesMSFT} to the next pointer of {@link XrSceneComponentsMSFT}.</li>
 * </ul>
 * </li>
 * <li>Get the data encoded in a marker using {@link #xrGetSceneMarkerDecodedStringMSFT GetSceneMarkerDecodedStringMSFT} or {@link #xrGetSceneMarkerRawDataMSFT GetSceneMarkerRawDataMSFT}.</li>
 * <li>Locate markers using {@link MSFTSceneUnderstanding#xrLocateSceneComponentsMSFT LocateSceneComponentsMSFT}.</li>
 * </ul>
 * </div>
 */
public class MSFTSceneMarker {

    /** The extension specification version. */
    public static final int XR_MSFT_scene_marker_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_MSFT_SCENE_MARKER_EXTENSION_NAME = "XR_MSFT_scene_marker";

    /** Extends {@code XrSceneComputeFeatureMSFT}. */
    public static final int XR_SCENE_COMPUTE_FEATURE_MARKER_MSFT = 1000147000;

    /** Extends {@code XrSceneComponentTypeMSFT}. */
    public static final int XR_SCENE_COMPONENT_TYPE_MARKER_MSFT = 1000147000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SCENE_MARKERS_MSFT TYPE_SCENE_MARKERS_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_MARKER_TYPE_FILTER_MSFT TYPE_SCENE_MARKER_TYPE_FILTER_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_MARKER_QR_CODES_MSFT TYPE_SCENE_MARKER_QR_CODES_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SCENE_MARKERS_MSFT            = 1000147000,
        XR_TYPE_SCENE_MARKER_TYPE_FILTER_MSFT = 1000147001,
        XR_TYPE_SCENE_MARKER_QR_CODES_MSFT    = 1000147002;

    /** Extends {@code XrResult}. */
    public static final int XR_SCENE_MARKER_DATA_NOT_STRING_MSFT = 1000147000;

    /**
     * XrSceneMarkerTypeMSFT - Marker type
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SCENE_MARKER_TYPE_QR_CODE_MSFT SCENE_MARKER_TYPE_QR_CODE_MSFT} represents a marker that follows the ISO standard for QR code in <a href="https://www.iso.org/standard/62021.html">ISO/IEC 18004:2015</a>.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSceneMarkerMSFT}, {@link XrSceneMarkerTypeFilterMSFT}</p>
     */
    public static final int XR_SCENE_MARKER_TYPE_QR_CODE_MSFT = 1;

    /**
     * XrSceneMarkerQRCodeSymbolTypeMSFT - QR Code Symbol type
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code XrSceneMarkerQRCodeSymbolTypeMSFT} identifies the symbol type of the QR Code.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE_MSFT SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE_MSFT} if the marker is a QR Code.</li>
     * <li>{@link #XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE_MSFT SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE_MSFT} if the marker is a Micro QR Code.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSceneMarkerQRCodeMSFT}</p>
     */
    public static final int
        XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE_MSFT       = 1,
        XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE_MSFT = 2;

    protected MSFTSceneMarker() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetSceneMarkerRawDataMSFT ] ---

    /**
     * Unsafe version of: {@link #xrGetSceneMarkerRawDataMSFT GetSceneMarkerRawDataMSFT}
     *
     * @param bufferCapacityInput the capacity of the buffer, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrGetSceneMarkerRawDataMSFT(XrSceneMSFT scene, long markerId, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = scene.getCapabilities().xrGetSceneMarkerRawDataMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(scene.address(), markerId, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /**
     * Get the data stored in the scene marker.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSceneMarkerRawDataMSFT GetSceneMarkerRawDataMSFT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSceneMarkerRawDataMSFT(
     *     XrSceneMSFT                                 scene,
     *     const XrUuidMSFT*                           markerId,
     *     uint32_t                                    bufferCapacityInput,
     *     uint32_t*                                   bufferCountOutput,
     *     uint8_t*                                    buffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetSceneMarkerRawDataMSFT GetSceneMarkerRawDataMSFT} function retrieves the data stored in the scene marker.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneMarker XR_MSFT_scene_marker} extension <b>must</b> be enabled prior to calling {@link #xrGetSceneMarkerRawDataMSFT GetSceneMarkerRawDataMSFT}</li>
     * <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
     * <li>{@code markerId} <b>must</b> be a pointer to a valid {@link XrUuidMSFT} structure</li>
     * <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} {@code uint8_t} values</li>
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
     * <li>{@link MSFTSceneUnderstanding#XR_ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT}</li>
     * <li>{@link MSFTSceneUnderstanding#XR_ERROR_SCENE_COMPONENT_ID_INVALID_MSFT ERROR_SCENE_COMPONENT_ID_INVALID_MSFT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrUuidMSFT}</p>
     *
     * @param scene             an {@code XrSceneMSFT} previously created by {@link MSFTSceneUnderstanding#xrCreateSceneMSFT CreateSceneMSFT}.
     * @param markerId          an {@link XrUuidMSFT} identifying the marker, and it is returned previous from {@link XrSceneComponentMSFT} when calling {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT}.
     * @param bufferCountOutput a pointer to the count of bytes written, or a pointer to the required capacity in the case that bufferCapacityInput is insufficient.
     * @param buffer            a pointer to an application-allocated buffer that will be filled with the data stored in the QR Code. It can be NULL if bufferCapacityInput is 0.
     */
    @NativeType("XrResult")
    public static int xrGetSceneMarkerRawDataMSFT(XrSceneMSFT scene, @NativeType("XrUuidMSFT const *") XrUuidMSFT markerId, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("uint8_t *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetSceneMarkerRawDataMSFT(scene, markerId.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetSceneMarkerDecodedStringMSFT ] ---

    /**
     * Unsafe version of: {@link #xrGetSceneMarkerDecodedStringMSFT GetSceneMarkerDecodedStringMSFT}
     *
     * @param bufferCapacityInput the capacity of the string buffer, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrGetSceneMarkerDecodedStringMSFT(XrSceneMSFT scene, long markerId, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = scene.getCapabilities().xrGetSceneMarkerDecodedStringMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(scene.address(), markerId, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /**
     * Get the string encoded in the scene marker.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSceneMarkerDecodedStringMSFT GetSceneMarkerDecodedStringMSFT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSceneMarkerDecodedStringMSFT(
     *     XrSceneMSFT                                 scene,
     *     const XrUuidMSFT*                           markerId,
     *     uint32_t                                    bufferCapacityInput,
     *     uint32_t*                                   bufferCountOutput,
     *     char*                                       buffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetSceneMarkerDecodedStringMSFT GetSceneMarkerDecodedStringMSFT} function retrieves the string stored in the scene marker as an UTF-8 string, including the terminating '\0'. This function follows the <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#fundamentals-buffer-size-parameters">two-call idiom</a> for filling the {@code buffer} array.</p>
     * 
     * <p>If the stored data in the marker is not an encoded string, the runtime <b>must</b> return the success code {@link #XR_SCENE_MARKER_DATA_NOT_STRING_MSFT SCENE_MARKER_DATA_NOT_STRING_MSFT}, set {@code bufferCountOutput} to 1, and make {@code buffer} an empty string.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneMarker XR_MSFT_scene_marker} extension <b>must</b> be enabled prior to calling {@link #xrGetSceneMarkerDecodedStringMSFT GetSceneMarkerDecodedStringMSFT}</li>
     * <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
     * <li>{@code markerId} <b>must</b> be a pointer to a valid {@link XrUuidMSFT} structure</li>
     * <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * <li>{@link #XR_SCENE_MARKER_DATA_NOT_STRING_MSFT SCENE_MARKER_DATA_NOT_STRING_MSFT}</li>
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
     * <li>{@link MSFTSceneUnderstanding#XR_ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT}</li>
     * <li>{@link MSFTSceneUnderstanding#XR_ERROR_SCENE_COMPONENT_ID_INVALID_MSFT ERROR_SCENE_COMPONENT_ID_INVALID_MSFT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrUuidMSFT}</p>
     *
     * @param scene             an {@code XrSceneMSFT} previously created by {@link MSFTSceneUnderstanding#xrCreateSceneMSFT CreateSceneMSFT}.
     * @param markerId          an {@link XrUuidMSFT} identifying the marker, returned previously from {@link XrSceneComponentMSFT}{@code ::id} when calling {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT}.
     * @param bufferCountOutput a pointer to the count of characters written (including the terminating '\0'), or a pointer to the required capacity in the case that bufferCapacityInput is insufficient.
     * @param buffer            a pointer to an application-allocated buffer that will be filled with the string stored in the QR Code. It can be NULL if bufferCapacityInput is 0.
     */
    @NativeType("XrResult")
    public static int xrGetSceneMarkerDecodedStringMSFT(XrSceneMSFT scene, @NativeType("XrUuidMSFT const *") XrUuidMSFT markerId, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("char *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetSceneMarkerDecodedStringMSFT(scene, markerId.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

}