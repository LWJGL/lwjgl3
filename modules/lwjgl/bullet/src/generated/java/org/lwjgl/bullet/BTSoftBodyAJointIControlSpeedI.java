/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * btScalar (*) (
 *     btSoftBody_AJoint *aJoint,
 *     btScalar current
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("p_btSoftBody_AJoint_IControl_Speed")
public interface BTSoftBodyAJointIControlSpeedI extends CallbackI.F {

    String SIGNATURE = "(pf)f";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default float callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgFloat(args)
        );
    }

    @NativeType("btScalar") float invoke(@NativeType("btSoftBody_AJoint *") long aJoint, @NativeType("btScalar") float current);

}