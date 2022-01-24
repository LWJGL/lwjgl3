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
 * Matches the binding index of a MSL resource for a binding within a descriptor set.
 * 
 * <p>Taken together, the {@code stage}, {@code desc_set} and {@code binding} combine to form a reference to a resource descriptor used in a particular
 * shading stage. If using MSL 2.0 argument buffers, the descriptor set is not marked as a discrete descriptor set, and (for iOS only) the resource is not
 * a storage image ({@code sampled != 2}), the binding reference we remap to will become an {@code [[id(N)]]} attribute within the "descriptor set"
 * argument buffer structure. For resources which are bound in the "classic" MSL 1.0 way or discrete descriptors, the remap will become a
 * {@code [[buffer(N)]]}, {@code [[texture(N)]]} or {@code [[sampler(N)]]} depending on the resource types used.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct spvc_msl_resource_binding {
 *     SpvExecutionModel stage;
 *     unsigned int desc_set;
 *     unsigned int binding;
 *     unsigned int msl_buffer;
 *     unsigned int msl_texture;
 *     unsigned int msl_sampler;
 * }</code></pre>
 */
@NativeType("struct spvc_msl_resource_binding")
public class SpvcMslResourceBinding extends Struct implements NativeResource {

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
     * Creates a {@code SpvcMslResourceBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcMslResourceBinding(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code stage} field. */
    @NativeType("SpvExecutionModel")
    public int stage() { return nstage(address()); }
    /** @return the value of the {@code desc_set} field. */
    @NativeType("unsigned int")
    public int desc_set() { return ndesc_set(address()); }
    /** @return the value of the {@code binding} field. */
    @NativeType("unsigned int")
    public int binding() { return nbinding(address()); }
    /** @return the value of the {@code msl_buffer} field. */
    @NativeType("unsigned int")
    public int msl_buffer() { return nmsl_buffer(address()); }
    /** @return the value of the {@code msl_texture} field. */
    @NativeType("unsigned int")
    public int msl_texture() { return nmsl_texture(address()); }
    /** @return the value of the {@code msl_sampler} field. */
    @NativeType("unsigned int")
    public int msl_sampler() { return nmsl_sampler(address()); }

    /** Sets the specified value to the {@code stage} field. */
    public SpvcMslResourceBinding stage(@NativeType("SpvExecutionModel") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@code desc_set} field. */
    public SpvcMslResourceBinding desc_set(@NativeType("unsigned int") int value) { ndesc_set(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public SpvcMslResourceBinding binding(@NativeType("unsigned int") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code msl_buffer} field. */
    public SpvcMslResourceBinding msl_buffer(@NativeType("unsigned int") int value) { nmsl_buffer(address(), value); return this; }
    /** Sets the specified value to the {@code msl_texture} field. */
    public SpvcMslResourceBinding msl_texture(@NativeType("unsigned int") int value) { nmsl_texture(address(), value); return this; }
    /** Sets the specified value to the {@code msl_sampler} field. */
    public SpvcMslResourceBinding msl_sampler(@NativeType("unsigned int") int value) { nmsl_sampler(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcMslResourceBinding set(
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
    public SpvcMslResourceBinding set(SpvcMslResourceBinding src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcMslResourceBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcMslResourceBinding malloc() {
        return wrap(SpvcMslResourceBinding.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SpvcMslResourceBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcMslResourceBinding calloc() {
        return wrap(SpvcMslResourceBinding.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SpvcMslResourceBinding} instance allocated with {@link BufferUtils}. */
    public static SpvcMslResourceBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SpvcMslResourceBinding.class, memAddress(container), container);
    }

    /** Returns a new {@code SpvcMslResourceBinding} instance for the specified memory address. */
    public static SpvcMslResourceBinding create(long address) {
        return wrap(SpvcMslResourceBinding.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslResourceBinding createSafe(long address) {
        return address == NULL ? null : wrap(SpvcMslResourceBinding.class, address);
    }

    /**
     * Returns a new {@link SpvcMslResourceBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcMslResourceBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslResourceBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SpvcMslResourceBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslResourceBinding.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code SpvcMslResourceBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslResourceBinding malloc(MemoryStack stack) {
        return wrap(SpvcMslResourceBinding.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SpvcMslResourceBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslResourceBinding calloc(MemoryStack stack) {
        return wrap(SpvcMslResourceBinding.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpvcMslResourceBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslResourceBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return UNSAFE.getInt(null, struct + SpvcMslResourceBinding.STAGE); }
    /** Unsafe version of {@link #desc_set}. */
    public static int ndesc_set(long struct) { return UNSAFE.getInt(null, struct + SpvcMslResourceBinding.DESC_SET); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return UNSAFE.getInt(null, struct + SpvcMslResourceBinding.BINDING); }
    /** Unsafe version of {@link #msl_buffer}. */
    public static int nmsl_buffer(long struct) { return UNSAFE.getInt(null, struct + SpvcMslResourceBinding.MSL_BUFFER); }
    /** Unsafe version of {@link #msl_texture}. */
    public static int nmsl_texture(long struct) { return UNSAFE.getInt(null, struct + SpvcMslResourceBinding.MSL_TEXTURE); }
    /** Unsafe version of {@link #msl_sampler}. */
    public static int nmsl_sampler(long struct) { return UNSAFE.getInt(null, struct + SpvcMslResourceBinding.MSL_SAMPLER); }

    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslResourceBinding.STAGE, value); }
    /** Unsafe version of {@link #desc_set(int) desc_set}. */
    public static void ndesc_set(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslResourceBinding.DESC_SET, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslResourceBinding.BINDING, value); }
    /** Unsafe version of {@link #msl_buffer(int) msl_buffer}. */
    public static void nmsl_buffer(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslResourceBinding.MSL_BUFFER, value); }
    /** Unsafe version of {@link #msl_texture(int) msl_texture}. */
    public static void nmsl_texture(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslResourceBinding.MSL_TEXTURE, value); }
    /** Unsafe version of {@link #msl_sampler(int) msl_sampler}. */
    public static void nmsl_sampler(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslResourceBinding.MSL_SAMPLER, value); }

    // -----------------------------------

    /** An array of {@link SpvcMslResourceBinding} structs. */
    public static class Buffer extends StructBuffer<SpvcMslResourceBinding, Buffer> implements NativeResource {

        private static final SpvcMslResourceBinding ELEMENT_FACTORY = SpvcMslResourceBinding.create(-1L);

        /**
         * Creates a new {@code SpvcMslResourceBinding.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcMslResourceBinding#SIZEOF}, and its mark will be undefined.
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
        protected SpvcMslResourceBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code stage} field. */
        @NativeType("SpvExecutionModel")
        public int stage() { return SpvcMslResourceBinding.nstage(address()); }
        /** @return the value of the {@code desc_set} field. */
        @NativeType("unsigned int")
        public int desc_set() { return SpvcMslResourceBinding.ndesc_set(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("unsigned int")
        public int binding() { return SpvcMslResourceBinding.nbinding(address()); }
        /** @return the value of the {@code msl_buffer} field. */
        @NativeType("unsigned int")
        public int msl_buffer() { return SpvcMslResourceBinding.nmsl_buffer(address()); }
        /** @return the value of the {@code msl_texture} field. */
        @NativeType("unsigned int")
        public int msl_texture() { return SpvcMslResourceBinding.nmsl_texture(address()); }
        /** @return the value of the {@code msl_sampler} field. */
        @NativeType("unsigned int")
        public int msl_sampler() { return SpvcMslResourceBinding.nmsl_sampler(address()); }

        /** Sets the specified value to the {@code stage} field. */
        public SpvcMslResourceBinding.Buffer stage(@NativeType("SpvExecutionModel") int value) { SpvcMslResourceBinding.nstage(address(), value); return this; }
        /** Sets the specified value to the {@code desc_set} field. */
        public SpvcMslResourceBinding.Buffer desc_set(@NativeType("unsigned int") int value) { SpvcMslResourceBinding.ndesc_set(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public SpvcMslResourceBinding.Buffer binding(@NativeType("unsigned int") int value) { SpvcMslResourceBinding.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code msl_buffer} field. */
        public SpvcMslResourceBinding.Buffer msl_buffer(@NativeType("unsigned int") int value) { SpvcMslResourceBinding.nmsl_buffer(address(), value); return this; }
        /** Sets the specified value to the {@code msl_texture} field. */
        public SpvcMslResourceBinding.Buffer msl_texture(@NativeType("unsigned int") int value) { SpvcMslResourceBinding.nmsl_texture(address(), value); return this; }
        /** Sets the specified value to the {@code msl_sampler} field. */
        public SpvcMslResourceBinding.Buffer msl_sampler(@NativeType("unsigned int") int value) { SpvcMslResourceBinding.nmsl_sampler(address(), value); return this; }

    }

}