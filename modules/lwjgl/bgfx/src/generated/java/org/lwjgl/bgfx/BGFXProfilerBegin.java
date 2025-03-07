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
    public static BGFXProfilerBegin create(long functionPointer) {
        BGFXProfilerBeginI instance = Callback.get(functionPointer);
        return instance instanceof BGFXProfilerBegin
            ? (BGFXProfilerBegin)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXProfilerBegin createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BGFXProfilerBegin} instance that delegates to the specified {@code BGFXProfilerBeginI} instance. */
    public static BGFXProfilerBegin create(BGFXProfilerBeginI instance) {
        return instance instanceof BGFXProfilerBegin
            ? (BGFXProfilerBegin)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXProfilerBegin() {
        super(CIF);
    }

    BGFXProfilerBegin(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXProfilerBegin {

        private final BGFXProfilerBeginI delegate;

        Container(long functionPointer, BGFXProfilerBeginI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long _this, long _name, int _abgr, long _filePath, short _line) {
            delegate.invoke(_this, _name, _abgr, _filePath, _line);
        }

    }

}