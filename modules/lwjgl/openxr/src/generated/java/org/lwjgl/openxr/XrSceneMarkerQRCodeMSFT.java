/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct XrSceneMarkerQRCodeMSFT {
 *     XrSceneMarkerQRCodeSymbolTypeMSFT symbolType;
 *     uint8_t version;
 * }}</pre>
 */
public class XrSceneMarkerQRCodeMSFT extends Struct<XrSceneMarkerQRCodeMSFT> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SYMBOLTYPE,
        VERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SYMBOLTYPE = layout.offsetof(0);
        VERSION = layout.offsetof(1);
    }

    protected XrSceneMarkerQRCodeMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneMarkerQRCodeMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSceneMarkerQRCodeMSFT(address, container);
    }

    /**
     * Creates a {@code XrSceneMarkerQRCodeMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMarkerQRCodeMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code symbolType} field. */
    @NativeType("XrSceneMarkerQRCodeSymbolTypeMSFT")
    public int symbolType() { return nsymbolType(address()); }
    /** @return the value of the {@code version} field. */
    @NativeType("uint8_t")
    public byte version() { return nversion(address()); }

    // -----------------------------------

    /** Returns a new {@code XrSceneMarkerQRCodeMSFT} instance for the specified memory address. */
    public static XrSceneMarkerQRCodeMSFT create(long address) {
        return new XrSceneMarkerQRCodeMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneMarkerQRCodeMSFT createSafe(long address) {
        return address == NULL ? null : new XrSceneMarkerQRCodeMSFT(address, null);
    }

    /**
     * Create a {@link XrSceneMarkerQRCodeMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerQRCodeMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneMarkerQRCodeMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #symbolType}. */
    public static int nsymbolType(long struct) { return memGetInt(struct + XrSceneMarkerQRCodeMSFT.SYMBOLTYPE); }
    /** Unsafe version of {@link #version}. */
    public static byte nversion(long struct) { return memGetByte(struct + XrSceneMarkerQRCodeMSFT.VERSION); }

    // -----------------------------------

    /** An array of {@link XrSceneMarkerQRCodeMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneMarkerQRCodeMSFT, Buffer> {

        private static final XrSceneMarkerQRCodeMSFT ELEMENT_FACTORY = XrSceneMarkerQRCodeMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneMarkerQRCodeMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMarkerQRCodeMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneMarkerQRCodeMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code symbolType} field. */
        @NativeType("XrSceneMarkerQRCodeSymbolTypeMSFT")
        public int symbolType() { return XrSceneMarkerQRCodeMSFT.nsymbolType(address()); }
        /** @return the value of the {@code version} field. */
        @NativeType("uint8_t")
        public byte version() { return XrSceneMarkerQRCodeMSFT.nversion(address()); }

    }

}