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
 * struct XrSystemColocationDiscoveryPropertiesMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsColocationDiscovery;
 * }}</pre>
 */
public class XrSystemColocationDiscoveryPropertiesMETA extends Struct<XrSystemColocationDiscoveryPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSCOLOCATIONDISCOVERY;

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
        SUPPORTSCOLOCATIONDISCOVERY = layout.offsetof(2);
    }

    protected XrSystemColocationDiscoveryPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemColocationDiscoveryPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemColocationDiscoveryPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemColocationDiscoveryPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemColocationDiscoveryPropertiesMETA(ByteBuffer container) {
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
    /** @return the value of the {@code supportsColocationDiscovery} field. */
    @NativeType("XrBool32")
    public boolean supportsColocationDiscovery() { return nsupportsColocationDiscovery(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemColocationDiscoveryPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META} value to the {@code type} field. */
    public XrSystemColocationDiscoveryPropertiesMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemColocationDiscoveryPropertiesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemColocationDiscoveryPropertiesMETA set(
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
    public XrSystemColocationDiscoveryPropertiesMETA set(XrSystemColocationDiscoveryPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemColocationDiscoveryPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemColocationDiscoveryPropertiesMETA malloc() {
        return new XrSystemColocationDiscoveryPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemColocationDiscoveryPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemColocationDiscoveryPropertiesMETA calloc() {
        return new XrSystemColocationDiscoveryPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemColocationDiscoveryPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemColocationDiscoveryPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemColocationDiscoveryPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemColocationDiscoveryPropertiesMETA} instance for the specified memory address. */
    public static XrSystemColocationDiscoveryPropertiesMETA create(long address) {
        return new XrSystemColocationDiscoveryPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemColocationDiscoveryPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemColocationDiscoveryPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemColocationDiscoveryPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemColocationDiscoveryPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemColocationDiscoveryPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemColocationDiscoveryPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemColocationDiscoveryPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemColocationDiscoveryPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemColocationDiscoveryPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemColocationDiscoveryPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemColocationDiscoveryPropertiesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemColocationDiscoveryPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemColocationDiscoveryPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemColocationDiscoveryPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemColocationDiscoveryPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemColocationDiscoveryPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemColocationDiscoveryPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemColocationDiscoveryPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemColocationDiscoveryPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemColocationDiscoveryPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemColocationDiscoveryPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemColocationDiscoveryPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemColocationDiscoveryPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #supportsColocationDiscovery}. */
    public static int nsupportsColocationDiscovery(long struct) { return memGetInt(struct + XrSystemColocationDiscoveryPropertiesMETA.SUPPORTSCOLOCATIONDISCOVERY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemColocationDiscoveryPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemColocationDiscoveryPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemColocationDiscoveryPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemColocationDiscoveryPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemColocationDiscoveryPropertiesMETA ELEMENT_FACTORY = XrSystemColocationDiscoveryPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemColocationDiscoveryPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemColocationDiscoveryPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemColocationDiscoveryPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemColocationDiscoveryPropertiesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemColocationDiscoveryPropertiesMETA.nnext(address()); }
        /** @return the value of the {@code supportsColocationDiscovery} field. */
        @NativeType("XrBool32")
        public boolean supportsColocationDiscovery() { return XrSystemColocationDiscoveryPropertiesMETA.nsupportsColocationDiscovery(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemColocationDiscoveryPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemColocationDiscoveryPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META} value to the {@code type} field. */
        public XrSystemColocationDiscoveryPropertiesMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemColocationDiscoveryPropertiesMETA.Buffer next(@NativeType("void *") long value) { XrSystemColocationDiscoveryPropertiesMETA.nnext(address(), value); return this; }

    }

}