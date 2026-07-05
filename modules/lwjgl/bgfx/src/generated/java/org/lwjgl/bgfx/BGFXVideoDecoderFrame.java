/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct bgfx_video_decoder_frame_t {
 *     uint32_t magic;
 *     uint8_t const * bitstream;
 *     {@link BGFXVideoDecoderAU bgfx_video_decoder_au_t} const * aus;
 *     uint32_t numAus;
 *     int64_t presentationTimeUs;
 *     uint8_t flags;
 * }</code></pre>
 */
@NativeType("struct bgfx_video_decoder_frame_t")
public class BGFXVideoDecoderFrame extends Struct<BGFXVideoDecoderFrame> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAGIC,
        BITSTREAM,
        AUS,
        NUMAUS,
        PRESENTATIONTIMEUS,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAGIC = layout.offsetof(0);
        BITSTREAM = layout.offsetof(1);
        AUS = layout.offsetof(2);
        NUMAUS = layout.offsetof(3);
        PRESENTATIONTIMEUS = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
    }

    protected BGFXVideoDecoderFrame(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BGFXVideoDecoderFrame create(long address, @Nullable ByteBuffer container) {
        return new BGFXVideoDecoderFrame(address, container);
    }

    /**
     * Creates a {@code BGFXVideoDecoderFrame} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXVideoDecoderFrame(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code magic} field. */
    @NativeType("uint32_t")
    public int magic() { return nmagic(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code bitstream} field. */
    @NativeType("uint8_t const *")
    public @Nullable ByteBuffer bitstream(int capacity) { return nbitstream(address(), capacity); }
    /** @return a {@link BGFXVideoDecoderAU.Buffer} view of the struct array pointed to by the {@code aus} field. */
    @NativeType("bgfx_video_decoder_au_t const *")
    public BGFXVideoDecoderAU.@Nullable Buffer aus() { return naus(address()); }
    /** @return the value of the {@code numAus} field. */
    @NativeType("uint32_t")
    public int numAus() { return nnumAus(address()); }
    /** @return the value of the {@code presentationTimeUs} field. */
    @NativeType("int64_t")
    public long presentationTimeUs() { return npresentationTimeUs(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint8_t")
    public byte flags() { return nflags(address()); }

    /** Sets the specified value to the {@code magic} field. */
    public BGFXVideoDecoderFrame magic(@NativeType("uint32_t") int value) { nmagic(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code bitstream} field. */
    public BGFXVideoDecoderFrame bitstream(@Nullable @NativeType("uint8_t const *") ByteBuffer value) { nbitstream(address(), value); return this; }
    /** Sets the address of the specified {@link BGFXVideoDecoderAU.Buffer} to the {@code aus} field. */
    public BGFXVideoDecoderFrame aus(@NativeType("bgfx_video_decoder_au_t const *") BGFXVideoDecoderAU.@Nullable Buffer value) { naus(address(), value); return this; }
    /** Sets the specified value to the {@code numAus} field. */
    public BGFXVideoDecoderFrame numAus(@NativeType("uint32_t") int value) { nnumAus(address(), value); return this; }
    /** Sets the specified value to the {@code presentationTimeUs} field. */
    public BGFXVideoDecoderFrame presentationTimeUs(@NativeType("int64_t") long value) { npresentationTimeUs(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public BGFXVideoDecoderFrame flags(@NativeType("uint8_t") byte value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXVideoDecoderFrame set(
        int magic,
        @Nullable ByteBuffer bitstream,
        BGFXVideoDecoderAU.@Nullable Buffer aus,
        int numAus,
        long presentationTimeUs,
        byte flags
    ) {
        magic(magic);
        bitstream(bitstream);
        aus(aus);
        numAus(numAus);
        presentationTimeUs(presentationTimeUs);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXVideoDecoderFrame set(BGFXVideoDecoderFrame src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXVideoDecoderFrame} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXVideoDecoderFrame malloc() {
        return new BGFXVideoDecoderFrame(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code BGFXVideoDecoderFrame} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXVideoDecoderFrame calloc() {
        return new BGFXVideoDecoderFrame(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code BGFXVideoDecoderFrame} instance allocated with {@link BufferUtils}. */
    public static BGFXVideoDecoderFrame create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BGFXVideoDecoderFrame(memAddress(container), container);
    }

    /** Returns a new {@code BGFXVideoDecoderFrame} instance for the specified memory address. */
    public static BGFXVideoDecoderFrame create(long address) {
        return new BGFXVideoDecoderFrame(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BGFXVideoDecoderFrame createSafe(long address) {
        return address == NULL ? null : new BGFXVideoDecoderFrame(address, null);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderFrame.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderFrame.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderFrame.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderFrame.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderFrame.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderFrame.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link BGFXVideoDecoderFrame.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderFrame.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static BGFXVideoDecoderFrame.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code BGFXVideoDecoderFrame} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXVideoDecoderFrame malloc(MemoryStack stack) {
        return new BGFXVideoDecoderFrame(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code BGFXVideoDecoderFrame} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXVideoDecoderFrame calloc(MemoryStack stack) {
        return new BGFXVideoDecoderFrame(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderFrame.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderFrame.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderFrame.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderFrame.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #magic}. */
    public static int nmagic(long struct) { return memGetInt(struct + BGFXVideoDecoderFrame.MAGIC); }
    /** Unsafe version of {@link #bitstream(int) bitstream}. */
    public static @Nullable ByteBuffer nbitstream(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + BGFXVideoDecoderFrame.BITSTREAM), capacity); }
    /** Unsafe version of {@link #aus}. */
    public static BGFXVideoDecoderAU.@Nullable Buffer naus(long struct) { return BGFXVideoDecoderAU.createSafe(memGetAddress(struct + BGFXVideoDecoderFrame.AUS), nnumAus(struct)); }
    /** Unsafe version of {@link #numAus}. */
    public static int nnumAus(long struct) { return memGetInt(struct + BGFXVideoDecoderFrame.NUMAUS); }
    /** Unsafe version of {@link #presentationTimeUs}. */
    public static long npresentationTimeUs(long struct) { return memGetLong(struct + BGFXVideoDecoderFrame.PRESENTATIONTIMEUS); }
    /** Unsafe version of {@link #flags}. */
    public static byte nflags(long struct) { return memGetByte(struct + BGFXVideoDecoderFrame.FLAGS); }

    /** Unsafe version of {@link #magic(int) magic}. */
    public static void nmagic(long struct, int value) { memPutInt(struct + BGFXVideoDecoderFrame.MAGIC, value); }
    /** Unsafe version of {@link #bitstream(ByteBuffer) bitstream}. */
    public static void nbitstream(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + BGFXVideoDecoderFrame.BITSTREAM, memAddressSafe(value)); }
    /** Unsafe version of {@link #aus(BGFXVideoDecoderAU.Buffer) aus}. */
    public static void naus(long struct, BGFXVideoDecoderAU.@Nullable Buffer value) { memPutAddress(struct + BGFXVideoDecoderFrame.AUS, memAddressSafe(value)); nnumAus(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code numAus} field of the specified {@code struct}. */
    public static void nnumAus(long struct, int value) { memPutInt(struct + BGFXVideoDecoderFrame.NUMAUS, value); }
    /** Unsafe version of {@link #presentationTimeUs(long) presentationTimeUs}. */
    public static void npresentationTimeUs(long struct, long value) { memPutLong(struct + BGFXVideoDecoderFrame.PRESENTATIONTIMEUS, value); }
    /** Unsafe version of {@link #flags(byte) flags}. */
    public static void nflags(long struct, byte value) { memPutByte(struct + BGFXVideoDecoderFrame.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link BGFXVideoDecoderFrame} structs. */
    public static class Buffer extends StructBuffer<BGFXVideoDecoderFrame, Buffer> implements NativeResource {

        private static final BGFXVideoDecoderFrame ELEMENT_FACTORY = BGFXVideoDecoderFrame.create(-1L);

        /**
         * Creates a new {@code BGFXVideoDecoderFrame.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXVideoDecoderFrame#SIZEOF}, and its mark will be undefined.</p>
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
        protected BGFXVideoDecoderFrame getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code magic} field. */
        @NativeType("uint32_t")
        public int magic() { return BGFXVideoDecoderFrame.nmagic(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code bitstream} field. */
        @NativeType("uint8_t const *")
        public @Nullable ByteBuffer bitstream(int capacity) { return BGFXVideoDecoderFrame.nbitstream(address(), capacity); }
        /** @return a {@link BGFXVideoDecoderAU.Buffer} view of the struct array pointed to by the {@code aus} field. */
        @NativeType("bgfx_video_decoder_au_t const *")
        public BGFXVideoDecoderAU.@Nullable Buffer aus() { return BGFXVideoDecoderFrame.naus(address()); }
        /** @return the value of the {@code numAus} field. */
        @NativeType("uint32_t")
        public int numAus() { return BGFXVideoDecoderFrame.nnumAus(address()); }
        /** @return the value of the {@code presentationTimeUs} field. */
        @NativeType("int64_t")
        public long presentationTimeUs() { return BGFXVideoDecoderFrame.npresentationTimeUs(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint8_t")
        public byte flags() { return BGFXVideoDecoderFrame.nflags(address()); }

        /** Sets the specified value to the {@code magic} field. */
        public BGFXVideoDecoderFrame.Buffer magic(@NativeType("uint32_t") int value) { BGFXVideoDecoderFrame.nmagic(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code bitstream} field. */
        public BGFXVideoDecoderFrame.Buffer bitstream(@Nullable @NativeType("uint8_t const *") ByteBuffer value) { BGFXVideoDecoderFrame.nbitstream(address(), value); return this; }
        /** Sets the address of the specified {@link BGFXVideoDecoderAU.Buffer} to the {@code aus} field. */
        public BGFXVideoDecoderFrame.Buffer aus(@NativeType("bgfx_video_decoder_au_t const *") BGFXVideoDecoderAU.@Nullable Buffer value) { BGFXVideoDecoderFrame.naus(address(), value); return this; }
        /** Sets the specified value to the {@code numAus} field. */
        public BGFXVideoDecoderFrame.Buffer numAus(@NativeType("uint32_t") int value) { BGFXVideoDecoderFrame.nnumAus(address(), value); return this; }
        /** Sets the specified value to the {@code presentationTimeUs} field. */
        public BGFXVideoDecoderFrame.Buffer presentationTimeUs(@NativeType("int64_t") long value) { BGFXVideoDecoderFrame.npresentationTimeUs(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public BGFXVideoDecoderFrame.Buffer flags(@NativeType("uint8_t") byte value) { BGFXVideoDecoderFrame.nflags(address(), value); return this; }

    }

}