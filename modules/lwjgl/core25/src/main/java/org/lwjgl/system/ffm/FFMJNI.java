/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;

/**
 * Adds two leading pointer parameters to which NULL will be passed implicitly.
 *
 * <p>This is a convenient way to call native functions from JNI libraries.</p>
 *
 * <p>When specified at the interface level, it is as if every method in the interface is annotated with {@code @FFMJNI}.</p>
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMJNI {
}
