/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;
import java.lang.foreign.*;

/**
 * Transforms a native function such that it returns the value of an output parameter.
 *
 * <p>Supports the following transformations:</p>
 * <ul>
 *     <li>From {@code void function(..., type *paramOut, ...)} to {@code type function(...)}. The method will return a single value only, of the same type as
 *     the element type of the output parameter.</li>
 *     <li>From {@code sizeT function(..., sizeT paramSize, type *paramOut, ...)} to {@code MemorySegment function(..., sizeT paramSize, ...)}. The method will
 *     allocate a buffer of size equal to the {@code paramSize} parameter, which must be annotated with {@link FFMReturn.Size}. The returned
 *     {@link MemorySegment} will have a size equal to the value returned by the native function. The return type can also be a {@link String}, in which case
 *     the output buffer will be decoded and returned as a string.</li>
 *     <li>From {@code void function(..., sizeT paramSize, sizeT *length, type *paramOut, ...)} to {@code MemorySegment function(..., sizeT paramSize, ...)}.
 *     The method will allocate a buffer of size equal to the {@code paramSize} parameter, which must be annotated with {@link FFMReturn.Size}. It will also
 *     allocate storage for the output {@code length} parameter. The returned {@link MemorySegment} will have a size equal to the value returned in the
 *     {@code length} parameter. The return type can also be a {@link String}, in which case the output buffer will be decoded and returned as a string.</li>
 * </ul>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMReturn {
    /**
     * Index of the buffer parameter that has been transformed to a return value.
     *
     * <p>It should be the native parameter index, ignoring any virtual parameters before the actual parameters.</p>
     */
    int value();
    /** When true, the actual string size includes the null-termination character. */
    boolean includesNT() default false; // TODO: implement

    /**
     * When specified, the parameter will be used as the size of the internally allocated return buffer.
     *
     * <p>Required when the method return type is not a primitive value.</p>
     */
    @Target(ElementType.PARAMETER)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Size {
    }

    /**
     * Specifies the output parameter that receives the actual buffer size.
     *
     * <p>If specified, the native function is assumed to return {@code void}.</p>
     *
     * <p>If not specified, the native function is assumed to return the actual buffer size, with the same carrier type as the {@link FFMReturn.Size}
     * parameter, or {@code void} if no such parameter exists.</p>
     */
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface SizeOut {
        /**
         * Index of the output parameter that receives the returned buffer size.
         *
         * <p>It should be the native parameter index, ignoring any virtual parameters before the actual parameters.</p>
         */
        int value();
    }
}