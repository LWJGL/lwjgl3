/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_facial_expression = "MLFacialExpression".nativeClassXR("ML_facial_expression", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_ML_facial_expression">XR_ML_facial_expression</a> extension.

        This extension provides the weights of facial blend shapes usable for a variety of purposes, such as mood monitoring or interpolating the expression of an avatar’s face.

        <h5>Permissions</h5>
        Android applications <b>must</b> have the com.magicleap.permission.FACIAL_EXPRESSION permission listed in their manifest and granted to use this extension, otherwise #CreateFacialExpressionClientML() will return a #ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML error. (protection level: dangerous)
        """

    IntConstant(
        "The extension specification version.",

        "ML_facial_expression_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_FACIAL_EXPRESSION_EXTENSION_NAME".."XR_ML_facial_expression"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML".."1000482000"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_FACIAL_EXPRESSION_CLIENT_ML".."1000482000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_FACIAL_EXPRESSION_PROPERTIES_ML".."1000482004",
        "TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML".."1000482005",
        "TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML".."1000482006",
        "TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML".."1000482007"
    )

    EnumConstant(
        """
        XrFacialBlendShapeML - The names of trackable blend shapes

        <h5>See Also</h5>
        ##XrFacialExpressionBlendShapePropertiesML, ##XrFacialExpressionClientCreateInfoML
        """,

        "FACIAL_BLEND_SHAPE_BROW_LOWERER_L_ML".."0",
        "FACIAL_BLEND_SHAPE_BROW_LOWERER_R_ML".."1",
        "FACIAL_BLEND_SHAPE_CHEEK_RAISER_L_ML".."2",
        "FACIAL_BLEND_SHAPE_CHEEK_RAISER_R_ML".."3",
        "FACIAL_BLEND_SHAPE_CHIN_RAISER_ML".."4",
        "FACIAL_BLEND_SHAPE_DIMPLER_L_ML".."5",
        "FACIAL_BLEND_SHAPE_DIMPLER_R_ML".."6",
        "FACIAL_BLEND_SHAPE_EYES_CLOSED_L_ML".."7",
        "FACIAL_BLEND_SHAPE_EYES_CLOSED_R_ML".."8",
        "FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_L_ML".."9",
        "FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_R_ML".."10",
        "FACIAL_BLEND_SHAPE_JAW_DROP_ML".."11",
        "FACIAL_BLEND_SHAPE_LID_TIGHTENER_L_ML".."12",
        "FACIAL_BLEND_SHAPE_LID_TIGHTENER_R_ML".."13",
        "FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_L_ML".."14",
        "FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_R_ML".."15",
        "FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_L_ML".."16",
        "FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_R_ML".."17",
        "FACIAL_BLEND_SHAPE_LIP_FUNNELER_LB_ML".."18",
        "FACIAL_BLEND_SHAPE_LIP_FUNNELER_LT_ML".."19",
        "FACIAL_BLEND_SHAPE_LIP_FUNNELER_RB_ML".."20",
        "FACIAL_BLEND_SHAPE_LIP_FUNNELER_RT_ML".."21",
        "FACIAL_BLEND_SHAPE_LIP_PRESSOR_L_ML".."22",
        "FACIAL_BLEND_SHAPE_LIP_PRESSOR_R_ML".."23",
        "FACIAL_BLEND_SHAPE_LIP_PUCKER_L_ML".."24",
        "FACIAL_BLEND_SHAPE_LIP_PUCKER_R_ML".."25",
        "FACIAL_BLEND_SHAPE_LIP_STRETCHER_L_ML".."26",
        "FACIAL_BLEND_SHAPE_LIP_STRETCHER_R_ML".."27",
        "FACIAL_BLEND_SHAPE_LIP_SUCK_LB_ML".."28",
        "FACIAL_BLEND_SHAPE_LIP_SUCK_LT_ML".."29",
        "FACIAL_BLEND_SHAPE_LIP_SUCK_RB_ML".."30",
        "FACIAL_BLEND_SHAPE_LIP_SUCK_RT_ML".."31",
        "FACIAL_BLEND_SHAPE_LIP_TIGHTENER_L_ML".."32",
        "FACIAL_BLEND_SHAPE_LIP_TIGHTENER_R_ML".."33",
        "FACIAL_BLEND_SHAPE_LIPS_TOWARD_ML".."34",
        "FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_L_ML".."35",
        "FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_R_ML".."36",
        "FACIAL_BLEND_SHAPE_NOSE_WRINKLER_L_ML".."37",
        "FACIAL_BLEND_SHAPE_NOSE_WRINKLER_R_ML".."38",
        "FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_L_ML".."39",
        "FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_R_ML".."40",
        "FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_L_ML".."41",
        "FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_R_ML".."42",
        "FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_L_ML".."43",
        "FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_R_ML".."44",
        "FACIAL_BLEND_SHAPE_TONGUE_OUT_ML".."45"
    )

    EnumConstant(
        """
        XrFacialExpressionBlendShapePropertiesFlagBitsML - Flag bits for facial expression blend shape properties.

        <h5>Description</h5>
        The flag bits' meaning are described as below:

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_VALID_BIT_ML — Indicates whether the blend shape is valid.</li>
            <li>#FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_TRACKED_BIT_ML — Indicates whether the blend shape is being tracked by the runtime.</li>
        </ul>

        <h5>See Also</h5>
        ##XrFacialExpressionBlendShapePropertiesML
        """,

        "FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_VALID_BIT_ML".enum(0x00000001),
        "FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_TRACKED_BIT_ML".enum(0x00000002)
    )

    XrResult(
        "CreateFacialExpressionClientML",
        """
        Creates a face tracking handle.

        <h5>C Specification</h5>
        The #CreateFacialExpressionClientML() function is defined as:

        <pre><code>
￿XrResult xrCreateFacialExpressionClientML(
￿    XrSession                                   session,
￿    const XrFacialExpressionClientCreateInfoML* createInfo,
￿    XrFacialExpressionClientML*                 facialExpressionClient);</code></pre>

        <h5>Description</h5>
        An application <b>can</b> create an {@code XrFacialExpressionClientML} handle using #CreateFacialExpressionClientML() function.

        If the system does not support parsing facial expressions, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateFacialExpressionClientML(). In this case, the runtime <b>must</b> also return #FALSE for ##XrSystemFacialExpressionPropertiesML{@code ::supportsFacialExpression} when the function #GetSystemProperties() is called.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLFacialExpression XR_ML_facial_expression} extension <b>must</b> be enabled prior to calling #CreateFacialExpressionClientML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrFacialExpressionClientCreateInfoML structure</li>
            <li>{@code facialExpressionClient} <b>must</b> be a pointer to an {@code XrFacialExpressionClientML} handle</li>
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
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
                <li>#ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrFacialExpressionClientCreateInfoML
        """,

        XrSession("session", "an {@code XrSession} in which the facial expression client will be active."),
        XrFacialExpressionClientCreateInfoML.const.p("createInfo", "a pointer to the ##XrFacialExpressionClientCreateInfoML used to specify the facial expression client."),
        Check(1)..XrFacialExpressionClientML.p("facialExpressionClient", "a pointer to the returned {@code XrFacialExpressionClientML} handle.")
    )

    XrResult(
        "DestroyFacialExpressionClientML",
        """
        Destroys a facial expression client handle.

        <h5>C Specification</h5>
        The #DestroyFacialExpressionClientML() function is defined as:

        <pre><code>
￿XrResult xrDestroyFacialExpressionClientML(
￿    XrFacialExpressionClientML                  facialExpressionClient);</code></pre>

        <h5>Description</h5>
        The #DestroyFacialExpressionClientML() function releases the {@code facialExpressionClient} and the underlying resources.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLFacialExpression XR_ML_facial_expression} extension <b>must</b> be enabled prior to calling #DestroyFacialExpressionClientML()</li>
            <li>{@code facialExpressionClient} <b>must</b> be a valid {@code XrFacialExpressionClientML} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code facialExpressionClient}, and any child handles, <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateFacialExpressionClientML()
        """,

        XrFacialExpressionClientML("facialExpressionClient", "an {@code XrFacialExpressionClientML} previously created by #CreateFacialExpressionClientML().")
    )

    XrResult(
        "GetFacialExpressionBlendShapePropertiesML",
        """
        Obtain blend shape of facial expression.

        <h5>C Specification</h5>
        The #GetFacialExpressionBlendShapePropertiesML() function is defined as:

        <pre><code>
