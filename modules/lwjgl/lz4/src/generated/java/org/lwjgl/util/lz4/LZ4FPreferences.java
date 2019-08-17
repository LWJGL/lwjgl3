/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Makes it possible to supply advanced compression instructions to streaming interface. Structure must be first init to 0, using {@code memset()},
 * setting all parameters to default. All reserved fields must be set to zero.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code compressionLevel} &ndash; 0: default (fast mode); values &gt; {@link LZ4HC#LZ4HC_CLEVEL_MAX CLEVEL_MAX} count as {@link LZ4HC#LZ4HC_CLEVEL_MAX CLEVEL_MAX}; values &gt; 0 trigger "fast acceleration"</li>
 * <li>{@code autoFlush} &ndash; 1: always flush, reduces usage of internal buffers</li>
 * <li>{@code favorDecSpeed} &ndash; 1: parser favors decompression speed vs compression ratio. Only works for high compression modes (&ge; {@link LZ4HC#LZ4HC_CLEVEL_OPT_MIN CLEVEL_OPT_MIN}). Since version 1.8.2.</li>
 * <li>{@code reserved[3]} &ndash; must be zero for forward compatibility</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
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
public class LZ4FPreferences extends Struct implements NativeResource {

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

    /** Returns a {@link LZ4FFrameInfo} view of the {@code frameInfo} field. */
    @NativeType("LZ4F_frameInfo_t")
    public LZ4FFrameInfo frameInfo() { return nframeInfo(address()); }
    /** Returns the value of the {@code compressionLevel} field. */
    public int compressionLevel() { return ncompressionLevel(address()); }
    /** Returns the value of the {@code autoFlush} field. */
    @NativeType("unsigned")
    public int autoFlush() { return nautoFlush(address()); }
    /** Returns the value of the {@code favorDecSpeed} field. */
    @NativeType("unsigned")
    public int favorDecSpeed() { return nfavorDecSpeed(address()); }
    /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned[3]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** Returns the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Copies the specified {@link LZ4FFrameInfo} to the {@code frameInfo} field. */
    public LZ4FPreferences frameInfo(@NativeType("LZ4F_frameInfo_t") LZ4FFrameInfo value) { nframeInfo(address(), value); return this; }
    /** Passes the {@code frameInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LZ4FPreferences frameInfo(java.util.function.Consumer<LZ4FFrameInfo> consumer) { consumer.accept(frameInfo()); return this; }
    /** Sets the specified value to the {@code compressionLevel} field. */
    public LZ4FPreferences compressionLevel(int value) { ncompressionLevel(address(), value); return this; }
    /** Sets the specified value to the {@code autoFlush} field. */
    public LZ4FPreferences autoFlush(@NativeType("unsigned") int value) { nautoFlush(address(), value); return this; }
    /** Sets the specified value to the {@code favorDecSpeed} field. */
    public LZ4FPreferences favorDecSpeed(@NativeType("unsigned") int value) { nfavorDecSpeed(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public LZ4FPreferences reserved(@NativeType("unsigned[3]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public LZ4FPreferences reserved(int index, @NativeType("unsigned") int value) { nreserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public LZ4FPreferences set(
        LZ4FFrameInfo frameInfo,
        int compressionLevel,
        int autoFlush,
        int favorDecSpeed,
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
        return wrap(LZ4FPreferences.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LZ4FPreferences} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LZ4FPreferences calloc() {
        return wrap(LZ4FPreferences.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LZ4FPreferences} instance allocated with {@link BufferUtils}. */
    public static LZ4FPreferences create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LZ4FPreferences.class, memAddress(container), container);
    }

    /** Returns a new {@code LZ4FPreferences} instance for the specified memory address. */
    public static LZ4FPreferences create(long address) {
        return wrap(LZ4FPreferences.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4FPreferences createSafe(long address) {
        return address == NULL ? null : wrap(LZ4FPreferences.class, address);
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LZ4FPreferences.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4FPreferences.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code LZ4FPreferences} instance allocated on the thread-local {@link MemoryStack}. */
    public static LZ4FPreferences mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code LZ4FPreferences} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static LZ4FPreferences callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code LZ4FPreferences} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FPreferences mallocStack(MemoryStack stack) {
        return wrap(LZ4FPreferences.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LZ4FPreferences} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FPreferences callocStack(MemoryStack stack) {
        return wrap(LZ4FPreferences.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FPreferences.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FPreferences.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #frameInfo}. */
    public static LZ4FFrameInfo nframeInfo(long struct) { return LZ4FFrameInfo.create(struct + LZ4FPreferences.FRAMEINFO); }
    /** Unsafe version of {@link #compressionLevel}. */
    public static int ncompressionLevel(long struct) { return UNSAFE.getInt(null, struct + LZ4FPreferences.COMPRESSIONLEVEL); }
    /** Unsafe version of {@link #autoFlush}. */
    public static int nautoFlush(long struct) { return UNSAFE.getInt(null, struct + LZ4FPreferences.AUTOFLUSH); }
    /** Unsafe version of {@link #favorDecSpeed}. */
    public static int nfavorDecSpeed(long struct) { return UNSAFE.getInt(null, struct + LZ4FPreferences.FAVORDECSPEED); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + LZ4FPreferences.RESERVED, 3); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return UNSAFE.getInt(null, struct + LZ4FPreferences.RESERVED + check(index, 3) * 4);
    }

    /** Unsafe version of {@link #frameInfo(LZ4FFrameInfo) frameInfo}. */
    public static void nframeInfo(long struct, LZ4FFrameInfo value) { memCopy(value.address(), struct + LZ4FPreferences.FRAMEINFO, LZ4FFrameInfo.SIZEOF); }
    /** Unsafe version of {@link #compressionLevel(int) compressionLevel}. */
    public static void ncompressionLevel(long struct, int value) { UNSAFE.putInt(null, struct + LZ4FPreferences.COMPRESSIONLEVEL, value); }
    /** Unsafe version of {@link #autoFlush(int) autoFlush}. */
    public static void nautoFlush(long struct, int value) { UNSAFE.putInt(null, struct + LZ4FPreferences.AUTOFLUSH, value); }
    /** Unsafe version of {@link #favorDecSpeed(int) favorDecSpeed}. */
    public static void nfavorDecSpeed(long struct, int value) { UNSAFE.putInt(null, struct + LZ4FPreferences.FAVORDECSPEED, value); }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + LZ4FPreferences.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + LZ4FPreferences.RESERVED + check(index, 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link LZ4FPreferences} structs. */
    public static class Buffer extends StructBuffer<LZ4FPreferences, Buffer> implements NativeResource {

        private static final LZ4FPreferences ELEMENT_FACTORY = LZ4FPreferences.create(-1L);

        /**
         * Creates a new {@code LZ4FPreferences.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4FPreferences#SIZEOF}, and its mark will be undefined.
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
        protected LZ4FPreferences getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link LZ4FFrameInfo} view of the {@code frameInfo} field. */
        @NativeType("LZ4F_frameInfo_t")
        public LZ4FFrameInfo frameInfo() { return LZ4FPreferences.nframeInfo(address()); }
        /** Returns the value of the {@code compressionLevel} field. */
        public int compressionLevel() { return LZ4FPreferences.ncompressionLevel(address()); }
        /** Returns the value of the {@code autoFlush} field. */
        @NativeType("unsigned")
        public int autoFlush() { return LZ4FPreferences.nautoFlush(address()); }
        /** Returns the value of the {@code favorDecSpeed} field. */
        @NativeType("unsigned")
        public int favorDecSpeed() { return LZ4FPreferences.nfavorDecSpeed(address()); }
        /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned[3]")
        public IntBuffer reserved() { return LZ4FPreferences.nreserved(address()); }
        /** Returns the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned")
        public int reserved(int index) { return LZ4FPreferences.nreserved(address(), index); }

        /** Copies the specified {@link LZ4FFrameInfo} to the {@code frameInfo} field. */
        public LZ4FPreferences.Buffer frameInfo(@NativeType("LZ4F_frameInfo_t") LZ4FFrameInfo value) { LZ4FPreferences.nframeInfo(address(), value); return this; }
        /** Passes the {@code frameInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LZ4FPreferences.Buffer frameInfo(java.util.function.Consumer<LZ4FFrameInfo> consumer) { consumer.accept(frameInfo()); return this; }
        /** Sets the specified value to the {@code compressionLevel} field. */
        public LZ4FPreferences.Buffer compressionLevel(int value) { LZ4FPreferences.ncompressionLevel(address(), value); return this; }
        /** Sets the specified value to the {@code autoFlush} field. */
        public LZ4FPreferences.Buffer autoFlush(@NativeType("unsigned") int value) { LZ4FPreferences.nautoFlush(address(), value); return this; }
        /** Sets the specified value to the {@code favorDecSpeed} field. */
        public LZ4FPreferences.Buffer favorDecSpeed(@NativeType("unsigned") int value) { LZ4FPreferences.nfavorDecSpeed(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public LZ4FPreferences.Buffer reserved(@NativeType("unsigned[3]") IntBuffer value) { LZ4FPreferences.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public LZ4FPreferences.Buffer reserved(int index, @NativeType("unsigned") int value) { LZ4FPreferences.nreserved(address(), index, value); return this; }

    }

}