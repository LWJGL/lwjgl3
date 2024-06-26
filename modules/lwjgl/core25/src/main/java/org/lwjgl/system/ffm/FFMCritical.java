/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;
import java.lang.foreign.*;

/**
 * Enables the {@link Linker.Option#critical} option when creating the FFM downcall.
 *
 * <p>When specified at the interface level, it is as if every method in the interface is annotated with {@code @FFMCritical}.</p>
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMCritical {
    /**
     * Specifies whether the linked function should allow access to the Java heap.
     *
     * <p>Defaults to {@code false}.</p>
     */
    boolean value() default false;
}
