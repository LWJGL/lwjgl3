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
 * struct XrSceneMarkerQRCodesMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t qrCodeCapacityInput;
 *     {@link XrSceneMarkerQRCodeMSFT XrSceneMarkerQRCodeMSFT} * qrCodes;
 * }}</pre>
 */
public class XrSceneMarkerQRCodesMSFT extends Struct<XrSceneMarkerQRCodesMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        QRCODECAPACITYINPUT,
        QRCODES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        QRCODECAPACITYINPUT = layout.offsetof(2);
        QRCODES = layout.offsetof(3);
    }

    protected XrSceneMarkerQRCodesMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneMarkerQRCodesMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSceneMarkerQRCodesMSFT(address, container);
    }

    /**
     * Creates a {@code XrSceneMarkerQRCodesMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMarkerQRCodesMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code qrCodeCapacityInput} field. */
    @NativeType("uint32_t")
    public int qrCodeCapacityInput() { return nqrCodeCapacityInput(address()); }
    /** @return a {@link XrSceneMarkerQRCodeMSFT.Buffer} view of the struct array pointed to by the {@code qrCodes} field. */
    @NativeType("XrSceneMarkerQRCodeMSFT *")
    public XrSceneMarkerQRCodeMSFT.@Nullable Buffer qrCodes() { return nqrCodes(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSceneMarkerQRCodesMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneMarker#XR_TYPE_SCENE_MARKER_QR_CODES_MSFT TYPE_SCENE_MARKER_QR_CODES_MSFT} value to the {@code type} field. */
    public XrSceneMarkerQRCodesMSFT type$Default() { return type(MSFTSceneMarker.XR_TYPE_SCENE_MARKER_QR_CODES_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSceneMarkerQRCodesMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code qrCodeCapacityInput} field. */
    public XrSceneMarkerQRCodesMSFT qrCodeCapacityInput(@NativeType("uint32_t") int value) { nqrCodeCapacityInput(address(), value); return this; }
    /** Sets the address of the specified {@link XrSceneMarkerQRCodeMSFT.Buffer} to the {@code qrCodes} field. */
    public XrSceneMarkerQRCodesMSFT qrCodes(@NativeType("XrSceneMarkerQRCodeMSFT *") XrSceneMarkerQRCodeMSFT.@Nullable Buffer value) { nqrCodes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneMarkerQRCodesMSFT set(
        int type,
        long next,
        int qrCodeCapacityInput,
        XrSceneMarkerQRCodeMSFT.@Nullable Buffer qrCodes
    ) {
        type(type);
        next(next);
        qrCodeCapacityInput(qrCodeCapacityInput);
        qrCodes(qrCodes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneMarkerQRCodesMSFT set(XrSceneMarkerQRCodesMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneMarkerQRCodesMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneMarkerQRCodesMSFT malloc() {
        return new XrSceneMarkerQRCodesMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMarkerQRCodesMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneMarkerQRCodesMSFT calloc() {
        return new XrSceneMarkerQRCodesMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMarkerQRCodesMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneMarkerQRCodesMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneMarkerQRCodesMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneMarkerQRCodesMSFT} instance for the specified memory address. */
    public static XrSceneMarkerQRCodesMSFT create(long address) {
        return new XrSceneMarkerQRCodesMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneMarkerQRCodesMSFT createSafe(long address) {
        return address == NULL ? null : new XrSceneMarkerQRCodesMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSceneMarkerQRCodesMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerQRCodesMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneMarkerQRCodesMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerQRCodesMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMarkerQRCodesMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerQRCodesMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneMarkerQRCodesMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerQRCodesMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneMarkerQRCodesMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneMarkerQRCodesMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMarkerQRCodesMSFT malloc(MemoryStack stack) {
        return new XrSceneMarkerQRCodesMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneMarkerQRCodesMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMarkerQRCodesMSFT calloc(MemoryStack stack) {
        return new XrSceneMarkerQRCodesMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneMarkerQRCodesMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerQRCodesMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMarkerQRCodesMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerQRCodesMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneMarkerQRCodesMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneMarkerQRCodesMSFT.NEXT); }
    /** Unsafe version of {@link #qrCodeCapacityInput}. */
    public static int nqrCodeCapacityInput(long struct) { return memGetInt(struct + XrSceneMarkerQRCodesMSFT.QRCODECAPACITYINPUT); }
    /** Unsafe version of {@link #qrCodes}. */
    public static XrSceneMarkerQRCodeMSFT.@Nullable Buffer nqrCodes(long struct) { return XrSceneMarkerQRCodeMSFT.createSafe(memGetAddress(struct + XrSceneMarkerQRCodesMSFT.QRCODES), nqrCodeCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneMarkerQRCodesMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneMarkerQRCodesMSFT.NEXT, value); }
    /** Sets the specified value to the {@code qrCodeCapacityInput} field of the specified {@code struct}. */
    public static void nqrCodeCapacityInput(long struct, int value) { memPutInt(struct + XrSceneMarkerQRCodesMSFT.QRCODECAPACITYINPUT, value); }
    /** Unsafe version of {@link #qrCodes(XrSceneMarkerQRCodeMSFT.Buffer) qrCodes}. */
    public static void nqrCodes(long struct, XrSceneMarkerQRCodeMSFT.@Nullable Buffer value) { memPutAddress(struct + XrSceneMarkerQRCodesMSFT.QRCODES, memAddressSafe(value)); if (value != null) { nqrCodeCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSceneMarkerQRCodesMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneMarkerQRCodesMSFT, Buffer> implements NativeResource {

        private static final XrSceneMarkerQRCodesMSFT ELEMENT_FACTORY = XrSceneMarkerQRCodesMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneMarkerQRCodesMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMarkerQRCodesMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneMarkerQRCodesMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneMarkerQRCodesMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneMarkerQRCodesMSFT.nnext(address()); }
        /** @return the value of the {@code qrCodeCapacityInput} field. */
        @NativeType("uint32_t")
        public int qrCodeCapacityInput() { return XrSceneMarkerQRCodesMSFT.nqrCodeCapacityInput(address()); }
        /** @return a {@link XrSceneMarkerQRCodeMSFT.Buffer} view of the struct array pointed to by the {@code qrCodes} field. */
        @NativeType("XrSceneMarkerQRCodeMSFT *")
        public XrSceneMarkerQRCodeMSFT.@Nullable Buffer qrCodes() { return XrSceneMarkerQRCodesMSFT.nqrCodes(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSceneMarkerQRCodesMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneMarkerQRCodesMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneMarker#XR_TYPE_SCENE_MARKER_QR_CODES_MSFT TYPE_SCENE_MARKER_QR_CODES_MSFT} value to the {@code type} field. */
        public XrSceneMarkerQRCodesMSFT.Buffer type$Default() { return type(MSFTSceneMarker.XR_TYPE_SCENE_MARKER_QR_CODES_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSceneMarkerQRCodesMSFT.Buffer next(@NativeType("void const *") long value) { XrSceneMarkerQRCodesMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code qrCodeCapacityInput} field. */
        public XrSceneMarkerQRCodesMSFT.Buffer qrCodeCapacityInput(@NativeType("uint32_t") int value) { XrSceneMarkerQRCodesMSFT.nqrCodeCapacityInput(address(), value); return this; }
        /** Sets the address of the specified {@link XrSceneMarkerQRCodeMSFT.Buffer} to the {@code qrCodes} field. */
        public XrSceneMarkerQRCodesMSFT.Buffer qrCodes(@NativeType("XrSceneMarkerQRCodeMSFT *") XrSceneMarkerQRCodeMSFT.@Nullable Buffer value) { XrSceneMarkerQRCodesMSFT.nqrCodes(address(), value); return this; }

    }

}