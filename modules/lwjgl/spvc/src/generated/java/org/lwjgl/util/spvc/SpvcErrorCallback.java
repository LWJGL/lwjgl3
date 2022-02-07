/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link Spvc#spvc_context_set_error_callback context_set_error_callback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *userdata,
 *     char const *error
 * )</code></pre>
 */
public abstract class SpvcErrorCallback extends Callback implements SpvcErrorCallbackI {

    /**
     * Creates a {@code SpvcErrorCallback} instance from the specified function pointer.
     *
     * @return the new {@code SpvcErrorCallback}
     */
    public static SpvcErrorCallback create(long functionPointer) {
        SpvcErrorCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SpvcErrorCallback
            ? (SpvcErrorCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static SpvcErrorCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SpvcErrorCallback} instance that delegates to the specified {@code SpvcErrorCallbackI} instance. */
    public static SpvcErrorCallback create(SpvcErrorCallbackI instance) {
        return instance instanceof SpvcErrorCallback
            ? (SpvcErrorCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SpvcErrorCallback() {
        super(CIF);
    }

    SpvcErrorCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@code spvc_error_callback} argument to a String.
     *
     * <p>This method may only be used inside a {@code SpvcErrorCallback} invocation.</p>
     *
     * @param error the error argument to decode
     *
     * @return the error message as a String
     */
    public static String getError(long error) {
        return memUTF8(error);
    }

    private static final class Container extends SpvcErrorCallback {

        private final SpvcErrorCallbackI delegate;

        Container(long functionPointer, SpvcErrorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, long error) {
            delegate.invoke(userdata, error);
        }

    }

}