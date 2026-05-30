/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;

/**
 * Overrides the native name of:
 *
 * <ul>
 *     <li>Downcalls. By default, the native function name is equal to the Java method name, optionally prefixed by {@link FFMPrefix}, if specified on the
 *     container interface.</li>
 *     <li>Groups (structs/unions). By default, the native group name is equal to the interface name.</li>
 *     <li>Group accessor methods. By default, the corresponding native member name is equal to the Java method name.</li>
 * </ul>
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMName {
    /** The native name. */
    String value();
}