￿XrResult xrGetFacialExpressionBlendShapePropertiesML(
￿    XrFacialExpressionClientML                  facialExpressionClient,
￿    const XrFacialExpressionBlendShapeGetInfoML* blendShapeGetInfo,
￿    uint32_t                                    blendShapeCount,
￿    XrFacialExpressionBlendShapePropertiesML*   blendShapes);</code></pre>

        <h5>Description</h5>
        ##XrFacialExpressionBlendShapePropertiesML is better thought of as a mutable state rather than an immutable property. In general, OpenXR convention tries to keep property data types to be immutable.

        The #GetFacialExpressionBlendShapePropertiesML() function returns the ##XrFacialExpressionBlendShapePropertiesML of each blend shape requested in ##XrFacialExpressionClientCreateInfoML

        Each ##XrFacialExpressionBlendShapePropertiesML in {@code blendShapes} <b>must</b> have its {@code requestedFacialBlendShape} member variable initialized before being passed into #GetFacialExpressionBlendShapePropertiesML().

        If a blend shape in {@code blendShapes} is not enabled in #CreateFacialExpressionClientML(), the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.

        For unsupported blend shapes, the runtime <b>must</b> clear ##XrFacialExpressionBlendShapePropertiesML{@code ::flags} and the runtime <b>must</b> also return #SUCCESS.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLFacialExpression XR_ML_facial_expression} extension <b>must</b> be enabled prior to calling #GetFacialExpressionBlendShapePropertiesML()</li>
            <li>{@code facialExpressionClient} <b>must</b> be a valid {@code XrFacialExpressionClientML} handle</li>
            <li>{@code blendShapeGetInfo} <b>must</b> be a pointer to a valid ##XrFacialExpressionBlendShapeGetInfoML structure</li>
            <li>{@code blendShapes} <b>must</b> be a pointer to an array of {@code blendShapeCount} ##XrFacialExpressionBlendShapePropertiesML structures</li>
            <li>The {@code blendShapeCount} parameter <b>must</b> be greater than 0</li>
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
                <li>#ERROR_TIME_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrFacialExpressionBlendShapeGetInfoML, ##XrFacialExpressionBlendShapePropertiesML, ##XrFacialExpressionClientCreateInfoML
        """,

        XrFacialExpressionClientML("facialExpressionClient", "an {@code XrFacialExpressionClientML} previously created by #CreateFacialExpressionClientML()."),
        XrFacialExpressionBlendShapeGetInfoML.const.p("blendShapeGetInfo", "a pointer to ##XrFacialExpressionBlendShapeGetInfoML describing information to obtain facial expression."),
        AutoSize("blendShapes")..uint32_t("blendShapeCount", "a {@code uint32_t} specifying the size of the {@code blendShapes} array."),
        XrFacialExpressionBlendShapePropertiesML.p("blendShapes", "an application allocated array of ##XrFacialExpressionBlendShapePropertiesML that contains the blend shapes information. This array acts as both input and output for this function. The array <b>may</b> be a subset of blend shapes.")
    )
}