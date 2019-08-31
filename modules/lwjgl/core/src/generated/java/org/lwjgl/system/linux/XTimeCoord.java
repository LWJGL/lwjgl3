/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code time} &ndash; the time, in milliseconds</li>
 * <li>{@code x} &ndash; the x coordinate of the pointer relative to the origin of the specified window</li>
 * <li>{@code y} &ndash; the y coordinate of the pointer relative to the origin of the specified window</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XTimeCoord {
 *     Time time;
 *     short x;
 *     short y;
 * }</code></pre>
 */
public class XTimeCoord extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TIME,
        X,
        Y;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TIME = layout.offsetof(0);
        X = layout.offsetof(1);
        Y = layout.offsetof(2);
    }

    /**
     * Creates a {@code XTimeCoord} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XTimeCoord(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code time} field. */
    @NativeType("Time")
    public long time() { return ntime(address()); }
    /** Returns the value of the {@code x} field. */
    public short x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public short y() { return ny(address()); }

    // -----------------------------------

    /** Returns a new {@code XTimeCoord} instance for the specified memory address. */
    public static XTimeCoord create(long address) {
        return wrap(XTimeCoord.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XTimeCoord createSafe(long address) {
        return address == NULL ? null : wrap(XTimeCoord.class, address);
    }

    /**
     * Create a {@link XTimeCoord.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XTimeCoord.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XTimeCoord.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetCLong(struct + XTimeCoord.TIME); }
    /** Unsafe version of {@link #x}. */
    public static short nx(long struct) { return UNSAFE.getShort(null, struct + XTimeCoord.X); }
    /** Unsafe version of {@link #y}. */
    public static short ny(long struct) { return UNSAFE.getShort(null, struct + XTimeCoord.Y); }

    // -----------------------------------

    /** An array of {@link XTimeCoord} structs. */
    public static class Buffer extends StructBuffer<XTimeCoord, Buffer> {

        private static final XTimeCoord ELEMENT_FACTORY = XTimeCoord.create(-1L);

        /**
         * Creates a new {@code XTimeCoord.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XTimeCoord#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XTimeCoord getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code time} field. */
        @NativeType("Time")
        public long time() { return XTimeCoord.ntime(address()); }
        /** Returns the value of the {@code x} field. */
        public short x() { return XTimeCoord.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public short y() { return XTimeCoord.ny(address()); }

    }

}