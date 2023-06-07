/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure for passing extended parameters to {@code ktxTexture_CompressAstc}.
 * 
 * <p>Passing a struct initialized to 0 will use {@code blockDimension} 4x4, {@code mode} {@code LDR} and {@code qualityLevel} {@code FASTEST}. Setting
 * {@code qualityLevel} to {@link KTX#KTX_PACK_ASTC_QUALITY_LEVEL_MEDIUM PACK_ASTC_QUALITY_LEVEL_MEDIUM} is recommended.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ktxAstcParams {
 *     ktx_uint32_t {@link #structSize};
 *     ktx_bool_t {@link #verbose};
 *     ktx_uint32_t {@link #threadCount};
 *     ktx_uint32_t {@link #blockDimension};
 *     ktx_uint32_t {@link #mode};
 *     ktx_uint32_t {@link #qualityLevel};
 *     ktx_bool_t {@link #normalMap};
 *     ktx_bool_t {@link #perceptual};
 *     char {@link #inputSwizzle}[4];
 * }</code></pre>
 */
public class ktxAstcParams extends Struct<ktxAstcParams> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STRUCTSIZE,
        VERBOSE,
        THREADCOUNT,
        BLOCKDIMENSION,
        MODE,
        QUALITYLEVEL,
        NORMALMAP,
        PERCEPTUAL,
        INPUTSWIZZLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __array(1, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STRUCTSIZE = layout.offsetof(0);
        VERBOSE = layout.offsetof(1);
        THREADCOUNT = layout.offsetof(2);
        BLOCKDIMENSION = layout.offsetof(3);
        MODE = layout.offsetof(4);
        QUALITYLEVEL = layout.offsetof(5);
        NORMALMAP = layout.offsetof(6);
        PERCEPTUAL = layout.offsetof(7);
        INPUTSWIZZLE = layout.offsetof(8);
    }

    protected ktxAstcParams(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxAstcParams create(long address, @Nullable ByteBuffer container) {
        return new ktxAstcParams(address, container);
    }

    /**
     * Creates a {@code ktxAstcParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxAstcParams(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * Size of this struct.
     * 
     * <p>Used so library can tell which version of struct is being passed.</p>
     */
    @NativeType("ktx_uint32_t")
    public int structSize() { return nstructSize(address()); }
    /**
     * If true, prints Astc encoder operation details to {@code stdout}.
     * 
     * <p>Not recommended for GUI apps.</p>
     */
    @NativeType("ktx_bool_t")
    public boolean verbose() { return nverbose(address()); }
    /** Number of threads used for compression. Default is 1. */
    @NativeType("ktx_uint32_t")
    public int threadCount() { return nthreadCount(address()); }
    /** Combinations of block dimensions that astcenc supports */
    @NativeType("ktx_uint32_t")
    public int blockDimension() { return nblockDimension(address()); }
    /** Can be {ldr/hdr} from astcenc */
    @NativeType("ktx_uint32_t")
    public int mode() { return nmode(address()); }
    /** astcenc supports -fastest, -fast, -medium, -thorough, -exhaustive */
    @NativeType("ktx_uint32_t")
    public int qualityLevel() { return nqualityLevel(address()); }
    /**
     * Tunes codec parameters for better quality on normal maps.
     * 
     * <p>In this mode normals are compressed to X,Y components, Discarding Z component, reader will need to generate Z component in shaders.</p>
     */
    @NativeType("ktx_bool_t")
    public boolean normalMap() { return nnormalMap(address()); }
    /**
     * The codec should optimize for perceptual error, instead of direct RMS error.
     * 
     * <p>This aims to improves perceived image quality, but typically lowers the measured PSNR score. Perceptual methods are currently only available for normal
     * maps and RGB color data.</p>
     */
    @NativeType("ktx_bool_t")
    public boolean perceptual() { return nperceptual(address()); }
    /** A swizzle to provide as input to astcenc. It must match the regular expression {@code /^[rgba01]{4}$/}. */
    @NativeType("char[4]")
    public ByteBuffer inputSwizzle() { return ninputSwizzle(address()); }
    /** A swizzle to provide as input to astcenc. It must match the regular expression {@code /^[rgba01]{4}$/}. */
    @NativeType("char")
    public byte inputSwizzle(int index) { return ninputSwizzle(address(), index); }

    /** Sets the specified value to the {@link #structSize} field. */
    public ktxAstcParams structSize(@NativeType("ktx_uint32_t") int value) { nstructSize(address(), value); return this; }
    /** Sets the specified value to the {@link #verbose} field. */
    public ktxAstcParams verbose(@NativeType("ktx_bool_t") boolean value) { nverbose(address(), value); return this; }
    /** Sets the specified value to the {@link #threadCount} field. */
    public ktxAstcParams threadCount(@NativeType("ktx_uint32_t") int value) { nthreadCount(address(), value); return this; }
    /** Sets the specified value to the {@link #blockDimension} field. */
    public ktxAstcParams blockDimension(@NativeType("ktx_uint32_t") int value) { nblockDimension(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public ktxAstcParams mode(@NativeType("ktx_uint32_t") int value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@link #qualityLevel} field. */
    public ktxAstcParams qualityLevel(@NativeType("ktx_uint32_t") int value) { nqualityLevel(address(), value); return this; }
    /** Sets the specified value to the {@link #normalMap} field. */
    public ktxAstcParams normalMap(@NativeType("ktx_bool_t") boolean value) { nnormalMap(address(), value); return this; }
    /** Sets the specified value to the {@link #perceptual} field. */
    public ktxAstcParams perceptual(@NativeType("ktx_bool_t") boolean value) { nperceptual(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #inputSwizzle} field. */
    public ktxAstcParams inputSwizzle(@NativeType("char[4]") ByteBuffer value) { ninputSwizzle(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #inputSwizzle} field. */
    public ktxAstcParams inputSwizzle(int index, @NativeType("char") byte value) { ninputSwizzle(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public ktxAstcParams set(
        int structSize,
        boolean verbose,
        int threadCount,
        int blockDimension,
        int mode,
        int qualityLevel,
        boolean normalMap,
        boolean perceptual,
        ByteBuffer inputSwizzle
    ) {
        structSize(structSize);
        verbose(verbose);
        threadCount(threadCount);
        blockDimension(blockDimension);
        mode(mode);
        qualityLevel(qualityLevel);
        normalMap(normalMap);
        perceptual(perceptual);
        inputSwizzle(inputSwizzle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ktxAstcParams set(ktxAstcParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ktxAstcParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ktxAstcParams malloc() {
        return new ktxAstcParams(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ktxAstcParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ktxAstcParams calloc() {
        return new ktxAstcParams(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ktxAstcParams} instance allocated with {@link BufferUtils}. */
    public static ktxAstcParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ktxAstcParams(memAddress(container), container);
    }

    /** Returns a new {@code ktxAstcParams} instance for the specified memory address. */
    public static ktxAstcParams create(long address) {
        return new ktxAstcParams(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxAstcParams createSafe(long address) {
        return address == NULL ? null : new ktxAstcParams(address, null);
    }

    /**
     * Returns a new {@link ktxAstcParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ktxAstcParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxAstcParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ktxAstcParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxAstcParams.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ktxAstcParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxAstcParams malloc(MemoryStack stack) {
        return new ktxAstcParams(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ktxAstcParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxAstcParams calloc(MemoryStack stack) {
        return new ktxAstcParams(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ktxAstcParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxAstcParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #structSize}. */
    public static int nstructSize(long struct) { return UNSAFE.getInt(null, struct + ktxAstcParams.STRUCTSIZE); }
    /** Unsafe version of {@link #verbose}. */
    public static boolean nverbose(long struct) { return UNSAFE.getByte(null, struct + ktxAstcParams.VERBOSE) != 0; }
    /** Unsafe version of {@link #threadCount}. */
    public static int nthreadCount(long struct) { return UNSAFE.getInt(null, struct + ktxAstcParams.THREADCOUNT); }
    /** Unsafe version of {@link #blockDimension}. */
    public static int nblockDimension(long struct) { return UNSAFE.getInt(null, struct + ktxAstcParams.BLOCKDIMENSION); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + ktxAstcParams.MODE); }
    /** Unsafe version of {@link #qualityLevel}. */
    public static int nqualityLevel(long struct) { return UNSAFE.getInt(null, struct + ktxAstcParams.QUALITYLEVEL); }
    /** Unsafe version of {@link #normalMap}. */
    public static boolean nnormalMap(long struct) { return UNSAFE.getByte(null, struct + ktxAstcParams.NORMALMAP) != 0; }
    /** Unsafe version of {@link #perceptual}. */
    public static boolean nperceptual(long struct) { return UNSAFE.getByte(null, struct + ktxAstcParams.PERCEPTUAL) != 0; }
    /** Unsafe version of {@link #inputSwizzle}. */
    public static ByteBuffer ninputSwizzle(long struct) { return memByteBuffer(struct + ktxAstcParams.INPUTSWIZZLE, 4); }
    /** Unsafe version of {@link #inputSwizzle(int) inputSwizzle}. */
    public static byte ninputSwizzle(long struct, int index) {
        return UNSAFE.getByte(null, struct + ktxAstcParams.INPUTSWIZZLE + check(index, 4) * 1);
    }

    /** Unsafe version of {@link #structSize(int) structSize}. */
    public static void nstructSize(long struct, int value) { UNSAFE.putInt(null, struct + ktxAstcParams.STRUCTSIZE, value); }
    /** Unsafe version of {@link #verbose(boolean) verbose}. */
    public static void nverbose(long struct, boolean value) { UNSAFE.putByte(null, struct + ktxAstcParams.VERBOSE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #threadCount(int) threadCount}. */
    public static void nthreadCount(long struct, int value) { UNSAFE.putInt(null, struct + ktxAstcParams.THREADCOUNT, value); }
    /** Unsafe version of {@link #blockDimension(int) blockDimension}. */
    public static void nblockDimension(long struct, int value) { UNSAFE.putInt(null, struct + ktxAstcParams.BLOCKDIMENSION, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + ktxAstcParams.MODE, value); }
    /** Unsafe version of {@link #qualityLevel(int) qualityLevel}. */
    public static void nqualityLevel(long struct, int value) { UNSAFE.putInt(null, struct + ktxAstcParams.QUALITYLEVEL, value); }
    /** Unsafe version of {@link #normalMap(boolean) normalMap}. */
    public static void nnormalMap(long struct, boolean value) { UNSAFE.putByte(null, struct + ktxAstcParams.NORMALMAP, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #perceptual(boolean) perceptual}. */
    public static void nperceptual(long struct, boolean value) { UNSAFE.putByte(null, struct + ktxAstcParams.PERCEPTUAL, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #inputSwizzle(ByteBuffer) inputSwizzle}. */
    public static void ninputSwizzle(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + ktxAstcParams.INPUTSWIZZLE, value.remaining() * 1);
    }
    /** Unsafe version of {@link #inputSwizzle(int, byte) inputSwizzle}. */
    public static void ninputSwizzle(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + ktxAstcParams.INPUTSWIZZLE + check(index, 4) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link ktxAstcParams} structs. */
    public static class Buffer extends StructBuffer<ktxAstcParams, Buffer> implements NativeResource {

        private static final ktxAstcParams ELEMENT_FACTORY = ktxAstcParams.create(-1L);

        /**
         * Creates a new {@code ktxAstcParams.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxAstcParams#SIZEOF}, and its mark will be undefined.</p>
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
        protected ktxAstcParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ktxAstcParams#structSize} field. */
        @NativeType("ktx_uint32_t")
        public int structSize() { return ktxAstcParams.nstructSize(address()); }
        /** @return the value of the {@link ktxAstcParams#verbose} field. */
        @NativeType("ktx_bool_t")
        public boolean verbose() { return ktxAstcParams.nverbose(address()); }
        /** @return the value of the {@link ktxAstcParams#threadCount} field. */
        @NativeType("ktx_uint32_t")
        public int threadCount() { return ktxAstcParams.nthreadCount(address()); }
        /** @return the value of the {@link ktxAstcParams#blockDimension} field. */
        @NativeType("ktx_uint32_t")
        public int blockDimension() { return ktxAstcParams.nblockDimension(address()); }
        /** @return the value of the {@link ktxAstcParams#mode} field. */
        @NativeType("ktx_uint32_t")
        public int mode() { return ktxAstcParams.nmode(address()); }
        /** @return the value of the {@link ktxAstcParams#qualityLevel} field. */
        @NativeType("ktx_uint32_t")
        public int qualityLevel() { return ktxAstcParams.nqualityLevel(address()); }
        /** @return the value of the {@link ktxAstcParams#normalMap} field. */
        @NativeType("ktx_bool_t")
        public boolean normalMap() { return ktxAstcParams.nnormalMap(address()); }
        /** @return the value of the {@link ktxAstcParams#perceptual} field. */
        @NativeType("ktx_bool_t")
        public boolean perceptual() { return ktxAstcParams.nperceptual(address()); }
        /** @return a {@link ByteBuffer} view of the {@link ktxAstcParams#inputSwizzle} field. */
        @NativeType("char[4]")
        public ByteBuffer inputSwizzle() { return ktxAstcParams.ninputSwizzle(address()); }
        /** @return the value at the specified index of the {@link ktxAstcParams#inputSwizzle} field. */
        @NativeType("char")
        public byte inputSwizzle(int index) { return ktxAstcParams.ninputSwizzle(address(), index); }

        /** Sets the specified value to the {@link ktxAstcParams#structSize} field. */
        public ktxAstcParams.Buffer structSize(@NativeType("ktx_uint32_t") int value) { ktxAstcParams.nstructSize(address(), value); return this; }
        /** Sets the specified value to the {@link ktxAstcParams#verbose} field. */
        public ktxAstcParams.Buffer verbose(@NativeType("ktx_bool_t") boolean value) { ktxAstcParams.nverbose(address(), value); return this; }
        /** Sets the specified value to the {@link ktxAstcParams#threadCount} field. */
        public ktxAstcParams.Buffer threadCount(@NativeType("ktx_uint32_t") int value) { ktxAstcParams.nthreadCount(address(), value); return this; }
        /** Sets the specified value to the {@link ktxAstcParams#blockDimension} field. */
        public ktxAstcParams.Buffer blockDimension(@NativeType("ktx_uint32_t") int value) { ktxAstcParams.nblockDimension(address(), value); return this; }
        /** Sets the specified value to the {@link ktxAstcParams#mode} field. */
        public ktxAstcParams.Buffer mode(@NativeType("ktx_uint32_t") int value) { ktxAstcParams.nmode(address(), value); return this; }
        /** Sets the specified value to the {@link ktxAstcParams#qualityLevel} field. */
        public ktxAstcParams.Buffer qualityLevel(@NativeType("ktx_uint32_t") int value) { ktxAstcParams.nqualityLevel(address(), value); return this; }
        /** Sets the specified value to the {@link ktxAstcParams#normalMap} field. */
        public ktxAstcParams.Buffer normalMap(@NativeType("ktx_bool_t") boolean value) { ktxAstcParams.nnormalMap(address(), value); return this; }
        /** Sets the specified value to the {@link ktxAstcParams#perceptual} field. */
        public ktxAstcParams.Buffer perceptual(@NativeType("ktx_bool_t") boolean value) { ktxAstcParams.nperceptual(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link ktxAstcParams#inputSwizzle} field. */
        public ktxAstcParams.Buffer inputSwizzle(@NativeType("char[4]") ByteBuffer value) { ktxAstcParams.ninputSwizzle(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link ktxAstcParams#inputSwizzle} field. */
        public ktxAstcParams.Buffer inputSwizzle(int index, @NativeType("char") byte value) { ktxAstcParams.ninputSwizzle(address(), index, value); return this; }

    }

}