/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Texture descriptor.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_TEXTURE_DESC {
 *     CUaddress_mode {@link #addressMode}[3];
 *     CUfilter_mode {@link #filterMode};
 *     unsigned int {@link #flags};
 *     unsigned int {@link #maxAnisotropy};
 *     CUfilter_mode {@link #mipmapFilterMode};
 *     float {@link #mipmapLevelBias};
 *     float {@link #minMipmapLevelClamp};
 *     float {@link #maxMipmapLevelClamp};
 *     float {@link #borderColor}[4];
 *     int reserved[12];
 * }</code></pre>
 */
public class CUDA_TEXTURE_DESC extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ADDRESSMODE,
        FILTERMODE,
        FLAGS,
        MAXANISOTROPY,
        MIPMAPFILTERMODE,
        MIPMAPLEVELBIAS,
        MINMIPMAPLEVELCLAMP,
        MAXMIPMAPLEVELCLAMP,
        BORDERCOLOR,
        RESERVED;

    static {
        Layout layout = __struct(
            __array(4, 3),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 4),
            __array(4, 12)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ADDRESSMODE = layout.offsetof(0);
        FILTERMODE = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MAXANISOTROPY = layout.offsetof(3);
        MIPMAPFILTERMODE = layout.offsetof(4);
        MIPMAPLEVELBIAS = layout.offsetof(5);
        MINMIPMAPLEVELCLAMP = layout.offsetof(6);
        MAXMIPMAPLEVELCLAMP = layout.offsetof(7);
        BORDERCOLOR = layout.offsetof(8);
        RESERVED = layout.offsetof(9);
    }

    /**
     * Creates a {@code CUDA_TEXTURE_DESC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_TEXTURE_DESC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Address modes */
    @NativeType("CUaddress_mode[3]")
    public IntBuffer addressMode() { return naddressMode(address()); }
    /** Address modes */
    @NativeType("CUaddress_mode")
    public int addressMode(int index) { return naddressMode(address(), index); }
    /** Filter mode */
    @NativeType("CUfilter_mode")
    public int filterMode() { return nfilterMode(address()); }
    /** Flags */
    @NativeType("unsigned int")
    public int flags() { return nflags(address()); }
    /** Maximum anisotropy ratio */
    @NativeType("unsigned int")
    public int maxAnisotropy() { return nmaxAnisotropy(address()); }
    /** Mipmap filter mode */
    @NativeType("CUfilter_mode")
    public int mipmapFilterMode() { return nmipmapFilterMode(address()); }
    /** Mipmap level bias */
    public float mipmapLevelBias() { return nmipmapLevelBias(address()); }
    /** Mipmap minimum level clamp */
    public float minMipmapLevelClamp() { return nminMipmapLevelClamp(address()); }
    /** Mipmap maximum level clamp */
    public float maxMipmapLevelClamp() { return nmaxMipmapLevelClamp(address()); }
    /** Border Color */
    @NativeType("float[4]")
    public FloatBuffer borderColor() { return nborderColor(address()); }
    /** Border Color */
    public float borderColor(int index) { return nborderColor(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("int[12]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** @return the value at the specified index of the {@code reserved} field. */
    public int reserved(int index) { return nreserved(address(), index); }

    /** Copies the specified {@link IntBuffer} to the {@link #addressMode} field. */
    public CUDA_TEXTURE_DESC addressMode(@NativeType("CUaddress_mode[3]") IntBuffer value) { naddressMode(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #addressMode} field. */
    public CUDA_TEXTURE_DESC addressMode(int index, @NativeType("CUaddress_mode") int value) { naddressMode(address(), index, value); return this; }
    /** Sets the specified value to the {@link #filterMode} field. */
    public CUDA_TEXTURE_DESC filterMode(@NativeType("CUfilter_mode") int value) { nfilterMode(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public CUDA_TEXTURE_DESC flags(@NativeType("unsigned int") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #maxAnisotropy} field. */
    public CUDA_TEXTURE_DESC maxAnisotropy(@NativeType("unsigned int") int value) { nmaxAnisotropy(address(), value); return this; }
    /** Sets the specified value to the {@link #mipmapFilterMode} field. */
    public CUDA_TEXTURE_DESC mipmapFilterMode(@NativeType("CUfilter_mode") int value) { nmipmapFilterMode(address(), value); return this; }
    /** Sets the specified value to the {@link #mipmapLevelBias} field. */
    public CUDA_TEXTURE_DESC mipmapLevelBias(float value) { nmipmapLevelBias(address(), value); return this; }
    /** Sets the specified value to the {@link #minMipmapLevelClamp} field. */
    public CUDA_TEXTURE_DESC minMipmapLevelClamp(float value) { nminMipmapLevelClamp(address(), value); return this; }
    /** Sets the specified value to the {@link #maxMipmapLevelClamp} field. */
    public CUDA_TEXTURE_DESC maxMipmapLevelClamp(float value) { nmaxMipmapLevelClamp(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@link #borderColor} field. */
    public CUDA_TEXTURE_DESC borderColor(@NativeType("float[4]") FloatBuffer value) { nborderColor(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #borderColor} field. */
    public CUDA_TEXTURE_DESC borderColor(int index, float value) { nborderColor(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public CUDA_TEXTURE_DESC reserved(@NativeType("int[12]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUDA_TEXTURE_DESC reserved(int index, int value) { nreserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_TEXTURE_DESC set(
        IntBuffer addressMode,
        int filterMode,
        int flags,
        int maxAnisotropy,
        int mipmapFilterMode,
        float mipmapLevelBias,
        float minMipmapLevelClamp,
        float maxMipmapLevelClamp,
        FloatBuffer borderColor,
        IntBuffer reserved
    ) {
        addressMode(addressMode);
        filterMode(filterMode);
        flags(flags);
        maxAnisotropy(maxAnisotropy);
        mipmapFilterMode(mipmapFilterMode);
        mipmapLevelBias(mipmapLevelBias);
        minMipmapLevelClamp(minMipmapLevelClamp);
        maxMipmapLevelClamp(maxMipmapLevelClamp);
        borderColor(borderColor);
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
    public CUDA_TEXTURE_DESC set(CUDA_TEXTURE_DESC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_TEXTURE_DESC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_TEXTURE_DESC malloc() {
        return wrap(CUDA_TEXTURE_DESC.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUDA_TEXTURE_DESC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_TEXTURE_DESC calloc() {
        return wrap(CUDA_TEXTURE_DESC.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUDA_TEXTURE_DESC} instance allocated with {@link BufferUtils}. */
    public static CUDA_TEXTURE_DESC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_TEXTURE_DESC.class, memAddress(container), container);
    }

    /** Returns a new {@code CUDA_TEXTURE_DESC} instance for the specified memory address. */
    public static CUDA_TEXTURE_DESC create(long address) {
        return wrap(CUDA_TEXTURE_DESC.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_TEXTURE_DESC createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_TEXTURE_DESC.class, address);
    }

    /**
     * Returns a new {@link CUDA_TEXTURE_DESC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_TEXTURE_DESC.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_TEXTURE_DESC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_TEXTURE_DESC.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_TEXTURE_DESC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_TEXTURE_DESC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_TEXTURE_DESC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_TEXTURE_DESC.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_TEXTURE_DESC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_TEXTURE_DESC mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_TEXTURE_DESC callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_TEXTURE_DESC mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_TEXTURE_DESC callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_TEXTURE_DESC.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_TEXTURE_DESC.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_TEXTURE_DESC.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_TEXTURE_DESC.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUDA_TEXTURE_DESC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_TEXTURE_DESC malloc(MemoryStack stack) {
        return wrap(CUDA_TEXTURE_DESC.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_TEXTURE_DESC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_TEXTURE_DESC calloc(MemoryStack stack) {
        return wrap(CUDA_TEXTURE_DESC.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_TEXTURE_DESC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_TEXTURE_DESC.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_TEXTURE_DESC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_TEXTURE_DESC.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #addressMode}. */
    public static IntBuffer naddressMode(long struct) { return memIntBuffer(struct + CUDA_TEXTURE_DESC.ADDRESSMODE, 3); }
    /** Unsafe version of {@link #addressMode(int) addressMode}. */
    public static int naddressMode(long struct, int index) {
        return UNSAFE.getInt(null, struct + CUDA_TEXTURE_DESC.ADDRESSMODE + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #filterMode}. */
    public static int nfilterMode(long struct) { return UNSAFE.getInt(null, struct + CUDA_TEXTURE_DESC.FILTERMODE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + CUDA_TEXTURE_DESC.FLAGS); }
    /** Unsafe version of {@link #maxAnisotropy}. */
    public static int nmaxAnisotropy(long struct) { return UNSAFE.getInt(null, struct + CUDA_TEXTURE_DESC.MAXANISOTROPY); }
    /** Unsafe version of {@link #mipmapFilterMode}. */
    public static int nmipmapFilterMode(long struct) { return UNSAFE.getInt(null, struct + CUDA_TEXTURE_DESC.MIPMAPFILTERMODE); }
    /** Unsafe version of {@link #mipmapLevelBias}. */
    public static float nmipmapLevelBias(long struct) { return UNSAFE.getFloat(null, struct + CUDA_TEXTURE_DESC.MIPMAPLEVELBIAS); }
    /** Unsafe version of {@link #minMipmapLevelClamp}. */
    public static float nminMipmapLevelClamp(long struct) { return UNSAFE.getFloat(null, struct + CUDA_TEXTURE_DESC.MINMIPMAPLEVELCLAMP); }
    /** Unsafe version of {@link #maxMipmapLevelClamp}. */
    public static float nmaxMipmapLevelClamp(long struct) { return UNSAFE.getFloat(null, struct + CUDA_TEXTURE_DESC.MAXMIPMAPLEVELCLAMP); }
    /** Unsafe version of {@link #borderColor}. */
    public static FloatBuffer nborderColor(long struct) { return memFloatBuffer(struct + CUDA_TEXTURE_DESC.BORDERCOLOR, 4); }
    /** Unsafe version of {@link #borderColor(int) borderColor}. */
    public static float nborderColor(long struct, int index) {
        return UNSAFE.getFloat(null, struct + CUDA_TEXTURE_DESC.BORDERCOLOR + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + CUDA_TEXTURE_DESC.RESERVED, 12); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return UNSAFE.getInt(null, struct + CUDA_TEXTURE_DESC.RESERVED + check(index, 12) * 4);
    }

    /** Unsafe version of {@link #addressMode(IntBuffer) addressMode}. */
    public static void naddressMode(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + CUDA_TEXTURE_DESC.ADDRESSMODE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #addressMode(int, int) addressMode}. */
    public static void naddressMode(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + CUDA_TEXTURE_DESC.ADDRESSMODE + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #filterMode(int) filterMode}. */
    public static void nfilterMode(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_TEXTURE_DESC.FILTERMODE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_TEXTURE_DESC.FLAGS, value); }
    /** Unsafe version of {@link #maxAnisotropy(int) maxAnisotropy}. */
    public static void nmaxAnisotropy(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_TEXTURE_DESC.MAXANISOTROPY, value); }
    /** Unsafe version of {@link #mipmapFilterMode(int) mipmapFilterMode}. */
    public static void nmipmapFilterMode(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_TEXTURE_DESC.MIPMAPFILTERMODE, value); }
    /** Unsafe version of {@link #mipmapLevelBias(float) mipmapLevelBias}. */
    public static void nmipmapLevelBias(long struct, float value) { UNSAFE.putFloat(null, struct + CUDA_TEXTURE_DESC.MIPMAPLEVELBIAS, value); }
    /** Unsafe version of {@link #minMipmapLevelClamp(float) minMipmapLevelClamp}. */
    public static void nminMipmapLevelClamp(long struct, float value) { UNSAFE.putFloat(null, struct + CUDA_TEXTURE_DESC.MINMIPMAPLEVELCLAMP, value); }
    /** Unsafe version of {@link #maxMipmapLevelClamp(float) maxMipmapLevelClamp}. */
    public static void nmaxMipmapLevelClamp(long struct, float value) { UNSAFE.putFloat(null, struct + CUDA_TEXTURE_DESC.MAXMIPMAPLEVELCLAMP, value); }
    /** Unsafe version of {@link #borderColor(FloatBuffer) borderColor}. */
    public static void nborderColor(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + CUDA_TEXTURE_DESC.BORDERCOLOR, value.remaining() * 4);
    }
    /** Unsafe version of {@link #borderColor(int, float) borderColor}. */
    public static void nborderColor(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + CUDA_TEXTURE_DESC.BORDERCOLOR + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 12); }
        memCopy(memAddress(value), struct + CUDA_TEXTURE_DESC.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + CUDA_TEXTURE_DESC.RESERVED + check(index, 12) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link CUDA_TEXTURE_DESC} structs. */
    public static class Buffer extends StructBuffer<CUDA_TEXTURE_DESC, Buffer> implements NativeResource {

        private static final CUDA_TEXTURE_DESC ELEMENT_FACTORY = CUDA_TEXTURE_DESC.create(-1L);

        /**
         * Creates a new {@code CUDA_TEXTURE_DESC.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_TEXTURE_DESC#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_TEXTURE_DESC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the {@link CUDA_TEXTURE_DESC#addressMode} field. */
        @NativeType("CUaddress_mode[3]")
        public IntBuffer addressMode() { return CUDA_TEXTURE_DESC.naddressMode(address()); }
        /** @return the value at the specified index of the {@link CUDA_TEXTURE_DESC#addressMode} field. */
        @NativeType("CUaddress_mode")
        public int addressMode(int index) { return CUDA_TEXTURE_DESC.naddressMode(address(), index); }
        /** @return the value of the {@link CUDA_TEXTURE_DESC#filterMode} field. */
        @NativeType("CUfilter_mode")
        public int filterMode() { return CUDA_TEXTURE_DESC.nfilterMode(address()); }
        /** @return the value of the {@link CUDA_TEXTURE_DESC#flags} field. */
        @NativeType("unsigned int")
        public int flags() { return CUDA_TEXTURE_DESC.nflags(address()); }
        /** @return the value of the {@link CUDA_TEXTURE_DESC#maxAnisotropy} field. */
        @NativeType("unsigned int")
        public int maxAnisotropy() { return CUDA_TEXTURE_DESC.nmaxAnisotropy(address()); }
        /** @return the value of the {@link CUDA_TEXTURE_DESC#mipmapFilterMode} field. */
        @NativeType("CUfilter_mode")
        public int mipmapFilterMode() { return CUDA_TEXTURE_DESC.nmipmapFilterMode(address()); }
        /** @return the value of the {@link CUDA_TEXTURE_DESC#mipmapLevelBias} field. */
        public float mipmapLevelBias() { return CUDA_TEXTURE_DESC.nmipmapLevelBias(address()); }
        /** @return the value of the {@link CUDA_TEXTURE_DESC#minMipmapLevelClamp} field. */
        public float minMipmapLevelClamp() { return CUDA_TEXTURE_DESC.nminMipmapLevelClamp(address()); }
        /** @return the value of the {@link CUDA_TEXTURE_DESC#maxMipmapLevelClamp} field. */
        public float maxMipmapLevelClamp() { return CUDA_TEXTURE_DESC.nmaxMipmapLevelClamp(address()); }
        /** @return a {@link FloatBuffer} view of the {@link CUDA_TEXTURE_DESC#borderColor} field. */
        @NativeType("float[4]")
        public FloatBuffer borderColor() { return CUDA_TEXTURE_DESC.nborderColor(address()); }
        /** @return the value at the specified index of the {@link CUDA_TEXTURE_DESC#borderColor} field. */
        public float borderColor(int index) { return CUDA_TEXTURE_DESC.nborderColor(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("int[12]")
        public IntBuffer reserved() { return CUDA_TEXTURE_DESC.nreserved(address()); }
        /** @return the value at the specified index of the {@code reserved} field. */
        public int reserved(int index) { return CUDA_TEXTURE_DESC.nreserved(address(), index); }

        /** Copies the specified {@link IntBuffer} to the {@link CUDA_TEXTURE_DESC#addressMode} field. */
        public CUDA_TEXTURE_DESC.Buffer addressMode(@NativeType("CUaddress_mode[3]") IntBuffer value) { CUDA_TEXTURE_DESC.naddressMode(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link CUDA_TEXTURE_DESC#addressMode} field. */
        public CUDA_TEXTURE_DESC.Buffer addressMode(int index, @NativeType("CUaddress_mode") int value) { CUDA_TEXTURE_DESC.naddressMode(address(), index, value); return this; }
        /** Sets the specified value to the {@link CUDA_TEXTURE_DESC#filterMode} field. */
        public CUDA_TEXTURE_DESC.Buffer filterMode(@NativeType("CUfilter_mode") int value) { CUDA_TEXTURE_DESC.nfilterMode(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_TEXTURE_DESC#flags} field. */
        public CUDA_TEXTURE_DESC.Buffer flags(@NativeType("unsigned int") int value) { CUDA_TEXTURE_DESC.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_TEXTURE_DESC#maxAnisotropy} field. */
        public CUDA_TEXTURE_DESC.Buffer maxAnisotropy(@NativeType("unsigned int") int value) { CUDA_TEXTURE_DESC.nmaxAnisotropy(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_TEXTURE_DESC#mipmapFilterMode} field. */
        public CUDA_TEXTURE_DESC.Buffer mipmapFilterMode(@NativeType("CUfilter_mode") int value) { CUDA_TEXTURE_DESC.nmipmapFilterMode(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_TEXTURE_DESC#mipmapLevelBias} field. */
        public CUDA_TEXTURE_DESC.Buffer mipmapLevelBias(float value) { CUDA_TEXTURE_DESC.nmipmapLevelBias(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_TEXTURE_DESC#minMipmapLevelClamp} field. */
        public CUDA_TEXTURE_DESC.Buffer minMipmapLevelClamp(float value) { CUDA_TEXTURE_DESC.nminMipmapLevelClamp(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_TEXTURE_DESC#maxMipmapLevelClamp} field. */
        public CUDA_TEXTURE_DESC.Buffer maxMipmapLevelClamp(float value) { CUDA_TEXTURE_DESC.nmaxMipmapLevelClamp(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@link CUDA_TEXTURE_DESC#borderColor} field. */
        public CUDA_TEXTURE_DESC.Buffer borderColor(@NativeType("float[4]") FloatBuffer value) { CUDA_TEXTURE_DESC.nborderColor(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link CUDA_TEXTURE_DESC#borderColor} field. */
        public CUDA_TEXTURE_DESC.Buffer borderColor(int index, float value) { CUDA_TEXTURE_DESC.nborderColor(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public CUDA_TEXTURE_DESC.Buffer reserved(@NativeType("int[12]") IntBuffer value) { CUDA_TEXTURE_DESC.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUDA_TEXTURE_DESC.Buffer reserved(int index, int value) { CUDA_TEXTURE_DESC.nreserved(address(), index, value); return this; }

    }

}