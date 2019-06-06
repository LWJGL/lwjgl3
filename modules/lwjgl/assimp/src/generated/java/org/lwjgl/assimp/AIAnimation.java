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
 * An animation consists of keyframe data for a number of nodes. For each node affected by the animation a separate series of data is given.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mName} &ndash; 
 * The name of the animation. If the modeling package this data was exported from does support only a single animation channel, this name is usually empty
 * (length is zero).</li>
 * <li>{@code mDuration} &ndash; Duration of the animation in ticks.</li>
 * <li>{@code mTicksPerSecond} &ndash; Ticks per second. 0 if not specified in the imported file</li>
 * <li>{@code mNumChannels} &ndash; The number of bone animation channels. Each channel affects a single node.</li>
 * <li>{@code mChannels} &ndash; The node animation channels. Each channel affects a single node. The array is {@code mNumChannels} in size.</li>
 * <li>{@code mNumMeshChannels} &ndash; The number of mesh animation channels. Each channel affects a single mesh and defines vertex-based animation.</li>
 * <li>{@code mMeshChannels} &ndash; The mesh animation channels. Each channel affects a single mesh. The array is {@code mNumMeshChannels} in size.</li>
 * <li>{@code mNumMorphMeshChannels} &ndash; the number of mesh animation channels. Each channel affects a single mesh and defines morphing animation.</li>
 * <li>{@code mMorphMeshChannels} &ndash; the morph mesh animation channels. Each channel affects a single mesh. The array is {@code mNumMorphMeshChannels} in size.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiAnimation {
 *     {@link AIString struct aiString} mName;
 *     double mDuration;
 *     double mTicksPerSecond;
 *     unsigned int mNumChannels;
 *     {@link AINodeAnim struct aiNodeAnim} ** mChannels;
 *     unsigned int mNumMeshChannels;
 *     {@link AIMeshAnim struct aiMeshAnim} ** mMeshChannels;
 *     unsigned int mNumMorphMeshChannels;
 *     {@link AIMeshMorphAnim struct aiMeshMorphAnim} ** mMorphMeshChannels;
 * }</code></pre>
 */
