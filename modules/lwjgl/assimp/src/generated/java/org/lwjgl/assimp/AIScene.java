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
 * struct aiScene {
 *     unsigned int mFlags;
 *     {@link AINode struct aiNode} * mRootNode;
 *     unsigned int mNumMeshes;
 *     {@link AIMesh struct aiMesh} ** mMeshes;
 *     unsigned int mNumMaterials;
 *     {@link AIMaterial struct aiMaterial} ** mMaterials;
 *     unsigned int mNumAnimations;
 *     {@link AIAnimation struct aiAnimation} ** mAnimations;
 *     unsigned int mNumTextures;
 *     {@link AITexture struct aiTexture} ** mTextures;
 *     unsigned int mNumLights;
 *     {@link AILight struct aiLight} ** mLights;
 *     unsigned int mNumCameras;
 *     {@link AICamera struct aiCamera} ** mCameras;
 *     {@link AIMetaData struct aiMetadata} * mMetaData;
 *     {@link AIString struct aiString} mName;
 *     unsigned int mNumSkeletons;
 *     {@link AISkeleton struct aiSkeleton} ** mSkeletons;
 *     char * mPrivate;
 * }</code></pre>
 */
@NativeType("struct aiScene")
public class AIScene extends Struct<AIScene> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MFLAGS,
        MROOTNODE,
        MNUMMESHES,
        MMESHES,
        MNUMMATERIALS,
        MMATERIALS,
        MNUMANIMATIONS,
        MANIMATIONS,
        MNUMTEXTURES,
        MTEXTURES,
        MNUMLIGHTS,
        MLIGHTS,
        MNUMCAMERAS,
        MCAMERAS,
        MMETADATA,
        MNAME,
        MNUMSKELETONS,
        MSKELETONS,
        MPRIVATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MFLAGS = layout.offsetof(0);
        MROOTNODE = layout.offsetof(1);
        MNUMMESHES = layout.offsetof(2);
        MMESHES = layout.offsetof(3);
        MNUMMATERIALS = layout.offsetof(4);
        MMATERIALS = layout.offsetof(5);
        MNUMANIMATIONS = layout.offsetof(6);
        MANIMATIONS = layout.offsetof(7);
        MNUMTEXTURES = layout.offsetof(8);
        MTEXTURES = layout.offsetof(9);
        MNUMLIGHTS = layout.offsetof(10);
        MLIGHTS = layout.offsetof(11);
        MNUMCAMERAS = layout.offsetof(12);
        MCAMERAS = layout.offsetof(13);
        MMETADATA = layout.offsetof(14);
        MNAME = layout.offsetof(15);
        MNUMSKELETONS = layout.offsetof(16);
        MSKELETONS = layout.offsetof(17);
        MPRIVATE = layout.offsetof(18);
    }

    protected AIScene(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIScene create(long address, @Nullable ByteBuffer container) {
        return new AIScene(address, container);
    }

    /**
     * Creates a {@code AIScene} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIScene(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code mFlags} field. */
    @NativeType("unsigned int")
    public int mFlags() { return nmFlags(address()); }
    /** @return a {@link AINode} view of the struct pointed to by the {@code mRootNode} field. */
    @NativeType("struct aiNode *")
    public @Nullable AINode mRootNode() { return nmRootNode(address()); }
    /** @return the value of the {@code mNumMeshes} field. */
    @NativeType("unsigned int")
    public int mNumMeshes() { return nmNumMeshes(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mMeshes} field. */
    @NativeType("struct aiMesh **")
    public @Nullable PointerBuffer mMeshes() { return nmMeshes(address()); }
    /** @return the value of the {@code mNumMaterials} field. */
    @NativeType("unsigned int")
    public int mNumMaterials() { return nmNumMaterials(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mMaterials} field. */
    @NativeType("struct aiMaterial **")
    public @Nullable PointerBuffer mMaterials() { return nmMaterials(address()); }
    /** @return the value of the {@code mNumAnimations} field. */
    @NativeType("unsigned int")
    public int mNumAnimations() { return nmNumAnimations(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mAnimations} field. */
    @NativeType("struct aiAnimation **")
    public @Nullable PointerBuffer mAnimations() { return nmAnimations(address()); }
    /** @return the value of the {@code mNumTextures} field. */
    @NativeType("unsigned int")
    public int mNumTextures() { return nmNumTextures(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mTextures} field. */
    @NativeType("struct aiTexture **")
    public @Nullable PointerBuffer mTextures() { return nmTextures(address()); }
    /** @return the value of the {@code mNumLights} field. */
    @NativeType("unsigned int")
    public int mNumLights() { return nmNumLights(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mLights} field. */
    @NativeType("struct aiLight **")
    public @Nullable PointerBuffer mLights() { return nmLights(address()); }
    /** @return the value of the {@code mNumCameras} field. */
    @NativeType("unsigned int")
    public int mNumCameras() { return nmNumCameras(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mCameras} field. */
    @NativeType("struct aiCamera **")
    public @Nullable PointerBuffer mCameras() { return nmCameras(address()); }
    /** @return a {@link AIMetaData} view of the struct pointed to by the {@code mMetaData} field. */
    @NativeType("struct aiMetadata *")
    public @Nullable AIMetaData mMetaData() { return nmMetaData(address()); }
    /** @return a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** @return the value of the {@code mNumSkeletons} field. */
    @NativeType("unsigned int")
    public int mNumSkeletons() { return nmNumSkeletons(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mSkeletons} field. */
    @NativeType("struct aiSkeleton **")
    public @Nullable PointerBuffer mSkeletons() { return nmSkeletons(address()); }

    /** Sets the specified value to the {@code mFlags} field. */
    public AIScene mFlags(@NativeType("unsigned int") int value) { nmFlags(address(), value); return this; }
    /** Sets the address of the specified {@link AINode} to the {@code mRootNode} field. */
    public AIScene mRootNode(@Nullable @NativeType("struct aiNode *") AINode value) { nmRootNode(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mMeshes} field. */
    public AIScene mMeshes(@Nullable @NativeType("struct aiMesh **") PointerBuffer value) { nmMeshes(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mMaterials} field. */
    public AIScene mMaterials(@Nullable @NativeType("struct aiMaterial **") PointerBuffer value) { nmMaterials(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mAnimations} field. */
    public AIScene mAnimations(@Nullable @NativeType("struct aiAnimation **") PointerBuffer value) { nmAnimations(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mTextures} field. */
    public AIScene mTextures(@Nullable @NativeType("struct aiTexture **") PointerBuffer value) { nmTextures(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mLights} field. */
    public AIScene mLights(@Nullable @NativeType("struct aiLight **") PointerBuffer value) { nmLights(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mCameras} field. */
    public AIScene mCameras(@Nullable @NativeType("struct aiCamera **") PointerBuffer value) { nmCameras(address(), value); return this; }
    /** Sets the address of the specified {@link AIMetaData} to the {@code mMetaData} field. */
    public AIScene mMetaData(@Nullable @NativeType("struct aiMetadata *") AIMetaData value) { nmMetaData(address(), value); return this; }
    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AIScene mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIScene mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mSkeletons} field. */
    public AIScene mSkeletons(@Nullable @NativeType("struct aiSkeleton **") PointerBuffer value) { nmSkeletons(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIScene set(
        int mFlags,
        @Nullable AINode mRootNode,
        @Nullable PointerBuffer mMeshes,
        @Nullable PointerBuffer mMaterials,
        @Nullable PointerBuffer mAnimations,
        @Nullable PointerBuffer mTextures,
        @Nullable PointerBuffer mLights,
        @Nullable PointerBuffer mCameras,
        @Nullable AIMetaData mMetaData,
        AIString mName,
        @Nullable PointerBuffer mSkeletons
    ) {
        mFlags(mFlags);
        mRootNode(mRootNode);
        mMeshes(mMeshes);
        mMaterials(mMaterials);
        mAnimations(mAnimations);
        mTextures(mTextures);
        mLights(mLights);
        mCameras(mCameras);
        mMetaData(mMetaData);
        mName(mName);
        mSkeletons(mSkeletons);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIScene set(AIScene src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIScene} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIScene malloc() {
        return new AIScene(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AIScene} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIScene calloc() {
        return new AIScene(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AIScene} instance allocated with {@link BufferUtils}. */
    public static AIScene create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AIScene(memAddress(container), container);
    }

    /** Returns a new {@code AIScene} instance for the specified memory address. */
    public static AIScene create(long address) {
        return new AIScene(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AIScene createSafe(long address) {
        return address == NULL ? null : new AIScene(address, null);
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AIScene.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AIScene.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIScene mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIScene callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIScene mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIScene callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIScene.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIScene.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIScene.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIScene.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIScene} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIScene malloc(MemoryStack stack) {
        return new AIScene(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AIScene} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIScene calloc(MemoryStack stack) {
        return new AIScene(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mFlags}. */
    public static int nmFlags(long struct) { return memGetInt(struct + AIScene.MFLAGS); }
    /** Unsafe version of {@link #mRootNode}. */
    public static @Nullable AINode nmRootNode(long struct) { return AINode.createSafe(memGetAddress(struct + AIScene.MROOTNODE)); }
    /** Unsafe version of {@link #mNumMeshes}. */
    public static int nmNumMeshes(long struct) { return memGetInt(struct + AIScene.MNUMMESHES); }
    /** Unsafe version of {@link #mMeshes() mMeshes}. */
    public static @Nullable PointerBuffer nmMeshes(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MMESHES), nmNumMeshes(struct)); }
    /** Unsafe version of {@link #mNumMaterials}. */
    public static int nmNumMaterials(long struct) { return memGetInt(struct + AIScene.MNUMMATERIALS); }
    /** Unsafe version of {@link #mMaterials() mMaterials}. */
    public static @Nullable PointerBuffer nmMaterials(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MMATERIALS), nmNumMaterials(struct)); }
    /** Unsafe version of {@link #mNumAnimations}. */
    public static int nmNumAnimations(long struct) { return memGetInt(struct + AIScene.MNUMANIMATIONS); }
    /** Unsafe version of {@link #mAnimations() mAnimations}. */
    public static @Nullable PointerBuffer nmAnimations(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MANIMATIONS), nmNumAnimations(struct)); }
    /** Unsafe version of {@link #mNumTextures}. */
    public static int nmNumTextures(long struct) { return memGetInt(struct + AIScene.MNUMTEXTURES); }
    /** Unsafe version of {@link #mTextures() mTextures}. */
    public static @Nullable PointerBuffer nmTextures(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MTEXTURES), nmNumTextures(struct)); }
    /** Unsafe version of {@link #mNumLights}. */
    public static int nmNumLights(long struct) { return memGetInt(struct + AIScene.MNUMLIGHTS); }
    /** Unsafe version of {@link #mLights() mLights}. */
    public static @Nullable PointerBuffer nmLights(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MLIGHTS), nmNumLights(struct)); }
    /** Unsafe version of {@link #mNumCameras}. */
    public static int nmNumCameras(long struct) { return memGetInt(struct + AIScene.MNUMCAMERAS); }
    /** Unsafe version of {@link #mCameras() mCameras}. */
    public static @Nullable PointerBuffer nmCameras(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MCAMERAS), nmNumCameras(struct)); }
    /** Unsafe version of {@link #mMetaData}. */
    public static @Nullable AIMetaData nmMetaData(long struct) { return AIMetaData.createSafe(memGetAddress(struct + AIScene.MMETADATA)); }
    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AIScene.MNAME); }
    /** Unsafe version of {@link #mNumSkeletons}. */
    public static int nmNumSkeletons(long struct) { return memGetInt(struct + AIScene.MNUMSKELETONS); }
    /** Unsafe version of {@link #mSkeletons() mSkeletons}. */
    public static @Nullable PointerBuffer nmSkeletons(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MSKELETONS), nmNumSkeletons(struct)); }
    public static ByteBuffer nmPrivate(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + AIScene.MPRIVATE), capacity); }

    /** Unsafe version of {@link #mFlags(int) mFlags}. */
    public static void nmFlags(long struct, int value) { memPutInt(struct + AIScene.MFLAGS, value); }
    /** Unsafe version of {@link #mRootNode(AINode) mRootNode}. */
    public static void nmRootNode(long struct, @Nullable AINode value) { memPutAddress(struct + AIScene.MROOTNODE, memAddressSafe(value)); }
    /** Sets the specified value to the {@code mNumMeshes} field of the specified {@code struct}. */
    public static void nmNumMeshes(long struct, int value) { memPutInt(struct + AIScene.MNUMMESHES, value); }
    /** Unsafe version of {@link #mMeshes(PointerBuffer) mMeshes}. */
    public static void nmMeshes(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MMESHES, memAddressSafe(value)); nmNumMeshes(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumMaterials} field of the specified {@code struct}. */
    public static void nmNumMaterials(long struct, int value) { memPutInt(struct + AIScene.MNUMMATERIALS, value); }
    /** Unsafe version of {@link #mMaterials(PointerBuffer) mMaterials}. */
    public static void nmMaterials(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MMATERIALS, memAddressSafe(value)); nmNumMaterials(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumAnimations} field of the specified {@code struct}. */
    public static void nmNumAnimations(long struct, int value) { memPutInt(struct + AIScene.MNUMANIMATIONS, value); }
    /** Unsafe version of {@link #mAnimations(PointerBuffer) mAnimations}. */
    public static void nmAnimations(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MANIMATIONS, memAddressSafe(value)); nmNumAnimations(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumTextures} field of the specified {@code struct}. */
    public static void nmNumTextures(long struct, int value) { memPutInt(struct + AIScene.MNUMTEXTURES, value); }
    /** Unsafe version of {@link #mTextures(PointerBuffer) mTextures}. */
    public static void nmTextures(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MTEXTURES, memAddressSafe(value)); nmNumTextures(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumLights} field of the specified {@code struct}. */
    public static void nmNumLights(long struct, int value) { memPutInt(struct + AIScene.MNUMLIGHTS, value); }
    /** Unsafe version of {@link #mLights(PointerBuffer) mLights}. */
    public static void nmLights(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MLIGHTS, memAddressSafe(value)); nmNumLights(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumCameras} field of the specified {@code struct}. */
    public static void nmNumCameras(long struct, int value) { memPutInt(struct + AIScene.MNUMCAMERAS, value); }
    /** Unsafe version of {@link #mCameras(PointerBuffer) mCameras}. */
    public static void nmCameras(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MCAMERAS, memAddressSafe(value)); nmNumCameras(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #mMetaData(AIMetaData) mMetaData}. */
    public static void nmMetaData(long struct, @Nullable AIMetaData value) { memPutAddress(struct + AIScene.MMETADATA, memAddressSafe(value)); }
    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AIScene.MNAME, AIString.SIZEOF); }
    /** Sets the specified value to the {@code mNumSkeletons} field of the specified {@code struct}. */
    public static void nmNumSkeletons(long struct, int value) { memPutInt(struct + AIScene.MNUMSKELETONS, value); }
    /** Unsafe version of {@link #mSkeletons(PointerBuffer) mSkeletons}. */
    public static void nmSkeletons(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MSKELETONS, memAddressSafe(value)); nmNumSkeletons(struct, value == null ? 0 : value.remaining()); }
    public static void nmPrivate(long struct, ByteBuffer value) { memPutAddress(struct + AIScene.MPRIVATE, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long mRootNode = memGetAddress(struct + AIScene.MROOTNODE);
        if (mRootNode != NULL) {
            AINode.validate(mRootNode);
        }
        if (nmNumMeshes(struct) != 0) {
            check(memGetAddress(struct + AIScene.MMESHES));
        }
        if (nmNumMaterials(struct) != 0) {
            check(memGetAddress(struct + AIScene.MMATERIALS));
        }
        if (nmNumAnimations(struct) != 0) {
            check(memGetAddress(struct + AIScene.MANIMATIONS));
        }
        if (nmNumTextures(struct) != 0) {
            check(memGetAddress(struct + AIScene.MTEXTURES));
        }
        if (nmNumLights(struct) != 0) {
            check(memGetAddress(struct + AIScene.MLIGHTS));
        }
        if (nmNumCameras(struct) != 0) {
            check(memGetAddress(struct + AIScene.MCAMERAS));
        }
        long mMetaData = memGetAddress(struct + AIScene.MMETADATA);
        if (mMetaData != NULL) {
            AIMetaData.validate(mMetaData);
        }
        if (nmNumSkeletons(struct) != 0) {
            check(memGetAddress(struct + AIScene.MSKELETONS));
        }
    }

    // -----------------------------------

    /** An array of {@link AIScene} structs. */
    public static class Buffer extends StructBuffer<AIScene, Buffer> implements NativeResource {

        private static final AIScene ELEMENT_FACTORY = AIScene.create(-1L);

        /**
         * Creates a new {@code AIScene.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIScene#SIZEOF}, and its mark will be undefined.</p>
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
        protected AIScene getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code mFlags} field. */
        @NativeType("unsigned int")
        public int mFlags() { return AIScene.nmFlags(address()); }
        /** @return a {@link AINode} view of the struct pointed to by the {@code mRootNode} field. */
        @NativeType("struct aiNode *")
        public @Nullable AINode mRootNode() { return AIScene.nmRootNode(address()); }
        /** @return the value of the {@code mNumMeshes} field. */
        @NativeType("unsigned int")
        public int mNumMeshes() { return AIScene.nmNumMeshes(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mMeshes} field. */
        @NativeType("struct aiMesh **")
        public @Nullable PointerBuffer mMeshes() { return AIScene.nmMeshes(address()); }
        /** @return the value of the {@code mNumMaterials} field. */
        @NativeType("unsigned int")
        public int mNumMaterials() { return AIScene.nmNumMaterials(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mMaterials} field. */
        @NativeType("struct aiMaterial **")
        public @Nullable PointerBuffer mMaterials() { return AIScene.nmMaterials(address()); }
        /** @return the value of the {@code mNumAnimations} field. */
        @NativeType("unsigned int")
        public int mNumAnimations() { return AIScene.nmNumAnimations(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mAnimations} field. */
        @NativeType("struct aiAnimation **")
        public @Nullable PointerBuffer mAnimations() { return AIScene.nmAnimations(address()); }
        /** @return the value of the {@code mNumTextures} field. */
        @NativeType("unsigned int")
        public int mNumTextures() { return AIScene.nmNumTextures(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mTextures} field. */
        @NativeType("struct aiTexture **")
        public @Nullable PointerBuffer mTextures() { return AIScene.nmTextures(address()); }
        /** @return the value of the {@code mNumLights} field. */
        @NativeType("unsigned int")
        public int mNumLights() { return AIScene.nmNumLights(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mLights} field. */
        @NativeType("struct aiLight **")
        public @Nullable PointerBuffer mLights() { return AIScene.nmLights(address()); }
        /** @return the value of the {@code mNumCameras} field. */
        @NativeType("unsigned int")
        public int mNumCameras() { return AIScene.nmNumCameras(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mCameras} field. */
        @NativeType("struct aiCamera **")
        public @Nullable PointerBuffer mCameras() { return AIScene.nmCameras(address()); }
        /** @return a {@link AIMetaData} view of the struct pointed to by the {@code mMetaData} field. */
        @NativeType("struct aiMetadata *")
        public @Nullable AIMetaData mMetaData() { return AIScene.nmMetaData(address()); }
        /** @return a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AIScene.nmName(address()); }
        /** @return the value of the {@code mNumSkeletons} field. */
        @NativeType("unsigned int")
        public int mNumSkeletons() { return AIScene.nmNumSkeletons(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mSkeletons} field. */
        @NativeType("struct aiSkeleton **")
        public @Nullable PointerBuffer mSkeletons() { return AIScene.nmSkeletons(address()); }

        /** Sets the specified value to the {@code mFlags} field. */
        public AIScene.Buffer mFlags(@NativeType("unsigned int") int value) { AIScene.nmFlags(address(), value); return this; }
        /** Sets the address of the specified {@link AINode} to the {@code mRootNode} field. */
        public AIScene.Buffer mRootNode(@Nullable @NativeType("struct aiNode *") AINode value) { AIScene.nmRootNode(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mMeshes} field. */
        public AIScene.Buffer mMeshes(@Nullable @NativeType("struct aiMesh **") PointerBuffer value) { AIScene.nmMeshes(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mMaterials} field. */
        public AIScene.Buffer mMaterials(@Nullable @NativeType("struct aiMaterial **") PointerBuffer value) { AIScene.nmMaterials(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mAnimations} field. */
        public AIScene.Buffer mAnimations(@Nullable @NativeType("struct aiAnimation **") PointerBuffer value) { AIScene.nmAnimations(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mTextures} field. */
        public AIScene.Buffer mTextures(@Nullable @NativeType("struct aiTexture **") PointerBuffer value) { AIScene.nmTextures(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mLights} field. */
        public AIScene.Buffer mLights(@Nullable @NativeType("struct aiLight **") PointerBuffer value) { AIScene.nmLights(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mCameras} field. */
        public AIScene.Buffer mCameras(@Nullable @NativeType("struct aiCamera **") PointerBuffer value) { AIScene.nmCameras(address(), value); return this; }
        /** Sets the address of the specified {@link AIMetaData} to the {@code mMetaData} field. */
        public AIScene.Buffer mMetaData(@Nullable @NativeType("struct aiMetadata *") AIMetaData value) { AIScene.nmMetaData(address(), value); return this; }
        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AIScene.Buffer mName(@NativeType("struct aiString") AIString value) { AIScene.nmName(address(), value); return this; }
        /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIScene.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mSkeletons} field. */
        public AIScene.Buffer mSkeletons(@Nullable @NativeType("struct aiSkeleton **") PointerBuffer value) { AIScene.nmSkeletons(address(), value); return this; }

    }

}