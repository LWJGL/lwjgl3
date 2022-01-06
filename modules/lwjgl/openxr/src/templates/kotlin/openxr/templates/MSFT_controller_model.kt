/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_controller_model = "MSFTControllerModel".nativeClassXR("MSFT_controller_model", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_controller_model_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "MSFT_CONTROLLER_MODEL_EXTENSION_NAME".."XR_MSFT_controller_model"
    )

    EnumConstant(
        "XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT",

        "MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT".."64"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT".."1000055000",
        "TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT".."1000055001",
        "TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT".."1000055002",
        "TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT".."1000055003",
        "TYPE_CONTROLLER_MODEL_STATE_MSFT".."1000055004"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT".."-1000055000"
    )

    XrResult(
        "GetControllerModelKeyMSFT",
        """
        Retrieve the model key for the controller.

        <h5>C Specification</h5>
        #GetControllerModelKeyMSFT() retrieves the {@code XrControllerModelKeyMSFT} for a controller. This model key <b>may</b> later be used to retrieve the model data.

        The #GetControllerModelKeyMSFT() function is defined as:

        <pre><code>
￿XrResult xrGetControllerModelKeyMSFT(
￿    XrSession                                   session,
￿    XrPath                                      topLevelUserPath,
￿    XrControllerModelKeyStateMSFT*              controllerModelKeyState);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to calling #GetControllerModelKeyMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code controllerModelKeyState} <b>must</b> be a pointer to an ##XrControllerModelKeyStateMSFT structure</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrControllerModelKeyStateMSFT
        """,

        XrSession("session", "the specified {@code XrSession}."),
        XrPath("topLevelUserPath", "the top level user path corresponding to the controller render model being queried (e.g. pathname:/user/hand/left or pathname:/user/hand/right)."),
        XrControllerModelKeyStateMSFT.p("controllerModelKeyState", "a pointer to the ##XrControllerModelKeyStateMSFT to write the model key state to.")
    )

    XrResult(
        "LoadControllerModelMSFT",
        """
        Load controller render model.

        <h5>C Specification</h5>
        The #LoadControllerModelMSFT() function loads the controller model as a byte buffer containing a binary form of glTF (a.k.a GLB file format) for the controller. The binary glTF data <b>must</b> conform to glTF 2.0 format defined at <a target="_blank" href="https://github.com/KhronosGroup/glTF/tree/master/specification/2.0">https://github.com/KhronosGroup/glTF/tree/master/specification/2.0</a>.

        <pre><code>
￿XrResult xrLoadControllerModelMSFT(
￿    XrSession                                   session,
￿    XrControllerModelKeyMSFT                    modelKey,
￿    uint32_t                                    bufferCapacityInput,
￿    uint32_t*                                   bufferCountOutput,
￿    uint8_t*                                    buffer);</code></pre>

        <h5>Description</h5>
        The #LoadControllerModelMSFT() function <b>may</b> be a slow operation and therefore <b>should</b> be invoked from a non-timing critical thread.

        If the input {@code modelKey} is invalid, i.e. it is #NULL_CONTROLLER_MODEL_KEY_MSFT or not a key returned from ##XrControllerModelKeyStateMSFT, the runtime <b>must</b> return #ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to calling #LoadControllerModelMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "the specified {@code XrSession}."),
        XrControllerModelKeyMSFT("modelKey", "the model key corresponding to the controller render model being queried."),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", "the capacity of the {@code buffer} array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("bufferCountOutput", "filled in by the runtime with the count of elements in {@code buffer} array, or returns the required capacity in the case that {@code bufferCapacityInput} is 0."),
        nullable..uint8_t.p("buffer", "a pointer to an application-allocated array of the model for the device that will be filled with the {@code uint8_t} values by the runtime. It <b>can</b> be {@code NULL} if {@code bufferCapacityInput} is 0.")
    )

    XrResult(
        "GetControllerModelPropertiesMSFT",
        """
        Get controller model properties.

        <h5>C Specification</h5>
        The #GetControllerModelPropertiesMSFT() function returns the controller model properties for a given {@code modelKey}.

        <pre><code>
￿XrResult xrGetControllerModelPropertiesMSFT(
￿    XrSession                                   session,
￿    XrControllerModelKeyMSFT                    modelKey,
￿    XrControllerModelPropertiesMSFT*            properties);</code></pre>

        <h5>Description</h5>
        The runtime <b>must</b> return the same data in ##XrControllerModelPropertiesMSFT for a valid {@code modelKey}. Therefore, the application <b>can</b> cache the returned ##XrControllerModelPropertiesMSFT using {@code modelKey} and reuse the data for each frame.

        If the input {@code modelKey} is invalid, i.e. it is #NULL_CONTROLLER_MODEL_KEY_MSFT or not a key returned from ##XrControllerModelKeyStateMSFT, the runtime <b>must</b> return #ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to calling #GetControllerModelPropertiesMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code properties} <b>must</b> be a pointer to an ##XrControllerModelPropertiesMSFT structure</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrControllerModelPropertiesMSFT
        """,

        XrSession("session", "the specified {@code XrSession}."),
        XrControllerModelKeyMSFT("modelKey", "a valid model key obtained from ##XrControllerModelKeyStateMSFT"),
        XrControllerModelPropertiesMSFT.p("properties", "an ##XrControllerModelPropertiesMSFT returning the properties of the controller model")
    )

    XrResult(
        "GetControllerModelStateMSFT",
        """
        Get controller model state.

        <h5>C Specification</h5>
        The #GetControllerModelStateMSFT() function returns the current state of the controller model representing user’s interaction to the controller, such as pressing a button or pulling a trigger.

        <pre><code>
￿XrResult xrGetControllerModelStateMSFT(
￿    XrSession                                   session,
￿    XrControllerModelKeyMSFT                    modelKey,
￿    XrControllerModelStateMSFT*                 state);</code></pre>

        <h5>Description</h5>
        The runtime <b>may</b> return different state for a model key after each call to #SyncActions(), which represents the latest state of the user interactions.

        If the input {@code modelKey} is invalid, i.e. it is #NULL_CONTROLLER_MODEL_KEY_MSFT or not a key returned from ##XrControllerModelKeyStateMSFT, the runtime <b>must</b> return #ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to calling #GetControllerModelStateMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code state} <b>must</b> be a pointer to an ##XrControllerModelStateMSFT structure</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrControllerModelStateMSFT
        """,

        XrSession("session", "the specified {@code XrSession}."),
        XrControllerModelKeyMSFT("modelKey", "the model key corresponding to the controller model being queried."),
        XrControllerModelStateMSFT.p("state", "a pointer to ##XrControllerModelNodeStateMSFT returns the current controller model state.")
    )
}