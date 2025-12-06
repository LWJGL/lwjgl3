/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.classfile.*;
import java.lang.constant.*;
import java.lang.foreign.*;

import static org.lwjgl.system.ffm.BCDescriptors.*;

/** An enumeration of carrier types for parameters that represent integer sizes. */
public enum SizeCarrier {

    BYTE(ValueLayout.JAVA_BYTE, "JAVA_BYTE", CD_ValueLayout$OfByte, MTD_byte_ValueLayout$OfByte_long),
    SHORT(ValueLayout.JAVA_SHORT, "JAVA_SHORT", CD_ValueLayout$OfShort, MTD_short_ValueLayout$OfShort_long),
    INT(ValueLayout.JAVA_INT, "JAVA_INT", CD_ValueLayout$OfInt, MTD_int_ValueLayout$OfInt_long),
    LONG(ValueLayout.JAVA_LONG, "JAVA_LONG", CD_ValueLayout$OfLong, MTD_long_ValueLayout$OfLong_long),
    SIZE_T(ValueLayout.ADDRESS, "ADDRESS", CD_AddressLayout, MTD_MemorySegment_AddressLayout_long);

    private static final SizeCarrier[] values = values();

    public final ValueLayout layout;

    final String         name;
    final ClassDesc      type;
    final MethodTypeDesc getter;

    SizeCarrier(ValueLayout layout, String name, ClassDesc type, MethodTypeDesc getter) {
        this.layout = layout;
        this.name = name;
        this.type = type;
        this.getter = getter;
    }

    CodeBuilder allocateSingle(CodeBuilder cb) {
        return cb
            .getstatic(CD_ValueLayout, name, type)
            .lconst_1()
            .invokeinterface(CD_SegmentAllocator, "allocate", MTD_MemorySegment_MemoryLayout_long);
    }

    static SizeCarrier get(Class<?> carrier) {
        for (var value : values) {
            if (value.layout.carrier() == carrier) {
                return value;
            }
        }
        throw new IllegalArgumentException("Unsupported size carrier type: " + carrier);
    }

}