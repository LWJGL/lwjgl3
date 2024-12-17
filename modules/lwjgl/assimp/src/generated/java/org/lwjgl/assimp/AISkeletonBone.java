/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct aiSkeletonBone {
 *     int mParent;
 *     {@link AINode struct aiNode} * mArmature;
 *     {@link AINode struct aiNode} * mNode;
 *     unsigned int mNumnWeights;
 *     {@link AIMesh struct aiMesh} * mMeshId;
 *     {@link AIVertexWeight struct aiVertexWeight} * mWeights;
 *     {@link AIMatrix4x4 struct aiMatrix4x4} mOffsetMatrix;
 *     {@link AIMatrix4x4 struct aiMatrix4x4} mLocalMatrix;
 * }}</pre>
 */
@NativeType("struct aiSkeletonBone")
public class AISkeletonBone extends Struct<AISkeletonBone> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MPARENT,
        MARMATURE,
        MNODE,
        MNUMNWEIGHTS,
        MMESHID,
        MWEIGHTS,
        MOFFSETMATRIX,
        MLOCALMATRIX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(AIMatrix4x4.SIZEOF, AIMatrix4x4.ALIGNOF),
            __member(AIMatrix4x4.SIZEOF, AIMatrix4x4.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MPARENT = layout.offsetof(0);
        MARMATURE = layout.offsetof(1);
        MNODE = layout.offsetof(2);
        MNUMNWEIGHTS = layout.offsetof(3);
        MMESHID = layout.offsetof(4);
        MWEIGHTS = layout.offsetof(5);
        MOFFSETMATRIX = layout.offsetof(6);
        MLOCALMATRIX = layout.offsetof(7);
    }

    protected AISkeletonBone(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AISkeletonBone create(long address, @Nullable ByteBuffer container) {
        return new AISkeletonBone(address, container);
    }

    /**
     * Creates a {@code AISkeletonBone} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AISkeletonBone(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code mParent} field. */
    public int mParent() { return nmParent(address()); }
    /** @return a {@link AINode} view of the struct pointed to by the {@code mArmature} field. */
    @NativeType("struct aiNode *")
    public @Nullable AINode mArmature() { return nmArmature(address()); }
    /** @return a {@link AINode} view of the struct pointed to by the {@code mNode} field. */
    @NativeType("struct aiNode *")
    public @Nullable AINode mNode() { return nmNode(address()); }
    /** @return the value of the {@code mNumnWeights} field. */
    @NativeType("unsigned int")
    public int mNumnWeights() { return nmNumnWeights(address()); }
    /** @return a {@link AIMesh.Buffer} view of the struct array pointed to by the {@code mMeshId} field. */
    @NativeType("struct aiMesh *")
    public AIMesh.Buffer mMeshId() { return nmMeshId(address()); }
    /** @return a {@link AIVertexWeight.Buffer} view of the struct array pointed to by the {@code mWeights} field. */
    @NativeType("struct aiVertexWeight *")
    public AIVertexWeight.Buffer mWeights() { return nmWeights(address()); }
    /** @return a {@link AIMatrix4x4} view of the {@code mOffsetMatrix} field. */
    @NativeType("struct aiMatrix4x4")
    public AIMatrix4x4 mOffsetMatrix() { return nmOffsetMatrix(address()); }
    /** @return a {@link AIMatrix4x4} view of the {@code mLocalMatrix} field. */
    @NativeType("struct aiMatrix4x4")
    public AIMatrix4x4 mLocalMatrix() { return nmLocalMatrix(address()); }

    /** Sets the specified value to the {@code mParent} field. */
    public AISkeletonBone mParent(int value) { nmParent(address(), value); return this; }
    /** Sets the address of the specified {@link AINode} to the {@code mArmature} field. */
    public AISkeletonBone mArmature(@Nullable @NativeType("struct aiNode *") AINode value) { nmArmature(address(), value); return this; }
    /** Sets the address of the specified {@link AINode} to the {@code mNode} field. */
    public AISkeletonBone mNode(@Nullable @NativeType("struct aiNode *") AINode value) { nmNode(address(), value); return this; }
    /** Sets the specified value to the {@code mNumnWeights} field. */
    public AISkeletonBone mNumnWeights(@NativeType("unsigned int") int value) { nmNumnWeights(address(), value); return this; }
    /** Sets the address of the specified {@link AIMesh.Buffer} to the {@code mMeshId} field. */
    public AISkeletonBone mMeshId(@NativeType("struct aiMesh *") AIMesh.Buffer value) { nmMeshId(address(), value); return this; }
    /** Sets the address of the specified {@link AIVertexWeight.Buffer} to the {@code mWeights} field. */
    public AISkeletonBone mWeights(@NativeType("struct aiVertexWeight *") AIVertexWeight.Buffer value) { nmWeights(address(), value); return this; }
    /** Copies the specified {@link AIMatrix4x4} to the {@code mOffsetMatrix} field. */
    public AISkeletonBone mOffsetMatrix(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { nmOffsetMatrix(address(), value); return this; }
    /** Passes the {@code mOffsetMatrix} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AISkeletonBone mOffsetMatrix(java.util.function.Consumer<AIMatrix4x4> consumer) { consumer.accept(mOffsetMatrix()); return this; }
    /** Copies the specified {@link AIMatrix4x4} to the {@code mLocalMatrix} field. */
    public AISkeletonBone mLocalMatrix(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { nmLocalMatrix(address(), value); return this; }
    /** Passes the {@code mLocalMatrix} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AISkeletonBone mLocalMatrix(java.util.function.Consumer<AIMatrix4x4> consumer) { consumer.accept(mLocalMatrix()); return this; }

    /** Initializes this struct with the specified values. */
    public AISkeletonBone set(
        int mParent,
        @Nullable AINode mArmature,
        @Nullable AINode mNode,
        int mNumnWeights,
        AIMesh.Buffer mMeshId,
        AIVertexWeight.Buffer mWeights,
        AIMatrix4x4 mOffsetMatrix,
        AIMatrix4x4 mLocalMatrix
    ) {
        mParent(mParent);
        mArmature(mArmature);
        mNode(mNode);
        mNumnWeights(mNumnWeights);
        mMeshId(mMeshId);
        mWeights(mWeights);
        mOffsetMatrix(mOffsetMatrix);
        mLocalMatrix(mLocalMatrix);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AISkeletonBone set(AISkeletonBone src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AISkeletonBone} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AISkeletonBone malloc() {
        return new AISkeletonBone(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AISkeletonBone} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AISkeletonBone calloc() {
        return new AISkeletonBone(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AISkeletonBone} instance allocated with {@link BufferUtils}. */
    public static AISkeletonBone create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AISkeletonBone(memAddress(container), container);
    }

    /** Returns a new {@code AISkeletonBone} instance for the specified memory address. */
    public static AISkeletonBone create(long address) {
        return new AISkeletonBone(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AISkeletonBone createSafe(long address) {
        return address == NULL ? null : new AISkeletonBone(address, null);
    }

    /**
     * Returns a new {@link AISkeletonBone.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AISkeletonBone.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AISkeletonBone.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AISkeletonBone.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AISkeletonBone.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AISkeletonBone.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AISkeletonBone.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AISkeletonBone.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AISkeletonBone.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code AISkeletonBone} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AISkeletonBone malloc(MemoryStack stack) {
        return new AISkeletonBone(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AISkeletonBone} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AISkeletonBone calloc(MemoryStack stack) {
        return new AISkeletonBone(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AISkeletonBone.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AISkeletonBone.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AISkeletonBone.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AISkeletonBone.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mParent}. */
    public static int nmParent(long struct) { return memGetInt(struct + AISkeletonBone.MPARENT); }
    /** Unsafe version of {@link #mArmature}. */
    public static @Nullable AINode nmArmature(long struct) { return AINode.createSafe(memGetAddress(struct + AISkeletonBone.MARMATURE)); }
    /** Unsafe version of {@link #mNode}. */
    public static @Nullable AINode nmNode(long struct) { return AINode.createSafe(memGetAddress(struct + AISkeletonBone.MNODE)); }
    /** Unsafe version of {@link #mNumnWeights}. */
    public static int nmNumnWeights(long struct) { return memGetInt(struct + AISkeletonBone.MNUMNWEIGHTS); }
    /** Unsafe version of {@link #mMeshId}. */
    public static AIMesh.Buffer nmMeshId(long struct) { return AIMesh.create(memGetAddress(struct + AISkeletonBone.MMESHID), nmNumnWeights(struct)); }
    /** Unsafe version of {@link #mWeights}. */
    public static AIVertexWeight.Buffer nmWeights(long struct) { return AIVertexWeight.create(memGetAddress(struct + AISkeletonBone.MWEIGHTS), nmNumnWeights(struct)); }
    /** Unsafe version of {@link #mOffsetMatrix}. */
    public static AIMatrix4x4 nmOffsetMatrix(long struct) { return AIMatrix4x4.create(struct + AISkeletonBone.MOFFSETMATRIX); }
    /** Unsafe version of {@link #mLocalMatrix}. */
    public static AIMatrix4x4 nmLocalMatrix(long struct) { return AIMatrix4x4.create(struct + AISkeletonBone.MLOCALMATRIX); }

    /** Unsafe version of {@link #mParent(int) mParent}. */
    public static void nmParent(long struct, int value) { memPutInt(struct + AISkeletonBone.MPARENT, value); }
    /** Unsafe version of {@link #mArmature(AINode) mArmature}. */
    public static void nmArmature(long struct, @Nullable AINode value) { memPutAddress(struct + AISkeletonBone.MARMATURE, memAddressSafe(value)); }
    /** Unsafe version of {@link #mNode(AINode) mNode}. */
    public static void nmNode(long struct, @Nullable AINode value) { memPutAddress(struct + AISkeletonBone.MNODE, memAddressSafe(value)); }
    /** Sets the specified value to the {@code mNumnWeights} field of the specified {@code struct}. */
    public static void nmNumnWeights(long struct, int value) { memPutInt(struct + AISkeletonBone.MNUMNWEIGHTS, value); }
    /** Unsafe version of {@link #mMeshId(AIMesh.Buffer) mMeshId}. */
    public static void nmMeshId(long struct, AIMesh.Buffer value) { memPutAddress(struct + AISkeletonBone.MMESHID, value.address()); }
    /** Unsafe version of {@link #mWeights(AIVertexWeight.Buffer) mWeights}. */
    public static void nmWeights(long struct, AIVertexWeight.Buffer value) { memPutAddress(struct + AISkeletonBone.MWEIGHTS, value.address()); }
    /** Unsafe version of {@link #mOffsetMatrix(AIMatrix4x4) mOffsetMatrix}. */
    public static void nmOffsetMatrix(long struct, AIMatrix4x4 value) { memCopy(value.address(), struct + AISkeletonBone.MOFFSETMATRIX, AIMatrix4x4.SIZEOF); }
    /** Unsafe version of {@link #mLocalMatrix(AIMatrix4x4) mLocalMatrix}. */
    public static void nmLocalMatrix(long struct, AIMatrix4x4 value) { memCopy(value.address(), struct + AISkeletonBone.MLOCALMATRIX, AIMatrix4x4.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long mArmature = memGetAddress(struct + AISkeletonBone.MARMATURE);
        if (mArmature != NULL) {
            AINode.validate(mArmature);
        }
        long mNode = memGetAddress(struct + AISkeletonBone.MNODE);
        if (mNode != NULL) {
            AINode.validate(mNode);
        }
        int mNumnWeights = nmNumnWeights(struct);
        long mMeshId = memGetAddress(struct + AISkeletonBone.MMESHID);
        check(mMeshId);
        validate(mMeshId, mNumnWeights, AIMesh.SIZEOF, AIMesh::validate);
        check(memGetAddress(struct + AISkeletonBone.MWEIGHTS));
    }

    // -----------------------------------

    /** An array of {@link AISkeletonBone} structs. */
    public static class Buffer extends StructBuffer<AISkeletonBone, Buffer> implements NativeResource {

        private static final AISkeletonBone ELEMENT_FACTORY = AISkeletonBone.create(-1L);

        /**
         * Creates a new {@code AISkeletonBone.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AISkeletonBone#SIZEOF}, and its mark will be undefined.</p>
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
        protected AISkeletonBone getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code mParent} field. */
        public int mParent() { return AISkeletonBone.nmParent(address()); }
        /** @return a {@link AINode} view of the struct pointed to by the {@code mArmature} field. */
        @NativeType("struct aiNode *")
        public @Nullable AINode mArmature() { return AISkeletonBone.nmArmature(address()); }
        /** @return a {@link AINode} view of the struct pointed to by the {@code mNode} field. */
        @NativeType("struct aiNode *")
        public @Nullable AINode mNode() { return AISkeletonBone.nmNode(address()); }
        /** @return the value of the {@code mNumnWeights} field. */
        @NativeType("unsigned int")
        public int mNumnWeights() { return AISkeletonBone.nmNumnWeights(address()); }
        /** @return a {@link AIMesh.Buffer} view of the struct array pointed to by the {@code mMeshId} field. */
        @NativeType("struct aiMesh *")
        public AIMesh.Buffer mMeshId() { return AISkeletonBone.nmMeshId(address()); }
        /** @return a {@link AIVertexWeight.Buffer} view of the struct array pointed to by the {@code mWeights} field. */
        @NativeType("struct aiVertexWeight *")
        public AIVertexWeight.Buffer mWeights() { return AISkeletonBone.nmWeights(address()); }
        /** @return a {@link AIMatrix4x4} view of the {@code mOffsetMatrix} field. */
        @NativeType("struct aiMatrix4x4")
        public AIMatrix4x4 mOffsetMatrix() { return AISkeletonBone.nmOffsetMatrix(address()); }
        /** @return a {@link AIMatrix4x4} view of the {@code mLocalMatrix} field. */
        @NativeType("struct aiMatrix4x4")
        public AIMatrix4x4 mLocalMatrix() { return AISkeletonBone.nmLocalMatrix(address()); }

        /** Sets the specified value to the {@code mParent} field. */
        public AISkeletonBone.Buffer mParent(int value) { AISkeletonBone.nmParent(address(), value); return this; }
        /** Sets the address of the specified {@link AINode} to the {@code mArmature} field. */
        public AISkeletonBone.Buffer mArmature(@Nullable @NativeType("struct aiNode *") AINode value) { AISkeletonBone.nmArmature(address(), value); return this; }
        /** Sets the address of the specified {@link AINode} to the {@code mNode} field. */
        public AISkeletonBone.Buffer mNode(@Nullable @NativeType("struct aiNode *") AINode value) { AISkeletonBone.nmNode(address(), value); return this; }
        /** Sets the specified value to the {@code mNumnWeights} field. */
        public AISkeletonBone.Buffer mNumnWeights(@NativeType("unsigned int") int value) { AISkeletonBone.nmNumnWeights(address(), value); return this; }
        /** Sets the address of the specified {@link AIMesh.Buffer} to the {@code mMeshId} field. */
        public AISkeletonBone.Buffer mMeshId(@NativeType("struct aiMesh *") AIMesh.Buffer value) { AISkeletonBone.nmMeshId(address(), value); return this; }
        /** Sets the address of the specified {@link AIVertexWeight.Buffer} to the {@code mWeights} field. */
        public AISkeletonBone.Buffer mWeights(@NativeType("struct aiVertexWeight *") AIVertexWeight.Buffer value) { AISkeletonBone.nmWeights(address(), value); return this; }
        /** Copies the specified {@link AIMatrix4x4} to the {@code mOffsetMatrix} field. */
        public AISkeletonBone.Buffer mOffsetMatrix(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { AISkeletonBone.nmOffsetMatrix(address(), value); return this; }
        /** Passes the {@code mOffsetMatrix} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AISkeletonBone.Buffer mOffsetMatrix(java.util.function.Consumer<AIMatrix4x4> consumer) { consumer.accept(mOffsetMatrix()); return this; }
        /** Copies the specified {@link AIMatrix4x4} to the {@code mLocalMatrix} field. */
        public AISkeletonBone.Buffer mLocalMatrix(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { AISkeletonBone.nmLocalMatrix(address(), value); return this; }
        /** Passes the {@code mLocalMatrix} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AISkeletonBone.Buffer mLocalMatrix(java.util.function.Consumer<AIMatrix4x4> consumer) { consumer.accept(mLocalMatrix()); return this; }

    }

}