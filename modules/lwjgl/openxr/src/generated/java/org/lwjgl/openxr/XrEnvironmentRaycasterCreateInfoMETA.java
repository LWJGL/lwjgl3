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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrEnvironmentRaycasterCreateInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrEnvironmentRaycasterCreateInfoMETA extends Struct<XrEnvironmentRaycasterCreateInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrEnvironmentRaycasterCreateInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEnvironmentRaycasterCreateInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEnvironmentRaycasterCreateInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrEnvironmentRaycasterCreateInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEnvironmentRaycasterCreateInfoMETA(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrEnvironmentRaycasterCreateInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_ENVIRONMENT_RAYCASTER_CREATE_INFO_META TYPE_ENVIRONMENT_RAYCASTER_CREATE_INFO_META} value to the {@code type} field. */
    public XrEnvironmentRaycasterCreateInfoMETA type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_ENVIRONMENT_RAYCASTER_CREATE_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEnvironmentRaycasterCreateInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEnvironmentRaycasterCreateInfoMETA set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEnvironmentRaycasterCreateInfoMETA set(XrEnvironmentRaycasterCreateInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEnvironmentRaycasterCreateInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEnvironmentRaycasterCreateInfoMETA malloc() {
        return new XrEnvironmentRaycasterCreateInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentRaycasterCreateInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEnvironmentRaycasterCreateInfoMETA calloc() {
        return new XrEnvironmentRaycasterCreateInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentRaycasterCreateInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrEnvironmentRaycasterCreateInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEnvironmentRaycasterCreateInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEnvironmentRaycasterCreateInfoMETA} instance for the specified memory address. */
    public static XrEnvironmentRaycasterCreateInfoMETA create(long address) {
        return new XrEnvironmentRaycasterCreateInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEnvironmentRaycasterCreateInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrEnvironmentRaycasterCreateInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycasterCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycasterCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycasterCreateInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEnvironmentRaycasterCreateInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEnvironmentRaycasterCreateInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEnvironmentRaycasterCreateInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentRaycasterCreateInfoMETA malloc(MemoryStack stack) {
        return new XrEnvironmentRaycasterCreateInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEnvironmentRaycasterCreateInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentRaycasterCreateInfoMETA calloc(MemoryStack stack) {
        return new XrEnvironmentRaycasterCreateInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycasterCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycasterCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEnvironmentRaycasterCreateInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEnvironmentRaycasterCreateInfoMETA.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEnvironmentRaycasterCreateInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEnvironmentRaycasterCreateInfoMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEnvironmentRaycasterCreateInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrEnvironmentRaycasterCreateInfoMETA, Buffer> implements NativeResource {

        private static final XrEnvironmentRaycasterCreateInfoMETA ELEMENT_FACTORY = XrEnvironmentRaycasterCreateInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrEnvironmentRaycasterCreateInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEnvironmentRaycasterCreateInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEnvironmentRaycasterCreateInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEnvironmentRaycasterCreateInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEnvironmentRaycasterCreateInfoMETA.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEnvironmentRaycasterCreateInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEnvironmentRaycasterCreateInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_ENVIRONMENT_RAYCASTER_CREATE_INFO_META TYPE_ENVIRONMENT_RAYCASTER_CREATE_INFO_META} value to the {@code type} field. */
        public XrEnvironmentRaycasterCreateInfoMETA.Buffer type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_ENVIRONMENT_RAYCASTER_CREATE_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEnvironmentRaycasterCreateInfoMETA.Buffer next(@NativeType("void const *") long value) { XrEnvironmentRaycasterCreateInfoMETA.nnext(address(), value); return this; }

    }

}