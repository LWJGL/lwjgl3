/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * btScalar (*) (
 *     btSoftBody_AJoint *aJoint,
 *     btScalar current
 * )</code></pre>
 */
public abstract class BTSoftBodyAJointIControlSpeed extends Callback implements BTSoftBodyAJointIControlSpeedI {

    /**
     * Creates a {@code BTSoftBodyAJointIControlSpeed} instance from the specified function pointer.
     *
     * @return the new {@code BTSoftBodyAJointIControlSpeed}
     */
    public static BTSoftBodyAJointIControlSpeed create(long functionPointer) {
        BTSoftBodyAJointIControlSpeedI instance = Callback.get(functionPointer);
        return instance instanceof BTSoftBodyAJointIControlSpeed
            ? (BTSoftBodyAJointIControlSpeed)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTSoftBodyAJointIControlSpeed createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTSoftBodyAJointIControlSpeed} instance that delegates to the specified {@code BTSoftBodyAJointIControlSpeedI} instance. */
    public static BTSoftBodyAJointIControlSpeed create(BTSoftBodyAJointIControlSpeedI instance) {
        return instance instanceof BTSoftBodyAJointIControlSpeed
            ? (BTSoftBodyAJointIControlSpeed)instance
            : new Container(instance.address(), instance);
    }

    protected BTSoftBodyAJointIControlSpeed() {
        super(SIGNATURE);
    }

    BTSoftBodyAJointIControlSpeed(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTSoftBodyAJointIControlSpeed {

        private final BTSoftBodyAJointIControlSpeedI delegate;

        Container(long functionPointer, BTSoftBodyAJointIControlSpeedI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long aJoint, float current) {
            return delegate.invoke(aJoint, current);
        }

    }

}