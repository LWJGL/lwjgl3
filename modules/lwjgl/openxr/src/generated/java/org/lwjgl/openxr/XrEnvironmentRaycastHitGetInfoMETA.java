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
 * <pre><code>
 * struct XrEnvironmentRaycastHitGetInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 *     XrTime time;
 *     {@link XrVector3f XrVector3f} origin;
 *     {@link XrVector3f XrVector3f} direction;
 *     uint32_t filterCount;
 *     {@link XrEnvironmentRaycastFilterBaseHeaderMETA XrEnvironmentRaycastFilterBaseHeaderMETA} const * const * filters;
 * }</code></pre>
 */
public class XrEnvironmentRaycastHitGetInfoMETA extends Struct<XrEnvironmentRaycastHitGetInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        TIME,
        ORIGIN,
        DIRECTION,
        FILTERCOUNT,
        FILTERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        ORIGIN = layout.offsetof(4);
        DIRECTION = layout.offsetof(5);
        FILTERCOUNT = layout.offsetof(6);
        FILTERS = layout.offsetof(7);
    }

    protected XrEnvironmentRaycastHitGetInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEnvironmentRaycastHitGetInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEnvironmentRaycastHitGetInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrEnvironmentRaycastHitGetInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEnvironmentRaycastHitGetInfoMETA(ByteBuffer container) {
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
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** @return a {@link XrVector3f} view of the {@code origin} field. */
    public XrVector3f origin() { return norigin(address()); }
    /** @return a {@link XrVector3f} view of the {@code direction} field. */
    public XrVector3f direction() { return ndirection(address()); }
    /** @return the value of the {@code filterCount} field. */
    @NativeType("uint32_t")
    public int filterCount() { return nfilterCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code filters} field. */
    @NativeType("XrEnvironmentRaycastFilterBaseHeaderMETA const * const *")
    public @Nullable PointerBuffer filters() { return nfilters(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEnvironmentRaycastHitGetInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_ENVIRONMENT_RAYCAST_HIT_GET_INFO_META TYPE_ENVIRONMENT_RAYCAST_HIT_GET_INFO_META} value to the {@code type} field. */
    public XrEnvironmentRaycastHitGetInfoMETA type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_ENVIRONMENT_RAYCAST_HIT_GET_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEnvironmentRaycastHitGetInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrEnvironmentRaycastHitGetInfoMETA baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrEnvironmentRaycastHitGetInfoMETA time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code origin} field. */
    public XrEnvironmentRaycastHitGetInfoMETA origin(XrVector3f value) { norigin(address(), value); return this; }
    /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEnvironmentRaycastHitGetInfoMETA origin(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(origin()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code direction} field. */
    public XrEnvironmentRaycastHitGetInfoMETA direction(XrVector3f value) { ndirection(address(), value); return this; }
    /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEnvironmentRaycastHitGetInfoMETA direction(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(direction()); return this; }
    /** Sets the specified value to the {@code filterCount} field. */
    public XrEnvironmentRaycastHitGetInfoMETA filterCount(@NativeType("uint32_t") int value) { nfilterCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code filters} field. */
    public XrEnvironmentRaycastHitGetInfoMETA filters(@Nullable @NativeType("XrEnvironmentRaycastFilterBaseHeaderMETA const * const *") PointerBuffer value) { nfilters(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEnvironmentRaycastHitGetInfoMETA set(
        int type,
        long next,
        XrSpace baseSpace,
        long time,
        XrVector3f origin,
        XrVector3f direction,
        int filterCount,
        @Nullable PointerBuffer filters
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        time(time);
        origin(origin);
        direction(direction);
        filterCount(filterCount);
        filters(filters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEnvironmentRaycastHitGetInfoMETA set(XrEnvironmentRaycastHitGetInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEnvironmentRaycastHitGetInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEnvironmentRaycastHitGetInfoMETA malloc() {
        return new XrEnvironmentRaycastHitGetInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentRaycastHitGetInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEnvironmentRaycastHitGetInfoMETA calloc() {
        return new XrEnvironmentRaycastHitGetInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentRaycastHitGetInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrEnvironmentRaycastHitGetInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEnvironmentRaycastHitGetInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEnvironmentRaycastHitGetInfoMETA} instance for the specified memory address. */
    public static XrEnvironmentRaycastHitGetInfoMETA create(long address) {
        return new XrEnvironmentRaycastHitGetInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEnvironmentRaycastHitGetInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrEnvironmentRaycastHitGetInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastHitGetInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitGetInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastHitGetInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitGetInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastHitGetInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitGetInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEnvironmentRaycastHitGetInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitGetInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEnvironmentRaycastHitGetInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEnvironmentRaycastHitGetInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentRaycastHitGetInfoMETA malloc(MemoryStack stack) {
        return new XrEnvironmentRaycastHitGetInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEnvironmentRaycastHitGetInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentRaycastHitGetInfoMETA calloc(MemoryStack stack) {
        return new XrEnvironmentRaycastHitGetInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastHitGetInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitGetInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastHitGetInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitGetInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEnvironmentRaycastHitGetInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEnvironmentRaycastHitGetInfoMETA.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrEnvironmentRaycastHitGetInfoMETA.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrEnvironmentRaycastHitGetInfoMETA.TIME); }
    /** Unsafe version of {@link #origin}. */
    public static XrVector3f norigin(long struct) { return XrVector3f.create(struct + XrEnvironmentRaycastHitGetInfoMETA.ORIGIN); }
    /** Unsafe version of {@link #direction}. */
    public static XrVector3f ndirection(long struct) { return XrVector3f.create(struct + XrEnvironmentRaycastHitGetInfoMETA.DIRECTION); }
    /** Unsafe version of {@link #filterCount}. */
    public static int nfilterCount(long struct) { return memGetInt(struct + XrEnvironmentRaycastHitGetInfoMETA.FILTERCOUNT); }
    /** Unsafe version of {@link #filters() filters}. */
    public static @Nullable PointerBuffer nfilters(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrEnvironmentRaycastHitGetInfoMETA.FILTERS), nfilterCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEnvironmentRaycastHitGetInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEnvironmentRaycastHitGetInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrEnvironmentRaycastHitGetInfoMETA.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrEnvironmentRaycastHitGetInfoMETA.TIME, value); }
    /** Unsafe version of {@link #origin(XrVector3f) origin}. */
    public static void norigin(long struct, XrVector3f value) { memCopy(value.address(), struct + XrEnvironmentRaycastHitGetInfoMETA.ORIGIN, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #direction(XrVector3f) direction}. */
    public static void ndirection(long struct, XrVector3f value) { memCopy(value.address(), struct + XrEnvironmentRaycastHitGetInfoMETA.DIRECTION, XrVector3f.SIZEOF); }
    /** Sets the specified value to the {@code filterCount} field of the specified {@code struct}. */
    public static void nfilterCount(long struct, int value) { memPutInt(struct + XrEnvironmentRaycastHitGetInfoMETA.FILTERCOUNT, value); }
    /** Unsafe version of {@link #filters(PointerBuffer) filters}. */
    public static void nfilters(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrEnvironmentRaycastHitGetInfoMETA.FILTERS, memAddressSafe(value)); if (value != null) { nfilterCount(struct, value.remaining()); } }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEnvironmentRaycastHitGetInfoMETA.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrEnvironmentRaycastHitGetInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrEnvironmentRaycastHitGetInfoMETA, Buffer> implements NativeResource {

        private static final XrEnvironmentRaycastHitGetInfoMETA ELEMENT_FACTORY = XrEnvironmentRaycastHitGetInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrEnvironmentRaycastHitGetInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEnvironmentRaycastHitGetInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEnvironmentRaycastHitGetInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEnvironmentRaycastHitGetInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEnvironmentRaycastHitGetInfoMETA.nnext(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrEnvironmentRaycastHitGetInfoMETA.nbaseSpace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrEnvironmentRaycastHitGetInfoMETA.ntime(address()); }
        /** @return a {@link XrVector3f} view of the {@code origin} field. */
        public XrVector3f origin() { return XrEnvironmentRaycastHitGetInfoMETA.norigin(address()); }
        /** @return a {@link XrVector3f} view of the {@code direction} field. */
        public XrVector3f direction() { return XrEnvironmentRaycastHitGetInfoMETA.ndirection(address()); }
        /** @return the value of the {@code filterCount} field. */
        @NativeType("uint32_t")
        public int filterCount() { return XrEnvironmentRaycastHitGetInfoMETA.nfilterCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code filters} field. */
        @NativeType("XrEnvironmentRaycastFilterBaseHeaderMETA const * const *")
        public @Nullable PointerBuffer filters() { return XrEnvironmentRaycastHitGetInfoMETA.nfilters(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEnvironmentRaycastHitGetInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEnvironmentRaycastHitGetInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_ENVIRONMENT_RAYCAST_HIT_GET_INFO_META TYPE_ENVIRONMENT_RAYCAST_HIT_GET_INFO_META} value to the {@code type} field. */
        public XrEnvironmentRaycastHitGetInfoMETA.Buffer type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_ENVIRONMENT_RAYCAST_HIT_GET_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEnvironmentRaycastHitGetInfoMETA.Buffer next(@NativeType("void const *") long value) { XrEnvironmentRaycastHitGetInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrEnvironmentRaycastHitGetInfoMETA.Buffer baseSpace(XrSpace value) { XrEnvironmentRaycastHitGetInfoMETA.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrEnvironmentRaycastHitGetInfoMETA.Buffer time(@NativeType("XrTime") long value) { XrEnvironmentRaycastHitGetInfoMETA.ntime(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code origin} field. */
        public XrEnvironmentRaycastHitGetInfoMETA.Buffer origin(XrVector3f value) { XrEnvironmentRaycastHitGetInfoMETA.norigin(address(), value); return this; }
        /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEnvironmentRaycastHitGetInfoMETA.Buffer origin(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(origin()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code direction} field. */
        public XrEnvironmentRaycastHitGetInfoMETA.Buffer direction(XrVector3f value) { XrEnvironmentRaycastHitGetInfoMETA.ndirection(address(), value); return this; }
        /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEnvironmentRaycastHitGetInfoMETA.Buffer direction(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(direction()); return this; }
        /** Sets the specified value to the {@code filterCount} field. */
        public XrEnvironmentRaycastHitGetInfoMETA.Buffer filterCount(@NativeType("uint32_t") int value) { XrEnvironmentRaycastHitGetInfoMETA.nfilterCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code filters} field. */
        public XrEnvironmentRaycastHitGetInfoMETA.Buffer filters(@Nullable @NativeType("XrEnvironmentRaycastFilterBaseHeaderMETA const * const *") PointerBuffer value) { XrEnvironmentRaycastHitGetInfoMETA.nfilters(address(), value); return this; }

    }

}