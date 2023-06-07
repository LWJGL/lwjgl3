/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the pixel format of a drawing surface.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct PIXELFORMATDESCRIPTOR {
 *     WORD {@link #nSize};
 *     WORD {@link #nVersion};
 *     DWORD {@link #dwFlags};
 *     BYTE {@link #iPixelType};
 *     BYTE {@link #cColorBits};
 *     BYTE {@link #cRedBits};
 *     BYTE {@link #cRedShift};
 *     BYTE {@link #cGreenBits};
 *     BYTE {@link #cGreenShift};
 *     BYTE {@link #cBlueBits};
 *     BYTE {@link #cBlueShift};
 *     BYTE {@link #cAlphaBits};
 *     BYTE {@link #cAlphaShift};
 *     BYTE {@link #cAccumBits};
 *     BYTE {@link #cAccumRedBits};
 *     BYTE {@link #cAccumGreenBits};
 *     BYTE {@link #cAccumBlueBits};
 *     BYTE {@link #cAccumAlphaBits};
 *     BYTE {@link #cDepthBits};
 *     BYTE {@link #cStencilBits};
 *     BYTE {@link #cAuxBuffers};
 *     BYTE {@link #iLayerType};
 *     BYTE {@link #bReserved};
 *     DWORD {@link #dwLayerMask};
 *     DWORD {@link #dwVisibleMask};
 *     DWORD {@link #dwDamageMask};
 * }</code></pre>
 */
public class PIXELFORMATDESCRIPTOR extends Struct<PIXELFORMATDESCRIPTOR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NSIZE,
        NVERSION,
        DWFLAGS,
        IPIXELTYPE,
        CCOLORBITS,
        CREDBITS,
        CREDSHIFT,
        CGREENBITS,
        CGREENSHIFT,
        CBLUEBITS,
        CBLUESHIFT,
        CALPHABITS,
        CALPHASHIFT,
        CACCUMBITS,
        CACCUMREDBITS,
        CACCUMGREENBITS,
        CACCUMBLUEBITS,
        CACCUMALPHABITS,
        CDEPTHBITS,
        CSTENCILBITS,
        CAUXBUFFERS,
        ILAYERTYPE,
        BRESERVED,
        DWLAYERMASK,
        DWVISIBLEMASK,
        DWDAMAGEMASK;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NSIZE = layout.offsetof(0);
        NVERSION = layout.offsetof(1);
        DWFLAGS = layout.offsetof(2);
        IPIXELTYPE = layout.offsetof(3);
        CCOLORBITS = layout.offsetof(4);
        CREDBITS = layout.offsetof(5);
        CREDSHIFT = layout.offsetof(6);
        CGREENBITS = layout.offsetof(7);
        CGREENSHIFT = layout.offsetof(8);
        CBLUEBITS = layout.offsetof(9);
        CBLUESHIFT = layout.offsetof(10);
        CALPHABITS = layout.offsetof(11);
        CALPHASHIFT = layout.offsetof(12);
        CACCUMBITS = layout.offsetof(13);
        CACCUMREDBITS = layout.offsetof(14);
        CACCUMGREENBITS = layout.offsetof(15);
        CACCUMBLUEBITS = layout.offsetof(16);
        CACCUMALPHABITS = layout.offsetof(17);
        CDEPTHBITS = layout.offsetof(18);
        CSTENCILBITS = layout.offsetof(19);
        CAUXBUFFERS = layout.offsetof(20);
        ILAYERTYPE = layout.offsetof(21);
        BRESERVED = layout.offsetof(22);
        DWLAYERMASK = layout.offsetof(23);
        DWVISIBLEMASK = layout.offsetof(24);
        DWDAMAGEMASK = layout.offsetof(25);
    }

    protected PIXELFORMATDESCRIPTOR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected PIXELFORMATDESCRIPTOR create(long address, @Nullable ByteBuffer container) {
        return new PIXELFORMATDESCRIPTOR(address, container);
    }

    /**
     * Creates a {@code PIXELFORMATDESCRIPTOR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public PIXELFORMATDESCRIPTOR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** specifies the size of this data structure. This value should be set to {@link #SIZEOF}. */
    @NativeType("WORD")
    public short nSize() { return nnSize(address()); }
    /** specifies the version of this data structure. This value should be set to 1 */
    @NativeType("WORD")
    public short nVersion() { return nnVersion(address()); }
    /** a set of bit flags that specify properties of the pixel buffer */
    @NativeType("DWORD")
    public int dwFlags() { return ndwFlags(address()); }
    /** specifies the type of pixel data */
    @NativeType("BYTE")
    public byte iPixelType() { return niPixelType(address()); }
    /**
     * specifies the number of color bitplanes in each color buffer. For RGBA pixel types, it is the size of the color buffer, excluding the alpha bitplanes.
     * For color-index pixels, it is the size of the color-index buffer.
     */
    @NativeType("BYTE")
    public byte cColorBits() { return ncColorBits(address()); }
    /** specifies the number of red bitplanes in each RGBA color buffer */
    @NativeType("BYTE")
    public byte cRedBits() { return ncRedBits(address()); }
    /** specifies the shift count for red bitplanes in each RGBA color buffer */
    @NativeType("BYTE")
    public byte cRedShift() { return ncRedShift(address()); }
    /** specifies the number of green bitplanes in each RGBA color buffer */
    @NativeType("BYTE")
    public byte cGreenBits() { return ncGreenBits(address()); }
    /** specifies the shift count for green bitplanes in each RGBA color buffer */
    @NativeType("BYTE")
    public byte cGreenShift() { return ncGreenShift(address()); }
    /** specifies the number of blue bitplanes in each RGBA color buffer */
    @NativeType("BYTE")
    public byte cBlueBits() { return ncBlueBits(address()); }
    /** specifies the shift count for blue bitplanes in each RGBA color buffer */
    @NativeType("BYTE")
    public byte cBlueShift() { return ncBlueShift(address()); }
    /** specifies the number of alpha bitplanes in each RGBA color buffer. Alpha bitplanes are not supported */
    @NativeType("BYTE")
    public byte cAlphaBits() { return ncAlphaBits(address()); }
    /** specifies the shift count for alpha bitplanes in each RGBA color buffer. Alpha bitplanes are not supported */
    @NativeType("BYTE")
    public byte cAlphaShift() { return ncAlphaShift(address()); }
    /** specifies the total number of bitplanes in the accumulation buffer */
    @NativeType("BYTE")
    public byte cAccumBits() { return ncAccumBits(address()); }
    /** specifies the number of red bitplanes in the accumulation buffer */
    @NativeType("BYTE")
    public byte cAccumRedBits() { return ncAccumRedBits(address()); }
    /** specifies the number of green bitplanes in the accumulation buffer */
    @NativeType("BYTE")
    public byte cAccumGreenBits() { return ncAccumGreenBits(address()); }
    /** specifies the number of blue bitplanes in the accumulation buffer */
    @NativeType("BYTE")
    public byte cAccumBlueBits() { return ncAccumBlueBits(address()); }
    /** specifies the number of alpha bitplanes in the accumulation buffer */
    @NativeType("BYTE")
    public byte cAccumAlphaBits() { return ncAccumAlphaBits(address()); }
    /** specifies the depth of the depth (z-axis) buffer */
    @NativeType("BYTE")
    public byte cDepthBits() { return ncDepthBits(address()); }
    /** specifies the depth of the stencil buffer */
    @NativeType("BYTE")
    public byte cStencilBits() { return ncStencilBits(address()); }
    /** specifies the number of auxiliary buffers. Auxiliary buffers are not supported */
    @NativeType("BYTE")
    public byte cAuxBuffers() { return ncAuxBuffers(address()); }
    /** Ignored. Earlier implementations of OpenGL used this member, but it is no longer used. */
    @NativeType("BYTE")
    public byte iLayerType() { return niLayerType(address()); }
    /**
     * specifies the number of overlay and underlay planes. Bits 0 through 3 specify up to 15 overlay planes and bits 4 through 7 specify up to 15 underlay
     * planes
     */
    @NativeType("BYTE")
    public byte bReserved() { return nbReserved(address()); }
    /** Ignored. Earlier implementations of OpenGL used this member, but it is no longer used. */
    @NativeType("DWORD")
    public int dwLayerMask() { return ndwLayerMask(address()); }
    /**
     * specifies the transparent color or index of an underlay plane. When the pixel type is RGBA, {@code dwVisibleMask} is a transparent RGB color value.
     * When the pixel type is color index, it is a transparent index value.
     */
    @NativeType("DWORD")
    public int dwVisibleMask() { return ndwVisibleMask(address()); }
    /** Ignored. Earlier implementations of OpenGL used this member, but it is no longer used. */
    @NativeType("DWORD")
    public int dwDamageMask() { return ndwDamageMask(address()); }

    /** Sets the specified value to the {@link #nSize} field. */
    public PIXELFORMATDESCRIPTOR nSize(@NativeType("WORD") short value) { nnSize(address(), value); return this; }
    /** Sets the specified value to the {@link #nVersion} field. */
    public PIXELFORMATDESCRIPTOR nVersion(@NativeType("WORD") short value) { nnVersion(address(), value); return this; }
    /** Sets the specified value to the {@link #dwFlags} field. */
    public PIXELFORMATDESCRIPTOR dwFlags(@NativeType("DWORD") int value) { ndwFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #iPixelType} field. */
    public PIXELFORMATDESCRIPTOR iPixelType(@NativeType("BYTE") byte value) { niPixelType(address(), value); return this; }
    /** Sets the specified value to the {@link #cColorBits} field. */
    public PIXELFORMATDESCRIPTOR cColorBits(@NativeType("BYTE") byte value) { ncColorBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cRedBits} field. */
    public PIXELFORMATDESCRIPTOR cRedBits(@NativeType("BYTE") byte value) { ncRedBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cRedShift} field. */
    public PIXELFORMATDESCRIPTOR cRedShift(@NativeType("BYTE") byte value) { ncRedShift(address(), value); return this; }
    /** Sets the specified value to the {@link #cGreenBits} field. */
    public PIXELFORMATDESCRIPTOR cGreenBits(@NativeType("BYTE") byte value) { ncGreenBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cGreenShift} field. */
    public PIXELFORMATDESCRIPTOR cGreenShift(@NativeType("BYTE") byte value) { ncGreenShift(address(), value); return this; }
    /** Sets the specified value to the {@link #cBlueBits} field. */
    public PIXELFORMATDESCRIPTOR cBlueBits(@NativeType("BYTE") byte value) { ncBlueBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cBlueShift} field. */
    public PIXELFORMATDESCRIPTOR cBlueShift(@NativeType("BYTE") byte value) { ncBlueShift(address(), value); return this; }
    /** Sets the specified value to the {@link #cAlphaBits} field. */
    public PIXELFORMATDESCRIPTOR cAlphaBits(@NativeType("BYTE") byte value) { ncAlphaBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cAlphaShift} field. */
    public PIXELFORMATDESCRIPTOR cAlphaShift(@NativeType("BYTE") byte value) { ncAlphaShift(address(), value); return this; }
    /** Sets the specified value to the {@link #cAccumBits} field. */
    public PIXELFORMATDESCRIPTOR cAccumBits(@NativeType("BYTE") byte value) { ncAccumBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cAccumRedBits} field. */
    public PIXELFORMATDESCRIPTOR cAccumRedBits(@NativeType("BYTE") byte value) { ncAccumRedBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cAccumGreenBits} field. */
    public PIXELFORMATDESCRIPTOR cAccumGreenBits(@NativeType("BYTE") byte value) { ncAccumGreenBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cAccumBlueBits} field. */
    public PIXELFORMATDESCRIPTOR cAccumBlueBits(@NativeType("BYTE") byte value) { ncAccumBlueBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cAccumAlphaBits} field. */
    public PIXELFORMATDESCRIPTOR cAccumAlphaBits(@NativeType("BYTE") byte value) { ncAccumAlphaBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cDepthBits} field. */
    public PIXELFORMATDESCRIPTOR cDepthBits(@NativeType("BYTE") byte value) { ncDepthBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cStencilBits} field. */
    public PIXELFORMATDESCRIPTOR cStencilBits(@NativeType("BYTE") byte value) { ncStencilBits(address(), value); return this; }
    /** Sets the specified value to the {@link #cAuxBuffers} field. */
    public PIXELFORMATDESCRIPTOR cAuxBuffers(@NativeType("BYTE") byte value) { ncAuxBuffers(address(), value); return this; }
    /** Sets the specified value to the {@link #iLayerType} field. */
    public PIXELFORMATDESCRIPTOR iLayerType(@NativeType("BYTE") byte value) { niLayerType(address(), value); return this; }
    /** Sets the specified value to the {@link #bReserved} field. */
    public PIXELFORMATDESCRIPTOR bReserved(@NativeType("BYTE") byte value) { nbReserved(address(), value); return this; }
    /** Sets the specified value to the {@link #dwLayerMask} field. */
    public PIXELFORMATDESCRIPTOR dwLayerMask(@NativeType("DWORD") int value) { ndwLayerMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dwVisibleMask} field. */
    public PIXELFORMATDESCRIPTOR dwVisibleMask(@NativeType("DWORD") int value) { ndwVisibleMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dwDamageMask} field. */
    public PIXELFORMATDESCRIPTOR dwDamageMask(@NativeType("DWORD") int value) { ndwDamageMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public PIXELFORMATDESCRIPTOR set(
        short nSize,
        short nVersion,
        int dwFlags,
        byte iPixelType,
        byte cColorBits,
        byte cRedBits,
        byte cRedShift,
        byte cGreenBits,
        byte cGreenShift,
        byte cBlueBits,
        byte cBlueShift,
        byte cAlphaBits,
        byte cAlphaShift,
        byte cAccumBits,
        byte cAccumRedBits,
        byte cAccumGreenBits,
        byte cAccumBlueBits,
        byte cAccumAlphaBits,
        byte cDepthBits,
        byte cStencilBits,
        byte cAuxBuffers,
        byte iLayerType,
        byte bReserved,
        int dwLayerMask,
        int dwVisibleMask,
        int dwDamageMask
    ) {
        nSize(nSize);
        nVersion(nVersion);
        dwFlags(dwFlags);
        iPixelType(iPixelType);
        cColorBits(cColorBits);
        cRedBits(cRedBits);
        cRedShift(cRedShift);
        cGreenBits(cGreenBits);
        cGreenShift(cGreenShift);
        cBlueBits(cBlueBits);
        cBlueShift(cBlueShift);
        cAlphaBits(cAlphaBits);
        cAlphaShift(cAlphaShift);
        cAccumBits(cAccumBits);
        cAccumRedBits(cAccumRedBits);
        cAccumGreenBits(cAccumGreenBits);
        cAccumBlueBits(cAccumBlueBits);
        cAccumAlphaBits(cAccumAlphaBits);
        cDepthBits(cDepthBits);
        cStencilBits(cStencilBits);
        cAuxBuffers(cAuxBuffers);
        iLayerType(iLayerType);
        bReserved(bReserved);
        dwLayerMask(dwLayerMask);
        dwVisibleMask(dwVisibleMask);
        dwDamageMask(dwDamageMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public PIXELFORMATDESCRIPTOR set(PIXELFORMATDESCRIPTOR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code PIXELFORMATDESCRIPTOR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static PIXELFORMATDESCRIPTOR malloc() {
        return new PIXELFORMATDESCRIPTOR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code PIXELFORMATDESCRIPTOR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static PIXELFORMATDESCRIPTOR calloc() {
        return new PIXELFORMATDESCRIPTOR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code PIXELFORMATDESCRIPTOR} instance allocated with {@link BufferUtils}. */
    public static PIXELFORMATDESCRIPTOR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new PIXELFORMATDESCRIPTOR(memAddress(container), container);
    }

    /** Returns a new {@code PIXELFORMATDESCRIPTOR} instance for the specified memory address. */
    public static PIXELFORMATDESCRIPTOR create(long address) {
        return new PIXELFORMATDESCRIPTOR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static PIXELFORMATDESCRIPTOR createSafe(long address) {
        return address == NULL ? null : new PIXELFORMATDESCRIPTOR(address, null);
    }

    /**
     * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PIXELFORMATDESCRIPTOR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PIXELFORMATDESCRIPTOR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static PIXELFORMATDESCRIPTOR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link PIXELFORMATDESCRIPTOR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static PIXELFORMATDESCRIPTOR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static PIXELFORMATDESCRIPTOR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static PIXELFORMATDESCRIPTOR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static PIXELFORMATDESCRIPTOR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static PIXELFORMATDESCRIPTOR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static PIXELFORMATDESCRIPTOR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static PIXELFORMATDESCRIPTOR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static PIXELFORMATDESCRIPTOR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static PIXELFORMATDESCRIPTOR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static PIXELFORMATDESCRIPTOR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code PIXELFORMATDESCRIPTOR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static PIXELFORMATDESCRIPTOR malloc(MemoryStack stack) {
        return new PIXELFORMATDESCRIPTOR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code PIXELFORMATDESCRIPTOR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static PIXELFORMATDESCRIPTOR calloc(MemoryStack stack) {
        return new PIXELFORMATDESCRIPTOR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PIXELFORMATDESCRIPTOR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PIXELFORMATDESCRIPTOR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PIXELFORMATDESCRIPTOR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #nSize}. */
    public static short nnSize(long struct) { return UNSAFE.getShort(null, struct + PIXELFORMATDESCRIPTOR.NSIZE); }
    /** Unsafe version of {@link #nVersion}. */
    public static short nnVersion(long struct) { return UNSAFE.getShort(null, struct + PIXELFORMATDESCRIPTOR.NVERSION); }
    /** Unsafe version of {@link #dwFlags}. */
    public static int ndwFlags(long struct) { return UNSAFE.getInt(null, struct + PIXELFORMATDESCRIPTOR.DWFLAGS); }
    /** Unsafe version of {@link #iPixelType}. */
    public static byte niPixelType(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.IPIXELTYPE); }
    /** Unsafe version of {@link #cColorBits}. */
    public static byte ncColorBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CCOLORBITS); }
    /** Unsafe version of {@link #cRedBits}. */
    public static byte ncRedBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CREDBITS); }
    /** Unsafe version of {@link #cRedShift}. */
    public static byte ncRedShift(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CREDSHIFT); }
    /** Unsafe version of {@link #cGreenBits}. */
    public static byte ncGreenBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CGREENBITS); }
    /** Unsafe version of {@link #cGreenShift}. */
    public static byte ncGreenShift(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CGREENSHIFT); }
    /** Unsafe version of {@link #cBlueBits}. */
    public static byte ncBlueBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CBLUEBITS); }
    /** Unsafe version of {@link #cBlueShift}. */
    public static byte ncBlueShift(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CBLUESHIFT); }
    /** Unsafe version of {@link #cAlphaBits}. */
    public static byte ncAlphaBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CALPHABITS); }
    /** Unsafe version of {@link #cAlphaShift}. */
    public static byte ncAlphaShift(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CALPHASHIFT); }
    /** Unsafe version of {@link #cAccumBits}. */
    public static byte ncAccumBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CACCUMBITS); }
    /** Unsafe version of {@link #cAccumRedBits}. */
    public static byte ncAccumRedBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CACCUMREDBITS); }
    /** Unsafe version of {@link #cAccumGreenBits}. */
    public static byte ncAccumGreenBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CACCUMGREENBITS); }
    /** Unsafe version of {@link #cAccumBlueBits}. */
    public static byte ncAccumBlueBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CACCUMBLUEBITS); }
    /** Unsafe version of {@link #cAccumAlphaBits}. */
    public static byte ncAccumAlphaBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CACCUMALPHABITS); }
    /** Unsafe version of {@link #cDepthBits}. */
    public static byte ncDepthBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CDEPTHBITS); }
    /** Unsafe version of {@link #cStencilBits}. */
    public static byte ncStencilBits(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CSTENCILBITS); }
    /** Unsafe version of {@link #cAuxBuffers}. */
    public static byte ncAuxBuffers(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.CAUXBUFFERS); }
    /** Unsafe version of {@link #iLayerType}. */
    public static byte niLayerType(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.ILAYERTYPE); }
    /** Unsafe version of {@link #bReserved}. */
    public static byte nbReserved(long struct) { return UNSAFE.getByte(null, struct + PIXELFORMATDESCRIPTOR.BRESERVED); }
    /** Unsafe version of {@link #dwLayerMask}. */
    public static int ndwLayerMask(long struct) { return UNSAFE.getInt(null, struct + PIXELFORMATDESCRIPTOR.DWLAYERMASK); }
    /** Unsafe version of {@link #dwVisibleMask}. */
    public static int ndwVisibleMask(long struct) { return UNSAFE.getInt(null, struct + PIXELFORMATDESCRIPTOR.DWVISIBLEMASK); }
    /** Unsafe version of {@link #dwDamageMask}. */
    public static int ndwDamageMask(long struct) { return UNSAFE.getInt(null, struct + PIXELFORMATDESCRIPTOR.DWDAMAGEMASK); }

    /** Unsafe version of {@link #nSize(short) nSize}. */
    public static void nnSize(long struct, short value) { UNSAFE.putShort(null, struct + PIXELFORMATDESCRIPTOR.NSIZE, value); }
    /** Unsafe version of {@link #nVersion(short) nVersion}. */
    public static void nnVersion(long struct, short value) { UNSAFE.putShort(null, struct + PIXELFORMATDESCRIPTOR.NVERSION, value); }
    /** Unsafe version of {@link #dwFlags(int) dwFlags}. */
    public static void ndwFlags(long struct, int value) { UNSAFE.putInt(null, struct + PIXELFORMATDESCRIPTOR.DWFLAGS, value); }
    /** Unsafe version of {@link #iPixelType(byte) iPixelType}. */
    public static void niPixelType(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.IPIXELTYPE, value); }
    /** Unsafe version of {@link #cColorBits(byte) cColorBits}. */
    public static void ncColorBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CCOLORBITS, value); }
    /** Unsafe version of {@link #cRedBits(byte) cRedBits}. */
    public static void ncRedBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CREDBITS, value); }
    /** Unsafe version of {@link #cRedShift(byte) cRedShift}. */
    public static void ncRedShift(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CREDSHIFT, value); }
    /** Unsafe version of {@link #cGreenBits(byte) cGreenBits}. */
    public static void ncGreenBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CGREENBITS, value); }
    /** Unsafe version of {@link #cGreenShift(byte) cGreenShift}. */
    public static void ncGreenShift(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CGREENSHIFT, value); }
    /** Unsafe version of {@link #cBlueBits(byte) cBlueBits}. */
    public static void ncBlueBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CBLUEBITS, value); }
    /** Unsafe version of {@link #cBlueShift(byte) cBlueShift}. */
    public static void ncBlueShift(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CBLUESHIFT, value); }
    /** Unsafe version of {@link #cAlphaBits(byte) cAlphaBits}. */
    public static void ncAlphaBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CALPHABITS, value); }
    /** Unsafe version of {@link #cAlphaShift(byte) cAlphaShift}. */
    public static void ncAlphaShift(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CALPHASHIFT, value); }
    /** Unsafe version of {@link #cAccumBits(byte) cAccumBits}. */
    public static void ncAccumBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CACCUMBITS, value); }
    /** Unsafe version of {@link #cAccumRedBits(byte) cAccumRedBits}. */
    public static void ncAccumRedBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CACCUMREDBITS, value); }
    /** Unsafe version of {@link #cAccumGreenBits(byte) cAccumGreenBits}. */
    public static void ncAccumGreenBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CACCUMGREENBITS, value); }
    /** Unsafe version of {@link #cAccumBlueBits(byte) cAccumBlueBits}. */
    public static void ncAccumBlueBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CACCUMBLUEBITS, value); }
    /** Unsafe version of {@link #cAccumAlphaBits(byte) cAccumAlphaBits}. */
    public static void ncAccumAlphaBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CACCUMALPHABITS, value); }
    /** Unsafe version of {@link #cDepthBits(byte) cDepthBits}. */
    public static void ncDepthBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CDEPTHBITS, value); }
    /** Unsafe version of {@link #cStencilBits(byte) cStencilBits}. */
    public static void ncStencilBits(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CSTENCILBITS, value); }
    /** Unsafe version of {@link #cAuxBuffers(byte) cAuxBuffers}. */
    public static void ncAuxBuffers(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.CAUXBUFFERS, value); }
    /** Unsafe version of {@link #iLayerType(byte) iLayerType}. */
    public static void niLayerType(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.ILAYERTYPE, value); }
    /** Unsafe version of {@link #bReserved(byte) bReserved}. */
    public static void nbReserved(long struct, byte value) { UNSAFE.putByte(null, struct + PIXELFORMATDESCRIPTOR.BRESERVED, value); }
    /** Unsafe version of {@link #dwLayerMask(int) dwLayerMask}. */
    public static void ndwLayerMask(long struct, int value) { UNSAFE.putInt(null, struct + PIXELFORMATDESCRIPTOR.DWLAYERMASK, value); }
    /** Unsafe version of {@link #dwVisibleMask(int) dwVisibleMask}. */
    public static void ndwVisibleMask(long struct, int value) { UNSAFE.putInt(null, struct + PIXELFORMATDESCRIPTOR.DWVISIBLEMASK, value); }
    /** Unsafe version of {@link #dwDamageMask(int) dwDamageMask}. */
    public static void ndwDamageMask(long struct, int value) { UNSAFE.putInt(null, struct + PIXELFORMATDESCRIPTOR.DWDAMAGEMASK, value); }

    // -----------------------------------

    /** An array of {@link PIXELFORMATDESCRIPTOR} structs. */
    public static class Buffer extends StructBuffer<PIXELFORMATDESCRIPTOR, Buffer> implements NativeResource {

        private static final PIXELFORMATDESCRIPTOR ELEMENT_FACTORY = PIXELFORMATDESCRIPTOR.create(-1L);

        /**
         * Creates a new {@code PIXELFORMATDESCRIPTOR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link PIXELFORMATDESCRIPTOR#SIZEOF}, and its mark will be undefined.</p>
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
        protected PIXELFORMATDESCRIPTOR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#nSize} field. */
        @NativeType("WORD")
        public short nSize() { return PIXELFORMATDESCRIPTOR.nnSize(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#nVersion} field. */
        @NativeType("WORD")
        public short nVersion() { return PIXELFORMATDESCRIPTOR.nnVersion(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#dwFlags} field. */
        @NativeType("DWORD")
        public int dwFlags() { return PIXELFORMATDESCRIPTOR.ndwFlags(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#iPixelType} field. */
        @NativeType("BYTE")
        public byte iPixelType() { return PIXELFORMATDESCRIPTOR.niPixelType(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cColorBits} field. */
        @NativeType("BYTE")
        public byte cColorBits() { return PIXELFORMATDESCRIPTOR.ncColorBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cRedBits} field. */
        @NativeType("BYTE")
        public byte cRedBits() { return PIXELFORMATDESCRIPTOR.ncRedBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cRedShift} field. */
        @NativeType("BYTE")
        public byte cRedShift() { return PIXELFORMATDESCRIPTOR.ncRedShift(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cGreenBits} field. */
        @NativeType("BYTE")
        public byte cGreenBits() { return PIXELFORMATDESCRIPTOR.ncGreenBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cGreenShift} field. */
        @NativeType("BYTE")
        public byte cGreenShift() { return PIXELFORMATDESCRIPTOR.ncGreenShift(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cBlueBits} field. */
        @NativeType("BYTE")
        public byte cBlueBits() { return PIXELFORMATDESCRIPTOR.ncBlueBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cBlueShift} field. */
        @NativeType("BYTE")
        public byte cBlueShift() { return PIXELFORMATDESCRIPTOR.ncBlueShift(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cAlphaBits} field. */
        @NativeType("BYTE")
        public byte cAlphaBits() { return PIXELFORMATDESCRIPTOR.ncAlphaBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cAlphaShift} field. */
        @NativeType("BYTE")
        public byte cAlphaShift() { return PIXELFORMATDESCRIPTOR.ncAlphaShift(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cAccumBits} field. */
        @NativeType("BYTE")
        public byte cAccumBits() { return PIXELFORMATDESCRIPTOR.ncAccumBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cAccumRedBits} field. */
        @NativeType("BYTE")
        public byte cAccumRedBits() { return PIXELFORMATDESCRIPTOR.ncAccumRedBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cAccumGreenBits} field. */
        @NativeType("BYTE")
        public byte cAccumGreenBits() { return PIXELFORMATDESCRIPTOR.ncAccumGreenBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cAccumBlueBits} field. */
        @NativeType("BYTE")
        public byte cAccumBlueBits() { return PIXELFORMATDESCRIPTOR.ncAccumBlueBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cAccumAlphaBits} field. */
        @NativeType("BYTE")
        public byte cAccumAlphaBits() { return PIXELFORMATDESCRIPTOR.ncAccumAlphaBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cDepthBits} field. */
        @NativeType("BYTE")
        public byte cDepthBits() { return PIXELFORMATDESCRIPTOR.ncDepthBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cStencilBits} field. */
        @NativeType("BYTE")
        public byte cStencilBits() { return PIXELFORMATDESCRIPTOR.ncStencilBits(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#cAuxBuffers} field. */
        @NativeType("BYTE")
        public byte cAuxBuffers() { return PIXELFORMATDESCRIPTOR.ncAuxBuffers(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#iLayerType} field. */
        @NativeType("BYTE")
        public byte iLayerType() { return PIXELFORMATDESCRIPTOR.niLayerType(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#bReserved} field. */
        @NativeType("BYTE")
        public byte bReserved() { return PIXELFORMATDESCRIPTOR.nbReserved(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#dwLayerMask} field. */
        @NativeType("DWORD")
        public int dwLayerMask() { return PIXELFORMATDESCRIPTOR.ndwLayerMask(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#dwVisibleMask} field. */
        @NativeType("DWORD")
        public int dwVisibleMask() { return PIXELFORMATDESCRIPTOR.ndwVisibleMask(address()); }
        /** @return the value of the {@link PIXELFORMATDESCRIPTOR#dwDamageMask} field. */
        @NativeType("DWORD")
        public int dwDamageMask() { return PIXELFORMATDESCRIPTOR.ndwDamageMask(address()); }

        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#nSize} field. */
        public PIXELFORMATDESCRIPTOR.Buffer nSize(@NativeType("WORD") short value) { PIXELFORMATDESCRIPTOR.nnSize(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#nVersion} field. */
        public PIXELFORMATDESCRIPTOR.Buffer nVersion(@NativeType("WORD") short value) { PIXELFORMATDESCRIPTOR.nnVersion(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#dwFlags} field. */
        public PIXELFORMATDESCRIPTOR.Buffer dwFlags(@NativeType("DWORD") int value) { PIXELFORMATDESCRIPTOR.ndwFlags(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#iPixelType} field. */
        public PIXELFORMATDESCRIPTOR.Buffer iPixelType(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.niPixelType(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cColorBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cColorBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncColorBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cRedBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cRedBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncRedBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cRedShift} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cRedShift(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncRedShift(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cGreenBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cGreenBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncGreenBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cGreenShift} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cGreenShift(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncGreenShift(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cBlueBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cBlueBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncBlueBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cBlueShift} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cBlueShift(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncBlueShift(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cAlphaBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cAlphaBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncAlphaBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cAlphaShift} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cAlphaShift(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncAlphaShift(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cAccumBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cAccumBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncAccumBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cAccumRedBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cAccumRedBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncAccumRedBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cAccumGreenBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cAccumGreenBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncAccumGreenBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cAccumBlueBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cAccumBlueBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncAccumBlueBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cAccumAlphaBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cAccumAlphaBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncAccumAlphaBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cDepthBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cDepthBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncDepthBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cStencilBits} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cStencilBits(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncStencilBits(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#cAuxBuffers} field. */
        public PIXELFORMATDESCRIPTOR.Buffer cAuxBuffers(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.ncAuxBuffers(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#iLayerType} field. */
        public PIXELFORMATDESCRIPTOR.Buffer iLayerType(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.niLayerType(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#bReserved} field. */
        public PIXELFORMATDESCRIPTOR.Buffer bReserved(@NativeType("BYTE") byte value) { PIXELFORMATDESCRIPTOR.nbReserved(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#dwLayerMask} field. */
        public PIXELFORMATDESCRIPTOR.Buffer dwLayerMask(@NativeType("DWORD") int value) { PIXELFORMATDESCRIPTOR.ndwLayerMask(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#dwVisibleMask} field. */
        public PIXELFORMATDESCRIPTOR.Buffer dwVisibleMask(@NativeType("DWORD") int value) { PIXELFORMATDESCRIPTOR.ndwVisibleMask(address(), value); return this; }
        /** Sets the specified value to the {@link PIXELFORMATDESCRIPTOR#dwDamageMask} field. */
        public PIXELFORMATDESCRIPTOR.Buffer dwDamageMask(@NativeType("DWORD") int value) { PIXELFORMATDESCRIPTOR.ndwDamageMask(address(), value); return this; }

    }

}