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
 * NOT CURRENTLY IN USE. An AnimMesh is an attachment to an {@link AIMesh} stores per-vertex animations for a particular frame.
 * 
 * <p>You may think of an {@code aiAnimMesh} as a `patch` for the host mesh, which replaces only certain vertex data streams at a particular time. Each mesh
 * stores n attached attached meshes ({@link AIMesh}{@code ::mAnimMeshes}). The actual relationship between the time line and anim meshes is established by
 * {@code aiMeshAnim}, which references singular mesh attachments by their ID and binds them to a time offset.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mVertices} &ndash; 
 * Replacement for {@link AIMesh}{@code ::mVertices}. If this array is non-{@code NULL}, it *must* contain {@code mNumVertices} entries. The corresponding array in the
 * host mesh must be non-{@code NULL} as well - animation meshes may neither add or nor remove vertex components (if a replacement array is {@code NULL} and the
 * corresponding source array is not, the source data is taken instead).</li>
 * <li>{@code mNormals} &ndash; Replacement for {@link AIMesh}{@code ::mNormals}.</li>
 * <li>{@code mTangents} &ndash; Replacement for {@link AIMesh}{@code ::mTangents}.</li>
 * <li>{@code mBitangents} &ndash; Replacement for {@link AIMesh}{@code ::mBitangents}.</li>
 * <li>{@code mColors} &ndash; Replacement for {@link AIMesh}{@code ::mColors}</li>
 * <li>{@code mTextureCoords} &ndash; Replacement for {@link AIMesh}{@code ::mTextureCoords}</li>
 * <li>{@code mNumVertices} &ndash; 
 * The number of vertices in the {@code aiAnimMesh}, and thus the length of all the member arrays. This has always the same value as the
 * {@code mNumVertices} property in the corresponding {@link AIMesh}. It is duplicated here merely to make the length of the member arrays accessible even if
 * the {@code aiMesh} is not known, e.g. from language bindings.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiAnimMesh {
 *     {@link AIVector3D struct aiVector3D} * mVertices;
 *     {@link AIVector3D struct aiVector3D} * mNormals;
 *     {@link AIVector3D struct aiVector3D} * mTangents;
 *     {@link AIVector3D struct aiVector3D} * mBitangents;
 *     {@link AIColor4D struct aiColor4D} * mColors[Assimp.AI_MAX_NUMBER_OF_COLOR_SETS];
 *     {@link AIVector3D struct aiVector3D} * mTextureCoords[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS];
 *     unsigned int mNumVertices;
 * }</pre></code>
 */
