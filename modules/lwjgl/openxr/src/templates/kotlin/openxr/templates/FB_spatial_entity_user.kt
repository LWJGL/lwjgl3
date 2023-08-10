/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_user = "FBSpatialEntityUser".nativeClassXR("FB_spatial_entity_user", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_spatial_entity_user">XR_FB_spatial_entity_user</a> extension.

        This extension enables creation and management of user objects which <b>can</b> be used by the application to reference a user other than the current user.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_spatial_entity_user_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_SPATIAL_ENTITY_USER_EXTENSION_NAME".."XR_FB_spatial_entity_user"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPACE_USER_CREATE_INFO_FB".."1000241001"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_SPACE_USER_FB".."1000241000"
    )

    XrResult(
        "CreateSpaceUserFB",
        """
        Creates a user other than the current user.

        <h5>C Specification</h5>
        The #CreateSpaceUserFB() function is defined as:

        <pre><code>
￿XrResult xrCreateSpaceUserFB(
￿    XrSession                                   session,
￿    const XrSpaceUserCreateInfoFB*              info,
￿    XrSpaceUserFB*                              user);</code></pre>

        <h5>Description</h5>
        The application <b>can</b> use this function to create a user handle with which it <b>can</b> then interact, such as sharing {@code XrSpace} objects.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityUser XR_FB_spatial_entity_user} extension <b>must</b> be enabled prior to calling #CreateSpaceUserFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrSpaceUserCreateInfoFB structure</li>
            <li>{@code user} <b>must</b> be a pointer to an {@code XrSpaceUserFB} handle</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpaceUserCreateInfoFB
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpaceUserCreateInfoFB.const.p("info", "a pointer to an ##XrSpaceUserCreateInfoFB structure containing information to create the user handle."),
        Check(1)..XrSpaceUserFB.p("user", "the output parameter that points to the handle of the user being created.")
    )

    XrResult(
        "GetSpaceUserIdFB",
        """
        Gets the user ID for a given user handle.

        <h5>C Specification</h5>
        The #GetSpaceUserIdFB() function is defined as:

        <pre><code>
￿XrResult xrGetSpaceUserIdFB(
￿    XrSpaceUserFB                               user,
￿    XrSpaceUserIdFB*                            userId);</code></pre>

        <h5>Description</h5>
        The application <b>can</b> use this function to retrieve the user ID of a given user handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityUser XR_FB_spatial_entity_user} extension <b>must</b> be enabled prior to calling #GetSpaceUserIdFB()</li>
            <li>{@code user} <b>must</b> be a valid {@code XrSpaceUserFB} handle</li>
            <li>{@code userId} <b>must</b> be a pointer to an {@code XrSpaceUserIdFB} value</li>
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
            </ul></dd>
        </dl>
        """,

        XrSpaceUserFB("user", "a handle to an {@code XrSpaceUserFB}."),
        Check(1)..XrSpaceUserIdFB.p("userId", "the output parameter that points to the user ID of the user.")
    )

    XrResult(
        "DestroySpaceUserFB",
        """
        Destroys a user handle.

        <h5>C Specification</h5>
        The #DestroySpaceUserFB() function is defined as:

        <pre><code>
￿XrResult xrDestroySpaceUserFB(
￿    XrSpaceUserFB                               user);</code></pre>

        <h5>Description</h5>
        The application <b>should</b> use this function to release resources tied to a given {@code XrSpaceUserFB} once the application no longer needs to reference the user.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityUser XR_FB_spatial_entity_user} extension <b>must</b> be enabled prior to calling #DestroySpaceUserFB()</li>
            <li>{@code user} <b>must</b> be a valid {@code XrSpaceUserFB} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code user}, and any child handles, <b>must</b> be externally synchronized</li>
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
            </ul></dd>
        </dl>
        """,

        XrSpaceUserFB("user", "a handle to the user object to be destroyed.")
    )
}