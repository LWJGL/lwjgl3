/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_image {
 *     {@link NkHandle nk_handle} handle;
 *     nk_ushort w;
 *     nk_ushort h;
 *     nk_ushort region[4];
 * }</code></pre>
 */
@NativeType("struct nk_image")
public class NkImage extends Struct<NkImage> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        W,
        H,
        REGION;

    static {
        Layout layout = __struct(
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(2),
            __member(2),
            __array(2, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        W = layout.offsetof(1);
        H = layout.offsetof(2);
        REGION = layout.offsetof(3);
    }

    protected NkImage(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkImage create(long address, @Nullable ByteBuffer container) {
        return new NkImage(address, container);
    }

    /**
     * Creates a {@code NkImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkImage(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link NkHandle} view of the {@code handle} field. */
    @NativeType("nk_handle")
    public NkHandle handle() { return nhandle(address()); }
    /** @return the value of the {@code w} field. */
    @NativeType("nk_ushort")
    public short w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    @NativeType("nk_ushort")
    public short h() { return nh(address()); }
    /** @return a {@link ShortBuffer} view of the {@code region} field. */
    @NativeType("nk_ushort[4]")
    public ShortBuffer region() { return nregion(address()); }
    /** @return the value at the specified index of the {@code region} field. */
    @NativeType("nk_ushort")
    public short region(int index) { return nregion(address(), index); }

    /** Copies the specified {@link NkHandle} to the {@code handle} field. */
    public NkImage handle(@NativeType("nk_handle") NkHandle value) { nhandle(address(), value); return this; }
    /** Passes the {@code handle} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkImage handle(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(handle()); return this; }
    /** Sets the specified value to the {@code w} field. */
    public NkImage w(@NativeType("nk_ushort") short value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public NkImage h(@NativeType("nk_ushort") short value) { nh(address(), value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code region} field. */
    public NkImage region(@NativeType("nk_ushort[4]") ShortBuffer value) { nregion(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code region} field. */
    public NkImage region(int index, @NativeType("nk_ushort") short value) { nregion(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public NkImage set(
        NkHandle handle,
        short w,
        short h,
        ShortBuffer region
    ) {
        handle(handle);
        w(w);
        h(h);
        region(region);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkImage set(NkImage src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkImage} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkImage malloc() {
        return new NkImage(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkImage} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkImage calloc() {
        return new NkImage(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkImage} instance allocated with {@link BufferUtils}. */
    public static NkImage create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkImage(memAddress(container), container);
    }

    /** Returns a new {@code NkImage} instance for the specified memory address. */
    public static NkImage create(long address) {
        return new NkImage(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkImage createSafe(long address) {
        return address == NULL ? null : new NkImage(address, null);
    }

    /**
     * Returns a new {@link NkImage.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkImage.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkImage.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkImage.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkImage.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkImage.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkImage.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkImage.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkImage.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkImage mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkImage callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkImage mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkImage callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkImage.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkImage.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkImage.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkImage.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkImage} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkImage malloc(MemoryStack stack) {
        return new NkImage(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkImage} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkImage calloc(MemoryStack stack) {
        return new NkImage(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkImage.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkImage.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkImage.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkImage.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static NkHandle nhandle(long struct) { return NkHandle.create(struct + NkImage.HANDLE); }
    /** Unsafe version of {@link #w}. */
    public static short nw(long struct) { return memGetShort(struct + NkImage.W); }
    /** Unsafe version of {@link #h}. */
    public static short nh(long struct) { return memGetShort(struct + NkImage.H); }
    /** Unsafe version of {@link #region}. */
    public static ShortBuffer nregion(long struct) { return memShortBuffer(struct + NkImage.REGION, 4); }
    /** Unsafe version of {@link #region(int) region}. */
    public static short nregion(long struct, int index) {
        return memGetShort(struct + NkImage.REGION + check(index, 4) * 2);
    }

    /** Unsafe version of {@link #handle(NkHandle) handle}. */
    public static void nhandle(long struct, NkHandle value) { memCopy(value.address(), struct + NkImage.HANDLE, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #w(short) w}. */
    public static void nw(long struct, short value) { memPutShort(struct + NkImage.W, value); }
    /** Unsafe version of {@link #h(short) h}. */
    public static void nh(long struct, short value) { memPutShort(struct + NkImage.H, value); }
    /** Unsafe version of {@link #region(ShortBuffer) region}. */
    public static void nregion(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + NkImage.REGION, value.remaining() * 2);
    }
    /** Unsafe version of {@link #region(int, short) region}. */
    public static void nregion(long struct, int index, short value) {
        memPutShort(struct + NkImage.REGION + check(index, 4) * 2, value);
    }

    // -----------------------------------

    /** An array of {@link NkImage} structs. */
    public static class Buffer extends StructBuffer<NkImage, Buffer> implements NativeResource {

        private static final NkImage ELEMENT_FACTORY = NkImage.create(-1L);

        /**
         * Creates a new {@code NkImage.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkImage#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected NkImage getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkHandle} view of the {@code handle} field. */
        @NativeType("nk_handle")
        public NkHandle handle() { return NkImage.nhandle(address()); }
        /** @return the value of the {@code w} field. */
        @NativeType("nk_ushort")
        public short w() { return NkImage.nw(address()); }
        /** @return the value of the {@code h} field. */
        @NativeType("nk_ushort")
        public short h() { return NkImage.nh(address()); }
        /** @return a {@link ShortBuffer} view of the {@code region} field. */
        @NativeType("nk_ushort[4]")
        public ShortBuffer region() { return NkImage.nregion(address()); }
        /** @return the value at the specified index of the {@code region} field. */
        @NativeType("nk_ushort")
        public short region(int index) { return NkImage.nregion(address(), index); }

        /** Copies the specified {@link NkHandle} to the {@code handle} field. */
        public NkImage.Buffer handle(@NativeType("nk_handle") NkHandle value) { NkImage.nhandle(address(), value); return this; }
        /** Passes the {@code handle} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkImage.Buffer handle(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(handle()); return this; }
        /** Sets the specified value to the {@code w} field. */
        public NkImage.Buffer w(@NativeType("nk_ushort") short value) { NkImage.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public NkImage.Buffer h(@NativeType("nk_ushort") short value) { NkImage.nh(address(), value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code region} field. */
        public NkImage.Buffer region(@NativeType("nk_ushort[4]") ShortBuffer value) { NkImage.nregion(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code region} field. */
        public NkImage.Buffer region(int index, @NativeType("nk_ushort") short value) { NkImage.nregion(address(), index, value); return this; }

    }

}