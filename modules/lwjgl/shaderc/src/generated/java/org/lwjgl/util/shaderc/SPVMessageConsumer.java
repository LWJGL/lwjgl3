/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spv_message_consumer} */
public abstract class SPVMessageConsumer extends Callback implements SPVMessageConsumerI {

    /**
     * Creates a {@code SPVMessageConsumer} instance from the specified function pointer.
     *
     * @return the new {@code SPVMessageConsumer}
     */
    public static SPVMessageConsumer create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SPVMessageConsumer createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SPVMessageConsumer} instance that delegates to the specified {@code SPVMessageConsumerI} instance. */
    public static SPVMessageConsumer create(SPVMessageConsumerI instance) { return create(instance, instance.address()); }

    private static SPVMessageConsumer create(SPVMessageConsumerI instance, long functionPointer) {
        return instance instanceof SPVMessageConsumer
            ? (SPVMessageConsumer)instance
            : new SPVMessageConsumer(functionPointer) {
                @Override public void invoke(int level, long source, long position, long message) {
                    instance.invoke(level, source, position, message);
                }
            };
    }

    protected SPVMessageConsumer() {
        super(DESCRIPTOR);
    }

    SPVMessageConsumer(long functionPointer) {
        super(functionPointer);
    }

}