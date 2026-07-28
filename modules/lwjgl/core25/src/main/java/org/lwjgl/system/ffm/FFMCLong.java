/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;
import java.lang.foreign.*;

/**
 * Marks a {@code long} parameter or return value as a C {@code long}.
 *
 * <p>Such values will be treated as 64-bit values on LP64 platforms ({@link ValueLayout#JAVA_LONG}) and 32-bit values on LLP64/32-bit platforms
 * ({@link ValueLayout#JAVA_INT}).</p>
 */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMCLong {
    /*
    TODO: consider differentiating signed/unsigned

    FFMCLong(true): signed native long, sign-extended when 32-bit (current behavior)
    FFMCLong(false): unsigned native long, zero-extended when native size is 32-bit

    Kind of painful to do this in lwjgl3, for little gain. Wait for lwjgl4?
     */
}
