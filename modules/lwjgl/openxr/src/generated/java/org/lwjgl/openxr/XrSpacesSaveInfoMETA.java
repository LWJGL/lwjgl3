/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSpacesSaveInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t spaceCount;
 *     XrSpace * spaces;
 * }}</pre>
 */
public class XrSpacesSaveInfoMETA extends Struct<XrSpacesSaveInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACECOUNT,
        SPACES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACECOUNT = layout.offsetof(2);
        SPACES = layout.offsetof(3);
    }

    protected XrSpacesSaveInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpacesSaveInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSpacesSaveInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrSpacesSaveInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpacesSaveInfoMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code spaceCount} field. */
    @NativeType("uint32_t")
    public int spaceCount() { return nspaceCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code spaces} field. */
    @NativeType("XrSpace *")
    public PointerBuffer spaces() { return nspaces(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpacesSaveInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityPersistence#XR_TYPE_SPACES_SAVE_INFO_META TYPE_SPACES_SAVE_INFO_META} value to the {@code type} field. */
    public XrSpacesSaveInfoMETA type$Default() { return type(METASpatialEntityPersistence.XR_TYPE_SPACES_SAVE_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpacesSaveInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
    public XrSpacesSaveInfoMETA spaces(@NativeType("XrSpace *") PointerBuffer value) { nspaces(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpacesSaveInfoMETA set(
        int type,
        long next,
        PointerBuffer spaces
    ) {
        type(type);
        next(next);
        spaces(spaces);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpacesSaveInfoMETA set(XrSpacesSaveInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpacesSaveInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpacesSaveInfoMETA malloc() {
        return new XrSpacesSaveInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpacesSaveInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpacesSaveInfoMETA calloc() {
        return new XrSpacesSaveInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpacesSaveInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrSpacesSaveInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpacesSaveInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSpacesSaveInfoMETA} instance for the specified memory address. */
    public static XrSpacesSaveInfoMETA create(long address) {
        return new XrSpacesSaveInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpacesSaveInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrSpacesSaveInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrSpacesSaveInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesSaveInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpacesSaveInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesSaveInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpacesSaveInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesSaveInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpacesSaveInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpacesSaveInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpacesSaveInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpacesSaveInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpacesSaveInfoMETA malloc(MemoryStack stack) {
        return new XrSpacesSaveInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpacesSaveInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpacesSaveInfoMETA calloc(MemoryStack stack) {
        return new XrSpacesSaveInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpacesSaveInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpacesSaveInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpacesSaveInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpacesSaveInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpacesSaveInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpacesSaveInfoMETA.NEXT); }
    /** Unsafe version of {@link #spaceCount}. */
    public static int nspaceCount(long struct) { return memGetInt(struct + XrSpacesSaveInfoMETA.SPACECOUNT); }
    /** Unsafe version of {@link #spaces() spaces}. */
    public static PointerBuffer nspaces(long struct) { return memPointerBuffer(memGetAddress(struct + XrSpacesSaveInfoMETA.SPACES), nspaceCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpacesSaveInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpacesSaveInfoMETA.NEXT, value); }
    /** Sets the specified value to the {@code spaceCount} field of the specified {@code struct}. */
    public static void nspaceCount(long struct, int value) { memPutInt(struct + XrSpacesSaveInfoMETA.SPACECOUNT, value); }
    /** Unsafe version of {@link #spaces(PointerBuffer) spaces}. */
    public static void nspaces(long struct, PointerBuffer value) { memPutAddress(struct + XrSpacesSaveInfoMETA.SPACES, memAddress(value)); nspaceCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpacesSaveInfoMETA.SPACES));
    }

    // -----------------------------------

    /** An array of {@link XrSpacesSaveInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrSpacesSaveInfoMETA, Buffer> implements NativeResource {

        private static final XrSpacesSaveInfoMETA ELEMENT_FACTORY = XrSpacesSaveInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrSpacesSaveInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpacesSaveInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpacesSaveInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpacesSaveInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpacesSaveInfoMETA.nnext(address()); }
        /** @return the value of the {@code spaceCount} field. */
        @NativeType("uint32_t")
        public int spaceCount() { return XrSpacesSaveInfoMETA.nspaceCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code spaces} field. */
        @NativeType("XrSpace *")
        public PointerBuffer spaces() { return XrSpacesSaveInfoMETA.nspaces(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpacesSaveInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSpacesSaveInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityPersistence#XR_TYPE_SPACES_SAVE_INFO_META TYPE_SPACES_SAVE_INFO_META} value to the {@code type} field. */
        public XrSpacesSaveInfoMETA.Buffer type$Default() { return type(METASpatialEntityPersistence.XR_TYPE_SPACES_SAVE_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpacesSaveInfoMETA.Buffer next(@NativeType("void const *") long value) { XrSpacesSaveInfoMETA.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
        public XrSpacesSaveInfoMETA.Buffer spaces(@NativeType("XrSpace *") PointerBuffer value) { XrSpacesSaveInfoMETA.nspaces(address(), value); return this; }

    }

}