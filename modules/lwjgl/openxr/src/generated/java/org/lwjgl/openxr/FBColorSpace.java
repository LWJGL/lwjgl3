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

/** The FB_color_space extension. */
public class FBColorSpace {

    /** The extension specification version. */
    public static final int XR_FB_color_space_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_FB_COLOR_SPACE_EXTENSION_NAME = "XR_FB_color_space";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB = 1000108000;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_COLOR_SPACE_UNSUPPORTED_FB = -1000108000;

    /**
     * XrColorSpaceFB - Color Space Type
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_COLOR_SPACE_UNMANAGED_FB COLOR_SPACE_UNMANAGED_FB}. No color correction, not recommended for production use.</li>
     * <li>{@link #XR_COLOR_SPACE_REC2020_FB COLOR_SPACE_REC2020_FB}. Standard Rec. 2020 chromacities with D65 white point.</li>
     * <li>{@link #XR_COLOR_SPACE_REC709_FB COLOR_SPACE_REC709_FB}. Standard Rec. 709 chromaticities, similar to sRGB.</li>
     * <li>{@link #XR_COLOR_SPACE_RIFT_CV1_FB COLOR_SPACE_RIFT_CV1_FB}. Unique color space, between P3 and Adobe RGB using D75 white point. This is the preferred color space for standardized color across all Oculus HMDs.
     * Color Space Details with Chromacity Primaries in CIE 1931 xy:
     * 
     * <ul>
     * <li>Red: (0.666, 0.334)</li>
     * <li>Green: (0.238, 0.714)</li>
     * <li>Blue: (0.139, 0.053)</li>
     * <li>White: (0.298, 0.318)</li>
     * </ul>
     * </li>
     * <li>{@link #XR_COLOR_SPACE_RIFT_S_FB COLOR_SPACE_RIFT_S_FB}. Unique color space. Similar to Rec 709 using D75.
     * Color Space Details with Chromacity Primaries in CIE 1931 xy:
     * 
     * <ul>
     * <li>Red: (0.640, 0.330)</li>
     * <li>Green: (0.292, 0.586)</li>
     * <li>Blue: (0.156, 0.058)</li>
     * <li>White: (0.298, 0.318)</li>
     * </ul>
     * </li>
     * <li>{@link #XR_COLOR_SPACE_QUEST_FB COLOR_SPACE_QUEST_FB}. Unique color space. Similar to Rift CV1 using D75 white point
     * Color Space Details with Chromacity Primaries in CIE 1931 xy:
     * 
     * <ul>
     * <li>Red: (0.661, 0.338)</li>
     * <li>Green: (0.228, 0.718)</li>
     * <li>Blue: (0.142, 0.042)</li>
     * <li>White: (0.298, 0.318)</li>
     * </ul>
     * </li>
     * <li>{@link #XR_COLOR_SPACE_P3_FB COLOR_SPACE_P3_FB}. Similar to DCI-P3, but uses D65 white point instead.
     * Color Space Details with Chromacity Primaries in CIE 1931 xy:
     * 
     * <ul>
     * <li>Red: (0.680, 0.320)</li>
     * <li>Green: (0.265, 0.690)</li>
     * <li>Blue: (0.150, 0.060)</li>
     * <li>White: (0.313, 0.329)</li>
     * </ul>
     * </li>
     * <li>{@link #XR_COLOR_SPACE_ADOBE_RGB_FB COLOR_SPACE_ADOBE_RGB_FB}. Standard Adobe chromacities.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSystemColorSpacePropertiesFB}, {@link #xrEnumerateColorSpacesFB EnumerateColorSpacesFB}, {@link #xrSetColorSpaceFB SetColorSpaceFB}</p>
     */
    public static final int
        XR_COLOR_SPACE_UNMANAGED_FB = 0,
        XR_COLOR_SPACE_REC2020_FB   = 1,
        XR_COLOR_SPACE_REC709_FB    = 2,
        XR_COLOR_SPACE_RIFT_CV1_FB  = 3,
        XR_COLOR_SPACE_RIFT_S_FB    = 4,
        XR_COLOR_SPACE_QUEST_FB     = 5,
        XR_COLOR_SPACE_P3_FB        = 6,
        XR_COLOR_SPACE_ADOBE_RGB_FB = 7;

