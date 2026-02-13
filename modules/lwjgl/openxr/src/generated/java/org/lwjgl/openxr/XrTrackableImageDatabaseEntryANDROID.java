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
 * struct XrTrackableImageDatabaseEntryANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrTrackableImageTrackingModeANDROID trackingMode;
 *     float physicalWidth;
 *     uint32_t imageWidth;
 *     uint32_t imageHeight;
 *     XrTrackableImageFormatANDROID format;
 *     uint32_t bufferSize;
 *     uint8_t const * buffer;
 * }}</pre>
 */
public class XrTrackableImageDatabaseEntryANDROID extends Struct<XrTrackableImageDatabaseEntryANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TRACKINGMODE,
        PHYSICALWIDTH,
        IMAGEWIDTH,
        IMAGEHEIGHT,
        FORMAT,
        BUFFERSIZE,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TRACKINGMODE = layout.offsetof(2);
        PHYSICALWIDTH = layout.offsetof(3);
        IMAGEWIDTH = layout.offsetof(4);
        IMAGEHEIGHT = layout.offsetof(5);
        FORMAT = layout.offsetof(6);
        BUFFERSIZE = layout.offsetof(7);
        BUFFER = layout.offsetof(8);
    }

    protected XrTrackableImageDatabaseEntryANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableImageDatabaseEntryANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableImageDatabaseEntryANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableImageDatabaseEntryANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableImageDatabaseEntryANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code trackingMode} field. */
    @NativeType("XrTrackableImageTrackingModeANDROID")
    public int trackingMode() { return ntrackingMode(address()); }
    /** @return the value of the {@code physicalWidth} field. */
    public float physicalWidth() { return nphysicalWidth(address()); }
    /** @return the value of the {@code imageWidth} field. */
    @NativeType("uint32_t")
    public int imageWidth() { return nimageWidth(address()); }
    /** @return the value of the {@code imageHeight} field. */
    @NativeType("uint32_t")
    public int imageHeight() { return nimageHeight(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("XrTrackableImageFormatANDROID")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code bufferSize} field. */
    @NativeType("uint32_t")
    public int bufferSize() { return nbufferSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
    @NativeType("uint8_t const *")
    public ByteBuffer buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackableImageDatabaseEntryANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_TRACKABLE_IMAGE_DATABASE_ENTRY_ANDROID TYPE_TRACKABLE_IMAGE_DATABASE_ENTRY_ANDROID} value to the {@code type} field. */
    public XrTrackableImageDatabaseEntryANDROID type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_TRACKABLE_IMAGE_DATABASE_ENTRY_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackableImageDatabaseEntryANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code trackingMode} field. */
    public XrTrackableImageDatabaseEntryANDROID trackingMode(@NativeType("XrTrackableImageTrackingModeANDROID") int value) { ntrackingMode(address(), value); return this; }
    /** Sets the specified value to the {@code physicalWidth} field. */
    public XrTrackableImageDatabaseEntryANDROID physicalWidth(float value) { nphysicalWidth(address(), value); return this; }
    /** Sets the specified value to the {@code imageWidth} field. */
    public XrTrackableImageDatabaseEntryANDROID imageWidth(@NativeType("uint32_t") int value) { nimageWidth(address(), value); return this; }
    /** Sets the specified value to the {@code imageHeight} field. */
    public XrTrackableImageDatabaseEntryANDROID imageHeight(@NativeType("uint32_t") int value) { nimageHeight(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public XrTrackableImageDatabaseEntryANDROID format(@NativeType("XrTrackableImageFormatANDROID") int value) { nformat(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
    public XrTrackableImageDatabaseEntryANDROID buffer(@NativeType("uint8_t const *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableImageDatabaseEntryANDROID set(
        int type,
        long next,
        int trackingMode,
        float physicalWidth,
        int imageWidth,
        int imageHeight,
        int format,
        ByteBuffer buffer
    ) {
        type(type);
        next(next);
        trackingMode(trackingMode);
        physicalWidth(physicalWidth);
        imageWidth(imageWidth);
        imageHeight(imageHeight);
        format(format);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTrackableImageDatabaseEntryANDROID set(XrTrackableImageDatabaseEntryANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableImageDatabaseEntryANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableImageDatabaseEntryANDROID malloc() {
        return new XrTrackableImageDatabaseEntryANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableImageDatabaseEntryANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableImageDatabaseEntryANDROID calloc() {
        return new XrTrackableImageDatabaseEntryANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableImageDatabaseEntryANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableImageDatabaseEntryANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableImageDatabaseEntryANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableImageDatabaseEntryANDROID} instance for the specified memory address. */
    public static XrTrackableImageDatabaseEntryANDROID create(long address) {
        return new XrTrackableImageDatabaseEntryANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableImageDatabaseEntryANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableImageDatabaseEntryANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableImageDatabaseEntryANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseEntryANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageDatabaseEntryANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseEntryANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageDatabaseEntryANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseEntryANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableImageDatabaseEntryANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseEntryANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableImageDatabaseEntryANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableImageDatabaseEntryANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableImageDatabaseEntryANDROID malloc(MemoryStack stack) {
        return new XrTrackableImageDatabaseEntryANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableImageDatabaseEntryANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableImageDatabaseEntryANDROID calloc(MemoryStack stack) {
        return new XrTrackableImageDatabaseEntryANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableImageDatabaseEntryANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseEntryANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageDatabaseEntryANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseEntryANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackableImageDatabaseEntryANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackableImageDatabaseEntryANDROID.NEXT); }
    /** Unsafe version of {@link #trackingMode}. */
    public static int ntrackingMode(long struct) { return memGetInt(struct + XrTrackableImageDatabaseEntryANDROID.TRACKINGMODE); }
    /** Unsafe version of {@link #physicalWidth}. */
    public static float nphysicalWidth(long struct) { return memGetFloat(struct + XrTrackableImageDatabaseEntryANDROID.PHYSICALWIDTH); }
    /** Unsafe version of {@link #imageWidth}. */
    public static int nimageWidth(long struct) { return memGetInt(struct + XrTrackableImageDatabaseEntryANDROID.IMAGEWIDTH); }
    /** Unsafe version of {@link #imageHeight}. */
    public static int nimageHeight(long struct) { return memGetInt(struct + XrTrackableImageDatabaseEntryANDROID.IMAGEHEIGHT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + XrTrackableImageDatabaseEntryANDROID.FORMAT); }
    /** Unsafe version of {@link #bufferSize}. */
    public static int nbufferSize(long struct) { return memGetInt(struct + XrTrackableImageDatabaseEntryANDROID.BUFFERSIZE); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static ByteBuffer nbuffer(long struct) { return memByteBuffer(memGetAddress(struct + XrTrackableImageDatabaseEntryANDROID.BUFFER), nbufferSize(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackableImageDatabaseEntryANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackableImageDatabaseEntryANDROID.NEXT, value); }
    /** Unsafe version of {@link #trackingMode(int) trackingMode}. */
    public static void ntrackingMode(long struct, int value) { memPutInt(struct + XrTrackableImageDatabaseEntryANDROID.TRACKINGMODE, value); }
    /** Unsafe version of {@link #physicalWidth(float) physicalWidth}. */
    public static void nphysicalWidth(long struct, float value) { memPutFloat(struct + XrTrackableImageDatabaseEntryANDROID.PHYSICALWIDTH, value); }
    /** Unsafe version of {@link #imageWidth(int) imageWidth}. */
    public static void nimageWidth(long struct, int value) { memPutInt(struct + XrTrackableImageDatabaseEntryANDROID.IMAGEWIDTH, value); }
    /** Unsafe version of {@link #imageHeight(int) imageHeight}. */
    public static void nimageHeight(long struct, int value) { memPutInt(struct + XrTrackableImageDatabaseEntryANDROID.IMAGEHEIGHT, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + XrTrackableImageDatabaseEntryANDROID.FORMAT, value); }
    /** Sets the specified value to the {@code bufferSize} field of the specified {@code struct}. */
    public static void nbufferSize(long struct, int value) { memPutInt(struct + XrTrackableImageDatabaseEntryANDROID.BUFFERSIZE, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, ByteBuffer value) { memPutAddress(struct + XrTrackableImageDatabaseEntryANDROID.BUFFER, memAddress(value)); nbufferSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrTrackableImageDatabaseEntryANDROID.BUFFER));
    }

    // -----------------------------------

    /** An array of {@link XrTrackableImageDatabaseEntryANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableImageDatabaseEntryANDROID, Buffer> implements NativeResource {

        private static final XrTrackableImageDatabaseEntryANDROID ELEMENT_FACTORY = XrTrackableImageDatabaseEntryANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableImageDatabaseEntryANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableImageDatabaseEntryANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableImageDatabaseEntryANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackableImageDatabaseEntryANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrTrackableImageDatabaseEntryANDROID.nnext(address()); }
        /** @return the value of the {@code trackingMode} field. */
        @NativeType("XrTrackableImageTrackingModeANDROID")
        public int trackingMode() { return XrTrackableImageDatabaseEntryANDROID.ntrackingMode(address()); }
        /** @return the value of the {@code physicalWidth} field. */
        public float physicalWidth() { return XrTrackableImageDatabaseEntryANDROID.nphysicalWidth(address()); }
        /** @return the value of the {@code imageWidth} field. */
        @NativeType("uint32_t")
        public int imageWidth() { return XrTrackableImageDatabaseEntryANDROID.nimageWidth(address()); }
        /** @return the value of the {@code imageHeight} field. */
        @NativeType("uint32_t")
        public int imageHeight() { return XrTrackableImageDatabaseEntryANDROID.nimageHeight(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("XrTrackableImageFormatANDROID")
        public int format() { return XrTrackableImageDatabaseEntryANDROID.nformat(address()); }
        /** @return the value of the {@code bufferSize} field. */
        @NativeType("uint32_t")
        public int bufferSize() { return XrTrackableImageDatabaseEntryANDROID.nbufferSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer buffer() { return XrTrackableImageDatabaseEntryANDROID.nbuffer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackableImageDatabaseEntryANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackableImageDatabaseEntryANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_TRACKABLE_IMAGE_DATABASE_ENTRY_ANDROID TYPE_TRACKABLE_IMAGE_DATABASE_ENTRY_ANDROID} value to the {@code type} field. */
        public XrTrackableImageDatabaseEntryANDROID.Buffer type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_TRACKABLE_IMAGE_DATABASE_ENTRY_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackableImageDatabaseEntryANDROID.Buffer next(@NativeType("void const *") long value) { XrTrackableImageDatabaseEntryANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code trackingMode} field. */
        public XrTrackableImageDatabaseEntryANDROID.Buffer trackingMode(@NativeType("XrTrackableImageTrackingModeANDROID") int value) { XrTrackableImageDatabaseEntryANDROID.ntrackingMode(address(), value); return this; }
        /** Sets the specified value to the {@code physicalWidth} field. */
        public XrTrackableImageDatabaseEntryANDROID.Buffer physicalWidth(float value) { XrTrackableImageDatabaseEntryANDROID.nphysicalWidth(address(), value); return this; }
        /** Sets the specified value to the {@code imageWidth} field. */
        public XrTrackableImageDatabaseEntryANDROID.Buffer imageWidth(@NativeType("uint32_t") int value) { XrTrackableImageDatabaseEntryANDROID.nimageWidth(address(), value); return this; }
        /** Sets the specified value to the {@code imageHeight} field. */
        public XrTrackableImageDatabaseEntryANDROID.Buffer imageHeight(@NativeType("uint32_t") int value) { XrTrackableImageDatabaseEntryANDROID.nimageHeight(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public XrTrackableImageDatabaseEntryANDROID.Buffer format(@NativeType("XrTrackableImageFormatANDROID") int value) { XrTrackableImageDatabaseEntryANDROID.nformat(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
        public XrTrackableImageDatabaseEntryANDROID.Buffer buffer(@NativeType("uint8_t const *") ByteBuffer value) { XrTrackableImageDatabaseEntryANDROID.nbuffer(address(), value); return this; }

    }

}