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

/** The MSFT_composition_layer_reprojection extension. */
public class MSFTCompositionLayerReprojection {

    /** The extension specification version. */
    public static final int XR_MSFT_composition_layer_reprojection_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_MSFT_COMPOSITION_LAYER_REPROJECTION_EXTENSION_NAME = "XR_MSFT_composition_layer_reprojection";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT           = 1000066000,
        XR_TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT = 1000066001;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT = -1000066000;

    /**
     * XrReprojectionModeMSFT - Describes the reprojection mode of a composition layer
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #XR_REPROJECTION_MODE_DEPTH_MSFT REPROJECTION_MODE_DEPTH_MSFT} indicates the corresponding layer <b>may</b> benefit from per-pixel depth reprojection provided by {@link XrCompositionLayerDepthInfoKHR} to the projection layer. This mode is typically used for world-locked content that should remain physically stationary as the user walks around.</li>
     * <li>{@link #XR_REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT} indicates the corresponding layer <b>may</b> benefit from planar reprojection and the plane <b>can</b> be calculated from the corresponding depth information provided by {@link XrCompositionLayerDepthInfoKHR} to the projection layer. This mode works better when the application knows the content is mostly placed on a plane.</li>
     * <li>{@link #XR_REPROJECTION_MODE_PLANAR_MANUAL_MSFT REPROJECTION_MODE_PLANAR_MANUAL_MSFT} indicates that the corresponding layer <b>may</b> benefit from planar reprojection. The application <b>can</b> customize the plane by chaining an {@link XrCompositionLayerReprojectionPlaneOverrideMSFT} structure to the same layer. The app <b>can</b> also omit the plane override, indicating the runtime should use the default reprojection plane settings. This mode works better when the application knows the content is mostly placed on a plane, or when it cannot afford to submit depth information.</li>
     * <li>{@link #XR_REPROJECTION_MODE_ORIENTATION_ONLY_MSFT REPROJECTION_MODE_ORIENTATION_ONLY_MSFT} indicates the layer should be stabilized only for changes to orientation, ignoring positional changes. This mode works better for body-locked content that should follow the user as they walk around, such as 360-degree video.</li>
     * </ul>
     * 
     * <p>When the application passes {@link #XR_REPROJECTION_MODE_DEPTH_MSFT REPROJECTION_MODE_DEPTH_MSFT} or {@link #XR_REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT} mode, it <b>should</b> also provide the depth buffer for the corresponding layer using {@link XrCompositionLayerDepthInfoKHR} in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_composition_layer_depth">XR_KHR_composition_layer_depth</a> extension. However, if the application does not submit this depth buffer, the runtime <b>must</b> apply a runtime defined fallback reprojection mode, and <b>must</b> not fail the {@link XR10#xrEndFrame EndFrame} function because of this missing depth.</p>
     * 
     * <p>When the application passes {@link #XR_REPROJECTION_MODE_PLANAR_MANUAL_MSFT REPROJECTION_MODE_PLANAR_MANUAL_MSFT} or {@link #XR_REPROJECTION_MODE_ORIENTATION_ONLY_MSFT REPROJECTION_MODE_ORIENTATION_ONLY_MSFT} mode, it <b>should</b> avoid providing a depth buffer for the corresponding layer using {@link XrCompositionLayerDepthInfoKHR} in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_composition_layer_depth">XR_KHR_composition_layer_depth</a> extension. However, if the application does submit this depth buffer, the runtime <b>must</b> not fail the {@link XR10#xrEndFrame EndFrame} function because of this unused depth data.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrCompositionLayerReprojectionInfoMSFT}, {@link #xrEnumerateReprojectionModesMSFT EnumerateReprojectionModesMSFT}</p>
     */
    public static final int
        XR_REPROJECTION_MODE_DEPTH_MSFT             = 1,
        XR_REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT = 2,
        XR_REPROJECTION_MODE_PLANAR_MANUAL_MSFT     = 3,
        XR_REPROJECTION_MODE_ORIENTATION_ONLY_MSFT  = 4;

    protected MSFTCompositionLayerReprojection() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateReprojectionModesMSFT ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateReprojectionModesMSFT EnumerateReprojectionModesMSFT}
     *
     * @param modeCapacityInput the capacity of the array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateReprojectionModesMSFT(XrInstance instance, long systemId, int viewConfigurationType, int modeCapacityInput, long modeCountOutput, long modes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateReprojectionModesMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, viewConfigurationType, modeCapacityInput, modeCountOutput, modes, __functionAddress);
    }

    /**
     * Queries the supported reprojection modes.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>First, the application uses {@link #xrEnumerateReprojectionModesMSFT EnumerateReprojectionModesMSFT} to inspect what reprojection mode the view configuration supports.</p>
     * 
     * <p>The {@link #xrEnumerateReprojectionModesMSFT EnumerateReprojectionModesMSFT} function returns the supported reprojection modes of the view configuration.</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateReprojectionModesMSFT(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     XrViewConfigurationType                     viewConfigurationType,
     *     uint32_t                                    modeCapacityInput,
     *     uint32_t*                                   modeCountOutput,
     *     XrReprojectionModeMSFT*                     modes);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTCompositionLayerReprojection XR_MSFT_composition_layer_reprojection} extension <b>must</b> be enabled prior to calling {@link #xrEnumerateReprojectionModesMSFT EnumerateReprojectionModesMSFT}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
     * <li>{@code modeCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code modeCapacityInput} is not 0, {@code modes} <b>must</b> be a pointer to an array of {@code modeCapacityInput} {@code XrReprojectionModeMSFT} values</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link XR10#XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>A system <b>may</b> support different sets of reprojection modes for different view configuration types.</p>
     *
     * @param instance              the instance from which {@code systemId} was retrieved.
     * @param systemId              the {@code XrSystemId} whose reprojection modes will be enumerated.
     * @param viewConfigurationType the {@code XrViewConfigurationType} to enumerate.
     * @param modeCountOutput       a pointer to the count of the array, or a pointer to the required capacity in the case that {@code modeCapacityInput} is 0.
     * @param modes                 a pointer to an application-allocated array that will be filled with the {@code XrReprojectionModeMSFT} values that are supported by the runtime. It <b>can</b> be {@code NULL} if {@code modeCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateReprojectionModesMSFT(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t *") IntBuffer modeCountOutput, @Nullable @NativeType("XrReprojectionModeMSFT *") IntBuffer modes) {
        if (CHECKS) {
            check(modeCountOutput, 1);
        }
        return nxrEnumerateReprojectionModesMSFT(instance, systemId, viewConfigurationType, remainingSafe(modes), memAddress(modeCountOutput), memAddressSafe(modes));
    }

}