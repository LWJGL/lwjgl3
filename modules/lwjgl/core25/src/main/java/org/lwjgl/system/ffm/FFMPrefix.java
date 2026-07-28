/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;

/** Adds a prefix to all native function names. */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMPrefix {
    /** The prefix to add. */
    String value();
}