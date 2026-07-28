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
 * struct XrSpatialBoundsBoxfANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace space;
 *     XrTime time;
 *     {@link XrBoxf XrBoxf} box;
 * }</code></pre>
 */
public class XrSpatialBoundsBoxfANDROID extends Struct<XrSpatialBoundsBoxfANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACE,
        TIME,
        BOX;

    static {
        XrBoxf.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrBoxf.SIZEOF, XrBoxf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        BOX = layout.offsetof(4);
    }

    protected XrSpatialBoundsBoxfANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialBoundsBoxfANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialBoundsBoxfANDROID(address, container);
    }

    /**
     * Creates a {@code XrSpatialBoundsBoxfANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialBoundsBoxfANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** @return a {@link XrBoxf} view of the {@code box} field. */
    public XrBoxf box() { return nbox(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialBoundsBoxfANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSpatialDiscoveryBounds#XR_TYPE_SPATIAL_BOUNDS_BOXF_ANDROID TYPE_SPATIAL_BOUNDS_BOXF_ANDROID} value to the {@code type} field. */
    public XrSpatialBoundsBoxfANDROID type$Default() { return type(ANDROIDSpatialDiscoveryBounds.XR_TYPE_SPATIAL_BOUNDS_BOXF_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialBoundsBoxfANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrSpatialBoundsBoxfANDROID space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrSpatialBoundsBoxfANDROID time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrBoxf} to the {@code box} field. */
    public XrSpatialBoundsBoxfANDROID box(XrBoxf value) { nbox(address(), value); return this; }
    /** Passes the {@code box} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialBoundsBoxfANDROID box(java.util.function.Consumer<XrBoxf> consumer) { consumer.accept(box()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialBoundsBoxfANDROID set(
        int type,
        long next,
        XrSpace space,
        long time,
        XrBoxf box
    ) {
        type(type);
        next(next);
        space(space);
        time(time);
        box(box);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialBoundsBoxfANDROID set(XrSpatialBoundsBoxfANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialBoundsBoxfANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialBoundsBoxfANDROID malloc() {
        return new XrSpatialBoundsBoxfANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialBoundsBoxfANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialBoundsBoxfANDROID calloc() {
        return new XrSpatialBoundsBoxfANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialBoundsBoxfANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSpatialBoundsBoxfANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialBoundsBoxfANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialBoundsBoxfANDROID} instance for the specified memory address. */
    public static XrSpatialBoundsBoxfANDROID create(long address) {
        return new XrSpatialBoundsBoxfANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialBoundsBoxfANDROID createSafe(long address) {
        return address == NULL ? null : new XrSpatialBoundsBoxfANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSpatialBoundsBoxfANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsBoxfANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBoundsBoxfANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsBoxfANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBoundsBoxfANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsBoxfANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialBoundsBoxfANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsBoxfANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialBoundsBoxfANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialBoundsBoxfANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialBoundsBoxfANDROID malloc(MemoryStack stack) {
        return new XrSpatialBoundsBoxfANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialBoundsBoxfANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialBoundsBoxfANDROID calloc(MemoryStack stack) {
        return new XrSpatialBoundsBoxfANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialBoundsBoxfANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsBoxfANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBoundsBoxfANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsBoxfANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialBoundsBoxfANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialBoundsBoxfANDROID.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpatialBoundsBoxfANDROID.SPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrSpatialBoundsBoxfANDROID.TIME); }
    /** Unsafe version of {@link #box}. */
    public static XrBoxf nbox(long struct) { return XrBoxf.create(struct + XrSpatialBoundsBoxfANDROID.BOX); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialBoundsBoxfANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialBoundsBoxfANDROID.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialBoundsBoxfANDROID.SPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrSpatialBoundsBoxfANDROID.TIME, value); }
    /** Unsafe version of {@link #box(XrBoxf) box}. */
    public static void nbox(long struct, XrBoxf value) { memCopy(value.address(), struct + XrSpatialBoundsBoxfANDROID.BOX, XrBoxf.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialBoundsBoxfANDROID.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialBoundsBoxfANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSpatialBoundsBoxfANDROID, Buffer> implements NativeResource {

        private static final XrSpatialBoundsBoxfANDROID ELEMENT_FACTORY = XrSpatialBoundsBoxfANDROID.create(-1L);

        /**
         * Creates a new {@code XrSpatialBoundsBoxfANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialBoundsBoxfANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialBoundsBoxfANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialBoundsBoxfANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialBoundsBoxfANDROID.nnext(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpatialBoundsBoxfANDROID.nspace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpatialBoundsBoxfANDROID.ntime(address()); }
        /** @return a {@link XrBoxf} view of the {@code box} field. */
        public XrBoxf box() { return XrSpatialBoundsBoxfANDROID.nbox(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialBoundsBoxfANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialBoundsBoxfANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSpatialDiscoveryBounds#XR_TYPE_SPATIAL_BOUNDS_BOXF_ANDROID TYPE_SPATIAL_BOUNDS_BOXF_ANDROID} value to the {@code type} field. */
        public XrSpatialBoundsBoxfANDROID.Buffer type$Default() { return type(ANDROIDSpatialDiscoveryBounds.XR_TYPE_SPATIAL_BOUNDS_BOXF_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialBoundsBoxfANDROID.Buffer next(@NativeType("void const *") long value) { XrSpatialBoundsBoxfANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrSpatialBoundsBoxfANDROID.Buffer space(XrSpace value) { XrSpatialBoundsBoxfANDROID.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrSpatialBoundsBoxfANDROID.Buffer time(@NativeType("XrTime") long value) { XrSpatialBoundsBoxfANDROID.ntime(address(), value); return this; }
        /** Copies the specified {@link XrBoxf} to the {@code box} field. */
        public XrSpatialBoundsBoxfANDROID.Buffer box(XrBoxf value) { XrSpatialBoundsBoxfANDROID.nbox(address(), value); return this; }
        /** Passes the {@code box} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialBoundsBoxfANDROID.Buffer box(java.util.function.Consumer<XrBoxf> consumer) { consumer.accept(box()); return this; }

    }

}