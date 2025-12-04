/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;
import java.lang.foreign.*;

/**
 * Marks the start of the variadic arguments for a variadic function.
 *
 * <p>When used on a method, the annotation value must be specified and should indicate the index of the first variadic argument.</p>
 *
 * <p>When used on a parameter, the annotation value is ignored and the parameter index is implicitly used as the starting index of the variadic arguments.</p>
 *
 * @see Linker.Option#firstVariadicArg
 */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMFirstVariadicArg {
    int value() default 0;
}
