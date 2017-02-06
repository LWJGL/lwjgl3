/*
 * Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package sun.misc;

import java.lang.reflect.*;

/** Unsafe API for Android compilation. Removed comments and deprecated methods. */
public final class Unsafe {

    private Unsafe() {}

    public native int getInt(Object o, long offset);
    public native void putInt(Object o, long offset, int x);
    public native Object getObject(Object o, long offset);
    public native void putObject(Object o, long offset, Object x);

    public native boolean getBoolean(Object o, long offset);
    public native void putBoolean(Object o, long offset, boolean x);
    public native byte getByte(Object o, long offset);
    public native void putByte(Object o, long offset, byte x);
    public native short getShort(Object o, long offset);
    public native void putShort(Object o, long offset, short x);
    public native char getChar(Object o, long offset);
    public native void putChar(Object o, long offset, char x);
    public native long getLong(Object o, long offset);
    public native void putLong(Object o, long offset, long x);
    public native float getFloat(Object o, long offset);
    public native void putFloat(Object o, long offset, float x);
    public native double getDouble(Object o, long offset);
    public native void putDouble(Object o, long offset, double x);

    public native byte getByte(long address);
    public native void putByte(long address, byte x);
    public native short getShort(long address);
    public native void putShort(long address, short x);
    public native char getChar(long address);
    public native void putChar(long address, char x);
    public native int getInt(long address);
    public native void putInt(long address, int x);
    public native long getLong(long address);
    public native void putLong(long address, long x);
    public native float getFloat(long address);
    public native void putFloat(long address, float x);
    public native double getDouble(long address);
    public native void putDouble(long address, double x);

    /* The following two methods do not exist on Android, but are necessary for desktop builds. */
    public native long getAddress(long offset);
    public native void putAddress(long offset, long newValue);

    public native long allocateMemory(long bytes);
    public native void setMemory(long address, long bytes, byte value);
    public native void copyMemory(long srcAddr, long dstAddr, long bytes);
    public native void freeMemory(long address);

    public static final int INVALID_FIELD_OFFSET = -1;

    public long objectFieldOffset(Field field)                            { return 0L; }

    public int arrayBaseOffset(Class<?> clazz)                            { return 0; }
    public int arrayIndexScale(Class<?> clazz)                            { return 0; }

    public native int addressSize();
    public native int pageSize();

    public native Object allocateInstance(Class<?> c);

    public native boolean compareAndSwapObject(Object o, long offset, Object expected, Object x);
    public native boolean compareAndSwapInt(Object o, long offset, int expected, int x);
    public native boolean compareAndSwapLong(Object o, long offset, long expected, long x);

    public native Object getObjectVolatile(Object o, long offset);
    public native void putObjectVolatile(Object o, long offset, Object x);
    public native int getIntVolatile(Object o, long offset);
    public native void putIntVolatile(Object o, long offset, int x);
    public native long getLongVolatile(Object o, long offset);
    public native void putLongVolatile(Object o, long offset, long x);
    public native void putOrderedObject(Object o, long offset, Object x);
    public native void putOrderedInt(Object o, long offset, int x);
    public native void putOrderedLong(Object o, long offset, long x);

    public void unpark(Object o)                                          {}
    public void park(boolean absolute, long time)                         {}

    public int getAndAddInt(Object o, long offset, int delta)             { return 0; }
    public long getAndAddLong(Object o, long offset, long delta)          { return 0L; }

    public int getAndSetInt(Object o, long offset, int newValue)          { return 0; }
    public long getAndSetLong(Object o, long offset, long newValue)       { return 0L; }
    public Object getAndSetObject(Object o, long offset, Object newValue) { return null; }

    public native void loadFence();
    public native void storeFence();
    public native void fullFence();

}