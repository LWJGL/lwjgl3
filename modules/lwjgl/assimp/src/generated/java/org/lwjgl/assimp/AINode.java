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
 * <pre><code>
 * struct aiNode {
 *     {@link AIString struct aiString} mName;
 *     {@link AIMatrix4x4 struct aiMatrix4x4} mTransformation;
 *     {@link AINode struct aiNode} * mParent;
 *     unsigned int mNumChildren;
 *     {@link AINode struct aiNode} ** mChildren;
 *     unsigned int mNumMeshes;
 *     unsigned int * mMeshes;
 *     {@link AIMetaData struct aiMetadata} * mMetadata;
 * }</code></pre>
 */
@NativeType("struct aiNode")
public class AINode extends Struct<AINode> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MTRANSFORMATION,
        MPARENT,
        MNUMCHILDREN,
        MCHILDREN,
        MNUMMESHES,
        MMESHES,
        MMETADATA;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(AIMatrix4x4.SIZEOF, AIMatrix4x4.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MTRANSFORMATION = layout.offsetof(1);
        MPARENT = layout.offsetof(2);
        MNUMCHILDREN = layout.offsetof(3);
        MCHILDREN = layout.offsetof(4);
        MNUMMESHES = layout.offsetof(5);
        MMESHES = layout.offsetof(6);
        MMETADATA = layout.offsetof(7);
    }

    protected AINode(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AINode create(long address, @Nullable ByteBuffer container) {
        return new AINode(address, container);
    }

    /**
     * Creates a {@code AINode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AINode(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** @return a {@link AIMatrix4x4} view of the {@code mTransformation} field. */
    @NativeType("struct aiMatrix4x4")
    public AIMatrix4x4 mTransformation() { return nmTransformation(address()); }
    /** @return a {@link AINode} view of the struct pointed to by the {@code mParent} field. */
    @NativeType("struct aiNode *")
    public @Nullable AINode mParent() { return nmParent(address()); }
    /** @return the value of the {@code mNumChildren} field. */
    @NativeType("unsigned int")
    public int mNumChildren() { return nmNumChildren(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mChildren} field. */
    @NativeType("struct aiNode **")
    public @Nullable PointerBuffer mChildren() { return nmChildren(address()); }
    /** @return the value of the {@code mNumMeshes} field. */
    @NativeType("unsigned int")
    public int mNumMeshes() { return nmNumMeshes(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code mMeshes} field. */
    @NativeType("unsigned int *")
    public @Nullable IntBuffer mMeshes() { return nmMeshes(address()); }
    /** @return a {@link AIMetaData} view of the struct pointed to by the {@code mMetadata} field. */
    @NativeType("struct aiMetadata *")
    public @Nullable AIMetaData mMetadata() { return nmMetadata(address()); }

    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AINode mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AINode mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Copies the specified {@link AIMatrix4x4} to the {@code mTransformation} field. */
    public AINode mTransformation(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { nmTransformation(address(), value); return this; }
    /** Passes the {@code mTransformation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AINode mTransformation(java.util.function.Consumer<AIMatrix4x4> consumer) { consumer.accept(mTransformation()); return this; }
    /** Sets the address of the specified {@link AINode} to the {@code mParent} field. */
    public AINode mParent(@Nullable @NativeType("struct aiNode *") AINode value) { nmParent(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mChildren} field. */
    public AINode mChildren(@Nullable @NativeType("struct aiNode **") PointerBuffer value) { nmChildren(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code mMeshes} field. */
    public AINode mMeshes(@Nullable @NativeType("unsigned int *") IntBuffer value) { nmMeshes(address(), value); return this; }
    /** Sets the address of the specified {@link AIMetaData} to the {@code mMetadata} field. */
    public AINode mMetadata(@Nullable @NativeType("struct aiMetadata *") AIMetaData value) { nmMetadata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AINode set(
        AIString mName,
        AIMatrix4x4 mTransformation,
        @Nullable AINode mParent,
        @Nullable PointerBuffer mChildren,
        @Nullable IntBuffer mMeshes,
        @Nullable AIMetaData mMetadata
    ) {
        mName(mName);
        mTransformation(mTransformation);
        mParent(mParent);
        mChildren(mChildren);
        mMeshes(mMeshes);
        mMetadata(mMetadata);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AINode set(AINode src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AINode} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AINode malloc() {
        return new AINode(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AINode} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AINode calloc() {
        return new AINode(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AINode} instance allocated with {@link BufferUtils}. */
    public static AINode create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AINode(memAddress(container), container);
    }

    /** Returns a new {@code AINode} instance for the specified memory address. */
    public static AINode create(long address) {
        return new AINode(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AINode createSafe(long address) {
        return address == NULL ? null : new AINode(address, null);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AINode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AINode.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AINode mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AINode callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AINode mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AINode callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AINode.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AINode.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AINode.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AINode.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AINode} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AINode malloc(MemoryStack stack) {
        return new AINode(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AINode} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AINode calloc(MemoryStack stack) {
        return new AINode(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AINode.MNAME); }
    /** Unsafe version of {@link #mTransformation}. */
    public static AIMatrix4x4 nmTransformation(long struct) { return AIMatrix4x4.create(struct + AINode.MTRANSFORMATION); }
    /** Unsafe version of {@link #mParent}. */
    public static @Nullable AINode nmParent(long struct) { return AINode.createSafe(memGetAddress(struct + AINode.MPARENT)); }
    /** Unsafe version of {@link #mNumChildren}. */
    public static int nmNumChildren(long struct) { return memGetInt(struct + AINode.MNUMCHILDREN); }
    /** Unsafe version of {@link #mChildren() mChildren}. */
    public static @Nullable PointerBuffer nmChildren(long struct) { return memPointerBufferSafe(memGetAddress(struct + AINode.MCHILDREN), nmNumChildren(struct)); }
    /** Unsafe version of {@link #mNumMeshes}. */
    public static int nmNumMeshes(long struct) { return memGetInt(struct + AINode.MNUMMESHES); }
    /** Unsafe version of {@link #mMeshes() mMeshes}. */
    public static @Nullable IntBuffer nmMeshes(long struct) { return memIntBufferSafe(memGetAddress(struct + AINode.MMESHES), nmNumMeshes(struct)); }
    /** Unsafe version of {@link #mMetadata}. */
    public static @Nullable AIMetaData nmMetadata(long struct) { return AIMetaData.createSafe(memGetAddress(struct + AINode.MMETADATA)); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AINode.MNAME, AIString.SIZEOF); }
    /** Unsafe version of {@link #mTransformation(AIMatrix4x4) mTransformation}. */
    public static void nmTransformation(long struct, AIMatrix4x4 value) { memCopy(value.address(), struct + AINode.MTRANSFORMATION, AIMatrix4x4.SIZEOF); }
    /** Unsafe version of {@link #mParent(AINode) mParent}. */
    public static void nmParent(long struct, @Nullable AINode value) { memPutAddress(struct + AINode.MPARENT, memAddressSafe(value)); }
    /** Sets the specified value to the {@code mNumChildren} field of the specified {@code struct}. */
    public static void nmNumChildren(long struct, int value) { memPutInt(struct + AINode.MNUMCHILDREN, value); }
    /** Unsafe version of {@link #mChildren(PointerBuffer) mChildren}. */
    public static void nmChildren(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AINode.MCHILDREN, memAddressSafe(value)); nmNumChildren(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumMeshes} field of the specified {@code struct}. */
    public static void nmNumMeshes(long struct, int value) { memPutInt(struct + AINode.MNUMMESHES, value); }
    /** Unsafe version of {@link #mMeshes(IntBuffer) mMeshes}. */
    public static void nmMeshes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + AINode.MMESHES, memAddressSafe(value)); nmNumMeshes(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #mMetadata(AIMetaData) mMetadata}. */
    public static void nmMetadata(long struct, @Nullable AIMetaData value) { memPutAddress(struct + AINode.MMETADATA, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nmNumChildren(struct) != 0) {
            check(memGetAddress(struct + AINode.MCHILDREN));
        }
        if (nmNumMeshes(struct) != 0) {
            check(memGetAddress(struct + AINode.MMESHES));
        }
        long mMetadata = memGetAddress(struct + AINode.MMETADATA);
        if (mMetadata != NULL) {
            AIMetaData.validate(mMetadata);
        }
    }

    // -----------------------------------

    /** An array of {@link AINode} structs. */
    public static class Buffer extends StructBuffer<AINode, Buffer> implements NativeResource {

        private static final AINode ELEMENT_FACTORY = AINode.create(-1L);

        /**
         * Creates a new {@code AINode.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AINode#SIZEOF}, and its mark will be undefined.</p>
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
        protected AINode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AINode.nmName(address()); }
        /** @return a {@link AIMatrix4x4} view of the {@code mTransformation} field. */
        @NativeType("struct aiMatrix4x4")
        public AIMatrix4x4 mTransformation() { return AINode.nmTransformation(address()); }
        /** @return a {@link AINode} view of the struct pointed to by the {@code mParent} field. */
        @NativeType("struct aiNode *")
        public @Nullable AINode mParent() { return AINode.nmParent(address()); }
        /** @return the value of the {@code mNumChildren} field. */
        @NativeType("unsigned int")
        public int mNumChildren() { return AINode.nmNumChildren(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mChildren} field. */
        @NativeType("struct aiNode **")
        public @Nullable PointerBuffer mChildren() { return AINode.nmChildren(address()); }
        /** @return the value of the {@code mNumMeshes} field. */
        @NativeType("unsigned int")
        public int mNumMeshes() { return AINode.nmNumMeshes(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code mMeshes} field. */
        @NativeType("unsigned int *")
        public @Nullable IntBuffer mMeshes() { return AINode.nmMeshes(address()); }
        /** @return a {@link AIMetaData} view of the struct pointed to by the {@code mMetadata} field. */
        @NativeType("struct aiMetadata *")
        public @Nullable AIMetaData mMetadata() { return AINode.nmMetadata(address()); }

        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AINode.Buffer mName(@NativeType("struct aiString") AIString value) { AINode.nmName(address(), value); return this; }
        /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AINode.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Copies the specified {@link AIMatrix4x4} to the {@code mTransformation} field. */
        public AINode.Buffer mTransformation(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { AINode.nmTransformation(address(), value); return this; }
        /** Passes the {@code mTransformation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AINode.Buffer mTransformation(java.util.function.Consumer<AIMatrix4x4> consumer) { consumer.accept(mTransformation()); return this; }
        /** Sets the address of the specified {@link AINode} to the {@code mParent} field. */
        public AINode.Buffer mParent(@Nullable @NativeType("struct aiNode *") AINode value) { AINode.nmParent(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mChildren} field. */
        public AINode.Buffer mChildren(@Nullable @NativeType("struct aiNode **") PointerBuffer value) { AINode.nmChildren(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code mMeshes} field. */
        public AINode.Buffer mMeshes(@Nullable @NativeType("unsigned int *") IntBuffer value) { AINode.nmMeshes(address(), value); return this; }
        /** Sets the address of the specified {@link AIMetaData} to the {@code mMetadata} field. */
        public AINode.Buffer mMetadata(@Nullable @NativeType("struct aiMetadata *") AIMetaData value) { AINode.nmMetadata(address(), value); return this; }

    }

}