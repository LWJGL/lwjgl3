/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class BGFXProfilerEnd extends Callback implements BGFXProfilerEndI {

    /**
     * Creates a {@code BGFXProfilerEnd} instance from the specified function pointer.
     *
     * @return the new {@code BGFXProfilerEnd}
     */
    public static BGFXProfilerEnd create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXProfilerEnd createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code BGFXProfilerEnd} instance that delegates to the specified {@code BGFXProfilerEndI} instance. */
    public static BGFXProfilerEnd create(BGFXProfilerEndI instance) { return create(instance, instance.address()); }

    private static BGFXProfilerEnd create(BGFXProfilerEndI instance, long functionPointer) {
        return instance instanceof BGFXProfilerEnd
            ? (BGFXProfilerEnd)instance
            : new BGFXProfilerEnd(functionPointer) {
                @Override public void invoke(long _this) {
                    instance.invoke(_this);
                }
            };
    }

    protected BGFXProfilerEnd() {
        super(DESCRIPTOR);
    }

    BGFXProfilerEnd(long functionPointer) {
        super(functionPointer);
    }

}