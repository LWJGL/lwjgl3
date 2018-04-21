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
 * Helper structure to describe a virtual camera.
 * 
 * <p>Cameras have a representation in the node graph and can be animated. An important aspect is that the camera itself is also part of the scenegraph. This
 * means, any values such as the look-at vector are not *absolute*, they're <b>relative</b> to the coordinate system defined by the node which corresponds
 * to the camera. This allows for camera animations. For static cameras parameters like the 'look-at' or 'up' vectors are usually specified directly in
 * {@code aiCamera}, but beware, they could also be encoded in the node transformation.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mName} &ndash; 
 * The name of the camera. There must be a node in the scenegraph with the same name. This node specifies the position of the camera in the scene
 * hierarchy and can be animated.</li>
 * <li>{@code mPosition} &ndash; Position of the camera relative to the coordinate space defined by the corresponding node. The default value is 0|0|0.</li>
 * <li>{@code mUp} &ndash; 
 * 'Up' - vector of the camera coordinate system relative to the coordinate space defined by the corresponding node. The 'right' vector of the camera
 * coordinate system is the cross product of  the up and lookAt vectors. The default value is 0|1|0. The vector may be normalized, but it needn't.</li>
 * <li>{@code mLookAt} &ndash; 
 * 'LookAt' - vector of the camera coordinate system relative to the coordinate space defined by the corresponding node. This is the viewing direction of
 * the user. The default value is 0|0|1. The vector may be normalized, but it needn't.</li>
 * <li>{@code mHorizontalFOV} &ndash; 
 * Half horizontal field of view angle, in radians. The field of view angle is the angle between the center line of the screen and the left or right
 * border. The default value is 1/4PI.</li>
 * <li>{@code mClipPlaneNear} &ndash; 
 * Distance of the near clipping plane from the camera. The value may not be 0.f (for arithmetic reasons to prevent a division through zero). The default
 * value is 0.1f.</li>
 * <li>{@code mClipPlaneFar} &ndash; Distance of the far clipping plane from the camera. The far clipping plane must, of course, be further away than the near clipping plane. The
 * default value is 1000.f. The ratio between the near and the far plane should not be too large (between 1000-10000 should be ok) to avoid floating-point
 * inaccuracies which could lead to z-fighting.</li>
 * <li>{@code mAspect} &ndash; 
 * Screen aspect ratio. This is the ration between the width and the height of the screen. Typical values are 4/3, 1/2 or 1/1. This value is 0 if the
 * aspect ratio is not defined in the source file. 0 is also the default value.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiCamera {
 *     {@link AIString struct aiString} mName;
 *     {@link AIVector3D struct aiVector3D} mPosition;
 *     {@link AIVector3D struct aiVector3D} mUp;
 *     {@link AIVector3D struct aiVector3D} mLookAt;
 *     float mHorizontalFOV;
 *     float mClipPlaneNear;
 *     float mClipPlaneFar;
 *     float mAspect;
 * }</pre></code>
 */
