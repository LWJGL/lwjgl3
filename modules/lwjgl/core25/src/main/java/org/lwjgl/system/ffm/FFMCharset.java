/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;
import java.lang.foreign.*;
import java.nio.*;

import static org.lwjgl.system.Checks.*;

/**
 * Specifies the charset used for string values.
 *
 * <p>The default charset is {@link Type#ISO_8859_1}. When this annotation is applied to a class, it changes the default charset for that class. The charset
 * can further be customized per function, by applying this annotation to specific return values and parameters.</p>
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMCharset {

    /** The default charset type. */
    Type DEFAULT = Type.ISO_8859_1;

    /**
     * The charset type.
     *
     * <p>If not specified, defaults to {@link Type#ISO_8859_1} (a.k.a. <em>Latin-1</em>).</p>
     */
    Type value() default Type.ISO_8859_1; // TODO: switch to UTF_8?

    enum Type {
        US_ASCII(ValueLayout.JAVA_BYTE, "US_ASCII"),
        ISO_8859_1(ValueLayout.JAVA_BYTE, "ISO_8859_1"),
        UTF8(ValueLayout.JAVA_BYTE, "UTF_8"),
        UTF16(
            DEBUG ? ValueLayout.JAVA_SHORT : ValueLayout.JAVA_SHORT_UNALIGNED,
            ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "UTF_16LE" : "UTF_16BE"
        ),
        UTF32(
            DEBUG ? ValueLayout.JAVA_INT : ValueLayout.JAVA_INT_UNALIGNED,
            ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "UTF_32LE" : "UTF_32BE"
        );

        public final ValueLayout layout;
        public final String      charset;

        Type(ValueLayout layout, String charset) {
            this.layout = layout;
            this.charset = charset;
        }
    }
}
