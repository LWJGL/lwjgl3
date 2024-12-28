/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_GamepadBinding {
 *     SDL_GamepadBindingType input_type;
 *     union {
 *         int button;
 *         struct {
 *             int axis;
 *             int axis_min;
 *             int axis_max;
 *         } axis;
 *         struct {
 *             int hat;
 *             int hat_mask;
 *         } hat;
 *     } input;
 *     SDL_GamepadBindingType output_type;
 *     union {
 *         SDL_GamepadButton button;
 *         struct {
 *             SDL_GamepadAxis axis;
 *             int axis_min;
 *             int axis_max;
 *         } axis;
 *     } output;
 * }}</pre>
 */
public class SDL_GamepadBinding extends Struct<SDL_GamepadBinding> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INPUT_TYPE,
        INPUT,
            INPUT_BUTTON,
            INPUT_AXIS,
                INPUT_AXIS_AXIS,
                INPUT_AXIS_AXIS_MIN,
                INPUT_AXIS_AXIS_MAX,
            INPUT_HAT,
                INPUT_HAT_HAT,
                INPUT_HAT_HAT_MASK,
        OUTPUT_TYPE,
        OUTPUT,
            OUTPUT_BUTTON,
            OUTPUT_AXIS,
                OUTPUT_AXIS_AXIS,
                OUTPUT_AXIS_AXIS_MIN,
                OUTPUT_AXIS_AXIS_MAX;

    static {
        Layout layout = __struct(
            __member(4),
            __union(
                __member(4),
                __struct(
                    __member(4),
                    __member(4),
                    __member(4)
                ),
                __struct(
                    __member(4),
                    __member(4)
                )
            ),
            __member(4),
            __union(
                __member(4),
                __struct(
                    __member(4),
                    __member(4),
                    __member(4)
                )
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INPUT_TYPE = layout.offsetof(0);
        INPUT = layout.offsetof(1);
            INPUT_BUTTON = layout.offsetof(2);
            INPUT_AXIS = layout.offsetof(3);
                INPUT_AXIS_AXIS = layout.offsetof(4);
                INPUT_AXIS_AXIS_MIN = layout.offsetof(5);
                INPUT_AXIS_AXIS_MAX = layout.offsetof(6);
            INPUT_HAT = layout.offsetof(7);
                INPUT_HAT_HAT = layout.offsetof(8);
                INPUT_HAT_HAT_MASK = layout.offsetof(9);
        OUTPUT_TYPE = layout.offsetof(10);
        OUTPUT = layout.offsetof(11);
            OUTPUT_BUTTON = layout.offsetof(12);
            OUTPUT_AXIS = layout.offsetof(13);
                OUTPUT_AXIS_AXIS = layout.offsetof(14);
                OUTPUT_AXIS_AXIS_MIN = layout.offsetof(15);
                OUTPUT_AXIS_AXIS_MAX = layout.offsetof(16);
    }

    protected SDL_GamepadBinding(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GamepadBinding create(long address, @Nullable ByteBuffer container) {
        return new SDL_GamepadBinding(address, container);
    }

    /**
     * Creates a {@code SDL_GamepadBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GamepadBinding(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code input_type} field. */
    @NativeType("SDL_GamepadBindingType")
    public int input_type() { return ninput_type(address()); }
    /** @return the value of the {@code input.button} field. */
    public int input_button() { return ninput_button(address()); }
    /** @return the value of the {@code input.axis.axis} field. */
    public int input_axis_axis() { return ninput_axis_axis(address()); }
    /** @return the value of the {@code input.axis.axis_min} field. */
    public int input_axis_axis_min() { return ninput_axis_axis_min(address()); }
    /** @return the value of the {@code input.axis.axis_max} field. */
    public int input_axis_axis_max() { return ninput_axis_axis_max(address()); }
    /** @return the value of the {@code input.hat.hat} field. */
    public int input_hat_hat() { return ninput_hat_hat(address()); }
    /** @return the value of the {@code input.hat.hat_mask} field. */
    public int input_hat_hat_mask() { return ninput_hat_hat_mask(address()); }
    /** @return the value of the {@code output_type} field. */
    @NativeType("SDL_GamepadBindingType")
    public int output_type() { return noutput_type(address()); }
    /** @return the value of the {@code output.button} field. */
    @NativeType("SDL_GamepadButton")
    public int output_button() { return noutput_button(address()); }
    /** @return the value of the {@code output.axis.axis} field. */
    @NativeType("SDL_GamepadAxis")
    public int output_axis_axis() { return noutput_axis_axis(address()); }
    /** @return the value of the {@code output.axis.axis_min} field. */
    public int output_axis_axis_min() { return noutput_axis_axis_min(address()); }
    /** @return the value of the {@code output.axis.axis_max} field. */
    public int output_axis_axis_max() { return noutput_axis_axis_max(address()); }

    /** Sets the specified value to the {@code input_type} field. */
    public SDL_GamepadBinding input_type(@NativeType("SDL_GamepadBindingType") int value) { ninput_type(address(), value); return this; }
    /** Sets the specified value to the {@code button} field. */
    public SDL_GamepadBinding input_button(int value) { ninput_button(address(), value); return this; }
    /** Sets the specified value to the {@code axis} field. */
    public SDL_GamepadBinding input_axis_axis(int value) { ninput_axis_axis(address(), value); return this; }
    /** Sets the specified value to the {@code axis_min} field. */
    public SDL_GamepadBinding input_axis_axis_min(int value) { ninput_axis_axis_min(address(), value); return this; }
    /** Sets the specified value to the {@code axis_max} field. */
    public SDL_GamepadBinding input_axis_axis_max(int value) { ninput_axis_axis_max(address(), value); return this; }
    /** Sets the specified value to the {@code hat} field. */
    public SDL_GamepadBinding input_hat_hat(int value) { ninput_hat_hat(address(), value); return this; }
    /** Sets the specified value to the {@code hat_mask} field. */
    public SDL_GamepadBinding input_hat_hat_mask(int value) { ninput_hat_hat_mask(address(), value); return this; }
    /** Sets the specified value to the {@code output_type} field. */
    public SDL_GamepadBinding output_type(@NativeType("SDL_GamepadBindingType") int value) { noutput_type(address(), value); return this; }
    /** Sets the specified value to the {@code button} field. */
    public SDL_GamepadBinding output_button(@NativeType("SDL_GamepadButton") int value) { noutput_button(address(), value); return this; }
    /** Sets the specified value to the {@code axis} field. */
    public SDL_GamepadBinding output_axis_axis(@NativeType("SDL_GamepadAxis") int value) { noutput_axis_axis(address(), value); return this; }
    /** Sets the specified value to the {@code axis_min} field. */
    public SDL_GamepadBinding output_axis_axis_min(int value) { noutput_axis_axis_min(address(), value); return this; }
    /** Sets the specified value to the {@code axis_max} field. */
    public SDL_GamepadBinding output_axis_axis_max(int value) { noutput_axis_axis_max(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GamepadBinding set(SDL_GamepadBinding src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GamepadBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GamepadBinding malloc() {
        return new SDL_GamepadBinding(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GamepadBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GamepadBinding calloc() {
        return new SDL_GamepadBinding(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GamepadBinding} instance allocated with {@link BufferUtils}. */
    public static SDL_GamepadBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GamepadBinding(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GamepadBinding} instance for the specified memory address. */
    public static SDL_GamepadBinding create(long address) {
        return new SDL_GamepadBinding(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GamepadBinding createSafe(long address) {
        return address == NULL ? null : new SDL_GamepadBinding(address, null);
    }

    /**
     * Returns a new {@link SDL_GamepadBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadBinding.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadBinding.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GamepadBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadBinding.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GamepadBinding.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GamepadBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GamepadBinding malloc(MemoryStack stack) {
        return new SDL_GamepadBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GamepadBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GamepadBinding calloc(MemoryStack stack) {
        return new SDL_GamepadBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GamepadBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadBinding.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadBinding.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #input_type}. */
    public static int ninput_type(long struct) { return memGetInt(struct + SDL_GamepadBinding.INPUT_TYPE); }
    /** Unsafe version of {@link #input_button}. */
    public static int ninput_button(long struct) { return memGetInt(struct + SDL_GamepadBinding.INPUT_BUTTON); }
    /** Unsafe version of {@link #input_axis_axis}. */
    public static int ninput_axis_axis(long struct) { return memGetInt(struct + SDL_GamepadBinding.INPUT_AXIS_AXIS); }
    /** Unsafe version of {@link #input_axis_axis_min}. */
    public static int ninput_axis_axis_min(long struct) { return memGetInt(struct + SDL_GamepadBinding.INPUT_AXIS_AXIS_MIN); }
    /** Unsafe version of {@link #input_axis_axis_max}. */
    public static int ninput_axis_axis_max(long struct) { return memGetInt(struct + SDL_GamepadBinding.INPUT_AXIS_AXIS_MAX); }
    /** Unsafe version of {@link #input_hat_hat}. */
    public static int ninput_hat_hat(long struct) { return memGetInt(struct + SDL_GamepadBinding.INPUT_HAT_HAT); }
    /** Unsafe version of {@link #input_hat_hat_mask}. */
    public static int ninput_hat_hat_mask(long struct) { return memGetInt(struct + SDL_GamepadBinding.INPUT_HAT_HAT_MASK); }
    /** Unsafe version of {@link #output_type}. */
    public static int noutput_type(long struct) { return memGetInt(struct + SDL_GamepadBinding.OUTPUT_TYPE); }
    /** Unsafe version of {@link #output_button}. */
    public static int noutput_button(long struct) { return memGetInt(struct + SDL_GamepadBinding.OUTPUT_BUTTON); }
    /** Unsafe version of {@link #output_axis_axis}. */
    public static int noutput_axis_axis(long struct) { return memGetInt(struct + SDL_GamepadBinding.OUTPUT_AXIS_AXIS); }
    /** Unsafe version of {@link #output_axis_axis_min}. */
    public static int noutput_axis_axis_min(long struct) { return memGetInt(struct + SDL_GamepadBinding.OUTPUT_AXIS_AXIS_MIN); }
    /** Unsafe version of {@link #output_axis_axis_max}. */
    public static int noutput_axis_axis_max(long struct) { return memGetInt(struct + SDL_GamepadBinding.OUTPUT_AXIS_AXIS_MAX); }

    /** Unsafe version of {@link #input_type(int) input_type}. */
    public static void ninput_type(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.INPUT_TYPE, value); }
    /** Unsafe version of {@link #input_button(int) input_button}. */
    public static void ninput_button(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.INPUT_BUTTON, value); }
    /** Unsafe version of {@link #input_axis_axis(int) input_axis_axis}. */
    public static void ninput_axis_axis(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.INPUT_AXIS_AXIS, value); }
    /** Unsafe version of {@link #input_axis_axis_min(int) input_axis_axis_min}. */
    public static void ninput_axis_axis_min(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.INPUT_AXIS_AXIS_MIN, value); }
    /** Unsafe version of {@link #input_axis_axis_max(int) input_axis_axis_max}. */
    public static void ninput_axis_axis_max(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.INPUT_AXIS_AXIS_MAX, value); }
    /** Unsafe version of {@link #input_hat_hat(int) input_hat_hat}. */
    public static void ninput_hat_hat(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.INPUT_HAT_HAT, value); }
    /** Unsafe version of {@link #input_hat_hat_mask(int) input_hat_hat_mask}. */
    public static void ninput_hat_hat_mask(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.INPUT_HAT_HAT_MASK, value); }
    /** Unsafe version of {@link #output_type(int) output_type}. */
    public static void noutput_type(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.OUTPUT_TYPE, value); }
    /** Unsafe version of {@link #output_button(int) output_button}. */
    public static void noutput_button(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.OUTPUT_BUTTON, value); }
    /** Unsafe version of {@link #output_axis_axis(int) output_axis_axis}. */
    public static void noutput_axis_axis(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.OUTPUT_AXIS_AXIS, value); }
    /** Unsafe version of {@link #output_axis_axis_min(int) output_axis_axis_min}. */
    public static void noutput_axis_axis_min(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.OUTPUT_AXIS_AXIS_MIN, value); }
    /** Unsafe version of {@link #output_axis_axis_max(int) output_axis_axis_max}. */
    public static void noutput_axis_axis_max(long struct, int value) { memPutInt(struct + SDL_GamepadBinding.OUTPUT_AXIS_AXIS_MAX, value); }

    // -----------------------------------

    /** An array of {@link SDL_GamepadBinding} structs. */
    public static class Buffer extends StructBuffer<SDL_GamepadBinding, Buffer> implements NativeResource {

        private static final SDL_GamepadBinding ELEMENT_FACTORY = SDL_GamepadBinding.create(-1L);

        /**
         * Creates a new {@code SDL_GamepadBinding.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GamepadBinding#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GamepadBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code input_type} field. */
        @NativeType("SDL_GamepadBindingType")
        public int input_type() { return SDL_GamepadBinding.ninput_type(address()); }
        /** @return the value of the {@code input.button} field. */
        public int input_button() { return SDL_GamepadBinding.ninput_button(address()); }
        /** @return the value of the {@code input.axis.axis} field. */
        public int input_axis_axis() { return SDL_GamepadBinding.ninput_axis_axis(address()); }
        /** @return the value of the {@code input.axis.axis_min} field. */
        public int input_axis_axis_min() { return SDL_GamepadBinding.ninput_axis_axis_min(address()); }
        /** @return the value of the {@code input.axis.axis_max} field. */
        public int input_axis_axis_max() { return SDL_GamepadBinding.ninput_axis_axis_max(address()); }
        /** @return the value of the {@code input.hat.hat} field. */
        public int input_hat_hat() { return SDL_GamepadBinding.ninput_hat_hat(address()); }
        /** @return the value of the {@code input.hat.hat_mask} field. */
        public int input_hat_hat_mask() { return SDL_GamepadBinding.ninput_hat_hat_mask(address()); }
        /** @return the value of the {@code output_type} field. */
        @NativeType("SDL_GamepadBindingType")
        public int output_type() { return SDL_GamepadBinding.noutput_type(address()); }
        /** @return the value of the {@code output.button} field. */
        @NativeType("SDL_GamepadButton")
        public int output_button() { return SDL_GamepadBinding.noutput_button(address()); }
        /** @return the value of the {@code output.axis.axis} field. */
        @NativeType("SDL_GamepadAxis")
        public int output_axis_axis() { return SDL_GamepadBinding.noutput_axis_axis(address()); }
        /** @return the value of the {@code output.axis.axis_min} field. */
        public int output_axis_axis_min() { return SDL_GamepadBinding.noutput_axis_axis_min(address()); }
        /** @return the value of the {@code output.axis.axis_max} field. */
        public int output_axis_axis_max() { return SDL_GamepadBinding.noutput_axis_axis_max(address()); }

        /** Sets the specified value to the {@code input_type} field. */
        public SDL_GamepadBinding.Buffer input_type(@NativeType("SDL_GamepadBindingType") int value) { SDL_GamepadBinding.ninput_type(address(), value); return this; }
        /** Sets the specified value to the {@code button} field. */
        public SDL_GamepadBinding.Buffer input_button(int value) { SDL_GamepadBinding.ninput_button(address(), value); return this; }
        /** Sets the specified value to the {@code axis} field. */
        public SDL_GamepadBinding.Buffer input_axis_axis(int value) { SDL_GamepadBinding.ninput_axis_axis(address(), value); return this; }
        /** Sets the specified value to the {@code axis_min} field. */
        public SDL_GamepadBinding.Buffer input_axis_axis_min(int value) { SDL_GamepadBinding.ninput_axis_axis_min(address(), value); return this; }
        /** Sets the specified value to the {@code axis_max} field. */
        public SDL_GamepadBinding.Buffer input_axis_axis_max(int value) { SDL_GamepadBinding.ninput_axis_axis_max(address(), value); return this; }
        /** Sets the specified value to the {@code hat} field. */
        public SDL_GamepadBinding.Buffer input_hat_hat(int value) { SDL_GamepadBinding.ninput_hat_hat(address(), value); return this; }
        /** Sets the specified value to the {@code hat_mask} field. */
        public SDL_GamepadBinding.Buffer input_hat_hat_mask(int value) { SDL_GamepadBinding.ninput_hat_hat_mask(address(), value); return this; }
        /** Sets the specified value to the {@code output_type} field. */
        public SDL_GamepadBinding.Buffer output_type(@NativeType("SDL_GamepadBindingType") int value) { SDL_GamepadBinding.noutput_type(address(), value); return this; }
        /** Sets the specified value to the {@code button} field. */
        public SDL_GamepadBinding.Buffer output_button(@NativeType("SDL_GamepadButton") int value) { SDL_GamepadBinding.noutput_button(address(), value); return this; }
        /** Sets the specified value to the {@code axis} field. */
        public SDL_GamepadBinding.Buffer output_axis_axis(@NativeType("SDL_GamepadAxis") int value) { SDL_GamepadBinding.noutput_axis_axis(address(), value); return this; }
        /** Sets the specified value to the {@code axis_min} field. */
        public SDL_GamepadBinding.Buffer output_axis_axis_min(int value) { SDL_GamepadBinding.noutput_axis_axis_min(address(), value); return this; }
        /** Sets the specified value to the {@code axis_max} field. */
        public SDL_GamepadBinding.Buffer output_axis_axis_max(int value) { SDL_GamepadBinding.noutput_axis_axis_max(address(), value); return this; }

    }

}