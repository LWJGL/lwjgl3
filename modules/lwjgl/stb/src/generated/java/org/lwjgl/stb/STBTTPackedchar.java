/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Packed character data, returned by {@link STBTruetype#stbtt_PackFontRange PackFontRange}
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stbtt_packedchar {
 *     unsigned short x0;
 *     unsigned short y0;
 *     unsigned short x1;
 *     unsigned short y1;
 *     float xoff;
 *     float yoff;
 *     float xadvance;
 *     float xoff2;
 *     float yoff2;
 * }</code></pre>
 */
@NativeType("struct stbtt_packedchar")
public class STBTTPackedchar extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X0,
        Y0,
        X1,
        Y1,
        XOFF,
        YOFF,
        XADVANCE,
        XOFF2,
        YOFF2;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X0 = layout.offsetof(0);
        Y0 = layout.offsetof(1);
        X1 = layout.offsetof(2);
        Y1 = layout.offsetof(3);
        XOFF = layout.offsetof(4);
        YOFF = layout.offsetof(5);
        XADVANCE = layout.offsetof(6);
        XOFF2 = layout.offsetof(7);
        YOFF2 = layout.offsetof(8);
    }

    /**
     * Creates a {@code STBTTPackedchar} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBTTPackedchar(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x0} field. */
    @NativeType("unsigned short")
    public short x0() { return nx0(address()); }
    /** @return the value of the {@code y0} field. */
    @NativeType("unsigned short")
    public short y0() { return ny0(address()); }
    /** @return the value of the {@code x1} field. */
    @NativeType("unsigned short")
    public short x1() { return nx1(address()); }
    /** @return the value of the {@code y1} field. */
    @NativeType("unsigned short")
    public short y1() { return ny1(address()); }
    /** @return the value of the {@code xoff} field. */
    public float xoff() { return nxoff(address()); }
    /** @return the value of the {@code yoff} field. */
    public float yoff() { return nyoff(address()); }
    /** @return the value of the {@code xadvance} field. */
    public float xadvance() { return nxadvance(address()); }
    /** @return the value of the {@code xoff2} field. */
    public float xoff2() { return nxoff2(address()); }
    /** @return the value of the {@code yoff2} field. */
    public float yoff2() { return nyoff2(address()); }

    /** Sets the specified value to the {@code x0} field. */
    public STBTTPackedchar x0(@NativeType("unsigned short") short value) { nx0(address(), value); return this; }
    /** Sets the specified value to the {@code y0} field. */
    public STBTTPackedchar y0(@NativeType("unsigned short") short value) { ny0(address(), value); return this; }
    /** Sets the specified value to the {@code x1} field. */
    public STBTTPackedchar x1(@NativeType("unsigned short") short value) { nx1(address(), value); return this; }
    /** Sets the specified value to the {@code y1} field. */
    public STBTTPackedchar y1(@NativeType("unsigned short") short value) { ny1(address(), value); return this; }
    /** Sets the specified value to the {@code xoff} field. */
    public STBTTPackedchar xoff(float value) { nxoff(address(), value); return this; }
    /** Sets the specified value to the {@code yoff} field. */
    public STBTTPackedchar yoff(float value) { nyoff(address(), value); return this; }
    /** Sets the specified value to the {@code xadvance} field. */
    public STBTTPackedchar xadvance(float value) { nxadvance(address(), value); return this; }
    /** Sets the specified value to the {@code xoff2} field. */
    public STBTTPackedchar xoff2(float value) { nxoff2(address(), value); return this; }
    /** Sets the specified value to the {@code yoff2} field. */
    public STBTTPackedchar yoff2(float value) { nyoff2(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public STBTTPackedchar set(
        short x0,
        short y0,
        short x1,
        short y1,
        float xoff,
        float yoff,
        float xadvance,
        float xoff2,
        float yoff2
    ) {
        x0(x0);
        y0(y0);
        x1(x1);
        y1(y1);
        xoff(xoff);
        yoff(yoff);
        xadvance(xadvance);
        xoff2(xoff2);
        yoff2(yoff2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public STBTTPackedchar set(STBTTPackedchar src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code STBTTPackedchar} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBTTPackedchar malloc() {
        return wrap(STBTTPackedchar.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code STBTTPackedchar} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBTTPackedchar calloc() {
        return wrap(STBTTPackedchar.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code STBTTPackedchar} instance allocated with {@link BufferUtils}. */
    public static STBTTPackedchar create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(STBTTPackedchar.class, memAddress(container), container);
    }

    /** Returns a new {@code STBTTPackedchar} instance for the specified memory address. */
    public static STBTTPackedchar create(long address) {
        return wrap(STBTTPackedchar.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBTTPackedchar createSafe(long address) {
        return address == NULL ? null : wrap(STBTTPackedchar.class, address);
    }

    /**
     * Returns a new {@link STBTTPackedchar.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTPackedchar.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBTTPackedchar.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTPackedchar.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTPackedchar.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTPackedchar.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link STBTTPackedchar.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBTTPackedchar.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBTTPackedchar.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackedchar mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackedchar callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackedchar mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackedchar callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackedchar.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackedchar.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackedchar.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackedchar.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code STBTTPackedchar} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTPackedchar malloc(MemoryStack stack) {
        return wrap(STBTTPackedchar.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code STBTTPackedchar} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTPackedchar calloc(MemoryStack stack) {
        return wrap(STBTTPackedchar.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBTTPackedchar.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTPackedchar.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTPackedchar.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTPackedchar.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x0}. */
    public static short nx0(long struct) { return UNSAFE.getShort(null, struct + STBTTPackedchar.X0); }
    /** Unsafe version of {@link #y0}. */
    public static short ny0(long struct) { return UNSAFE.getShort(null, struct + STBTTPackedchar.Y0); }
    /** Unsafe version of {@link #x1}. */
    public static short nx1(long struct) { return UNSAFE.getShort(null, struct + STBTTPackedchar.X1); }
    /** Unsafe version of {@link #y1}. */
    public static short ny1(long struct) { return UNSAFE.getShort(null, struct + STBTTPackedchar.Y1); }
    /** Unsafe version of {@link #xoff}. */
    public static float nxoff(long struct) { return UNSAFE.getFloat(null, struct + STBTTPackedchar.XOFF); }
    /** Unsafe version of {@link #yoff}. */
    public static float nyoff(long struct) { return UNSAFE.getFloat(null, struct + STBTTPackedchar.YOFF); }
    /** Unsafe version of {@link #xadvance}. */
    public static float nxadvance(long struct) { return UNSAFE.getFloat(null, struct + STBTTPackedchar.XADVANCE); }
    /** Unsafe version of {@link #xoff2}. */
    public static float nxoff2(long struct) { return UNSAFE.getFloat(null, struct + STBTTPackedchar.XOFF2); }
    /** Unsafe version of {@link #yoff2}. */
    public static float nyoff2(long struct) { return UNSAFE.getFloat(null, struct + STBTTPackedchar.YOFF2); }

    /** Unsafe version of {@link #x0(short) x0}. */
    public static void nx0(long struct, short value) { UNSAFE.putShort(null, struct + STBTTPackedchar.X0, value); }
    /** Unsafe version of {@link #y0(short) y0}. */
    public static void ny0(long struct, short value) { UNSAFE.putShort(null, struct + STBTTPackedchar.Y0, value); }
    /** Unsafe version of {@link #x1(short) x1}. */
    public static void nx1(long struct, short value) { UNSAFE.putShort(null, struct + STBTTPackedchar.X1, value); }
    /** Unsafe version of {@link #y1(short) y1}. */
    public static void ny1(long struct, short value) { UNSAFE.putShort(null, struct + STBTTPackedchar.Y1, value); }
    /** Unsafe version of {@link #xoff(float) xoff}. */
    public static void nxoff(long struct, float value) { UNSAFE.putFloat(null, struct + STBTTPackedchar.XOFF, value); }
    /** Unsafe version of {@link #yoff(float) yoff}. */
    public static void nyoff(long struct, float value) { UNSAFE.putFloat(null, struct + STBTTPackedchar.YOFF, value); }
    /** Unsafe version of {@link #xadvance(float) xadvance}. */
    public static void nxadvance(long struct, float value) { UNSAFE.putFloat(null, struct + STBTTPackedchar.XADVANCE, value); }
    /** Unsafe version of {@link #xoff2(float) xoff2}. */
    public static void nxoff2(long struct, float value) { UNSAFE.putFloat(null, struct + STBTTPackedchar.XOFF2, value); }
    /** Unsafe version of {@link #yoff2(float) yoff2}. */
    public static void nyoff2(long struct, float value) { UNSAFE.putFloat(null, struct + STBTTPackedchar.YOFF2, value); }

    // -----------------------------------

    /** An array of {@link STBTTPackedchar} structs. */
    public static class Buffer extends StructBuffer<STBTTPackedchar, Buffer> implements NativeResource {

        private static final STBTTPackedchar ELEMENT_FACTORY = STBTTPackedchar.create(-1L);

        /**
         * Creates a new {@code STBTTPackedchar.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBTTPackedchar#SIZEOF}, and its mark will be undefined.
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
        protected STBTTPackedchar getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x0} field. */
        @NativeType("unsigned short")
        public short x0() { return STBTTPackedchar.nx0(address()); }
        /** @return the value of the {@code y0} field. */
        @NativeType("unsigned short")
        public short y0() { return STBTTPackedchar.ny0(address()); }
        /** @return the value of the {@code x1} field. */
        @NativeType("unsigned short")
        public short x1() { return STBTTPackedchar.nx1(address()); }
        /** @return the value of the {@code y1} field. */
        @NativeType("unsigned short")
        public short y1() { return STBTTPackedchar.ny1(address()); }
        /** @return the value of the {@code xoff} field. */
        public float xoff() { return STBTTPackedchar.nxoff(address()); }
        /** @return the value of the {@code yoff} field. */
        public float yoff() { return STBTTPackedchar.nyoff(address()); }
        /** @return the value of the {@code xadvance} field. */
        public float xadvance() { return STBTTPackedchar.nxadvance(address()); }
        /** @return the value of the {@code xoff2} field. */
        public float xoff2() { return STBTTPackedchar.nxoff2(address()); }
        /** @return the value of the {@code yoff2} field. */
        public float yoff2() { return STBTTPackedchar.nyoff2(address()); }

        /** Sets the specified value to the {@code x0} field. */
        public STBTTPackedchar.Buffer x0(@NativeType("unsigned short") short value) { STBTTPackedchar.nx0(address(), value); return this; }
        /** Sets the specified value to the {@code y0} field. */
        public STBTTPackedchar.Buffer y0(@NativeType("unsigned short") short value) { STBTTPackedchar.ny0(address(), value); return this; }
        /** Sets the specified value to the {@code x1} field. */
        public STBTTPackedchar.Buffer x1(@NativeType("unsigned short") short value) { STBTTPackedchar.nx1(address(), value); return this; }
        /** Sets the specified value to the {@code y1} field. */
        public STBTTPackedchar.Buffer y1(@NativeType("unsigned short") short value) { STBTTPackedchar.ny1(address(), value); return this; }
        /** Sets the specified value to the {@code xoff} field. */
        public STBTTPackedchar.Buffer xoff(float value) { STBTTPackedchar.nxoff(address(), value); return this; }
        /** Sets the specified value to the {@code yoff} field. */
        public STBTTPackedchar.Buffer yoff(float value) { STBTTPackedchar.nyoff(address(), value); return this; }
        /** Sets the specified value to the {@code xadvance} field. */
        public STBTTPackedchar.Buffer xadvance(float value) { STBTTPackedchar.nxadvance(address(), value); return this; }
        /** Sets the specified value to the {@code xoff2} field. */
        public STBTTPackedchar.Buffer xoff2(float value) { STBTTPackedchar.nxoff2(address(), value); return this; }
        /** Sets the specified value to the {@code yoff2} field. */
        public STBTTPackedchar.Buffer yoff2(float value) { STBTTPackedchar.nyoff2(address(), value); return this; }

    }

}