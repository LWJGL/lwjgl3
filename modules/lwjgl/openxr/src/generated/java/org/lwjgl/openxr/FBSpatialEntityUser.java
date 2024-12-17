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

public class FBSpatialEntityUser {

    public static final int XR_FB_spatial_entity_user_SPEC_VERSION = 1;

    public static final String XR_FB_SPATIAL_ENTITY_USER_EXTENSION_NAME = "XR_FB_spatial_entity_user";

    public static final int XR_TYPE_SPACE_USER_CREATE_INFO_FB = 1000241001;

    public static final int XR_OBJECT_TYPE_SPACE_USER_FB = 1000241000;

    protected FBSpatialEntityUser() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpaceUserFB ] ---

    /** {@code XrResult xrCreateSpaceUserFB(XrSession session, XrSpaceUserCreateInfoFB const * info, XrSpaceUserFB * user)} */
    public static int nxrCreateSpaceUserFB(XrSession session, long info, long user) {
        long __functionAddress = session.getCapabilities().xrCreateSpaceUserFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, user, __functionAddress);
    }

    /** {@code XrResult xrCreateSpaceUserFB(XrSession session, XrSpaceUserCreateInfoFB const * info, XrSpaceUserFB * user)} */
    @NativeType("XrResult")
    public static int xrCreateSpaceUserFB(XrSession session, @NativeType("XrSpaceUserCreateInfoFB const *") XrSpaceUserCreateInfoFB info, @NativeType("XrSpaceUserFB *") PointerBuffer user) {
        if (CHECKS) {
            check(user, 1);
        }
        return nxrCreateSpaceUserFB(session, info.address(), memAddress(user));
    }

    // --- [ xrGetSpaceUserIdFB ] ---

    /** {@code XrResult xrGetSpaceUserIdFB(XrSpaceUserFB user, XrSpaceUserIdFB * userId)} */
    public static int nxrGetSpaceUserIdFB(XrSpaceUserFB user, long userId) {
        long __functionAddress = user.getCapabilities().xrGetSpaceUserIdFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(user.address(), userId, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceUserIdFB(XrSpaceUserFB user, XrSpaceUserIdFB * userId)} */
    @NativeType("XrResult")
    public static int xrGetSpaceUserIdFB(XrSpaceUserFB user, @NativeType("XrSpaceUserIdFB *") LongBuffer userId) {
        if (CHECKS) {
            check(userId, 1);
        }
        return nxrGetSpaceUserIdFB(user, memAddress(userId));
    }

    // --- [ xrDestroySpaceUserFB ] ---

    /** {@code XrResult xrDestroySpaceUserFB(XrSpaceUserFB user)} */
    @NativeType("XrResult")
    public static int xrDestroySpaceUserFB(XrSpaceUserFB user) {
        long __functionAddress = user.getCapabilities().xrDestroySpaceUserFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(user.address(), __functionAddress);
    }

}