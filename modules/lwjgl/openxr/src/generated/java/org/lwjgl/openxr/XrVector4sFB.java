/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A four component short integer vector.
 * 
 * <h5>Member Descriptions</h5>
 * 
 * <ul>
 * <li>{@code x} is the {@code x} component of the vector.</li>
 * <li>{@code y} is the {@code y} component of the vector.</li>
 * <li>{@code z} is the {@code z} component of the vector.</li>
 * <li>{@code w} is the {@code w} component of the vector.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBHandTrackingMesh XR_FB_hand_tracking_mesh} extension <b>must</b> be enabled prior to using {@link XrVector4sFB}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandTrackingMeshFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVector4sFB {
 *     int16_t x;
 *     int16_t y;
 *     int16_t z;
 *     int16_t w;
 * }</code></pre>
 */
public class XrVector4sFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        Z,
        W;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
        W = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrVector4sFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVector4sFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    @NativeType("int16_t")
    public short x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    @NativeType("int16_t")
    public short y() { return ny(address()); }
    /** @return the value of the {@code z} field. */
    @NativeType("int16_t")
    public short z() { return nz(address()); }
    /** @return the value of the {@code w} field. */
    @NativeType("int16_t")
    public short w() { return nw(address()); }

    /** Sets the specified value to the {@code x} field. */
    public XrVector4sFB x(@NativeType("int16_t") short value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public XrVector4sFB y(@NativeType("int16_t") short value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public XrVector4sFB z(@NativeType("int16_t") short value) { nz(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public XrVector4sFB w(@NativeType("int16_t") short value) { nw(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVector4sFB set(
        short x,
        short y,
        short z,
        short w
    ) {
        x(x);
        y(y);
        z(z);
        w(w);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVector4sFB set(XrVector4sFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVector4sFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVector4sFB malloc() {
        return wrap(XrVector4sFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrVector4sFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVector4sFB calloc() {
        return wrap(XrVector4sFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrVector4sFB} instance allocated with {@link BufferUtils}. */
    public static XrVector4sFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrVector4sFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrVector4sFB} instance for the specified memory address. */
    public static XrVector4sFB create(long address) {
        return wrap(XrVector4sFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVector4sFB createSafe(long address) {
        return address == NULL ? null : wrap(XrVector4sFB.class, address);
    }

    /**
     * Returns a new {@link XrVector4sFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVector4sFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVector4sFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVector4sFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVector4sFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVector4sFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrVector4sFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVector4sFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVector4sFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrVector4sFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVector4sFB malloc(MemoryStack stack) {
        return wrap(XrVector4sFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrVector4sFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVector4sFB calloc(MemoryStack stack) {
        return wrap(XrVector4sFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrVector4sFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVector4sFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVector4sFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVector4sFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static short nx(long struct) { return UNSAFE.getShort(null, struct + XrVector4sFB.X); }
    /** Unsafe version of {@link #y}. */
    public static short ny(long struct) { return UNSAFE.getShort(null, struct + XrVector4sFB.Y); }
    /** Unsafe version of {@link #z}. */
    public static short nz(long struct) { return UNSAFE.getShort(null, struct + XrVector4sFB.Z); }
    /** Unsafe version of {@link #w}. */
    public static short nw(long struct) { return UNSAFE.getShort(null, struct + XrVector4sFB.W); }

    /** Unsafe version of {@link #x(short) x}. */
    public static void nx(long struct, short value) { UNSAFE.putShort(null, struct + XrVector4sFB.X, value); }
    /** Unsafe version of {@link #y(short) y}. */
    public static void ny(long struct, short value) { UNSAFE.putShort(null, struct + XrVector4sFB.Y, value); }
    /** Unsafe version of {@link #z(short) z}. */
    public static void nz(long struct, short value) { UNSAFE.putShort(null, struct + XrVector4sFB.Z, value); }
    /** Unsafe version of {@link #w(short) w}. */
    public static void nw(long struct, short value) { UNSAFE.putShort(null, struct + XrVector4sFB.W, value); }

    // -----------------------------------

    /** An array of {@link XrVector4sFB} structs. */
    public static class Buffer extends StructBuffer<XrVector4sFB, Buffer> implements NativeResource {

        private static final XrVector4sFB ELEMENT_FACTORY = XrVector4sFB.create(-1L);

        /**
         * Creates a new {@code XrVector4sFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVector4sFB#SIZEOF}, and its mark will be undefined.
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
        protected XrVector4sFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        @NativeType("int16_t")
        public short x() { return XrVector4sFB.nx(address()); }
        /** @return the value of the {@code y} field. */
        @NativeType("int16_t")
        public short y() { return XrVector4sFB.ny(address()); }
        /** @return the value of the {@code z} field. */
        @NativeType("int16_t")
        public short z() { return XrVector4sFB.nz(address()); }
        /** @return the value of the {@code w} field. */
        @NativeType("int16_t")
        public short w() { return XrVector4sFB.nw(address()); }

        /** Sets the specified value to the {@code x} field. */
        public XrVector4sFB.Buffer x(@NativeType("int16_t") short value) { XrVector4sFB.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public XrVector4sFB.Buffer y(@NativeType("int16_t") short value) { XrVector4sFB.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public XrVector4sFB.Buffer z(@NativeType("int16_t") short value) { XrVector4sFB.nz(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public XrVector4sFB.Buffer w(@NativeType("int16_t") short value) { XrVector4sFB.nw(address(), value); return this; }

    }

}