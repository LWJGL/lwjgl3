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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Defines how an UV channel is transformed.
 * 
 * <p>This is just a helper structure for the {@link Assimp#_AI_MATKEY_UVTRANSFORM_BASE} key. See its documentation for more details.</p>
 * 
 * <p>Typically you'll want to build a matrix of this information. However, we keep separate scaling/translation/rotation values to make it easier to process
 * and optimize UV transformations internally.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mTranslation} &ndash; Translation on the u and v axes. The default value is (0|0).</li>
 * <li>{@code mScaling} &ndash; Scaling on the u and v axes. The default value is (1|1).</li>
 * <li>{@code mRotation} &ndash; Rotation - in counter-clockwise direction. The rotation angle is specified in radians. The rotation center is 0.5f|0.5f. The default value 0.f.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiUVTransform {
 *     {@link AIVector2D struct aiVector2D} mTranslation;
 *     {@link AIVector2D struct aiVector2D} mScaling;
 *     float mRotation;
 * }</pre></code>
 */
@NativeType("struct aiUVTransform")
public class AIUVTransform extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MTRANSLATION,
        MSCALING,
        MROTATION;

    static {
        Layout layout = __struct(
            __member(AIVector2D.SIZEOF, AIVector2D.ALIGNOF),
            __member(AIVector2D.SIZEOF, AIVector2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MTRANSLATION = layout.offsetof(0);
        MSCALING = layout.offsetof(1);
        MROTATION = layout.offsetof(2);
    }

    AIUVTransform(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIUVTransform} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIUVTransform(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link AIVector2D} view of the {@code mTranslation} field. */
    @NativeType("struct aiVector2D")
    public AIVector2D mTranslation() { return nmTranslation(address()); }
    /** Returns a {@link AIVector2D} view of the {@code mScaling} field. */
    @NativeType("struct aiVector2D")
    public AIVector2D mScaling() { return nmScaling(address()); }
    /** Returns the value of the {@code mRotation} field. */
    public float mRotation() { return nmRotation(address()); }

    // -----------------------------------

    /** Returns a new {@link AIUVTransform} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIUVTransform malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link AIUVTransform} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIUVTransform calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link AIUVTransform} instance allocated with {@link BufferUtils}. */
    public static AIUVTransform create() {
        return new AIUVTransform(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIUVTransform} instance for the specified memory address. */
    public static AIUVTransform create(long address) {
        return new AIUVTransform(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIUVTransform createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link AIUVTransform.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIUVTransform.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIUVTransform} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIUVTransform mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIUVTransform} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIUVTransform callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIUVTransform} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIUVTransform mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIUVTransform} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIUVTransform callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mTranslation}. */
    public static AIVector2D nmTranslation(long struct) { return AIVector2D.create(struct + AIUVTransform.MTRANSLATION); }
    /** Unsafe version of {@link #mScaling}. */
    public static AIVector2D nmScaling(long struct) { return AIVector2D.create(struct + AIUVTransform.MSCALING); }
    /** Unsafe version of {@link #mRotation}. */
    public static float nmRotation(long struct) { return memGetFloat(struct + AIUVTransform.MROTATION); }

    // -----------------------------------

    /** An array of {@link AIUVTransform} structs. */
    public static class Buffer extends StructBuffer<AIUVTransform, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIUVTransform.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIUVTransform#SIZEOF}, and its mark will be undefined.
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
        protected AIUVTransform newInstance(long address) {
            return new AIUVTransform(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link AIVector2D} view of the {@code mTranslation} field. */
        @NativeType("struct aiVector2D")
        public AIVector2D mTranslation() { return AIUVTransform.nmTranslation(address()); }
        /** Returns a {@link AIVector2D} view of the {@code mScaling} field. */
        @NativeType("struct aiVector2D")
        public AIVector2D mScaling() { return AIUVTransform.nmScaling(address()); }
        /** Returns the value of the {@code mRotation} field. */
        public float mRotation() { return AIUVTransform.nmRotation(address()); }

    }

}