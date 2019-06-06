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
 * A node in the imported hierarchy.
 * 
 * <p>Each node has name, a parent node (except for the root node), a transformation relative to its parent and possibly several child nodes. Simple file
 * formats don't support hierarchical structures - for these formats the imported scene does consist of only a single root node without children.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mName} &ndash; 
 * The name of the node.
 * 
 * <p>The name might be empty (length of zero) but all nodes which need to be referenced by either bones or animations are named. Multiple nodes may have the
 * same name, except for nodes which are referenced by bones (see {@link AIBone} and {@link AIMesh}{@code ::mBones}). Their names <b>must</b> be unique.</p>
 * 
 * <p>Cameras and lights reference a specific node by name - if there are multiple nodes with this name, they are assigned to each of them.</p>
 * 
 * <p>There are no limitations with regard to the characters contained in the name string as it is usually taken directly from the source file.</p>
 * 
 * <p>Implementations should be able to handle tokens such as whitespace, tabs, line feeds, quotation marks, ampersands etc.</p>
 * 
 * <p>Sometimes assimp introduces new nodes not present in the source file into the hierarchy (usually out of necessity because sometimes the source
 * hierarchy format is simply not compatible). Their names are surrounded by {@code <>} e.g. {@code <DummyRootNode>}.</p></li>
 * <li>{@code mTransformation} &ndash; The transformation relative to the node's parent.</li>
 * <li>{@code mParent} &ndash; Parent node. {@code NULL} if this node is the root node.</li>
 * <li>{@code mNumChildren} &ndash; The number of child nodes of this node.</li>
 * <li>{@code mChildren} &ndash; The child nodes of this node. {@code NULL} if {@code mNumChildren} is 0.</li>
 * <li>{@code mNumMeshes} &ndash; The number of meshes of this node.</li>
 * <li>{@code mMeshes} &ndash; The meshes of this node. Each entry is an index into the mesh list of the {@link AIScene}.</li>
 * <li>{@code mMetadata} &ndash; 
 * Metadata associated with this node or {@code NULL} if there is no metadata.
 * 
 * <p>Whether any metadata is generated depends on the source file format. See the importer notes page for more information on every source file format.
 * Importers that don't document any metadata don't write any.</p></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
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
public class AINode extends Struct implements NativeResource {

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

