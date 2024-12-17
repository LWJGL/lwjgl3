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
 * struct XrSpaceEraseInfoFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace space;
 *     XrSpaceStorageLocationFB location;
 * }}</pre>
 */
public class XrSpaceEraseInfoFB extends Struct<XrSpaceEraseInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACE,
        LOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        LOCATION = layout.offsetof(3);
    }

    protected XrSpaceEraseInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceEraseInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceEraseInfoFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceEraseInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceEraseInfoFB(ByteBuffer container) {
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
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return the value of the {@code location} field. */
    @NativeType("XrSpaceStorageLocationFB")
    public int location() { return nlocation(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceEraseInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityStorage#XR_TYPE_SPACE_ERASE_INFO_FB TYPE_SPACE_ERASE_INFO_FB} value to the {@code type} field. */
    public XrSpaceEraseInfoFB type$Default() { return type(FBSpatialEntityStorage.XR_TYPE_SPACE_ERASE_INFO_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceEraseInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrSpaceEraseInfoFB space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code location} field. */
    public XrSpaceEraseInfoFB location(@NativeType("XrSpaceStorageLocationFB") int value) { nlocation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceEraseInfoFB set(
        int type,
        long next,
        XrSpace space,
        int location
    ) {
        type(type);
        next(next);
        space(space);
        location(location);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceEraseInfoFB set(XrSpaceEraseInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceEraseInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceEraseInfoFB malloc() {
        return new XrSpaceEraseInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceEraseInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceEraseInfoFB calloc() {
        return new XrSpaceEraseInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceEraseInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceEraseInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceEraseInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceEraseInfoFB} instance for the specified memory address. */
    public static XrSpaceEraseInfoFB create(long address) {
        return new XrSpaceEraseInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceEraseInfoFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceEraseInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrSpaceEraseInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceEraseInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceEraseInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceEraseInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceEraseInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceEraseInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceEraseInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceEraseInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceEraseInfoFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceEraseInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceEraseInfoFB malloc(MemoryStack stack) {
        return new XrSpaceEraseInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceEraseInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceEraseInfoFB calloc(MemoryStack stack) {
        return new XrSpaceEraseInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceEraseInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceEraseInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceEraseInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceEraseInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceEraseInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceEraseInfoFB.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpaceEraseInfoFB.SPACE); }
    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return memGetInt(struct + XrSpaceEraseInfoFB.LOCATION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceEraseInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceEraseInfoFB.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrSpaceEraseInfoFB.SPACE, value.address()); }
    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { memPutInt(struct + XrSpaceEraseInfoFB.LOCATION, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpaceEraseInfoFB.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpaceEraseInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceEraseInfoFB, Buffer> implements NativeResource {

        private static final XrSpaceEraseInfoFB ELEMENT_FACTORY = XrSpaceEraseInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceEraseInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceEraseInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceEraseInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceEraseInfoFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceEraseInfoFB.nnext(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpaceEraseInfoFB.nspace(address()); }
        /** @return the value of the {@code location} field. */
        @NativeType("XrSpaceStorageLocationFB")
        public int location() { return XrSpaceEraseInfoFB.nlocation(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceEraseInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceEraseInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityStorage#XR_TYPE_SPACE_ERASE_INFO_FB TYPE_SPACE_ERASE_INFO_FB} value to the {@code type} field. */
        public XrSpaceEraseInfoFB.Buffer type$Default() { return type(FBSpatialEntityStorage.XR_TYPE_SPACE_ERASE_INFO_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceEraseInfoFB.Buffer next(@NativeType("void const *") long value) { XrSpaceEraseInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrSpaceEraseInfoFB.Buffer space(XrSpace value) { XrSpaceEraseInfoFB.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code location} field. */
        public XrSpaceEraseInfoFB.Buffer location(@NativeType("XrSpaceStorageLocationFB") int value) { XrSpaceEraseInfoFB.nlocation(address(), value); return this; }

    }

}