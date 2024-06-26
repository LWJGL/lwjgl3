/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.function.*;

/** Binding configuration. */
public final class FFMConfig {

    final MethodHandles.Lookup lookup;

    record BinderField(
        String name,
        Binder<?> binder
    ) { }

    final HashMap<Class<?>, BinderField> binders = new HashMap<>();

    final @Nullable SymbolLookup              symbolLookup;
    final @Nullable TraceConsumer             traceConsumer;
    final @Nullable Predicate<Method>         tracingFilter;
    final @Nullable Function<Method, Boolean> criticalOverride;

    final boolean checks;
    final boolean debugGenerator;

    /**
     * Creates a new binding configuration.
     *
     * @param lookup           the {@code MethodHandles.Lookup} to use for method handle creation.
     * @param symbolLookup     the {@code SymbolLookup} to use. Required if there are functions without the {@link FFMFunctionAddress} annotation.
     * @param traceConsumer    the consumer to use for tracing native function calls. Optional.
     * @param tracingFilter    can be used to limit tracing instrumentation to specific methods. Optional.
     * @param criticalOverride can be used to override which methods will have the {@link FFMCritical} annotation. Optional.
     * @param checks           whether to enable runtime checks.
     * @param debugGenerator   whether to enable generator debug output.
     */
    FFMConfig(
        MethodHandles.Lookup lookup,
        @Nullable SymbolLookup symbolLookup,
        // TODO: tracing pre, post, return values, transformed signature, etc.
        @Nullable TraceConsumer traceConsumer,
        @Nullable Predicate<Method> tracingFilter,
        @Nullable Function<Method, Boolean> criticalOverride,
        boolean checks,
        boolean debugGenerator
    ) {
        this.lookup = lookup;
        this.symbolLookup = symbolLookup;
        this.traceConsumer = traceConsumer;
        this.tracingFilter = tracingFilter;
        this.criticalOverride = criticalOverride;
        this.checks = checks;
        this.debugGenerator = debugGenerator;
    }

    public MethodHandles.Lookup getLookup() {
        return lookup;
    }

    public boolean hasBinder(Class<?> type) {
        return binders.containsKey(type);
    }

    @SuppressWarnings("unchecked")
    public <T> StructBinder<T> getStructBinder(Class<T> type) {
        return (StructBinder<T>)Objects.requireNonNull(binders.get(type)).binder;
    }

    @SuppressWarnings("unchecked")
    public <T> UnionBinder<T> getUnionBinder(Class<T> type) {
        return (UnionBinder<T>)Objects.requireNonNull(binders.get(type)).binder;
    }

    @SuppressWarnings("unchecked")
    public <T> UpcallBinder<T> getUpcallBinder(Class<T> type) {
        return (UpcallBinder<T>)Objects.requireNonNull(binders.get(type)).binder;
    }

    public @Nullable TraceConsumer getTraceConsumer() {
        return traceConsumer;
    }

    public @Nullable Predicate<Method> getTracingFilter() {
        return tracingFilter;
    }

    public @Nullable Function<Method, Boolean> getCriticalOverride() {
        return criticalOverride;
    }

    public @Nullable SymbolLookup getSymbolLookup() {
        return symbolLookup;
    }

    public boolean checks() {
        return checks;
    }

    public boolean debugGenerator() {
        return debugGenerator;
    }

}