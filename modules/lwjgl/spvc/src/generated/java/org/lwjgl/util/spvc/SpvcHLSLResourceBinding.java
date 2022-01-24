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
 * struct spvc_hlsl_resource_binding {
 *     SpvExecutionModel stage;
 *     unsigned desc_set;
 *     unsigned binding;
 *     {@link SpvcHLSLResourceBindingMapping spvc_hlsl_resource_binding_mapping} cbv;
 *     {@link SpvcHLSLResourceBindingMapping spvc_hlsl_resource_binding_mapping} uav;
 *     {@link SpvcHLSLResourceBindingMapping spvc_hlsl_resource_binding_mapping} srv;
 *     {@link SpvcHLSLResourceBindingMapping spvc_hlsl_resource_binding_mapping} sampler;
 * }</code></pre>
 */
@NativeType("struct spvc_hlsl_resource_binding")
public class SpvcHLSLResourceBinding extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STAGE,
        DESC_SET,
        BINDING,
        CBV,
        UAV,
        SRV,
        SAMPLER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(SpvcHLSLResourceBindingMapping.SIZEOF, SpvcHLSLResourceBindingMapping.ALIGNOF),
            __member(SpvcHLSLResourceBindingMapping.SIZEOF, SpvcHLSLResourceBindingMapping.ALIGNOF),
            __member(SpvcHLSLResourceBindingMapping.SIZEOF, SpvcHLSLResourceBindingMapping.ALIGNOF),
            __member(SpvcHLSLResourceBindingMapping.SIZEOF, SpvcHLSLResourceBindingMapping.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STAGE = layout.offsetof(0);
        DESC_SET = layout.offsetof(1);
        BINDING = layout.offsetof(2);
        CBV = layout.offsetof(3);
        UAV = layout.offsetof(4);
        SRV = layout.offsetof(5);
        SAMPLER = layout.offsetof(6);
    }

    /**
     * Creates a {@code SpvcHLSLResourceBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcHLSLResourceBinding(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code stage} field. */
    @NativeType("SpvExecutionModel")
    public int stage() { return nstage(address()); }
    /** @return the value of the {@code desc_set} field. */
    @NativeType("unsigned")
    public int desc_set() { return ndesc_set(address()); }
    /** @return the value of the {@code binding} field. */
    @NativeType("unsigned")
    public int binding() { return nbinding(address()); }
    /** @return a {@link SpvcHLSLResourceBindingMapping} view of the {@code cbv} field. */
    @NativeType("spvc_hlsl_resource_binding_mapping")
    public SpvcHLSLResourceBindingMapping cbv() { return ncbv(address()); }
    /** @return a {@link SpvcHLSLResourceBindingMapping} view of the {@code uav} field. */
    @NativeType("spvc_hlsl_resource_binding_mapping")
    public SpvcHLSLResourceBindingMapping uav() { return nuav(address()); }
    /** @return a {@link SpvcHLSLResourceBindingMapping} view of the {@code srv} field. */
    @NativeType("spvc_hlsl_resource_binding_mapping")
    public SpvcHLSLResourceBindingMapping srv() { return nsrv(address()); }
    /** @return a {@link SpvcHLSLResourceBindingMapping} view of the {@code sampler} field. */
    @NativeType("spvc_hlsl_resource_binding_mapping")
    public SpvcHLSLResourceBindingMapping sampler() { return nsampler(address()); }

    /** Sets the specified value to the {@code stage} field. */
    public SpvcHLSLResourceBinding stage(@NativeType("SpvExecutionModel") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@code desc_set} field. */
    public SpvcHLSLResourceBinding desc_set(@NativeType("unsigned") int value) { ndesc_set(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public SpvcHLSLResourceBinding binding(@NativeType("unsigned") int value) { nbinding(address(), value); return this; }
    /** Copies the specified {@link SpvcHLSLResourceBindingMapping} to the {@code cbv} field. */
    public SpvcHLSLResourceBinding cbv(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) { ncbv(address(), value); return this; }
    /** Passes the {@code cbv} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SpvcHLSLResourceBinding cbv(java.util.function.Consumer<SpvcHLSLResourceBindingMapping> consumer) { consumer.accept(cbv()); return this; }
    /** Copies the specified {@link SpvcHLSLResourceBindingMapping} to the {@code uav} field. */
    public SpvcHLSLResourceBinding uav(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) { nuav(address(), value); return this; }
    /** Passes the {@code uav} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SpvcHLSLResourceBinding uav(java.util.function.Consumer<SpvcHLSLResourceBindingMapping> consumer) { consumer.accept(uav()); return this; }
    /** Copies the specified {@link SpvcHLSLResourceBindingMapping} to the {@code srv} field. */
    public SpvcHLSLResourceBinding srv(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) { nsrv(address(), value); return this; }
    /** Passes the {@code srv} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SpvcHLSLResourceBinding srv(java.util.function.Consumer<SpvcHLSLResourceBindingMapping> consumer) { consumer.accept(srv()); return this; }
    /** Copies the specified {@link SpvcHLSLResourceBindingMapping} to the {@code sampler} field. */
    public SpvcHLSLResourceBinding sampler(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) { nsampler(address(), value); return this; }
    /** Passes the {@code sampler} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SpvcHLSLResourceBinding sampler(java.util.function.Consumer<SpvcHLSLResourceBindingMapping> consumer) { consumer.accept(sampler()); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcHLSLResourceBinding set(
        int stage,
        int desc_set,
        int binding,
        SpvcHLSLResourceBindingMapping cbv,
        SpvcHLSLResourceBindingMapping uav,
        SpvcHLSLResourceBindingMapping srv,
        SpvcHLSLResourceBindingMapping sampler
    ) {
        stage(stage);
        desc_set(desc_set);
        binding(binding);
        cbv(cbv);
        uav(uav);
        srv(srv);
        sampler(sampler);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcHLSLResourceBinding set(SpvcHLSLResourceBinding src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcHLSLResourceBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcHLSLResourceBinding malloc() {
        return wrap(SpvcHLSLResourceBinding.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SpvcHLSLResourceBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcHLSLResourceBinding calloc() {
        return wrap(SpvcHLSLResourceBinding.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SpvcHLSLResourceBinding} instance allocated with {@link BufferUtils}. */
    public static SpvcHLSLResourceBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SpvcHLSLResourceBinding.class, memAddress(container), container);
    }

    /** Returns a new {@code SpvcHLSLResourceBinding} instance for the specified memory address. */
    public static SpvcHLSLResourceBinding create(long address) {
        return wrap(SpvcHLSLResourceBinding.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcHLSLResourceBinding createSafe(long address) {
        return address == NULL ? null : wrap(SpvcHLSLResourceBinding.class, address);
    }

    /**
     * Returns a new {@link SpvcHLSLResourceBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBinding.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcHLSLResourceBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBinding.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcHLSLResourceBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SpvcHLSLResourceBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBinding.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcHLSLResourceBinding.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code SpvcHLSLResourceBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcHLSLResourceBinding malloc(MemoryStack stack) {
        return wrap(SpvcHLSLResourceBinding.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SpvcHLSLResourceBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcHLSLResourceBinding calloc(MemoryStack stack) {
        return wrap(SpvcHLSLResourceBinding.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpvcHLSLResourceBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBinding.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcHLSLResourceBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcHLSLResourceBinding.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return UNSAFE.getInt(null, struct + SpvcHLSLResourceBinding.STAGE); }
    /** Unsafe version of {@link #desc_set}. */
    public static int ndesc_set(long struct) { return UNSAFE.getInt(null, struct + SpvcHLSLResourceBinding.DESC_SET); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return UNSAFE.getInt(null, struct + SpvcHLSLResourceBinding.BINDING); }
    /** Unsafe version of {@link #cbv}. */
    public static SpvcHLSLResourceBindingMapping ncbv(long struct) { return SpvcHLSLResourceBindingMapping.create(struct + SpvcHLSLResourceBinding.CBV); }
    /** Unsafe version of {@link #uav}. */
    public static SpvcHLSLResourceBindingMapping nuav(long struct) { return SpvcHLSLResourceBindingMapping.create(struct + SpvcHLSLResourceBinding.UAV); }
    /** Unsafe version of {@link #srv}. */
    public static SpvcHLSLResourceBindingMapping nsrv(long struct) { return SpvcHLSLResourceBindingMapping.create(struct + SpvcHLSLResourceBinding.SRV); }
    /** Unsafe version of {@link #sampler}. */
    public static SpvcHLSLResourceBindingMapping nsampler(long struct) { return SpvcHLSLResourceBindingMapping.create(struct + SpvcHLSLResourceBinding.SAMPLER); }

    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { UNSAFE.putInt(null, struct + SpvcHLSLResourceBinding.STAGE, value); }
    /** Unsafe version of {@link #desc_set(int) desc_set}. */
    public static void ndesc_set(long struct, int value) { UNSAFE.putInt(null, struct + SpvcHLSLResourceBinding.DESC_SET, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { UNSAFE.putInt(null, struct + SpvcHLSLResourceBinding.BINDING, value); }
    /** Unsafe version of {@link #cbv(SpvcHLSLResourceBindingMapping) cbv}. */
    public static void ncbv(long struct, SpvcHLSLResourceBindingMapping value) { memCopy(value.address(), struct + SpvcHLSLResourceBinding.CBV, SpvcHLSLResourceBindingMapping.SIZEOF); }
    /** Unsafe version of {@link #uav(SpvcHLSLResourceBindingMapping) uav}. */
    public static void nuav(long struct, SpvcHLSLResourceBindingMapping value) { memCopy(value.address(), struct + SpvcHLSLResourceBinding.UAV, SpvcHLSLResourceBindingMapping.SIZEOF); }
    /** Unsafe version of {@link #srv(SpvcHLSLResourceBindingMapping) srv}. */
    public static void nsrv(long struct, SpvcHLSLResourceBindingMapping value) { memCopy(value.address(), struct + SpvcHLSLResourceBinding.SRV, SpvcHLSLResourceBindingMapping.SIZEOF); }
    /** Unsafe version of {@link #sampler(SpvcHLSLResourceBindingMapping) sampler}. */
    public static void nsampler(long struct, SpvcHLSLResourceBindingMapping value) { memCopy(value.address(), struct + SpvcHLSLResourceBinding.SAMPLER, SpvcHLSLResourceBindingMapping.SIZEOF); }

    // -----------------------------------

    /** An array of {@link SpvcHLSLResourceBinding} structs. */
    public static class Buffer extends StructBuffer<SpvcHLSLResourceBinding, Buffer> implements NativeResource {

        private static final SpvcHLSLResourceBinding ELEMENT_FACTORY = SpvcHLSLResourceBinding.create(-1L);

        /**
         * Creates a new {@code SpvcHLSLResourceBinding.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcHLSLResourceBinding#SIZEOF}, and its mark will be undefined.
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
        protected SpvcHLSLResourceBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code stage} field. */
        @NativeType("SpvExecutionModel")
        public int stage() { return SpvcHLSLResourceBinding.nstage(address()); }
        /** @return the value of the {@code desc_set} field. */
        @NativeType("unsigned")
        public int desc_set() { return SpvcHLSLResourceBinding.ndesc_set(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("unsigned")
        public int binding() { return SpvcHLSLResourceBinding.nbinding(address()); }
        /** @return a {@link SpvcHLSLResourceBindingMapping} view of the {@code cbv} field. */
        @NativeType("spvc_hlsl_resource_binding_mapping")
        public SpvcHLSLResourceBindingMapping cbv() { return SpvcHLSLResourceBinding.ncbv(address()); }
        /** @return a {@link SpvcHLSLResourceBindingMapping} view of the {@code uav} field. */
        @NativeType("spvc_hlsl_resource_binding_mapping")
        public SpvcHLSLResourceBindingMapping uav() { return SpvcHLSLResourceBinding.nuav(address()); }
        /** @return a {@link SpvcHLSLResourceBindingMapping} view of the {@code srv} field. */
        @NativeType("spvc_hlsl_resource_binding_mapping")
        public SpvcHLSLResourceBindingMapping srv() { return SpvcHLSLResourceBinding.nsrv(address()); }
        /** @return a {@link SpvcHLSLResourceBindingMapping} view of the {@code sampler} field. */
        @NativeType("spvc_hlsl_resource_binding_mapping")
        public SpvcHLSLResourceBindingMapping sampler() { return SpvcHLSLResourceBinding.nsampler(address()); }

        /** Sets the specified value to the {@code stage} field. */
        public SpvcHLSLResourceBinding.Buffer stage(@NativeType("SpvExecutionModel") int value) { SpvcHLSLResourceBinding.nstage(address(), value); return this; }
        /** Sets the specified value to the {@code desc_set} field. */
        public SpvcHLSLResourceBinding.Buffer desc_set(@NativeType("unsigned") int value) { SpvcHLSLResourceBinding.ndesc_set(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public SpvcHLSLResourceBinding.Buffer binding(@NativeType("unsigned") int value) { SpvcHLSLResourceBinding.nbinding(address(), value); return this; }
        /** Copies the specified {@link SpvcHLSLResourceBindingMapping} to the {@code cbv} field. */
        public SpvcHLSLResourceBinding.Buffer cbv(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) { SpvcHLSLResourceBinding.ncbv(address(), value); return this; }
        /** Passes the {@code cbv} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SpvcHLSLResourceBinding.Buffer cbv(java.util.function.Consumer<SpvcHLSLResourceBindingMapping> consumer) { consumer.accept(cbv()); return this; }
        /** Copies the specified {@link SpvcHLSLResourceBindingMapping} to the {@code uav} field. */
        public SpvcHLSLResourceBinding.Buffer uav(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) { SpvcHLSLResourceBinding.nuav(address(), value); return this; }
        /** Passes the {@code uav} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SpvcHLSLResourceBinding.Buffer uav(java.util.function.Consumer<SpvcHLSLResourceBindingMapping> consumer) { consumer.accept(uav()); return this; }
        /** Copies the specified {@link SpvcHLSLResourceBindingMapping} to the {@code srv} field. */
        public SpvcHLSLResourceBinding.Buffer srv(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) { SpvcHLSLResourceBinding.nsrv(address(), value); return this; }
        /** Passes the {@code srv} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SpvcHLSLResourceBinding.Buffer srv(java.util.function.Consumer<SpvcHLSLResourceBindingMapping> consumer) { consumer.accept(srv()); return this; }
        /** Copies the specified {@link SpvcHLSLResourceBindingMapping} to the {@code sampler} field. */
        public SpvcHLSLResourceBinding.Buffer sampler(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) { SpvcHLSLResourceBinding.nsampler(address(), value); return this; }
        /** Passes the {@code sampler} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SpvcHLSLResourceBinding.Buffer sampler(java.util.function.Consumer<SpvcHLSLResourceBindingMapping> consumer) { consumer.accept(sampler()); return this; }

    }

}