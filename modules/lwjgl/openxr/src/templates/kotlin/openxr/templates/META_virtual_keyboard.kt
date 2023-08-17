/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_virtual_keyboard = "METAVirtualKeyboard".nativeClassXR("META_virtual_keyboard", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_META_virtual_keyboard">XR_META_virtual_keyboard</a> extension.

        The virtual keyboard extension provides a system-driven localized keyboard that the application has full control over in terms of positioning and rendering.

        This is achieved by giving the application the data required to drive rendering and animation of the keyboard in response to interaction data passed from the application to the runtime.

        This approach is an alternative to a potential system keyboard overlay solution and provides a keyboard that can seamlessly blend into the application environment, since it is rendered by the same system, and avoids input focus issues that might come with a system overlay.

        The API is also designed to work with custom hand and/or controller models in various games and applications.
        """

    IntConstant(
        "The extension specification version.",

        "META_virtual_keyboard_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_VIRTUAL_KEYBOARD_EXTENSION_NAME".."XR_META_virtual_keyboard"
    )

    EnumConstant(
        "XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META",

        "MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META".."3992"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_VIRTUAL_KEYBOARD_META".."1000219000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META".."1000219001",
        "TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META".."1000219002",
        "TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META".."1000219003",
        "TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META".."1000219004",
        "TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META".."1000219005",
        "TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META".."1000219006",
        "TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META".."1000219007",
        "TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META".."1000219009",
        "TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META".."1000219010",
        "TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META".."1000219011",
        "TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META".."1000219014",
        "TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META".."1000219015",
        "TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META".."1000219016",
        "TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_SHOWN_META".."1000219017",
        "TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_HIDDEN_META".."1000219018"
    )

    EnumConstant(
        """
        XrVirtualKeyboardLocationTypeMETA - Enum describing keyboard placement types

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META Indicates that the application will provide the position and scale of the keyboard.</li>
            <li>#VIRTUAL_KEYBOARD_LOCATION_TYPE_FAR_META Indicates that the runtime will set the position and scale for far field keyboard.</li>
            <li>#VIRTUAL_KEYBOARD_LOCATION_TYPE_DIRECT_META Indicates that the runtime will set the position and scale for direct interaction keyboard.</li>
        </ul>

        <h5>See Also</h5>
        ##XrVirtualKeyboardLocationInfoMETA, ##XrVirtualKeyboardSpaceCreateInfoMETA
        """,

        "VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META".."0",
        "VIRTUAL_KEYBOARD_LOCATION_TYPE_FAR_META".."1",
        "VIRTUAL_KEYBOARD_LOCATION_TYPE_DIRECT_META".."2"
    )

    EnumConstant(
        """
        XrVirtualKeyboardInputSourceMETA - Enum describing keyboard input source types

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_LEFT_META</td><td>Left controller ray.</td></tr>
                <tr><td>#VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_RIGHT_META</td><td>Right controller ray.</td></tr>
                <tr><td>#VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_LEFT_META</td><td>Left hand ray.</td></tr>
                <tr><td>#VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_RIGHT_META</td><td>Right hand ray.</td></tr>
                <tr><td>#VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_LEFT_META</td><td>Left controller direct touch.</td></tr>
                <tr><td>#VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_RIGHT_META</td><td>Right controller direct touch.</td></tr>
                <tr><td>#VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_LEFT_META</td><td>Left hand direct touch.</td></tr>
                <tr><td>#VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_RIGHT_META</td><td>Right hand direct touch.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrVirtualKeyboardInputInfoMETA
        """,

        "VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_LEFT_META".."1",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_RIGHT_META".."2",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_LEFT_META".."3",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_RIGHT_META".."4",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_LEFT_META".."5",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_RIGHT_META".."6",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_LEFT_META".."7",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_RIGHT_META".."8"
    )

    EnumConstant(
        """
        XrVirtualKeyboardInputStateFlagBitsMETA - XrVirtualKeyboardInputStateFlagBitsMETA

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#VIRTUAL_KEYBOARD_INPUT_STATE_PRESSED_BIT_META — If the input source is considered 'pressed' at all. Pinch for hands, Primary button for controllers.</li>
        </ul>
        """,

        "VIRTUAL_KEYBOARD_INPUT_STATE_PRESSED_BIT_META".enum(0x00000001)
    )

    XrResult(
        "CreateVirtualKeyboardMETA",
        """
        Create a virtual keyboard.

        <h5>C Specification</h5>
        The #CreateVirtualKeyboardMETA() function is defined as:

        <pre><code>
￿XrResult xrCreateVirtualKeyboardMETA(
￿    XrSession                                   session,
￿    const XrVirtualKeyboardCreateInfoMETA*      createInfo,
￿    XrVirtualKeyboardMETA*                      keyboard);</code></pre>

        <h5>Description</h5>
        #CreateVirtualKeyboardMETA() creates an {@code XrVirtualKeyboardMETA} handle and establishes a keyboard within the runtime {@code XrSession}. The returned virtual keyboard handle <b>may</b> be subsequently used in API calls.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling #CreateVirtualKeyboardMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrVirtualKeyboardCreateInfoMETA structure</li>
            <li>{@code keyboard} <b>must</b> be a pointer to an {@code XrVirtualKeyboardMETA} handle</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVirtualKeyboardCreateInfoMETA
        """,

        XrSession("session", "the {@code XrSession}."),
        XrVirtualKeyboardCreateInfoMETA.const.p("createInfo", "the ##XrVirtualKeyboardCreateInfoMETA."),
        Check(1)..XrVirtualKeyboardMETA.p("keyboard", "the returned {@code XrVirtualKeyboardMETA}.")
    )

    XrResult(
        "DestroyVirtualKeyboardMETA",
        """
        Destroy a virtual keyboard.

        <h5>C Specification</h5>
        The #DestroyVirtualKeyboardMETA() function is defined as:

        <pre><code>
￿XrResult xrDestroyVirtualKeyboardMETA(
￿    XrVirtualKeyboardMETA                       keyboard);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling #DestroyVirtualKeyboardMETA()</li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code keyboard}, and any child handles, <b>must</b> be externally synchronized</li>
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

        XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} handle to the keyboard to destroy.")
    )

    XrResult(
        "CreateVirtualKeyboardSpaceMETA",
        """
        Create a virtual keyboard space.

        <h5>C Specification</h5>
        The #CreateVirtualKeyboardSpaceMETA() function is defined as:

        <pre><code>
￿XrResult xrCreateVirtualKeyboardSpaceMETA(
￿    XrSession                                   session,
￿    XrVirtualKeyboardMETA                       keyboard,
￿    const XrVirtualKeyboardSpaceCreateInfoMETA* createInfo,
￿    XrSpace*                                    keyboardSpace);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrSpace} handle and places the keyboard in this space. The returned space handle <b>may</b> be subsequently used in API calls.

        Once placed, the application <b>should</b> query the keyboard’s location each frame using #LocateSpace(). It is important to do this every frame as the runtime is in control of the keyboard’s movement.

        The runtime <b>must</b> return #ERROR_HANDLE_INVALID if {@code session} is different than what is used to create {@code keyboard}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling #CreateVirtualKeyboardSpaceMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrVirtualKeyboardSpaceCreateInfoMETA structure</li>
            <li>{@code keyboardSpace} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
            <li>{@code keyboard} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVirtualKeyboardSpaceCreateInfoMETA
        """,

        XrSession("session", "the {@code XrSession}."),
        XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} handle."),
        XrVirtualKeyboardSpaceCreateInfoMETA.const.p("createInfo", "the ##XrVirtualKeyboardSpaceCreateInfoMETA."),
        Check(1)..XrSpace.p("keyboardSpace", "the returned space handle.")
    )

    XrResult(
        "SuggestVirtualKeyboardLocationMETA",
        """
        Suggest a virtual keyboard location.

        <h5>C Specification</h5>
        The #SuggestVirtualKeyboardLocationMETA() function is defined as:

        <pre><code>
￿XrResult xrSuggestVirtualKeyboardLocationMETA(
￿    XrVirtualKeyboardMETA                       keyboard,
￿    const XrVirtualKeyboardLocationInfoMETA*    locationInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling #SuggestVirtualKeyboardLocationMETA()</li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
            <li>{@code locationInfo} <b>must</b> be a pointer to a valid ##XrVirtualKeyboardLocationInfoMETA structure</li>
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
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVirtualKeyboardLocationInfoMETA
        """,

        XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} handle."),
        XrVirtualKeyboardLocationInfoMETA.const.p("locationInfo", "the desired ##XrVirtualKeyboardLocationInfoMETA.")
    )

    XrResult(
        "GetVirtualKeyboardScaleMETA",
        """
        Get virtual keyboard scale.

        <h5>C Specification</h5>
        The #GetVirtualKeyboardScaleMETA() function is defined as:

        <pre><code>
￿XrResult xrGetVirtualKeyboardScaleMETA(
￿    XrVirtualKeyboardMETA                       keyboard,
￿    float*                                      scale);</code></pre>

        <h5>Description</h5>
        With both the pose and scale, the application has all the information to draw the virtual keyboard render model.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling #GetVirtualKeyboardScaleMETA()</li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
            <li>{@code scale} <b>must</b> be a pointer to a {@code float} value</li>
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
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} handle."),
        Check(1)..float.p("scale", "a float value of the current scale of the keyboard.")
    )

    XrResult(
        "SetVirtualKeyboardModelVisibilityMETA",
        """
        Set virtual keyboard model visibility.

        <h5>C Specification</h5>
        The #SetVirtualKeyboardModelVisibilityMETA() function is defined as:

        <pre><code>
￿XrResult xrSetVirtualKeyboardModelVisibilityMETA(
￿    XrVirtualKeyboardMETA                       keyboard,
￿    const XrVirtualKeyboardModelVisibilitySetInfoMETA* modelVisibility);</code></pre>

        <h5>Description</h5>
        Note that the runtime has final control of the model visibility. The runtime <b>may</b> also change the visible state in certain situations. To get the actual visibility state of the render model, the application <b>should</b> wait for the ##XrEventDataVirtualKeyboardShownMETA and ##XrEventDataVirtualKeyboardHiddenMETA events.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling #SetVirtualKeyboardModelVisibilityMETA()</li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
            <li>{@code modelVisibility} <b>must</b> be a pointer to a valid ##XrVirtualKeyboardModelVisibilitySetInfoMETA structure</li>
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
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVirtualKeyboardModelVisibilitySetInfoMETA
        """,

        XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} handle."),
        XrVirtualKeyboardModelVisibilitySetInfoMETA.const.p("modelVisibility", "the ##XrVirtualKeyboardModelVisibilitySetInfoMETA.")
    )

    XrResult(
        "GetVirtualKeyboardModelAnimationStatesMETA",
        """
        Get model animation states.

        <h5>C Specification</h5>
        The #GetVirtualKeyboardModelAnimationStatesMETA() function is defined as:

        <pre><code>
￿XrResult xrGetVirtualKeyboardModelAnimationStatesMETA(
￿    XrVirtualKeyboardMETA                       keyboard,
￿    XrVirtualKeyboardModelAnimationStatesMETA*  animationStates);</code></pre>

        <h5>Description</h5>
        This function follows the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#buffer-size-parameters">two-call idiom</a> for filling the {@code states} array in the ##XrVirtualKeyboardModelAnimationStatesMETA structure. Note that new animations may be added after the runtime processes inputs from #SendVirtualKeyboardInputMETA(). Therefore, after sending new keyboard inputs the application <b>should</b> query the buffer size again before getting any animation data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling #GetVirtualKeyboardModelAnimationStatesMETA()</li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
            <li>{@code animationStates} <b>must</b> be a pointer to an ##XrVirtualKeyboardModelAnimationStatesMETA structure</li>
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
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVirtualKeyboardModelAnimationStatesMETA
        """,

        XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} handle."),
        XrVirtualKeyboardModelAnimationStatesMETA.p("animationStates", "the ##XrVirtualKeyboardModelAnimationStatesMETA.")
    )

    XrResult(
        "GetVirtualKeyboardDirtyTexturesMETA",
        """
        Get model textures that are dirty.

        <h5>C Specification</h5>
        The #GetVirtualKeyboardDirtyTexturesMETA() function is defined as:

        <pre><code>
￿XrResult xrGetVirtualKeyboardDirtyTexturesMETA(
￿    XrVirtualKeyboardMETA                       keyboard,
￿    uint32_t                                    textureIdCapacityInput,
￿    uint32_t*                                   textureIdCountOutput,
￿    uint64_t*                                   textureIds);</code></pre>

        <h5>Description</h5>
        This function follows the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#buffer-size-parameters">two-call idiom</a> for filling the {@code textureIds} array. Note that new texture data may be added after the runtime processes inputs from #SendVirtualKeyboardInputMETA(). Therefore, after sending new keyboard inputs the application <b>should</b> query the buffer size again before getting any texture data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling #GetVirtualKeyboardDirtyTexturesMETA()</li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
            <li>{@code textureIdCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code textureIdCapacityInput} is not 0, {@code textureIds} <b>must</b> be a pointer to an array of {@code textureIdCapacityInput} {@code uint64_t} values</li>
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
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} handle."),
        AutoSize("textureIds")..uint32_t("textureIdCapacityInput", "the capacity of the {@code textureIds} array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("textureIdCountOutput", "filled in by the runtime with the count of texture IDs written or the required capacity in the case that {@code textureIdCapacityInput} is insufficient."),
        nullable..uint64_t.p("textureIds", "the array of texture IDs that need to be updated.")
    )

    XrResult(
        "GetVirtualKeyboardTextureDataMETA",
        """
        Get the data to update a model texture.

        <h5>C Specification</h5>
        The #GetVirtualKeyboardTextureDataMETA() function is defined as:

        <pre><code>
￿XrResult xrGetVirtualKeyboardTextureDataMETA(
￿    XrVirtualKeyboardMETA                       keyboard,
￿    uint64_t                                    textureId,
￿    XrVirtualKeyboardTextureDataMETA*           textureData);</code></pre>

        <h5>Description</h5>
        This function follows the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#buffer-size-parameters">two-call idiom</a> for filling the {@code textureBytes} array in the ##XrVirtualKeyboardTextureDataMETA structure. Note that new texture data may be added after the runtime processes inputs from #SendVirtualKeyboardInputMETA(). Therefore, after sending new keyboard inputs the application <b>should</b> query the buffer size again before getting any texture data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling #GetVirtualKeyboardTextureDataMETA()</li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
            <li>{@code textureData} <b>must</b> be a pointer to an ##XrVirtualKeyboardTextureDataMETA structure</li>
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
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVirtualKeyboardTextureDataMETA
        """,

        XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} handle."),
        uint64_t("textureId", "the ID of the texture that the application is querying data for."),
        XrVirtualKeyboardTextureDataMETA.p("textureData", "the returned ##XrVirtualKeyboardTextureDataMETA.")
    )

    XrResult(
        "SendVirtualKeyboardInputMETA",
        """
        Send virtual keyboard input.

        <h5>C Specification</h5>
        The #SendVirtualKeyboardInputMETA() function is defined as:

        <pre><code>
￿XrResult xrSendVirtualKeyboardInputMETA(
￿    XrVirtualKeyboardMETA                       keyboard,
￿    const XrVirtualKeyboardInputInfoMETA*       info,
￿    XrPosef*                                    interactorRootPose);</code></pre>

        <h5>Description</h5>
        The application <b>can</b> use values like a pointer pose as the {@code inputPoseInSpace} for {@code XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_*} or {@code XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_*} input sources, a point on a controller model for {@code XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_*} input sources and the hand index tip pose for {@code XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_*}. Different input poses can be used to accommodate application specific controller or hand models.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling #SendVirtualKeyboardInputMETA()</li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrVirtualKeyboardInputInfoMETA structure</li>
            <li>{@code interactorRootPose} <b>must</b> be a pointer to an ##XrPosef structure</li>
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
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPosef, ##XrVirtualKeyboardInputInfoMETA
        """,

        XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} handle."),
        XrVirtualKeyboardInputInfoMETA.const.p("info", "the ##XrVirtualKeyboardInputInfoMETA detailing the input being sent to the runtime."),
        XrPosef.p("interactorRootPose", "an ##XrPosef defining the root pose of the input source. The runtime <b>may</b> modify this value to aid keyboard input perception.")
    )

    XrResult(
        "ChangeVirtualKeyboardTextContextMETA",
        """
        Change virtual keyboard text context.

        <h5>C Specification</h5>
        The #ChangeVirtualKeyboardTextContextMETA() function is defined as:

        <pre><code>
￿XrResult xrChangeVirtualKeyboardTextContextMETA(
￿    XrVirtualKeyboardMETA                       keyboard,
￿    const XrVirtualKeyboardTextContextChangeInfoMETA* changeInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to calling #ChangeVirtualKeyboardTextContextMETA()</li>
            <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
            <li>{@code changeInfo} <b>must</b> be a pointer to a valid ##XrVirtualKeyboardTextContextChangeInfoMETA structure</li>
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
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVirtualKeyboardTextContextChangeInfoMETA
        """,

        XrVirtualKeyboardMETA("keyboard", "the {@code XrVirtualKeyboardMETA} handle."),
        XrVirtualKeyboardTextContextChangeInfoMETA.const.p("changeInfo", "")
    )
}