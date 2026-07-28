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
 * <pre>{@code
 * struct glslang_spv_options_t {
 *     bool generate_debug_info;
 *     bool strip_debug_info;
 *     bool disable_optimizer;
 *     bool optimize_size;
 *     bool disassemble;
 *     bool validate;
 *     bool emit_nonsemantic_shader_debug_info;
 *     bool emit_nonsemantic_shader_debug_source;
 *     bool compile_only;
 *     bool optimize_allow_expanded_id_bound;
 * }}</pre>
 */
@NativeType("struct glslang_spv_options_t")
public class GLSLangSPVOptions extends Struct<GLSLangSPVOptions> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GENERATE_DEBUG_INFO,
        STRIP_DEBUG_INFO,
        DISABLE_OPTIMIZER,
        OPTIMIZE_SIZE,
        DISASSEMBLE,
        VALIDATE,
        EMIT_NONSEMANTIC_SHADER_DEBUG_INFO,
        EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE,
        COMPILE_ONLY,
        OPTIMIZE_ALLOW_EXPANDED_ID_BOUND;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GENERATE_DEBUG_INFO = layout.offsetof(0);
        STRIP_DEBUG_INFO = layout.offsetof(1);
        DISABLE_OPTIMIZER = layout.offsetof(2);
        OPTIMIZE_SIZE = layout.offsetof(3);
        DISASSEMBLE = layout.offsetof(4);
        VALIDATE = layout.offsetof(5);
        EMIT_NONSEMANTIC_SHADER_DEBUG_INFO = layout.offsetof(6);
        EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE = layout.offsetof(7);
        COMPILE_ONLY = layout.offsetof(8);
        OPTIMIZE_ALLOW_EXPANDED_ID_BOUND = layout.offsetof(9);
    }

    protected GLSLangSPVOptions(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLSLangSPVOptions create(long address, @Nullable ByteBuffer container) {
        return new GLSLangSPVOptions(address, container);
    }

    /**
     * Creates a {@code GLSLangSPVOptions} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLSLangSPVOptions(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code generate_debug_info} field. */
    @NativeType("bool")
    public boolean generate_debug_info() { return ngenerate_debug_info(address()); }
    /** @return the value of the {@code strip_debug_info} field. */
    @NativeType("bool")
    public boolean strip_debug_info() { return nstrip_debug_info(address()); }
    /** @return the value of the {@code disable_optimizer} field. */
    @NativeType("bool")
    public boolean disable_optimizer() { return ndisable_optimizer(address()); }
    /** @return the value of the {@code optimize_size} field. */
    @NativeType("bool")
    public boolean optimize_size() { return noptimize_size(address()); }
    /** @return the value of the {@code disassemble} field. */
    @NativeType("bool")
    public boolean disassemble() { return ndisassemble(address()); }
    /** @return the value of the {@code validate} field. */
    @NativeType("bool")
    public boolean validate() { return nvalidate(address()); }
    /** @return the value of the {@code emit_nonsemantic_shader_debug_info} field. */
    @NativeType("bool")
    public boolean emit_nonsemantic_shader_debug_info() { return nemit_nonsemantic_shader_debug_info(address()); }
    /** @return the value of the {@code emit_nonsemantic_shader_debug_source} field. */
    @NativeType("bool")
    public boolean emit_nonsemantic_shader_debug_source() { return nemit_nonsemantic_shader_debug_source(address()); }
    /** @return the value of the {@code compile_only} field. */
    @NativeType("bool")
    public boolean compile_only() { return ncompile_only(address()); }
    /** @return the value of the {@code optimize_allow_expanded_id_bound} field. */
    @NativeType("bool")
    public boolean optimize_allow_expanded_id_bound() { return noptimize_allow_expanded_id_bound(address()); }

    /** Sets the specified value to the {@code generate_debug_info} field. */
    public GLSLangSPVOptions generate_debug_info(@NativeType("bool") boolean value) { ngenerate_debug_info(address(), value); return this; }
    /** Sets the specified value to the {@code strip_debug_info} field. */
    public GLSLangSPVOptions strip_debug_info(@NativeType("bool") boolean value) { nstrip_debug_info(address(), value); return this; }
    /** Sets the specified value to the {@code disable_optimizer} field. */
    public GLSLangSPVOptions disable_optimizer(@NativeType("bool") boolean value) { ndisable_optimizer(address(), value); return this; }
    /** Sets the specified value to the {@code optimize_size} field. */
    public GLSLangSPVOptions optimize_size(@NativeType("bool") boolean value) { noptimize_size(address(), value); return this; }
    /** Sets the specified value to the {@code disassemble} field. */
    public GLSLangSPVOptions disassemble(@NativeType("bool") boolean value) { ndisassemble(address(), value); return this; }
    /** Sets the specified value to the {@code validate} field. */
    public GLSLangSPVOptions validate(@NativeType("bool") boolean value) { nvalidate(address(), value); return this; }
    /** Sets the specified value to the {@code emit_nonsemantic_shader_debug_info} field. */
    public GLSLangSPVOptions emit_nonsemantic_shader_debug_info(@NativeType("bool") boolean value) { nemit_nonsemantic_shader_debug_info(address(), value); return this; }
    /** Sets the specified value to the {@code emit_nonsemantic_shader_debug_source} field. */
    public GLSLangSPVOptions emit_nonsemantic_shader_debug_source(@NativeType("bool") boolean value) { nemit_nonsemantic_shader_debug_source(address(), value); return this; }
    /** Sets the specified value to the {@code compile_only} field. */
    public GLSLangSPVOptions compile_only(@NativeType("bool") boolean value) { ncompile_only(address(), value); return this; }
    /** Sets the specified value to the {@code optimize_allow_expanded_id_bound} field. */
    public GLSLangSPVOptions optimize_allow_expanded_id_bound(@NativeType("bool") boolean value) { noptimize_allow_expanded_id_bound(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public GLSLangSPVOptions set(
        boolean generate_debug_info,
        boolean strip_debug_info,
        boolean disable_optimizer,
        boolean optimize_size,
        boolean disassemble,
        boolean validate,
        boolean emit_nonsemantic_shader_debug_info,
        boolean emit_nonsemantic_shader_debug_source,
        boolean compile_only,
        boolean optimize_allow_expanded_id_bound
    ) {
        generate_debug_info(generate_debug_info);
        strip_debug_info(strip_debug_info);
        disable_optimizer(disable_optimizer);
        optimize_size(optimize_size);
        disassemble(disassemble);
        validate(validate);
        emit_nonsemantic_shader_debug_info(emit_nonsemantic_shader_debug_info);
        emit_nonsemantic_shader_debug_source(emit_nonsemantic_shader_debug_source);
        compile_only(compile_only);
        optimize_allow_expanded_id_bound(optimize_allow_expanded_id_bound);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public GLSLangSPVOptions set(GLSLangSPVOptions src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code GLSLangSPVOptions} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLSLangSPVOptions malloc() {
        return new GLSLangSPVOptions(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code GLSLangSPVOptions} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLSLangSPVOptions calloc() {
        return new GLSLangSPVOptions(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code GLSLangSPVOptions} instance allocated with {@link BufferUtils}. */
    public static GLSLangSPVOptions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLangSPVOptions(memAddress(container), container);
    }

    /** Returns a new {@code GLSLangSPVOptions} instance for the specified memory address. */
    public static GLSLangSPVOptions create(long address) {
        return new GLSLangSPVOptions(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable GLSLangSPVOptions createSafe(long address) {
        return address == NULL ? null : new GLSLangSPVOptions(address, null);
    }

    /**
     * Returns a new {@link GLSLangSPVOptions.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangSPVOptions.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GLSLangSPVOptions.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangSPVOptions.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLangSPVOptions.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangSPVOptions.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link GLSLangSPVOptions.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLSLangSPVOptions.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static GLSLangSPVOptions.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code GLSLangSPVOptions} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLangSPVOptions malloc(MemoryStack stack) {
        return new GLSLangSPVOptions(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code GLSLangSPVOptions} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLangSPVOptions calloc(MemoryStack stack) {
        return new GLSLangSPVOptions(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link GLSLangSPVOptions.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLangSPVOptions.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLangSPVOptions.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLangSPVOptions.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #generate_debug_info}. */
    public static boolean ngenerate_debug_info(long struct) { return memGetByte(struct + GLSLangSPVOptions.GENERATE_DEBUG_INFO) != 0; }
    /** Unsafe version of {@link #strip_debug_info}. */
    public static boolean nstrip_debug_info(long struct) { return memGetByte(struct + GLSLangSPVOptions.STRIP_DEBUG_INFO) != 0; }
    /** Unsafe version of {@link #disable_optimizer}. */
    public static boolean ndisable_optimizer(long struct) { return memGetByte(struct + GLSLangSPVOptions.DISABLE_OPTIMIZER) != 0; }
    /** Unsafe version of {@link #optimize_size}. */
    public static boolean noptimize_size(long struct) { return memGetByte(struct + GLSLangSPVOptions.OPTIMIZE_SIZE) != 0; }
    /** Unsafe version of {@link #disassemble}. */
    public static boolean ndisassemble(long struct) { return memGetByte(struct + GLSLangSPVOptions.DISASSEMBLE) != 0; }
    /** Unsafe version of {@link #validate}. */
    public static boolean nvalidate(long struct) { return memGetByte(struct + GLSLangSPVOptions.VALIDATE) != 0; }
    /** Unsafe version of {@link #emit_nonsemantic_shader_debug_info}. */
    public static boolean nemit_nonsemantic_shader_debug_info(long struct) { return memGetByte(struct + GLSLangSPVOptions.EMIT_NONSEMANTIC_SHADER_DEBUG_INFO) != 0; }
    /** Unsafe version of {@link #emit_nonsemantic_shader_debug_source}. */
    public static boolean nemit_nonsemantic_shader_debug_source(long struct) { return memGetByte(struct + GLSLangSPVOptions.EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE) != 0; }
    /** Unsafe version of {@link #compile_only}. */
    public static boolean ncompile_only(long struct) { return memGetByte(struct + GLSLangSPVOptions.COMPILE_ONLY) != 0; }
    /** Unsafe version of {@link #optimize_allow_expanded_id_bound}. */
    public static boolean noptimize_allow_expanded_id_bound(long struct) { return memGetByte(struct + GLSLangSPVOptions.OPTIMIZE_ALLOW_EXPANDED_ID_BOUND) != 0; }

    /** Unsafe version of {@link #generate_debug_info(boolean) generate_debug_info}. */
    public static void ngenerate_debug_info(long struct, boolean value) { memPutByte(struct + GLSLangSPVOptions.GENERATE_DEBUG_INFO, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #strip_debug_info(boolean) strip_debug_info}. */
    public static void nstrip_debug_info(long struct, boolean value) { memPutByte(struct + GLSLangSPVOptions.STRIP_DEBUG_INFO, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #disable_optimizer(boolean) disable_optimizer}. */
    public static void ndisable_optimizer(long struct, boolean value) { memPutByte(struct + GLSLangSPVOptions.DISABLE_OPTIMIZER, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #optimize_size(boolean) optimize_size}. */
    public static void noptimize_size(long struct, boolean value) { memPutByte(struct + GLSLangSPVOptions.OPTIMIZE_SIZE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #disassemble(boolean) disassemble}. */
    public static void ndisassemble(long struct, boolean value) { memPutByte(struct + GLSLangSPVOptions.DISASSEMBLE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #validate(boolean) validate}. */
    public static void nvalidate(long struct, boolean value) { memPutByte(struct + GLSLangSPVOptions.VALIDATE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #emit_nonsemantic_shader_debug_info(boolean) emit_nonsemantic_shader_debug_info}. */
    public static void nemit_nonsemantic_shader_debug_info(long struct, boolean value) { memPutByte(struct + GLSLangSPVOptions.EMIT_NONSEMANTIC_SHADER_DEBUG_INFO, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #emit_nonsemantic_shader_debug_source(boolean) emit_nonsemantic_shader_debug_source}. */
    public static void nemit_nonsemantic_shader_debug_source(long struct, boolean value) { memPutByte(struct + GLSLangSPVOptions.EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #compile_only(boolean) compile_only}. */
    public static void ncompile_only(long struct, boolean value) { memPutByte(struct + GLSLangSPVOptions.COMPILE_ONLY, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #optimize_allow_expanded_id_bound(boolean) optimize_allow_expanded_id_bound}. */
    public static void noptimize_allow_expanded_id_bound(long struct, boolean value) { memPutByte(struct + GLSLangSPVOptions.OPTIMIZE_ALLOW_EXPANDED_ID_BOUND, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link GLSLangSPVOptions} structs. */
    public static class Buffer extends StructBuffer<GLSLangSPVOptions, Buffer> implements NativeResource {

        private static final GLSLangSPVOptions ELEMENT_FACTORY = GLSLangSPVOptions.create(-1L);

        /**
         * Creates a new {@code GLSLangSPVOptions.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLSLangSPVOptions#SIZEOF}, and its mark will be undefined.</p>
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
        protected GLSLangSPVOptions getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code generate_debug_info} field. */
        @NativeType("bool")
        public boolean generate_debug_info() { return GLSLangSPVOptions.ngenerate_debug_info(address()); }
        /** @return the value of the {@code strip_debug_info} field. */
        @NativeType("bool")
        public boolean strip_debug_info() { return GLSLangSPVOptions.nstrip_debug_info(address()); }
        /** @return the value of the {@code disable_optimizer} field. */
        @NativeType("bool")
        public boolean disable_optimizer() { return GLSLangSPVOptions.ndisable_optimizer(address()); }
        /** @return the value of the {@code optimize_size} field. */
        @NativeType("bool")
        public boolean optimize_size() { return GLSLangSPVOptions.noptimize_size(address()); }
        /** @return the value of the {@code disassemble} field. */
        @NativeType("bool")
        public boolean disassemble() { return GLSLangSPVOptions.ndisassemble(address()); }
        /** @return the value of the {@code validate} field. */
        @NativeType("bool")
        public boolean validate() { return GLSLangSPVOptions.nvalidate(address()); }
        /** @return the value of the {@code emit_nonsemantic_shader_debug_info} field. */
        @NativeType("bool")
        public boolean emit_nonsemantic_shader_debug_info() { return GLSLangSPVOptions.nemit_nonsemantic_shader_debug_info(address()); }
        /** @return the value of the {@code emit_nonsemantic_shader_debug_source} field. */
        @NativeType("bool")
        public boolean emit_nonsemantic_shader_debug_source() { return GLSLangSPVOptions.nemit_nonsemantic_shader_debug_source(address()); }
        /** @return the value of the {@code compile_only} field. */
        @NativeType("bool")
        public boolean compile_only() { return GLSLangSPVOptions.ncompile_only(address()); }
        /** @return the value of the {@code optimize_allow_expanded_id_bound} field. */
        @NativeType("bool")
        public boolean optimize_allow_expanded_id_bound() { return GLSLangSPVOptions.noptimize_allow_expanded_id_bound(address()); }

        /** Sets the specified value to the {@code generate_debug_info} field. */
        public GLSLangSPVOptions.Buffer generate_debug_info(@NativeType("bool") boolean value) { GLSLangSPVOptions.ngenerate_debug_info(address(), value); return this; }
        /** Sets the specified value to the {@code strip_debug_info} field. */
        public GLSLangSPVOptions.Buffer strip_debug_info(@NativeType("bool") boolean value) { GLSLangSPVOptions.nstrip_debug_info(address(), value); return this; }
        /** Sets the specified value to the {@code disable_optimizer} field. */
        public GLSLangSPVOptions.Buffer disable_optimizer(@NativeType("bool") boolean value) { GLSLangSPVOptions.ndisable_optimizer(address(), value); return this; }
        /** Sets the specified value to the {@code optimize_size} field. */
        public GLSLangSPVOptions.Buffer optimize_size(@NativeType("bool") boolean value) { GLSLangSPVOptions.noptimize_size(address(), value); return this; }
        /** Sets the specified value to the {@code disassemble} field. */
        public GLSLangSPVOptions.Buffer disassemble(@NativeType("bool") boolean value) { GLSLangSPVOptions.ndisassemble(address(), value); return this; }
        /** Sets the specified value to the {@code validate} field. */
        public GLSLangSPVOptions.Buffer validate(@NativeType("bool") boolean value) { GLSLangSPVOptions.nvalidate(address(), value); return this; }
        /** Sets the specified value to the {@code emit_nonsemantic_shader_debug_info} field. */
        public GLSLangSPVOptions.Buffer emit_nonsemantic_shader_debug_info(@NativeType("bool") boolean value) { GLSLangSPVOptions.nemit_nonsemantic_shader_debug_info(address(), value); return this; }
        /** Sets the specified value to the {@code emit_nonsemantic_shader_debug_source} field. */
        public GLSLangSPVOptions.Buffer emit_nonsemantic_shader_debug_source(@NativeType("bool") boolean value) { GLSLangSPVOptions.nemit_nonsemantic_shader_debug_source(address(), value); return this; }
        /** Sets the specified value to the {@code compile_only} field. */
        public GLSLangSPVOptions.Buffer compile_only(@NativeType("bool") boolean value) { GLSLangSPVOptions.ncompile_only(address(), value); return this; }
        /** Sets the specified value to the {@code optimize_allow_expanded_id_bound} field. */
        public GLSLangSPVOptions.Buffer optimize_allow_expanded_id_bound(@NativeType("bool") boolean value) { GLSLangSPVOptions.noptimize_allow_expanded_id_bound(address(), value); return this; }

    }

}