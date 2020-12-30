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
 * bool (*) (
 *     char const *msg,
 *     double progress,
 *     double globalConcavity,
 *     size_t vertices
 * )</code></pre>
 */
public abstract class HACDCallBackFunction extends Callback implements HACDCallBackFunctionI {

    /**
     * Creates a {@code HACDCallBackFunction} instance from the specified function pointer.
     *
     * @return the new {@code HACDCallBackFunction}
     */
    public static HACDCallBackFunction create(long functionPointer) {
        HACDCallBackFunctionI instance = Callback.get(functionPointer);
        return instance instanceof HACDCallBackFunction
            ? (HACDCallBackFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static HACDCallBackFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code HACDCallBackFunction} instance that delegates to the specified {@code HACDCallBackFunctionI} instance. */
    public static HACDCallBackFunction create(HACDCallBackFunctionI instance) {
        return instance instanceof HACDCallBackFunction
            ? (HACDCallBackFunction)instance
            : new Container(instance.address(), instance);
    }

    protected HACDCallBackFunction() {
        super(SIGNATURE);
    }

    HACDCallBackFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends HACDCallBackFunction {

        private final HACDCallBackFunctionI delegate;

        Container(long functionPointer, HACDCallBackFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long msg, double progress, double globalConcavity, long vertices) {
            return delegate.invoke(msg, progress, globalConcavity, vertices);
        }

    }

}