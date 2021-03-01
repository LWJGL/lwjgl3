/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@code skip} field of the {@link STBIIOCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *user,
 *     int n
 * )</code></pre>
 */
public abstract class STBISkipCallback extends Callback implements STBISkipCallbackI {

    /**
     * Creates a {@code STBISkipCallback} instance from the specified function pointer.
     *
     * @return the new {@code STBISkipCallback}
     */
    public static STBISkipCallback create(long functionPointer) {
        STBISkipCallbackI instance = Callback.get(functionPointer);
        return instance instanceof STBISkipCallback
            ? (STBISkipCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static STBISkipCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code STBISkipCallback} instance that delegates to the specified {@code STBISkipCallbackI} instance. */
    public static STBISkipCallback create(STBISkipCallbackI instance) {
        return instance instanceof STBISkipCallback
            ? (STBISkipCallback)instance
            : new Container(instance.address(), instance);
    }

    protected STBISkipCallback() {
        super(CIF);
    }

    STBISkipCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends STBISkipCallback {

        private final STBISkipCallbackI delegate;

        Container(long functionPointer, STBISkipCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long user, int n) {
            delegate.invoke(user, n);
        }

    }

}