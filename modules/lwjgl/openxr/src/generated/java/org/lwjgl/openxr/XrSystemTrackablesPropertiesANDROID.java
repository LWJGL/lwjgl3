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
 * struct XrSystemTrackablesPropertiesANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 supportsAnchor;
 *     uint32_t maxAnchors;
 * }}</pre>
 */
public class XrSystemTrackablesPropertiesANDROID extends Struct<XrSystemTrackablesPropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSANCHOR,
        MAXANCHORS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSANCHOR = layout.offsetof(2);
        MAXANCHORS = layout.offsetof(3);
    }

    protected XrSystemTrackablesPropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemTrackablesPropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSystemTrackablesPropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code XrSystemTrackablesPropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemTrackablesPropertiesANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code supportsAnchor} field. */
    @NativeType("XrBool32")
    public boolean supportsAnchor() { return nsupportsAnchor(address()) != 0; }
    /** @return the value of the {@code maxAnchors} field. */
    @NativeType("uint32_t")
    public int maxAnchors() { return nmaxAnchors(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemTrackablesPropertiesANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackables#XR_TYPE_SYSTEM_TRACKABLES_PROPERTIES_ANDROID TYPE_SYSTEM_TRACKABLES_PROPERTIES_ANDROID} value to the {@code type} field. */
    public XrSystemTrackablesPropertiesANDROID type$Default() { return type(ANDROIDTrackables.XR_TYPE_SYSTEM_TRACKABLES_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemTrackablesPropertiesANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemTrackablesPropertiesANDROID set(
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
    public XrSystemTrackablesPropertiesANDROID set(XrSystemTrackablesPropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemTrackablesPropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemTrackablesPropertiesANDROID malloc() {
        return new XrSystemTrackablesPropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemTrackablesPropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemTrackablesPropertiesANDROID calloc() {
        return new XrSystemTrackablesPropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemTrackablesPropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSystemTrackablesPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemTrackablesPropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemTrackablesPropertiesANDROID} instance for the specified memory address. */
    public static XrSystemTrackablesPropertiesANDROID create(long address) {
        return new XrSystemTrackablesPropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemTrackablesPropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new XrSystemTrackablesPropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSystemTrackablesPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackablesPropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemTrackablesPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackablesPropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemTrackablesPropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackablesPropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemTrackablesPropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackablesPropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemTrackablesPropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemTrackablesPropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemTrackablesPropertiesANDROID malloc(MemoryStack stack) {
        return new XrSystemTrackablesPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemTrackablesPropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemTrackablesPropertiesANDROID calloc(MemoryStack stack) {
        return new XrSystemTrackablesPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemTrackablesPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackablesPropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemTrackablesPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackablesPropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemTrackablesPropertiesANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemTrackablesPropertiesANDROID.NEXT); }
    /** Unsafe version of {@link #supportsAnchor}. */
    public static int nsupportsAnchor(long struct) { return memGetInt(struct + XrSystemTrackablesPropertiesANDROID.SUPPORTSANCHOR); }
    /** Unsafe version of {@link #maxAnchors}. */
    public static int nmaxAnchors(long struct) { return memGetInt(struct + XrSystemTrackablesPropertiesANDROID.MAXANCHORS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemTrackablesPropertiesANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemTrackablesPropertiesANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemTrackablesPropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSystemTrackablesPropertiesANDROID, Buffer> implements NativeResource {

        private static final XrSystemTrackablesPropertiesANDROID ELEMENT_FACTORY = XrSystemTrackablesPropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code XrSystemTrackablesPropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemTrackablesPropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemTrackablesPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemTrackablesPropertiesANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSystemTrackablesPropertiesANDROID.nnext(address()); }
        /** @return the value of the {@code supportsAnchor} field. */
        @NativeType("XrBool32")
        public boolean supportsAnchor() { return XrSystemTrackablesPropertiesANDROID.nsupportsAnchor(address()) != 0; }
        /** @return the value of the {@code maxAnchors} field. */
        @NativeType("uint32_t")
        public int maxAnchors() { return XrSystemTrackablesPropertiesANDROID.nmaxAnchors(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemTrackablesPropertiesANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSystemTrackablesPropertiesANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackables#XR_TYPE_SYSTEM_TRACKABLES_PROPERTIES_ANDROID TYPE_SYSTEM_TRACKABLES_PROPERTIES_ANDROID} value to the {@code type} field. */
        public XrSystemTrackablesPropertiesANDROID.Buffer type$Default() { return type(ANDROIDTrackables.XR_TYPE_SYSTEM_TRACKABLES_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemTrackablesPropertiesANDROID.Buffer next(@NativeType("void const *") long value) { XrSystemTrackablesPropertiesANDROID.nnext(address(), value); return this; }

    }

}