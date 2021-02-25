/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Profiler region end.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     bgfx_callback_interface_t *_this
 * )</code></pre>
 */
public abstract class BGFXProfilerEnd extends Callback implements BGFXProfilerEndI {

    /**
     * Creates a {@code BGFXProfilerEnd} instance from the specified function pointer.
     *
     * @return the new {@code BGFXProfilerEnd}
     */
    public static BGFXProfilerEnd create(long functionPointer) {
        BGFXProfilerEndI instance = Callback.get(functionPointer);
        return instance instanceof BGFXProfilerEnd
            ? (BGFXProfilerEnd)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BGFXProfilerEnd createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BGFXProfilerEnd} instance that delegates to the specified {@code BGFXProfilerEndI} instance. */
    public static BGFXProfilerEnd create(BGFXProfilerEndI instance) {
        return instance instanceof BGFXProfilerEnd
            ? (BGFXProfilerEnd)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXProfilerEnd() {
        super(CIF);
    }

    BGFXProfilerEnd(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXProfilerEnd {

        private final BGFXProfilerEndI delegate;

        Container(long functionPointer, BGFXProfilerEndI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long _this) {
            delegate.invoke(_this);
        }

    }

}