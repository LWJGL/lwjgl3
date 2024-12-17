/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct MOUSEINPUT {
 *     LONG dx;
 *     LONG dy;
 *     DWORD mouseData;
 *     DWORD dwFlags;
 *     DWORD time;
 *     ULONG_PTR dwExtraInfo;
 * }}</pre>
 */
public class MOUSEINPUT extends Struct<MOUSEINPUT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DX,
        DY,
        MOUSEDATA,
        DWFLAGS,
        TIME,
        DWEXTRAINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DX = layout.offsetof(0);
        DY = layout.offsetof(1);
        MOUSEDATA = layout.offsetof(2);
        DWFLAGS = layout.offsetof(3);
        TIME = layout.offsetof(4);
        DWEXTRAINFO = layout.offsetof(5);
    }

    protected MOUSEINPUT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MOUSEINPUT create(long address, @Nullable ByteBuffer container) {
        return new MOUSEINPUT(address, container);
    }

    /**
     * Creates a {@code MOUSEINPUT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MOUSEINPUT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code dx} field. */
    @NativeType("LONG")
    public int dx() { return ndx(address()); }
    /** @return the value of the {@code dy} field. */
    @NativeType("LONG")
    public int dy() { return ndy(address()); }
    /** @return the value of the {@code mouseData} field. */
    @NativeType("DWORD")
    public int mouseData() { return nmouseData(address()); }
    /** @return the value of the {@code dwFlags} field. */
    @NativeType("DWORD")
    public int dwFlags() { return ndwFlags(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("DWORD")
    public int time() { return ntime(address()); }
    /** @return the value of the {@code dwExtraInfo} field. */
    @NativeType("ULONG_PTR")
    public long dwExtraInfo() { return ndwExtraInfo(address()); }

    /** Sets the specified value to the {@code dx} field. */
    public MOUSEINPUT dx(@NativeType("LONG") int value) { ndx(address(), value); return this; }
    /** Sets the specified value to the {@code dy} field. */
    public MOUSEINPUT dy(@NativeType("LONG") int value) { ndy(address(), value); return this; }
    /** Sets the specified value to the {@code mouseData} field. */
    public MOUSEINPUT mouseData(@NativeType("DWORD") int value) { nmouseData(address(), value); return this; }
    /** Sets the specified value to the {@code dwFlags} field. */
    public MOUSEINPUT dwFlags(@NativeType("DWORD") int value) { ndwFlags(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public MOUSEINPUT time(@NativeType("DWORD") int value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@code dwExtraInfo} field. */
    public MOUSEINPUT dwExtraInfo(@NativeType("ULONG_PTR") long value) { ndwExtraInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MOUSEINPUT set(
        int dx,
        int dy,
        int mouseData,
        int dwFlags,
        int time,
        long dwExtraInfo
    ) {
        dx(dx);
        dy(dy);
        mouseData(mouseData);
        dwFlags(dwFlags);
        time(time);
        dwExtraInfo(dwExtraInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MOUSEINPUT set(MOUSEINPUT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MOUSEINPUT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MOUSEINPUT malloc() {
        return new MOUSEINPUT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MOUSEINPUT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MOUSEINPUT calloc() {
        return new MOUSEINPUT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MOUSEINPUT} instance allocated with {@link BufferUtils}. */
    public static MOUSEINPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MOUSEINPUT(memAddress(container), container);
    }

    /** Returns a new {@code MOUSEINPUT} instance for the specified memory address. */
    public static MOUSEINPUT create(long address) {
        return new MOUSEINPUT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MOUSEINPUT createSafe(long address) {
        return address == NULL ? null : new MOUSEINPUT(address, null);
    }

    /**
     * Returns a new {@link MOUSEINPUT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MOUSEINPUT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MOUSEINPUT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MOUSEINPUT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MOUSEINPUT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code MOUSEINPUT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MOUSEINPUT malloc(MemoryStack stack) {
        return new MOUSEINPUT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MOUSEINPUT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MOUSEINPUT calloc(MemoryStack stack) {
        return new MOUSEINPUT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MOUSEINPUT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MOUSEINPUT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dx}. */
    public static int ndx(long struct) { return memGetInt(struct + MOUSEINPUT.DX); }
    /** Unsafe version of {@link #dy}. */
    public static int ndy(long struct) { return memGetInt(struct + MOUSEINPUT.DY); }
    /** Unsafe version of {@link #mouseData}. */
    public static int nmouseData(long struct) { return memGetInt(struct + MOUSEINPUT.MOUSEDATA); }
    /** Unsafe version of {@link #dwFlags}. */
    public static int ndwFlags(long struct) { return memGetInt(struct + MOUSEINPUT.DWFLAGS); }
    /** Unsafe version of {@link #time}. */
    public static int ntime(long struct) { return memGetInt(struct + MOUSEINPUT.TIME); }
    /** Unsafe version of {@link #dwExtraInfo}. */
    public static long ndwExtraInfo(long struct) { return memGetAddress(struct + MOUSEINPUT.DWEXTRAINFO); }

    /** Unsafe version of {@link #dx(int) dx}. */
    public static void ndx(long struct, int value) { memPutInt(struct + MOUSEINPUT.DX, value); }
    /** Unsafe version of {@link #dy(int) dy}. */
    public static void ndy(long struct, int value) { memPutInt(struct + MOUSEINPUT.DY, value); }
    /** Unsafe version of {@link #mouseData(int) mouseData}. */
    public static void nmouseData(long struct, int value) { memPutInt(struct + MOUSEINPUT.MOUSEDATA, value); }
    /** Unsafe version of {@link #dwFlags(int) dwFlags}. */
    public static void ndwFlags(long struct, int value) { memPutInt(struct + MOUSEINPUT.DWFLAGS, value); }
    /** Unsafe version of {@link #time(int) time}. */
    public static void ntime(long struct, int value) { memPutInt(struct + MOUSEINPUT.TIME, value); }
    /** Unsafe version of {@link #dwExtraInfo(long) dwExtraInfo}. */
    public static void ndwExtraInfo(long struct, long value) { memPutAddress(struct + MOUSEINPUT.DWEXTRAINFO, value); }

    // -----------------------------------

    /** An array of {@link MOUSEINPUT} structs. */
    public static class Buffer extends StructBuffer<MOUSEINPUT, Buffer> implements NativeResource {

        private static final MOUSEINPUT ELEMENT_FACTORY = MOUSEINPUT.create(-1L);

        /**
         * Creates a new {@code MOUSEINPUT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MOUSEINPUT#SIZEOF}, and its mark will be undefined.</p>
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
        protected MOUSEINPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code dx} field. */
        @NativeType("LONG")
        public int dx() { return MOUSEINPUT.ndx(address()); }
        /** @return the value of the {@code dy} field. */
        @NativeType("LONG")
        public int dy() { return MOUSEINPUT.ndy(address()); }
        /** @return the value of the {@code mouseData} field. */
        @NativeType("DWORD")
        public int mouseData() { return MOUSEINPUT.nmouseData(address()); }
        /** @return the value of the {@code dwFlags} field. */
        @NativeType("DWORD")
        public int dwFlags() { return MOUSEINPUT.ndwFlags(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("DWORD")
        public int time() { return MOUSEINPUT.ntime(address()); }
        /** @return the value of the {@code dwExtraInfo} field. */
        @NativeType("ULONG_PTR")
        public long dwExtraInfo() { return MOUSEINPUT.ndwExtraInfo(address()); }

        /** Sets the specified value to the {@code dx} field. */
        public MOUSEINPUT.Buffer dx(@NativeType("LONG") int value) { MOUSEINPUT.ndx(address(), value); return this; }
        /** Sets the specified value to the {@code dy} field. */
        public MOUSEINPUT.Buffer dy(@NativeType("LONG") int value) { MOUSEINPUT.ndy(address(), value); return this; }
        /** Sets the specified value to the {@code mouseData} field. */
        public MOUSEINPUT.Buffer mouseData(@NativeType("DWORD") int value) { MOUSEINPUT.nmouseData(address(), value); return this; }
        /** Sets the specified value to the {@code dwFlags} field. */
        public MOUSEINPUT.Buffer dwFlags(@NativeType("DWORD") int value) { MOUSEINPUT.ndwFlags(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public MOUSEINPUT.Buffer time(@NativeType("DWORD") int value) { MOUSEINPUT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@code dwExtraInfo} field. */
        public MOUSEINPUT.Buffer dwExtraInfo(@NativeType("ULONG_PTR") long value) { MOUSEINPUT.ndwExtraInfo(address(), value); return this; }

    }

}