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
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiAnimation {
 *     {@link AIString struct aiString} mName;
 *     double mDuration;
 *     double mTicksPerSecond;
 *     unsigned int mNumChannels;
 *     {@link AINodeAnim struct aiNodeAnim} ** mChannels;
 *     unsigned int mNumMeshChannels;
 *     {@link AIMeshAnim struct aiMeshAnim} ** mMeshChannels;
 * }</pre></code>
 */
@NativeType("struct aiAnimation")
public class AIAnimation extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MDURATION,
        MTICKSPERSECOND,
        MNUMCHANNELS,
        MCHANNELS,
        MNUMMESHCHANNELS,
        MMESHCHANNELS;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(8),
            __member(8),
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
    }

    AIAnimation(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIAnimation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIAnimation(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIAnimation mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Returns the value of the {@code mDuration} field. */
    public double mDuration() { return nmDuration(address()); }
    /** Returns the value of the {@code mTicksPerSecond} field. */
    public double mTicksPerSecond() { return nmTicksPerSecond(address()); }
    /** Returns the value of the {@code mNumChannels} field. */
    @NativeType("unsigned int")
    public int mNumChannels() { return nmNumChannels(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mChannels} field. */
    @NativeType("struct aiNodeAnim **")
    public PointerBuffer mChannels() { return nmChannels(address()); }
    /** Returns the value of the {@code mNumMeshChannels} field. */
    @NativeType("unsigned int")
    public int mNumMeshChannels() { return nmNumMeshChannels(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mMeshChannels} field. */
    @NativeType("struct aiMeshAnim **")
    public PointerBuffer mMeshChannels() { return nmMeshChannels(address()); }

    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AIAnimation mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Sets the specified value to the {@code mDuration} field. */
    public AIAnimation mDuration(double value) { nmDuration(address(), value); return this; }
    /** Sets the specified value to the {@code mTicksPerSecond} field. */
    public AIAnimation mTicksPerSecond(double value) { nmTicksPerSecond(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mChannels} field. */
    public AIAnimation mChannels(@NativeType("struct aiNodeAnim **") PointerBuffer value) { nmChannels(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mMeshChannels} field. */
    public AIAnimation mMeshChannels(@NativeType("struct aiMeshAnim **") PointerBuffer value) { nmMeshChannels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIAnimation set(
        AIString mName,
        double mDuration,
        double mTicksPerSecond,
        PointerBuffer mChannels,
        PointerBuffer mMeshChannels
    ) {
        mName(mName);
        mDuration(mDuration);
        mTicksPerSecond(mTicksPerSecond);
        mChannels(mChannels);
        mMeshChannels(mMeshChannels);

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

    /** Returns a new {@link AIAnimation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIAnimation malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link AIAnimation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIAnimation calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link AIAnimation} instance allocated with {@link BufferUtils}. */
    public static AIAnimation create() {
        return new AIAnimation(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIAnimation} instance for the specified memory address. */
    public static AIAnimation create(long address) {
        return new AIAnimation(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIAnimation createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link AIAnimation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAnimation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAnimation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link AIAnimation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIAnimation.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIAnimation} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIAnimation mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIAnimation} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIAnimation callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIAnimation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIAnimation mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIAnimation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIAnimation callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
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
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAnimation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIAnimation.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AIAnimation.MNAME); }
    /** Unsafe version of {@link #mDuration}. */
    public static double nmDuration(long struct) { return memGetDouble(struct + AIAnimation.MDURATION); }
    /** Unsafe version of {@link #mTicksPerSecond}. */
    public static double nmTicksPerSecond(long struct) { return memGetDouble(struct + AIAnimation.MTICKSPERSECOND); }
    /** Unsafe version of {@link #mNumChannels}. */
    public static int nmNumChannels(long struct) { return memGetInt(struct + AIAnimation.MNUMCHANNELS); }
    /** Unsafe version of {@link #mChannels() mChannels}. */
    public static PointerBuffer nmChannels(long struct) { return memPointerBuffer(memGetAddress(struct + AIAnimation.MCHANNELS), nmNumChannels(struct)); }
    /** Unsafe version of {@link #mNumMeshChannels}. */
    public static int nmNumMeshChannels(long struct) { return memGetInt(struct + AIAnimation.MNUMMESHCHANNELS); }
    /** Unsafe version of {@link #mMeshChannels() mMeshChannels}. */
    public static PointerBuffer nmMeshChannels(long struct) { return memPointerBuffer(memGetAddress(struct + AIAnimation.MMESHCHANNELS), nmNumMeshChannels(struct)); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AIAnimation.MNAME, AIString.SIZEOF); }
    /** Unsafe version of {@link #mDuration(double) mDuration}. */
    public static void nmDuration(long struct, double value) { memPutDouble(struct + AIAnimation.MDURATION, value); }
    /** Unsafe version of {@link #mTicksPerSecond(double) mTicksPerSecond}. */
    public static void nmTicksPerSecond(long struct, double value) { memPutDouble(struct + AIAnimation.MTICKSPERSECOND, value); }
    /** Sets the specified value to the {@code mNumChannels} field of the specified {@code struct}. */
    public static void nmNumChannels(long struct, int value) { memPutInt(struct + AIAnimation.MNUMCHANNELS, value); }
    /** Unsafe version of {@link #mChannels(PointerBuffer) mChannels}. */
    public static void nmChannels(long struct, PointerBuffer value) { memPutAddress(struct + AIAnimation.MCHANNELS, memAddress(value)); nmNumChannels(struct, value.remaining()); }
    /** Sets the specified value to the {@code mNumMeshChannels} field of the specified {@code struct}. */
    public static void nmNumMeshChannels(long struct, int value) { memPutInt(struct + AIAnimation.MNUMMESHCHANNELS, value); }
    /** Unsafe version of {@link #mMeshChannels(PointerBuffer) mMeshChannels}. */
    public static void nmMeshChannels(long struct, PointerBuffer value) { memPutAddress(struct + AIAnimation.MMESHCHANNELS, memAddress(value)); nmNumMeshChannels(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIAnimation.MCHANNELS));
        check(memGetAddress(struct + AIAnimation.MMESHCHANNELS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link AIAnimation} structs. */
    public static class Buffer extends StructBuffer<AIAnimation, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIAnimation.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected AIAnimation newInstance(long address) {
            return new AIAnimation(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AIAnimation.nmName(address()); }
        /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIAnimation.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Returns the value of the {@code mDuration} field. */
        public double mDuration() { return AIAnimation.nmDuration(address()); }
        /** Returns the value of the {@code mTicksPerSecond} field. */
        public double mTicksPerSecond() { return AIAnimation.nmTicksPerSecond(address()); }
        /** Returns the value of the {@code mNumChannels} field. */
        @NativeType("unsigned int")
        public int mNumChannels() { return AIAnimation.nmNumChannels(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mChannels} field. */
        @NativeType("struct aiNodeAnim **")
        public PointerBuffer mChannels() { return AIAnimation.nmChannels(address()); }
        /** Returns the value of the {@code mNumMeshChannels} field. */
        @NativeType("unsigned int")
        public int mNumMeshChannels() { return AIAnimation.nmNumMeshChannels(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mMeshChannels} field. */
        @NativeType("struct aiMeshAnim **")
        public PointerBuffer mMeshChannels() { return AIAnimation.nmMeshChannels(address()); }

        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AIAnimation.Buffer mName(@NativeType("struct aiString") AIString value) { AIAnimation.nmName(address(), value); return this; }
        /** Sets the specified value to the {@code mDuration} field. */
        public AIAnimation.Buffer mDuration(double value) { AIAnimation.nmDuration(address(), value); return this; }
        /** Sets the specified value to the {@code mTicksPerSecond} field. */
        public AIAnimation.Buffer mTicksPerSecond(double value) { AIAnimation.nmTicksPerSecond(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mChannels} field. */
        public AIAnimation.Buffer mChannels(@NativeType("struct aiNodeAnim **") PointerBuffer value) { AIAnimation.nmChannels(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mMeshChannels} field. */
        public AIAnimation.Buffer mMeshChannels(@NativeType("struct aiMeshAnim **") PointerBuffer value) { AIAnimation.nmMeshChannels(address(), value); return this; }

    }

}