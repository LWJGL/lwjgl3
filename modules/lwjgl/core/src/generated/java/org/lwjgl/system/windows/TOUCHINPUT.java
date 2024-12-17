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
 * struct TOUCHINPUT {
 *     LONG x;
 *     LONG y;
 *     HANDLE hSource;
 *     DWORD dwID;
 *     DWORD dwFlags;
 *     DWORD dwMask;
 *     DWORD dwTime;
 *     ULONG_PTR dwExtraInfo;
 *     DWORD cxContact;
 *     DWORD cyContact;
 * }}</pre>
 */
public class TOUCHINPUT extends Struct<TOUCHINPUT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        HSOURCE,
        DWID,
        DWFLAGS,
        DWMASK,
        DWTIME,
        DWEXTRAINFO,
        CXCONTACT,
        CYCONTACT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        HSOURCE = layout.offsetof(2);
        DWID = layout.offsetof(3);
        DWFLAGS = layout.offsetof(4);
        DWMASK = layout.offsetof(5);
        DWTIME = layout.offsetof(6);
        DWEXTRAINFO = layout.offsetof(7);
        CXCONTACT = layout.offsetof(8);
        CYCONTACT = layout.offsetof(9);
    }

    protected TOUCHINPUT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected TOUCHINPUT create(long address, @Nullable ByteBuffer container) {
        return new TOUCHINPUT(address, container);
    }

    /**
     * Creates a {@code TOUCHINPUT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TOUCHINPUT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    @NativeType("LONG")
    public int x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    @NativeType("LONG")
    public int y() { return ny(address()); }
    /** @return the value of the {@code hSource} field. */
    @NativeType("HANDLE")
    public long hSource() { return nhSource(address()); }
    /** @return the value of the {@code dwID} field. */
    @NativeType("DWORD")
    public int dwID() { return ndwID(address()); }
    /** @return the value of the {@code dwFlags} field. */
    @NativeType("DWORD")
    public int dwFlags() { return ndwFlags(address()); }
    /** @return the value of the {@code dwMask} field. */
    @NativeType("DWORD")
    public int dwMask() { return ndwMask(address()); }
    /** @return the value of the {@code dwTime} field. */
    @NativeType("DWORD")
    public int dwTime() { return ndwTime(address()); }
    /** @return the value of the {@code dwExtraInfo} field. */
    @NativeType("ULONG_PTR")
    public long dwExtraInfo() { return ndwExtraInfo(address()); }
    /** @return the value of the {@code cxContact} field. */
    @NativeType("DWORD")
    public int cxContact() { return ncxContact(address()); }
    /** @return the value of the {@code cyContact} field. */
    @NativeType("DWORD")
    public int cyContact() { return ncyContact(address()); }

    // -----------------------------------

    /** Returns a new {@code TOUCHINPUT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static TOUCHINPUT malloc() {
        return new TOUCHINPUT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code TOUCHINPUT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static TOUCHINPUT calloc() {
        return new TOUCHINPUT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code TOUCHINPUT} instance allocated with {@link BufferUtils}. */
    public static TOUCHINPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new TOUCHINPUT(memAddress(container), container);
    }

    /** Returns a new {@code TOUCHINPUT} instance for the specified memory address. */
    public static TOUCHINPUT create(long address) {
        return new TOUCHINPUT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable TOUCHINPUT createSafe(long address) {
        return address == NULL ? null : new TOUCHINPUT(address, null);
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link TOUCHINPUT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static TOUCHINPUT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static TOUCHINPUT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static TOUCHINPUT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static TOUCHINPUT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static TOUCHINPUT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static TOUCHINPUT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static TOUCHINPUT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static TOUCHINPUT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static TOUCHINPUT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code TOUCHINPUT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static TOUCHINPUT malloc(MemoryStack stack) {
        return new TOUCHINPUT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code TOUCHINPUT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static TOUCHINPUT calloc(MemoryStack stack) {
        return new TOUCHINPUT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return memGetInt(struct + TOUCHINPUT.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return memGetInt(struct + TOUCHINPUT.Y); }
    /** Unsafe version of {@link #hSource}. */
    public static long nhSource(long struct) { return memGetAddress(struct + TOUCHINPUT.HSOURCE); }
    /** Unsafe version of {@link #dwID}. */
    public static int ndwID(long struct) { return memGetInt(struct + TOUCHINPUT.DWID); }
    /** Unsafe version of {@link #dwFlags}. */
    public static int ndwFlags(long struct) { return memGetInt(struct + TOUCHINPUT.DWFLAGS); }
    /** Unsafe version of {@link #dwMask}. */
    public static int ndwMask(long struct) { return memGetInt(struct + TOUCHINPUT.DWMASK); }
    /** Unsafe version of {@link #dwTime}. */
    public static int ndwTime(long struct) { return memGetInt(struct + TOUCHINPUT.DWTIME); }
    /** Unsafe version of {@link #dwExtraInfo}. */
    public static long ndwExtraInfo(long struct) { return memGetAddress(struct + TOUCHINPUT.DWEXTRAINFO); }
    /** Unsafe version of {@link #cxContact}. */
    public static int ncxContact(long struct) { return memGetInt(struct + TOUCHINPUT.CXCONTACT); }
    /** Unsafe version of {@link #cyContact}. */
    public static int ncyContact(long struct) { return memGetInt(struct + TOUCHINPUT.CYCONTACT); }

    // -----------------------------------

    /** An array of {@link TOUCHINPUT} structs. */
    public static class Buffer extends StructBuffer<TOUCHINPUT, Buffer> implements NativeResource {

        private static final TOUCHINPUT ELEMENT_FACTORY = TOUCHINPUT.create(-1L);

        /**
         * Creates a new {@code TOUCHINPUT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TOUCHINPUT#SIZEOF}, and its mark will be undefined.</p>
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
        protected TOUCHINPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        @NativeType("LONG")
        public int x() { return TOUCHINPUT.nx(address()); }
        /** @return the value of the {@code y} field. */
        @NativeType("LONG")
        public int y() { return TOUCHINPUT.ny(address()); }
        /** @return the value of the {@code hSource} field. */
        @NativeType("HANDLE")
        public long hSource() { return TOUCHINPUT.nhSource(address()); }
        /** @return the value of the {@code dwID} field. */
        @NativeType("DWORD")
        public int dwID() { return TOUCHINPUT.ndwID(address()); }
        /** @return the value of the {@code dwFlags} field. */
        @NativeType("DWORD")
        public int dwFlags() { return TOUCHINPUT.ndwFlags(address()); }
        /** @return the value of the {@code dwMask} field. */
        @NativeType("DWORD")
        public int dwMask() { return TOUCHINPUT.ndwMask(address()); }
        /** @return the value of the {@code dwTime} field. */
        @NativeType("DWORD")
        public int dwTime() { return TOUCHINPUT.ndwTime(address()); }
        /** @return the value of the {@code dwExtraInfo} field. */
        @NativeType("ULONG_PTR")
        public long dwExtraInfo() { return TOUCHINPUT.ndwExtraInfo(address()); }
        /** @return the value of the {@code cxContact} field. */
        @NativeType("DWORD")
        public int cxContact() { return TOUCHINPUT.ncxContact(address()); }
        /** @return the value of the {@code cyContact} field. */
        @NativeType("DWORD")
        public int cyContact() { return TOUCHINPUT.ncyContact(address()); }

    }

}