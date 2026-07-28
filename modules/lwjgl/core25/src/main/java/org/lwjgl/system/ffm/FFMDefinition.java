/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;

/**
 * Defines a function signature or a struct/union.
 *
 * <p>There is no functionality associated with this annotation, it's only used for documentation purposes.</p>
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FFMDefinition {
    /** The definition as specified in the native language. */
    String value();
}