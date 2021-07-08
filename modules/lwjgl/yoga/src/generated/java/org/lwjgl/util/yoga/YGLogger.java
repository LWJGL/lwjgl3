/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*{@link #invoke}) (
 *     YGConfigRef config,
 *     YGNodeRef node,
 *     YGLogLevel level,
 *     char const *format,
 *     va_list args
 * )</code></pre>
 */
public abstract class YGLogger extends Callback implements YGLoggerI {

    /**
     * Creates a {@code YGLogger} instance from the specified function pointer.
     *
     * @return the new {@code YGLogger}
     */
    public static YGLogger create(long functionPointer) {
        YGLoggerI instance = Callback.get(functionPointer);
        return instance instanceof YGLogger
            ? (YGLogger)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static YGLogger createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code YGLogger} instance that delegates to the specified {@code YGLoggerI} instance. */
    public static YGLogger create(YGLoggerI instance) {
        return instance instanceof YGLogger
            ? (YGLogger)instance
            : new Container(instance.address(), instance);
    }

    protected YGLogger() {
        super(CIF);
    }

    YGLogger(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends YGLogger {

        private final YGLoggerI delegate;

        Container(long functionPointer, YGLoggerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long config, long node, int level, long format, long args) {
            return delegate.invoke(config, node, level, format, args);
        }

    }

}