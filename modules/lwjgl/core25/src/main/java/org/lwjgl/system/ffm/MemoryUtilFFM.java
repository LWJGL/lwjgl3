/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;
import org.lwjgl.system.*;

import java.lang.foreign.*;

import static org.lwjgl.system.Pointer.*;

/**
 * Additional memory utilities for FFM.
 *
 * <p>This API is meant to be used with static import.</p>
 */
@NullMarked
public final class MemoryUtilFFM {

    private MemoryUtilFFM() {
    }

    public static boolean memGetBoolean(MemorySegment segment, long offset)                          { return MemoryUtil.memGetBoolean(segment.address() + offset); }

    public static byte memGetByte(MemorySegment segment, long offset)                                { return MemoryUtil.memGetByte(segment.address() + offset); }

    public static char memGetChar(MemorySegment segment, long offset)                                { return MemoryUtil.memGetChar(segment.address() + offset); }
    public static char memGetCharAtIndex(MemorySegment segment, long index)                          { return MemoryUtil.memGetChar(segment.address() + (index << 1)); }
    public static char memGetCharUnaligned(MemorySegment segment, long offset)                       { return MemoryUtil.memGetCharUnaligned(segment.address() + offset); }
    public static char memGetCharUnalignedAtIndex(MemorySegment segment, long index)                 { return MemoryUtil.memGetCharUnaligned(segment.address() + (index << 1)); }

    public static short memGetShort(MemorySegment segment, long offset)                              { return MemoryUtil.memGetShort(segment.address() + offset); }
    public static short memGetShortAtIndex(MemorySegment segment, long index)                        { return MemoryUtil.memGetShort(segment.address() + (index << 1)); }
    public static short memGetShortUnaligned(MemorySegment segment, long offset)                     { return MemoryUtil.memGetShortUnaligned(segment.address() + offset); }
    public static short memGetShortUnalignedAtIndex(MemorySegment segment, long index)               { return MemoryUtil.memGetShortUnaligned(segment.address() + (index << 1)); }

    public static int memGetInt(MemorySegment segment, long offset)                                  { return MemoryUtil.memGetInt(segment.address() + offset); }
    public static int memGetIntAtIndex(MemorySegment segment, long index)                            { return MemoryUtil.memGetInt(segment.address() + (index << 2)); }
    public static int memGetIntUnaligned(MemorySegment segment, long offset)                         { return MemoryUtil.memGetIntUnaligned(segment.address() + offset); }
    public static int memGetIntUnalignedAtIndex(MemorySegment segment, long index)                   { return MemoryUtil.memGetIntUnaligned(segment.address() + (index << 2)); }

    public static long memGetLong(MemorySegment segment, long offset)                                { return MemoryUtil.memGetLong(segment.address() + offset); }
    public static long memGetLongAtIndex(MemorySegment segment, long index)                          { return MemoryUtil.memGetLong(segment.address() + (index << 3)); }
    public static long memGetLongUnaligned(MemorySegment segment, long offset)                       { return MemoryUtil.memGetLongUnaligned(segment.address() + offset); }
    public static long memGetLongUnalignedAtIndex(MemorySegment segment, long index)                 { return MemoryUtil.memGetLongUnaligned(segment.address() + (index << 3)); }

    public static float memGetFloat(MemorySegment segment, long offset)                              { return MemoryUtil.memGetFloat(segment.address() + offset); }
    public static float memGetFloatAtIndex(MemorySegment segment, long index)                        { return MemoryUtil.memGetFloat(segment.address() + (index << 2)); }
    public static float memGetFloatUnaligned(MemorySegment segment, long offset)                     { return MemoryUtil.memGetFloatUnaligned(segment.address() + offset); }
    public static float memGetFloatUnalignedAtIndex(MemorySegment segment, long index)               { return MemoryUtil.memGetFloatUnaligned(segment.address() + (index << 2)); }

    public static double memGetDouble(MemorySegment segment, long offset)                            { return MemoryUtil.memGetDouble(segment.address() + offset); }
    public static double memGetDoubleAtIndex(MemorySegment segment, long index)                      { return MemoryUtil.memGetDouble(segment.address() + (index << 3)); }
    public static double memGetDoubleUnaligned(MemorySegment segment, long offset)                   { return MemoryUtil.memGetDoubleUnaligned(segment.address() + offset); }
    public static double memGetDoubleUnalignedAtIndex(MemorySegment segment, long index)             { return MemoryUtil.memGetDoubleUnaligned(segment.address() + (index << 3)); }

    public static long memGetCLong(MemorySegment segment, long offset)                               { return MemoryUtil.memGetCLong(segment.address() + offset); }
    public static long memGetCLongAtIndex(MemorySegment segment, long index)                         { return MemoryUtil.memGetCLong(segment.address() + (index << CLONG_SHIFT)); }
    public static long memGetCLongUnaligned(MemorySegment segment, long offset)                      { return MemoryUtil.memGetCLongUnaligned(segment.address() + offset); }
    public static long memGetCLongUnalignedAtIndex(MemorySegment segment, long index)                { return MemoryUtil.memGetCLongUnaligned(segment.address() + (index << CLONG_SHIFT)); }

    public static long memGetAddress(MemorySegment segment, long offset)                             { return MemoryUtil.memGetAddress(segment.address() + offset); }
    public static long memGetAddressAtIndex(MemorySegment segment, long index)                       { return MemoryUtil.memGetAddress(segment.address() + (index << POINTER_SHIFT)); }
    public static long memGetAddressUnaligned(MemorySegment segment, long offset)                    { return MemoryUtil.memGetAddressUnaligned(segment.address() + offset); }
    public static long memGetAddressUnalignedAtIndex(MemorySegment segment, long index)              { return MemoryUtil.memGetAddressUnaligned(segment.address() + (index << POINTER_SHIFT)); }

