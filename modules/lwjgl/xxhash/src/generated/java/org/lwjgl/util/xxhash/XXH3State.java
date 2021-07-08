/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.util.xxhash.XXHash.*;

/**
 * XXH3 state for stack allocation. Unstable API.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XXH3_state_t {
 *     XXH32_hash_t acc[8];
 *     unsigned char customSecret[XXH_SECRET_DEFAULT_SIZE];
 *     unsigned char buffer[256];
 *     XXH32_hash_t bufferedSize;
 *     XXH32_hash_t reserved32;
 *     size_t nbStripesSoFar;
 *     XXH32_hash_t totalLen;
 *     size_t nbStripesPerBlock;
 *     size_t secretLimit;
 *     XXH32_hash_t seed;
 *     XXH32_hash_t reserved64;
 *     unsigned char const * extSecret;
 * }</code></pre>
 */
@NativeType("struct XXH3_state_t")
public class XXH3State extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ACC,
        CUSTOMSECRET,
        BUFFER,
        BUFFEREDSIZE,
        RESERVED32,
        NBSTRIPESSOFAR,
        TOTALLEN,
        NBSTRIPESPERBLOCK,
        SECRETLIMIT,
        SEED,
        RESERVED64,
        EXTSECRET;

    static {
        Layout layout = __struct(
            __array(8, 8),
            __array(1, XXH_SECRET_DEFAULT_SIZE),
            __array(1, 256),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ACC = layout.offsetof(0);
        CUSTOMSECRET = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
        BUFFEREDSIZE = layout.offsetof(3);
        RESERVED32 = layout.offsetof(4);
        NBSTRIPESSOFAR = layout.offsetof(5);
        TOTALLEN = layout.offsetof(6);
        NBSTRIPESPERBLOCK = layout.offsetof(7);
        SECRETLIMIT = layout.offsetof(8);
        SEED = layout.offsetof(9);
        RESERVED64 = layout.offsetof(10);
        EXTSECRET = layout.offsetof(11);
    }

    /**
     * Creates a {@code XXH3State} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XXH3State(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link LongBuffer} view of the {@code acc} field. */
    @NativeType("XXH32_hash_t[8]")
    public LongBuffer acc() { return nacc(address()); }
    /** @return the value at the specified index of the {@code acc} field. */
    @NativeType("XXH32_hash_t")
    public long acc(int index) { return nacc(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code customSecret} field. */
    @NativeType("unsigned char[XXH_SECRET_DEFAULT_SIZE]")
    public ByteBuffer customSecret() { return ncustomSecret(address()); }
    /** @return the value at the specified index of the {@code customSecret} field. */
    @NativeType("unsigned char")
    public byte customSecret(int index) { return ncustomSecret(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code buffer} field. */
    @NativeType("unsigned char[256]")
    public ByteBuffer buffer() { return nbuffer(address()); }
    /** @return the value at the specified index of the {@code buffer} field. */
    @NativeType("unsigned char")
    public byte buffer(int index) { return nbuffer(address(), index); }
    /** @return the value of the {@code bufferedSize} field. */
    @NativeType("XXH32_hash_t")
    public int bufferedSize() { return nbufferedSize(address()); }
    /** @return the value of the {@code reserved32} field. */
    @NativeType("XXH32_hash_t")
    public int reserved32() { return nreserved32(address()); }
    /** @return the value of the {@code nbStripesSoFar} field. */
    @NativeType("size_t")
    public long nbStripesSoFar() { return nnbStripesSoFar(address()); }
    /** @return the value of the {@code totalLen} field. */
    @NativeType("XXH32_hash_t")
    public long totalLen() { return ntotalLen(address()); }
    /** @return the value of the {@code nbStripesPerBlock} field. */
    @NativeType("size_t")
    public long nbStripesPerBlock() { return nnbStripesPerBlock(address()); }
    /** @return the value of the {@code secretLimit} field. */
    @NativeType("size_t")
    public long secretLimit() { return nsecretLimit(address()); }
    /** @return the value of the {@code seed} field. */
    @NativeType("XXH32_hash_t")
    public long seed() { return nseed(address()); }
    /** @return the value of the {@code reserved64} field. */
    @NativeType("XXH32_hash_t")
    public long reserved64() { return nreserved64(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code extSecret} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned char const *")
    public ByteBuffer extSecret(int capacity) { return nextSecret(address(), capacity); }

    // -----------------------------------

    /** Returns a new {@code XXH3State} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XXH3State malloc() {
        return wrap(XXH3State.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XXH3State} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XXH3State calloc() {
        return wrap(XXH3State.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XXH3State} instance allocated with {@link BufferUtils}. */
    public static XXH3State create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XXH3State.class, memAddress(container), container);
    }

    /** Returns a new {@code XXH3State} instance for the specified memory address. */
    public static XXH3State create(long address) {
        return wrap(XXH3State.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH3State createSafe(long address) {
        return address == NULL ? null : wrap(XXH3State.class, address);
    }

    /**
     * Returns a new {@link XXH3State.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH3State.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XXH3State.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH3State.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH3State.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH3State.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XXH3State.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XXH3State.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH3State.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XXH3State} instance allocated on the thread-local {@link MemoryStack}. */
    public static XXH3State mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XXH3State} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XXH3State callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XXH3State} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH3State mallocStack(MemoryStack stack) {
        return wrap(XXH3State.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XXH3State} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH3State callocStack(MemoryStack stack) {
        return wrap(XXH3State.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XXH3State.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH3State.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XXH3State.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XXH3State.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XXH3State.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH3State.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH3State.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH3State.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #acc}. */
    public static LongBuffer nacc(long struct) { return memLongBuffer(struct + XXH3State.ACC, 8); }
    /** Unsafe version of {@link #acc(int) acc}. */
    public static long nacc(long struct, int index) {
        return UNSAFE.getLong(null, struct + XXH3State.ACC + check(index, 8) * 8);
    }
    /** Unsafe version of {@link #customSecret}. */
    public static ByteBuffer ncustomSecret(long struct) { return memByteBuffer(struct + XXH3State.CUSTOMSECRET, XXH_SECRET_DEFAULT_SIZE); }
    /** Unsafe version of {@link #customSecret(int) customSecret}. */
    public static byte ncustomSecret(long struct, int index) {
        return UNSAFE.getByte(null, struct + XXH3State.CUSTOMSECRET + check(index, XXH_SECRET_DEFAULT_SIZE) * 1);
    }
    /** Unsafe version of {@link #buffer}. */
    public static ByteBuffer nbuffer(long struct) { return memByteBuffer(struct + XXH3State.BUFFER, 256); }
    /** Unsafe version of {@link #buffer(int) buffer}. */
    public static byte nbuffer(long struct, int index) {
        return UNSAFE.getByte(null, struct + XXH3State.BUFFER + check(index, 256) * 1);
    }
    /** Unsafe version of {@link #bufferedSize}. */
    public static int nbufferedSize(long struct) { return UNSAFE.getInt(null, struct + XXH3State.BUFFEREDSIZE); }
    /** Unsafe version of {@link #reserved32}. */
    public static int nreserved32(long struct) { return UNSAFE.getInt(null, struct + XXH3State.RESERVED32); }
    /** Unsafe version of {@link #nbStripesSoFar}. */
    public static long nnbStripesSoFar(long struct) { return memGetAddress(struct + XXH3State.NBSTRIPESSOFAR); }
    /** Unsafe version of {@link #totalLen}. */
    public static long ntotalLen(long struct) { return UNSAFE.getLong(null, struct + XXH3State.TOTALLEN); }
    /** Unsafe version of {@link #nbStripesPerBlock}. */
    public static long nnbStripesPerBlock(long struct) { return memGetAddress(struct + XXH3State.NBSTRIPESPERBLOCK); }
    /** Unsafe version of {@link #secretLimit}. */
    public static long nsecretLimit(long struct) { return memGetAddress(struct + XXH3State.SECRETLIMIT); }
    /** Unsafe version of {@link #seed}. */
    public static long nseed(long struct) { return UNSAFE.getLong(null, struct + XXH3State.SEED); }
    /** Unsafe version of {@link #reserved64}. */
    public static long nreserved64(long struct) { return UNSAFE.getLong(null, struct + XXH3State.RESERVED64); }
    /** Unsafe version of {@link #extSecret(int) extSecret}. */
    public static ByteBuffer nextSecret(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + XXH3State.EXTSECRET), capacity); }

    // -----------------------------------

    /** An array of {@link XXH3State} structs. */
    public static class Buffer extends StructBuffer<XXH3State, Buffer> implements NativeResource {

        private static final XXH3State ELEMENT_FACTORY = XXH3State.create(-1L);

        /**
         * Creates a new {@code XXH3State.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XXH3State#SIZEOF}, and its mark will be undefined.
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
        protected XXH3State getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link LongBuffer} view of the {@code acc} field. */
        @NativeType("XXH32_hash_t[8]")
        public LongBuffer acc() { return XXH3State.nacc(address()); }
        /** @return the value at the specified index of the {@code acc} field. */
        @NativeType("XXH32_hash_t")
        public long acc(int index) { return XXH3State.nacc(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code customSecret} field. */
        @NativeType("unsigned char[XXH_SECRET_DEFAULT_SIZE]")
        public ByteBuffer customSecret() { return XXH3State.ncustomSecret(address()); }
        /** @return the value at the specified index of the {@code customSecret} field. */
        @NativeType("unsigned char")
        public byte customSecret(int index) { return XXH3State.ncustomSecret(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code buffer} field. */
        @NativeType("unsigned char[256]")
        public ByteBuffer buffer() { return XXH3State.nbuffer(address()); }
        /** @return the value at the specified index of the {@code buffer} field. */
        @NativeType("unsigned char")
        public byte buffer(int index) { return XXH3State.nbuffer(address(), index); }
        /** @return the value of the {@code bufferedSize} field. */
        @NativeType("XXH32_hash_t")
        public int bufferedSize() { return XXH3State.nbufferedSize(address()); }
        /** @return the value of the {@code reserved32} field. */
        @NativeType("XXH32_hash_t")
        public int reserved32() { return XXH3State.nreserved32(address()); }
        /** @return the value of the {@code nbStripesSoFar} field. */
        @NativeType("size_t")
        public long nbStripesSoFar() { return XXH3State.nnbStripesSoFar(address()); }
        /** @return the value of the {@code totalLen} field. */
        @NativeType("XXH32_hash_t")
        public long totalLen() { return XXH3State.ntotalLen(address()); }
        /** @return the value of the {@code nbStripesPerBlock} field. */
        @NativeType("size_t")
        public long nbStripesPerBlock() { return XXH3State.nnbStripesPerBlock(address()); }
        /** @return the value of the {@code secretLimit} field. */
        @NativeType("size_t")
        public long secretLimit() { return XXH3State.nsecretLimit(address()); }
        /** @return the value of the {@code seed} field. */
        @NativeType("XXH32_hash_t")
        public long seed() { return XXH3State.nseed(address()); }
        /** @return the value of the {@code reserved64} field. */
        @NativeType("XXH32_hash_t")
        public long reserved64() { return XXH3State.nreserved64(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code extSecret} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned char const *")
        public ByteBuffer extSecret(int capacity) { return XXH3State.nextSecret(address(), capacity); }

    }

}