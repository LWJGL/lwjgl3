/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_META_passthrough_color_lut">XR_META_passthrough_color_lut</a> extension.
 * 
 * <p>This extension adds the capability to define and apply RGB to RGB(A) color look-up tables (LUTs) to passthrough layers created using {@link FBPassthrough XR_FB_passthrough}.</p>
 * 
 * <p>Color LUTs are 3-dimensional arrays which map each input color to a different output color. When applied to a Passthrough layer, the runtime <b>must</b> transform Passthrough camera images according to this map before display. Color LUTs <b>may</b> be used to achieve effects such as color grading, level control, color filtering, or chroma keying.</p>
 * 
 * <p>Color LUTs <b>must</b> be created using {@link #xrCreatePassthroughColorLutMETA CreatePassthroughColorLutMETA} before they <b>can</b> be applied to a Passthrough layer in a call to {@link FBPassthrough#xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB} (as a part of {@link XrPassthroughColorMapLutMETA} or {@link XrPassthroughColorMapInterpolatedLutMETA}). A color LUT <b>may</b> be applied to multiple Passthrough layers simultaneously.</p>
 */
public class METAPassthroughColorLut {

    /** The extension specification version. */
    public static final int XR_META_passthrough_color_lut_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_PASSTHROUGH_COLOR_LUT_EXTENSION_NAME = "XR_META_passthrough_color_lut";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META}</li>
     * <li>{@link #XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META}</li>
     * <li>{@link #XR_TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META}</li>
     * <li>{@link #XR_TYPE_PASSTHROUGH_COLOR_MAP_LUT_META TYPE_PASSTHROUGH_COLOR_MAP_LUT_META}</li>
     * <li>{@link #XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META = 1000266000,
        XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META       = 1000266001,
        XR_TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META       = 1000266002,
        XR_TYPE_PASSTHROUGH_COLOR_MAP_LUT_META               = 1000266100,
        XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META  = 1000266101;

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_PASSTHROUGH_COLOR_LUT_META = 1000266000;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META = -1000266000;

    /**
     * XrPassthroughColorLutChannelsMETA - Color channels
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPassthroughColorLutCreateInfoMETA}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META}</li>
     * <li>{@link #XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META}</li>
     * </ul>
     */
    public static final int
        XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META  = 1,
        XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META = 2;

    protected METAPassthroughColorLut() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreatePassthroughColorLutMETA ] ---

    /** Unsafe version of: {@link #xrCreatePassthroughColorLutMETA CreatePassthroughColorLutMETA} */
    public static int nxrCreatePassthroughColorLutMETA(XrPassthroughFB passthrough, long createInfo, long colorLut) {
        long __functionAddress = passthrough.getCapabilities().xrCreatePassthroughColorLutMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrPassthroughColorLutCreateInfoMETA.validate(createInfo);
        }
        return callPPPI(passthrough.address(), createInfo, colorLut, __functionAddress);
    }

    /**
     * Create a passthrough color LUT.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreatePassthroughColorLutMETA CreatePassthroughColorLutMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreatePassthroughColorLutMETA(
     *     XrPassthroughFB                             passthrough,
     *     const XrPassthroughColorLutCreateInfoMETA*  createInfo,
     *     XrPassthroughColorLutMETA*                  colorLut);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates a passthrough color LUT. The resulting {@code XrPassthroughColorLutMETA} <b>may</b> be referenced in {@link XrPassthroughColorMapLutMETA} and {@link XrPassthroughColorMapInterpolatedLutMETA} in subsequent calls to {@link FBPassthrough#xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to calling {@link #xrCreatePassthroughColorLutMETA CreatePassthroughColorLutMETA}</li>
     * <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughFB} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrPassthroughColorLutCreateInfoMETA} structure</li>
     * <li>{@code colorLut} <b>must</b> be a pointer to an {@code XrPassthroughColorLutMETA} handle</li>
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
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link #XR_ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPassthroughColorLutCreateInfoMETA}</p>
     *
     * @param passthrough the {@code XrPassthroughFB} this color LUT is created for.
     * @param createInfo  the {@link XrPassthroughColorLutCreateInfoMETA}.
     * @param colorLut    the resulting {@code XrPassthroughColorLutMETA}.
     */
    @NativeType("XrResult")
    public static int xrCreatePassthroughColorLutMETA(XrPassthroughFB passthrough, @NativeType("XrPassthroughColorLutCreateInfoMETA const *") XrPassthroughColorLutCreateInfoMETA createInfo, @NativeType("XrPassthroughColorLutMETA *") PointerBuffer colorLut) {
        if (CHECKS) {
            check(colorLut, 1);
        }
        return nxrCreatePassthroughColorLutMETA(passthrough, createInfo.address(), memAddress(colorLut));
    }

    // --- [ xrDestroyPassthroughColorLutMETA ] ---

    /**
     * Destroy a passthrough color LUT.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyPassthroughColorLutMETA DestroyPassthroughColorLutMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyPassthroughColorLutMETA(
     *     XrPassthroughColorLutMETA                   colorLut);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Destroys a passthrough color LUT. If the color LUT is still in use (i.e. if for at least one passthrough layer, {@link FBPassthrough#xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB} has last been called with an instance of {@link XrPassthroughColorMapLutMETA} or {@link XrPassthroughColorMapInterpolatedLutMETA} in the next chain that references this color LUT), the runtime <b>must</b> retain the color LUT data and continue applying it to the affected passthrough layer until a different style is applied.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to calling {@link #xrDestroyPassthroughColorLutMETA DestroyPassthroughColorLutMETA}</li>
     * <li>{@code colorLut} <b>must</b> be a valid {@code XrPassthroughColorLutMETA} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code colorLut}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param colorLut the {@code XrPassthroughColorLutMETA} to be destroyed.
     */
    @NativeType("XrResult")
    public static int xrDestroyPassthroughColorLutMETA(XrPassthroughColorLutMETA colorLut) {
        long __functionAddress = colorLut.getCapabilities().xrDestroyPassthroughColorLutMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(colorLut.address(), __functionAddress);
    }

    // --- [ xrUpdatePassthroughColorLutMETA ] ---

    /** Unsafe version of: {@link #xrUpdatePassthroughColorLutMETA UpdatePassthroughColorLutMETA} */
    public static int nxrUpdatePassthroughColorLutMETA(XrPassthroughColorLutMETA colorLut, long updateInfo) {
        long __functionAddress = colorLut.getCapabilities().xrUpdatePassthroughColorLutMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrPassthroughColorLutUpdateInfoMETA.validate(updateInfo);
        }
        return callPPI(colorLut.address(), updateInfo, __functionAddress);
    }

    /**
     * Update a passthrough color LUT.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrUpdatePassthroughColorLutMETA UpdatePassthroughColorLutMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrUpdatePassthroughColorLutMETA(
     *     XrPassthroughColorLutMETA                   colorLut,
     *     const XrPassthroughColorLutUpdateInfoMETA*  updateInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Updates the LUT data of a passthrough color LUT. The data type of the color LUT (resolution and channels) is immutable. The provided data in this call <b>must</b> therefore match the data type specified at creation time. Specifically, {@code bufferSize} of the new data <b>must</b> be equal to the {@code bufferSize} specified during creation. Otherwise, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
     * 
     * <p>The runtime <b>must</b> reflect changes to color LUT data on all Passthrough layers the color LUT is currently applied to.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to calling {@link #xrUpdatePassthroughColorLutMETA UpdatePassthroughColorLutMETA}</li>
     * <li>{@code colorLut} <b>must</b> be a valid {@code XrPassthroughColorLutMETA} handle</li>
     * <li>{@code updateInfo} <b>must</b> be a pointer to a valid {@link XrPassthroughColorLutUpdateInfoMETA} structure</li>
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
     * <li>{@link #XR_ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPassthroughColorLutUpdateInfoMETA}</p>
     *
     * @param colorLut   the {@code XrPassthroughColorLutMETA} to be updated.
     * @param updateInfo the {@link XrPassthroughColorLutUpdateInfoMETA}.
     */
    @NativeType("XrResult")
    public static int xrUpdatePassthroughColorLutMETA(XrPassthroughColorLutMETA colorLut, @NativeType("XrPassthroughColorLutUpdateInfoMETA const *") XrPassthroughColorLutUpdateInfoMETA updateInfo) {
        return nxrUpdatePassthroughColorLutMETA(colorLut, updateInfo.address());
    }

}