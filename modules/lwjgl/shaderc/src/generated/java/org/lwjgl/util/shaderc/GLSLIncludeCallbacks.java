/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct glsl_include_callbacks_t {
 *     {@link GLSLIncludeSystemFuncI glsl_include_system_func} include_system;
 *     {@link GLSLIncludeLocalFuncI glsl_include_local_func} include_local;
 *     {@link GLSLFreeIncludeResultFuncI glsl_free_include_result_func} free_include_result;
 * }</code></pre>
 */
@NativeType("struct glsl_include_callbacks_t")
public class GLSLIncludeCallbacks extends Struct<GLSLIncludeCallbacks> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INCLUDE_SYSTEM,
        INCLUDE_LOCAL,
        FREE_INCLUDE_RESULT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INCLUDE_SYSTEM = layout.offsetof(0);
        INCLUDE_LOCAL = layout.offsetof(1);
        FREE_INCLUDE_RESULT = layout.offsetof(2);
    }

    protected GLSLIncludeCallbacks(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLSLIncludeCallbacks create(long address, @Nullable ByteBuffer container) {
        return new GLSLIncludeCallbacks(address, container);
    }

    /**
     * Creates a {@code GLSLIncludeCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLSLIncludeCallbacks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code include_system} field. */
    @NativeType("glsl_include_system_func")
    public @Nullable GLSLIncludeSystemFunc include_system() { return ninclude_system(address()); }
    /** @return the value of the {@code include_local} field. */
    @NativeType("glsl_include_local_func")
    public @Nullable GLSLIncludeLocalFunc include_local() { return ninclude_local(address()); }
    /** @return the value of the {@code free_include_result} field. */
    @NativeType("glsl_free_include_result_func")
    public @Nullable GLSLFreeIncludeResultFunc free_include_result() { return nfree_include_result(address()); }

    /** Sets the specified value to the {@code include_system} field. */
    public GLSLIncludeCallbacks include_system(@Nullable @NativeType("glsl_include_system_func") GLSLIncludeSystemFuncI value) { ninclude_system(address(), value); return this; }
    /** Sets the specified value to the {@code include_local} field. */
    public GLSLIncludeCallbacks include_local(@Nullable @NativeType("glsl_include_local_func") GLSLIncludeLocalFuncI value) { ninclude_local(address(), value); return this; }
    /** Sets the specified value to the {@code free_include_result} field. */
    public GLSLIncludeCallbacks free_include_result(@Nullable @NativeType("glsl_free_include_result_func") GLSLFreeIncludeResultFuncI value) { nfree_include_result(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public GLSLIncludeCallbacks set(
        GLSLIncludeSystemFuncI include_system,
        GLSLIncludeLocalFuncI include_local,
        GLSLFreeIncludeResultFuncI free_include_result
    ) {
        include_system(include_system);
        include_local(include_local);
        free_include_result(free_include_result);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public GLSLIncludeCallbacks set(GLSLIncludeCallbacks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code GLSLIncludeCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLSLIncludeCallbacks malloc() {
        return new GLSLIncludeCallbacks(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code GLSLIncludeCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLSLIncludeCallbacks calloc() {
        return new GLSLIncludeCallbacks(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code GLSLIncludeCallbacks} instance allocated with {@link BufferUtils}. */
    public static GLSLIncludeCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLIncludeCallbacks(memAddress(container), container);
    }

    /** Returns a new {@code GLSLIncludeCallbacks} instance for the specified memory address. */
    public static GLSLIncludeCallbacks create(long address) {
        return new GLSLIncludeCallbacks(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable GLSLIncludeCallbacks createSafe(long address) {
        return address == NULL ? null : new GLSLIncludeCallbacks(address, null);
    }

    /**
     * Returns a new {@link GLSLIncludeCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeCallbacks.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GLSLIncludeCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeCallbacks.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLIncludeCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeCallbacks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link GLSLIncludeCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeCallbacks.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static GLSLIncludeCallbacks.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code GLSLIncludeCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLIncludeCallbacks malloc(MemoryStack stack) {
        return new GLSLIncludeCallbacks(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code GLSLIncludeCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLIncludeCallbacks calloc(MemoryStack stack) {
        return new GLSLIncludeCallbacks(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link GLSLIncludeCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeCallbacks.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLIncludeCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeCallbacks.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #include_system}. */
    public static @Nullable GLSLIncludeSystemFunc ninclude_system(long struct) { return GLSLIncludeSystemFunc.createSafe(memGetAddress(struct + GLSLIncludeCallbacks.INCLUDE_SYSTEM)); }
    /** Unsafe version of {@link #include_local}. */
    public static @Nullable GLSLIncludeLocalFunc ninclude_local(long struct) { return GLSLIncludeLocalFunc.createSafe(memGetAddress(struct + GLSLIncludeCallbacks.INCLUDE_LOCAL)); }
    /** Unsafe version of {@link #free_include_result}. */
    public static @Nullable GLSLFreeIncludeResultFunc nfree_include_result(long struct) { return GLSLFreeIncludeResultFunc.createSafe(memGetAddress(struct + GLSLIncludeCallbacks.FREE_INCLUDE_RESULT)); }

    /** Unsafe version of {@link #include_system(GLSLIncludeSystemFuncI) include_system}. */
    public static void ninclude_system(long struct, @Nullable GLSLIncludeSystemFuncI value) { memPutAddress(struct + GLSLIncludeCallbacks.INCLUDE_SYSTEM, memAddressSafe(value)); }
    /** Unsafe version of {@link #include_local(GLSLIncludeLocalFuncI) include_local}. */
    public static void ninclude_local(long struct, @Nullable GLSLIncludeLocalFuncI value) { memPutAddress(struct + GLSLIncludeCallbacks.INCLUDE_LOCAL, memAddressSafe(value)); }
    /** Unsafe version of {@link #free_include_result(GLSLFreeIncludeResultFuncI) free_include_result}. */
    public static void nfree_include_result(long struct, @Nullable GLSLFreeIncludeResultFuncI value) { memPutAddress(struct + GLSLIncludeCallbacks.FREE_INCLUDE_RESULT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link GLSLIncludeCallbacks} structs. */
    public static class Buffer extends StructBuffer<GLSLIncludeCallbacks, Buffer> implements NativeResource {

        private static final GLSLIncludeCallbacks ELEMENT_FACTORY = GLSLIncludeCallbacks.create(-1L);

        /**
         * Creates a new {@code GLSLIncludeCallbacks.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLSLIncludeCallbacks#SIZEOF}, and its mark will be undefined.</p>
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
        protected GLSLIncludeCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code include_system} field. */
        @NativeType("glsl_include_system_func")
        public @Nullable GLSLIncludeSystemFunc include_system() { return GLSLIncludeCallbacks.ninclude_system(address()); }
        /** @return the value of the {@code include_local} field. */
        @NativeType("glsl_include_local_func")
        public @Nullable GLSLIncludeLocalFunc include_local() { return GLSLIncludeCallbacks.ninclude_local(address()); }
        /** @return the value of the {@code free_include_result} field. */
        @NativeType("glsl_free_include_result_func")
        public @Nullable GLSLFreeIncludeResultFunc free_include_result() { return GLSLIncludeCallbacks.nfree_include_result(address()); }

        /** Sets the specified value to the {@code include_system} field. */
        public GLSLIncludeCallbacks.Buffer include_system(@Nullable @NativeType("glsl_include_system_func") GLSLIncludeSystemFuncI value) { GLSLIncludeCallbacks.ninclude_system(address(), value); return this; }
        /** Sets the specified value to the {@code include_local} field. */
        public GLSLIncludeCallbacks.Buffer include_local(@Nullable @NativeType("glsl_include_local_func") GLSLIncludeLocalFuncI value) { GLSLIncludeCallbacks.ninclude_local(address(), value); return this; }
        /** Sets the specified value to the {@code free_include_result} field. */
        public GLSLIncludeCallbacks.Buffer free_include_result(@Nullable @NativeType("glsl_free_include_result_func") GLSLFreeIncludeResultFuncI value) { GLSLIncludeCallbacks.nfree_include_result(address(), value); return this; }

    }

}