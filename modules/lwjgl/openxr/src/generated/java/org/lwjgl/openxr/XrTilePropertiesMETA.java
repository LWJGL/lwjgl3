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
 * <pre><code>
 * struct XrTilePropertiesMETA {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrExtent3DiMETA XrExtent3DiMETA} tileDimensions;
 *     {@link XrExtent2Di XrExtent2Di} apronDimensions;
 *     {@link XrOffset2Di XrOffset2Di} origin;
 * }</code></pre>
 */
public class XrTilePropertiesMETA extends Struct<XrTilePropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TILEDIMENSIONS,
        APRONDIMENSIONS,
        ORIGIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrExtent3DiMETA.SIZEOF, XrExtent3DiMETA.ALIGNOF),
            __member(XrExtent2Di.SIZEOF, XrExtent2Di.ALIGNOF),
            __member(XrOffset2Di.SIZEOF, XrOffset2Di.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TILEDIMENSIONS = layout.offsetof(2);
        APRONDIMENSIONS = layout.offsetof(3);
        ORIGIN = layout.offsetof(4);
    }

    protected XrTilePropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTilePropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrTilePropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrTilePropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTilePropertiesMETA(ByteBuffer container) {
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
    /** @return a {@link XrExtent3DiMETA} view of the {@code tileDimensions} field. */
    public XrExtent3DiMETA tileDimensions() { return ntileDimensions(address()); }
    /** @return a {@link XrExtent2Di} view of the {@code apronDimensions} field. */
    public XrExtent2Di apronDimensions() { return napronDimensions(address()); }
    /** @return a {@link XrOffset2Di} view of the {@code origin} field. */
    public XrOffset2Di origin() { return norigin(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTilePropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METATilePropertiesHint#XR_TYPE_TILE_PROPERTIES_META TYPE_TILE_PROPERTIES_META} value to the {@code type} field. */
    public XrTilePropertiesMETA type$Default() { return type(METATilePropertiesHint.XR_TYPE_TILE_PROPERTIES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrTilePropertiesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrExtent3DiMETA} to the {@code tileDimensions} field. */
    public XrTilePropertiesMETA tileDimensions(XrExtent3DiMETA value) { ntileDimensions(address(), value); return this; }
    /** Passes the {@code tileDimensions} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTilePropertiesMETA tileDimensions(java.util.function.Consumer<XrExtent3DiMETA> consumer) { consumer.accept(tileDimensions()); return this; }
    /** Copies the specified {@link XrExtent2Di} to the {@code apronDimensions} field. */
    public XrTilePropertiesMETA apronDimensions(XrExtent2Di value) { napronDimensions(address(), value); return this; }
    /** Passes the {@code apronDimensions} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTilePropertiesMETA apronDimensions(java.util.function.Consumer<XrExtent2Di> consumer) { consumer.accept(apronDimensions()); return this; }
    /** Copies the specified {@link XrOffset2Di} to the {@code origin} field. */
    public XrTilePropertiesMETA origin(XrOffset2Di value) { norigin(address(), value); return this; }
    /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTilePropertiesMETA origin(java.util.function.Consumer<XrOffset2Di> consumer) { consumer.accept(origin()); return this; }

    /** Initializes this struct with the specified values. */
    public XrTilePropertiesMETA set(
        int type,
        long next,
        XrExtent3DiMETA tileDimensions,
        XrExtent2Di apronDimensions,
        XrOffset2Di origin
    ) {
        type(type);
        next(next);
        tileDimensions(tileDimensions);
        apronDimensions(apronDimensions);
        origin(origin);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTilePropertiesMETA set(XrTilePropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTilePropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTilePropertiesMETA malloc() {
        return new XrTilePropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTilePropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTilePropertiesMETA calloc() {
        return new XrTilePropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTilePropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrTilePropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTilePropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrTilePropertiesMETA} instance for the specified memory address. */
    public static XrTilePropertiesMETA create(long address) {
        return new XrTilePropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTilePropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrTilePropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrTilePropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTilePropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTilePropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTilePropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTilePropertiesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTilePropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTilePropertiesMETA malloc(MemoryStack stack) {
        return new XrTilePropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTilePropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTilePropertiesMETA calloc(MemoryStack stack) {
        return new XrTilePropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTilePropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTilePropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTilePropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTilePropertiesMETA.NEXT); }
    /** Unsafe version of {@link #tileDimensions}. */
    public static XrExtent3DiMETA ntileDimensions(long struct) { return XrExtent3DiMETA.create(struct + XrTilePropertiesMETA.TILEDIMENSIONS); }
    /** Unsafe version of {@link #apronDimensions}. */
    public static XrExtent2Di napronDimensions(long struct) { return XrExtent2Di.create(struct + XrTilePropertiesMETA.APRONDIMENSIONS); }
    /** Unsafe version of {@link #origin}. */
    public static XrOffset2Di norigin(long struct) { return XrOffset2Di.create(struct + XrTilePropertiesMETA.ORIGIN); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTilePropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTilePropertiesMETA.NEXT, value); }
    /** Unsafe version of {@link #tileDimensions(XrExtent3DiMETA) tileDimensions}. */
    public static void ntileDimensions(long struct, XrExtent3DiMETA value) { memCopy(value.address(), struct + XrTilePropertiesMETA.TILEDIMENSIONS, XrExtent3DiMETA.SIZEOF); }
    /** Unsafe version of {@link #apronDimensions(XrExtent2Di) apronDimensions}. */
    public static void napronDimensions(long struct, XrExtent2Di value) { memCopy(value.address(), struct + XrTilePropertiesMETA.APRONDIMENSIONS, XrExtent2Di.SIZEOF); }
    /** Unsafe version of {@link #origin(XrOffset2Di) origin}. */
    public static void norigin(long struct, XrOffset2Di value) { memCopy(value.address(), struct + XrTilePropertiesMETA.ORIGIN, XrOffset2Di.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrTilePropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrTilePropertiesMETA, Buffer> implements NativeResource {

        private static final XrTilePropertiesMETA ELEMENT_FACTORY = XrTilePropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrTilePropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTilePropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTilePropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTilePropertiesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrTilePropertiesMETA.nnext(address()); }
        /** @return a {@link XrExtent3DiMETA} view of the {@code tileDimensions} field. */
        public XrExtent3DiMETA tileDimensions() { return XrTilePropertiesMETA.ntileDimensions(address()); }
        /** @return a {@link XrExtent2Di} view of the {@code apronDimensions} field. */
        public XrExtent2Di apronDimensions() { return XrTilePropertiesMETA.napronDimensions(address()); }
        /** @return a {@link XrOffset2Di} view of the {@code origin} field. */
        public XrOffset2Di origin() { return XrTilePropertiesMETA.norigin(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTilePropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrTilePropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METATilePropertiesHint#XR_TYPE_TILE_PROPERTIES_META TYPE_TILE_PROPERTIES_META} value to the {@code type} field. */
        public XrTilePropertiesMETA.Buffer type$Default() { return type(METATilePropertiesHint.XR_TYPE_TILE_PROPERTIES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrTilePropertiesMETA.Buffer next(@NativeType("void *") long value) { XrTilePropertiesMETA.nnext(address(), value); return this; }
        /** Copies the specified {@link XrExtent3DiMETA} to the {@code tileDimensions} field. */
        public XrTilePropertiesMETA.Buffer tileDimensions(XrExtent3DiMETA value) { XrTilePropertiesMETA.ntileDimensions(address(), value); return this; }
        /** Passes the {@code tileDimensions} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTilePropertiesMETA.Buffer tileDimensions(java.util.function.Consumer<XrExtent3DiMETA> consumer) { consumer.accept(tileDimensions()); return this; }
        /** Copies the specified {@link XrExtent2Di} to the {@code apronDimensions} field. */
        public XrTilePropertiesMETA.Buffer apronDimensions(XrExtent2Di value) { XrTilePropertiesMETA.napronDimensions(address(), value); return this; }
        /** Passes the {@code apronDimensions} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTilePropertiesMETA.Buffer apronDimensions(java.util.function.Consumer<XrExtent2Di> consumer) { consumer.accept(apronDimensions()); return this; }
        /** Copies the specified {@link XrOffset2Di} to the {@code origin} field. */
        public XrTilePropertiesMETA.Buffer origin(XrOffset2Di value) { XrTilePropertiesMETA.norigin(address(), value); return this; }
        /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTilePropertiesMETA.Buffer origin(java.util.function.Consumer<XrOffset2Di> consumer) { consumer.accept(origin()); return this; }

    }

}