/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;

import java.lang.annotation.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.function.*;

/**
 * Binding configuration, used to customize the generation of binding implementations.
 *
 * <p>It also acts as a registry for {@link Binder} instances.</p>
 */
public final class FFMConfig {

    final MethodHandles.Lookup lookup;

    record BinderField(
        String name,
        Binder<?> binder
    ) { }

    final HashMap<Class<?>, BinderField> binders = new HashMap<>();

    final @Nullable Class<? extends Annotation>
                                              nullableAnnotation;
    final           boolean                   nullableAnnotationOnType;
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
        @Nullable Class<? extends Annotation> nullableAnnotation,
        MethodHandles.Lookup lookup,
        @Nullable SymbolLookup symbolLookup,
        // TODO: tracing pre, post, return values, transformed signature, etc.
        @Nullable TraceConsumer traceConsumer,
        @Nullable Predicate<Method> tracingFilter,
        @Nullable Function<Method, Boolean> criticalOverride,
        boolean checks,
        boolean debugGenerator
    ) {
        this.nullableAnnotation = nullableAnnotation;
        this.lookup = lookup;
        this.symbolLookup = symbolLookup;
        this.traceConsumer = traceConsumer;
        this.tracingFilter = tracingFilter;
        this.criticalOverride = criticalOverride;
        this.checks = checks;
        this.debugGenerator = debugGenerator;

        this.nullableAnnotationOnType = validateNullableAnnotationClass(nullableAnnotation);
    }

    /**
     * Returns the {@link MethodHandles.Lookup} associated with this configuration.
     *
     * @return the lookup instance
     */
    public MethodHandles.Lookup getLookup() {
        return lookup;
    }

    /**
     * Returns true if a {@link Binder} has been registered for the specified type.
     *
     * @param type an upcall, struct or union interface
     *
     * @return {@code true} if such a {@code Binder} has been registered
     */
    public boolean hasBinder(Class<?> type) {
        return binders.containsKey(type);
    }

    /**
     * Returns the {@link StructBinder} registered for the specified struct interface.
     *
     * @param type a struct interface
     *
     * @return the registered {@code StructBinder}
     *
     * @throws NullPointerException if no {@code StructBinder} is registered for the specified type
     */
    @SuppressWarnings("unchecked")
    public <T> StructBinder<T> getStructBinder(Class<T> type) {
        return (StructBinder<T>)Objects.requireNonNull(binders.get(type)).binder;
    }

    /**
     * Returns the {@link UnionBinder} registered for the specified union interface.
     *
     * @param type a union interface
     *
     * @return the registered {@code UnionBinder}
     *
     * @throws NullPointerException if no {@code UnionBinder} is registered for the specified type
     */
    @SuppressWarnings("unchecked")
    public <T> UnionBinder<T> getUnionBinder(Class<T> type) {
        return (UnionBinder<T>)Objects.requireNonNull(binders.get(type)).binder;
    }

    /**
     * Returns the {@link UpcallBinder} registered for the specified upcall interface.
     *
     * @param type an upcall interface
     *
     * @return the registered {@code UpcallBinder}
     *
     * @throws NullPointerException if no {@code UpcallBinder} is registered for the specified type
     */
    @SuppressWarnings("unchecked")
    public <T> UpcallBinder<T> getUpcallBinder(Class<T> type) {
        return (UpcallBinder<T>)Objects.requireNonNull(binders.get(type)).binder;
    }

    /**
     * Returns the nullable annotation class associated with this configuration.
     *
     * @return the nullable annotation class, or {@code null} if none is set
     */
    public @Nullable Class<? extends Annotation> getNullableAnnotation() {
        return nullableAnnotation;
    }

    /**
     * Returns the {@link SymbolLookup} associated with this configuration.
     *
     * @return the symbol lookup, or {@code null} if none is set
     */
    public @Nullable SymbolLookup getSymbolLookup() {
        return symbolLookup;
    }

    /**
     * Returns the {@link TraceConsumer} associated with this configuration.
     *
     * @return the trace consumer, or {@code null} if none is set
     */
    public @Nullable TraceConsumer getTraceConsumer() {
        return traceConsumer;
    }

    /**
     * Returns the tracing filter {@link Predicate} associated with this configuration.
     *
     * @return the trace filter, or {@code null} if none is set
     */
    public @Nullable Predicate<Method> getTracingFilter() {
        return tracingFilter;
    }

    /**
     * Returns the critical override {@link Function} associated with this configuration.
     *
     * @return the critical override function, or {@code null} if none is set
     */
    public @Nullable Function<Method, Boolean> getCriticalOverride() {
        return criticalOverride;
    }

    /**
     * Returns whether runtime checks are enabled.
     *
     * @return {@code true} if runtime checks are enabled
     */
    public boolean checks() {
        return checks;
    }

    /**
     * Returns whether generator debug output is enabled.
     *
     * @return {@code true} if generator debug output is enabled
     */
    public boolean debugGenerator() {
        return debugGenerator;
    }

    static boolean validateNullableAnnotationClass(@Nullable Class<? extends Annotation> nullableAnnotation) {
        if (nullableAnnotation == null) {
            return false;
        }

        var retention = nullableAnnotation.getDeclaredAnnotation(Retention.class);
        if (retention == null || retention.value() != RetentionPolicy.RUNTIME) {
            throw new IllegalStateException("Nullable annotation " + nullableAnnotation + " must have RUNTIME retention");
        }

        var target = nullableAnnotation.getDeclaredAnnotation(Target.class);
        if (target != null) {
            var elementTypes = List.of(target.value());
            if (elementTypes.contains(ElementType.TYPE_USE)) {
                return true;
            }

            if (!(elementTypes.contains(ElementType.METHOD) && elementTypes.contains(ElementType.PARAMETER))) {
                throw new IllegalStateException("Nullable annotation " + nullableAnnotation + " must @Target either TYPE_USE or METHOD+PARAMETER");
            }
        }
        return false;
    }

}