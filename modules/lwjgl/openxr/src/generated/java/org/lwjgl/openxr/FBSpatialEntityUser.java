/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_spatial_entity_user">XR_FB_spatial_entity_user</a> extension.
 * 
 * <p>This extension enables creation and management of user objects which <b>can</b> be used by the application to reference a user other than the current user.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public class FBSpatialEntityUser {

    /** The extension specification version. */
    public static final int XR_FB_spatial_entity_user_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_SPATIAL_ENTITY_USER_EXTENSION_NAME = "XR_FB_spatial_entity_user";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_SPACE_USER_CREATE_INFO_FB = 1000241001;

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_SPACE_USER_FB = 1000241000;

    protected FBSpatialEntityUser() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpaceUserFB ] ---

    /** Unsafe version of: {@link #xrCreateSpaceUserFB CreateSpaceUserFB} */
    public static int nxrCreateSpaceUserFB(XrSession session, long info, long user) {
        long __functionAddress = session.getCapabilities().xrCreateSpaceUserFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, user, __functionAddress);
    }

    /**
     * Creates a user other than the current user.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSpaceUserFB CreateSpaceUserFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpaceUserFB(
     *     XrSession                                   session,
     *     const XrSpaceUserCreateInfoFB*              info,
     *     XrSpaceUserFB*                              user);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>can</b> use this function to create a user handle with which it <b>can</b> then interact, such as sharing {@code XrSpace} objects.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntityUser XR_FB_spatial_entity_user} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpaceUserFB CreateSpaceUserFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrSpaceUserCreateInfoFB} structure</li>
     * <li>{@code user} <b>must</b> be a pointer to an {@code XrSpaceUserFB} handle</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceUserCreateInfoFB}</p>
     *
     * @param session a handle to an {@code XrSession}.
     * @param info    a pointer to an {@link XrSpaceUserCreateInfoFB} structure containing information to create the user handle.
     * @param user    the output parameter that points to the handle of the user being created.
     */
    @NativeType("XrResult")
    public static int xrCreateSpaceUserFB(XrSession session, @NativeType("XrSpaceUserCreateInfoFB const *") XrSpaceUserCreateInfoFB info, @NativeType("XrSpaceUserFB *") PointerBuffer user) {
        if (CHECKS) {
            check(user, 1);
        }
        return nxrCreateSpaceUserFB(session, info.address(), memAddress(user));
    }

    // --- [ xrGetSpaceUserIdFB ] ---

    /** Unsafe version of: {@link #xrGetSpaceUserIdFB GetSpaceUserIdFB} */
    public static int nxrGetSpaceUserIdFB(XrSpaceUserFB user, long userId) {
        long __functionAddress = user.getCapabilities().xrGetSpaceUserIdFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(user.address(), userId, __functionAddress);
    }

    /**
     * Gets the user ID for a given user handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpaceUserIdFB GetSpaceUserIdFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpaceUserIdFB(
     *     XrSpaceUserFB                               user,
     *     XrSpaceUserIdFB*                            userId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>can</b> use this function to retrieve the user ID of a given user handle.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntityUser XR_FB_spatial_entity_user} extension <b>must</b> be enabled prior to calling {@link #xrGetSpaceUserIdFB GetSpaceUserIdFB}</li>
     * <li>{@code user} <b>must</b> be a valid {@code XrSpaceUserFB} handle</li>
     * <li>{@code userId} <b>must</b> be a pointer to an {@code XrSpaceUserIdFB} value</li>
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
     * </ul></dd>
     * </dl>
     *
     * @param user   a handle to an {@code XrSpaceUserFB}.
     * @param userId the output parameter that points to the user ID of the user.
     */
    @NativeType("XrResult")
    public static int xrGetSpaceUserIdFB(XrSpaceUserFB user, @NativeType("XrSpaceUserIdFB *") LongBuffer userId) {
        if (CHECKS) {
            check(userId, 1);
        }
        return nxrGetSpaceUserIdFB(user, memAddress(userId));
    }

    // --- [ xrDestroySpaceUserFB ] ---

    /**
     * Destroys a user handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroySpaceUserFB DestroySpaceUserFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroySpaceUserFB(
     *     XrSpaceUserFB                               user);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>should</b> use this function to release resources tied to a given {@code XrSpaceUserFB} once the application no longer needs to reference the user.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntityUser XR_FB_spatial_entity_user} extension <b>must</b> be enabled prior to calling {@link #xrDestroySpaceUserFB DestroySpaceUserFB}</li>
     * <li>{@code user} <b>must</b> be a valid {@code XrSpaceUserFB} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code user}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * </ul></dd>
     * </dl>
     *
     * @param user a handle to the user object to be destroyed.
     */
    @NativeType("XrResult")
    public static int xrDestroySpaceUserFB(XrSpaceUserFB user) {
        long __functionAddress = user.getCapabilities().xrDestroySpaceUserFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(user.address(), __functionAddress);
    }

}