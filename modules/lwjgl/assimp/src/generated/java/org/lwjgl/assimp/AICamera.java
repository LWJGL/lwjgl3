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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct aiCamera {
 *     {@link AIString struct aiString} mName;
 *     {@link AIVector3D struct aiVector3D} mPosition;
 *     {@link AIVector3D struct aiVector3D} mUp;
 *     {@link AIVector3D struct aiVector3D} mLookAt;
 *     float mHorizontalFOV;
 *     float mClipPlaneNear;
 *     float mClipPlaneFar;
 *     float mAspect;
 *     float mOrthographicWidth;
 * }</code></pre>
 */
@NativeType("struct aiCamera")
public class AICamera extends Struct<AICamera> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MPOSITION,
        MUP,
        MLOOKAT,
        MHORIZONTALFOV,
        MCLIPPLANENEAR,
        MCLIPPLANEFAR,
        MASPECT,
        MORTHOGRAPHICWIDTH;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF),
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF),
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MPOSITION = layout.offsetof(1);
        MUP = layout.offsetof(2);
        MLOOKAT = layout.offsetof(3);
        MHORIZONTALFOV = layout.offsetof(4);
        MCLIPPLANENEAR = layout.offsetof(5);
        MCLIPPLANEFAR = layout.offsetof(6);
        MASPECT = layout.offsetof(7);
        MORTHOGRAPHICWIDTH = layout.offsetof(8);
    }

    protected AICamera(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AICamera create(long address, @Nullable ByteBuffer container) {
        return new AICamera(address, container);
    }

    /**
     * Creates a {@code AICamera} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AICamera(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** @return a {@link AIVector3D} view of the {@code mPosition} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mPosition() { return nmPosition(address()); }
    /** @return a {@link AIVector3D} view of the {@code mUp} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mUp() { return nmUp(address()); }
    /** @return a {@link AIVector3D} view of the {@code mLookAt} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mLookAt() { return nmLookAt(address()); }
    /** @return the value of the {@code mHorizontalFOV} field. */
    public float mHorizontalFOV() { return nmHorizontalFOV(address()); }
    /** @return the value of the {@code mClipPlaneNear} field. */
    public float mClipPlaneNear() { return nmClipPlaneNear(address()); }
    /** @return the value of the {@code mClipPlaneFar} field. */
    public float mClipPlaneFar() { return nmClipPlaneFar(address()); }
    /** @return the value of the {@code mAspect} field. */
    public float mAspect() { return nmAspect(address()); }
    /** @return the value of the {@code mOrthographicWidth} field. */
    public float mOrthographicWidth() { return nmOrthographicWidth(address()); }

    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AICamera mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AICamera mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Copies the specified {@link AIVector3D} to the {@code mPosition} field. */
    public AICamera mPosition(@NativeType("struct aiVector3D") AIVector3D value) { nmPosition(address(), value); return this; }
    /** Passes the {@code mPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AICamera mPosition(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mPosition()); return this; }
    /** Copies the specified {@link AIVector3D} to the {@code mUp} field. */
    public AICamera mUp(@NativeType("struct aiVector3D") AIVector3D value) { nmUp(address(), value); return this; }
    /** Passes the {@code mUp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AICamera mUp(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mUp()); return this; }
    /** Copies the specified {@link AIVector3D} to the {@code mLookAt} field. */
    public AICamera mLookAt(@NativeType("struct aiVector3D") AIVector3D value) { nmLookAt(address(), value); return this; }
    /** Passes the {@code mLookAt} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AICamera mLookAt(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mLookAt()); return this; }
    /** Sets the specified value to the {@code mHorizontalFOV} field. */
    public AICamera mHorizontalFOV(float value) { nmHorizontalFOV(address(), value); return this; }
    /** Sets the specified value to the {@code mClipPlaneNear} field. */
    public AICamera mClipPlaneNear(float value) { nmClipPlaneNear(address(), value); return this; }
    /** Sets the specified value to the {@code mClipPlaneFar} field. */
    public AICamera mClipPlaneFar(float value) { nmClipPlaneFar(address(), value); return this; }
    /** Sets the specified value to the {@code mAspect} field. */
    public AICamera mAspect(float value) { nmAspect(address(), value); return this; }
    /** Sets the specified value to the {@code mOrthographicWidth} field. */
    public AICamera mOrthographicWidth(float value) { nmOrthographicWidth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AICamera set(
        AIString mName,
        AIVector3D mPosition,
        AIVector3D mUp,
        AIVector3D mLookAt,
        float mHorizontalFOV,
        float mClipPlaneNear,
        float mClipPlaneFar,
        float mAspect,
        float mOrthographicWidth
    ) {
        mName(mName);
        mPosition(mPosition);
        mUp(mUp);
        mLookAt(mLookAt);
        mHorizontalFOV(mHorizontalFOV);
        mClipPlaneNear(mClipPlaneNear);
        mClipPlaneFar(mClipPlaneFar);
        mAspect(mAspect);
        mOrthographicWidth(mOrthographicWidth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AICamera set(AICamera src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AICamera} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AICamera malloc() {
        return new AICamera(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AICamera} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AICamera calloc() {
        return new AICamera(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AICamera} instance allocated with {@link BufferUtils}. */
    public static AICamera create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AICamera(memAddress(container), container);
    }

    /** Returns a new {@code AICamera} instance for the specified memory address. */
    public static AICamera create(long address) {
        return new AICamera(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AICamera createSafe(long address) {
        return address == NULL ? null : new AICamera(address, null);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AICamera.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AICamera.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AICamera mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AICamera callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AICamera mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AICamera callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AICamera.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AICamera.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AICamera.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AICamera.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AICamera} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AICamera malloc(MemoryStack stack) {
        return new AICamera(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AICamera} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AICamera calloc(MemoryStack stack) {
        return new AICamera(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AICamera.MNAME); }
    /** Unsafe version of {@link #mPosition}. */
    public static AIVector3D nmPosition(long struct) { return AIVector3D.create(struct + AICamera.MPOSITION); }
    /** Unsafe version of {@link #mUp}. */
    public static AIVector3D nmUp(long struct) { return AIVector3D.create(struct + AICamera.MUP); }
    /** Unsafe version of {@link #mLookAt}. */
    public static AIVector3D nmLookAt(long struct) { return AIVector3D.create(struct + AICamera.MLOOKAT); }
    /** Unsafe version of {@link #mHorizontalFOV}. */
    public static float nmHorizontalFOV(long struct) { return memGetFloat(struct + AICamera.MHORIZONTALFOV); }
    /** Unsafe version of {@link #mClipPlaneNear}. */
    public static float nmClipPlaneNear(long struct) { return memGetFloat(struct + AICamera.MCLIPPLANENEAR); }
    /** Unsafe version of {@link #mClipPlaneFar}. */
    public static float nmClipPlaneFar(long struct) { return memGetFloat(struct + AICamera.MCLIPPLANEFAR); }
    /** Unsafe version of {@link #mAspect}. */
    public static float nmAspect(long struct) { return memGetFloat(struct + AICamera.MASPECT); }
    /** Unsafe version of {@link #mOrthographicWidth}. */
    public static float nmOrthographicWidth(long struct) { return memGetFloat(struct + AICamera.MORTHOGRAPHICWIDTH); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AICamera.MNAME, AIString.SIZEOF); }
    /** Unsafe version of {@link #mPosition(AIVector3D) mPosition}. */
    public static void nmPosition(long struct, AIVector3D value) { memCopy(value.address(), struct + AICamera.MPOSITION, AIVector3D.SIZEOF); }
    /** Unsafe version of {@link #mUp(AIVector3D) mUp}. */
    public static void nmUp(long struct, AIVector3D value) { memCopy(value.address(), struct + AICamera.MUP, AIVector3D.SIZEOF); }
    /** Unsafe version of {@link #mLookAt(AIVector3D) mLookAt}. */
    public static void nmLookAt(long struct, AIVector3D value) { memCopy(value.address(), struct + AICamera.MLOOKAT, AIVector3D.SIZEOF); }
    /** Unsafe version of {@link #mHorizontalFOV(float) mHorizontalFOV}. */
    public static void nmHorizontalFOV(long struct, float value) { memPutFloat(struct + AICamera.MHORIZONTALFOV, value); }
    /** Unsafe version of {@link #mClipPlaneNear(float) mClipPlaneNear}. */
    public static void nmClipPlaneNear(long struct, float value) { memPutFloat(struct + AICamera.MCLIPPLANENEAR, value); }
    /** Unsafe version of {@link #mClipPlaneFar(float) mClipPlaneFar}. */
    public static void nmClipPlaneFar(long struct, float value) { memPutFloat(struct + AICamera.MCLIPPLANEFAR, value); }
    /** Unsafe version of {@link #mAspect(float) mAspect}. */
    public static void nmAspect(long struct, float value) { memPutFloat(struct + AICamera.MASPECT, value); }
    /** Unsafe version of {@link #mOrthographicWidth(float) mOrthographicWidth}. */
    public static void nmOrthographicWidth(long struct, float value) { memPutFloat(struct + AICamera.MORTHOGRAPHICWIDTH, value); }

    // -----------------------------------

    /** An array of {@link AICamera} structs. */
    public static class Buffer extends StructBuffer<AICamera, Buffer> implements NativeResource {

        private static final AICamera ELEMENT_FACTORY = AICamera.create(-1L);

        /**
         * Creates a new {@code AICamera.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AICamera#SIZEOF}, and its mark will be undefined.</p>
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
        protected AICamera getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AICamera.nmName(address()); }
        /** @return a {@link AIVector3D} view of the {@code mPosition} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mPosition() { return AICamera.nmPosition(address()); }
        /** @return a {@link AIVector3D} view of the {@code mUp} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mUp() { return AICamera.nmUp(address()); }
        /** @return a {@link AIVector3D} view of the {@code mLookAt} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mLookAt() { return AICamera.nmLookAt(address()); }
        /** @return the value of the {@code mHorizontalFOV} field. */
        public float mHorizontalFOV() { return AICamera.nmHorizontalFOV(address()); }
        /** @return the value of the {@code mClipPlaneNear} field. */
        public float mClipPlaneNear() { return AICamera.nmClipPlaneNear(address()); }
        /** @return the value of the {@code mClipPlaneFar} field. */
        public float mClipPlaneFar() { return AICamera.nmClipPlaneFar(address()); }
        /** @return the value of the {@code mAspect} field. */
        public float mAspect() { return AICamera.nmAspect(address()); }
        /** @return the value of the {@code mOrthographicWidth} field. */
        public float mOrthographicWidth() { return AICamera.nmOrthographicWidth(address()); }

        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AICamera.Buffer mName(@NativeType("struct aiString") AIString value) { AICamera.nmName(address(), value); return this; }
        /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AICamera.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Copies the specified {@link AIVector3D} to the {@code mPosition} field. */
        public AICamera.Buffer mPosition(@NativeType("struct aiVector3D") AIVector3D value) { AICamera.nmPosition(address(), value); return this; }
        /** Passes the {@code mPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AICamera.Buffer mPosition(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mPosition()); return this; }
        /** Copies the specified {@link AIVector3D} to the {@code mUp} field. */
        public AICamera.Buffer mUp(@NativeType("struct aiVector3D") AIVector3D value) { AICamera.nmUp(address(), value); return this; }
        /** Passes the {@code mUp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AICamera.Buffer mUp(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mUp()); return this; }
        /** Copies the specified {@link AIVector3D} to the {@code mLookAt} field. */
        public AICamera.Buffer mLookAt(@NativeType("struct aiVector3D") AIVector3D value) { AICamera.nmLookAt(address(), value); return this; }
        /** Passes the {@code mLookAt} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AICamera.Buffer mLookAt(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mLookAt()); return this; }
        /** Sets the specified value to the {@code mHorizontalFOV} field. */
        public AICamera.Buffer mHorizontalFOV(float value) { AICamera.nmHorizontalFOV(address(), value); return this; }
        /** Sets the specified value to the {@code mClipPlaneNear} field. */
        public AICamera.Buffer mClipPlaneNear(float value) { AICamera.nmClipPlaneNear(address(), value); return this; }
        /** Sets the specified value to the {@code mClipPlaneFar} field. */
        public AICamera.Buffer mClipPlaneFar(float value) { AICamera.nmClipPlaneFar(address(), value); return this; }
        /** Sets the specified value to the {@code mAspect} field. */
        public AICamera.Buffer mAspect(float value) { AICamera.nmAspect(address(), value); return this; }
        /** Sets the specified value to the {@code mOrthographicWidth} field. */
        public AICamera.Buffer mOrthographicWidth(float value) { AICamera.nmOrthographicWidth(address(), value); return this; }

    }

}