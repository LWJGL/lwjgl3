/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_passthrough_color_lut = "METAPassthroughColorLut".nativeClassXR("META_passthrough_color_lut", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_META_passthrough_color_lut">XR_META_passthrough_color_lut</a> extension.

        This extension adds the capability to define and apply RGB to RGB(A) color look-up tables (LUTs) to passthrough layers created using {@link FBPassthrough XR_FB_passthrough}.

        Color LUTs are 3-dimensional arrays which map each input color to a different output color. When applied to a Passthrough layer, the runtime <b>must</b> transform Passthrough camera images according to this map before display. Color LUTs <b>may</b> be used to achieve effects such as color grading, level control, color filtering, or chroma keying.

        Color LUTs <b>must</b> be created using #CreatePassthroughColorLutMETA() before they <b>can</b> be applied to a Passthrough layer in a call to #PassthroughLayerSetStyleFB() (as a part of ##XrPassthroughColorMapLutMETA or ##XrPassthroughColorMapInterpolatedLutMETA). A color LUT <b>may</b> be applied to multiple Passthrough layers simultaneously.
        """

    IntConstant(
        "The extension specification version.",

        "META_passthrough_color_lut_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_PASSTHROUGH_COLOR_LUT_EXTENSION_NAME".."XR_META_passthrough_color_lut"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META".."1000266000",
        "TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META".."1000266001",
        "TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META".."1000266002",
        "TYPE_PASSTHROUGH_COLOR_MAP_LUT_META".."1000266100",
        "TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META".."1000266101"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_PASSTHROUGH_COLOR_LUT_META".."1000266000"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META".."-1000266000"
    )

    EnumConstant(
        """
        XrPassthroughColorLutChannelsMETA - Color channels

        <h5>See Also</h5>
        ##XrPassthroughColorLutCreateInfoMETA
        """,

        "PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META".."1",
        "PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META".."2"
    )

    XrResult(
        "CreatePassthroughColorLutMETA",
        """
        Create a passthrough color LUT.

        <h5>C Specification</h5>
        The #CreatePassthroughColorLutMETA() function is defined as:

        <pre><code>
￿XrResult xrCreatePassthroughColorLutMETA(
￿    XrPassthroughFB                             passthrough,
￿    const XrPassthroughColorLutCreateInfoMETA*  createInfo,
￿    XrPassthroughColorLutMETA*                  colorLut);</code></pre>

        <h5>Description</h5>
        Creates a passthrough color LUT. The resulting {@code XrPassthroughColorLutMETA} <b>may</b> be referenced in ##XrPassthroughColorMapLutMETA and ##XrPassthroughColorMapInterpolatedLutMETA in subsequent calls to #PassthroughLayerSetStyleFB().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to calling #CreatePassthroughColorLutMETA()</li>
            <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughFB} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrPassthroughColorLutCreateInfoMETA structure</li>
            <li>{@code colorLut} <b>must</b> be a pointer to an {@code XrPassthroughColorLutMETA} handle</li>
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
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPassthroughColorLutCreateInfoMETA
        """,

        XrPassthroughFB("passthrough", "the {@code XrPassthroughFB} this color LUT is created for."),
        XrPassthroughColorLutCreateInfoMETA.const.p("createInfo", "the ##XrPassthroughColorLutCreateInfoMETA."),
        Check(1)..XrPassthroughColorLutMETA.p("colorLut", "the resulting {@code XrPassthroughColorLutMETA}.")
    )

    XrResult(
        "DestroyPassthroughColorLutMETA",
        """
        Destroy a passthrough color LUT.

        <h5>C Specification</h5>
        The #DestroyPassthroughColorLutMETA() function is defined as:

        <pre><code>
￿XrResult xrDestroyPassthroughColorLutMETA(
￿    XrPassthroughColorLutMETA                   colorLut);</code></pre>

        <h5>Description</h5>
        Destroys a passthrough color LUT. If the color LUT is still in use (i.e. if for at least one passthrough layer, #PassthroughLayerSetStyleFB() has last been called with an instance of ##XrPassthroughColorMapLutMETA or ##XrPassthroughColorMapInterpolatedLutMETA in the next chain that references this color LUT), the runtime <b>must</b> retain the color LUT data and continue applying it to the affected passthrough layer until a different style is applied.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to calling #DestroyPassthroughColorLutMETA()</li>
            <li>{@code colorLut} <b>must</b> be a valid {@code XrPassthroughColorLutMETA} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code colorLut}, and any child handles, <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrPassthroughColorLutMETA("colorLut", "the {@code XrPassthroughColorLutMETA} to be destroyed.")
    )

    XrResult(
        "UpdatePassthroughColorLutMETA",
        """
        Update a passthrough color LUT.

        <h5>C Specification</h5>
        The #UpdatePassthroughColorLutMETA() function is defined as:

        <pre><code>
￿XrResult xrUpdatePassthroughColorLutMETA(
￿    XrPassthroughColorLutMETA                   colorLut,
￿    const XrPassthroughColorLutUpdateInfoMETA*  updateInfo);</code></pre>

        <h5>Description</h5>
        Updates the LUT data of a passthrough color LUT. The data type of the color LUT (resolution and channels) is immutable. The provided data in this call <b>must</b> therefore match the data type specified at creation time. Specifically, {@code bufferSize} of the new data <b>must</b> be equal to the {@code bufferSize} specified during creation. Otherwise, the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.

        The runtime <b>must</b> reflect changes to color LUT data on all Passthrough layers the color LUT is currently applied to.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to calling #UpdatePassthroughColorLutMETA()</li>
            <li>{@code colorLut} <b>must</b> be a valid {@code XrPassthroughColorLutMETA} handle</li>
            <li>{@code updateInfo} <b>must</b> be a pointer to a valid ##XrPassthroughColorLutUpdateInfoMETA structure</li>
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
                <li>#ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPassthroughColorLutUpdateInfoMETA
        """,

        XrPassthroughColorLutMETA("colorLut", "the {@code XrPassthroughColorLutMETA} to be updated."),
        XrPassthroughColorLutUpdateInfoMETA.const.p("updateInfo", "the ##XrPassthroughColorLutUpdateInfoMETA.")
    )
}