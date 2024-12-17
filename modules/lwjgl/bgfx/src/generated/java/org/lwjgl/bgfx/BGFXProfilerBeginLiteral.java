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
public abstract class BGFXProfilerBeginLiteral extends Callback implements BGFXProfilerBeginLiteralI {

    /**
     * Creates a {@code BGFXProfilerBeginLiteral} instance from the specified function pointer.
     *
     * @return the new {@code BGFXProfilerBeginLiteral}
     */
    public static BGFXProfilerBeginLiteral create(long functionPointer) {
        BGFXProfilerBeginLiteralI instance = Callback.get(functionPointer);
        return instance instanceof BGFXProfilerBeginLiteral
            ? (BGFXProfilerBeginLiteral)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXProfilerBeginLiteral createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BGFXProfilerBeginLiteral} instance that delegates to the specified {@code BGFXProfilerBeginLiteralI} instance. */
    public static BGFXProfilerBeginLiteral create(BGFXProfilerBeginLiteralI instance) {
        return instance instanceof BGFXProfilerBeginLiteral
            ? (BGFXProfilerBeginLiteral)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXProfilerBeginLiteral() {
        super(CIF);
    }

    BGFXProfilerBeginLiteral(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXProfilerBeginLiteral {

        private final BGFXProfilerBeginLiteralI delegate;

        Container(long functionPointer, BGFXProfilerBeginLiteralI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long _this, long _name, int _abgr, long _filePath, short _line) {
            delegate.invoke(_this, _name, _abgr, _filePath, _line);
        }

    }

}