/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * YGNodeRef (*) (
 *     YGNodeRef oldNode,
 *     YGNodeRef owner,
 *     int childIndex
 * )</code></pre>
 */
public abstract class YGCloneNodeFunc extends Callback implements YGCloneNodeFuncI {

    /**
     * Creates a {@code YGCloneNodeFunc} instance from the specified function pointer.
     *
     * @return the new {@code YGCloneNodeFunc}
     */
    public static YGCloneNodeFunc create(long functionPointer) {
        YGCloneNodeFuncI instance = Callback.get(functionPointer);
        return instance instanceof YGCloneNodeFunc
            ? (YGCloneNodeFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static YGCloneNodeFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code YGCloneNodeFunc} instance that delegates to the specified {@code YGCloneNodeFuncI} instance. */
    public static YGCloneNodeFunc create(YGCloneNodeFuncI instance) {
        return instance instanceof YGCloneNodeFunc
            ? (YGCloneNodeFunc)instance
            : new Container(instance.address(), instance);
    }

    protected YGCloneNodeFunc() {
        super(CIF);
    }

    YGCloneNodeFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends YGCloneNodeFunc {

        private final YGCloneNodeFuncI delegate;

        Container(long functionPointer, YGCloneNodeFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long oldNode, long owner, int childIndex) {
            return delegate.invoke(oldNode, owner, childIndex);
        }

    }

}