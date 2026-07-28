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
 * struct XrSystemPropertiesBodyTrackingFidelityMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsBodyTrackingFidelity;
 * }}</pre>
 */
public class XrSystemPropertiesBodyTrackingFidelityMETA extends Struct<XrSystemPropertiesBodyTrackingFidelityMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSBODYTRACKINGFIDELITY;

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
        SUPPORTSBODYTRACKINGFIDELITY = layout.offsetof(2);
    }

    protected XrSystemPropertiesBodyTrackingFidelityMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemPropertiesBodyTrackingFidelityMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemPropertiesBodyTrackingFidelityMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemPropertiesBodyTrackingFidelityMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemPropertiesBodyTrackingFidelityMETA(ByteBuffer container) {
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
    /** @return the value of the {@code supportsBodyTrackingFidelity} field. */
    @NativeType("XrBool32")
    public boolean supportsBodyTrackingFidelity() { return nsupportsBodyTrackingFidelity(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemPropertiesBodyTrackingFidelityMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METABodyTrackingFidelity#XR_TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FIDELITY_META TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FIDELITY_META} value to the {@code type} field. */
    public XrSystemPropertiesBodyTrackingFidelityMETA type$Default() { return type(METABodyTrackingFidelity.XR_TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FIDELITY_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemPropertiesBodyTrackingFidelityMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemPropertiesBodyTrackingFidelityMETA set(
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
    public XrSystemPropertiesBodyTrackingFidelityMETA set(XrSystemPropertiesBodyTrackingFidelityMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemPropertiesBodyTrackingFidelityMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemPropertiesBodyTrackingFidelityMETA malloc() {
        return new XrSystemPropertiesBodyTrackingFidelityMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPropertiesBodyTrackingFidelityMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemPropertiesBodyTrackingFidelityMETA calloc() {
        return new XrSystemPropertiesBodyTrackingFidelityMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPropertiesBodyTrackingFidelityMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemPropertiesBodyTrackingFidelityMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemPropertiesBodyTrackingFidelityMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemPropertiesBodyTrackingFidelityMETA} instance for the specified memory address. */
    public static XrSystemPropertiesBodyTrackingFidelityMETA create(long address) {
        return new XrSystemPropertiesBodyTrackingFidelityMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemPropertiesBodyTrackingFidelityMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemPropertiesBodyTrackingFidelityMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemPropertiesBodyTrackingFidelityMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFidelityMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemPropertiesBodyTrackingFidelityMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFidelityMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPropertiesBodyTrackingFidelityMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFidelityMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemPropertiesBodyTrackingFidelityMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFidelityMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemPropertiesBodyTrackingFidelityMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemPropertiesBodyTrackingFidelityMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPropertiesBodyTrackingFidelityMETA malloc(MemoryStack stack) {
        return new XrSystemPropertiesBodyTrackingFidelityMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemPropertiesBodyTrackingFidelityMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPropertiesBodyTrackingFidelityMETA calloc(MemoryStack stack) {
        return new XrSystemPropertiesBodyTrackingFidelityMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemPropertiesBodyTrackingFidelityMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFidelityMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPropertiesBodyTrackingFidelityMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFidelityMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemPropertiesBodyTrackingFidelityMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemPropertiesBodyTrackingFidelityMETA.NEXT); }
    /** Unsafe version of {@link #supportsBodyTrackingFidelity}. */
    public static int nsupportsBodyTrackingFidelity(long struct) { return memGetInt(struct + XrSystemPropertiesBodyTrackingFidelityMETA.SUPPORTSBODYTRACKINGFIDELITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemPropertiesBodyTrackingFidelityMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemPropertiesBodyTrackingFidelityMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemPropertiesBodyTrackingFidelityMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemPropertiesBodyTrackingFidelityMETA, Buffer> implements NativeResource {

        private static final XrSystemPropertiesBodyTrackingFidelityMETA ELEMENT_FACTORY = XrSystemPropertiesBodyTrackingFidelityMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemPropertiesBodyTrackingFidelityMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemPropertiesBodyTrackingFidelityMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemPropertiesBodyTrackingFidelityMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemPropertiesBodyTrackingFidelityMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemPropertiesBodyTrackingFidelityMETA.nnext(address()); }
        /** @return the value of the {@code supportsBodyTrackingFidelity} field. */
        @NativeType("XrBool32")
        public boolean supportsBodyTrackingFidelity() { return XrSystemPropertiesBodyTrackingFidelityMETA.nsupportsBodyTrackingFidelity(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemPropertiesBodyTrackingFidelityMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemPropertiesBodyTrackingFidelityMETA.ntype(address(), value); return this; }
        /** Sets the {@link METABodyTrackingFidelity#XR_TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FIDELITY_META TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FIDELITY_META} value to the {@code type} field. */
        public XrSystemPropertiesBodyTrackingFidelityMETA.Buffer type$Default() { return type(METABodyTrackingFidelity.XR_TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FIDELITY_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemPropertiesBodyTrackingFidelityMETA.Buffer next(@NativeType("void *") long value) { XrSystemPropertiesBodyTrackingFidelityMETA.nnext(address(), value); return this; }

    }

}