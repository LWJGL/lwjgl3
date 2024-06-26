/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;
import java.lang.foreign.*;

/**
 * When specified, the native function address will be passed explicitly on every call as the first argument, which must be of type {@link MemorySegment}.
 *
 * <p>When specified at the interface level, it is as if every method in the interface is annotated with {@code @FFMFunctionAddress}.</p>
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMFunctionAddress {
}