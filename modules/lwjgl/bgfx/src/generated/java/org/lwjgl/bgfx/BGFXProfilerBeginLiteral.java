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
    public static BGFXProfilerBeginLiteral create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXProfilerBeginLiteral createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code BGFXProfilerBeginLiteral} instance that delegates to the specified {@code BGFXProfilerBeginLiteralI} instance. */
    public static BGFXProfilerBeginLiteral create(BGFXProfilerBeginLiteralI instance) { return create(instance, instance.address()); }

    private static BGFXProfilerBeginLiteral create(BGFXProfilerBeginLiteralI instance, long functionPointer) {
        return instance instanceof BGFXProfilerBeginLiteral
            ? (BGFXProfilerBeginLiteral)instance
            : new BGFXProfilerBeginLiteral(functionPointer) {
                @Override public void invoke(long _this, long _name, int _abgr, long _filePath, short _line) {
                    instance.invoke(_this, _name, _abgr, _filePath, _line);
                }
            };
    }

    protected BGFXProfilerBeginLiteral() {
        super(DESCRIPTOR);
    }

    BGFXProfilerBeginLiteral(long functionPointer) {
        super(functionPointer);
    }

}