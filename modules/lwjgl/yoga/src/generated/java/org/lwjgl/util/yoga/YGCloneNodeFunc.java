/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke YGCloneNodeFunc} */
public abstract class YGCloneNodeFunc extends Callback implements YGCloneNodeFuncI {

    /**
     * Creates a {@code YGCloneNodeFunc} instance from the specified function pointer.
     *
     * @return the new {@code YGCloneNodeFunc}
     */
    public static YGCloneNodeFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable YGCloneNodeFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code YGCloneNodeFunc} instance that delegates to the specified {@code YGCloneNodeFuncI} instance. */
    public static YGCloneNodeFunc create(YGCloneNodeFuncI instance) { return create(instance, instance.address()); }

    private static YGCloneNodeFunc create(YGCloneNodeFuncI instance, long functionPointer) {
        return instance instanceof YGCloneNodeFunc
            ? (YGCloneNodeFunc)instance
            : new YGCloneNodeFunc(functionPointer) {
                @Override public long invoke(long oldNode, long owner, int childIndex) {
                    return instance.invoke(oldNode, owner, childIndex);
                }
            };
    }

    protected YGCloneNodeFunc() {
        super(DESCRIPTOR);
    }

    YGCloneNodeFunc(long functionPointer) {
        super(functionPointer);
    }

}