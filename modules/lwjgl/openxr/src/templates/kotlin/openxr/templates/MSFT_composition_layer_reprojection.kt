/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_composition_layer_reprojection = "MSFTCompositionLayerReprojection".nativeClassXR("MSFT_composition_layer_reprojection", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_composition_layer_reprojection_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_COMPOSITION_LAYER_REPROJECTION_EXTENSION_NAME".."XR_MSFT_composition_layer_reprojection"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT".."1000066000",
        "TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT".."1000066001"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT".."-1000066000"
    )

    EnumConstant(
        """
        XrReprojectionModeMSFT - Describes the reprojection mode of a composition layer

        <h5>Description</h5>
        <ul>
            <li>#REPROJECTION_MODE_DEPTH_MSFT indicates the corresponding layer <b>may</b> benefit from per-pixel depth reprojection provided by ##XrCompositionLayerDepthInfoKHR to the projection layer. This mode is typically used for world-locked content that should remain physically stationary as the user walks around.</li>
            <li>#REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT indicates the corresponding layer <b>may</b> benefit from planar reprojection and the plane <b>can</b> be calculated from the corresponding depth information provided by ##XrCompositionLayerDepthInfoKHR to the projection layer. This mode works better when the application knows the content is mostly placed on a plane.</li>
            <li>#REPROJECTION_MODE_PLANAR_MANUAL_MSFT indicates that the corresponding layer <b>may</b> benefit from planar reprojection. The application <b>can</b> customize the plane by chaining an ##XrCompositionLayerReprojectionPlaneOverrideMSFT structure to the same layer. The app <b>can</b> also omit the plane override, indicating the runtime should use the default reprojection plane settings. This mode works better when the application knows the content is mostly placed on a plane, or when it cannot afford to submit depth information.</li>
            <li>#REPROJECTION_MODE_ORIENTATION_ONLY_MSFT indicates the layer should be stabilized only for changes to orientation, ignoring positional changes. This mode works better for body-locked content that should follow the user as they walk around, such as 360-degree video.</li>
        </ul>

        When the application passes #REPROJECTION_MODE_DEPTH_MSFT or #REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT mode, it <b>should</b> also provide the depth buffer for the corresponding layer using ##XrCompositionLayerDepthInfoKHR in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#XR_KHR_composition_layer_depth">XR_KHR_composition_layer_depth</a> extension. However, if the application does not submit this depth buffer, the runtime <b>must</b> apply a runtime defined fallback reprojection mode, and <b>must</b> not fail the #EndFrame() function because of this missing depth.

        When the application passes #REPROJECTION_MODE_PLANAR_MANUAL_MSFT or #REPROJECTION_MODE_ORIENTATION_ONLY_MSFT mode, it <b>should</b> avoid providing a depth buffer for the corresponding layer using ##XrCompositionLayerDepthInfoKHR in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#XR_KHR_composition_layer_depth">XR_KHR_composition_layer_depth</a> extension. However, if the application does submit this depth buffer, the runtime <b>must</b> not fail the #EndFrame() function because of this unused depth data.

        <h5>See Also</h5>
        ##XrCompositionLayerReprojectionInfoMSFT, #EnumerateReprojectionModesMSFT()
        """,

        "REPROJECTION_MODE_DEPTH_MSFT".."1",
        "REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT".."2",
        "REPROJECTION_MODE_PLANAR_MANUAL_MSFT".."3",
        "REPROJECTION_MODE_ORIENTATION_ONLY_MSFT".."4"
    )

    XrResult(
        "EnumerateReprojectionModesMSFT",
        """
        Queries the supported reprojection modes.

        <h5>C Specification</h5>
        First, the application uses #EnumerateReprojectionModesMSFT() to inspect what reprojection mode the view configuration supports.

        The #EnumerateReprojectionModesMSFT() function returns the supported reprojection modes of the view configuration.

        <pre><code>
￿XrResult xrEnumerateReprojectionModesMSFT(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    XrViewConfigurationType                     viewConfigurationType,
￿    uint32_t                                    modeCapacityInput,
￿    uint32_t*                                   modeCountOutput,
￿    XrReprojectionModeMSFT*                     modes);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTCompositionLayerReprojection XR_MSFT_composition_layer_reprojection} extension <b>must</b> be enabled prior to calling #EnumerateReprojectionModesMSFT()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
            <li>{@code modeCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code modeCapacityInput} is not 0, {@code modes} <b>must</b> be a pointer to an array of {@code modeCapacityInput} {@code XrReprojectionModeMSFT} values</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>

        A system <b>may</b> support different sets of reprojection modes for different view configuration types.
        """,

        XrInstance("instance", "the instance from which {@code systemId} was retrieved."),
        XrSystemId("systemId", "the {@code XrSystemId} whose reprojection modes will be enumerated."),
        XrViewConfigurationType("viewConfigurationType", "the {@code XrViewConfigurationType} to enumerate."),
        AutoSize("modes")..uint32_t("modeCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("modeCountOutput", "a pointer to the count of the array, or a pointer to the required capacity in the case that {@code modeCapacityInput} is 0."),
        nullable..XrReprojectionModeMSFT.p("modes", "a pointer to an application-allocated array that will be filled with the {@code XrReprojectionModeMSFT} values that are supported by the runtime. It <b>can</b> be {@code NULL} if {@code modeCapacityInput} is 0.")
    )
}