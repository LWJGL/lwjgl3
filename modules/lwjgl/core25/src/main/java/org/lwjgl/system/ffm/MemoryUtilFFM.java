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

    private static final MemoryBackend BACKEND = MemoryUtil.memBackend();

    private MemoryUtilFFM() {
    }

    public static boolean memGetBoolean(MemorySegment segment, long offset)                          { return BACKEND.getBoolean(segment.address() + offset); }

    public static byte memGetByte(MemorySegment segment, long offset)                                { return BACKEND.getByte(segment.address() + offset); }

    public static char memGetChar(MemorySegment segment, long offset)                                { return BACKEND.getChar(segment.address() + offset); }
    public static char memGetCharAtIndex(MemorySegment segment, long index)                          { return BACKEND.getChar(segment.address() + (index << 1)); }
    public static char memGetCharUnaligned(MemorySegment segment, long offset)                       { return BACKEND.getCharUnaligned(segment.address() + offset); }
    public static char memGetCharUnalignedAtIndex(MemorySegment segment, long index)                 { return BACKEND.getCharUnaligned(segment.address() + (index << 1)); }

    public static short memGetShort(MemorySegment segment, long offset)                              { return BACKEND.getShort(segment.address() + offset); }
    public static short memGetShortAtIndex(MemorySegment segment, long index)                        { return BACKEND.getShort(segment.address() + (index << 1)); }
    public static short memGetShortUnaligned(MemorySegment segment, long offset)                     { return BACKEND.getShortUnaligned(segment.address() + offset); }
    public static short memGetShortUnalignedAtIndex(MemorySegment segment, long index)               { return BACKEND.getShortUnaligned(segment.address() + (index << 1)); }

    public static int memGetInt(MemorySegment segment, long offset)                                  { return BACKEND.getInt(segment.address() + offset); }
    public static int memGetIntAtIndex(MemorySegment segment, long index)                            { return BACKEND.getInt(segment.address() + (index << 2)); }
    public static int memGetIntUnaligned(MemorySegment segment, long offset)                         { return BACKEND.getIntUnaligned(segment.address() + offset); }
    public static int memGetIntUnalignedAtIndex(MemorySegment segment, long index)                   { return BACKEND.getIntUnaligned(segment.address() + (index << 2)); }

    public static long memGetLong(MemorySegment segment, long offset)                                { return BACKEND.getLong(segment.address() + offset); }
    public static long memGetLongAtIndex(MemorySegment segment, long index)                          { return BACKEND.getLong(segment.address() + (index << 3)); }
    public static long memGetLongUnaligned(MemorySegment segment, long offset)                       { return BACKEND.getLongUnaligned(segment.address() + offset); }
    public static long memGetLongUnalignedAtIndex(MemorySegment segment, long index)                 { return BACKEND.getLongUnaligned(segment.address() + (index << 3)); }

    public static float memGetFloat(MemorySegment segment, long offset)                              { return BACKEND.getFloat(segment.address() + offset); }
    public static float memGetFloatAtIndex(MemorySegment segment, long index)                        { return BACKEND.getFloat(segment.address() + (index << 2)); }
    public static float memGetFloatUnaligned(MemorySegment segment, long offset)                     { return BACKEND.getFloatUnaligned(segment.address() + offset); }
    public static float memGetFloatUnalignedAtIndex(MemorySegment segment, long index)               { return BACKEND.getFloatUnaligned(segment.address() + (index << 2)); }

    public static double memGetDouble(MemorySegment segment, long offset)                            { return BACKEND.getDouble(segment.address() + offset); }
    public static double memGetDoubleAtIndex(MemorySegment segment, long index)                      { return BACKEND.getDouble(segment.address() + (index << 3)); }
    public static double memGetDoubleUnaligned(MemorySegment segment, long offset)                   { return BACKEND.getDoubleUnaligned(segment.address() + offset); }
    public static double memGetDoubleUnalignedAtIndex(MemorySegment segment, long index)             { return BACKEND.getDoubleUnaligned(segment.address() + (index << 3)); }

    public static long memGetCLong(MemorySegment segment, long offset)                               { return BACKEND.getCLong(segment.address() + offset); }
    public static long memGetCLongAtIndex(MemorySegment segment, long index)                         { return BACKEND.getCLong(segment.address() + (index << CLONG_SHIFT)); }
    public static long memGetCLongUnaligned(MemorySegment segment, long offset)                      { return BACKEND.getCLongUnaligned(segment.address() + offset); }
    public static long memGetCLongUnalignedAtIndex(MemorySegment segment, long index)                { return BACKEND.getCLongUnaligned(segment.address() + (index << CLONG_SHIFT)); }

    public static long memGetAddress(MemorySegment segment, long offset)                             { return BACKEND.getAddress(segment.address() + offset); }
    public static long memGetAddressAtIndex(MemorySegment segment, long index)                       { return BACKEND.getAddress(segment.address() + (index << POINTER_SHIFT)); }
    public static long memGetAddressUnaligned(MemorySegment segment, long offset)                    { return BACKEND.getAddressUnaligned(segment.address() + offset); }
    public static long memGetAddressUnalignedAtIndex(MemorySegment segment, long index)              { return BACKEND.getAddressUnaligned(segment.address() + (index << POINTER_SHIFT)); }

    public static void memPutBoolean(MemorySegment segment, long offset, boolean value)              { BACKEND.putBoolean(segment.address() + offset, value); }

    public static void memPutByte(MemorySegment segment, long offset, byte value)                    { BACKEND.putByte(segment.address() + offset, value); }

    public static void memPutChar(MemorySegment segment, long offset, char value)                    { BACKEND.putChar(segment.address() + offset, value); }
    public static void memPutCharAtIndex(MemorySegment segment, long index, char value)              { BACKEND.putChar(segment.address() + (index << 1), value); }
    public static void memPutCharUnaligned(MemorySegment segment, long offset, char value)           { BACKEND.putCharUnaligned(segment.address() + offset, value); }
    public static void memPutCharUnalignedAtIndex(MemorySegment segment, long index, char value)     { BACKEND.putCharUnaligned(segment.address() + (index << 1), value); }

    public static void memPutShort(MemorySegment segment, long offset, short value)                  { BACKEND.putShort(segment.address() + offset, value); }
    public static void memPutShortAtIndex(MemorySegment segment, long index, short value)            { BACKEND.putShort(segment.address() + (index << 1), value); }
    public static void memPutShortUnaligned(MemorySegment segment, long offset, short value)         { BACKEND.putShortUnaligned(segment.address() + offset, value); }
    public static void memPutShortUnalignedAtIndex(MemorySegment segment, long index, short value)   { BACKEND.putShortUnaligned(segment.address() + (index << 1), value); }

    public static void memPutInt(MemorySegment segment, long offset, int value)                      { BACKEND.putInt(segment.address() + offset, value); }
    public static void memPutIntAtIndex(MemorySegment segment, long index, int value)                { BACKEND.putInt(segment.address() + (index << 2), value); }
    public static void memPutIntUnaligned(MemorySegment segment, long offset, int value)             { BACKEND.putIntUnaligned(segment.address() + offset, value); }
    public static void memPutIntUnalignedAtIndex(MemorySegment segment, long index, int value)       { BACKEND.putIntUnaligned(segment.address() + (index << 2), value); }

    public static void memPutLong(MemorySegment segment, long offset, long value)                    { BACKEND.putLong(segment.address() + offset, value); }
    public static void memPutLongAtIndex(MemorySegment segment, long index, long value)              { BACKEND.putLong(segment.address() + (index << 3), value); }
    public static void memPutLongUnaligned(MemorySegment segment, long offset, long value)           { BACKEND.putLongUnaligned(segment.address() + offset, value); }
    public static void memPutLongUnalignedAtIndex(MemorySegment segment, long index, long value)     { BACKEND.putLongUnaligned(segment.address() + (index << 3), value); }

    public static void memPutFloat(MemorySegment segment, long offset, float value)                  { BACKEND.putFloat(segment.address() + offset, value); }
    public static void memPutFloatAtIndex(MemorySegment segment, long index, float value)            { BACKEND.putFloat(segment.address() + (index << 2), value); }
    public static void memPutFloatUnaligned(MemorySegment segment, long offset, float value)         { BACKEND.putFloatUnaligned(segment.address() + offset, value); }
    public static void memPutFloatUnalignedAtIndex(MemorySegment segment, long index, float value)   { BACKEND.putFloatUnaligned(segment.address() + (index << 2), value); }

    public static void memPutDouble(MemorySegment segment, long offset, double value)                { BACKEND.putDouble(segment.address() + offset, value); }
    public static void memPutDoubleAtIndex(MemorySegment segment, long index, double value)          { BACKEND.putDouble(segment.address() + (index << 3), value); }
    public static void memPutDoubleUnaligned(MemorySegment segment, long offset, double value)       { BACKEND.putDoubleUnaligned(segment.address() + offset, value); }
    public static void memPutDoubleUnalignedAtIndex(MemorySegment segment, long index, double value) { BACKEND.putDoubleUnaligned(segment.address() + (index << 3), value); }

    public static void memPutCLong(MemorySegment segment, long offset, long value)                   { BACKEND.putCLong(segment.address() + offset, value); }
    public static void memPutCLongAtIndex(MemorySegment segment, long index, long value)             { BACKEND.putCLong(segment.address() + (index << CLONG_SHIFT), value); }
    public static void memPutCLongUnaligned(MemorySegment segment, long offset, long value)          { BACKEND.putCLongUnaligned(segment.address() + offset, value); }
    public static void memPutCLongUnalignedAtIndex(MemorySegment segment, long index, long value)    { BACKEND.putCLongUnaligned(segment.address() + (index << CLONG_SHIFT), value); }

    public static void memPutAddress(MemorySegment segment, long offset, long value)                 { BACKEND.putAddress(segment.address() + offset, value); }
    public static void memPutAddressAtIndex(MemorySegment segment, long index, long value)           { BACKEND.putAddress(segment.address() + (index << POINTER_SHIFT), value); }
    public static void memPutAddressUnaligned(MemorySegment segment, long offset, long value)        { BACKEND.putAddressUnaligned(segment.address() + offset, value); }
    public static void memPutAddressUnalignedAtIndex(MemorySegment segment, long index, long value)  { BACKEND.putAddressUnaligned(segment.address() + (index << POINTER_SHIFT), value); }

}