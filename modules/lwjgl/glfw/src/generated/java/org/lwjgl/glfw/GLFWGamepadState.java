/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the input state of a gamepad.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct GLFWgamepadstate {
 *     unsigned char {@link #buttons}[15];
 *     float {@link #axes}[6];
 * }</code></pre>
 *
 * @since version 3.3
 */
@NativeType("struct GLFWgamepadstate")
public class GLFWGamepadState extends Struct<GLFWGamepadState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUTTONS,
        AXES;

    static {
        Layout layout = __struct(
            __array(1, 15),
            __array(4, 6)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUTTONS = layout.offsetof(0);
        AXES = layout.offsetof(1);
    }

    protected GLFWGamepadState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLFWGamepadState create(long address, @Nullable ByteBuffer container) {
        return new GLFWGamepadState(address, container);
    }

    /**
     * Creates a {@code GLFWGamepadState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLFWGamepadState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the states of each gamepad button, {@link GLFW#GLFW_PRESS PRESS} or {@link GLFW#GLFW_RELEASE RELEASE} */
    @NativeType("unsigned char[15]")
    public ByteBuffer buttons() { return nbuttons(address()); }
    /** the states of each gamepad button, {@link GLFW#GLFW_PRESS PRESS} or {@link GLFW#GLFW_RELEASE RELEASE} */
    @NativeType("unsigned char")
    public byte buttons(int index) { return nbuttons(address(), index); }
    /** the states of each gamepad axis, in the range -1.0 to 1.0 inclusive */
    @NativeType("float[6]")
    public FloatBuffer axes() { return naxes(address()); }
    /** the states of each gamepad axis, in the range -1.0 to 1.0 inclusive */
    public float axes(int index) { return naxes(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@link #buttons} field. */
    public GLFWGamepadState buttons(@NativeType("unsigned char[15]") ByteBuffer value) { nbuttons(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #buttons} field. */
    public GLFWGamepadState buttons(int index, @NativeType("unsigned char") byte value) { nbuttons(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@link #axes} field. */
    public GLFWGamepadState axes(@NativeType("float[6]") FloatBuffer value) { naxes(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #axes} field. */
    public GLFWGamepadState axes(int index, float value) { naxes(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public GLFWGamepadState set(
        ByteBuffer buttons,
        FloatBuffer axes
    ) {
        buttons(buttons);
        axes(axes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public GLFWGamepadState set(GLFWGamepadState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code GLFWGamepadState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLFWGamepadState malloc() {
        return new GLFWGamepadState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code GLFWGamepadState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLFWGamepadState calloc() {
        return new GLFWGamepadState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code GLFWGamepadState} instance allocated with {@link BufferUtils}. */
    public static GLFWGamepadState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLFWGamepadState(memAddress(container), container);
    }

    /** Returns a new {@code GLFWGamepadState} instance for the specified memory address. */
    public static GLFWGamepadState create(long address) {
        return new GLFWGamepadState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static GLFWGamepadState createSafe(long address) {
        return address == NULL ? null : new GLFWGamepadState(address, null);
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link GLFWGamepadState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static GLFWGamepadState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static GLFWGamepadState mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static GLFWGamepadState callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static GLFWGamepadState mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static GLFWGamepadState callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static GLFWGamepadState.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static GLFWGamepadState.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static GLFWGamepadState.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static GLFWGamepadState.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code GLFWGamepadState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLFWGamepadState malloc(MemoryStack stack) {
        return new GLFWGamepadState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code GLFWGamepadState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLFWGamepadState calloc(MemoryStack stack) {
        return new GLFWGamepadState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #buttons}. */
    public static ByteBuffer nbuttons(long struct) { return memByteBuffer(struct + GLFWGamepadState.BUTTONS, 15); }
    /** Unsafe version of {@link #buttons(int) buttons}. */
    public static byte nbuttons(long struct, int index) {
        return UNSAFE.getByte(null, struct + GLFWGamepadState.BUTTONS + check(index, 15) * 1);
    }
    /** Unsafe version of {@link #axes}. */
    public static FloatBuffer naxes(long struct) { return memFloatBuffer(struct + GLFWGamepadState.AXES, 6); }
    /** Unsafe version of {@link #axes(int) axes}. */
    public static float naxes(long struct, int index) {
        return UNSAFE.getFloat(null, struct + GLFWGamepadState.AXES + check(index, 6) * 4);
    }

    /** Unsafe version of {@link #buttons(ByteBuffer) buttons}. */
    public static void nbuttons(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 15); }
        memCopy(memAddress(value), struct + GLFWGamepadState.BUTTONS, value.remaining() * 1);
    }
    /** Unsafe version of {@link #buttons(int, byte) buttons}. */
    public static void nbuttons(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + GLFWGamepadState.BUTTONS + check(index, 15) * 1, value);
    }
    /** Unsafe version of {@link #axes(FloatBuffer) axes}. */
    public static void naxes(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 6); }
        memCopy(memAddress(value), struct + GLFWGamepadState.AXES, value.remaining() * 4);
    }
    /** Unsafe version of {@link #axes(int, float) axes}. */
    public static void naxes(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + GLFWGamepadState.AXES + check(index, 6) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link GLFWGamepadState} structs. */
    public static class Buffer extends StructBuffer<GLFWGamepadState, Buffer> implements NativeResource {

        private static final GLFWGamepadState ELEMENT_FACTORY = GLFWGamepadState.create(-1L);

        /**
         * Creates a new {@code GLFWGamepadState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLFWGamepadState#SIZEOF}, and its mark will be undefined.</p>
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
        protected GLFWGamepadState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link GLFWGamepadState#buttons} field. */
        @NativeType("unsigned char[15]")
        public ByteBuffer buttons() { return GLFWGamepadState.nbuttons(address()); }
        /** @return the value at the specified index of the {@link GLFWGamepadState#buttons} field. */
        @NativeType("unsigned char")
        public byte buttons(int index) { return GLFWGamepadState.nbuttons(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@link GLFWGamepadState#axes} field. */
        @NativeType("float[6]")
        public FloatBuffer axes() { return GLFWGamepadState.naxes(address()); }
        /** @return the value at the specified index of the {@link GLFWGamepadState#axes} field. */
        public float axes(int index) { return GLFWGamepadState.naxes(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@link GLFWGamepadState#buttons} field. */
        public GLFWGamepadState.Buffer buttons(@NativeType("unsigned char[15]") ByteBuffer value) { GLFWGamepadState.nbuttons(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link GLFWGamepadState#buttons} field. */
        public GLFWGamepadState.Buffer buttons(int index, @NativeType("unsigned char") byte value) { GLFWGamepadState.nbuttons(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@link GLFWGamepadState#axes} field. */
        public GLFWGamepadState.Buffer axes(@NativeType("float[6]") FloatBuffer value) { GLFWGamepadState.naxes(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link GLFWGamepadState#axes} field. */
        public GLFWGamepadState.Buffer axes(int index, float value) { GLFWGamepadState.naxes(address(), index, value); return this; }

    }

}