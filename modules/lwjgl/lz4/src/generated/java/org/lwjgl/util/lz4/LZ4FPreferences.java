/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct LZ4F_preferences_t {
 *     {@link LZ4FFrameInfo LZ4F_frameInfo_t} frameInfo;
 *     int compressionLevel;
 *     unsigned autoFlush;
 *     unsigned favorDecSpeed;
 *     unsigned reserved[3];
 * }</code></pre>
 */
@NativeType("struct LZ4F_preferences_t")
public class LZ4FPreferences extends Struct<LZ4FPreferences> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FRAMEINFO,
        COMPRESSIONLEVEL,
        AUTOFLUSH,
        FAVORDECSPEED,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(LZ4FFrameInfo.SIZEOF, LZ4FFrameInfo.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FRAMEINFO = layout.offsetof(0);
        COMPRESSIONLEVEL = layout.offsetof(1);
        AUTOFLUSH = layout.offsetof(2);
        FAVORDECSPEED = layout.offsetof(3);
        RESERVED = layout.offsetof(4);
    }

    protected LZ4FPreferences(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LZ4FPreferences create(long address, @Nullable ByteBuffer container) {
        return new LZ4FPreferences(address, container);
    }

    /**
     * Creates a {@code LZ4FPreferences} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4FPreferences(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link LZ4FFrameInfo} view of the {@code frameInfo} field. */
    @NativeType("LZ4F_frameInfo_t")
    public LZ4FFrameInfo frameInfo() { return nframeInfo(address()); }
    /** @return the value of the {@code compressionLevel} field. */
    public int compressionLevel() { return ncompressionLevel(address()); }
    /** @return the value of the {@code autoFlush} field. */
    @NativeType("unsigned")
    public boolean autoFlush() { return nautoFlush(address()) != 0; }
    /** @return the value of the {@code favorDecSpeed} field. */
    @NativeType("unsigned")
    public boolean favorDecSpeed() { return nfavorDecSpeed(address()) != 0; }
    /** @return a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned[3]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** @return the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Copies the specified {@link LZ4FFrameInfo} to the {@code frameInfo} field. */
    public LZ4FPreferences frameInfo(@NativeType("LZ4F_frameInfo_t") LZ4FFrameInfo value) { nframeInfo(address(), value); return this; }
    /** Passes the {@code frameInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LZ4FPreferences frameInfo(java.util.function.Consumer<LZ4FFrameInfo> consumer) { consumer.accept(frameInfo()); return this; }
    /** Sets the specified value to the {@code compressionLevel} field. */
    public LZ4FPreferences compressionLevel(int value) { ncompressionLevel(address(), value); return this; }
    /** Sets the specified value to the {@code autoFlush} field. */
    public LZ4FPreferences autoFlush(@NativeType("unsigned") boolean value) { nautoFlush(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code favorDecSpeed} field. */
    public LZ4FPreferences favorDecSpeed(@NativeType("unsigned") boolean value) { nfavorDecSpeed(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public LZ4FPreferences reserved(@NativeType("unsigned[3]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public LZ4FPreferences reserved(int index, @NativeType("unsigned") int value) { nreserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public LZ4FPreferences set(
        LZ4FFrameInfo frameInfo,
        int compressionLevel,
        boolean autoFlush,
        boolean favorDecSpeed,
        IntBuffer reserved
    ) {
        frameInfo(frameInfo);
        compressionLevel(compressionLevel);
        autoFlush(autoFlush);
        favorDecSpeed(favorDecSpeed);
        reserved(reserved);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LZ4FPreferences set(LZ4FPreferences src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LZ4FPreferences} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LZ4FPreferences malloc() {
        return new LZ4FPreferences(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LZ4FPreferences} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LZ4FPreferences calloc() {
        return new LZ4FPreferences(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LZ4FPreferences} instance allocated with {@link BufferUtils}. */
    public static LZ4FPreferences create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LZ4FPreferences(memAddress(container), container);
    }

    /** Returns a new {@code LZ4FPreferences} instance for the specified memory address. */
    public static LZ4FPreferences create(long address) {
        return new LZ4FPreferences(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LZ4FPreferences createSafe(long address) {
        return address == NULL ? null : new LZ4FPreferences(address, null);
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LZ4FPreferences.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LZ4FPreferences.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FPreferences mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FPreferences callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FPreferences mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FPreferences callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FPreferences.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FPreferences.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FPreferences.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FPreferences.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code LZ4FPreferences} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FPreferences malloc(MemoryStack stack) {
        return new LZ4FPreferences(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LZ4FPreferences} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FPreferences calloc(MemoryStack stack) {
        return new LZ4FPreferences(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #frameInfo}. */
    public static LZ4FFrameInfo nframeInfo(long struct) { return LZ4FFrameInfo.create(struct + LZ4FPreferences.FRAMEINFO); }
    /** Unsafe version of {@link #compressionLevel}. */
    public static int ncompressionLevel(long struct) { return memGetInt(struct + LZ4FPreferences.COMPRESSIONLEVEL); }
    /** Unsafe version of {@link #autoFlush}. */
    public static int nautoFlush(long struct) { return memGetInt(struct + LZ4FPreferences.AUTOFLUSH); }
    /** Unsafe version of {@link #favorDecSpeed}. */
    public static int nfavorDecSpeed(long struct) { return memGetInt(struct + LZ4FPreferences.FAVORDECSPEED); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + LZ4FPreferences.RESERVED, 3); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return memGetInt(struct + LZ4FPreferences.RESERVED + check(index, 3) * 4);
    }

    /** Unsafe version of {@link #frameInfo(LZ4FFrameInfo) frameInfo}. */
    public static void nframeInfo(long struct, LZ4FFrameInfo value) { memCopy(value.address(), struct + LZ4FPreferences.FRAMEINFO, LZ4FFrameInfo.SIZEOF); }
    /** Unsafe version of {@link #compressionLevel(int) compressionLevel}. */
    public static void ncompressionLevel(long struct, int value) { memPutInt(struct + LZ4FPreferences.COMPRESSIONLEVEL, value); }
    /** Unsafe version of {@link #autoFlush(boolean) autoFlush}. */
    public static void nautoFlush(long struct, int value) { memPutInt(struct + LZ4FPreferences.AUTOFLUSH, value); }
    /** Unsafe version of {@link #favorDecSpeed(boolean) favorDecSpeed}. */
    public static void nfavorDecSpeed(long struct, int value) { memPutInt(struct + LZ4FPreferences.FAVORDECSPEED, value); }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + LZ4FPreferences.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        memPutInt(struct + LZ4FPreferences.RESERVED + check(index, 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link LZ4FPreferences} structs. */
    public static class Buffer extends StructBuffer<LZ4FPreferences, Buffer> implements NativeResource {

        private static final LZ4FPreferences ELEMENT_FACTORY = LZ4FPreferences.create(-1L);

        /**
         * Creates a new {@code LZ4FPreferences.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4FPreferences#SIZEOF}, and its mark will be undefined.</p>
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
        protected LZ4FPreferences getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link LZ4FFrameInfo} view of the {@code frameInfo} field. */
        @NativeType("LZ4F_frameInfo_t")
        public LZ4FFrameInfo frameInfo() { return LZ4FPreferences.nframeInfo(address()); }
        /** @return the value of the {@code compressionLevel} field. */
        public int compressionLevel() { return LZ4FPreferences.ncompressionLevel(address()); }
        /** @return the value of the {@code autoFlush} field. */
        @NativeType("unsigned")
        public boolean autoFlush() { return LZ4FPreferences.nautoFlush(address()) != 0; }
        /** @return the value of the {@code favorDecSpeed} field. */
        @NativeType("unsigned")
        public boolean favorDecSpeed() { return LZ4FPreferences.nfavorDecSpeed(address()) != 0; }
        /** @return a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned[3]")
        public IntBuffer reserved() { return LZ4FPreferences.nreserved(address()); }
        /** @return the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned")
        public int reserved(int index) { return LZ4FPreferences.nreserved(address(), index); }

        /** Copies the specified {@link LZ4FFrameInfo} to the {@code frameInfo} field. */
        public LZ4FPreferences.Buffer frameInfo(@NativeType("LZ4F_frameInfo_t") LZ4FFrameInfo value) { LZ4FPreferences.nframeInfo(address(), value); return this; }
        /** Passes the {@code frameInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LZ4FPreferences.Buffer frameInfo(java.util.function.Consumer<LZ4FFrameInfo> consumer) { consumer.accept(frameInfo()); return this; }
        /** Sets the specified value to the {@code compressionLevel} field. */
        public LZ4FPreferences.Buffer compressionLevel(int value) { LZ4FPreferences.ncompressionLevel(address(), value); return this; }
        /** Sets the specified value to the {@code autoFlush} field. */
        public LZ4FPreferences.Buffer autoFlush(@NativeType("unsigned") boolean value) { LZ4FPreferences.nautoFlush(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code favorDecSpeed} field. */
        public LZ4FPreferences.Buffer favorDecSpeed(@NativeType("unsigned") boolean value) { LZ4FPreferences.nfavorDecSpeed(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public LZ4FPreferences.Buffer reserved(@NativeType("unsigned[3]") IntBuffer value) { LZ4FPreferences.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public LZ4FPreferences.Buffer reserved(int index, @NativeType("unsigned") int value) { LZ4FPreferences.nreserved(address(), index, value); return this; }

    }

}