@NativeType("struct aiCamera")
public class AICamera extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

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
        MASPECT;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF),
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF),
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF),
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
    }

    AICamera(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AICamera} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AICamera(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** Returns a {@link AIVector3D} view of the {@code mPosition} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mPosition() { return nmPosition(address()); }
    /** Returns a {@link AIVector3D} view of the {@code mUp} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mUp() { return nmUp(address()); }
    /** Returns a {@link AIVector3D} view of the {@code mLookAt} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mLookAt() { return nmLookAt(address()); }
    /** Returns the value of the {@code mHorizontalFOV} field. */
    public float mHorizontalFOV() { return nmHorizontalFOV(address()); }
    /** Returns the value of the {@code mClipPlaneNear} field. */
    public float mClipPlaneNear() { return nmClipPlaneNear(address()); }
    /** Returns the value of the {@code mClipPlaneFar} field. */
    public float mClipPlaneFar() { return nmClipPlaneFar(address()); }
    /** Returns the value of the {@code mAspect} field. */
    public float mAspect() { return nmAspect(address()); }

    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AICamera mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Copies the specified {@link AIVector3D} to the {@code mPosition} field. */
    public AICamera mPosition(@NativeType("struct aiVector3D") AIVector3D value) { nmPosition(address(), value); return this; }
    /** Copies the specified {@link AIVector3D} to the {@code mUp} field. */
    public AICamera mUp(@NativeType("struct aiVector3D") AIVector3D value) { nmUp(address(), value); return this; }
    /** Copies the specified {@link AIVector3D} to the {@code mLookAt} field. */
    public AICamera mLookAt(@NativeType("struct aiVector3D") AIVector3D value) { nmLookAt(address(), value); return this; }
    /** Sets the specified value to the {@code mHorizontalFOV} field. */
    public AICamera mHorizontalFOV(float value) { nmHorizontalFOV(address(), value); return this; }
    /** Sets the specified value to the {@code mClipPlaneNear} field. */
    public AICamera mClipPlaneNear(float value) { nmClipPlaneNear(address(), value); return this; }
    /** Sets the specified value to the {@code mClipPlaneFar} field. */
    public AICamera mClipPlaneFar(float value) { nmClipPlaneFar(address(), value); return this; }
    /** Sets the specified value to the {@code mAspect} field. */
    public AICamera mAspect(float value) { nmAspect(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AICamera set(
        AIString mName,
        AIVector3D mPosition,
        AIVector3D mUp,
        AIVector3D mLookAt,
        float mHorizontalFOV,
        float mClipPlaneNear,
        float mClipPlaneFar,
        float mAspect
    ) {
        mName(mName);
        mPosition(mPosition);
        mUp(mUp);
        mLookAt(mLookAt);
        mHorizontalFOV(mHorizontalFOV);
        mClipPlaneNear(mClipPlaneNear);
        mClipPlaneFar(mClipPlaneFar);
        mAspect(mAspect);

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

    /** Returns a new {@link AICamera} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AICamera malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link AICamera} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AICamera calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link AICamera} instance allocated with {@link BufferUtils}. */
    public static AICamera create() {
        return new AICamera(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AICamera} instance for the specified memory address. */
    public static AICamera create(long address) {
        return new AICamera(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AICamera createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
    @Nullable
    public static AICamera.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AICamera} instance allocated on the thread-local {@link MemoryStack}. */
    public static AICamera mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AICamera} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AICamera callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AICamera} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AICamera mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AICamera} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AICamera callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

    // -----------------------------------

    /** An array of {@link AICamera} structs. */
    public static class Buffer extends StructBuffer<AICamera, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AICamera.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AICamera#SIZEOF}, and its mark will be undefined.
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
        protected AICamera newInstance(long address) {
            return new AICamera(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AICamera.nmName(address()); }
        /** Returns a {@link AIVector3D} view of the {@code mPosition} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mPosition() { return AICamera.nmPosition(address()); }
        /** Returns a {@link AIVector3D} view of the {@code mUp} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mUp() { return AICamera.nmUp(address()); }
        /** Returns a {@link AIVector3D} view of the {@code mLookAt} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mLookAt() { return AICamera.nmLookAt(address()); }
        /** Returns the value of the {@code mHorizontalFOV} field. */
        public float mHorizontalFOV() { return AICamera.nmHorizontalFOV(address()); }
        /** Returns the value of the {@code mClipPlaneNear} field. */
        public float mClipPlaneNear() { return AICamera.nmClipPlaneNear(address()); }
        /** Returns the value of the {@code mClipPlaneFar} field. */
        public float mClipPlaneFar() { return AICamera.nmClipPlaneFar(address()); }
        /** Returns the value of the {@code mAspect} field. */
        public float mAspect() { return AICamera.nmAspect(address()); }

        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AICamera.Buffer mName(@NativeType("struct aiString") AIString value) { AICamera.nmName(address(), value); return this; }
        /** Copies the specified {@link AIVector3D} to the {@code mPosition} field. */
        public AICamera.Buffer mPosition(@NativeType("struct aiVector3D") AIVector3D value) { AICamera.nmPosition(address(), value); return this; }
        /** Copies the specified {@link AIVector3D} to the {@code mUp} field. */
        public AICamera.Buffer mUp(@NativeType("struct aiVector3D") AIVector3D value) { AICamera.nmUp(address(), value); return this; }
        /** Copies the specified {@link AIVector3D} to the {@code mLookAt} field. */
        public AICamera.Buffer mLookAt(@NativeType("struct aiVector3D") AIVector3D value) { AICamera.nmLookAt(address(), value); return this; }
        /** Sets the specified value to the {@code mHorizontalFOV} field. */
        public AICamera.Buffer mHorizontalFOV(float value) { AICamera.nmHorizontalFOV(address(), value); return this; }
        /** Sets the specified value to the {@code mClipPlaneNear} field. */
        public AICamera.Buffer mClipPlaneNear(float value) { AICamera.nmClipPlaneNear(address(), value); return this; }
        /** Sets the specified value to the {@code mClipPlaneFar} field. */
        public AICamera.Buffer mClipPlaneFar(float value) { AICamera.nmClipPlaneFar(address(), value); return this; }
        /** Sets the specified value to the {@code mAspect} field. */
        public AICamera.Buffer mAspect(float value) { AICamera.nmAspect(address(), value); return this; }

    }

}