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
 * struct aiNodeAnim {
 *     {@link AIString struct aiString} mNodeName;
 *     unsigned int mNumPositionKeys;
 *     {@link AIVectorKey struct aiVectorKey} * mPositionKeys;
 *     unsigned int mNumRotationKeys;
 *     {@link AIQuatKey struct aiQuatKey} * mRotationKeys;
 *     unsigned int mNumScalingKeys;
 *     {@link AIVectorKey struct aiVectorKey} * mScalingKeys;
 *     aiAnimBehaviour mPreState;
 *     aiAnimBehaviour mPostState;
 * }</code></pre>
 */
@NativeType("struct aiNodeAnim")
public class AINodeAnim extends Struct<AINodeAnim> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNODENAME,
        MNUMPOSITIONKEYS,
        MPOSITIONKEYS,
        MNUMROTATIONKEYS,
        MROTATIONKEYS,
        MNUMSCALINGKEYS,
        MSCALINGKEYS,
        MPRESTATE,
        MPOSTSTATE;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNODENAME = layout.offsetof(0);
        MNUMPOSITIONKEYS = layout.offsetof(1);
        MPOSITIONKEYS = layout.offsetof(2);
        MNUMROTATIONKEYS = layout.offsetof(3);
        MROTATIONKEYS = layout.offsetof(4);
        MNUMSCALINGKEYS = layout.offsetof(5);
        MSCALINGKEYS = layout.offsetof(6);
        MPRESTATE = layout.offsetof(7);
        MPOSTSTATE = layout.offsetof(8);
    }

    protected AINodeAnim(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AINodeAnim create(long address, @Nullable ByteBuffer container) {
        return new AINodeAnim(address, container);
    }

    /**
     * Creates a {@code AINodeAnim} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AINodeAnim(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link AIString} view of the {@code mNodeName} field. */
    @NativeType("struct aiString")
    public AIString mNodeName() { return nmNodeName(address()); }
    /** @return the value of the {@code mNumPositionKeys} field. */
    @NativeType("unsigned int")
    public int mNumPositionKeys() { return nmNumPositionKeys(address()); }
    /** @return a {@link AIVectorKey.Buffer} view of the struct array pointed to by the {@code mPositionKeys} field. */
    @NativeType("struct aiVectorKey *")
    public AIVectorKey.@Nullable Buffer mPositionKeys() { return nmPositionKeys(address()); }
    /** @return the value of the {@code mNumRotationKeys} field. */
    @NativeType("unsigned int")
    public int mNumRotationKeys() { return nmNumRotationKeys(address()); }
    /** @return a {@link AIQuatKey.Buffer} view of the struct array pointed to by the {@code mRotationKeys} field. */
    @NativeType("struct aiQuatKey *")
    public AIQuatKey.@Nullable Buffer mRotationKeys() { return nmRotationKeys(address()); }
    /** @return the value of the {@code mNumScalingKeys} field. */
    @NativeType("unsigned int")
    public int mNumScalingKeys() { return nmNumScalingKeys(address()); }
    /** @return a {@link AIVectorKey.Buffer} view of the struct array pointed to by the {@code mScalingKeys} field. */
    @NativeType("struct aiVectorKey *")
    public AIVectorKey.@Nullable Buffer mScalingKeys() { return nmScalingKeys(address()); }
    /** @return the value of the {@code mPreState} field. */
    @NativeType("aiAnimBehaviour")
    public int mPreState() { return nmPreState(address()); }
    /** @return the value of the {@code mPostState} field. */
    @NativeType("aiAnimBehaviour")
    public int mPostState() { return nmPostState(address()); }

    /** Copies the specified {@link AIString} to the {@code mNodeName} field. */
    public AINodeAnim mNodeName(@NativeType("struct aiString") AIString value) { nmNodeName(address(), value); return this; }
    /** Passes the {@code mNodeName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AINodeAnim mNodeName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mNodeName()); return this; }
    /** Sets the address of the specified {@link AIVectorKey.Buffer} to the {@code mPositionKeys} field. */
    public AINodeAnim mPositionKeys(@NativeType("struct aiVectorKey *") AIVectorKey.@Nullable Buffer value) { nmPositionKeys(address(), value); return this; }
    /** Sets the address of the specified {@link AIQuatKey.Buffer} to the {@code mRotationKeys} field. */
    public AINodeAnim mRotationKeys(@NativeType("struct aiQuatKey *") AIQuatKey.@Nullable Buffer value) { nmRotationKeys(address(), value); return this; }
    /** Sets the address of the specified {@link AIVectorKey.Buffer} to the {@code mScalingKeys} field. */
    public AINodeAnim mScalingKeys(@NativeType("struct aiVectorKey *") AIVectorKey.@Nullable Buffer value) { nmScalingKeys(address(), value); return this; }
    /** Sets the specified value to the {@code mPreState} field. */
    public AINodeAnim mPreState(@NativeType("aiAnimBehaviour") int value) { nmPreState(address(), value); return this; }
    /** Sets the specified value to the {@code mPostState} field. */
    public AINodeAnim mPostState(@NativeType("aiAnimBehaviour") int value) { nmPostState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AINodeAnim set(
        AIString mNodeName,
        AIVectorKey.@Nullable Buffer mPositionKeys,
        AIQuatKey.@Nullable Buffer mRotationKeys,
        AIVectorKey.@Nullable Buffer mScalingKeys,
        int mPreState,
        int mPostState
    ) {
        mNodeName(mNodeName);
        mPositionKeys(mPositionKeys);
        mRotationKeys(mRotationKeys);
        mScalingKeys(mScalingKeys);
        mPreState(mPreState);
        mPostState(mPostState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AINodeAnim set(AINodeAnim src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AINodeAnim} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AINodeAnim malloc() {
        return new AINodeAnim(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AINodeAnim} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AINodeAnim calloc() {
        return new AINodeAnim(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AINodeAnim} instance allocated with {@link BufferUtils}. */
    public static AINodeAnim create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AINodeAnim(memAddress(container), container);
    }

    /** Returns a new {@code AINodeAnim} instance for the specified memory address. */
    public static AINodeAnim create(long address) {
        return new AINodeAnim(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AINodeAnim createSafe(long address) {
        return address == NULL ? null : new AINodeAnim(address, null);
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AINodeAnim.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AINodeAnim.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AINodeAnim.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AINodeAnim.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AINodeAnim.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AINodeAnim.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AINodeAnim mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AINodeAnim callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AINodeAnim mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AINodeAnim callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AINodeAnim.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AINodeAnim.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AINodeAnim.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AINodeAnim.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AINodeAnim} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AINodeAnim malloc(MemoryStack stack) {
        return new AINodeAnim(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AINodeAnim} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AINodeAnim calloc(MemoryStack stack) {
        return new AINodeAnim(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AINodeAnim.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AINodeAnim.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mNodeName}. */
    public static AIString nmNodeName(long struct) { return AIString.create(struct + AINodeAnim.MNODENAME); }
    /** Unsafe version of {@link #mNumPositionKeys}. */
    public static int nmNumPositionKeys(long struct) { return memGetInt(struct + AINodeAnim.MNUMPOSITIONKEYS); }
    /** Unsafe version of {@link #mPositionKeys}. */
    public static AIVectorKey.@Nullable Buffer nmPositionKeys(long struct) { return AIVectorKey.createSafe(memGetAddress(struct + AINodeAnim.MPOSITIONKEYS), nmNumPositionKeys(struct)); }
    /** Unsafe version of {@link #mNumRotationKeys}. */
    public static int nmNumRotationKeys(long struct) { return memGetInt(struct + AINodeAnim.MNUMROTATIONKEYS); }
    /** Unsafe version of {@link #mRotationKeys}. */
    public static AIQuatKey.@Nullable Buffer nmRotationKeys(long struct) { return AIQuatKey.createSafe(memGetAddress(struct + AINodeAnim.MROTATIONKEYS), nmNumRotationKeys(struct)); }
    /** Unsafe version of {@link #mNumScalingKeys}. */
    public static int nmNumScalingKeys(long struct) { return memGetInt(struct + AINodeAnim.MNUMSCALINGKEYS); }
    /** Unsafe version of {@link #mScalingKeys}. */
    public static AIVectorKey.@Nullable Buffer nmScalingKeys(long struct) { return AIVectorKey.createSafe(memGetAddress(struct + AINodeAnim.MSCALINGKEYS), nmNumScalingKeys(struct)); }
    /** Unsafe version of {@link #mPreState}. */
    public static int nmPreState(long struct) { return memGetInt(struct + AINodeAnim.MPRESTATE); }
    /** Unsafe version of {@link #mPostState}. */
    public static int nmPostState(long struct) { return memGetInt(struct + AINodeAnim.MPOSTSTATE); }

    /** Unsafe version of {@link #mNodeName(AIString) mNodeName}. */
    public static void nmNodeName(long struct, AIString value) { memCopy(value.address(), struct + AINodeAnim.MNODENAME, AIString.SIZEOF); }
    /** Sets the specified value to the {@code mNumPositionKeys} field of the specified {@code struct}. */
    public static void nmNumPositionKeys(long struct, int value) { memPutInt(struct + AINodeAnim.MNUMPOSITIONKEYS, value); }
    /** Unsafe version of {@link #mPositionKeys(AIVectorKey.Buffer) mPositionKeys}. */
    public static void nmPositionKeys(long struct, AIVectorKey.@Nullable Buffer value) { memPutAddress(struct + AINodeAnim.MPOSITIONKEYS, memAddressSafe(value)); nmNumPositionKeys(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumRotationKeys} field of the specified {@code struct}. */
    public static void nmNumRotationKeys(long struct, int value) { memPutInt(struct + AINodeAnim.MNUMROTATIONKEYS, value); }
    /** Unsafe version of {@link #mRotationKeys(AIQuatKey.Buffer) mRotationKeys}. */
    public static void nmRotationKeys(long struct, AIQuatKey.@Nullable Buffer value) { memPutAddress(struct + AINodeAnim.MROTATIONKEYS, memAddressSafe(value)); nmNumRotationKeys(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumScalingKeys} field of the specified {@code struct}. */
    public static void nmNumScalingKeys(long struct, int value) { memPutInt(struct + AINodeAnim.MNUMSCALINGKEYS, value); }
    /** Unsafe version of {@link #mScalingKeys(AIVectorKey.Buffer) mScalingKeys}. */
    public static void nmScalingKeys(long struct, AIVectorKey.@Nullable Buffer value) { memPutAddress(struct + AINodeAnim.MSCALINGKEYS, memAddressSafe(value)); nmNumScalingKeys(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #mPreState(int) mPreState}. */
    public static void nmPreState(long struct, int value) { memPutInt(struct + AINodeAnim.MPRESTATE, value); }
    /** Unsafe version of {@link #mPostState(int) mPostState}. */
    public static void nmPostState(long struct, int value) { memPutInt(struct + AINodeAnim.MPOSTSTATE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nmNumPositionKeys(struct) != 0) {
            check(memGetAddress(struct + AINodeAnim.MPOSITIONKEYS));
        }
        if (nmNumRotationKeys(struct) != 0) {
            check(memGetAddress(struct + AINodeAnim.MROTATIONKEYS));
        }
        if (nmNumScalingKeys(struct) != 0) {
            check(memGetAddress(struct + AINodeAnim.MSCALINGKEYS));
        }
    }

    // -----------------------------------

    /** An array of {@link AINodeAnim} structs. */
    public static class Buffer extends StructBuffer<AINodeAnim, Buffer> implements NativeResource {

        private static final AINodeAnim ELEMENT_FACTORY = AINodeAnim.create(-1L);

        /**
         * Creates a new {@code AINodeAnim.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AINodeAnim#SIZEOF}, and its mark will be undefined.</p>
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
        protected AINodeAnim getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIString} view of the {@code mNodeName} field. */
        @NativeType("struct aiString")
        public AIString mNodeName() { return AINodeAnim.nmNodeName(address()); }
        /** @return the value of the {@code mNumPositionKeys} field. */
        @NativeType("unsigned int")
        public int mNumPositionKeys() { return AINodeAnim.nmNumPositionKeys(address()); }
        /** @return a {@link AIVectorKey.Buffer} view of the struct array pointed to by the {@code mPositionKeys} field. */
        @NativeType("struct aiVectorKey *")
        public AIVectorKey.@Nullable Buffer mPositionKeys() { return AINodeAnim.nmPositionKeys(address()); }
        /** @return the value of the {@code mNumRotationKeys} field. */
        @NativeType("unsigned int")
        public int mNumRotationKeys() { return AINodeAnim.nmNumRotationKeys(address()); }
        /** @return a {@link AIQuatKey.Buffer} view of the struct array pointed to by the {@code mRotationKeys} field. */
        @NativeType("struct aiQuatKey *")
        public AIQuatKey.@Nullable Buffer mRotationKeys() { return AINodeAnim.nmRotationKeys(address()); }
        /** @return the value of the {@code mNumScalingKeys} field. */
        @NativeType("unsigned int")
        public int mNumScalingKeys() { return AINodeAnim.nmNumScalingKeys(address()); }
        /** @return a {@link AIVectorKey.Buffer} view of the struct array pointed to by the {@code mScalingKeys} field. */
        @NativeType("struct aiVectorKey *")
        public AIVectorKey.@Nullable Buffer mScalingKeys() { return AINodeAnim.nmScalingKeys(address()); }
        /** @return the value of the {@code mPreState} field. */
        @NativeType("aiAnimBehaviour")
        public int mPreState() { return AINodeAnim.nmPreState(address()); }
        /** @return the value of the {@code mPostState} field. */
        @NativeType("aiAnimBehaviour")
        public int mPostState() { return AINodeAnim.nmPostState(address()); }

        /** Copies the specified {@link AIString} to the {@code mNodeName} field. */
        public AINodeAnim.Buffer mNodeName(@NativeType("struct aiString") AIString value) { AINodeAnim.nmNodeName(address(), value); return this; }
        /** Passes the {@code mNodeName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AINodeAnim.Buffer mNodeName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mNodeName()); return this; }
        /** Sets the address of the specified {@link AIVectorKey.Buffer} to the {@code mPositionKeys} field. */
        public AINodeAnim.Buffer mPositionKeys(@NativeType("struct aiVectorKey *") AIVectorKey.@Nullable Buffer value) { AINodeAnim.nmPositionKeys(address(), value); return this; }
        /** Sets the address of the specified {@link AIQuatKey.Buffer} to the {@code mRotationKeys} field. */
        public AINodeAnim.Buffer mRotationKeys(@NativeType("struct aiQuatKey *") AIQuatKey.@Nullable Buffer value) { AINodeAnim.nmRotationKeys(address(), value); return this; }
        /** Sets the address of the specified {@link AIVectorKey.Buffer} to the {@code mScalingKeys} field. */
        public AINodeAnim.Buffer mScalingKeys(@NativeType("struct aiVectorKey *") AIVectorKey.@Nullable Buffer value) { AINodeAnim.nmScalingKeys(address(), value); return this; }
        /** Sets the specified value to the {@code mPreState} field. */
        public AINodeAnim.Buffer mPreState(@NativeType("aiAnimBehaviour") int value) { AINodeAnim.nmPreState(address(), value); return this; }
        /** Sets the specified value to the {@code mPostState} field. */
        public AINodeAnim.Buffer mPostState(@NativeType("aiAnimBehaviour") int value) { AINodeAnim.nmPostState(address(), value); return this; }

    }

}