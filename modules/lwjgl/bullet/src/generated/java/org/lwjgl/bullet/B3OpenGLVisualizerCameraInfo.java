/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct b3OpenGLVisualizerCameraInfo {
 *     int m_width;
 *     int m_height;
 *     float m_viewMatrix[16];
 *     float m_projectionMatrix[16];
 *     float m_camUp[3];
 *     float m_camForward[3];
 *     float m_horizontal[3];
 *     float m_vertical[3];
 *     float m_yaw;
 *     float m_pitch;
 *     float m_dist;
 *     float m_target[3];
 * }</code></pre>
 */
@NativeType("struct b3OpenGLVisualizerCameraInfo")
public class B3OpenGLVisualizerCameraInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_WIDTH,
        M_HEIGHT,
        M_VIEWMATRIX,
        M_PROJECTIONMATRIX,
        M_CAMUP,
        M_CAMFORWARD,
        M_HORIZONTAL,
        M_VERTICAL,
        M_YAW,
        M_PITCH,
        M_DIST,
        M_TARGET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(4, 16),
            __array(4, 16),
            __array(4, 3),
            __array(4, 3),
            __array(4, 3),
            __array(4, 3),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_WIDTH = layout.offsetof(0);
        M_HEIGHT = layout.offsetof(1);
        M_VIEWMATRIX = layout.offsetof(2);
        M_PROJECTIONMATRIX = layout.offsetof(3);
        M_CAMUP = layout.offsetof(4);
        M_CAMFORWARD = layout.offsetof(5);
        M_HORIZONTAL = layout.offsetof(6);
        M_VERTICAL = layout.offsetof(7);
        M_YAW = layout.offsetof(8);
        M_PITCH = layout.offsetof(9);
        M_DIST = layout.offsetof(10);
        M_TARGET = layout.offsetof(11);
    }

    /**
     * Creates a {@code B3OpenGLVisualizerCameraInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3OpenGLVisualizerCameraInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_width} field. */
    public int m_width() { return nm_width(address()); }
    /** Returns the value of the {@code m_height} field. */
    public int m_height() { return nm_height(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code m_viewMatrix} field. */
    @NativeType("float[16]")
    public FloatBuffer m_viewMatrix() { return nm_viewMatrix(address()); }
    /** Returns the value at the specified index of the {@code m_viewMatrix} field. */
    public float m_viewMatrix(int index) { return nm_viewMatrix(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code m_projectionMatrix} field. */
    @NativeType("float[16]")
    public FloatBuffer m_projectionMatrix() { return nm_projectionMatrix(address()); }
    /** Returns the value at the specified index of the {@code m_projectionMatrix} field. */
    public float m_projectionMatrix(int index) { return nm_projectionMatrix(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code m_camUp} field. */
    @NativeType("float[3]")
    public FloatBuffer m_camUp() { return nm_camUp(address()); }
    /** Returns the value at the specified index of the {@code m_camUp} field. */
    public float m_camUp(int index) { return nm_camUp(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code m_camForward} field. */
    @NativeType("float[3]")
    public FloatBuffer m_camForward() { return nm_camForward(address()); }
    /** Returns the value at the specified index of the {@code m_camForward} field. */
    public float m_camForward(int index) { return nm_camForward(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code m_horizontal} field. */
    @NativeType("float[3]")
    public FloatBuffer m_horizontal() { return nm_horizontal(address()); }
    /** Returns the value at the specified index of the {@code m_horizontal} field. */
    public float m_horizontal(int index) { return nm_horizontal(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code m_vertical} field. */
    @NativeType("float[3]")
    public FloatBuffer m_vertical() { return nm_vertical(address()); }
    /** Returns the value at the specified index of the {@code m_vertical} field. */
    public float m_vertical(int index) { return nm_vertical(address(), index); }
    /** Returns the value of the {@code m_yaw} field. */
    public float m_yaw() { return nm_yaw(address()); }
    /** Returns the value of the {@code m_pitch} field. */
    public float m_pitch() { return nm_pitch(address()); }
    /** Returns the value of the {@code m_dist} field. */
    public float m_dist() { return nm_dist(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code m_target} field. */
    @NativeType("float[3]")
    public FloatBuffer m_target() { return nm_target(address()); }
    /** Returns the value at the specified index of the {@code m_target} field. */
    public float m_target(int index) { return nm_target(address(), index); }

    /** Sets the specified value to the {@code m_width} field. */
    public B3OpenGLVisualizerCameraInfo m_width(int value) { nm_width(address(), value); return this; }
    /** Sets the specified value to the {@code m_height} field. */
    public B3OpenGLVisualizerCameraInfo m_height(int value) { nm_height(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code m_viewMatrix} field. */
    public B3OpenGLVisualizerCameraInfo m_viewMatrix(@NativeType("float[16]") FloatBuffer value) { nm_viewMatrix(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_viewMatrix} field. */
    public B3OpenGLVisualizerCameraInfo m_viewMatrix(int index, float value) { nm_viewMatrix(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code m_projectionMatrix} field. */
    public B3OpenGLVisualizerCameraInfo m_projectionMatrix(@NativeType("float[16]") FloatBuffer value) { nm_projectionMatrix(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_projectionMatrix} field. */
    public B3OpenGLVisualizerCameraInfo m_projectionMatrix(int index, float value) { nm_projectionMatrix(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code m_camUp} field. */
    public B3OpenGLVisualizerCameraInfo m_camUp(@NativeType("float[3]") FloatBuffer value) { nm_camUp(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_camUp} field. */
    public B3OpenGLVisualizerCameraInfo m_camUp(int index, float value) { nm_camUp(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code m_camForward} field. */
    public B3OpenGLVisualizerCameraInfo m_camForward(@NativeType("float[3]") FloatBuffer value) { nm_camForward(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_camForward} field. */
    public B3OpenGLVisualizerCameraInfo m_camForward(int index, float value) { nm_camForward(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code m_horizontal} field. */
    public B3OpenGLVisualizerCameraInfo m_horizontal(@NativeType("float[3]") FloatBuffer value) { nm_horizontal(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_horizontal} field. */
    public B3OpenGLVisualizerCameraInfo m_horizontal(int index, float value) { nm_horizontal(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code m_vertical} field. */
    public B3OpenGLVisualizerCameraInfo m_vertical(@NativeType("float[3]") FloatBuffer value) { nm_vertical(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_vertical} field. */
    public B3OpenGLVisualizerCameraInfo m_vertical(int index, float value) { nm_vertical(address(), index, value); return this; }
    /** Sets the specified value to the {@code m_yaw} field. */
    public B3OpenGLVisualizerCameraInfo m_yaw(float value) { nm_yaw(address(), value); return this; }
    /** Sets the specified value to the {@code m_pitch} field. */
    public B3OpenGLVisualizerCameraInfo m_pitch(float value) { nm_pitch(address(), value); return this; }
    /** Sets the specified value to the {@code m_dist} field. */
    public B3OpenGLVisualizerCameraInfo m_dist(float value) { nm_dist(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code m_target} field. */
    public B3OpenGLVisualizerCameraInfo m_target(@NativeType("float[3]") FloatBuffer value) { nm_target(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_target} field. */
    public B3OpenGLVisualizerCameraInfo m_target(int index, float value) { nm_target(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public B3OpenGLVisualizerCameraInfo set(
        int m_width,
        int m_height,
        FloatBuffer m_viewMatrix,
        FloatBuffer m_projectionMatrix,
        FloatBuffer m_camUp,
        FloatBuffer m_camForward,
        FloatBuffer m_horizontal,
        FloatBuffer m_vertical,
        float m_yaw,
        float m_pitch,
        float m_dist,
        FloatBuffer m_target
    ) {
        m_width(m_width);
        m_height(m_height);
        m_viewMatrix(m_viewMatrix);
        m_projectionMatrix(m_projectionMatrix);
        m_camUp(m_camUp);
        m_camForward(m_camForward);
        m_horizontal(m_horizontal);
        m_vertical(m_vertical);
        m_yaw(m_yaw);
        m_pitch(m_pitch);
        m_dist(m_dist);
        m_target(m_target);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3OpenGLVisualizerCameraInfo set(B3OpenGLVisualizerCameraInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3OpenGLVisualizerCameraInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3OpenGLVisualizerCameraInfo malloc() {
        return wrap(B3OpenGLVisualizerCameraInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3OpenGLVisualizerCameraInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3OpenGLVisualizerCameraInfo calloc() {
        return wrap(B3OpenGLVisualizerCameraInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3OpenGLVisualizerCameraInfo} instance allocated with {@link BufferUtils}. */
    public static B3OpenGLVisualizerCameraInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3OpenGLVisualizerCameraInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code B3OpenGLVisualizerCameraInfo} instance for the specified memory address. */
    public static B3OpenGLVisualizerCameraInfo create(long address) {
        return wrap(B3OpenGLVisualizerCameraInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3OpenGLVisualizerCameraInfo createSafe(long address) {
        return address == NULL ? null : wrap(B3OpenGLVisualizerCameraInfo.class, address);
    }

    /**
     * Returns a new {@link B3OpenGLVisualizerCameraInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3OpenGLVisualizerCameraInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3OpenGLVisualizerCameraInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3OpenGLVisualizerCameraInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3OpenGLVisualizerCameraInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3OpenGLVisualizerCameraInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3OpenGLVisualizerCameraInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3OpenGLVisualizerCameraInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3OpenGLVisualizerCameraInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3OpenGLVisualizerCameraInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3OpenGLVisualizerCameraInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3OpenGLVisualizerCameraInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3OpenGLVisualizerCameraInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3OpenGLVisualizerCameraInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3OpenGLVisualizerCameraInfo mallocStack(MemoryStack stack) {
        return wrap(B3OpenGLVisualizerCameraInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3OpenGLVisualizerCameraInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3OpenGLVisualizerCameraInfo callocStack(MemoryStack stack) {
        return wrap(B3OpenGLVisualizerCameraInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3OpenGLVisualizerCameraInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3OpenGLVisualizerCameraInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3OpenGLVisualizerCameraInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3OpenGLVisualizerCameraInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3OpenGLVisualizerCameraInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3OpenGLVisualizerCameraInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3OpenGLVisualizerCameraInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3OpenGLVisualizerCameraInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_width}. */
    public static int nm_width(long struct) { return UNSAFE.getInt(null, struct + B3OpenGLVisualizerCameraInfo.M_WIDTH); }
    /** Unsafe version of {@link #m_height}. */
    public static int nm_height(long struct) { return UNSAFE.getInt(null, struct + B3OpenGLVisualizerCameraInfo.M_HEIGHT); }
    /** Unsafe version of {@link #m_viewMatrix}. */
    public static FloatBuffer nm_viewMatrix(long struct) { return memFloatBuffer(struct + B3OpenGLVisualizerCameraInfo.M_VIEWMATRIX, 16); }
    /** Unsafe version of {@link #m_viewMatrix(int) m_viewMatrix}. */
    public static float nm_viewMatrix(long struct, int index) {
        return UNSAFE.getFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_VIEWMATRIX + check(index, 16) * 4);
    }
    /** Unsafe version of {@link #m_projectionMatrix}. */
    public static FloatBuffer nm_projectionMatrix(long struct) { return memFloatBuffer(struct + B3OpenGLVisualizerCameraInfo.M_PROJECTIONMATRIX, 16); }
    /** Unsafe version of {@link #m_projectionMatrix(int) m_projectionMatrix}. */
    public static float nm_projectionMatrix(long struct, int index) {
        return UNSAFE.getFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_PROJECTIONMATRIX + check(index, 16) * 4);
    }
    /** Unsafe version of {@link #m_camUp}. */
    public static FloatBuffer nm_camUp(long struct) { return memFloatBuffer(struct + B3OpenGLVisualizerCameraInfo.M_CAMUP, 3); }
    /** Unsafe version of {@link #m_camUp(int) m_camUp}. */
    public static float nm_camUp(long struct, int index) {
        return UNSAFE.getFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_CAMUP + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #m_camForward}. */
    public static FloatBuffer nm_camForward(long struct) { return memFloatBuffer(struct + B3OpenGLVisualizerCameraInfo.M_CAMFORWARD, 3); }
    /** Unsafe version of {@link #m_camForward(int) m_camForward}. */
    public static float nm_camForward(long struct, int index) {
        return UNSAFE.getFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_CAMFORWARD + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #m_horizontal}. */
    public static FloatBuffer nm_horizontal(long struct) { return memFloatBuffer(struct + B3OpenGLVisualizerCameraInfo.M_HORIZONTAL, 3); }
    /** Unsafe version of {@link #m_horizontal(int) m_horizontal}. */
    public static float nm_horizontal(long struct, int index) {
        return UNSAFE.getFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_HORIZONTAL + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #m_vertical}. */
    public static FloatBuffer nm_vertical(long struct) { return memFloatBuffer(struct + B3OpenGLVisualizerCameraInfo.M_VERTICAL, 3); }
    /** Unsafe version of {@link #m_vertical(int) m_vertical}. */
    public static float nm_vertical(long struct, int index) {
        return UNSAFE.getFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_VERTICAL + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #m_yaw}. */
    public static float nm_yaw(long struct) { return UNSAFE.getFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_YAW); }
    /** Unsafe version of {@link #m_pitch}. */
    public static float nm_pitch(long struct) { return UNSAFE.getFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_PITCH); }
    /** Unsafe version of {@link #m_dist}. */
    public static float nm_dist(long struct) { return UNSAFE.getFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_DIST); }
    /** Unsafe version of {@link #m_target}. */
    public static FloatBuffer nm_target(long struct) { return memFloatBuffer(struct + B3OpenGLVisualizerCameraInfo.M_TARGET, 3); }
    /** Unsafe version of {@link #m_target(int) m_target}. */
    public static float nm_target(long struct, int index) {
        return UNSAFE.getFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_TARGET + check(index, 3) * 4);
    }

    /** Unsafe version of {@link #m_width(int) m_width}. */
    public static void nm_width(long struct, int value) { UNSAFE.putInt(null, struct + B3OpenGLVisualizerCameraInfo.M_WIDTH, value); }
    /** Unsafe version of {@link #m_height(int) m_height}. */
    public static void nm_height(long struct, int value) { UNSAFE.putInt(null, struct + B3OpenGLVisualizerCameraInfo.M_HEIGHT, value); }
    /** Unsafe version of {@link #m_viewMatrix(FloatBuffer) m_viewMatrix}. */
    public static void nm_viewMatrix(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + B3OpenGLVisualizerCameraInfo.M_VIEWMATRIX, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_viewMatrix(int, float) m_viewMatrix}. */
    public static void nm_viewMatrix(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_VIEWMATRIX + check(index, 16) * 4, value);
    }
    /** Unsafe version of {@link #m_projectionMatrix(FloatBuffer) m_projectionMatrix}. */
    public static void nm_projectionMatrix(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + B3OpenGLVisualizerCameraInfo.M_PROJECTIONMATRIX, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_projectionMatrix(int, float) m_projectionMatrix}. */
    public static void nm_projectionMatrix(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_PROJECTIONMATRIX + check(index, 16) * 4, value);
    }
    /** Unsafe version of {@link #m_camUp(FloatBuffer) m_camUp}. */
    public static void nm_camUp(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3OpenGLVisualizerCameraInfo.M_CAMUP, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_camUp(int, float) m_camUp}. */
    public static void nm_camUp(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_CAMUP + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #m_camForward(FloatBuffer) m_camForward}. */
    public static void nm_camForward(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3OpenGLVisualizerCameraInfo.M_CAMFORWARD, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_camForward(int, float) m_camForward}. */
    public static void nm_camForward(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_CAMFORWARD + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #m_horizontal(FloatBuffer) m_horizontal}. */
    public static void nm_horizontal(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3OpenGLVisualizerCameraInfo.M_HORIZONTAL, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_horizontal(int, float) m_horizontal}. */
    public static void nm_horizontal(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_HORIZONTAL + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #m_vertical(FloatBuffer) m_vertical}. */
    public static void nm_vertical(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3OpenGLVisualizerCameraInfo.M_VERTICAL, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_vertical(int, float) m_vertical}. */
    public static void nm_vertical(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_VERTICAL + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #m_yaw(float) m_yaw}. */
    public static void nm_yaw(long struct, float value) { UNSAFE.putFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_YAW, value); }
    /** Unsafe version of {@link #m_pitch(float) m_pitch}. */
    public static void nm_pitch(long struct, float value) { UNSAFE.putFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_PITCH, value); }
    /** Unsafe version of {@link #m_dist(float) m_dist}. */
    public static void nm_dist(long struct, float value) { UNSAFE.putFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_DIST, value); }
    /** Unsafe version of {@link #m_target(FloatBuffer) m_target}. */
    public static void nm_target(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3OpenGLVisualizerCameraInfo.M_TARGET, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_target(int, float) m_target}. */
    public static void nm_target(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + B3OpenGLVisualizerCameraInfo.M_TARGET + check(index, 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link B3OpenGLVisualizerCameraInfo} structs. */
    public static class Buffer extends StructBuffer<B3OpenGLVisualizerCameraInfo, Buffer> implements NativeResource {

        private static final B3OpenGLVisualizerCameraInfo ELEMENT_FACTORY = B3OpenGLVisualizerCameraInfo.create(-1L);

        /**
         * Creates a new {@code B3OpenGLVisualizerCameraInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3OpenGLVisualizerCameraInfo#SIZEOF}, and its mark will be undefined.
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
        protected B3OpenGLVisualizerCameraInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_width} field. */
        public int m_width() { return B3OpenGLVisualizerCameraInfo.nm_width(address()); }
        /** Returns the value of the {@code m_height} field. */
        public int m_height() { return B3OpenGLVisualizerCameraInfo.nm_height(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code m_viewMatrix} field. */
        @NativeType("float[16]")
        public FloatBuffer m_viewMatrix() { return B3OpenGLVisualizerCameraInfo.nm_viewMatrix(address()); }
        /** Returns the value at the specified index of the {@code m_viewMatrix} field. */
        public float m_viewMatrix(int index) { return B3OpenGLVisualizerCameraInfo.nm_viewMatrix(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code m_projectionMatrix} field. */
        @NativeType("float[16]")
        public FloatBuffer m_projectionMatrix() { return B3OpenGLVisualizerCameraInfo.nm_projectionMatrix(address()); }
        /** Returns the value at the specified index of the {@code m_projectionMatrix} field. */
        public float m_projectionMatrix(int index) { return B3OpenGLVisualizerCameraInfo.nm_projectionMatrix(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code m_camUp} field. */
        @NativeType("float[3]")
        public FloatBuffer m_camUp() { return B3OpenGLVisualizerCameraInfo.nm_camUp(address()); }
        /** Returns the value at the specified index of the {@code m_camUp} field. */
        public float m_camUp(int index) { return B3OpenGLVisualizerCameraInfo.nm_camUp(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code m_camForward} field. */
        @NativeType("float[3]")
        public FloatBuffer m_camForward() { return B3OpenGLVisualizerCameraInfo.nm_camForward(address()); }
        /** Returns the value at the specified index of the {@code m_camForward} field. */
        public float m_camForward(int index) { return B3OpenGLVisualizerCameraInfo.nm_camForward(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code m_horizontal} field. */
        @NativeType("float[3]")
        public FloatBuffer m_horizontal() { return B3OpenGLVisualizerCameraInfo.nm_horizontal(address()); }
        /** Returns the value at the specified index of the {@code m_horizontal} field. */
        public float m_horizontal(int index) { return B3OpenGLVisualizerCameraInfo.nm_horizontal(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code m_vertical} field. */
        @NativeType("float[3]")
        public FloatBuffer m_vertical() { return B3OpenGLVisualizerCameraInfo.nm_vertical(address()); }
        /** Returns the value at the specified index of the {@code m_vertical} field. */
        public float m_vertical(int index) { return B3OpenGLVisualizerCameraInfo.nm_vertical(address(), index); }
        /** Returns the value of the {@code m_yaw} field. */
        public float m_yaw() { return B3OpenGLVisualizerCameraInfo.nm_yaw(address()); }
        /** Returns the value of the {@code m_pitch} field. */
        public float m_pitch() { return B3OpenGLVisualizerCameraInfo.nm_pitch(address()); }
        /** Returns the value of the {@code m_dist} field. */
        public float m_dist() { return B3OpenGLVisualizerCameraInfo.nm_dist(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code m_target} field. */
        @NativeType("float[3]")
        public FloatBuffer m_target() { return B3OpenGLVisualizerCameraInfo.nm_target(address()); }
        /** Returns the value at the specified index of the {@code m_target} field. */
        public float m_target(int index) { return B3OpenGLVisualizerCameraInfo.nm_target(address(), index); }

        /** Sets the specified value to the {@code m_width} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_width(int value) { B3OpenGLVisualizerCameraInfo.nm_width(address(), value); return this; }
        /** Sets the specified value to the {@code m_height} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_height(int value) { B3OpenGLVisualizerCameraInfo.nm_height(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code m_viewMatrix} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_viewMatrix(@NativeType("float[16]") FloatBuffer value) { B3OpenGLVisualizerCameraInfo.nm_viewMatrix(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_viewMatrix} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_viewMatrix(int index, float value) { B3OpenGLVisualizerCameraInfo.nm_viewMatrix(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code m_projectionMatrix} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_projectionMatrix(@NativeType("float[16]") FloatBuffer value) { B3OpenGLVisualizerCameraInfo.nm_projectionMatrix(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_projectionMatrix} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_projectionMatrix(int index, float value) { B3OpenGLVisualizerCameraInfo.nm_projectionMatrix(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code m_camUp} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_camUp(@NativeType("float[3]") FloatBuffer value) { B3OpenGLVisualizerCameraInfo.nm_camUp(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_camUp} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_camUp(int index, float value) { B3OpenGLVisualizerCameraInfo.nm_camUp(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code m_camForward} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_camForward(@NativeType("float[3]") FloatBuffer value) { B3OpenGLVisualizerCameraInfo.nm_camForward(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_camForward} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_camForward(int index, float value) { B3OpenGLVisualizerCameraInfo.nm_camForward(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code m_horizontal} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_horizontal(@NativeType("float[3]") FloatBuffer value) { B3OpenGLVisualizerCameraInfo.nm_horizontal(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_horizontal} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_horizontal(int index, float value) { B3OpenGLVisualizerCameraInfo.nm_horizontal(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code m_vertical} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_vertical(@NativeType("float[3]") FloatBuffer value) { B3OpenGLVisualizerCameraInfo.nm_vertical(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_vertical} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_vertical(int index, float value) { B3OpenGLVisualizerCameraInfo.nm_vertical(address(), index, value); return this; }
        /** Sets the specified value to the {@code m_yaw} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_yaw(float value) { B3OpenGLVisualizerCameraInfo.nm_yaw(address(), value); return this; }
        /** Sets the specified value to the {@code m_pitch} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_pitch(float value) { B3OpenGLVisualizerCameraInfo.nm_pitch(address(), value); return this; }
        /** Sets the specified value to the {@code m_dist} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_dist(float value) { B3OpenGLVisualizerCameraInfo.nm_dist(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code m_target} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_target(@NativeType("float[3]") FloatBuffer value) { B3OpenGLVisualizerCameraInfo.nm_target(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_target} field. */
        public B3OpenGLVisualizerCameraInfo.Buffer m_target(int index, float value) { B3OpenGLVisualizerCameraInfo.nm_target(address(), index, value); return this; }

    }

}