/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_scene_marker = "MSFTSceneMarker".nativeClassXR("MSFT_scene_marker", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_MSFT_scene_marker">XR_MSFT_scene_marker</a> extension.

        This extension enables the application to observe the tracked markers, such as the QR Code markers in {uri-iso-iec-18004-2015}[ISO/IEC 18004:2015]. This extension also enables future extensions to easily add new types of marker tracking.

        The application <b>must</b> enable both {@link MSFTSceneMarker XR_MSFT_scene_marker} and {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} in order to use this extension.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        A typical use of this extension is:

        <ul>
            <li>Verify if marker detection is supported by calling #EnumerateSceneComputeFeaturesMSFT() and validate that the returned supported features include #SCENE_COMPUTE_FEATURE_MARKER_MSFT.</li>
            <li>If supported, create an {@code XrSceneObserverMSFT} handle.</li>
            <li>Pass in #SCENE_COMPUTE_FEATURE_MARKER_MSFT as requested feature when starting the scene compute by calling #ComputeNewSceneMSFT() function.</li>
            <li>Inspect the completion of computation by polling #GetSceneComputeStateMSFT().</li>
            <li>Once compute is successfully completed, create an {@code XrSceneMSFT} handle to the result by calling #CreateSceneMSFT().</li>
            <li>
                Get the list of detected markers using #GetSceneComponentsMSFT():
                <ul>
                    <li><b>optionally</b> filter the type of the returned markers using ##XrSceneMarkerTypeFilterMSFT.</li>
                    <li><b>optionally</b> retrieve additional marker properties by chaining ##XrSceneMarkersMSFT and/or ##XrSceneMarkerQRCodesMSFT to the next pointer of ##XrSceneComponentsMSFT.</li>
                </ul>
            </li>
            <li>Get the data encoded in a marker using #GetSceneMarkerDecodedStringMSFT() or #GetSceneMarkerRawDataMSFT().</li>
            <li>Locate markers using #LocateSceneComponentsMSFT().</li>
        </ul>
        </div>
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_scene_marker_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_SCENE_MARKER_EXTENSION_NAME".."XR_MSFT_scene_marker"
    )

    EnumConstant(
        "Extends {@code XrSceneComputeFeatureMSFT}.",

        "SCENE_COMPUTE_FEATURE_MARKER_MSFT".."1000147000"
    )

    EnumConstant(
        "Extends {@code XrSceneComponentTypeMSFT}.",

        "SCENE_COMPONENT_TYPE_MARKER_MSFT".."1000147000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SCENE_MARKERS_MSFT".."1000147000",
        "TYPE_SCENE_MARKER_TYPE_FILTER_MSFT".."1000147001",
        "TYPE_SCENE_MARKER_QR_CODES_MSFT".."1000147002"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "SCENE_MARKER_DATA_NOT_STRING_MSFT".."1000147000"
    )

    EnumConstant(
        """
        XrSceneMarkerTypeMSFT - Marker type

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SCENE_MARKER_TYPE_QR_CODE_MSFT represents a marker that follows the ISO standard for QR code in {uri-iso-iec-18004-2015}[ISO/IEC 18004:2015].</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneMarkerMSFT, ##XrSceneMarkerTypeFilterMSFT
        """,

        "SCENE_MARKER_TYPE_QR_CODE_MSFT".."1"
    )

    EnumConstant(
        """
        XrSceneMarkerQRCodeSymbolTypeMSFT - QR Code Symbol type

        <h5>Description</h5>
        The {@code XrSceneMarkerQRCodeSymbolTypeMSFT} identifies the symbol type of the QR Code.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE_MSFT if the marker is a QR Code.</li>
            <li>#SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE_MSFT if the marker is a Micro QR Code.</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneMarkerQRCodeMSFT
        """,

        "SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE_MSFT".."1",
        "SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE_MSFT".."2"
    )

    XrResult(
        "GetSceneMarkerRawDataMSFT",
        """
        Get the data stored in the scene marker.

        <h5>C Specification</h5>
        The #GetSceneMarkerRawDataMSFT() function is defined as:

        <pre><code>
￿XrResult xrGetSceneMarkerRawDataMSFT(
￿    XrSceneMSFT                                 scene,
￿    const XrUuidMSFT*                           markerId,
￿    uint32_t                                    bufferCapacityInput,
￿    uint32_t*                                   bufferCountOutput,
￿    uint8_t*                                    buffer);</code></pre>

        <h5>Description</h5>
        The #GetSceneMarkerRawDataMSFT() function retrieves the data stored in the scene marker.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneMarker XR_MSFT_scene_marker} extension <b>must</b> be enabled prior to calling #GetSceneMarkerRawDataMSFT()</li>
            <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
            <li>{@code markerId} <b>must</b> be a pointer to a valid ##XrUuidMSFT structure</li>
            <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} {@code uint8_t} values</li>
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
                <li>#ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT</li>
                <li>#ERROR_SCENE_COMPONENT_ID_INVALID_MSFT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrUuidMSFT
        """,

        XrSceneMSFT("scene", "an {@code XrSceneMSFT} previously created by #CreateSceneMSFT()."),
        XrUuidMSFT.const.p("markerId", "an ##XrUuidMSFT identifying the marker, and it is returned previous from ##XrSceneComponentMSFT when calling #GetSceneComponentsMSFT()."),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", "the capacity of the buffer, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("bufferCountOutput", "a pointer to the count of bytes written, or a pointer to the required capacity in the case that bufferCapacityInput is insufficient."),
        nullable..uint8_t.p("buffer", "a pointer to an application-allocated buffer that will be filled with the data stored in the QR Code. It can be NULL if bufferCapacityInput is 0.")
    )

    XrResult(
        "GetSceneMarkerDecodedStringMSFT",
        """
        Get the string encoded in the scene marker.

        <h5>C Specification</h5>
        The #GetSceneMarkerDecodedStringMSFT() function is defined as:

        <pre><code>
￿XrResult xrGetSceneMarkerDecodedStringMSFT(
￿    XrSceneMSFT                                 scene,
￿    const XrUuidMSFT*                           markerId,
￿    uint32_t                                    bufferCapacityInput,
￿    uint32_t*                                   bufferCountOutput,
￿    char*                                       buffer);</code></pre>

        <h5>Description</h5>
        The #GetSceneMarkerDecodedStringMSFT() function retrieves the string stored in the scene marker as an UTF-8 string, including the terminating '\0'. This function follows the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#buffer-size-parameters">two-call idiom</a> for filling the {@code buffer} array.

        If the stored data in the marker is not an encoded string, the runtime <b>must</b> return the success code #SCENE_MARKER_DATA_NOT_STRING_MSFT, set {@code bufferCountOutput} to 1, and make {@code buffer} an empty string.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneMarker XR_MSFT_scene_marker} extension <b>must</b> be enabled prior to calling #GetSceneMarkerDecodedStringMSFT()</li>
            <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
            <li>{@code markerId} <b>must</b> be a pointer to a valid ##XrUuidMSFT structure</li>
            <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
                <li>#SCENE_MARKER_DATA_NOT_STRING_MSFT</li>
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
                <li>#ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT</li>
                <li>#ERROR_SCENE_COMPONENT_ID_INVALID_MSFT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrUuidMSFT
        """,

        XrSceneMSFT("scene", "an {@code XrSceneMSFT} previously created by #CreateSceneMSFT()."),
        XrUuidMSFT.const.p("markerId", "an ##XrUuidMSFT identifying the marker, returned previously from ##XrSceneComponentMSFT{@code ::id} when calling #GetSceneComponentsMSFT()."),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", "the capacity of the string buffer, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("bufferCountOutput", "a pointer to the count of characters written (including the terminating '\\0'), or a pointer to the required capacity in the case that bufferCapacityInput is insufficient."),
        nullable..char.p("buffer", "a pointer to an application-allocated buffer that will be filled with the string stored in the QR Code. It can be NULL if bufferCapacityInput is 0.")
    )
}