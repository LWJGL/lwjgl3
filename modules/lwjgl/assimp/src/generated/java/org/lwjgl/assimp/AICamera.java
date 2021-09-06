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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiCamera {
 *     {@link AIString struct aiString} {@link #mName};
 *     {@link AIVector3D struct aiVector3D} {@link #mPosition};
 *     {@link AIVector3D struct aiVector3D} {@link #mUp};
 *     {@link AIVector3D struct aiVector3D} {@link #mLookAt};
 *     float {@link #mHorizontalFOV};
 *     float {@link #mClipPlaneNear};
 *     float {@link #mClipPlaneFar};
 *     float {@link #mAspect};
 *     float {@link #mOrthographicWidth};
 * }</code></pre>
 */
@NativeType("struct aiCamera")
public class AICamera extends Struct implements NativeResource {

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

    /**
     * The name of the camera. There must be a node in the scenegraph with the same name. This node specifies the position of the camera in the scene
     * hierarchy and can be animated.
     */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** Position of the camera relative to the coordinate space defined by the corresponding node. The default value is 0|0|0. */
    @NativeType("struct aiVector3D")
    public AIVector3D mPosition() { return nmPosition(address()); }
    /**
     * 'Up' - vector of the camera coordinate system relative to the coordinate space defined by the corresponding node. The 'right' vector of the camera
     * coordinate system is the cross product of  the up and lookAt vectors. The default value is 0|1|0. The vector may be normalized, but it needn't.
     */
    @NativeType("struct aiVector3D")
    public AIVector3D mUp() { return nmUp(address()); }
    /**
     * 'LookAt' - vector of the camera coordinate system relative to the coordinate space defined by the corresponding node. This is the viewing direction of
     * the user. The default value is {@code 0|0|1}. The vector may be normalized, but it needn't.
     */
    @NativeType("struct aiVector3D")
    public AIVector3D mLookAt() { return nmLookAt(address()); }
    /**
     * Horizontal field of view angle, in radians. The field of view angle is the angle between the center line of the screen and the left or right border.
     * The default value is {@code 1/4PI}.
     */
    public float mHorizontalFOV() { return nmHorizontalFOV(address()); }
    /**
     * Distance of the near clipping plane from the camera. The value may not be 0.f (for arithmetic reasons to prevent a division through zero). The default
     * value is 0.1f.
     */
    public float mClipPlaneNear() { return nmClipPlaneNear(address()); }
    /**
     * Distance of the far clipping plane from the camera. The far clipping plane must, of course, be further away than the near clipping plane. The
     * default value is 1000.f. The ratio between the near and the far plane should not be too large (between 1000-10000 should be ok) to avoid floating-point
     * inaccuracies which could lead to z-fighting.
     */
    public float mClipPlaneFar() { return nmClipPlaneFar(address()); }
    /**
     * Screen aspect ratio. This is the ration between the width and the height of the screen. Typical values are 4/3, 1/2 or 1/1. This value is 0 if the
     * aspect ratio is not defined in the source file. 0 is also the default value.
     */
    public float mAspect() { return nmAspect(address()); }
    /**
     * Half horizontal orthographic width, in scene units.
     * 
     * <p>The orthographic width specifies the half width of the orthographic view box. If non-zero the camera is orthographic and the {@code mAspect} should
     * define to the ratio between the orthographic width and height and {@code mHorizontalFOV} should be set to 0. The default value is 0 (not orthographic).</p>
     */
    public float mOrthographicWidth() { return nmOrthographicWidth(address()); }

    /** Copies the specified {@link AIString} to the {@link #mName} field. */
    public AICamera mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Passes the {@link #mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AICamera mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Copies the specified {@link AIVector3D} to the {@link #mPosition} field. */
    public AICamera mPosition(@NativeType("struct aiVector3D") AIVector3D value) { nmPosition(address(), value); return this; }
    /** Passes the {@link #mPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AICamera mPosition(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mPosition()); return this; }
    /** Copies the specified {@link AIVector3D} to the {@link #mUp} field. */
    public AICamera mUp(@NativeType("struct aiVector3D") AIVector3D value) { nmUp(address(), value); return this; }
    /** Passes the {@link #mUp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AICamera mUp(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mUp()); return this; }
    /** Copies the specified {@link AIVector3D} to the {@link #mLookAt} field. */
    public AICamera mLookAt(@NativeType("struct aiVector3D") AIVector3D value) { nmLookAt(address(), value); return this; }
    /** Passes the {@link #mLookAt} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AICamera mLookAt(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mLookAt()); return this; }
    /** Sets the specified value to the {@link #mHorizontalFOV} field. */
    public AICamera mHorizontalFOV(float value) { nmHorizontalFOV(address(), value); return this; }
    /** Sets the specified value to the {@link #mClipPlaneNear} field. */
    public AICamera mClipPlaneNear(float value) { nmClipPlaneNear(address(), value); return this; }
    /** Sets the specified value to the {@link #mClipPlaneFar} field. */
    public AICamera mClipPlaneFar(float value) { nmClipPlaneFar(address(), value); return this; }
    /** Sets the specified value to the {@link #mAspect} field. */
    public AICamera mAspect(float value) { nmAspect(address(), value); return this; }
    /** Sets the specified value to the {@link #mOrthographicWidth} field. */
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
        return wrap(AICamera.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AICamera} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AICamera calloc() {
        return wrap(AICamera.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AICamera} instance allocated with {@link BufferUtils}. */
    public static AICamera create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AICamera.class, memAddress(container), container);
    }

    /** Returns a new {@code AICamera} instance for the specified memory address. */
    public static AICamera create(long address) {
        return wrap(AICamera.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AICamera createSafe(long address) {
        return address == NULL ? null : wrap(AICamera.class, address);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AICamera.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AICamera.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(AICamera.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AICamera} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AICamera calloc(MemoryStack stack) {
        return wrap(AICamera.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AICamera.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AICamera.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
    public static float nmHorizontalFOV(long struct) { return UNSAFE.getFloat(null, struct + AICamera.MHORIZONTALFOV); }
    /** Unsafe version of {@link #mClipPlaneNear}. */
    public static float nmClipPlaneNear(long struct) { return UNSAFE.getFloat(null, struct + AICamera.MCLIPPLANENEAR); }
    /** Unsafe version of {@link #mClipPlaneFar}. */
    public static float nmClipPlaneFar(long struct) { return UNSAFE.getFloat(null, struct + AICamera.MCLIPPLANEFAR); }
    /** Unsafe version of {@link #mAspect}. */
    public static float nmAspect(long struct) { return UNSAFE.getFloat(null, struct + AICamera.MASPECT); }
    /** Unsafe version of {@link #mOrthographicWidth}. */
    public static float nmOrthographicWidth(long struct) { return UNSAFE.getFloat(null, struct + AICamera.MORTHOGRAPHICWIDTH); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AICamera.MNAME, AIString.SIZEOF); }
    /** Unsafe version of {@link #mPosition(AIVector3D) mPosition}. */
    public static void nmPosition(long struct, AIVector3D value) { memCopy(value.address(), struct + AICamera.MPOSITION, AIVector3D.SIZEOF); }
    /** Unsafe version of {@link #mUp(AIVector3D) mUp}. */
    public static void nmUp(long struct, AIVector3D value) { memCopy(value.address(), struct + AICamera.MUP, AIVector3D.SIZEOF); }
    /** Unsafe version of {@link #mLookAt(AIVector3D) mLookAt}. */
    public static void nmLookAt(long struct, AIVector3D value) { memCopy(value.address(), struct + AICamera.MLOOKAT, AIVector3D.SIZEOF); }
    /** Unsafe version of {@link #mHorizontalFOV(float) mHorizontalFOV}. */
    public static void nmHorizontalFOV(long struct, float value) { UNSAFE.putFloat(null, struct + AICamera.MHORIZONTALFOV, value); }
    /** Unsafe version of {@link #mClipPlaneNear(float) mClipPlaneNear}. */
    public static void nmClipPlaneNear(long struct, float value) { UNSAFE.putFloat(null, struct + AICamera.MCLIPPLANENEAR, value); }
    /** Unsafe version of {@link #mClipPlaneFar(float) mClipPlaneFar}. */
    public static void nmClipPlaneFar(long struct, float value) { UNSAFE.putFloat(null, struct + AICamera.MCLIPPLANEFAR, value); }
    /** Unsafe version of {@link #mAspect(float) mAspect}. */
    public static void nmAspect(long struct, float value) { UNSAFE.putFloat(null, struct + AICamera.MASPECT, value); }
    /** Unsafe version of {@link #mOrthographicWidth(float) mOrthographicWidth}. */
    public static void nmOrthographicWidth(long struct, float value) { UNSAFE.putFloat(null, struct + AICamera.MORTHOGRAPHICWIDTH, value); }

    // -----------------------------------

    /** An array of {@link AICamera} structs. */
    public static class Buffer extends StructBuffer<AICamera, Buffer> implements NativeResource {

        private static final AICamera ELEMENT_FACTORY = AICamera.create(-1L);

        /**
         * Creates a new {@code AICamera.Buffer} instance backed by the specified container.
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
        protected AICamera getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIString} view of the {@link AICamera#mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AICamera.nmName(address()); }
        /** @return a {@link AIVector3D} view of the {@link AICamera#mPosition} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mPosition() { return AICamera.nmPosition(address()); }
        /** @return a {@link AIVector3D} view of the {@link AICamera#mUp} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mUp() { return AICamera.nmUp(address()); }
        /** @return a {@link AIVector3D} view of the {@link AICamera#mLookAt} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mLookAt() { return AICamera.nmLookAt(address()); }
        /** @return the value of the {@link AICamera#mHorizontalFOV} field. */
        public float mHorizontalFOV() { return AICamera.nmHorizontalFOV(address()); }
        /** @return the value of the {@link AICamera#mClipPlaneNear} field. */
        public float mClipPlaneNear() { return AICamera.nmClipPlaneNear(address()); }
        /** @return the value of the {@link AICamera#mClipPlaneFar} field. */
        public float mClipPlaneFar() { return AICamera.nmClipPlaneFar(address()); }
        /** @return the value of the {@link AICamera#mAspect} field. */
        public float mAspect() { return AICamera.nmAspect(address()); }
        /** @return the value of the {@link AICamera#mOrthographicWidth} field. */
        public float mOrthographicWidth() { return AICamera.nmOrthographicWidth(address()); }

        /** Copies the specified {@link AIString} to the {@link AICamera#mName} field. */
        public AICamera.Buffer mName(@NativeType("struct aiString") AIString value) { AICamera.nmName(address(), value); return this; }
        /** Passes the {@link AICamera#mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AICamera.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Copies the specified {@link AIVector3D} to the {@link AICamera#mPosition} field. */
        public AICamera.Buffer mPosition(@NativeType("struct aiVector3D") AIVector3D value) { AICamera.nmPosition(address(), value); return this; }
        /** Passes the {@link AICamera#mPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AICamera.Buffer mPosition(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mPosition()); return this; }
        /** Copies the specified {@link AIVector3D} to the {@link AICamera#mUp} field. */
        public AICamera.Buffer mUp(@NativeType("struct aiVector3D") AIVector3D value) { AICamera.nmUp(address(), value); return this; }
        /** Passes the {@link AICamera#mUp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AICamera.Buffer mUp(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mUp()); return this; }
        /** Copies the specified {@link AIVector3D} to the {@link AICamera#mLookAt} field. */
        public AICamera.Buffer mLookAt(@NativeType("struct aiVector3D") AIVector3D value) { AICamera.nmLookAt(address(), value); return this; }
        /** Passes the {@link AICamera#mLookAt} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AICamera.Buffer mLookAt(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mLookAt()); return this; }
        /** Sets the specified value to the {@link AICamera#mHorizontalFOV} field. */
        public AICamera.Buffer mHorizontalFOV(float value) { AICamera.nmHorizontalFOV(address(), value); return this; }
        /** Sets the specified value to the {@link AICamera#mClipPlaneNear} field. */
        public AICamera.Buffer mClipPlaneNear(float value) { AICamera.nmClipPlaneNear(address(), value); return this; }
        /** Sets the specified value to the {@link AICamera#mClipPlaneFar} field. */
        public AICamera.Buffer mClipPlaneFar(float value) { AICamera.nmClipPlaneFar(address(), value); return this; }
        /** Sets the specified value to the {@link AICamera#mAspect} field. */
        public AICamera.Buffer mAspect(float value) { AICamera.nmAspect(address(), value); return this; }
        /** Sets the specified value to the {@link AICamera#mOrthographicWidth} field. */
        public AICamera.Buffer mOrthographicWidth(float value) { AICamera.nmOrthographicWidth(address(), value); return this; }

    }

}