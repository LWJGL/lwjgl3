/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke YGLogger} */
public abstract class YGLogger extends Callback implements YGLoggerI {

    /**
     * Creates a {@code YGLogger} instance from the specified function pointer.
     *
     * @return the new {@code YGLogger}
     */
    public static YGLogger create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable YGLogger createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code YGLogger} instance that delegates to the specified {@code YGLoggerI} instance. */
    public static YGLogger create(YGLoggerI instance) { return create(instance, instance.address()); }

    private static YGLogger create(YGLoggerI instance, long functionPointer) {
        return instance instanceof YGLogger
            ? (YGLogger)instance
            : new YGLogger(functionPointer) {
                @Override public int invoke(long config, long node, int level, long format, long args) {
                    return instance.invoke(config, node, level, format, args);
                }
            };
    }

    protected YGLogger() {
        super(DESCRIPTOR);
    }

    YGLogger(long functionPointer) {
        super(functionPointer);
    }

}