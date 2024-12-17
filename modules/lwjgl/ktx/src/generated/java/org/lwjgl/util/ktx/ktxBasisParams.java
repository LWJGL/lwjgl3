/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ktxBasisParams {
 *     ktx_uint32_t structSize;
 *     ktx_bool_t uastc;
 *     ktx_bool_t verbose;
 *     ktx_bool_t noSSE;
 *     ktx_uint32_t threadCount;
 *     ktx_uint32_t compressionLevel;
 *     ktx_uint32_t qualityLevel;
 *     ktx_uint32_t maxEndpoints;
 *     float endpointRDOThreshold;
 *     ktx_uint32_t maxSelectors;
 *     float selectorRDOThreshold;
 *     char inputSwizzle[4];
 *     ktx_bool_t normalMap;
 *     ktx_bool_t separateRGToRGB_A;
 *     ktx_bool_t preSwizzle;
 *     ktx_bool_t noEndpointRDO;
 *     ktx_bool_t noSelectorRDO;
 *     ktx_pack_uastc_flags uastcFlags;
 *     ktx_bool_t uastcRDO;
 *     float uastcRDOQualityScalar;
 *     ktx_uint32_t uastcRDODictSize;
 *     float uastcRDOMaxSmoothBlockErrorScale;
 *     float uastcRDOMaxSmoothBlockStdDev;
 *     ktx_bool_t uastcRDODontFavorSimplerModes;
 *     ktx_bool_t uastcRDONoMultithreading;
 * }}</pre>
 */