    public static void memPutBoolean(MemorySegment segment, long offset, boolean value)              { MemoryUtil.memPutBoolean(segment.address() + offset, value); }

    public static void memPutByte(MemorySegment segment, long offset, byte value)                    { MemoryUtil.memPutByte(segment.address() + offset, value); }

    public static void memPutChar(MemorySegment segment, long offset, char value)                    { MemoryUtil.memPutChar(segment.address() + offset, value); }
    public static void memPutCharAtIndex(MemorySegment segment, long index, char value)              { MemoryUtil.memPutChar(segment.address() + (index << 1), value); }
    public static void memPutCharUnaligned(MemorySegment segment, long offset, char value)           { MemoryUtil.memPutCharUnaligned(segment.address() + offset, value); }
    public static void memPutCharUnalignedAtIndex(MemorySegment segment, long index, char value)     { MemoryUtil.memPutCharUnaligned(segment.address() + (index << 1), value); }

    public static void memPutShort(MemorySegment segment, long offset, short value)                  { MemoryUtil.memPutShort(segment.address() + offset, value); }
    public static void memPutShortAtIndex(MemorySegment segment, long index, short value)            { MemoryUtil.memPutShort(segment.address() + (index << 1), value); }
    public static void memPutShortUnaligned(MemorySegment segment, long offset, short value)         { MemoryUtil.memPutShortUnaligned(segment.address() + offset, value); }
    public static void memPutShortUnalignedAtIndex(MemorySegment segment, long index, short value)   { MemoryUtil.memPutShortUnaligned(segment.address() + (index << 1), value); }

    public static void memPutInt(MemorySegment segment, long offset, int value)                      { MemoryUtil.memPutInt(segment.address() + offset, value); }
    public static void memPutIntAtIndex(MemorySegment segment, long index, int value)                { MemoryUtil.memPutInt(segment.address() + (index << 2), value); }
    public static void memPutIntUnaligned(MemorySegment segment, long offset, int value)             { MemoryUtil.memPutIntUnaligned(segment.address() + offset, value); }
    public static void memPutIntUnalignedAtIndex(MemorySegment segment, long index, int value)       { MemoryUtil.memPutIntUnaligned(segment.address() + (index << 2), value); }

    public static void memPutLong(MemorySegment segment, long offset, long value)                    { MemoryUtil.memPutLong(segment.address() + offset, value); }
    public static void memPutLongAtIndex(MemorySegment segment, long index, long value)              { MemoryUtil.memPutLong(segment.address() + (index << 3), value); }
    public static void memPutLongUnaligned(MemorySegment segment, long offset, long value)           { MemoryUtil.memPutLongUnaligned(segment.address() + offset, value); }
    public static void memPutLongUnalignedAtIndex(MemorySegment segment, long index, long value)     { MemoryUtil.memPutLongUnaligned(segment.address() + (index << 3), value); }

    public static void memPutFloat(MemorySegment segment, long offset, float value)                  { MemoryUtil.memPutFloat(segment.address() + offset, value); }
    public static void memPutFloatAtIndex(MemorySegment segment, long index, float value)            { MemoryUtil.memPutFloat(segment.address() + (index << 2), value); }
    public static void memPutFloatUnaligned(MemorySegment segment, long offset, float value)         { MemoryUtil.memPutFloatUnaligned(segment.address() + offset, value); }
    public static void memPutFloatUnalignedAtIndex(MemorySegment segment, long index, float value)   { MemoryUtil.memPutFloatUnaligned(segment.address() + (index << 2), value); }

    public static void memPutDouble(MemorySegment segment, long offset, double value)                { MemoryUtil.memPutDouble(segment.address() + offset, value); }
    public static void memPutDoubleAtIndex(MemorySegment segment, long index, double value)          { MemoryUtil.memPutDouble(segment.address() + (index << 3), value); }
    public static void memPutDoubleUnaligned(MemorySegment segment, long offset, double value)       { MemoryUtil.memPutDoubleUnaligned(segment.address() + offset, value); }
    public static void memPutDoubleUnalignedAtIndex(MemorySegment segment, long index, double value) { MemoryUtil.memPutDoubleUnaligned(segment.address() + (index << 3), value); }

    public static void memPutCLong(MemorySegment segment, long offset, long value)                   { MemoryUtil.memPutCLong(segment.address() + offset, value); }
    public static void memPutCLongAtIndex(MemorySegment segment, long index, long value)             { MemoryUtil.memPutCLong(segment.address() + (index << CLONG_SHIFT), value); }
    public static void memPutCLongUnaligned(MemorySegment segment, long offset, long value)          { MemoryUtil.memPutCLongUnaligned(segment.address() + offset, value); }
    public static void memPutCLongUnalignedAtIndex(MemorySegment segment, long index, long value)    { MemoryUtil.memPutCLongUnaligned(segment.address() + (index << CLONG_SHIFT), value); }

    public static void memPutAddress(MemorySegment segment, long offset, long value)                 { MemoryUtil.memPutAddress(segment.address() + offset, value); }
    public static void memPutAddressAtIndex(MemorySegment segment, long index, long value)           { MemoryUtil.memPutAddress(segment.address() + (index << POINTER_SHIFT), value); }
    public static void memPutAddressUnaligned(MemorySegment segment, long offset, long value)        { MemoryUtil.memPutAddressUnaligned(segment.address() + offset, value); }
    public static void memPutAddressUnalignedAtIndex(MemorySegment segment, long index, long value)  { MemoryUtil.memPutAddressUnaligned(segment.address() + (index << POINTER_SHIFT), value); }

}