    /** Returns a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** Returns a {@link AIMatrix4x4} view of the {@code mTransformation} field. */
    @NativeType("struct aiMatrix4x4")
    public AIMatrix4x4 mTransformation() { return nmTransformation(address()); }
    /** Returns a {@link AINode} view of the struct pointed to by the {@code mParent} field. */
    @Nullable
    @NativeType("struct aiNode *")
    public AINode mParent() { return nmParent(address()); }
    /** Returns the value of the {@code mNumChildren} field. */
    @NativeType("unsigned int")
    public int mNumChildren() { return nmNumChildren(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mChildren} field. */
    @Nullable
    @NativeType("struct aiNode **")
    public PointerBuffer mChildren() { return nmChildren(address()); }
    /** Returns the value of the {@code mNumMeshes} field. */
    @NativeType("unsigned int")
    public int mNumMeshes() { return nmNumMeshes(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code mMeshes} field. */
    @Nullable
    @NativeType("unsigned int *")
    public IntBuffer mMeshes() { return nmMeshes(address()); }
    /** Returns a {@link AIMetaData} view of the struct pointed to by the {@code mMetadata} field. */
    @Nullable
    @NativeType("struct aiMetadata *")
    public AIMetaData mMetadata() { return nmMetadata(address()); }

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
        return wrap(AINode.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AINode} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AINode calloc() {
        return wrap(AINode.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AINode} instance allocated with {@link BufferUtils}. */
    public static AINode create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AINode.class, memAddress(container), container);
    }

    /** Returns a new {@code AINode} instance for the specified memory address. */
    public static AINode create(long address) {
        return wrap(AINode.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AINode createSafe(long address) {
        return address == NULL ? null : wrap(AINode.class, address);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AINode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AINode.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code AINode} instance allocated on the thread-local {@link MemoryStack}. */
    public static AINode mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code AINode} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AINode callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code AINode} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AINode mallocStack(MemoryStack stack) {
        return wrap(AINode.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AINode} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AINode callocStack(MemoryStack stack) {
        return wrap(AINode.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AINode.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AINode.MNAME); }
    /** Unsafe version of {@link #mTransformation}. */
    public static AIMatrix4x4 nmTransformation(long struct) { return AIMatrix4x4.create(struct + AINode.MTRANSFORMATION); }
    /** Unsafe version of {@link #mParent}. */
    @Nullable public static AINode nmParent(long struct) { return AINode.createSafe(memGetAddress(struct + AINode.MPARENT)); }
    /** Unsafe version of {@link #mNumChildren}. */
    public static int nmNumChildren(long struct) { return UNSAFE.getInt(null, struct + AINode.MNUMCHILDREN); }
    /** Unsafe version of {@link #mChildren() mChildren}. */
    @Nullable public static PointerBuffer nmChildren(long struct) { return memPointerBufferSafe(memGetAddress(struct + AINode.MCHILDREN), nmNumChildren(struct)); }
    /** Unsafe version of {@link #mNumMeshes}. */
    public static int nmNumMeshes(long struct) { return UNSAFE.getInt(null, struct + AINode.MNUMMESHES); }
    /** Unsafe version of {@link #mMeshes() mMeshes}. */
    @Nullable public static IntBuffer nmMeshes(long struct) { return memIntBufferSafe(memGetAddress(struct + AINode.MMESHES), nmNumMeshes(struct)); }
    /** Unsafe version of {@link #mMetadata}. */
    @Nullable public static AIMetaData nmMetadata(long struct) { return AIMetaData.createSafe(memGetAddress(struct + AINode.MMETADATA)); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AINode.MNAME, AIString.SIZEOF); }
    /** Unsafe version of {@link #mTransformation(AIMatrix4x4) mTransformation}. */
    public static void nmTransformation(long struct, AIMatrix4x4 value) { memCopy(value.address(), struct + AINode.MTRANSFORMATION, AIMatrix4x4.SIZEOF); }
    /** Unsafe version of {@link #mParent(AINode) mParent}. */
    public static void nmParent(long struct, @Nullable AINode value) { memPutAddress(struct + AINode.MPARENT, memAddressSafe(value)); }
    /** Sets the specified value to the {@code mNumChildren} field of the specified {@code struct}. */
    public static void nmNumChildren(long struct, int value) { UNSAFE.putInt(null, struct + AINode.MNUMCHILDREN, value); }
    /** Unsafe version of {@link #mChildren(PointerBuffer) mChildren}. */
    public static void nmChildren(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AINode.MCHILDREN, memAddressSafe(value)); nmNumChildren(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumMeshes} field of the specified {@code struct}. */
    public static void nmNumMeshes(long struct, int value) { UNSAFE.putInt(null, struct + AINode.MNUMMESHES, value); }
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

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link AINode} structs. */
    public static class Buffer extends StructBuffer<AINode, Buffer> implements NativeResource {

        private static final AINode ELEMENT_FACTORY = AINode.create(-1L);

        /**
         * Creates a new {@code AINode.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AINode#SIZEOF}, and its mark will be undefined.
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
        protected AINode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AINode.nmName(address()); }
        /** Returns a {@link AIMatrix4x4} view of the {@code mTransformation} field. */
        @NativeType("struct aiMatrix4x4")
        public AIMatrix4x4 mTransformation() { return AINode.nmTransformation(address()); }
        /** Returns a {@link AINode} view of the struct pointed to by the {@code mParent} field. */
        @Nullable
        @NativeType("struct aiNode *")
        public AINode mParent() { return AINode.nmParent(address()); }
        /** Returns the value of the {@code mNumChildren} field. */
        @NativeType("unsigned int")
        public int mNumChildren() { return AINode.nmNumChildren(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mChildren} field. */
        @Nullable
        @NativeType("struct aiNode **")
        public PointerBuffer mChildren() { return AINode.nmChildren(address()); }
        /** Returns the value of the {@code mNumMeshes} field. */
        @NativeType("unsigned int")
        public int mNumMeshes() { return AINode.nmNumMeshes(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code mMeshes} field. */
        @Nullable
        @NativeType("unsigned int *")
        public IntBuffer mMeshes() { return AINode.nmMeshes(address()); }
        /** Returns a {@link AIMetaData} view of the struct pointed to by the {@code mMetadata} field. */
        @Nullable
        @NativeType("struct aiMetadata *")
        public AIMetaData mMetadata() { return AINode.nmMetadata(address()); }

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