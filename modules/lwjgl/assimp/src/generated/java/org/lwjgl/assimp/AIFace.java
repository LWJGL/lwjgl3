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
 * A single face in a mesh, referring to multiple vertices.
 * 
 * <p>If {@code mNumIndices} is 3, we call the face 'triangle', for {@code mNumIndices > 3} it's called 'polygon' (hey, that's just a definition!).</p>
 * 
 * <p>{@link AIMesh}{@code ::mPrimitiveTypes} can be queried to quickly examine which types of primitive are actually present in a mesh. The {@link Assimp#aiProcess_SortByPType Process_SortByPType}
 * flag executes a special post-processing algorithm which splits meshes with *different* primitive types mixed up (e.g. lines and triangles) in several
 * 'clean' submeshes. Furthermore there is a configuration option ({@link Assimp#AI_CONFIG_PP_SBP_REMOVE}) to force {@link Assimp#aiProcess_SortByPType Process_SortByPType} to remove specific kinds of
 * primitives from the imported scene, completely and forever.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiFace {
 *     unsigned int {@link #mNumIndices};
 *     unsigned int * {@link #mIndices};
 * }</code></pre>
 */
@NativeType("struct aiFace")
public class AIFace extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNUMINDICES,
        MINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNUMINDICES = layout.offsetof(0);
        MINDICES = layout.offsetof(1);
    }

    /**
     * Creates a {@code AIFace} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIFace(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Number of indices defining this face. The maximum value for this member is {@link Assimp#AI_MAX_FACE_INDICES}. */
    @NativeType("unsigned int")
    public int mNumIndices() { return nmNumIndices(address()); }
    /** Pointer to the indices array. Size of the array is given in {@code numIndices}. */
    @NativeType("unsigned int *")
    public IntBuffer mIndices() { return nmIndices(address()); }

    /** Sets the address of the specified {@link IntBuffer} to the {@link #mIndices} field. */
    public AIFace mIndices(@NativeType("unsigned int *") IntBuffer value) { nmIndices(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIFace set(AIFace src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIFace} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIFace malloc() {
        return wrap(AIFace.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIFace} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIFace calloc() {
        return wrap(AIFace.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIFace} instance allocated with {@link BufferUtils}. */
    public static AIFace create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIFace.class, memAddress(container), container);
    }

    /** Returns a new {@code AIFace} instance for the specified memory address. */
    public static AIFace create(long address) {
        return wrap(AIFace.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIFace createSafe(long address) {
        return address == NULL ? null : wrap(AIFace.class, address);
    }

    /**
     * Returns a new {@link AIFace.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIFace.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIFace.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIFace.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIFace.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIFace.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIFace.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIFace.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIFace.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIFace mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIFace callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIFace mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIFace callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFace.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFace.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFace.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFace.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIFace} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIFace malloc(MemoryStack stack) {
        return wrap(AIFace.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIFace} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIFace calloc(MemoryStack stack) {
        return wrap(AIFace.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIFace.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIFace.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIFace.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIFace.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mNumIndices}. */
    public static int nmNumIndices(long struct) { return UNSAFE.getInt(null, struct + AIFace.MNUMINDICES); }
    /** Unsafe version of {@link #mIndices() mIndices}. */
    public static IntBuffer nmIndices(long struct) { return memIntBuffer(memGetAddress(struct + AIFace.MINDICES), nmNumIndices(struct)); }

    /** Sets the specified value to the {@code mNumIndices} field of the specified {@code struct}. */
    public static void nmNumIndices(long struct, int value) { UNSAFE.putInt(null, struct + AIFace.MNUMINDICES, value); }
    /** Unsafe version of {@link #mIndices(IntBuffer) mIndices}. */
    public static void nmIndices(long struct, IntBuffer value) { memPutAddress(struct + AIFace.MINDICES, memAddress(value)); nmNumIndices(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIFace.MINDICES));
    }

    // -----------------------------------

    /** An array of {@link AIFace} structs. */
    public static class Buffer extends StructBuffer<AIFace, Buffer> implements NativeResource {

        private static final AIFace ELEMENT_FACTORY = AIFace.create(-1L);

        /**
         * Creates a new {@code AIFace.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIFace#SIZEOF}, and its mark will be undefined.
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
        protected AIFace getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AIFace#mNumIndices} field. */
        @NativeType("unsigned int")
        public int mNumIndices() { return AIFace.nmNumIndices(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link AIFace#mIndices} field. */
        @NativeType("unsigned int *")
        public IntBuffer mIndices() { return AIFace.nmIndices(address()); }

        /** Sets the address of the specified {@link IntBuffer} to the {@link AIFace#mIndices} field. */
        public AIFace.Buffer mIndices(@NativeType("unsigned int *") IntBuffer value) { AIFace.nmIndices(address(), value); return this; }

    }

}