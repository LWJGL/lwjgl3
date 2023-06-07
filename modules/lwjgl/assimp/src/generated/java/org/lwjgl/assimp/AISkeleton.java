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
 * A skeleton represents the bone hierarchy of an animation.
 * 
 * <p>Skeleton animations can be described as a tree of bones:</p>
 * 
 * <pre><code>
 *    root
 *      |
 *    node1
 *    /   \
 * node3  node4</code></pre>
 * 
 * <p>If you want to calculate the transformation of node three you need to compute the transformation hierarchy for the transformation chain of node3:</p>
 * 
 * <pre><code>
 * root-&gt;node1-&gt;node3</code></pre>
 * 
 * <p>Each node is represented as a skeleton instance.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiSkeleton {
 *     {@link AIString struct aiString} {@link #mName};
 *     unsigned int {@link #mNumBones};
 *     {@link AISkeletonBone struct aiSkeletonBone} ** {@link #mBones};
 * }</code></pre>
 */
@NativeType("struct aiSkeleton")
public class AISkeleton extends Struct<AISkeleton> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MNUMBONES,
        MBONES;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MNUMBONES = layout.offsetof(1);
        MBONES = layout.offsetof(2);
    }

    protected AISkeleton(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AISkeleton create(long address, @Nullable ByteBuffer container) {
        return new AISkeleton(address, container);
    }

    /**
     * Creates a {@code AISkeleton} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AISkeleton(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the name of the skeleton instance */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** the number of bones in the skeleton */
    @NativeType("unsigned int")
    public int mNumBones() { return nmNumBones(address()); }
    /** the bone instance in the skeleton */
    @NativeType("struct aiSkeletonBone **")
    public PointerBuffer mBones() { return nmBones(address()); }

    /** Copies the specified {@link AIString} to the {@link #mName} field. */
    public AISkeleton mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Passes the {@link #mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AISkeleton mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #mBones} field. */
    public AISkeleton mBones(@NativeType("struct aiSkeletonBone **") PointerBuffer value) { nmBones(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AISkeleton set(
        AIString mName,
        PointerBuffer mBones
    ) {
        mName(mName);
        mBones(mBones);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AISkeleton set(AISkeleton src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AISkeleton} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AISkeleton malloc() {
        return new AISkeleton(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AISkeleton} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AISkeleton calloc() {
        return new AISkeleton(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AISkeleton} instance allocated with {@link BufferUtils}. */
    public static AISkeleton create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AISkeleton(memAddress(container), container);
    }

    /** Returns a new {@code AISkeleton} instance for the specified memory address. */
    public static AISkeleton create(long address) {
        return new AISkeleton(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AISkeleton createSafe(long address) {
        return address == NULL ? null : new AISkeleton(address, null);
    }

    /**
     * Returns a new {@link AISkeleton.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AISkeleton.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AISkeleton.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AISkeleton.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AISkeleton.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AISkeleton.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AISkeleton.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AISkeleton.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AISkeleton.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code AISkeleton} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AISkeleton malloc(MemoryStack stack) {
        return new AISkeleton(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AISkeleton} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AISkeleton calloc(MemoryStack stack) {
        return new AISkeleton(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AISkeleton.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AISkeleton.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AISkeleton.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AISkeleton.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AISkeleton.MNAME); }
    /** Unsafe version of {@link #mNumBones}. */
    public static int nmNumBones(long struct) { return UNSAFE.getInt(null, struct + AISkeleton.MNUMBONES); }
    /** Unsafe version of {@link #mBones() mBones}. */
    public static PointerBuffer nmBones(long struct) { return memPointerBuffer(memGetAddress(struct + AISkeleton.MBONES), nmNumBones(struct)); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AISkeleton.MNAME, AIString.SIZEOF); }
    /** Sets the specified value to the {@code mNumBones} field of the specified {@code struct}. */
    public static void nmNumBones(long struct, int value) { UNSAFE.putInt(null, struct + AISkeleton.MNUMBONES, value); }
    /** Unsafe version of {@link #mBones(PointerBuffer) mBones}. */
    public static void nmBones(long struct, PointerBuffer value) { memPutAddress(struct + AISkeleton.MBONES, memAddress(value)); nmNumBones(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AISkeleton.MBONES));
    }

    // -----------------------------------

    /** An array of {@link AISkeleton} structs. */
    public static class Buffer extends StructBuffer<AISkeleton, Buffer> implements NativeResource {

        private static final AISkeleton ELEMENT_FACTORY = AISkeleton.create(-1L);

        /**
         * Creates a new {@code AISkeleton.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AISkeleton#SIZEOF}, and its mark will be undefined.</p>
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
        protected AISkeleton getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIString} view of the {@link AISkeleton#mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AISkeleton.nmName(address()); }
        /** @return the value of the {@link AISkeleton#mNumBones} field. */
        @NativeType("unsigned int")
        public int mNumBones() { return AISkeleton.nmNumBones(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link AISkeleton#mBones} field. */
        @NativeType("struct aiSkeletonBone **")
        public PointerBuffer mBones() { return AISkeleton.nmBones(address()); }

        /** Copies the specified {@link AIString} to the {@link AISkeleton#mName} field. */
        public AISkeleton.Buffer mName(@NativeType("struct aiString") AIString value) { AISkeleton.nmName(address(), value); return this; }
        /** Passes the {@link AISkeleton#mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AISkeleton.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link AISkeleton#mBones} field. */
        public AISkeleton.Buffer mBones(@NativeType("struct aiSkeletonBone **") PointerBuffer value) { AISkeleton.nmBones(address(), value); return this; }

    }

}