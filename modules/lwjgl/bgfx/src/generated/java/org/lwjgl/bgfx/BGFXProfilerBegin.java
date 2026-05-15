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
public abstract class BGFXProfilerBegin extends Callback implements BGFXProfilerBeginI {

    /**
     * Creates a {@code BGFXProfilerBegin} instance from the specified function pointer.
     *
     * @return the new {@code BGFXProfilerBegin}
     */
    public static BGFXProfilerBegin create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXProfilerBegin createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code BGFXProfilerBegin} instance that delegates to the specified {@code BGFXProfilerBeginI} instance. */
    public static BGFXProfilerBegin create(BGFXProfilerBeginI instance) { return create(instance, instance.address()); }

    private static BGFXProfilerBegin create(BGFXProfilerBeginI instance, long functionPointer) {
        return instance instanceof BGFXProfilerBegin
            ? (BGFXProfilerBegin)instance
            : new BGFXProfilerBegin(functionPointer) {
                @Override public void invoke(long _this, long _name, int _abgr, long _filePath, short _line) {
                    instance.invoke(_this, _name, _abgr, _filePath, _line);
                }
            };
    }

    protected BGFXProfilerBegin() {
        super(DESCRIPTOR);
    }

    BGFXProfilerBegin(long functionPointer) {
        super(functionPointer);
    }

}