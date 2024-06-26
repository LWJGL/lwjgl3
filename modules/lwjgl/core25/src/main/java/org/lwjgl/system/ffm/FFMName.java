/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;

/**
 * Overrides the native function name.
 *
 * <p>By default, the native function name is equal to the Java method name, optionally prefixed by {@link FFMPrefix}, if specified on the interface.</p>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMName {
    /** The native function name. */
    String value();
}