/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct spvc_hlsl_resource_binding_mapping {
 *     unsigned register_space;
 *     unsigned register_binding;
 * }</code></pre>
 */
@NativeType("struct spvc_hlsl_resource_binding_mapping")
public class SpvcHLSLResourceBindingMapping extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        REGISTER_SPACE,
        REGISTER_BINDING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        REGISTER_SPACE = layout.offsetof(0);
        REGISTER_BINDING = layout.offsetof(1);
    }

    /**
     * Creates a {@code SpvcHLSLResourceBindingMapping} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcHLSLResourceBindingMapping(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code register_space} field. */
    @NativeType("unsigned")
    public int register_space() { return nregister_space(address()); }
    /** @return the value of the {@code register_binding} field. */
    @NativeType("unsigned")
    public int register_binding() { return nregister_binding(address()); }

    /** Sets the specified value to the {@code register_space} field. */
    public SpvcHLSLResourceBindingMapping register_space(@NativeType("unsigned") int value) { nregister_space(address(), value); return this; }
    /** Sets the specified value to the {@code register_binding} field. */
    public SpvcHLSLResourceBindingMapping register_binding(@NativeType("unsigned") int value) { nregister_binding(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcHLSLResourceBindingMapping set(
        int register_space,
        int register_binding
    ) {
        register_space(register_space);
        register_binding(register_binding);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcHLSLResourceBindingMapping set(SpvcHLSLResourceBindingMapping src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcHLSLResourceBindingMapping} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcHLSLResourceBindingMapping malloc() {
        return wrap(SpvcHLSLResourceBindingMapping.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SpvcHLSLResourceBindingMapping} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcHLSLResourceBindingMapping calloc() {
        return wrap(SpvcHLSLResourceBindingMapping.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SpvcHLSLResourceBindingMapping} instance allocated with {@link BufferUtils}. */
    public static SpvcHLSLResourceBindingMapping create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SpvcHLSLResourceBindingMapping.class, memAddress(container), container);
    }

    /** Returns a new {@code SpvcHLSLResourceBindingMapping} instance for the specified memory address. */
    public static SpvcHLSLResourceBindingMapping create(long address) {
        return wrap(SpvcHLSLResourceBindingMapping.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcHLSLResourceBindingMapping createSafe(long address) {
        return address == NULL ? null : wrap(SpvcHLSLResourceBindingMapping.class, address);
    }

    /**
     * Returns a new {@link SpvcHLSLResourceBindingMapping.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBindingMapping.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcHLSLResourceBindingMapping.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBindingMapping.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcHLSLResourceBindingMapping.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBindingMapping.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SpvcHLSLResourceBindingMapping.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBindingMapping.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcHLSLResourceBindingMapping.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code SpvcHLSLResourceBindingMapping} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcHLSLResourceBindingMapping malloc(MemoryStack stack) {
        return wrap(SpvcHLSLResourceBindingMapping.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SpvcHLSLResourceBindingMapping} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcHLSLResourceBindingMapping calloc(MemoryStack stack) {
        return wrap(SpvcHLSLResourceBindingMapping.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpvcHLSLResourceBindingMapping.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBindingMapping.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcHLSLResourceBindingMapping.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBindingMapping.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #register_space}. */
    public static int nregister_space(long struct) { return UNSAFE.getInt(null, struct + SpvcHLSLResourceBindingMapping.REGISTER_SPACE); }
    /** Unsafe version of {@link #register_binding}. */
    public static int nregister_binding(long struct) { return UNSAFE.getInt(null, struct + SpvcHLSLResourceBindingMapping.REGISTER_BINDING); }

    /** Unsafe version of {@link #register_space(int) register_space}. */
    public static void nregister_space(long struct, int value) { UNSAFE.putInt(null, struct + SpvcHLSLResourceBindingMapping.REGISTER_SPACE, value); }
    /** Unsafe version of {@link #register_binding(int) register_binding}. */
    public static void nregister_binding(long struct, int value) { UNSAFE.putInt(null, struct + SpvcHLSLResourceBindingMapping.REGISTER_BINDING, value); }

    // -----------------------------------

    /** An array of {@link SpvcHLSLResourceBindingMapping} structs. */
    public static class Buffer extends StructBuffer<SpvcHLSLResourceBindingMapping, Buffer> implements NativeResource {

        private static final SpvcHLSLResourceBindingMapping ELEMENT_FACTORY = SpvcHLSLResourceBindingMapping.create(-1L);

        /**
         * Creates a new {@code SpvcHLSLResourceBindingMapping.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcHLSLResourceBindingMapping#SIZEOF}, and its mark will be undefined.
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
        protected SpvcHLSLResourceBindingMapping getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code register_space} field. */
        @NativeType("unsigned")
        public int register_space() { return SpvcHLSLResourceBindingMapping.nregister_space(address()); }
        /** @return the value of the {@code register_binding} field. */
        @NativeType("unsigned")
        public int register_binding() { return SpvcHLSLResourceBindingMapping.nregister_binding(address()); }

        /** Sets the specified value to the {@code register_space} field. */
        public SpvcHLSLResourceBindingMapping.Buffer register_space(@NativeType("unsigned") int value) { SpvcHLSLResourceBindingMapping.nregister_space(address(), value); return this; }
        /** Sets the specified value to the {@code register_binding} field. */
        public SpvcHLSLResourceBindingMapping.Buffer register_binding(@NativeType("unsigned") int value) { SpvcHLSLResourceBindingMapping.nregister_binding(address(), value); return this; }

    }

}