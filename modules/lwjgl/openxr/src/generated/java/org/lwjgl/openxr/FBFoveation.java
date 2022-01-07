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

/** The FB_foveation extension. */
public class FBFoveation {

    /** The extension specification version. */
    public static final int XR_FB_foveation_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_FOVEATION_EXTENSION_NAME = "XR_FB_foveation";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_FOVEATION_PROFILE_FB = 1000114000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_FOVEATION_PROFILE_CREATE_INFO_FB TYPE_FOVEATION_PROFILE_CREATE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_SWAPCHAIN_CREATE_INFO_FOVEATION_FB TYPE_SWAPCHAIN_CREATE_INFO_FOVEATION_FB}</li>
     * <li>{@link #XR_TYPE_SWAPCHAIN_STATE_FOVEATION_FB TYPE_SWAPCHAIN_STATE_FOVEATION_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_FOVEATION_PROFILE_CREATE_INFO_FB   = 1000114000,
        XR_TYPE_SWAPCHAIN_CREATE_INFO_FOVEATION_FB = 1000114001,
        XR_TYPE_SWAPCHAIN_STATE_FOVEATION_FB       = 1000114002;

    /**
     * XrSwapchainCreateFoveationFlagBitsFB
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_SWAPCHAIN_CREATE_FOVEATION_SCALED_BIN_BIT_FB SWAPCHAIN_CREATE_FOVEATION_SCALED_BIN_BIT_FB}</li>
     * <li>{@link #XR_SWAPCHAIN_CREATE_FOVEATION_FRAGMENT_DENSITY_MAP_BIT_FB SWAPCHAIN_CREATE_FOVEATION_FRAGMENT_DENSITY_MAP_BIT_FB}</li>
     * </ul>
     */
    public static final int
        XR_SWAPCHAIN_CREATE_FOVEATION_SCALED_BIN_BIT_FB           = 0x1,
        XR_SWAPCHAIN_CREATE_FOVEATION_FRAGMENT_DENSITY_MAP_BIT_FB = 0x2;

    protected FBFoveation() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateFoveationProfileFB ] ---

    /** Unsafe version of: {@link #xrCreateFoveationProfileFB CreateFoveationProfileFB} */
    public static int nxrCreateFoveationProfileFB(XrSession session, long createInfo, long profile) {
        long __functionAddress = session.getCapabilities().xrCreateFoveationProfileFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, profile, __functionAddress);
    }

    /**
     * Create a foveation profile.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateFoveationProfileFB CreateFoveationProfileFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateFoveationProfileFB(
     *     XrSession                                   session,
     *     const XrFoveationProfileCreateInfoFB*       createInfo,
     *     XrFoveationProfileFB*                       profile);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrFoveationProfileFB} handle. The returned foveation profile handle <b>may</b> be subsequently used in API calls.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBFoveation XR_FB_foveation} extension <b>must</b> be enabled prior to calling {@link #xrCreateFoveationProfileFB CreateFoveationProfileFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrFoveationProfileCreateInfoFB} structure</li>
     * <li>{@code profile} <b>must</b> be a pointer to an {@code XrFoveationProfileFB} handle</li>
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
     * <p>{@link XrFoveationProfileCreateInfoFB}</p>
     *
     * @param session    the {@code XrSession} that created the swapchains to which this foveation profile will be applied.
     * @param createInfo a pointer to an {@link XrFoveationProfileCreateInfoFB} structure containing parameters to be used to create the foveation profile.
     * @param profile    a pointer to a handle in which the created {@code XrFoveationProfileFB} is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateFoveationProfileFB(XrSession session, @NativeType("XrFoveationProfileCreateInfoFB const *") XrFoveationProfileCreateInfoFB createInfo, @NativeType("XrFoveationProfileFB *") PointerBuffer profile) {
        if (CHECKS) {
            check(profile, 1);
        }
        return nxrCreateFoveationProfileFB(session, createInfo.address(), memAddress(profile));
    }

    // --- [ xrDestroyFoveationProfileFB ] ---

    /**
     * Destroy a foveation profile.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyFoveationProfileFB DestroyFoveationProfileFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyFoveationProfileFB(
     *     XrFoveationProfileFB                        profile);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code XrFoveationProfileFB} handles are destroyed using {@link #xrDestroyFoveationProfileFB DestroyFoveationProfileFB}. A {@code XrFoveationProfileFB} <b>may</b> be safely destroyed after being applied to a swapchain state using {@link FBSwapchainUpdateState#xrUpdateSwapchainFB UpdateSwapchainFB} without affecting the foveation parameters of the swapchain. The application is responsible for ensuring that it has no calls using profile in progress when the foveation profile is destroyed.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBFoveation XR_FB_foveation} extension <b>must</b> be enabled prior to calling {@link #xrDestroyFoveationProfileFB DestroyFoveationProfileFB}</li>
     * <li>{@code profile} <b>must</b> be a valid {@code XrFoveationProfileFB} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code profile}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * @param profile the {@code XrFoveationProfileFB} to destroy.
     */
    @NativeType("XrResult")
    public static int xrDestroyFoveationProfileFB(XrFoveationProfileFB profile) {
        long __functionAddress = profile.getCapabilities().xrDestroyFoveationProfileFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(profile.address(), __functionAddress);
    }

}