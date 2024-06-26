/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;
import java.lang.foreign.*;

/**
 * Marks a {@code long} parameter as a raw pointer.
 *
 * <p>Such parameters will be passed as 64-bit values on 64-bit platforms ({@link ValueLayout#JAVA_LONG}) and 32-bit values on 32-bit platforms
 * ({@link ValueLayout#JAVA_INT}). The same functionality is provided by boxing the pointer value with {@link MemorySegment#ofAddress} and passing the
 * {@link MemorySegment} instead. This annotation may be used when boxing is not desirable.</p>
 */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMPointer {
}
