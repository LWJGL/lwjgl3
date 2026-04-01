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
 * struct XrSystemEnvironmentRaycastPropertiesMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsEnvironmentRaycast;
 * }}</pre>
 */
public class XrSystemEnvironmentRaycastPropertiesMETA extends Struct<XrSystemEnvironmentRaycastPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSENVIRONMENTRAYCAST;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSENVIRONMENTRAYCAST = layout.offsetof(2);
    }

    protected XrSystemEnvironmentRaycastPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemEnvironmentRaycastPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemEnvironmentRaycastPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemEnvironmentRaycastPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemEnvironmentRaycastPropertiesMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code supportsEnvironmentRaycast} field. */
    @NativeType("XrBool32")
    public boolean supportsEnvironmentRaycast() { return nsupportsEnvironmentRaycast(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemEnvironmentRaycastPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_SYSTEM_ENVIRONMENT_RAYCAST_PROPERTIES_META TYPE_SYSTEM_ENVIRONMENT_RAYCAST_PROPERTIES_META} value to the {@code type} field. */
    public XrSystemEnvironmentRaycastPropertiesMETA type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_SYSTEM_ENVIRONMENT_RAYCAST_PROPERTIES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemEnvironmentRaycastPropertiesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemEnvironmentRaycastPropertiesMETA set(
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
    public XrSystemEnvironmentRaycastPropertiesMETA set(XrSystemEnvironmentRaycastPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemEnvironmentRaycastPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemEnvironmentRaycastPropertiesMETA malloc() {
        return new XrSystemEnvironmentRaycastPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemEnvironmentRaycastPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemEnvironmentRaycastPropertiesMETA calloc() {
        return new XrSystemEnvironmentRaycastPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemEnvironmentRaycastPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemEnvironmentRaycastPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemEnvironmentRaycastPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemEnvironmentRaycastPropertiesMETA} instance for the specified memory address. */
    public static XrSystemEnvironmentRaycastPropertiesMETA create(long address) {
        return new XrSystemEnvironmentRaycastPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemEnvironmentRaycastPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemEnvironmentRaycastPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemEnvironmentRaycastPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentRaycastPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemEnvironmentRaycastPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentRaycastPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemEnvironmentRaycastPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentRaycastPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemEnvironmentRaycastPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentRaycastPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemEnvironmentRaycastPropertiesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemEnvironmentRaycastPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemEnvironmentRaycastPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemEnvironmentRaycastPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemEnvironmentRaycastPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemEnvironmentRaycastPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemEnvironmentRaycastPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemEnvironmentRaycastPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentRaycastPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemEnvironmentRaycastPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentRaycastPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemEnvironmentRaycastPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemEnvironmentRaycastPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #supportsEnvironmentRaycast}. */
    public static int nsupportsEnvironmentRaycast(long struct) { return memGetInt(struct + XrSystemEnvironmentRaycastPropertiesMETA.SUPPORTSENVIRONMENTRAYCAST); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemEnvironmentRaycastPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemEnvironmentRaycastPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemEnvironmentRaycastPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemEnvironmentRaycastPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemEnvironmentRaycastPropertiesMETA ELEMENT_FACTORY = XrSystemEnvironmentRaycastPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemEnvironmentRaycastPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemEnvironmentRaycastPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemEnvironmentRaycastPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemEnvironmentRaycastPropertiesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemEnvironmentRaycastPropertiesMETA.nnext(address()); }
        /** @return the value of the {@code supportsEnvironmentRaycast} field. */
        @NativeType("XrBool32")
        public boolean supportsEnvironmentRaycast() { return XrSystemEnvironmentRaycastPropertiesMETA.nsupportsEnvironmentRaycast(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemEnvironmentRaycastPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemEnvironmentRaycastPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_SYSTEM_ENVIRONMENT_RAYCAST_PROPERTIES_META TYPE_SYSTEM_ENVIRONMENT_RAYCAST_PROPERTIES_META} value to the {@code type} field. */
        public XrSystemEnvironmentRaycastPropertiesMETA.Buffer type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_SYSTEM_ENVIRONMENT_RAYCAST_PROPERTIES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemEnvironmentRaycastPropertiesMETA.Buffer next(@NativeType("void *") long value) { XrSystemEnvironmentRaycastPropertiesMETA.nnext(address(), value); return this; }

    }

}