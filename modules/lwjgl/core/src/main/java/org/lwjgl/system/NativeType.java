/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.lang.annotation.*;

/** Annotates parameter and return types in LWJGL bindings with the C type as defined in the native function. */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
public @interface NativeType {
    String value();
}