    protected FBColorSpace() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateColorSpacesFB ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateColorSpacesFB EnumerateColorSpacesFB}
     *
     * @param colorSpaceCapacityInput the capacity of the {@code colorSpaces} array, or 0 to retrieve the required capacity.
     */
    public static int nxrEnumerateColorSpacesFB(XrSession session, int colorSpaceCapacityInput, long colorSpaceCountOutput, long colorSpaces) {
        long __functionAddress = session.getCapabilities().xrEnumerateColorSpacesFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), colorSpaceCapacityInput, colorSpaceCountOutput, colorSpaces, __functionAddress);
    }

    /**
     * Enumerates color spaces.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateColorSpacesFB EnumerateColorSpacesFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateColorSpacesFB(
     *     XrSession                                   session,
     *     uint32_t                                    colorSpaceCapacityInput,
     *     uint32_t*                                   colorSpaceCountOutput,
     *     XrColorSpaceFB*                             colorSpaces);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrEnumerateColorSpacesFB EnumerateColorSpacesFB} enumerates the color spaces supported by the current session. Runtimes <b>must</b> always return identical buffer contents from this enumeration for the lifetime of the session.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBColorSpace XR_FB_color_space} extension <b>must</b> be enabled prior to calling {@link #xrEnumerateColorSpacesFB EnumerateColorSpacesFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code colorSpaceCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code colorSpaceCapacityInput} is not 0, {@code colorSpaces} <b>must</b> be a pointer to an array of {@code colorSpaceCapacityInput} {@code XrColorSpaceFB} values</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrSetColorSpaceFB SetColorSpaceFB}</p>
     *
     * @param session               the session that enumerates the supported color spaces.
     * @param colorSpaceCountOutput a pointer to the count of {@code XrColorSpaceFB} {@code colorSpaces} written, or a pointer to the required capacity in the case that {@code colorSpaceCapacityInput} is 0.
     * @param colorSpaces           a pointer to an array of {@code XrColorSpaceFB} color spaces, but <b>can</b> be {@code NULL} if {@code colorSpaceCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateColorSpacesFB(XrSession session, @NativeType("uint32_t *") IntBuffer colorSpaceCountOutput, @Nullable @NativeType("XrColorSpaceFB *") IntBuffer colorSpaces) {
        if (CHECKS) {
            check(colorSpaceCountOutput, 1);
        }
        return nxrEnumerateColorSpacesFB(session, remainingSafe(colorSpaces), memAddress(colorSpaceCountOutput), memAddressSafe(colorSpaces));
    }

    // --- [ xrSetColorSpaceFB ] ---

    /**
     * Set a color space.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetColorSpaceFB SetColorSpaceFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSetColorSpaceFB(
     *     XrSession                                   session,
     *     XrColorSpaceFB                              colorSpace);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrSetColorSpaceFB SetColorSpaceFB} provides a mechanism for an application to specify the color space used in the final rendered frame. If this function is not called, the session will use the color space deemed appropriate by the runtime. Oculus HMDs for both PC and Mobile product lines default to {@link #XR_COLOR_SPACE_RIFT_CV1_FB COLOR_SPACE_RIFT_CV1_FB}. The runtime <b>must</b> return {@link #XR_ERROR_COLOR_SPACE_UNSUPPORTED_FB ERROR_COLOR_SPACE_UNSUPPORTED_FB} if {@code colorSpace} is not one of the values enumerated by {@link #xrEnumerateColorSpacesFB EnumerateColorSpacesFB}.</p>
     * 
     * <p>Formal definitions of color spaces contain a number of aspects such as gamma correction, max luminance and more. However, {@link #xrSetColorSpaceFB SetColorSpaceFB} will only affect the color gamut of the output by transforming the color gamut from the source (defined by the {@code colorSpace} parameter) to the HMD display’s color gamut (defined by the hardware internally). This call will not affect gamma correction, leaving that to follow the GPU texture format standards. Luminance, tonemapping, and other aspects of the color space will also remain unaffected.</p>
     * 
     * <p>For more info on color management in Oculus HMDs, please refer to this guide: <a target="_blank" href="https://developer.oculus.com/resources/color-management-guide/">Color Management in Oculus Headsets</a></p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBColorSpace XR_FB_color_space} extension <b>must</b> be enabled prior to calling {@link #xrSetColorSpaceFB SetColorSpaceFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code colorSpace} <b>must</b> be a valid {@code XrColorSpaceFB} value</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link #XR_ERROR_COLOR_SPACE_UNSUPPORTED_FB ERROR_COLOR_SPACE_UNSUPPORTED_FB}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrEnumerateColorSpacesFB EnumerateColorSpacesFB}</p>
     *
     * @param session    a valid {@code XrSession} handle.
     * @param colorSpace a supported color space. Supported color spaces are indicated by {@link #xrEnumerateColorSpacesFB EnumerateColorSpacesFB}.
     */
    @NativeType("XrResult")
    public static int xrSetColorSpaceFB(XrSession session, @NativeType("XrColorSpaceFB") int colorSpace) {
        long __functionAddress = session.getCapabilities().xrSetColorSpaceFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), colorSpace, __functionAddress);
    }

}