/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Data structure for a material.
 * 
 * <p>Material data is stored using a key-value structure. A single key-value pair is called a 'material property'. C++ users should use the provided member
 * functions of {@code aiMaterial} to process material properties, C users have to stick with the {@code aiMaterialGetXXX} family of unbound functions.
 * The library defines a set of standard keys (AI_MATKEY_XXX).</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiMaterial {
 *     {@link AIMaterialProperty struct aiMaterialProperty} ** {@link #mProperties};
 *     unsigned int {@link #mNumProperties};
 *     unsigned int {@link #mNumAllocated};
 * }</code></pre>
 */
@NativeType("struct aiMaterial")
public class AIMaterial extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MPROPERTIES,
        MNUMPROPERTIES,
        MNUMALLOCATED;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MPROPERTIES = layout.offsetof(0);
        MNUMPROPERTIES = layout.offsetof(1);
        MNUMALLOCATED = layout.offsetof(2);
    }

    /**
     * Creates a {@code AIMaterial} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMaterial(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** List of all material properties loaded. */
    @NativeType("struct aiMaterialProperty **")
    public PointerBuffer mProperties() { return nmProperties(address()); }
    /** Number of properties in the data base */
    @NativeType("unsigned int")
    public int mNumProperties() { return nmNumProperties(address()); }
    /** Storage allocated */
    @NativeType("unsigned int")
    public int mNumAllocated() { return nmNumAllocated(address()); }

    /** Sets the address of the specified {@link PointerBuffer} to the {@link #mProperties} field. */
    public AIMaterial mProperties(@NativeType("struct aiMaterialProperty **") PointerBuffer value) { nmProperties(address(), value); return this; }
    /** Sets the specified value to the {@link #mNumAllocated} field. */
    public AIMaterial mNumAllocated(@NativeType("unsigned int") int value) { nmNumAllocated(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIMaterial set(
        PointerBuffer mProperties,
        int mNumAllocated
    ) {
        mProperties(mProperties);
        mNumAllocated(mNumAllocated);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIMaterial set(AIMaterial src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIMaterial} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMaterial malloc() {
        return wrap(AIMaterial.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIMaterial} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMaterial calloc() {
        return wrap(AIMaterial.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIMaterial} instance allocated with {@link BufferUtils}. */
    public static AIMaterial create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIMaterial.class, memAddress(container), container);
    }

    /** Returns a new {@code AIMaterial} instance for the specified memory address. */
    public static AIMaterial create(long address) {
        return wrap(AIMaterial.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMaterial createSafe(long address) {
        return address == NULL ? null : wrap(AIMaterial.class, address);
    }

    /**
     * Returns a new {@link AIMaterial.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMaterial.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIMaterial.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMaterial.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMaterial.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIMaterial.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIMaterial.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIMaterial.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMaterial.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMaterial mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMaterial callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMaterial mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMaterial callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMaterial.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMaterial.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMaterial.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMaterial.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIMaterial} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMaterial malloc(MemoryStack stack) {
        return wrap(AIMaterial.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIMaterial} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMaterial calloc(MemoryStack stack) {
        return wrap(AIMaterial.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIMaterial.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMaterial.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMaterial.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMaterial.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mProperties() mProperties}. */
    public static PointerBuffer nmProperties(long struct) { return memPointerBuffer(memGetAddress(struct + AIMaterial.MPROPERTIES), nmNumProperties(struct)); }
    /** Unsafe version of {@link #mNumProperties}. */
    public static int nmNumProperties(long struct) { return UNSAFE.getInt(null, struct + AIMaterial.MNUMPROPERTIES); }
    /** Unsafe version of {@link #mNumAllocated}. */
    public static int nmNumAllocated(long struct) { return UNSAFE.getInt(null, struct + AIMaterial.MNUMALLOCATED); }

    /** Unsafe version of {@link #mProperties(PointerBuffer) mProperties}. */
    public static void nmProperties(long struct, PointerBuffer value) { memPutAddress(struct + AIMaterial.MPROPERTIES, memAddress(value)); nmNumProperties(struct, value.remaining()); }
    /** Sets the specified value to the {@code mNumProperties} field of the specified {@code struct}. */
    public static void nmNumProperties(long struct, int value) { UNSAFE.putInt(null, struct + AIMaterial.MNUMPROPERTIES, value); }
    /** Unsafe version of {@link #mNumAllocated(int) mNumAllocated}. */
    public static void nmNumAllocated(long struct, int value) { UNSAFE.putInt(null, struct + AIMaterial.MNUMALLOCATED, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIMaterial.MPROPERTIES));
    }

    // -----------------------------------

    /** An array of {@link AIMaterial} structs. */
    public static class Buffer extends StructBuffer<AIMaterial, Buffer> implements NativeResource {

        private static final AIMaterial ELEMENT_FACTORY = AIMaterial.create(-1L);

        /**
         * Creates a new {@code AIMaterial.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMaterial#SIZEOF}, and its mark will be undefined.
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
        protected AIMaterial getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link AIMaterial#mProperties} field. */
        @NativeType("struct aiMaterialProperty **")
        public PointerBuffer mProperties() { return AIMaterial.nmProperties(address()); }
        /** @return the value of the {@link AIMaterial#mNumProperties} field. */
        @NativeType("unsigned int")
        public int mNumProperties() { return AIMaterial.nmNumProperties(address()); }
        /** @return the value of the {@link AIMaterial#mNumAllocated} field. */
        @NativeType("unsigned int")
        public int mNumAllocated() { return AIMaterial.nmNumAllocated(address()); }

        /** Sets the address of the specified {@link PointerBuffer} to the {@link AIMaterial#mProperties} field. */
        public AIMaterial.Buffer mProperties(@NativeType("struct aiMaterialProperty **") PointerBuffer value) { AIMaterial.nmProperties(address(), value); return this; }
        /** Sets the specified value to the {@link AIMaterial#mNumAllocated} field. */
        public AIMaterial.Buffer mNumAllocated(@NativeType("unsigned int") int value) { AIMaterial.nmNumAllocated(address(), value); return this; }

    }

}