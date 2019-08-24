/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class BTSoftBodyRigidBodyCollisionConfiguration {

    protected BTSoftBodyRigidBodyCollisionConfiguration() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SoftBodyRigidBodyCollisionConfiguration_new  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyRigidBodyCollisionConfiguration_new"),
            SoftBodyRigidBodyCollisionConfiguration_new2 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyRigidBodyCollisionConfiguration_new2");

    }

    // --- [ btSoftBodyRigidBodyCollisionConfiguration_new ] ---

    @NativeType("void *")
    public static long btSoftBodyRigidBodyCollisionConfiguration_new() {
        long __functionAddress = Functions.SoftBodyRigidBodyCollisionConfiguration_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBodyRigidBodyCollisionConfiguration_new2 ] ---

    @NativeType("void *")
    public static long btSoftBodyRigidBodyCollisionConfiguration_new2(@NativeType("void *") long constructionInfo) {
        long __functionAddress = Functions.SoftBodyRigidBodyCollisionConfiguration_new2;
        if (CHECKS) {
            check(constructionInfo);
        }
        return invokePP(constructionInfo, __functionAddress);
    }

}