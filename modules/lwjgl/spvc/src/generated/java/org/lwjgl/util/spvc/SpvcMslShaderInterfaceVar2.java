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
 * struct spvc_msl_shader_interface_var_2 {
 *     unsigned location;
 *     spvc_msl_shader_variable_format format;
 *     SpvBuiltIn builtin;
 *     unsigned vecsize;
 *     spvc_msl_shader_variable_rate rate;
 * }</code></pre>
 */
@NativeType("struct spvc_msl_shader_interface_var_2")
public class SpvcMslShaderInterfaceVar2 extends Struct<SpvcMslShaderInterfaceVar2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATION,
        FORMAT,
        BUILTIN,
        VECSIZE,
        RATE;

    static {
        Layout layout = __struct(
            __member(4),
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
        RATE = layout.offsetof(4);
    }

    protected SpvcMslShaderInterfaceVar2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpvcMslShaderInterfaceVar2 create(long address, @Nullable ByteBuffer container) {
        return new SpvcMslShaderInterfaceVar2(address, container);
    }

    /**
     * Creates a {@code SpvcMslShaderInterfaceVar2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcMslShaderInterfaceVar2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code location} field. */
    @NativeType("unsigned")
    public int location() { return nlocation(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("spvc_msl_shader_variable_format")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code builtin} field. */
    @NativeType("SpvBuiltIn")
    public int builtin() { return nbuiltin(address()); }
    /** @return the value of the {@code vecsize} field. */
    @NativeType("unsigned")
    public int vecsize() { return nvecsize(address()); }
    /** @return the value of the {@code rate} field. */
    @NativeType("spvc_msl_shader_variable_rate")
    public int rate() { return nrate(address()); }

    /** Sets the specified value to the {@code location} field. */
    public SpvcMslShaderInterfaceVar2 location(@NativeType("unsigned") int value) { nlocation(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public SpvcMslShaderInterfaceVar2 format(@NativeType("spvc_msl_shader_variable_format") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code builtin} field. */
    public SpvcMslShaderInterfaceVar2 builtin(@NativeType("SpvBuiltIn") int value) { nbuiltin(address(), value); return this; }
    /** Sets the specified value to the {@code vecsize} field. */
    public SpvcMslShaderInterfaceVar2 vecsize(@NativeType("unsigned") int value) { nvecsize(address(), value); return this; }
    /** Sets the specified value to the {@code rate} field. */
    public SpvcMslShaderInterfaceVar2 rate(@NativeType("spvc_msl_shader_variable_rate") int value) { nrate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcMslShaderInterfaceVar2 set(
        int location,
        int format,
        int builtin,
        int vecsize,
        int rate
    ) {
        location(location);
        format(format);
        builtin(builtin);
        vecsize(vecsize);
        rate(rate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcMslShaderInterfaceVar2 set(SpvcMslShaderInterfaceVar2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcMslShaderInterfaceVar2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcMslShaderInterfaceVar2 malloc() {
        return new SpvcMslShaderInterfaceVar2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpvcMslShaderInterfaceVar2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcMslShaderInterfaceVar2 calloc() {
        return new SpvcMslShaderInterfaceVar2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpvcMslShaderInterfaceVar2} instance allocated with {@link BufferUtils}. */
    public static SpvcMslShaderInterfaceVar2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcMslShaderInterfaceVar2(memAddress(container), container);
    }

    /** Returns a new {@code SpvcMslShaderInterfaceVar2} instance for the specified memory address. */
    public static SpvcMslShaderInterfaceVar2 create(long address) {
        return new SpvcMslShaderInterfaceVar2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslShaderInterfaceVar2 createSafe(long address) {
        return address == NULL ? null : new SpvcMslShaderInterfaceVar2(address, null);
    }

    /**
     * Returns a new {@link SpvcMslShaderInterfaceVar2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInterfaceVar2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcMslShaderInterfaceVar2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInterfaceVar2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslShaderInterfaceVar2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInterfaceVar2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpvcMslShaderInterfaceVar2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInterfaceVar2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslShaderInterfaceVar2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpvcMslShaderInterfaceVar2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslShaderInterfaceVar2 malloc(MemoryStack stack) {
        return new SpvcMslShaderInterfaceVar2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpvcMslShaderInterfaceVar2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslShaderInterfaceVar2 calloc(MemoryStack stack) {
        return new SpvcMslShaderInterfaceVar2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpvcMslShaderInterfaceVar2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInterfaceVar2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslShaderInterfaceVar2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslShaderInterfaceVar2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return UNSAFE.getInt(null, struct + SpvcMslShaderInterfaceVar2.LOCATION); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + SpvcMslShaderInterfaceVar2.FORMAT); }
    /** Unsafe version of {@link #builtin}. */
    public static int nbuiltin(long struct) { return UNSAFE.getInt(null, struct + SpvcMslShaderInterfaceVar2.BUILTIN); }
    /** Unsafe version of {@link #vecsize}. */
    public static int nvecsize(long struct) { return UNSAFE.getInt(null, struct + SpvcMslShaderInterfaceVar2.VECSIZE); }
    /** Unsafe version of {@link #rate}. */
    public static int nrate(long struct) { return UNSAFE.getInt(null, struct + SpvcMslShaderInterfaceVar2.RATE); }

    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslShaderInterfaceVar2.LOCATION, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslShaderInterfaceVar2.FORMAT, value); }
    /** Unsafe version of {@link #builtin(int) builtin}. */
    public static void nbuiltin(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslShaderInterfaceVar2.BUILTIN, value); }
    /** Unsafe version of {@link #vecsize(int) vecsize}. */
    public static void nvecsize(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslShaderInterfaceVar2.VECSIZE, value); }
    /** Unsafe version of {@link #rate(int) rate}. */
    public static void nrate(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslShaderInterfaceVar2.RATE, value); }

    // -----------------------------------

    /** An array of {@link SpvcMslShaderInterfaceVar2} structs. */
    public static class Buffer extends StructBuffer<SpvcMslShaderInterfaceVar2, Buffer> implements NativeResource {

        private static final SpvcMslShaderInterfaceVar2 ELEMENT_FACTORY = SpvcMslShaderInterfaceVar2.create(-1L);

        /**
         * Creates a new {@code SpvcMslShaderInterfaceVar2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcMslShaderInterfaceVar2#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpvcMslShaderInterfaceVar2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code location} field. */
        @NativeType("unsigned")
        public int location() { return SpvcMslShaderInterfaceVar2.nlocation(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("spvc_msl_shader_variable_format")
        public int format() { return SpvcMslShaderInterfaceVar2.nformat(address()); }
        /** @return the value of the {@code builtin} field. */
        @NativeType("SpvBuiltIn")
        public int builtin() { return SpvcMslShaderInterfaceVar2.nbuiltin(address()); }
        /** @return the value of the {@code vecsize} field. */
        @NativeType("unsigned")
        public int vecsize() { return SpvcMslShaderInterfaceVar2.nvecsize(address()); }
        /** @return the value of the {@code rate} field. */
        @NativeType("spvc_msl_shader_variable_rate")
        public int rate() { return SpvcMslShaderInterfaceVar2.nrate(address()); }

        /** Sets the specified value to the {@code location} field. */
        public SpvcMslShaderInterfaceVar2.Buffer location(@NativeType("unsigned") int value) { SpvcMslShaderInterfaceVar2.nlocation(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public SpvcMslShaderInterfaceVar2.Buffer format(@NativeType("spvc_msl_shader_variable_format") int value) { SpvcMslShaderInterfaceVar2.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code builtin} field. */
        public SpvcMslShaderInterfaceVar2.Buffer builtin(@NativeType("SpvBuiltIn") int value) { SpvcMslShaderInterfaceVar2.nbuiltin(address(), value); return this; }
        /** Sets the specified value to the {@code vecsize} field. */
        public SpvcMslShaderInterfaceVar2.Buffer vecsize(@NativeType("unsigned") int value) { SpvcMslShaderInterfaceVar2.nvecsize(address(), value); return this; }
        /** Sets the specified value to the {@code rate} field. */
        public SpvcMslShaderInterfaceVar2.Buffer rate(@NativeType("spvc_msl_shader_variable_rate") int value) { SpvcMslShaderInterfaceVar2.nrate(address(), value); return this; }

    }

}