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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiUVTransform {
 *     {@link AIVector2D struct aiVector2D} {@link #mTranslation};
 *     {@link AIVector2D struct aiVector2D} {@link #mScaling};
 *     float {@link #mRotation};
 * }</code></pre>
 */
@NativeType("struct aiUVTransform")
public class AIUVTransform extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
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

    /**
     * Creates a {@code AIUVTransform} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIUVTransform(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Translation on the u and v axes. The default value is (0|0). */
    @NativeType("struct aiVector2D")
    public AIVector2D mTranslation() { return nmTranslation(address()); }
    /** Scaling on the u and v axes. The default value is (1|1). */
    @NativeType("struct aiVector2D")
    public AIVector2D mScaling() { return nmScaling(address()); }
    /** Rotation - in counter-clockwise direction. The rotation angle is specified in radians. The rotation center is 0.5f|0.5f. The default value 0.f. */
    public float mRotation() { return nmRotation(address()); }

    // -----------------------------------

    /** Returns a new {@code AIUVTransform} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIUVTransform malloc() {
        return wrap(AIUVTransform.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIUVTransform} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIUVTransform calloc() {
        return wrap(AIUVTransform.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIUVTransform} instance allocated with {@link BufferUtils}. */
    public static AIUVTransform create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIUVTransform.class, memAddress(container), container);
    }

    /** Returns a new {@code AIUVTransform} instance for the specified memory address. */
    public static AIUVTransform create(long address) {
        return wrap(AIUVTransform.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIUVTransform createSafe(long address) {
        return address == NULL ? null : wrap(AIUVTransform.class, address);
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIUVTransform.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIUVTransform.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIUVTransform mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIUVTransform callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIUVTransform mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIUVTransform callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIUVTransform.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIUVTransform.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIUVTransform.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIUVTransform.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIUVTransform} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIUVTransform malloc(MemoryStack stack) {
        return wrap(AIUVTransform.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIUVTransform} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIUVTransform calloc(MemoryStack stack) {
        return wrap(AIUVTransform.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIUVTransform.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIUVTransform.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mTranslation}. */
    public static AIVector2D nmTranslation(long struct) { return AIVector2D.create(struct + AIUVTransform.MTRANSLATION); }
    /** Unsafe version of {@link #mScaling}. */
    public static AIVector2D nmScaling(long struct) { return AIVector2D.create(struct + AIUVTransform.MSCALING); }
    /** Unsafe version of {@link #mRotation}. */
    public static float nmRotation(long struct) { return UNSAFE.getFloat(null, struct + AIUVTransform.MROTATION); }

    // -----------------------------------

    /** An array of {@link AIUVTransform} structs. */
    public static class Buffer extends StructBuffer<AIUVTransform, Buffer> implements NativeResource {

        private static final AIUVTransform ELEMENT_FACTORY = AIUVTransform.create(-1L);

        /**
         * Creates a new {@code AIUVTransform.Buffer} instance backed by the specified container.
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
        protected AIUVTransform getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIVector2D} view of the {@link AIUVTransform#mTranslation} field. */
        @NativeType("struct aiVector2D")
        public AIVector2D mTranslation() { return AIUVTransform.nmTranslation(address()); }
        /** @return a {@link AIVector2D} view of the {@link AIUVTransform#mScaling} field. */
        @NativeType("struct aiVector2D")
        public AIVector2D mScaling() { return AIUVTransform.nmScaling(address()); }
        /** @return the value of the {@link AIUVTransform#mRotation} field. */
        public float mRotation() { return AIUVTransform.nmRotation(address()); }

    }

}