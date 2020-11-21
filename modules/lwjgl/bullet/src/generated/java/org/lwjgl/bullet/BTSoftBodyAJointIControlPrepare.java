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
 * void (*) (
 *     btSoftBody_AJoint *aJoint
 * )</code></pre>
 */
public abstract class BTSoftBodyAJointIControlPrepare extends Callback implements BTSoftBodyAJointIControlPrepareI {

    /**
     * Creates a {@code BTSoftBodyAJointIControlPrepare} instance from the specified function pointer.
     *
     * @return the new {@code BTSoftBodyAJointIControlPrepare}
     */
    public static BTSoftBodyAJointIControlPrepare create(long functionPointer) {
        BTSoftBodyAJointIControlPrepareI instance = Callback.get(functionPointer);
        return instance instanceof BTSoftBodyAJointIControlPrepare
            ? (BTSoftBodyAJointIControlPrepare)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTSoftBodyAJointIControlPrepare createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTSoftBodyAJointIControlPrepare} instance that delegates to the specified {@code BTSoftBodyAJointIControlPrepareI} instance. */
    public static BTSoftBodyAJointIControlPrepare create(BTSoftBodyAJointIControlPrepareI instance) {
        return instance instanceof BTSoftBodyAJointIControlPrepare
            ? (BTSoftBodyAJointIControlPrepare)instance
            : new Container(instance.address(), instance);
    }

    protected BTSoftBodyAJointIControlPrepare() {
        super(SIGNATURE);
    }

    BTSoftBodyAJointIControlPrepare(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTSoftBodyAJointIControlPrepare {

        private final BTSoftBodyAJointIControlPrepareI delegate;

        Container(long functionPointer, BTSoftBodyAJointIControlPrepareI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long aJoint) {
            delegate.invoke(aJoint);
        }

    }

}