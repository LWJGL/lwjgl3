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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code buttons} &ndash; the states of each gamepad button, {@link GLFW#GLFW_PRESS PRESS} or {@link GLFW#GLFW_RELEASE RELEASE}</li>
 * <li>{@code axes} &ndash; the states of each gamepad axis, in the range -1.0 to 1.0 inclusive</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct GLFWgamepadstate {
 *     unsigned char buttons[15];
 *     float axes[6];
 * }</code></pre>
 *
 * @since version 3.3
 */
@NativeType("struct GLFWgamepadstate")
public class GLFWGamepadState extends Struct implements NativeResource {

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

    GLFWGamepadState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link GLFWGamepadState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLFWGamepadState(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code buttons} field. */
    @NativeType("unsigned char[15]")
    public ByteBuffer buttons() { return nbuttons(address()); }
    /** Returns the value at the specified index of the {@code buttons} field. */
    @NativeType("unsigned char")
    public byte buttons(int index) { return nbuttons(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code axes} field. */
    @NativeType("float[6]")
    public FloatBuffer axes() { return naxes(address()); }
    /** Returns the value at the specified index of the {@code axes} field. */
    public float axes(int index) { return naxes(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@code buttons} field. */
    public GLFWGamepadState buttons(@NativeType("unsigned char[15]") ByteBuffer value) { nbuttons(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code buttons} field. */
    public GLFWGamepadState buttons(int index, @NativeType("unsigned char") byte value) { nbuttons(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code axes} field. */
    public GLFWGamepadState axes(@NativeType("float[6]") FloatBuffer value) { naxes(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code axes} field. */
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

    /** Returns a new {@link GLFWGamepadState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLFWGamepadState malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link GLFWGamepadState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLFWGamepadState calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link GLFWGamepadState} instance allocated with {@link BufferUtils}. */
    public static GLFWGamepadState create() {
        return new GLFWGamepadState(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link GLFWGamepadState} instance for the specified memory address. */
    public static GLFWGamepadState create(long address) {
        return new GLFWGamepadState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static GLFWGamepadState createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link GLFWGamepadState} instance allocated on the thread-local {@link MemoryStack}. */
    public static GLFWGamepadState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link GLFWGamepadState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static GLFWGamepadState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link GLFWGamepadState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLFWGamepadState mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link GLFWGamepadState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLFWGamepadState callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLFWGamepadState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLFWGamepadState.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #buttons}. */
    public static ByteBuffer nbuttons(long struct) { return memByteBuffer(struct + GLFWGamepadState.BUTTONS, 15); }
    /** Unsafe version of {@link #buttons(int) buttons}. */
    public static byte nbuttons(long struct, int index) {
        return memGetByte(struct + GLFWGamepadState.BUTTONS + check(index, 15) * 1);
    }
    /** Unsafe version of {@link #axes}. */
    public static FloatBuffer naxes(long struct) { return memFloatBuffer(struct + GLFWGamepadState.AXES, 6); }
    /** Unsafe version of {@link #axes(int) axes}. */
    public static float naxes(long struct, int index) {
        return memGetFloat(struct + GLFWGamepadState.AXES + check(index, 6) * 4);
    }

    /** Unsafe version of {@link #buttons(ByteBuffer) buttons}. */
    public static void nbuttons(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 15); }
        memCopy(memAddress(value), struct + GLFWGamepadState.BUTTONS, value.remaining() * 1);
    }
    /** Unsafe version of {@link #buttons(int, byte) buttons}. */
    public static void nbuttons(long struct, int index, byte value) {
        memPutByte(struct + GLFWGamepadState.BUTTONS + check(index, 15) * 1, value);
    }
    /** Unsafe version of {@link #axes(FloatBuffer) axes}. */
    public static void naxes(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 6); }
        memCopy(memAddress(value), struct + GLFWGamepadState.AXES, value.remaining() * 4);
    }
    /** Unsafe version of {@link #axes(int, float) axes}. */
    public static void naxes(long struct, int index, float value) {
        memPutFloat(struct + GLFWGamepadState.AXES + check(index, 6) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link GLFWGamepadState} structs. */
    public static class Buffer extends StructBuffer<GLFWGamepadState, Buffer> implements NativeResource {

        /**
         * Creates a new {@link GLFWGamepadState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLFWGamepadState#SIZEOF}, and its mark will be undefined.
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
        protected GLFWGamepadState newInstance(long address) {
            return new GLFWGamepadState(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the {@code buttons} field. */
        @NativeType("unsigned char[15]")
        public ByteBuffer buttons() { return GLFWGamepadState.nbuttons(address()); }
        /** Returns the value at the specified index of the {@code buttons} field. */
        @NativeType("unsigned char")
        public byte buttons(int index) { return GLFWGamepadState.nbuttons(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code axes} field. */
        @NativeType("float[6]")
        public FloatBuffer axes() { return GLFWGamepadState.naxes(address()); }
        /** Returns the value at the specified index of the {@code axes} field. */
        public float axes(int index) { return GLFWGamepadState.naxes(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@code buttons} field. */
        public GLFWGamepadState.Buffer buttons(@NativeType("unsigned char[15]") ByteBuffer value) { GLFWGamepadState.nbuttons(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code buttons} field. */
        public GLFWGamepadState.Buffer buttons(int index, @NativeType("unsigned char") byte value) { GLFWGamepadState.nbuttons(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code axes} field. */
        public GLFWGamepadState.Buffer axes(@NativeType("float[6]") FloatBuffer value) { GLFWGamepadState.naxes(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code axes} field. */
        public GLFWGamepadState.Buffer axes(int index, float value) { GLFWGamepadState.naxes(address(), index, value); return this; }

    }

}