@NativeType("struct aiAnimation")
public class AIAnimation extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MDURATION,
        MTICKSPERSECOND,
        MNUMCHANNELS,
        MCHANNELS,
        MNUMMESHCHANNELS,
        MMESHCHANNELS,
        MNUMMORPHMESHCHANNELS,
        MMORPHMESHCHANNELS;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MDURATION = layout.offsetof(1);
        MTICKSPERSECOND = layout.offsetof(2);
        MNUMCHANNELS = layout.offsetof(3);
        MCHANNELS = layout.offsetof(4);
        MNUMMESHCHANNELS = layout.offsetof(5);
        MMESHCHANNELS = layout.offsetof(6);
        MNUMMORPHMESHCHANNELS = layout.offsetof(7);
        MMORPHMESHCHANNELS = layout.offsetof(8);
    }

    /**
     * Creates a {@code AIAnimation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIAnimation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** Returns the value of the {@code mDuration} field. */
    public double mDuration() { return nmDuration(address()); }
    /** Returns the value of the {@code mTicksPerSecond} field. */
    public double mTicksPerSecond() { return nmTicksPerSecond(address()); }
    /** Returns the value of the {@code mNumChannels} field. */
    @NativeType("unsigned int")
    public int mNumChannels() { return nmNumChannels(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mChannels} field. */
    @Nullable
    @NativeType("struct aiNodeAnim **")
    public PointerBuffer mChannels() { return nmChannels(address()); }
    /** Returns the value of the {@code mNumMeshChannels} field. */
    @NativeType("unsigned int")
    public int mNumMeshChannels() { return nmNumMeshChannels(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mMeshChannels} field. */
    @Nullable
    @NativeType("struct aiMeshAnim **")
    public PointerBuffer mMeshChannels() { return nmMeshChannels(address()); }
    /** Returns the value of the {@code mNumMorphMeshChannels} field. */
    @NativeType("unsigned int")
    public int mNumMorphMeshChannels() { return nmNumMorphMeshChannels(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mMorphMeshChannels} field. */
    @Nullable
    @NativeType("struct aiMeshMorphAnim **")
    public PointerBuffer mMorphMeshChannels() { return nmMorphMeshChannels(address()); }

    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AIAnimation mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIAnimation mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Sets the specified value to the {@code mDuration} field. */
    public AIAnimation mDuration(double value) { nmDuration(address(), value); return this; }
    /** Sets the specified value to the {@code mTicksPerSecond} field. */
    public AIAnimation mTicksPerSecond(double value) { nmTicksPerSecond(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mChannels} field. */
    public AIAnimation mChannels(@Nullable @NativeType("struct aiNodeAnim **") PointerBuffer value) { nmChannels(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mMeshChannels} field. */
    public AIAnimation mMeshChannels(@Nullable @NativeType("struct aiMeshAnim **") PointerBuffer value) { nmMeshChannels(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mMorphMeshChannels} field. */
    public AIAnimation mMorphMeshChannels(@Nullable @NativeType("struct aiMeshMorphAnim **") PointerBuffer value) { nmMorphMeshChannels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIAnimation set(
        AIString mName,
        double mDuration,
        double mTicksPerSecond,
        @Nullable PointerBuffer mChannels,
        @Nullable PointerBuffer mMeshChannels,
        @Nullable PointerBuffer mMorphMeshChannels
    ) {
        mName(mName);
        mDuration(mDuration);
        mTicksPerSecond(mTicksPerSecond);
        mChannels(mChannels);
        mMeshChannels(mMeshChannels);
        mMorphMeshChannels(mMorphMeshChannels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIAnimation set(AIAnimation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIAnimation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIAnimation malloc() {
        return wrap(AIAnimation.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIAnimation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIAnimation calloc() {
        return wrap(AIAnimation.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIAnimation} instance allocated with {@link BufferUtils}. */
    public static AIAnimation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIAnimation.class, memAddress(container), container);
    }

    /** Returns a new {@code AIAnimation} instance for the specified memory address. */
    public static AIAnimation create(long address) {
        return wrap(AIAnimation.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIAnimation createSafe(long address) {
        return address == NULL ? null : wrap(AIAnimation.class, address);
    }

    /**
     * Returns a new {@link AIAnimation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIAnimation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAnimation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIAnimation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIAnimation.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code AIAnimation} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIAnimation mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code AIAnimation} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIAnimation callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code AIAnimation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIAnimation mallocStack(MemoryStack stack) {
        return wrap(AIAnimation.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIAnimation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIAnimation callocStack(MemoryStack stack) {
        return wrap(AIAnimation.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIAnimation.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIAnimation.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIAnimation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAnimation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AIAnimation.MNAME); }
    /** Unsafe version of {@link #mDuration}. */
    public static double nmDuration(long struct) { return UNSAFE.getDouble(null, struct + AIAnimation.MDURATION); }
    /** Unsafe version of {@link #mTicksPerSecond}. */
    public static double nmTicksPerSecond(long struct) { return UNSAFE.getDouble(null, struct + AIAnimation.MTICKSPERSECOND); }
    /** Unsafe version of {@link #mNumChannels}. */
    public static int nmNumChannels(long struct) { return UNSAFE.getInt(null, struct + AIAnimation.MNUMCHANNELS); }
    /** Unsafe version of {@link #mChannels() mChannels}. */
    @Nullable public static PointerBuffer nmChannels(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIAnimation.MCHANNELS), nmNumChannels(struct)); }
    /** Unsafe version of {@link #mNumMeshChannels}. */
    public static int nmNumMeshChannels(long struct) { return UNSAFE.getInt(null, struct + AIAnimation.MNUMMESHCHANNELS); }
    /** Unsafe version of {@link #mMeshChannels() mMeshChannels}. */
    @Nullable public static PointerBuffer nmMeshChannels(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIAnimation.MMESHCHANNELS), nmNumMeshChannels(struct)); }
    /** Unsafe version of {@link #mNumMorphMeshChannels}. */
    public static int nmNumMorphMeshChannels(long struct) { return UNSAFE.getInt(null, struct + AIAnimation.MNUMMORPHMESHCHANNELS); }
    /** Unsafe version of {@link #mMorphMeshChannels() mMorphMeshChannels}. */
    @Nullable public static PointerBuffer nmMorphMeshChannels(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIAnimation.MMORPHMESHCHANNELS), nmNumMorphMeshChannels(struct)); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AIAnimation.MNAME, AIString.SIZEOF); }
    /** Unsafe version of {@link #mDuration(double) mDuration}. */
    public static void nmDuration(long struct, double value) { UNSAFE.putDouble(null, struct + AIAnimation.MDURATION, value); }
    /** Unsafe version of {@link #mTicksPerSecond(double) mTicksPerSecond}. */
    public static void nmTicksPerSecond(long struct, double value) { UNSAFE.putDouble(null, struct + AIAnimation.MTICKSPERSECOND, value); }
    /** Sets the specified value to the {@code mNumChannels} field of the specified {@code struct}. */
    public static void nmNumChannels(long struct, int value) { UNSAFE.putInt(null, struct + AIAnimation.MNUMCHANNELS, value); }
    /** Unsafe version of {@link #mChannels(PointerBuffer) mChannels}. */
    public static void nmChannels(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIAnimation.MCHANNELS, memAddressSafe(value)); nmNumChannels(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumMeshChannels} field of the specified {@code struct}. */
    public static void nmNumMeshChannels(long struct, int value) { UNSAFE.putInt(null, struct + AIAnimation.MNUMMESHCHANNELS, value); }
    /** Unsafe version of {@link #mMeshChannels(PointerBuffer) mMeshChannels}. */
    public static void nmMeshChannels(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIAnimation.MMESHCHANNELS, memAddressSafe(value)); nmNumMeshChannels(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumMorphMeshChannels} field of the specified {@code struct}. */
    public static void nmNumMorphMeshChannels(long struct, int value) { UNSAFE.putInt(null, struct + AIAnimation.MNUMMORPHMESHCHANNELS, value); }
    /** Unsafe version of {@link #mMorphMeshChannels(PointerBuffer) mMorphMeshChannels}. */
    public static void nmMorphMeshChannels(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIAnimation.MMORPHMESHCHANNELS, memAddressSafe(value)); nmNumMorphMeshChannels(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nmNumChannels(struct) != 0) {
            check(memGetAddress(struct + AIAnimation.MCHANNELS));
        }
        if (nmNumMeshChannels(struct) != 0) {
            check(memGetAddress(struct + AIAnimation.MMESHCHANNELS));
        }
        if (nmNumMorphMeshChannels(struct) != 0) {
            check(memGetAddress(struct + AIAnimation.MMORPHMESHCHANNELS));
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

    /** An array of {@link AIAnimation} structs. */
    public static class Buffer extends StructBuffer<AIAnimation, Buffer> implements NativeResource {

        private static final AIAnimation ELEMENT_FACTORY = AIAnimation.create(-1L);

        /**
         * Creates a new {@code AIAnimation.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIAnimation#SIZEOF}, and its mark will be undefined.
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
        protected AIAnimation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AIAnimation.nmName(address()); }
        /** Returns the value of the {@code mDuration} field. */
        public double mDuration() { return AIAnimation.nmDuration(address()); }
        /** Returns the value of the {@code mTicksPerSecond} field. */
        public double mTicksPerSecond() { return AIAnimation.nmTicksPerSecond(address()); }
        /** Returns the value of the {@code mNumChannels} field. */
        @NativeType("unsigned int")
        public int mNumChannels() { return AIAnimation.nmNumChannels(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mChannels} field. */
        @Nullable
        @NativeType("struct aiNodeAnim **")
        public PointerBuffer mChannels() { return AIAnimation.nmChannels(address()); }
        /** Returns the value of the {@code mNumMeshChannels} field. */
        @NativeType("unsigned int")
        public int mNumMeshChannels() { return AIAnimation.nmNumMeshChannels(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mMeshChannels} field. */
        @Nullable
        @NativeType("struct aiMeshAnim **")
        public PointerBuffer mMeshChannels() { return AIAnimation.nmMeshChannels(address()); }
        /** Returns the value of the {@code mNumMorphMeshChannels} field. */
        @NativeType("unsigned int")
        public int mNumMorphMeshChannels() { return AIAnimation.nmNumMorphMeshChannels(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mMorphMeshChannels} field. */
        @Nullable
        @NativeType("struct aiMeshMorphAnim **")
        public PointerBuffer mMorphMeshChannels() { return AIAnimation.nmMorphMeshChannels(address()); }

        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AIAnimation.Buffer mName(@NativeType("struct aiString") AIString value) { AIAnimation.nmName(address(), value); return this; }
        /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIAnimation.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Sets the specified value to the {@code mDuration} field. */
        public AIAnimation.Buffer mDuration(double value) { AIAnimation.nmDuration(address(), value); return this; }
        /** Sets the specified value to the {@code mTicksPerSecond} field. */
        public AIAnimation.Buffer mTicksPerSecond(double value) { AIAnimation.nmTicksPerSecond(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mChannels} field. */
        public AIAnimation.Buffer mChannels(@Nullable @NativeType("struct aiNodeAnim **") PointerBuffer value) { AIAnimation.nmChannels(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mMeshChannels} field. */
        public AIAnimation.Buffer mMeshChannels(@Nullable @NativeType("struct aiMeshAnim **") PointerBuffer value) { AIAnimation.nmMeshChannels(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mMorphMeshChannels} field. */
        public AIAnimation.Buffer mMorphMeshChannels(@Nullable @NativeType("struct aiMeshMorphAnim **") PointerBuffer value) { AIAnimation.nmMorphMeshChannels(address(), value); return this; }

    }

}