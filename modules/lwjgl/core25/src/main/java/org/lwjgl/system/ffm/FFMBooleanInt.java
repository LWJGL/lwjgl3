/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;

/** Maps a native integer type, that is larger than 1 byte, to a Java boolean. */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMBooleanInt {
    /**
     * The return or parameter carrier type.
     *
     * <p>If not specified, defaults to {@link SizeCarrier#INT}.</p>
     */
    SizeCarrier value() default SizeCarrier.INT;
    /**
     * Can be used on return types, if the native value is always 0 or 1.
     *
     * <p>When enabled, LWJGL generates simpler bytecode because the integer value is directly returned as a Java boolean, without an explicit comparison.</p>
     */
    boolean binary() default false;

}
