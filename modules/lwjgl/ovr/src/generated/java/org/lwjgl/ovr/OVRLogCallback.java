/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@code LogCallback} member of the {@link OVRInitParams} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     uintptr_t userData,
 *     int level,
 *     char const *message
 * )</code></pre>
 */
public abstract class OVRLogCallback extends Callback implements OVRLogCallbackI {

    /**
     * Creates a {@code OVRLogCallback} instance from the specified function pointer.
     *
     * @return the new {@code OVRLogCallback}
     */
    public static OVRLogCallback create(long functionPointer) {
        OVRLogCallbackI instance = Callback.get(functionPointer);
        return instance instanceof OVRLogCallback
            ? (OVRLogCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static OVRLogCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code OVRLogCallback} instance that delegates to the specified {@code OVRLogCallbackI} instance. */
    public static OVRLogCallback create(OVRLogCallbackI instance) {
        return instance instanceof OVRLogCallback
            ? (OVRLogCallback)instance
            : new Container(instance.address(), instance);
    }

    protected OVRLogCallback() {
        super(CIF);
    }

    OVRLogCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
         * Converts the specified {@link OVRLogCallback} argument to a String.
         *
         * <p>This method may only be used inside a OVRLogCallback invocation.</p>
         *
         * @param message the OVRLogCallback {@code message} argument
         *
         * @return the message as a String
         */
        public static String getMessage(long message) {
            return memUTF8(message);
        }

    private static final class Container extends OVRLogCallback {

        private final OVRLogCallbackI delegate;

        Container(long functionPointer, OVRLogCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData, int level, long message) {
            delegate.invoke(userData, level, message);
        }

    }

}