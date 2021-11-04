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
 * Describes vertex-based animations for a single mesh or a group of meshes. Meshes carry the animation data for each frame in their
 * {@link AIMesh}{@code ::mAnimMeshes} array. The purpose of {@code aiMeshAnim} is to define keyframes linking each mesh attachment to a particular point in
 * time.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiMeshAnim {
 *     {@link AIString struct aiString} {@link #mName};
 *     unsigned int {@link #mNumKeys};
 *     {@link AIMeshKey struct aiMeshKey} * {@link #mKeys};
 * }</code></pre>
 */
@NativeType("struct aiMeshAnim")
public class AIMeshAnim extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MNUMKEYS,
        MKEYS;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MNUMKEYS = layout.offsetof(1);
        MKEYS = layout.offsetof(2);
    }

    /**
     * Creates a {@code AIMeshAnim} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMeshAnim(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * Name of the mesh to be animated. An empty string is not allowed, animated meshes need to be named (not necessarily uniquely, the name can basically
     * serve as wildcard to select a group of meshes with similar animation setup)
     */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** Size of the {@code mKeys} array. Must be 1, at least. */
    @NativeType("unsigned int")
    public int mNumKeys() { return nmNumKeys(address()); }
    /** Key frames of the animation. May not be {@code NULL}. */
    @NativeType("struct aiMeshKey *")
    public AIMeshKey.Buffer mKeys() { return nmKeys(address()); }

    /** Copies the specified {@link AIString} to the {@link #mName} field. */
    public AIMeshAnim mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Passes the {@link #mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIMeshAnim mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Sets the address of the specified {@link AIMeshKey.Buffer} to the {@link #mKeys} field. */
    public AIMeshAnim mKeys(@NativeType("struct aiMeshKey *") AIMeshKey.Buffer value) { nmKeys(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIMeshAnim set(
        AIString mName,
        AIMeshKey.Buffer mKeys
    ) {
        mName(mName);
        mKeys(mKeys);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIMeshAnim set(AIMeshAnim src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIMeshAnim} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMeshAnim malloc() {
        return wrap(AIMeshAnim.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIMeshAnim} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMeshAnim calloc() {
        return wrap(AIMeshAnim.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIMeshAnim} instance allocated with {@link BufferUtils}. */
    public static AIMeshAnim create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIMeshAnim.class, memAddress(container), container);
    }

    /** Returns a new {@code AIMeshAnim} instance for the specified memory address. */
    public static AIMeshAnim create(long address) {
        return wrap(AIMeshAnim.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMeshAnim createSafe(long address) {
        return address == NULL ? null : wrap(AIMeshAnim.class, address);
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshAnim.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshAnim.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshAnim.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIMeshAnim.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIMeshAnim.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMeshAnim.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshAnim mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshAnim callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshAnim mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshAnim callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshAnim.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshAnim.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshAnim.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshAnim.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIMeshAnim} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMeshAnim malloc(MemoryStack stack) {
        return wrap(AIMeshAnim.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIMeshAnim} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMeshAnim calloc(MemoryStack stack) {
        return wrap(AIMeshAnim.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMeshAnim.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMeshAnim.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AIMeshAnim.MNAME); }
    /** Unsafe version of {@link #mNumKeys}. */
    public static int nmNumKeys(long struct) { return UNSAFE.getInt(null, struct + AIMeshAnim.MNUMKEYS); }
    /** Unsafe version of {@link #mKeys}. */
    public static AIMeshKey.Buffer nmKeys(long struct) { return AIMeshKey.create(memGetAddress(struct + AIMeshAnim.MKEYS), nmNumKeys(struct)); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AIMeshAnim.MNAME, AIString.SIZEOF); }
    /** Sets the specified value to the {@code mNumKeys} field of the specified {@code struct}. */
    public static void nmNumKeys(long struct, int value) { UNSAFE.putInt(null, struct + AIMeshAnim.MNUMKEYS, value); }
    /** Unsafe version of {@link #mKeys(AIMeshKey.Buffer) mKeys}. */
    public static void nmKeys(long struct, AIMeshKey.Buffer value) { memPutAddress(struct + AIMeshAnim.MKEYS, value.address()); nmNumKeys(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIMeshAnim.MKEYS));
    }

    // -----------------------------------

    /** An array of {@link AIMeshAnim} structs. */
    public static class Buffer extends StructBuffer<AIMeshAnim, Buffer> implements NativeResource {

        private static final AIMeshAnim ELEMENT_FACTORY = AIMeshAnim.create(-1L);

        /**
         * Creates a new {@code AIMeshAnim.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMeshAnim#SIZEOF}, and its mark will be undefined.
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
        protected AIMeshAnim getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIString} view of the {@link AIMeshAnim#mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AIMeshAnim.nmName(address()); }
        /** @return the value of the {@link AIMeshAnim#mNumKeys} field. */
        @NativeType("unsigned int")
        public int mNumKeys() { return AIMeshAnim.nmNumKeys(address()); }
        /** @return a {@link AIMeshKey.Buffer} view of the struct array pointed to by the {@link AIMeshAnim#mKeys} field. */
        @NativeType("struct aiMeshKey *")
        public AIMeshKey.Buffer mKeys() { return AIMeshAnim.nmKeys(address()); }

        /** Copies the specified {@link AIString} to the {@link AIMeshAnim#mName} field. */
        public AIMeshAnim.Buffer mName(@NativeType("struct aiString") AIString value) { AIMeshAnim.nmName(address(), value); return this; }
        /** Passes the {@link AIMeshAnim#mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIMeshAnim.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Sets the address of the specified {@link AIMeshKey.Buffer} to the {@link AIMeshAnim#mKeys} field. */
        public AIMeshAnim.Buffer mKeys(@NativeType("struct aiMeshKey *") AIMeshKey.Buffer value) { AIMeshAnim.nmKeys(address(), value); return this; }

    }

}