@NativeType("struct aiAnimMesh")
public class AIAnimMesh extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MVERTICES,
        MNORMALS,
        MTANGENTS,
        MBITANGENTS,
        MCOLORS,
        MTEXTURECOORDS,
        MNUMVERTICES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(POINTER_SIZE, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS),
            __array(POINTER_SIZE, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MVERTICES = layout.offsetof(0);
        MNORMALS = layout.offsetof(1);
        MTANGENTS = layout.offsetof(2);
        MBITANGENTS = layout.offsetof(3);
        MCOLORS = layout.offsetof(4);
        MTEXTURECOORDS = layout.offsetof(5);
        MNUMVERTICES = layout.offsetof(6);
    }

    AIAnimMesh(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIAnimMesh} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIAnimMesh(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mVertices} field. */
    @Nullable
    @NativeType("struct aiVector3D *")
    public AIVector3D.Buffer mVertices() { return nmVertices(address()); }
    /** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mNormals} field. */
    @Nullable
    @NativeType("struct aiVector3D *")
    public AIVector3D.Buffer mNormals() { return nmNormals(address()); }
    /** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mTangents} field. */
    @Nullable
    @NativeType("struct aiVector3D *")
    public AIVector3D.Buffer mTangents() { return nmTangents(address()); }
    /** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mBitangents} field. */
    @Nullable
    @NativeType("struct aiVector3D *")
    public AIVector3D.Buffer mBitangents() { return nmBitangents(address()); }
    /** Returns a {@link PointerBuffer} view of the {@code mColors} field. */
    @NativeType("struct aiColor4D *[Assimp.AI_MAX_NUMBER_OF_COLOR_SETS]")
    public PointerBuffer mColors() { return nmColors(address()); }
    /** Returns a {@link AIColor4D} view of the pointer at the specified index of the {@code mColors} field. */
    @Nullable
    @NativeType("struct aiColor4D *")
    public AIColor4D.Buffer mColors(int index) { return nmColors(address(), index); }
    /** Returns a {@link PointerBuffer} view of the {@code mTextureCoords} field. */
    @NativeType("struct aiVector3D *[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS]")
    public PointerBuffer mTextureCoords() { return nmTextureCoords(address()); }
    /** Returns a {@link AIVector3D} view of the pointer at the specified index of the {@code mTextureCoords} field. */
    @Nullable
    @NativeType("struct aiVector3D *")
    public AIVector3D.Buffer mTextureCoords(int index) { return nmTextureCoords(address(), index); }
    /** Returns the value of the {@code mNumVertices} field. */
    @NativeType("unsigned int")
    public int mNumVertices() { return nmNumVertices(address()); }

    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mVertices} field. */
    public AIAnimMesh mVertices(@Nullable @NativeType("struct aiVector3D *") AIVector3D.Buffer value) { nmVertices(address(), value); return this; }
    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mNormals} field. */
    public AIAnimMesh mNormals(@Nullable @NativeType("struct aiVector3D *") AIVector3D.Buffer value) { nmNormals(address(), value); return this; }
    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mTangents} field. */
    public AIAnimMesh mTangents(@Nullable @NativeType("struct aiVector3D *") AIVector3D.Buffer value) { nmTangents(address(), value); return this; }
    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mBitangents} field. */
    public AIAnimMesh mBitangents(@Nullable @NativeType("struct aiVector3D *") AIVector3D.Buffer value) { nmBitangents(address(), value); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@code mColors} field. */
    public AIAnimMesh mColors(@NativeType("struct aiColor4D *[Assimp.AI_MAX_NUMBER_OF_COLOR_SETS]") PointerBuffer value) { nmColors(address(), value); return this; }
    /** Copies the address of the specified {@link AIColor4D} at the specified index of the {@code mColors} field. */
    public AIAnimMesh mColors(int index, @Nullable @NativeType("struct aiColor4D *") AIColor4D.Buffer value) { nmColors(address(), index, value); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@code mTextureCoords} field. */
    public AIAnimMesh mTextureCoords(@NativeType("struct aiVector3D *[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS]") PointerBuffer value) { nmTextureCoords(address(), value); return this; }
    /** Copies the address of the specified {@link AIVector3D} at the specified index of the {@code mTextureCoords} field. */
    public AIAnimMesh mTextureCoords(int index, @Nullable @NativeType("struct aiVector3D *") AIVector3D.Buffer value) { nmTextureCoords(address(), index, value); return this; }
    /** Sets the specified value to the {@code mNumVertices} field. */
    public AIAnimMesh mNumVertices(@NativeType("unsigned int") int value) { nmNumVertices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIAnimMesh set(
        @Nullable AIVector3D.Buffer mVertices,
        @Nullable AIVector3D.Buffer mNormals,
        @Nullable AIVector3D.Buffer mTangents,
        @Nullable AIVector3D.Buffer mBitangents,
        PointerBuffer mColors,
        PointerBuffer mTextureCoords,
        int mNumVertices
    ) {
        mVertices(mVertices);
        mNormals(mNormals);
        mTangents(mTangents);
        mBitangents(mBitangents);
        mColors(mColors);
        mTextureCoords(mTextureCoords);
        mNumVertices(mNumVertices);

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

    /** Returns a new {@link AIAnimMesh} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIAnimMesh malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link AIAnimMesh} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIAnimMesh calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link AIAnimMesh} instance allocated with {@link BufferUtils}. */
    public static AIAnimMesh create() {
        return new AIAnimMesh(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIAnimMesh} instance for the specified memory address. */
    public static AIAnimMesh create(long address) {
        return new AIAnimMesh(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIAnimMesh createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
    @Nullable
    public static AIAnimMesh.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIAnimMesh} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIAnimMesh mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIAnimMesh} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIAnimMesh callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIAnimMesh} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIAnimMesh mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIAnimMesh} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIAnimMesh callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAnimMesh.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIAnimMesh.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mVertices}. */
    @Nullable public static AIVector3D.Buffer nmVertices(long struct) { return AIVector3D.createSafe(memGetAddress(struct + AIAnimMesh.MVERTICES), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mNormals}. */
    @Nullable public static AIVector3D.Buffer nmNormals(long struct) { return AIVector3D.createSafe(memGetAddress(struct + AIAnimMesh.MNORMALS), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mTangents}. */
    @Nullable public static AIVector3D.Buffer nmTangents(long struct) { return AIVector3D.createSafe(memGetAddress(struct + AIAnimMesh.MTANGENTS), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mBitangents}. */
    @Nullable public static AIVector3D.Buffer nmBitangents(long struct) { return AIVector3D.createSafe(memGetAddress(struct + AIAnimMesh.MBITANGENTS), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mColors}. */
    public static PointerBuffer nmColors(long struct) { return memPointerBuffer(struct + AIAnimMesh.MCOLORS, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS); }
    /** Unsafe version of {@link #mColors(int) mColors}. */
    @Nullable public static AIColor4D.Buffer nmColors(long struct, int index) {
        return AIColor4D.createSafe(memGetAddress(struct + AIAnimMesh.MCOLORS + check(index, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS) * POINTER_SIZE), nmNumVertices(struct));
    }
    /** Unsafe version of {@link #mTextureCoords}. */
    public static PointerBuffer nmTextureCoords(long struct) { return memPointerBuffer(struct + AIAnimMesh.MTEXTURECOORDS, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS); }
    /** Unsafe version of {@link #mTextureCoords(int) mTextureCoords}. */
    @Nullable public static AIVector3D.Buffer nmTextureCoords(long struct, int index) {
        return AIVector3D.createSafe(memGetAddress(struct + AIAnimMesh.MTEXTURECOORDS + check(index, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS) * POINTER_SIZE), nmNumVertices(struct));
    }
    /** Unsafe version of {@link #mNumVertices}. */
    public static int nmNumVertices(long struct) { return memGetInt(struct + AIAnimMesh.MNUMVERTICES); }

    /** Unsafe version of {@link #mVertices(AIVector3D.Buffer) mVertices}. */
    public static void nmVertices(long struct, @Nullable AIVector3D.Buffer value) { memPutAddress(struct + AIAnimMesh.MVERTICES, memAddressSafe(value)); }
    /** Unsafe version of {@link #mNormals(AIVector3D.Buffer) mNormals}. */
    public static void nmNormals(long struct, @Nullable AIVector3D.Buffer value) { memPutAddress(struct + AIAnimMesh.MNORMALS, memAddressSafe(value)); }
    /** Unsafe version of {@link #mTangents(AIVector3D.Buffer) mTangents}. */
    public static void nmTangents(long struct, @Nullable AIVector3D.Buffer value) { memPutAddress(struct + AIAnimMesh.MTANGENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #mBitangents(AIVector3D.Buffer) mBitangents}. */
    public static void nmBitangents(long struct, @Nullable AIVector3D.Buffer value) { memPutAddress(struct + AIAnimMesh.MBITANGENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #mColors(PointerBuffer) mColors}. */
    public static void nmColors(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS); }
        memCopy(memAddress(value), struct + AIAnimMesh.MCOLORS, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #mColors(int, AIColor4D.Buffer) mColors}. */
    public static void nmColors(long struct, int index, @Nullable AIColor4D.Buffer value) {
        memPutAddress(struct + AIAnimMesh.MCOLORS + check(index, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS) * POINTER_SIZE, memAddressSafe(value));
    }
    /** Unsafe version of {@link #mTextureCoords(PointerBuffer) mTextureCoords}. */
    public static void nmTextureCoords(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS); }
        memCopy(memAddress(value), struct + AIAnimMesh.MTEXTURECOORDS, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #mTextureCoords(int, AIVector3D.Buffer) mTextureCoords}. */
    public static void nmTextureCoords(long struct, int index, @Nullable AIVector3D.Buffer value) {
        memPutAddress(struct + AIAnimMesh.MTEXTURECOORDS + check(index, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS) * POINTER_SIZE, memAddressSafe(value));
    }
    /** Sets the specified value to the {@code mNumVertices} field of the specified {@code struct}. */
    public static void nmNumVertices(long struct, int value) { memPutInt(struct + AIAnimMesh.MNUMVERTICES, value); }

    // -----------------------------------

    /** An array of {@link AIAnimMesh} structs. */
    public static class Buffer extends StructBuffer<AIAnimMesh, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIAnimMesh.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIAnimMesh#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected AIAnimMesh newInstance(long address) {
            return new AIAnimMesh(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mVertices} field. */
        @Nullable
        @NativeType("struct aiVector3D *")
        public AIVector3D.Buffer mVertices() { return AIAnimMesh.nmVertices(address()); }
        /** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mNormals} field. */
        @Nullable
        @NativeType("struct aiVector3D *")
        public AIVector3D.Buffer mNormals() { return AIAnimMesh.nmNormals(address()); }
        /** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mTangents} field. */
        @Nullable
        @NativeType("struct aiVector3D *")
        public AIVector3D.Buffer mTangents() { return AIAnimMesh.nmTangents(address()); }
        /** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mBitangents} field. */
        @Nullable
        @NativeType("struct aiVector3D *")
        public AIVector3D.Buffer mBitangents() { return AIAnimMesh.nmBitangents(address()); }
        /** Returns a {@link PointerBuffer} view of the {@code mColors} field. */
        @NativeType("struct aiColor4D *[Assimp.AI_MAX_NUMBER_OF_COLOR_SETS]")
        public PointerBuffer mColors() { return AIAnimMesh.nmColors(address()); }
        /** Returns a {@link AIColor4D} view of the pointer at the specified index of the {@code mColors} field. */
        @Nullable
        @NativeType("struct aiColor4D *")
        public AIColor4D.Buffer mColors(int index) { return AIAnimMesh.nmColors(address(), index); }
        /** Returns a {@link PointerBuffer} view of the {@code mTextureCoords} field. */
        @NativeType("struct aiVector3D *[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS]")
        public PointerBuffer mTextureCoords() { return AIAnimMesh.nmTextureCoords(address()); }
        /** Returns a {@link AIVector3D} view of the pointer at the specified index of the {@code mTextureCoords} field. */
        @Nullable
        @NativeType("struct aiVector3D *")
        public AIVector3D.Buffer mTextureCoords(int index) { return AIAnimMesh.nmTextureCoords(address(), index); }
        /** Returns the value of the {@code mNumVertices} field. */
        @NativeType("unsigned int")
        public int mNumVertices() { return AIAnimMesh.nmNumVertices(address()); }

        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mVertices} field. */
        public AIAnimMesh.Buffer mVertices(@Nullable @NativeType("struct aiVector3D *") AIVector3D.Buffer value) { AIAnimMesh.nmVertices(address(), value); return this; }
        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mNormals} field. */
        public AIAnimMesh.Buffer mNormals(@Nullable @NativeType("struct aiVector3D *") AIVector3D.Buffer value) { AIAnimMesh.nmNormals(address(), value); return this; }
        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mTangents} field. */
        public AIAnimMesh.Buffer mTangents(@Nullable @NativeType("struct aiVector3D *") AIVector3D.Buffer value) { AIAnimMesh.nmTangents(address(), value); return this; }
        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mBitangents} field. */
        public AIAnimMesh.Buffer mBitangents(@Nullable @NativeType("struct aiVector3D *") AIVector3D.Buffer value) { AIAnimMesh.nmBitangents(address(), value); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@code mColors} field. */
        public AIAnimMesh.Buffer mColors(@NativeType("struct aiColor4D *[Assimp.AI_MAX_NUMBER_OF_COLOR_SETS]") PointerBuffer value) { AIAnimMesh.nmColors(address(), value); return this; }
        /** Copies the address of the specified {@link AIColor4D} at the specified index of the {@code mColors} field. */
        public AIAnimMesh.Buffer mColors(int index, @Nullable @NativeType("struct aiColor4D *") AIColor4D.Buffer value) { AIAnimMesh.nmColors(address(), index, value); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@code mTextureCoords} field. */
        public AIAnimMesh.Buffer mTextureCoords(@NativeType("struct aiVector3D *[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS]") PointerBuffer value) { AIAnimMesh.nmTextureCoords(address(), value); return this; }
        /** Copies the address of the specified {@link AIVector3D} at the specified index of the {@code mTextureCoords} field. */
        public AIAnimMesh.Buffer mTextureCoords(int index, @Nullable @NativeType("struct aiVector3D *") AIVector3D.Buffer value) { AIAnimMesh.nmTextureCoords(address(), index, value); return this; }
        /** Sets the specified value to the {@code mNumVertices} field. */
        public AIAnimMesh.Buffer mNumVertices(@NativeType("unsigned int") int value) { AIAnimMesh.nmNumVertices(address(), value); return this; }

    }

}