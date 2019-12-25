/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

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
 * struct shaderc_spvc_msl_resource_binding {
 *     shaderc_spvc_execution_model stage;
 *     uint32_t desc_set;
 *     uint32_t binding;
 *     uint32_t msl_buffer;
 *     uint32_t msl_texture;
 *     uint32_t msl_sampler;
 * }</code></pre>
 */
@NativeType("struct shaderc_spvc_msl_resource_binding")
public class ShadercSPVCMSLResourceBinding extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STAGE,
        DESC_SET,
        BINDING,
        MSL_BUFFER,
        MSL_TEXTURE,
        MSL_SAMPLER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STAGE = layout.offsetof(0);
        DESC_SET = layout.offsetof(1);
        BINDING = layout.offsetof(2);
        MSL_BUFFER = layout.offsetof(3);
        MSL_TEXTURE = layout.offsetof(4);
        MSL_SAMPLER = layout.offsetof(5);
    }

    /**
     * Creates a {@code ShadercSPVCMSLResourceBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ShadercSPVCMSLResourceBinding(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code stage} field. */
    @NativeType("shaderc_spvc_execution_model")
    public int stage() { return nstage(address()); }
    /** Returns the value of the {@code desc_set} field. */
    @NativeType("uint32_t")
    public int desc_set() { return ndesc_set(address()); }
    /** Returns the value of the {@code binding} field. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** Returns the value of the {@code msl_buffer} field. */
    @NativeType("uint32_t")
    public int msl_buffer() { return nmsl_buffer(address()); }
    /** Returns the value of the {@code msl_texture} field. */
    @NativeType("uint32_t")
    public int msl_texture() { return nmsl_texture(address()); }
    /** Returns the value of the {@code msl_sampler} field. */
    @NativeType("uint32_t")
    public int msl_sampler() { return nmsl_sampler(address()); }

    /** Sets the specified value to the {@code stage} field. */
    public ShadercSPVCMSLResourceBinding stage(@NativeType("shaderc_spvc_execution_model") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@code desc_set} field. */
    public ShadercSPVCMSLResourceBinding desc_set(@NativeType("uint32_t") int value) { ndesc_set(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public ShadercSPVCMSLResourceBinding binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code msl_buffer} field. */
    public ShadercSPVCMSLResourceBinding msl_buffer(@NativeType("uint32_t") int value) { nmsl_buffer(address(), value); return this; }
    /** Sets the specified value to the {@code msl_texture} field. */
    public ShadercSPVCMSLResourceBinding msl_texture(@NativeType("uint32_t") int value) { nmsl_texture(address(), value); return this; }
    /** Sets the specified value to the {@code msl_sampler} field. */
    public ShadercSPVCMSLResourceBinding msl_sampler(@NativeType("uint32_t") int value) { nmsl_sampler(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ShadercSPVCMSLResourceBinding set(
        int stage,
        int desc_set,
        int binding,
        int msl_buffer,
        int msl_texture,
        int msl_sampler
    ) {
        stage(stage);
        desc_set(desc_set);
        binding(binding);
        msl_buffer(msl_buffer);
        msl_texture(msl_texture);
        msl_sampler(msl_sampler);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ShadercSPVCMSLResourceBinding set(ShadercSPVCMSLResourceBinding src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ShadercSPVCMSLResourceBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ShadercSPVCMSLResourceBinding malloc() {
        return wrap(ShadercSPVCMSLResourceBinding.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ShadercSPVCMSLResourceBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ShadercSPVCMSLResourceBinding calloc() {
        return wrap(ShadercSPVCMSLResourceBinding.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ShadercSPVCMSLResourceBinding} instance allocated with {@link BufferUtils}. */
    public static ShadercSPVCMSLResourceBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ShadercSPVCMSLResourceBinding.class, memAddress(container), container);
    }

    /** Returns a new {@code ShadercSPVCMSLResourceBinding} instance for the specified memory address. */
    public static ShadercSPVCMSLResourceBinding create(long address) {
        return wrap(ShadercSPVCMSLResourceBinding.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercSPVCMSLResourceBinding createSafe(long address) {
        return address == NULL ? null : wrap(ShadercSPVCMSLResourceBinding.class, address);
    }

    /**
     * Returns a new {@link ShadercSPVCMSLResourceBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCMSLResourceBinding.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCMSLResourceBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCMSLResourceBinding.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCMSLResourceBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCMSLResourceBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ShadercSPVCMSLResourceBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCMSLResourceBinding.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercSPVCMSLResourceBinding.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code ShadercSPVCMSLResourceBinding} instance allocated on the thread-local {@link MemoryStack}. */
    public static ShadercSPVCMSLResourceBinding mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ShadercSPVCMSLResourceBinding} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ShadercSPVCMSLResourceBinding callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ShadercSPVCMSLResourceBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercSPVCMSLResourceBinding mallocStack(MemoryStack stack) {
        return wrap(ShadercSPVCMSLResourceBinding.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ShadercSPVCMSLResourceBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercSPVCMSLResourceBinding callocStack(MemoryStack stack) {
        return wrap(ShadercSPVCMSLResourceBinding.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ShadercSPVCMSLResourceBinding.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCMSLResourceBinding.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercSPVCMSLResourceBinding.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCMSLResourceBinding.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercSPVCMSLResourceBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCMSLResourceBinding.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCMSLResourceBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCMSLResourceBinding.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCMSLResourceBinding.STAGE); }
    /** Unsafe version of {@link #desc_set}. */
    public static int ndesc_set(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCMSLResourceBinding.DESC_SET); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCMSLResourceBinding.BINDING); }
    /** Unsafe version of {@link #msl_buffer}. */
    public static int nmsl_buffer(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCMSLResourceBinding.MSL_BUFFER); }
    /** Unsafe version of {@link #msl_texture}. */
    public static int nmsl_texture(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCMSLResourceBinding.MSL_TEXTURE); }
    /** Unsafe version of {@link #msl_sampler}. */
    public static int nmsl_sampler(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCMSLResourceBinding.MSL_SAMPLER); }

    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { UNSAFE.putInt(null, struct + ShadercSPVCMSLResourceBinding.STAGE, value); }
    /** Unsafe version of {@link #desc_set(int) desc_set}. */
    public static void ndesc_set(long struct, int value) { UNSAFE.putInt(null, struct + ShadercSPVCMSLResourceBinding.DESC_SET, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { UNSAFE.putInt(null, struct + ShadercSPVCMSLResourceBinding.BINDING, value); }
    /** Unsafe version of {@link #msl_buffer(int) msl_buffer}. */
    public static void nmsl_buffer(long struct, int value) { UNSAFE.putInt(null, struct + ShadercSPVCMSLResourceBinding.MSL_BUFFER, value); }
    /** Unsafe version of {@link #msl_texture(int) msl_texture}. */
    public static void nmsl_texture(long struct, int value) { UNSAFE.putInt(null, struct + ShadercSPVCMSLResourceBinding.MSL_TEXTURE, value); }
    /** Unsafe version of {@link #msl_sampler(int) msl_sampler}. */
    public static void nmsl_sampler(long struct, int value) { UNSAFE.putInt(null, struct + ShadercSPVCMSLResourceBinding.MSL_SAMPLER, value); }

    // -----------------------------------

    /** An array of {@link ShadercSPVCMSLResourceBinding} structs. */
    public static class Buffer extends StructBuffer<ShadercSPVCMSLResourceBinding, Buffer> implements NativeResource {

        private static final ShadercSPVCMSLResourceBinding ELEMENT_FACTORY = ShadercSPVCMSLResourceBinding.create(-1L);

        /**
         * Creates a new {@code ShadercSPVCMSLResourceBinding.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ShadercSPVCMSLResourceBinding#SIZEOF}, and its mark will be undefined.
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
        protected ShadercSPVCMSLResourceBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code stage} field. */
        @NativeType("shaderc_spvc_execution_model")
        public int stage() { return ShadercSPVCMSLResourceBinding.nstage(address()); }
        /** Returns the value of the {@code desc_set} field. */
        @NativeType("uint32_t")
        public int desc_set() { return ShadercSPVCMSLResourceBinding.ndesc_set(address()); }
        /** Returns the value of the {@code binding} field. */
        @NativeType("uint32_t")
        public int binding() { return ShadercSPVCMSLResourceBinding.nbinding(address()); }
        /** Returns the value of the {@code msl_buffer} field. */
        @NativeType("uint32_t")
        public int msl_buffer() { return ShadercSPVCMSLResourceBinding.nmsl_buffer(address()); }
        /** Returns the value of the {@code msl_texture} field. */
        @NativeType("uint32_t")
        public int msl_texture() { return ShadercSPVCMSLResourceBinding.nmsl_texture(address()); }
        /** Returns the value of the {@code msl_sampler} field. */
        @NativeType("uint32_t")
        public int msl_sampler() { return ShadercSPVCMSLResourceBinding.nmsl_sampler(address()); }

        /** Sets the specified value to the {@code stage} field. */
        public ShadercSPVCMSLResourceBinding.Buffer stage(@NativeType("shaderc_spvc_execution_model") int value) { ShadercSPVCMSLResourceBinding.nstage(address(), value); return this; }
        /** Sets the specified value to the {@code desc_set} field. */
        public ShadercSPVCMSLResourceBinding.Buffer desc_set(@NativeType("uint32_t") int value) { ShadercSPVCMSLResourceBinding.ndesc_set(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public ShadercSPVCMSLResourceBinding.Buffer binding(@NativeType("uint32_t") int value) { ShadercSPVCMSLResourceBinding.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code msl_buffer} field. */
        public ShadercSPVCMSLResourceBinding.Buffer msl_buffer(@NativeType("uint32_t") int value) { ShadercSPVCMSLResourceBinding.nmsl_buffer(address(), value); return this; }
        /** Sets the specified value to the {@code msl_texture} field. */
        public ShadercSPVCMSLResourceBinding.Buffer msl_texture(@NativeType("uint32_t") int value) { ShadercSPVCMSLResourceBinding.nmsl_texture(address(), value); return this; }
        /** Sets the specified value to the {@code msl_sampler} field. */
        public ShadercSPVCMSLResourceBinding.Buffer msl_sampler(@NativeType("uint32_t") int value) { ShadercSPVCMSLResourceBinding.nmsl_sampler(address(), value); return this; }

    }

}