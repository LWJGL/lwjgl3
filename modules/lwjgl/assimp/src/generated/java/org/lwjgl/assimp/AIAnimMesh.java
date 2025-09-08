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
 * struct aiAnimMesh {
 *     {@link AIString struct aiString} mName;
 *     {@link AIVector3D struct aiVector3D} * mVertices;
 *     {@link AIVector3D struct aiVector3D} * mNormals;
 *     {@link AIVector3D struct aiVector3D} * mTangents;
 *     {@link AIVector3D struct aiVector3D} * mBitangents;
 *     {@link AIColor4D struct aiColor4D} * mColors[Assimp.AI_MAX_NUMBER_OF_COLOR_SETS];
 *     {@link AIVector3D struct aiVector3D} * mTextureCoords[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS];
 *     unsigned int mNumVertices;
 *     float mWeight;
 * }</code></pre>
 */
@NativeType("struct aiAnimMesh")
public class AIAnimMesh extends Struct<AIAnimMesh> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MVERTICES,
        MNORMALS,
        MTANGENTS,
        MBITANGENTS,
        MCOLORS,
        MTEXTURECOORDS,
        MNUMVERTICES,
        MWEIGHT;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(POINTER_SIZE, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS),
            __array(POINTER_SIZE, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MVERTICES = layout.offsetof(1);
        MNORMALS = layout.offsetof(2);
        MTANGENTS = layout.offsetof(3);
        MBITANGENTS = layout.offsetof(4);
        MCOLORS = layout.offsetof(5);
        MTEXTURECOORDS = layout.offsetof(6);
        MNUMVERTICES = layout.offsetof(7);
        MWEIGHT = layout.offsetof(8);
    }

    protected AIAnimMesh(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIAnimMesh create(long address, @Nullable ByteBuffer container) {
        return new AIAnimMesh(address, container);
    }

    /**
     * Creates a {@code AIAnimMesh} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIAnimMesh(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mVertices} field. */
    @NativeType("struct aiVector3D *")
    public AIVector3D.@Nullable Buffer mVertices() { return nmVertices(address()); }
    /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mNormals} field. */
    @NativeType("struct aiVector3D *")
    public AIVector3D.@Nullable Buffer mNormals() { return nmNormals(address()); }
    /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mTangents} field. */
    @NativeType("struct aiVector3D *")
    public AIVector3D.@Nullable Buffer mTangents() { return nmTangents(address()); }
    /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mBitangents} field. */
    @NativeType("struct aiVector3D *")
    public AIVector3D.@Nullable Buffer mBitangents() { return nmBitangents(address()); }
    /** @return a {@link PointerBuffer} view of the {@code mColors} field. */
    @NativeType("struct aiColor4D *[Assimp.AI_MAX_NUMBER_OF_COLOR_SETS]")
    public PointerBuffer mColors() { return nmColors(address()); }
    /** @return a {@link AIColor4D} view of the pointer at the specified index of the {@code mColors} field. */
    @NativeType("struct aiColor4D *")
    public AIColor4D.@Nullable Buffer mColors(int index) { return nmColors(address(), index); }
    /** @return a {@link PointerBuffer} view of the {@code mTextureCoords} field. */
    @NativeType("struct aiVector3D *[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS]")
    public PointerBuffer mTextureCoords() { return nmTextureCoords(address()); }
    /** @return a {@link AIVector3D} view of the pointer at the specified index of the {@code mTextureCoords} field. */
    @NativeType("struct aiVector3D *")
    public AIVector3D.@Nullable Buffer mTextureCoords(int index) { return nmTextureCoords(address(), index); }
    /** @return the value of the {@code mNumVertices} field. */
    @NativeType("unsigned int")
    public int mNumVertices() { return nmNumVertices(address()); }
    /** @return the value of the {@code mWeight} field. */
    public float mWeight() { return nmWeight(address()); }

    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AIAnimMesh mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIAnimMesh mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mVertices} field. */
    public AIAnimMesh mVertices(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { nmVertices(address(), value); return this; }
    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mNormals} field. */
    public AIAnimMesh mNormals(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { nmNormals(address(), value); return this; }
    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mTangents} field. */
    public AIAnimMesh mTangents(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { nmTangents(address(), value); return this; }
    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mBitangents} field. */
    public AIAnimMesh mBitangents(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { nmBitangents(address(), value); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@code mColors} field. */
    public AIAnimMesh mColors(@NativeType("struct aiColor4D *[Assimp.AI_MAX_NUMBER_OF_COLOR_SETS]") PointerBuffer value) { nmColors(address(), value); return this; }
    /** Copies the address of the specified {@link AIColor4D.Buffer} at the specified index of the {@code mColors} field. */
    public AIAnimMesh mColors(int index, @NativeType("struct aiColor4D *") AIColor4D.@Nullable Buffer value) { nmColors(address(), index, value); return this; }
    /** Passes the element at {@code index} of the {@code mColors} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIAnimMesh mColors(int index, java.util.function.Consumer<AIColor4D.@Nullable Buffer> consumer) { consumer.accept(mColors(index)); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@code mTextureCoords} field. */
    public AIAnimMesh mTextureCoords(@NativeType("struct aiVector3D *[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS]") PointerBuffer value) { nmTextureCoords(address(), value); return this; }
    /** Copies the address of the specified {@link AIVector3D.Buffer} at the specified index of the {@code mTextureCoords} field. */
    public AIAnimMesh mTextureCoords(int index, @NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { nmTextureCoords(address(), index, value); return this; }
    /** Passes the element at {@code index} of the {@code mTextureCoords} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIAnimMesh mTextureCoords(int index, java.util.function.Consumer<AIVector3D.@Nullable Buffer> consumer) { consumer.accept(mTextureCoords(index)); return this; }
    /** Sets the specified value to the {@code mNumVertices} field. */
    public AIAnimMesh mNumVertices(@NativeType("unsigned int") int value) { nmNumVertices(address(), value); return this; }
    /** Sets the specified value to the {@code mWeight} field. */
    public AIAnimMesh mWeight(float value) { nmWeight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIAnimMesh set(
        AIString mName,
        AIVector3D.@Nullable Buffer mVertices,
        AIVector3D.@Nullable Buffer mNormals,
        AIVector3D.@Nullable Buffer mTangents,
        AIVector3D.@Nullable Buffer mBitangents,
        PointerBuffer mColors,
        PointerBuffer mTextureCoords,
        int mNumVertices,
        float mWeight
    ) {
        mName(mName);
        mVertices(mVertices);
        mNormals(mNormals);
        mTangents(mTangents);
        mBitangents(mBitangents);
        mColors(mColors);
        mTextureCoords(mTextureCoords);
        mNumVertices(mNumVertices);
        mWeight(mWeight);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIAnimMesh set(AIAnimMesh src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIAnimMesh} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIAnimMesh malloc() {
        return new AIAnimMesh(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AIAnimMesh} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIAnimMesh calloc() {
        return new AIAnimMesh(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AIAnimMesh} instance allocated with {@link BufferUtils}. */
    public static AIAnimMesh create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AIAnimMesh(memAddress(container), container);
    }

    /** Returns a new {@code AIAnimMesh} instance for the specified memory address. */
    public static AIAnimMesh create(long address) {
        return new AIAnimMesh(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AIAnimMesh createSafe(long address) {
        return address == NULL ? null : new AIAnimMesh(address, null);
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AIAnimMesh.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AIAnimMesh.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIAnimMesh mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIAnimMesh callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIAnimMesh mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIAnimMesh callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIAnimMesh.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIAnimMesh.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIAnimMesh.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIAnimMesh.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIAnimMesh} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIAnimMesh malloc(MemoryStack stack) {
        return new AIAnimMesh(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AIAnimMesh} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIAnimMesh calloc(MemoryStack stack) {
        return new AIAnimMesh(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AIAnimMesh.MNAME); }
    /** Unsafe version of {@link #mVertices}. */
    public static AIVector3D.@Nullable Buffer nmVertices(long struct) { return AIVector3D.createSafe(memGetAddress(struct + AIAnimMesh.MVERTICES), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mNormals}. */
    public static AIVector3D.@Nullable Buffer nmNormals(long struct) { return AIVector3D.createSafe(memGetAddress(struct + AIAnimMesh.MNORMALS), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mTangents}. */
    public static AIVector3D.@Nullable Buffer nmTangents(long struct) { return AIVector3D.createSafe(memGetAddress(struct + AIAnimMesh.MTANGENTS), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mBitangents}. */
    public static AIVector3D.@Nullable Buffer nmBitangents(long struct) { return AIVector3D.createSafe(memGetAddress(struct + AIAnimMesh.MBITANGENTS), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mColors}. */
    public static PointerBuffer nmColors(long struct) { return memPointerBuffer(struct + AIAnimMesh.MCOLORS, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS); }
    /** Unsafe version of {@link #mColors(int) mColors}. */
    public static AIColor4D.@Nullable Buffer nmColors(long struct, int index) {
        return AIColor4D.createSafe(memGetAddress(struct + AIAnimMesh.MCOLORS + check(index, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS) * POINTER_SIZE), nmNumVertices(struct));
    }
    /** Unsafe version of {@link #mTextureCoords}. */
    public static PointerBuffer nmTextureCoords(long struct) { return memPointerBuffer(struct + AIAnimMesh.MTEXTURECOORDS, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS); }
    /** Unsafe version of {@link #mTextureCoords(int) mTextureCoords}. */
    public static AIVector3D.@Nullable Buffer nmTextureCoords(long struct, int index) {
        return AIVector3D.createSafe(memGetAddress(struct + AIAnimMesh.MTEXTURECOORDS + check(index, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS) * POINTER_SIZE), nmNumVertices(struct));
    }
    /** Unsafe version of {@link #mNumVertices}. */
    public static int nmNumVertices(long struct) { return memGetInt(struct + AIAnimMesh.MNUMVERTICES); }
    /** Unsafe version of {@link #mWeight}. */
    public static float nmWeight(long struct) { return memGetFloat(struct + AIAnimMesh.MWEIGHT); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AIAnimMesh.MNAME, AIString.SIZEOF); }
    /** Unsafe version of {@link #mVertices(AIVector3D.Buffer) mVertices}. */
    public static void nmVertices(long struct, AIVector3D.@Nullable Buffer value) { memPutAddress(struct + AIAnimMesh.MVERTICES, memAddressSafe(value)); }
    /** Unsafe version of {@link #mNormals(AIVector3D.Buffer) mNormals}. */
    public static void nmNormals(long struct, AIVector3D.@Nullable Buffer value) { memPutAddress(struct + AIAnimMesh.MNORMALS, memAddressSafe(value)); }
    /** Unsafe version of {@link #mTangents(AIVector3D.Buffer) mTangents}. */
    public static void nmTangents(long struct, AIVector3D.@Nullable Buffer value) { memPutAddress(struct + AIAnimMesh.MTANGENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #mBitangents(AIVector3D.Buffer) mBitangents}. */
    public static void nmBitangents(long struct, AIVector3D.@Nullable Buffer value) { memPutAddress(struct + AIAnimMesh.MBITANGENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #mColors(PointerBuffer) mColors}. */
    public static void nmColors(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS); }
        memCopy(memAddress(value), struct + AIAnimMesh.MCOLORS, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #mColors(int, AIColor4D.Buffer) mColors}. */
    public static void nmColors(long struct, int index, AIColor4D.@Nullable Buffer value) {
        memPutAddress(struct + AIAnimMesh.MCOLORS + check(index, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS) * POINTER_SIZE, memAddressSafe(value));
    }
    /** Unsafe version of {@link #mTextureCoords(PointerBuffer) mTextureCoords}. */
    public static void nmTextureCoords(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS); }
        memCopy(memAddress(value), struct + AIAnimMesh.MTEXTURECOORDS, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #mTextureCoords(int, AIVector3D.Buffer) mTextureCoords}. */
    public static void nmTextureCoords(long struct, int index, AIVector3D.@Nullable Buffer value) {
        memPutAddress(struct + AIAnimMesh.MTEXTURECOORDS + check(index, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS) * POINTER_SIZE, memAddressSafe(value));
    }
    /** Sets the specified value to the {@code mNumVertices} field of the specified {@code struct}. */
    public static void nmNumVertices(long struct, int value) { memPutInt(struct + AIAnimMesh.MNUMVERTICES, value); }
    /** Unsafe version of {@link #mWeight(float) mWeight}. */
    public static void nmWeight(long struct, float value) { memPutFloat(struct + AIAnimMesh.MWEIGHT, value); }

    // -----------------------------------

    /** An array of {@link AIAnimMesh} structs. */
    public static class Buffer extends StructBuffer<AIAnimMesh, Buffer> implements NativeResource {

        private static final AIAnimMesh ELEMENT_FACTORY = AIAnimMesh.create(-1L);

        /**
         * Creates a new {@code AIAnimMesh.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIAnimMesh#SIZEOF}, and its mark will be undefined.</p>
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
        protected AIAnimMesh getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AIAnimMesh.nmName(address()); }
        /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mVertices} field. */
        @NativeType("struct aiVector3D *")
        public AIVector3D.@Nullable Buffer mVertices() { return AIAnimMesh.nmVertices(address()); }
        /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mNormals} field. */
        @NativeType("struct aiVector3D *")
        public AIVector3D.@Nullable Buffer mNormals() { return AIAnimMesh.nmNormals(address()); }
        /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mTangents} field. */
        @NativeType("struct aiVector3D *")
        public AIVector3D.@Nullable Buffer mTangents() { return AIAnimMesh.nmTangents(address()); }
        /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mBitangents} field. */
        @NativeType("struct aiVector3D *")
        public AIVector3D.@Nullable Buffer mBitangents() { return AIAnimMesh.nmBitangents(address()); }
        /** @return a {@link PointerBuffer} view of the {@code mColors} field. */
        @NativeType("struct aiColor4D *[Assimp.AI_MAX_NUMBER_OF_COLOR_SETS]")
        public PointerBuffer mColors() { return AIAnimMesh.nmColors(address()); }
        /** @return a {@link AIColor4D} view of the pointer at the specified index of the {@code mColors} field. */
        @NativeType("struct aiColor4D *")
        public AIColor4D.@Nullable Buffer mColors(int index) { return AIAnimMesh.nmColors(address(), index); }
        /** @return a {@link PointerBuffer} view of the {@code mTextureCoords} field. */
        @NativeType("struct aiVector3D *[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS]")
        public PointerBuffer mTextureCoords() { return AIAnimMesh.nmTextureCoords(address()); }
        /** @return a {@link AIVector3D} view of the pointer at the specified index of the {@code mTextureCoords} field. */
        @NativeType("struct aiVector3D *")
        public AIVector3D.@Nullable Buffer mTextureCoords(int index) { return AIAnimMesh.nmTextureCoords(address(), index); }
        /** @return the value of the {@code mNumVertices} field. */
        @NativeType("unsigned int")
        public int mNumVertices() { return AIAnimMesh.nmNumVertices(address()); }
        /** @return the value of the {@code mWeight} field. */
        public float mWeight() { return AIAnimMesh.nmWeight(address()); }

        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AIAnimMesh.Buffer mName(@NativeType("struct aiString") AIString value) { AIAnimMesh.nmName(address(), value); return this; }
        /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIAnimMesh.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mVertices} field. */
        public AIAnimMesh.Buffer mVertices(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { AIAnimMesh.nmVertices(address(), value); return this; }
        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mNormals} field. */
        public AIAnimMesh.Buffer mNormals(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { AIAnimMesh.nmNormals(address(), value); return this; }
        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mTangents} field. */
        public AIAnimMesh.Buffer mTangents(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { AIAnimMesh.nmTangents(address(), value); return this; }
        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mBitangents} field. */
        public AIAnimMesh.Buffer mBitangents(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { AIAnimMesh.nmBitangents(address(), value); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@code mColors} field. */
        public AIAnimMesh.Buffer mColors(@NativeType("struct aiColor4D *[Assimp.AI_MAX_NUMBER_OF_COLOR_SETS]") PointerBuffer value) { AIAnimMesh.nmColors(address(), value); return this; }
        /** Copies the address of the specified {@link AIColor4D.Buffer} at the specified index of the {@code mColors} field. */
        public AIAnimMesh.Buffer mColors(int index, @NativeType("struct aiColor4D *") AIColor4D.@Nullable Buffer value) { AIAnimMesh.nmColors(address(), index, value); return this; }
        /** Passes the element at {@code index} of the {@code mColors} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIAnimMesh.Buffer mColors(int index, java.util.function.Consumer<AIColor4D.@Nullable Buffer> consumer) { consumer.accept(mColors(index)); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@code mTextureCoords} field. */
        public AIAnimMesh.Buffer mTextureCoords(@NativeType("struct aiVector3D *[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS]") PointerBuffer value) { AIAnimMesh.nmTextureCoords(address(), value); return this; }
        /** Copies the address of the specified {@link AIVector3D.Buffer} at the specified index of the {@code mTextureCoords} field. */
        public AIAnimMesh.Buffer mTextureCoords(int index, @NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { AIAnimMesh.nmTextureCoords(address(), index, value); return this; }
        /** Passes the element at {@code index} of the {@code mTextureCoords} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIAnimMesh.Buffer mTextureCoords(int index, java.util.function.Consumer<AIVector3D.@Nullable Buffer> consumer) { consumer.accept(mTextureCoords(index)); return this; }
        /** Sets the specified value to the {@code mNumVertices} field. */
        public AIAnimMesh.Buffer mNumVertices(@NativeType("unsigned int") int value) { AIAnimMesh.nmNumVertices(address(), value); return this; }
        /** Sets the specified value to the {@code mWeight} field. */
        public AIAnimMesh.Buffer mWeight(float value) { AIAnimMesh.nmWeight(address(), value); return this; }

    }

}