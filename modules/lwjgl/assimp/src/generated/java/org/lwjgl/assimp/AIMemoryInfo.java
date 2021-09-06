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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Stores the memory requirements for different components (e.g. meshes, materials, animations) of an import. All sizes are in bytes.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiMemoryInfo {
 *     unsigned int {@link #textures};
 *     unsigned int {@link #materials};
 *     unsigned int {@link #meshes};
 *     unsigned int {@link #nodes};
 *     unsigned int {@link #animations};
 *     unsigned int {@link #cameras};
 *     unsigned int {@link #lights};
 *     unsigned int {@link #total};
 * }</code></pre>
 */
@NativeType("struct aiMemoryInfo")
public class AIMemoryInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TEXTURES,
        MATERIALS,
        MESHES,
        NODES,
        ANIMATIONS,
        CAMERAS,
        LIGHTS,
        TOTAL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TEXTURES = layout.offsetof(0);
        MATERIALS = layout.offsetof(1);
        MESHES = layout.offsetof(2);
        NODES = layout.offsetof(3);
        ANIMATIONS = layout.offsetof(4);
        CAMERAS = layout.offsetof(5);
        LIGHTS = layout.offsetof(6);
        TOTAL = layout.offsetof(7);
    }

    /**
     * Creates a {@code AIMemoryInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMemoryInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Storage allocated for texture data */
    @NativeType("unsigned int")
    public int textures() { return ntextures(address()); }
    /** Storage allocated for material data */
    @NativeType("unsigned int")
    public int materials() { return nmaterials(address()); }
    /** Storage allocated for mesh data */
    @NativeType("unsigned int")
    public int meshes() { return nmeshes(address()); }
    /** Storage allocated for node data */
    @NativeType("unsigned int")
    public int nodes() { return nnodes(address()); }
    /** Storage allocated for animation data */
    @NativeType("unsigned int")
    public int animations() { return nanimations(address()); }
    /** Storage allocated for camera data */
    @NativeType("unsigned int")
    public int cameras() { return ncameras(address()); }
    /** Storage allocated for light data */
    @NativeType("unsigned int")
    public int lights() { return nlights(address()); }
    /** Total storage allocated for the full import. */
    @NativeType("unsigned int")
    public int total() { return ntotal(address()); }

    // -----------------------------------

    /** Returns a new {@code AIMemoryInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMemoryInfo malloc() {
        return wrap(AIMemoryInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIMemoryInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMemoryInfo calloc() {
        return wrap(AIMemoryInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIMemoryInfo} instance allocated with {@link BufferUtils}. */
    public static AIMemoryInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIMemoryInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code AIMemoryInfo} instance for the specified memory address. */
    public static AIMemoryInfo create(long address) {
        return wrap(AIMemoryInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMemoryInfo createSafe(long address) {
        return address == NULL ? null : wrap(AIMemoryInfo.class, address);
    }

    /**
     * Returns a new {@link AIMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMemoryInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMemoryInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMemoryInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIMemoryInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIMemoryInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIMemoryInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMemoryInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMemoryInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMemoryInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMemoryInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMemoryInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMemoryInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMemoryInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMemoryInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMemoryInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIMemoryInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMemoryInfo malloc(MemoryStack stack) {
        return wrap(AIMemoryInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIMemoryInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMemoryInfo calloc(MemoryStack stack) {
        return wrap(AIMemoryInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMemoryInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMemoryInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #textures}. */
    public static int ntextures(long struct) { return UNSAFE.getInt(null, struct + AIMemoryInfo.TEXTURES); }
    /** Unsafe version of {@link #materials}. */
    public static int nmaterials(long struct) { return UNSAFE.getInt(null, struct + AIMemoryInfo.MATERIALS); }
    /** Unsafe version of {@link #meshes}. */
    public static int nmeshes(long struct) { return UNSAFE.getInt(null, struct + AIMemoryInfo.MESHES); }
    /** Unsafe version of {@link #nodes}. */
    public static int nnodes(long struct) { return UNSAFE.getInt(null, struct + AIMemoryInfo.NODES); }
    /** Unsafe version of {@link #animations}. */
    public static int nanimations(long struct) { return UNSAFE.getInt(null, struct + AIMemoryInfo.ANIMATIONS); }
    /** Unsafe version of {@link #cameras}. */
    public static int ncameras(long struct) { return UNSAFE.getInt(null, struct + AIMemoryInfo.CAMERAS); }
    /** Unsafe version of {@link #lights}. */
    public static int nlights(long struct) { return UNSAFE.getInt(null, struct + AIMemoryInfo.LIGHTS); }
    /** Unsafe version of {@link #total}. */
    public static int ntotal(long struct) { return UNSAFE.getInt(null, struct + AIMemoryInfo.TOTAL); }

    // -----------------------------------

    /** An array of {@link AIMemoryInfo} structs. */
    public static class Buffer extends StructBuffer<AIMemoryInfo, Buffer> implements NativeResource {

        private static final AIMemoryInfo ELEMENT_FACTORY = AIMemoryInfo.create(-1L);

        /**
         * Creates a new {@code AIMemoryInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMemoryInfo#SIZEOF}, and its mark will be undefined.
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
        protected AIMemoryInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AIMemoryInfo#textures} field. */
        @NativeType("unsigned int")
        public int textures() { return AIMemoryInfo.ntextures(address()); }
        /** @return the value of the {@link AIMemoryInfo#materials} field. */
        @NativeType("unsigned int")
        public int materials() { return AIMemoryInfo.nmaterials(address()); }
        /** @return the value of the {@link AIMemoryInfo#meshes} field. */
        @NativeType("unsigned int")
        public int meshes() { return AIMemoryInfo.nmeshes(address()); }
        /** @return the value of the {@link AIMemoryInfo#nodes} field. */
        @NativeType("unsigned int")
        public int nodes() { return AIMemoryInfo.nnodes(address()); }
        /** @return the value of the {@link AIMemoryInfo#animations} field. */
        @NativeType("unsigned int")
        public int animations() { return AIMemoryInfo.nanimations(address()); }
        /** @return the value of the {@link AIMemoryInfo#cameras} field. */
        @NativeType("unsigned int")
        public int cameras() { return AIMemoryInfo.ncameras(address()); }
        /** @return the value of the {@link AIMemoryInfo#lights} field. */
        @NativeType("unsigned int")
        public int lights() { return AIMemoryInfo.nlights(address()); }
        /** @return the value of the {@link AIMemoryInfo#total} field. */
        @NativeType("unsigned int")
        public int total() { return AIMemoryInfo.ntotal(address()); }

    }

}