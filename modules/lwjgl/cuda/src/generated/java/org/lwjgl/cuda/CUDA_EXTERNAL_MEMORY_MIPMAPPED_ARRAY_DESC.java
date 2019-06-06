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
 * External memory mipmap descriptor.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code offset} &ndash; Offset into the memory object where the base level of the mipmap chain is.</li>
 * <li>{@code arrayDesc} &ndash; Format, dimension and type of base level of the mipmap chain</li>
 * <li>{@code numLevels} &ndash; Total number of levels in the mipmap chain</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC {
 *     unsigned long long offset;
 *     {@link CUDA_ARRAY3D_DESCRIPTOR CUDA_ARRAY3D_DESCRIPTOR} arrayDesc;
 *     unsigned int numLevels;
 *     unsigned int reserved[16];
 * }</code></pre>
 */
public class CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        ARRAYDESC,
        NUMLEVELS,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(8),
            __member(CUDA_ARRAY3D_DESCRIPTOR.SIZEOF, CUDA_ARRAY3D_DESCRIPTOR.ALIGNOF),
            __member(4),
            __array(4, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        ARRAYDESC = layout.offsetof(1);
        NUMLEVELS = layout.offsetof(2);
        RESERVED = layout.offsetof(3);
    }

    /**
     * Creates a {@code CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code offset} field. */
    @NativeType("unsigned long long")
    public long offset() { return noffset(address()); }
    /** Returns a {@link CUDA_ARRAY3D_DESCRIPTOR} view of the {@code arrayDesc} field. */
    public CUDA_ARRAY3D_DESCRIPTOR arrayDesc() { return narrayDesc(address()); }
    /** Returns the value of the {@code numLevels} field. */
    @NativeType("unsigned int")
    public int numLevels() { return nnumLevels(address()); }
    /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned int[16]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** Returns the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned int")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Sets the specified value to the {@code offset} field. */
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC offset(@NativeType("unsigned long long") long value) { noffset(address(), value); return this; }
    /** Copies the specified {@link CUDA_ARRAY3D_DESCRIPTOR} to the {@code arrayDesc} field. */
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC arrayDesc(CUDA_ARRAY3D_DESCRIPTOR value) { narrayDesc(address(), value); return this; }
    /** Passes the {@code arrayDesc} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC arrayDesc(java.util.function.Consumer<CUDA_ARRAY3D_DESCRIPTOR> consumer) { consumer.accept(arrayDesc()); return this; }
    /** Sets the specified value to the {@code numLevels} field. */
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC numLevels(@NativeType("unsigned int") int value) { nnumLevels(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC reserved(@NativeType("unsigned int[16]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC reserved(int index, @NativeType("unsigned int") int value) { nreserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC set(
        long offset,
        CUDA_ARRAY3D_DESCRIPTOR arrayDesc,
        int numLevels,
        IntBuffer reserved
    ) {
        offset(offset);
        arrayDesc(arrayDesc);
        numLevels(numLevels);
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
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC set(CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC malloc() {
        return wrap(CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC calloc() {
        return wrap(CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC} instance allocated with {@link BufferUtils}. */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.class, memAddress(container), container);
    }

    /** Returns a new {@code CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC} instance for the specified memory address. */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC create(long address) {
        return wrap(CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.class, address);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC} instance allocated on the thread-local {@link MemoryStack}. */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC mallocStack(MemoryStack stack) {
        return wrap(CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC callocStack(MemoryStack stack) {
        return wrap(CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.OFFSET); }
    /** Unsafe version of {@link #arrayDesc}. */
    public static CUDA_ARRAY3D_DESCRIPTOR narrayDesc(long struct) { return CUDA_ARRAY3D_DESCRIPTOR.create(struct + CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.ARRAYDESC); }
    /** Unsafe version of {@link #numLevels}. */
    public static int nnumLevels(long struct) { return UNSAFE.getInt(null, struct + CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.NUMLEVELS); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.RESERVED, 16); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return UNSAFE.getInt(null, struct + CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.RESERVED + check(index, 16) * 4);
    }

    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { UNSAFE.putLong(null, struct + CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.OFFSET, value); }
    /** Unsafe version of {@link #arrayDesc(CUDA_ARRAY3D_DESCRIPTOR) arrayDesc}. */
    public static void narrayDesc(long struct, CUDA_ARRAY3D_DESCRIPTOR value) { memCopy(value.address(), struct + CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.ARRAYDESC, CUDA_ARRAY3D_DESCRIPTOR.SIZEOF); }
    /** Unsafe version of {@link #numLevels(int) numLevels}. */
    public static void nnumLevels(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.NUMLEVELS, value); }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.RESERVED + check(index, 16) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC} structs. */
    public static class Buffer extends StructBuffer<CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC, Buffer> implements NativeResource {

        private static final CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC ELEMENT_FACTORY = CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.create(-1L);

        /**
         * Creates a new {@code CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code offset} field. */
        @NativeType("unsigned long long")
        public long offset() { return CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.noffset(address()); }
        /** Returns a {@link CUDA_ARRAY3D_DESCRIPTOR} view of the {@code arrayDesc} field. */
        public CUDA_ARRAY3D_DESCRIPTOR arrayDesc() { return CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.narrayDesc(address()); }
        /** Returns the value of the {@code numLevels} field. */
        @NativeType("unsigned int")
        public int numLevels() { return CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.nnumLevels(address()); }
        /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned int[16]")
        public IntBuffer reserved() { return CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.nreserved(address()); }
        /** Returns the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned int")
        public int reserved(int index) { return CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.nreserved(address(), index); }

        /** Sets the specified value to the {@code offset} field. */
        public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer offset(@NativeType("unsigned long long") long value) { CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.noffset(address(), value); return this; }
        /** Copies the specified {@link CUDA_ARRAY3D_DESCRIPTOR} to the {@code arrayDesc} field. */
        public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer arrayDesc(CUDA_ARRAY3D_DESCRIPTOR value) { CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.narrayDesc(address(), value); return this; }
        /** Passes the {@code arrayDesc} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer arrayDesc(java.util.function.Consumer<CUDA_ARRAY3D_DESCRIPTOR> consumer) { consumer.accept(arrayDesc()); return this; }
        /** Sets the specified value to the {@code numLevels} field. */
        public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer numLevels(@NativeType("unsigned int") int value) { CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.nnumLevels(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer reserved(@NativeType("unsigned int[16]") IntBuffer value) { CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.Buffer reserved(int index, @NativeType("unsigned int") int value) { CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.nreserved(address(), index, value); return this; }

    }

}