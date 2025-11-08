/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct spv_parsed_header_t {
 *     uint32_t magic;
 *     uint32_t version;
 *     uint32_t generator;
 *     uint32_t bound;
 *     uint32_t reserved;
 * }}</pre>
 */
@NativeType("struct spv_parsed_header_t")
public class SPVParsedHeader extends Struct<SPVParsedHeader> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAGIC,
        VERSION,
        GENERATOR,
        BOUND,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAGIC = layout.offsetof(0);
        VERSION = layout.offsetof(1);
        GENERATOR = layout.offsetof(2);
        BOUND = layout.offsetof(3);
        RESERVED = layout.offsetof(4);
    }

    protected SPVParsedHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SPVParsedHeader create(long address, @Nullable ByteBuffer container) {
        return new SPVParsedHeader(address, container);
    }

    /**
     * Creates a {@code SPVParsedHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SPVParsedHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code magic} field. */
    @NativeType("uint32_t")
    public int magic() { return nmagic(address()); }
    /** @return the value of the {@code version} field. */
    @NativeType("uint32_t")
    public int version() { return nversion(address()); }
    /** @return the value of the {@code generator} field. */
    @NativeType("uint32_t")
    public int generator() { return ngenerator(address()); }
    /** @return the value of the {@code bound} field. */
    @NativeType("uint32_t")
    public int bound() { return nbound(address()); }

    // -----------------------------------

    /** Returns a new {@code SPVParsedHeader} instance for the specified memory address. */
    public static SPVParsedHeader create(long address) {
        return new SPVParsedHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SPVParsedHeader createSafe(long address) {
        return address == NULL ? null : new SPVParsedHeader(address, null);
    }

    /**
     * Create a {@link SPVParsedHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SPVParsedHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SPVParsedHeader.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #magic}. */
    public static int nmagic(long struct) { return memGetInt(struct + SPVParsedHeader.MAGIC); }
    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return memGetInt(struct + SPVParsedHeader.VERSION); }
    /** Unsafe version of {@link #generator}. */
    public static int ngenerator(long struct) { return memGetInt(struct + SPVParsedHeader.GENERATOR); }
    /** Unsafe version of {@link #bound}. */
    public static int nbound(long struct) { return memGetInt(struct + SPVParsedHeader.BOUND); }
    public static int nreserved(long struct) { return memGetInt(struct + SPVParsedHeader.RESERVED); }

    // -----------------------------------

    /** An array of {@link SPVParsedHeader} structs. */
    public static class Buffer extends StructBuffer<SPVParsedHeader, Buffer> {

        private static final SPVParsedHeader ELEMENT_FACTORY = SPVParsedHeader.create(-1L);

        /**
         * Creates a new {@code SPVParsedHeader.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SPVParsedHeader#SIZEOF}, and its mark will be undefined.</p>
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
        protected SPVParsedHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code magic} field. */
        @NativeType("uint32_t")
        public int magic() { return SPVParsedHeader.nmagic(address()); }
        /** @return the value of the {@code version} field. */
        @NativeType("uint32_t")
        public int version() { return SPVParsedHeader.nversion(address()); }
        /** @return the value of the {@code generator} field. */
        @NativeType("uint32_t")
        public int generator() { return SPVParsedHeader.ngenerator(address()); }
        /** @return the value of the {@code bound} field. */
        @NativeType("uint32_t")
        public int bound() { return SPVParsedHeader.nbound(address()); }

    }

}