public class ktxBasisParams extends Struct<ktxBasisParams> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STRUCTSIZE,
        UASTC,
        VERBOSE,
        NOSSE,
        THREADCOUNT,
        COMPRESSIONLEVEL,
        QUALITYLEVEL,
        MAXENDPOINTS,
        ENDPOINTRDOTHRESHOLD,
        MAXSELECTORS,
        SELECTORRDOTHRESHOLD,
        INPUTSWIZZLE,
        NORMALMAP,
        SEPARATERGTORGB_A,
        PRESWIZZLE,
        NOENDPOINTRDO,
        NOSELECTORRDO,
        UASTCFLAGS,
        UASTCRDO,
        UASTCRDOQUALITYSCALAR,
        UASTCRDODICTSIZE,
        UASTCRDOMAXSMOOTHBLOCKERRORSCALE,
        UASTCRDOMAXSMOOTHBLOCKSTDDEV,
        UASTCRDODONTFAVORSIMPLERMODES,
        UASTCRDONOMULTITHREADING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(1, 4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STRUCTSIZE = layout.offsetof(0);
        UASTC = layout.offsetof(1);
        VERBOSE = layout.offsetof(2);
        NOSSE = layout.offsetof(3);
        THREADCOUNT = layout.offsetof(4);
        COMPRESSIONLEVEL = layout.offsetof(5);
        QUALITYLEVEL = layout.offsetof(6);
        MAXENDPOINTS = layout.offsetof(7);
        ENDPOINTRDOTHRESHOLD = layout.offsetof(8);
        MAXSELECTORS = layout.offsetof(9);
        SELECTORRDOTHRESHOLD = layout.offsetof(10);
        INPUTSWIZZLE = layout.offsetof(11);
        NORMALMAP = layout.offsetof(12);
        SEPARATERGTORGB_A = layout.offsetof(13);
        PRESWIZZLE = layout.offsetof(14);
        NOENDPOINTRDO = layout.offsetof(15);
        NOSELECTORRDO = layout.offsetof(16);
        UASTCFLAGS = layout.offsetof(17);
        UASTCRDO = layout.offsetof(18);
        UASTCRDOQUALITYSCALAR = layout.offsetof(19);
        UASTCRDODICTSIZE = layout.offsetof(20);
        UASTCRDOMAXSMOOTHBLOCKERRORSCALE = layout.offsetof(21);
        UASTCRDOMAXSMOOTHBLOCKSTDDEV = layout.offsetof(22);
        UASTCRDODONTFAVORSIMPLERMODES = layout.offsetof(23);
        UASTCRDONOMULTITHREADING = layout.offsetof(24);
    }

    protected ktxBasisParams(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxBasisParams create(long address, @Nullable ByteBuffer container) {
        return new ktxBasisParams(address, container);
    }

    /**
     * Creates a {@code ktxBasisParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxBasisParams(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code structSize} field. */
    @NativeType("ktx_uint32_t")
    public int structSize() { return nstructSize(address()); }
    /** @return the value of the {@code uastc} field. */
    @NativeType("ktx_bool_t")
    public boolean uastc() { return nuastc(address()); }
    /** @return the value of the {@code verbose} field. */
    @NativeType("ktx_bool_t")
    public boolean verbose() { return nverbose(address()); }
    /** @return the value of the {@code noSSE} field. */
    @NativeType("ktx_bool_t")
    public boolean noSSE() { return nnoSSE(address()); }
    /** @return the value of the {@code threadCount} field. */
    @NativeType("ktx_uint32_t")
    public int threadCount() { return nthreadCount(address()); }
    /** @return the value of the {@code compressionLevel} field. */
    @NativeType("ktx_uint32_t")
    public int compressionLevel() { return ncompressionLevel(address()); }
    /** @return the value of the {@code qualityLevel} field. */
    @NativeType("ktx_uint32_t")
    public int qualityLevel() { return nqualityLevel(address()); }
    /** @return the value of the {@code maxEndpoints} field. */
    @NativeType("ktx_uint32_t")
    public int maxEndpoints() { return nmaxEndpoints(address()); }
    /** @return the value of the {@code endpointRDOThreshold} field. */
    public float endpointRDOThreshold() { return nendpointRDOThreshold(address()); }
    /** @return the value of the {@code maxSelectors} field. */
    @NativeType("ktx_uint32_t")
    public int maxSelectors() { return nmaxSelectors(address()); }
    /** @return the value of the {@code selectorRDOThreshold} field. */
    public float selectorRDOThreshold() { return nselectorRDOThreshold(address()); }
    /** @return a {@link ByteBuffer} view of the {@code inputSwizzle} field. */
    @NativeType("char[4]")
    public ByteBuffer inputSwizzle() { return ninputSwizzle(address()); }
    /** @return the value at the specified index of the {@code inputSwizzle} field. */
    @NativeType("char")
    public byte inputSwizzle(int index) { return ninputSwizzle(address(), index); }
    /** @return the value of the {@code normalMap} field. */
    @NativeType("ktx_bool_t")
    public boolean normalMap() { return nnormalMap(address()); }
    /** @return the value of the {@code separateRGToRGB_A} field. */
    @NativeType("ktx_bool_t")
    public boolean separateRGToRGB_A() { return nseparateRGToRGB_A(address()); }
    /** @return the value of the {@code preSwizzle} field. */
    @NativeType("ktx_bool_t")
    public boolean preSwizzle() { return npreSwizzle(address()); }
    /** @return the value of the {@code noEndpointRDO} field. */
    @NativeType("ktx_bool_t")
    public boolean noEndpointRDO() { return nnoEndpointRDO(address()); }
    /** @return the value of the {@code noSelectorRDO} field. */
    @NativeType("ktx_bool_t")
    public boolean noSelectorRDO() { return nnoSelectorRDO(address()); }
    /** @return the value of the {@code uastcFlags} field. */
    @NativeType("ktx_pack_uastc_flags")
    public int uastcFlags() { return nuastcFlags(address()); }
    /** @return the value of the {@code uastcRDO} field. */
    @NativeType("ktx_bool_t")
    public boolean uastcRDO() { return nuastcRDO(address()); }
    /** @return the value of the {@code uastcRDOQualityScalar} field. */
    public float uastcRDOQualityScalar() { return nuastcRDOQualityScalar(address()); }
    /** @return the value of the {@code uastcRDODictSize} field. */
    @NativeType("ktx_uint32_t")
    public int uastcRDODictSize() { return nuastcRDODictSize(address()); }
    /** @return the value of the {@code uastcRDOMaxSmoothBlockErrorScale} field. */
    public float uastcRDOMaxSmoothBlockErrorScale() { return nuastcRDOMaxSmoothBlockErrorScale(address()); }
    /** @return the value of the {@code uastcRDOMaxSmoothBlockStdDev} field. */
    public float uastcRDOMaxSmoothBlockStdDev() { return nuastcRDOMaxSmoothBlockStdDev(address()); }
    /** @return the value of the {@code uastcRDODontFavorSimplerModes} field. */
    @NativeType("ktx_bool_t")
    public boolean uastcRDODontFavorSimplerModes() { return nuastcRDODontFavorSimplerModes(address()); }
    /** @return the value of the {@code uastcRDONoMultithreading} field. */
    @NativeType("ktx_bool_t")
    public boolean uastcRDONoMultithreading() { return nuastcRDONoMultithreading(address()); }

    /** Sets the specified value to the {@code structSize} field. */
    public ktxBasisParams structSize(@NativeType("ktx_uint32_t") int value) { nstructSize(address(), value); return this; }
    /** Sets the specified value to the {@code uastc} field. */
    public ktxBasisParams uastc(@NativeType("ktx_bool_t") boolean value) { nuastc(address(), value); return this; }
    /** Sets the specified value to the {@code verbose} field. */
    public ktxBasisParams verbose(@NativeType("ktx_bool_t") boolean value) { nverbose(address(), value); return this; }
    /** Sets the specified value to the {@code noSSE} field. */
    public ktxBasisParams noSSE(@NativeType("ktx_bool_t") boolean value) { nnoSSE(address(), value); return this; }
    /** Sets the specified value to the {@code threadCount} field. */
    public ktxBasisParams threadCount(@NativeType("ktx_uint32_t") int value) { nthreadCount(address(), value); return this; }
    /** Sets the specified value to the {@code compressionLevel} field. */
    public ktxBasisParams compressionLevel(@NativeType("ktx_uint32_t") int value) { ncompressionLevel(address(), value); return this; }
    /** Sets the specified value to the {@code qualityLevel} field. */
    public ktxBasisParams qualityLevel(@NativeType("ktx_uint32_t") int value) { nqualityLevel(address(), value); return this; }
    /** Sets the specified value to the {@code maxEndpoints} field. */
    public ktxBasisParams maxEndpoints(@NativeType("ktx_uint32_t") int value) { nmaxEndpoints(address(), value); return this; }
    /** Sets the specified value to the {@code endpointRDOThreshold} field. */
    public ktxBasisParams endpointRDOThreshold(float value) { nendpointRDOThreshold(address(), value); return this; }
    /** Sets the specified value to the {@code maxSelectors} field. */
    public ktxBasisParams maxSelectors(@NativeType("ktx_uint32_t") int value) { nmaxSelectors(address(), value); return this; }
    /** Sets the specified value to the {@code selectorRDOThreshold} field. */
    public ktxBasisParams selectorRDOThreshold(float value) { nselectorRDOThreshold(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code inputSwizzle} field. */
    public ktxBasisParams inputSwizzle(@NativeType("char[4]") ByteBuffer value) { ninputSwizzle(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code inputSwizzle} field. */
    public ktxBasisParams inputSwizzle(int index, @NativeType("char") byte value) { ninputSwizzle(address(), index, value); return this; }
    /** Sets the specified value to the {@code normalMap} field. */
    public ktxBasisParams normalMap(@NativeType("ktx_bool_t") boolean value) { nnormalMap(address(), value); return this; }
    /** Sets the specified value to the {@code separateRGToRGB_A} field. */
    public ktxBasisParams separateRGToRGB_A(@NativeType("ktx_bool_t") boolean value) { nseparateRGToRGB_A(address(), value); return this; }
    /** Sets the specified value to the {@code preSwizzle} field. */
    public ktxBasisParams preSwizzle(@NativeType("ktx_bool_t") boolean value) { npreSwizzle(address(), value); return this; }
    /** Sets the specified value to the {@code noEndpointRDO} field. */
    public ktxBasisParams noEndpointRDO(@NativeType("ktx_bool_t") boolean value) { nnoEndpointRDO(address(), value); return this; }
    /** Sets the specified value to the {@code noSelectorRDO} field. */
    public ktxBasisParams noSelectorRDO(@NativeType("ktx_bool_t") boolean value) { nnoSelectorRDO(address(), value); return this; }
    /** Sets the specified value to the {@code uastcFlags} field. */
    public ktxBasisParams uastcFlags(@NativeType("ktx_pack_uastc_flags") int value) { nuastcFlags(address(), value); return this; }
    /** Sets the specified value to the {@code uastcRDO} field. */
    public ktxBasisParams uastcRDO(@NativeType("ktx_bool_t") boolean value) { nuastcRDO(address(), value); return this; }
    /** Sets the specified value to the {@code uastcRDOQualityScalar} field. */
    public ktxBasisParams uastcRDOQualityScalar(float value) { nuastcRDOQualityScalar(address(), value); return this; }
    /** Sets the specified value to the {@code uastcRDODictSize} field. */
    public ktxBasisParams uastcRDODictSize(@NativeType("ktx_uint32_t") int value) { nuastcRDODictSize(address(), value); return this; }
    /** Sets the specified value to the {@code uastcRDOMaxSmoothBlockErrorScale} field. */
    public ktxBasisParams uastcRDOMaxSmoothBlockErrorScale(float value) { nuastcRDOMaxSmoothBlockErrorScale(address(), value); return this; }
    /** Sets the specified value to the {@code uastcRDOMaxSmoothBlockStdDev} field. */
    public ktxBasisParams uastcRDOMaxSmoothBlockStdDev(float value) { nuastcRDOMaxSmoothBlockStdDev(address(), value); return this; }
    /** Sets the specified value to the {@code uastcRDODontFavorSimplerModes} field. */
    public ktxBasisParams uastcRDODontFavorSimplerModes(@NativeType("ktx_bool_t") boolean value) { nuastcRDODontFavorSimplerModes(address(), value); return this; }
    /** Sets the specified value to the {@code uastcRDONoMultithreading} field. */
    public ktxBasisParams uastcRDONoMultithreading(@NativeType("ktx_bool_t") boolean value) { nuastcRDONoMultithreading(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ktxBasisParams set(
        int structSize,
        boolean uastc,
        boolean verbose,
        boolean noSSE,
        int threadCount,
        int compressionLevel,
        int qualityLevel,
        int maxEndpoints,
        float endpointRDOThreshold,
        int maxSelectors,
        float selectorRDOThreshold,
        ByteBuffer inputSwizzle,
        boolean normalMap,
        boolean separateRGToRGB_A,
        boolean preSwizzle,
        boolean noEndpointRDO,
        boolean noSelectorRDO,
        int uastcFlags,
        boolean uastcRDO,
        float uastcRDOQualityScalar,
        int uastcRDODictSize,
        float uastcRDOMaxSmoothBlockErrorScale,
        float uastcRDOMaxSmoothBlockStdDev,
        boolean uastcRDODontFavorSimplerModes,
        boolean uastcRDONoMultithreading
    ) {
        structSize(structSize);
        uastc(uastc);
        verbose(verbose);
        noSSE(noSSE);
        threadCount(threadCount);
        compressionLevel(compressionLevel);
        qualityLevel(qualityLevel);
        maxEndpoints(maxEndpoints);
        endpointRDOThreshold(endpointRDOThreshold);
        maxSelectors(maxSelectors);
        selectorRDOThreshold(selectorRDOThreshold);
        inputSwizzle(inputSwizzle);
        normalMap(normalMap);
        separateRGToRGB_A(separateRGToRGB_A);
        preSwizzle(preSwizzle);
        noEndpointRDO(noEndpointRDO);
        noSelectorRDO(noSelectorRDO);
        uastcFlags(uastcFlags);
        uastcRDO(uastcRDO);
        uastcRDOQualityScalar(uastcRDOQualityScalar);
        uastcRDODictSize(uastcRDODictSize);
        uastcRDOMaxSmoothBlockErrorScale(uastcRDOMaxSmoothBlockErrorScale);
        uastcRDOMaxSmoothBlockStdDev(uastcRDOMaxSmoothBlockStdDev);
        uastcRDODontFavorSimplerModes(uastcRDODontFavorSimplerModes);
        uastcRDONoMultithreading(uastcRDONoMultithreading);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ktxBasisParams set(ktxBasisParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ktxBasisParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ktxBasisParams malloc() {
        return new ktxBasisParams(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ktxBasisParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ktxBasisParams calloc() {
        return new ktxBasisParams(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ktxBasisParams} instance allocated with {@link BufferUtils}. */
    public static ktxBasisParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ktxBasisParams(memAddress(container), container);
    }

    /** Returns a new {@code ktxBasisParams} instance for the specified memory address. */
    public static ktxBasisParams create(long address) {
        return new ktxBasisParams(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ktxBasisParams createSafe(long address) {
        return address == NULL ? null : new ktxBasisParams(address, null);
    }

    /**
     * Returns a new {@link ktxBasisParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxBasisParams.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ktxBasisParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxBasisParams.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxBasisParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ktxBasisParams.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ktxBasisParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxBasisParams.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ktxBasisParams.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ktxBasisParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxBasisParams malloc(MemoryStack stack) {
        return new ktxBasisParams(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ktxBasisParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxBasisParams calloc(MemoryStack stack) {
        return new ktxBasisParams(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ktxBasisParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxBasisParams.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxBasisParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxBasisParams.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #structSize}. */
    public static int nstructSize(long struct) { return memGetInt(struct + ktxBasisParams.STRUCTSIZE); }
    /** Unsafe version of {@link #uastc}. */
    public static boolean nuastc(long struct) { return memGetByte(struct + ktxBasisParams.UASTC) != 0; }
    /** Unsafe version of {@link #verbose}. */
    public static boolean nverbose(long struct) { return memGetByte(struct + ktxBasisParams.VERBOSE) != 0; }
    /** Unsafe version of {@link #noSSE}. */
    public static boolean nnoSSE(long struct) { return memGetByte(struct + ktxBasisParams.NOSSE) != 0; }
    /** Unsafe version of {@link #threadCount}. */
    public static int nthreadCount(long struct) { return memGetInt(struct + ktxBasisParams.THREADCOUNT); }
    /** Unsafe version of {@link #compressionLevel}. */
    public static int ncompressionLevel(long struct) { return memGetInt(struct + ktxBasisParams.COMPRESSIONLEVEL); }
    /** Unsafe version of {@link #qualityLevel}. */
    public static int nqualityLevel(long struct) { return memGetInt(struct + ktxBasisParams.QUALITYLEVEL); }
    /** Unsafe version of {@link #maxEndpoints}. */
    public static int nmaxEndpoints(long struct) { return memGetInt(struct + ktxBasisParams.MAXENDPOINTS); }
    /** Unsafe version of {@link #endpointRDOThreshold}. */
    public static float nendpointRDOThreshold(long struct) { return memGetFloat(struct + ktxBasisParams.ENDPOINTRDOTHRESHOLD); }
    /** Unsafe version of {@link #maxSelectors}. */
    public static int nmaxSelectors(long struct) { return memGetInt(struct + ktxBasisParams.MAXSELECTORS); }
    /** Unsafe version of {@link #selectorRDOThreshold}. */
    public static float nselectorRDOThreshold(long struct) { return memGetFloat(struct + ktxBasisParams.SELECTORRDOTHRESHOLD); }
    /** Unsafe version of {@link #inputSwizzle}. */
    public static ByteBuffer ninputSwizzle(long struct) { return memByteBuffer(struct + ktxBasisParams.INPUTSWIZZLE, 4); }
    /** Unsafe version of {@link #inputSwizzle(int) inputSwizzle}. */
    public static byte ninputSwizzle(long struct, int index) {
        return memGetByte(struct + ktxBasisParams.INPUTSWIZZLE + check(index, 4) * 1);
    }
    /** Unsafe version of {@link #normalMap}. */
    public static boolean nnormalMap(long struct) { return memGetByte(struct + ktxBasisParams.NORMALMAP) != 0; }
    /** Unsafe version of {@link #separateRGToRGB_A}. */
    public static boolean nseparateRGToRGB_A(long struct) { return memGetByte(struct + ktxBasisParams.SEPARATERGTORGB_A) != 0; }
    /** Unsafe version of {@link #preSwizzle}. */
    public static boolean npreSwizzle(long struct) { return memGetByte(struct + ktxBasisParams.PRESWIZZLE) != 0; }
    /** Unsafe version of {@link #noEndpointRDO}. */
    public static boolean nnoEndpointRDO(long struct) { return memGetByte(struct + ktxBasisParams.NOENDPOINTRDO) != 0; }
    /** Unsafe version of {@link #noSelectorRDO}. */
    public static boolean nnoSelectorRDO(long struct) { return memGetByte(struct + ktxBasisParams.NOSELECTORRDO) != 0; }
    /** Unsafe version of {@link #uastcFlags}. */
    public static int nuastcFlags(long struct) { return memGetInt(struct + ktxBasisParams.UASTCFLAGS); }
    /** Unsafe version of {@link #uastcRDO}. */
    public static boolean nuastcRDO(long struct) { return memGetByte(struct + ktxBasisParams.UASTCRDO) != 0; }
    /** Unsafe version of {@link #uastcRDOQualityScalar}. */
    public static float nuastcRDOQualityScalar(long struct) { return memGetFloat(struct + ktxBasisParams.UASTCRDOQUALITYSCALAR); }
    /** Unsafe version of {@link #uastcRDODictSize}. */
    public static int nuastcRDODictSize(long struct) { return memGetInt(struct + ktxBasisParams.UASTCRDODICTSIZE); }
    /** Unsafe version of {@link #uastcRDOMaxSmoothBlockErrorScale}. */
    public static float nuastcRDOMaxSmoothBlockErrorScale(long struct) { return memGetFloat(struct + ktxBasisParams.UASTCRDOMAXSMOOTHBLOCKERRORSCALE); }
    /** Unsafe version of {@link #uastcRDOMaxSmoothBlockStdDev}. */
    public static float nuastcRDOMaxSmoothBlockStdDev(long struct) { return memGetFloat(struct + ktxBasisParams.UASTCRDOMAXSMOOTHBLOCKSTDDEV); }
    /** Unsafe version of {@link #uastcRDODontFavorSimplerModes}. */
    public static boolean nuastcRDODontFavorSimplerModes(long struct) { return memGetByte(struct + ktxBasisParams.UASTCRDODONTFAVORSIMPLERMODES) != 0; }
    /** Unsafe version of {@link #uastcRDONoMultithreading}. */
    public static boolean nuastcRDONoMultithreading(long struct) { return memGetByte(struct + ktxBasisParams.UASTCRDONOMULTITHREADING) != 0; }

    /** Unsafe version of {@link #structSize(int) structSize}. */
    public static void nstructSize(long struct, int value) { memPutInt(struct + ktxBasisParams.STRUCTSIZE, value); }
    /** Unsafe version of {@link #uastc(boolean) uastc}. */
    public static void nuastc(long struct, boolean value) { memPutByte(struct + ktxBasisParams.UASTC, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #verbose(boolean) verbose}. */
    public static void nverbose(long struct, boolean value) { memPutByte(struct + ktxBasisParams.VERBOSE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #noSSE(boolean) noSSE}. */
    public static void nnoSSE(long struct, boolean value) { memPutByte(struct + ktxBasisParams.NOSSE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #threadCount(int) threadCount}. */
    public static void nthreadCount(long struct, int value) { memPutInt(struct + ktxBasisParams.THREADCOUNT, value); }
    /** Unsafe version of {@link #compressionLevel(int) compressionLevel}. */
    public static void ncompressionLevel(long struct, int value) { memPutInt(struct + ktxBasisParams.COMPRESSIONLEVEL, value); }
    /** Unsafe version of {@link #qualityLevel(int) qualityLevel}. */
    public static void nqualityLevel(long struct, int value) { memPutInt(struct + ktxBasisParams.QUALITYLEVEL, value); }
    /** Unsafe version of {@link #maxEndpoints(int) maxEndpoints}. */
    public static void nmaxEndpoints(long struct, int value) { memPutInt(struct + ktxBasisParams.MAXENDPOINTS, value); }
    /** Unsafe version of {@link #endpointRDOThreshold(float) endpointRDOThreshold}. */
    public static void nendpointRDOThreshold(long struct, float value) { memPutFloat(struct + ktxBasisParams.ENDPOINTRDOTHRESHOLD, value); }
    /** Unsafe version of {@link #maxSelectors(int) maxSelectors}. */
    public static void nmaxSelectors(long struct, int value) { memPutInt(struct + ktxBasisParams.MAXSELECTORS, value); }
    /** Unsafe version of {@link #selectorRDOThreshold(float) selectorRDOThreshold}. */
    public static void nselectorRDOThreshold(long struct, float value) { memPutFloat(struct + ktxBasisParams.SELECTORRDOTHRESHOLD, value); }
    /** Unsafe version of {@link #inputSwizzle(ByteBuffer) inputSwizzle}. */
    public static void ninputSwizzle(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + ktxBasisParams.INPUTSWIZZLE, value.remaining() * 1);
    }
    /** Unsafe version of {@link #inputSwizzle(int, byte) inputSwizzle}. */
    public static void ninputSwizzle(long struct, int index, byte value) {
        memPutByte(struct + ktxBasisParams.INPUTSWIZZLE + check(index, 4) * 1, value);
    }
    /** Unsafe version of {@link #normalMap(boolean) normalMap}. */
    public static void nnormalMap(long struct, boolean value) { memPutByte(struct + ktxBasisParams.NORMALMAP, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #separateRGToRGB_A(boolean) separateRGToRGB_A}. */
    public static void nseparateRGToRGB_A(long struct, boolean value) { memPutByte(struct + ktxBasisParams.SEPARATERGTORGB_A, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #preSwizzle(boolean) preSwizzle}. */
    public static void npreSwizzle(long struct, boolean value) { memPutByte(struct + ktxBasisParams.PRESWIZZLE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #noEndpointRDO(boolean) noEndpointRDO}. */
    public static void nnoEndpointRDO(long struct, boolean value) { memPutByte(struct + ktxBasisParams.NOENDPOINTRDO, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #noSelectorRDO(boolean) noSelectorRDO}. */
    public static void nnoSelectorRDO(long struct, boolean value) { memPutByte(struct + ktxBasisParams.NOSELECTORRDO, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #uastcFlags(int) uastcFlags}. */
    public static void nuastcFlags(long struct, int value) { memPutInt(struct + ktxBasisParams.UASTCFLAGS, value); }
    /** Unsafe version of {@link #uastcRDO(boolean) uastcRDO}. */
    public static void nuastcRDO(long struct, boolean value) { memPutByte(struct + ktxBasisParams.UASTCRDO, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #uastcRDOQualityScalar(float) uastcRDOQualityScalar}. */
    public static void nuastcRDOQualityScalar(long struct, float value) { memPutFloat(struct + ktxBasisParams.UASTCRDOQUALITYSCALAR, value); }
    /** Unsafe version of {@link #uastcRDODictSize(int) uastcRDODictSize}. */
    public static void nuastcRDODictSize(long struct, int value) { memPutInt(struct + ktxBasisParams.UASTCRDODICTSIZE, value); }
    /** Unsafe version of {@link #uastcRDOMaxSmoothBlockErrorScale(float) uastcRDOMaxSmoothBlockErrorScale}. */
    public static void nuastcRDOMaxSmoothBlockErrorScale(long struct, float value) { memPutFloat(struct + ktxBasisParams.UASTCRDOMAXSMOOTHBLOCKERRORSCALE, value); }
    /** Unsafe version of {@link #uastcRDOMaxSmoothBlockStdDev(float) uastcRDOMaxSmoothBlockStdDev}. */
    public static void nuastcRDOMaxSmoothBlockStdDev(long struct, float value) { memPutFloat(struct + ktxBasisParams.UASTCRDOMAXSMOOTHBLOCKSTDDEV, value); }
    /** Unsafe version of {@link #uastcRDODontFavorSimplerModes(boolean) uastcRDODontFavorSimplerModes}. */
    public static void nuastcRDODontFavorSimplerModes(long struct, boolean value) { memPutByte(struct + ktxBasisParams.UASTCRDODONTFAVORSIMPLERMODES, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #uastcRDONoMultithreading(boolean) uastcRDONoMultithreading}. */
    public static void nuastcRDONoMultithreading(long struct, boolean value) { memPutByte(struct + ktxBasisParams.UASTCRDONOMULTITHREADING, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link ktxBasisParams} structs. */
    public static class Buffer extends StructBuffer<ktxBasisParams, Buffer> implements NativeResource {

        private static final ktxBasisParams ELEMENT_FACTORY = ktxBasisParams.create(-1L);

        /**
         * Creates a new {@code ktxBasisParams.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxBasisParams#SIZEOF}, and its mark will be undefined.</p>
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
        protected ktxBasisParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code structSize} field. */
        @NativeType("ktx_uint32_t")
        public int structSize() { return ktxBasisParams.nstructSize(address()); }
        /** @return the value of the {@code uastc} field. */
        @NativeType("ktx_bool_t")
        public boolean uastc() { return ktxBasisParams.nuastc(address()); }
        /** @return the value of the {@code verbose} field. */
        @NativeType("ktx_bool_t")
        public boolean verbose() { return ktxBasisParams.nverbose(address()); }
        /** @return the value of the {@code noSSE} field. */
        @NativeType("ktx_bool_t")
        public boolean noSSE() { return ktxBasisParams.nnoSSE(address()); }
        /** @return the value of the {@code threadCount} field. */
        @NativeType("ktx_uint32_t")
        public int threadCount() { return ktxBasisParams.nthreadCount(address()); }
        /** @return the value of the {@code compressionLevel} field. */
        @NativeType("ktx_uint32_t")
        public int compressionLevel() { return ktxBasisParams.ncompressionLevel(address()); }
        /** @return the value of the {@code qualityLevel} field. */
        @NativeType("ktx_uint32_t")
        public int qualityLevel() { return ktxBasisParams.nqualityLevel(address()); }
        /** @return the value of the {@code maxEndpoints} field. */
        @NativeType("ktx_uint32_t")
        public int maxEndpoints() { return ktxBasisParams.nmaxEndpoints(address()); }
        /** @return the value of the {@code endpointRDOThreshold} field. */
        public float endpointRDOThreshold() { return ktxBasisParams.nendpointRDOThreshold(address()); }
        /** @return the value of the {@code maxSelectors} field. */
        @NativeType("ktx_uint32_t")
        public int maxSelectors() { return ktxBasisParams.nmaxSelectors(address()); }
        /** @return the value of the {@code selectorRDOThreshold} field. */
        public float selectorRDOThreshold() { return ktxBasisParams.nselectorRDOThreshold(address()); }
        /** @return a {@link ByteBuffer} view of the {@code inputSwizzle} field. */
        @NativeType("char[4]")
        public ByteBuffer inputSwizzle() { return ktxBasisParams.ninputSwizzle(address()); }
        /** @return the value at the specified index of the {@code inputSwizzle} field. */
        @NativeType("char")
        public byte inputSwizzle(int index) { return ktxBasisParams.ninputSwizzle(address(), index); }
        /** @return the value of the {@code normalMap} field. */
        @NativeType("ktx_bool_t")
        public boolean normalMap() { return ktxBasisParams.nnormalMap(address()); }
        /** @return the value of the {@code separateRGToRGB_A} field. */
        @NativeType("ktx_bool_t")
        public boolean separateRGToRGB_A() { return ktxBasisParams.nseparateRGToRGB_A(address()); }
        /** @return the value of the {@code preSwizzle} field. */
        @NativeType("ktx_bool_t")
        public boolean preSwizzle() { return ktxBasisParams.npreSwizzle(address()); }
        /** @return the value of the {@code noEndpointRDO} field. */
        @NativeType("ktx_bool_t")
        public boolean noEndpointRDO() { return ktxBasisParams.nnoEndpointRDO(address()); }
        /** @return the value of the {@code noSelectorRDO} field. */
        @NativeType("ktx_bool_t")
        public boolean noSelectorRDO() { return ktxBasisParams.nnoSelectorRDO(address()); }
        /** @return the value of the {@code uastcFlags} field. */
        @NativeType("ktx_pack_uastc_flags")
        public int uastcFlags() { return ktxBasisParams.nuastcFlags(address()); }
        /** @return the value of the {@code uastcRDO} field. */
        @NativeType("ktx_bool_t")
        public boolean uastcRDO() { return ktxBasisParams.nuastcRDO(address()); }
        /** @return the value of the {@code uastcRDOQualityScalar} field. */
        public float uastcRDOQualityScalar() { return ktxBasisParams.nuastcRDOQualityScalar(address()); }
        /** @return the value of the {@code uastcRDODictSize} field. */
        @NativeType("ktx_uint32_t")
        public int uastcRDODictSize() { return ktxBasisParams.nuastcRDODictSize(address()); }
        /** @return the value of the {@code uastcRDOMaxSmoothBlockErrorScale} field. */
        public float uastcRDOMaxSmoothBlockErrorScale() { return ktxBasisParams.nuastcRDOMaxSmoothBlockErrorScale(address()); }
        /** @return the value of the {@code uastcRDOMaxSmoothBlockStdDev} field. */
        public float uastcRDOMaxSmoothBlockStdDev() { return ktxBasisParams.nuastcRDOMaxSmoothBlockStdDev(address()); }
        /** @return the value of the {@code uastcRDODontFavorSimplerModes} field. */
        @NativeType("ktx_bool_t")
        public boolean uastcRDODontFavorSimplerModes() { return ktxBasisParams.nuastcRDODontFavorSimplerModes(address()); }
        /** @return the value of the {@code uastcRDONoMultithreading} field. */
        @NativeType("ktx_bool_t")
        public boolean uastcRDONoMultithreading() { return ktxBasisParams.nuastcRDONoMultithreading(address()); }

        /** Sets the specified value to the {@code structSize} field. */
        public ktxBasisParams.Buffer structSize(@NativeType("ktx_uint32_t") int value) { ktxBasisParams.nstructSize(address(), value); return this; }
        /** Sets the specified value to the {@code uastc} field. */
        public ktxBasisParams.Buffer uastc(@NativeType("ktx_bool_t") boolean value) { ktxBasisParams.nuastc(address(), value); return this; }
        /** Sets the specified value to the {@code verbose} field. */
        public ktxBasisParams.Buffer verbose(@NativeType("ktx_bool_t") boolean value) { ktxBasisParams.nverbose(address(), value); return this; }
        /** Sets the specified value to the {@code noSSE} field. */
        public ktxBasisParams.Buffer noSSE(@NativeType("ktx_bool_t") boolean value) { ktxBasisParams.nnoSSE(address(), value); return this; }
        /** Sets the specified value to the {@code threadCount} field. */
        public ktxBasisParams.Buffer threadCount(@NativeType("ktx_uint32_t") int value) { ktxBasisParams.nthreadCount(address(), value); return this; }
        /** Sets the specified value to the {@code compressionLevel} field. */
        public ktxBasisParams.Buffer compressionLevel(@NativeType("ktx_uint32_t") int value) { ktxBasisParams.ncompressionLevel(address(), value); return this; }
        /** Sets the specified value to the {@code qualityLevel} field. */
        public ktxBasisParams.Buffer qualityLevel(@NativeType("ktx_uint32_t") int value) { ktxBasisParams.nqualityLevel(address(), value); return this; }
        /** Sets the specified value to the {@code maxEndpoints} field. */
        public ktxBasisParams.Buffer maxEndpoints(@NativeType("ktx_uint32_t") int value) { ktxBasisParams.nmaxEndpoints(address(), value); return this; }
        /** Sets the specified value to the {@code endpointRDOThreshold} field. */
        public ktxBasisParams.Buffer endpointRDOThreshold(float value) { ktxBasisParams.nendpointRDOThreshold(address(), value); return this; }
        /** Sets the specified value to the {@code maxSelectors} field. */
        public ktxBasisParams.Buffer maxSelectors(@NativeType("ktx_uint32_t") int value) { ktxBasisParams.nmaxSelectors(address(), value); return this; }
        /** Sets the specified value to the {@code selectorRDOThreshold} field. */
        public ktxBasisParams.Buffer selectorRDOThreshold(float value) { ktxBasisParams.nselectorRDOThreshold(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code inputSwizzle} field. */
        public ktxBasisParams.Buffer inputSwizzle(@NativeType("char[4]") ByteBuffer value) { ktxBasisParams.ninputSwizzle(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code inputSwizzle} field. */
        public ktxBasisParams.Buffer inputSwizzle(int index, @NativeType("char") byte value) { ktxBasisParams.ninputSwizzle(address(), index, value); return this; }
        /** Sets the specified value to the {@code normalMap} field. */
        public ktxBasisParams.Buffer normalMap(@NativeType("ktx_bool_t") boolean value) { ktxBasisParams.nnormalMap(address(), value); return this; }
        /** Sets the specified value to the {@code separateRGToRGB_A} field. */
        public ktxBasisParams.Buffer separateRGToRGB_A(@NativeType("ktx_bool_t") boolean value) { ktxBasisParams.nseparateRGToRGB_A(address(), value); return this; }
        /** Sets the specified value to the {@code preSwizzle} field. */
        public ktxBasisParams.Buffer preSwizzle(@NativeType("ktx_bool_t") boolean value) { ktxBasisParams.npreSwizzle(address(), value); return this; }
        /** Sets the specified value to the {@code noEndpointRDO} field. */
        public ktxBasisParams.Buffer noEndpointRDO(@NativeType("ktx_bool_t") boolean value) { ktxBasisParams.nnoEndpointRDO(address(), value); return this; }
        /** Sets the specified value to the {@code noSelectorRDO} field. */
        public ktxBasisParams.Buffer noSelectorRDO(@NativeType("ktx_bool_t") boolean value) { ktxBasisParams.nnoSelectorRDO(address(), value); return this; }
        /** Sets the specified value to the {@code uastcFlags} field. */
        public ktxBasisParams.Buffer uastcFlags(@NativeType("ktx_pack_uastc_flags") int value) { ktxBasisParams.nuastcFlags(address(), value); return this; }
        /** Sets the specified value to the {@code uastcRDO} field. */
        public ktxBasisParams.Buffer uastcRDO(@NativeType("ktx_bool_t") boolean value) { ktxBasisParams.nuastcRDO(address(), value); return this; }
        /** Sets the specified value to the {@code uastcRDOQualityScalar} field. */
        public ktxBasisParams.Buffer uastcRDOQualityScalar(float value) { ktxBasisParams.nuastcRDOQualityScalar(address(), value); return this; }
        /** Sets the specified value to the {@code uastcRDODictSize} field. */
        public ktxBasisParams.Buffer uastcRDODictSize(@NativeType("ktx_uint32_t") int value) { ktxBasisParams.nuastcRDODictSize(address(), value); return this; }
        /** Sets the specified value to the {@code uastcRDOMaxSmoothBlockErrorScale} field. */
        public ktxBasisParams.Buffer uastcRDOMaxSmoothBlockErrorScale(float value) { ktxBasisParams.nuastcRDOMaxSmoothBlockErrorScale(address(), value); return this; }
        /** Sets the specified value to the {@code uastcRDOMaxSmoothBlockStdDev} field. */
        public ktxBasisParams.Buffer uastcRDOMaxSmoothBlockStdDev(float value) { ktxBasisParams.nuastcRDOMaxSmoothBlockStdDev(address(), value); return this; }
        /** Sets the specified value to the {@code uastcRDODontFavorSimplerModes} field. */
        public ktxBasisParams.Buffer uastcRDODontFavorSimplerModes(@NativeType("ktx_bool_t") boolean value) { ktxBasisParams.nuastcRDODontFavorSimplerModes(address(), value); return this; }
        /** Sets the specified value to the {@code uastcRDONoMultithreading} field. */
        public ktxBasisParams.Buffer uastcRDONoMultithreading(@NativeType("ktx_bool_t") boolean value) { ktxBasisParams.nuastcRDONoMultithreading(address(), value); return this; }

    }

}