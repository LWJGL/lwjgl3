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
 * struct XrTrackableTrackerCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrTrackableTypeANDROID trackableType;
 * }}</pre>
 */
public class XrTrackableTrackerCreateInfoANDROID extends Struct<XrTrackableTrackerCreateInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TRACKABLETYPE;

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
        TRACKABLETYPE = layout.offsetof(2);
    }

    protected XrTrackableTrackerCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableTrackerCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableTrackerCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableTrackerCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableTrackerCreateInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code trackableType} field. */
    @NativeType("XrTrackableTypeANDROID")
    public int trackableType() { return ntrackableType(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackableTrackerCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackables#XR_TYPE_TRACKABLE_TRACKER_CREATE_INFO_ANDROID TYPE_TRACKABLE_TRACKER_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrTrackableTrackerCreateInfoANDROID type$Default() { return type(ANDROIDTrackables.XR_TYPE_TRACKABLE_TRACKER_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackableTrackerCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrTrackableMarkerConfigurationANDROID} value to the {@code next} chain. */
    public XrTrackableTrackerCreateInfoANDROID next(XrTrackableMarkerConfigurationANDROID value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrTrackableObjectConfigurationANDROID} value to the {@code next} chain. */
    public XrTrackableTrackerCreateInfoANDROID next(XrTrackableObjectConfigurationANDROID value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code trackableType} field. */
    public XrTrackableTrackerCreateInfoANDROID trackableType(@NativeType("XrTrackableTypeANDROID") int value) { ntrackableType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableTrackerCreateInfoANDROID set(
        int type,
        long next,
        int trackableType
    ) {
        type(type);
        next(next);
        trackableType(trackableType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTrackableTrackerCreateInfoANDROID set(XrTrackableTrackerCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableTrackerCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableTrackerCreateInfoANDROID malloc() {
        return new XrTrackableTrackerCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableTrackerCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableTrackerCreateInfoANDROID calloc() {
        return new XrTrackableTrackerCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableTrackerCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableTrackerCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableTrackerCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableTrackerCreateInfoANDROID} instance for the specified memory address. */
    public static XrTrackableTrackerCreateInfoANDROID create(long address) {
        return new XrTrackableTrackerCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableTrackerCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableTrackerCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableTrackerCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableTrackerCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableTrackerCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableTrackerCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableTrackerCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableTrackerCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableTrackerCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableTrackerCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableTrackerCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableTrackerCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableTrackerCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrTrackableTrackerCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableTrackerCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableTrackerCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrTrackableTrackerCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableTrackerCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableTrackerCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableTrackerCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableTrackerCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackableTrackerCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackableTrackerCreateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #trackableType}. */
    public static int ntrackableType(long struct) { return memGetInt(struct + XrTrackableTrackerCreateInfoANDROID.TRACKABLETYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackableTrackerCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackableTrackerCreateInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #trackableType(int) trackableType}. */
    public static void ntrackableType(long struct, int value) { memPutInt(struct + XrTrackableTrackerCreateInfoANDROID.TRACKABLETYPE, value); }

    // -----------------------------------

    /** An array of {@link XrTrackableTrackerCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableTrackerCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrTrackableTrackerCreateInfoANDROID ELEMENT_FACTORY = XrTrackableTrackerCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableTrackerCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableTrackerCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableTrackerCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackableTrackerCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrTrackableTrackerCreateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code trackableType} field. */
        @NativeType("XrTrackableTypeANDROID")
        public int trackableType() { return XrTrackableTrackerCreateInfoANDROID.ntrackableType(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackableTrackerCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackableTrackerCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackables#XR_TYPE_TRACKABLE_TRACKER_CREATE_INFO_ANDROID TYPE_TRACKABLE_TRACKER_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrTrackableTrackerCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDTrackables.XR_TYPE_TRACKABLE_TRACKER_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackableTrackerCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrTrackableTrackerCreateInfoANDROID.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrTrackableMarkerConfigurationANDROID} value to the {@code next} chain. */
        public XrTrackableTrackerCreateInfoANDROID.Buffer next(XrTrackableMarkerConfigurationANDROID value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrTrackableObjectConfigurationANDROID} value to the {@code next} chain. */
        public XrTrackableTrackerCreateInfoANDROID.Buffer next(XrTrackableObjectConfigurationANDROID value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code trackableType} field. */
        public XrTrackableTrackerCreateInfoANDROID.Buffer trackableType(@NativeType("XrTrackableTypeANDROID") int value) { XrTrackableTrackerCreateInfoANDROID.ntrackableType(address(), value); return this; }

    }

}