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
 * Defines MSL characteristics of an input variable at a particular location.
 * 
 * <p>After compilation, it is possible to query whether or not this location was used. If {@code vecsize} is nonzero, it must be greater than or equal to
 * the {@code vecsize} declared in the shader, or behavior is undefined.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct spvc_msl_shader_input {
 *     unsigned location;
 *     spvc_msl_vertex_format format;
 *     SpvBuiltIn builtin;
 *     unsigned vecsize;
 * }</code></pre>
 */
@NativeType("struct spvc_msl_shader_input")
public class SpvcMslShaderInput extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATION,
        FORMAT,
        BUILTIN,
        VECSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATION = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        BUILTIN = layout.offsetof(2);
        VECSIZE = layout.offsetof(3);
    }

    /**
     * Creates a {@code SpvcMslShaderInput} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcMslShaderInput(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code location} field. */
    @NativeType("unsigned")
    public int location() { return nlocation(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("spvc_msl_vertex_format")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code builtin} field. */
    @NativeType("SpvBuiltIn")
    public int builtin() { return nbuiltin(address()); }
    /** @return the value of the {@code vecsize} field. */
    @NativeType("unsigned")
    public int vecsize() { return nvecsize(address()); }

    /** Sets the specified value to the {@code location} field. */
    public SpvcMslShaderInput location(@NativeType("unsigned") int value) { nlocation(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public SpvcMslShaderInput format(@NativeType("spvc_msl_vertex_format") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code builtin} field. */
    public SpvcMslShaderInput builtin(@NativeType("SpvBuiltIn") int value) { nbuiltin(address(), value); return this; }
    /** Sets the specified value to the {@code vecsize} field. */
    public SpvcMslShaderInput vecsize(@NativeType("unsigned") int value) { nvecsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcMslShaderInput set(
        int location,
        int format,
        int builtin,
        int vecsize
    ) {
        location(location);
        format(format);
        builtin(builtin);
        vecsize(vecsize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcMslShaderInput set(SpvcMslShaderInput src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcMslShaderInput} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcMslShaderInput malloc() {
        return wrap(SpvcMslShaderInput.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SpvcMslShaderInput} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcMslShaderInput calloc() {
        return wrap(SpvcMslShaderInput.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SpvcMslShaderInput} instance allocated with {@link BufferUtils}. */
    public static SpvcMslShaderInput create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SpvcMslShaderInput.class, memAddress(container), container);
    }

    /** Returns a new {@code SpvcMslShaderInput} instance for the specified memory address. */
    public static SpvcMslShaderInput create(long address) {
        return wrap(SpvcMslShaderInput.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslShaderInput createSafe(long address) {
        return address == NULL ? null : wrap(SpvcMslShaderInput.class, address);
    }

    /**
     * Returns a new {@link SpvcMslShaderInput.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInput.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcMslShaderInput.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInput.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslShaderInput.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInput.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SpvcMslShaderInput.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInput.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslShaderInput.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code SpvcMslShaderInput} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslShaderInput malloc(MemoryStack stack) {
        return wrap(SpvcMslShaderInput.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SpvcMslShaderInput} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslShaderInput calloc(MemoryStack stack) {
        return wrap(SpvcMslShaderInput.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpvcMslShaderInput.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInput.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslShaderInput.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInput.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return UNSAFE.getInt(null, struct + SpvcMslShaderInput.LOCATION); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + SpvcMslShaderInput.FORMAT); }
    /** Unsafe version of {@link #builtin}. */
    public static int nbuiltin(long struct) { return UNSAFE.getInt(null, struct + SpvcMslShaderInput.BUILTIN); }
    /** Unsafe version of {@link #vecsize}. */
    public static int nvecsize(long struct) { return UNSAFE.getInt(null, struct + SpvcMslShaderInput.VECSIZE); }

    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslShaderInput.LOCATION, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslShaderInput.FORMAT, value); }
    /** Unsafe version of {@link #builtin(int) builtin}. */
    public static void nbuiltin(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslShaderInput.BUILTIN, value); }
    /** Unsafe version of {@link #vecsize(int) vecsize}. */
    public static void nvecsize(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslShaderInput.VECSIZE, value); }

    // -----------------------------------

    /** An array of {@link SpvcMslShaderInput} structs. */
    public static class Buffer extends StructBuffer<SpvcMslShaderInput, Buffer> implements NativeResource {

        private static final SpvcMslShaderInput ELEMENT_FACTORY = SpvcMslShaderInput.create(-1L);

        /**
         * Creates a new {@code SpvcMslShaderInput.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcMslShaderInput#SIZEOF}, and its mark will be undefined.
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
        protected SpvcMslShaderInput getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code location} field. */
        @NativeType("unsigned")
        public int location() { return SpvcMslShaderInput.nlocation(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("spvc_msl_vertex_format")
        public int format() { return SpvcMslShaderInput.nformat(address()); }
        /** @return the value of the {@code builtin} field. */
        @NativeType("SpvBuiltIn")
        public int builtin() { return SpvcMslShaderInput.nbuiltin(address()); }
        /** @return the value of the {@code vecsize} field. */
        @NativeType("unsigned")
        public int vecsize() { return SpvcMslShaderInput.nvecsize(address()); }

        /** Sets the specified value to the {@code location} field. */
        public SpvcMslShaderInput.Buffer location(@NativeType("unsigned") int value) { SpvcMslShaderInput.nlocation(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public SpvcMslShaderInput.Buffer format(@NativeType("spvc_msl_vertex_format") int value) { SpvcMslShaderInput.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code builtin} field. */
        public SpvcMslShaderInput.Buffer builtin(@NativeType("SpvBuiltIn") int value) { SpvcMslShaderInput.nbuiltin(address(), value); return this; }
        /** Sets the specified value to the {@code vecsize} field. */
        public SpvcMslShaderInput.Buffer vecsize(@NativeType("unsigned") int value) { SpvcMslShaderInput.nvecsize(address(), value); return this; }

    }

}