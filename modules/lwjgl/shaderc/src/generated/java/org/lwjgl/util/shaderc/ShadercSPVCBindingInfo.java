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
 * struct shaderc_spvc_binding_info {
 *     uint32_t set;
 *     uint32_t binding;
 *     uint32_t id;
 *     uint32_t base_type_id;
 *     shaderc_spvc_binding_type binding_type;
 *     shaderc_spvc_texture_view_dimension texture_dimension;
 *     shaderc_spvc_texture_format_type texture_component_type;
 *     bool multisampled;
 * }</code></pre>
 */
@NativeType("struct shaderc_spvc_binding_info")
public class ShadercSPVCBindingInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SET,
        BINDING,
        ID,
        BASE_TYPE_ID,
        BINDING_TYPE,
        TEXTURE_DIMENSION,
        TEXTURE_COMPONENT_TYPE,
        MULTISAMPLED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SET = layout.offsetof(0);
        BINDING = layout.offsetof(1);
        ID = layout.offsetof(2);
        BASE_TYPE_ID = layout.offsetof(3);
        BINDING_TYPE = layout.offsetof(4);
        TEXTURE_DIMENSION = layout.offsetof(5);
        TEXTURE_COMPONENT_TYPE = layout.offsetof(6);
        MULTISAMPLED = layout.offsetof(7);
    }

    /**
     * Creates a {@code ShadercSPVCBindingInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ShadercSPVCBindingInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code set} field. */
    @NativeType("uint32_t")
    public int set() { return nset(address()); }
    /** Returns the value of the {@code binding} field. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** Returns the value of the {@code id} field. */
    @NativeType("uint32_t")
    public int id() { return nid(address()); }
    /** Returns the value of the {@code base_type_id} field. */
    @NativeType("uint32_t")
    public int base_type_id() { return nbase_type_id(address()); }
    /** Returns the value of the {@code binding_type} field. */
    @NativeType("shaderc_spvc_binding_type")
    public int binding_type() { return nbinding_type(address()); }
    /** Returns the value of the {@code texture_dimension} field. */
    @NativeType("shaderc_spvc_texture_view_dimension")
    public int texture_dimension() { return ntexture_dimension(address()); }
    /** Returns the value of the {@code texture_component_type} field. */
    @NativeType("shaderc_spvc_texture_format_type")
    public int texture_component_type() { return ntexture_component_type(address()); }
    /** Returns the value of the {@code multisampled} field. */
    @NativeType("bool")
    public boolean multisampled() { return nmultisampled(address()); }

    // -----------------------------------

    /** Returns a new {@code ShadercSPVCBindingInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ShadercSPVCBindingInfo malloc() {
        return wrap(ShadercSPVCBindingInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ShadercSPVCBindingInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ShadercSPVCBindingInfo calloc() {
        return wrap(ShadercSPVCBindingInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ShadercSPVCBindingInfo} instance allocated with {@link BufferUtils}. */
    public static ShadercSPVCBindingInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ShadercSPVCBindingInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code ShadercSPVCBindingInfo} instance for the specified memory address. */
    public static ShadercSPVCBindingInfo create(long address) {
        return wrap(ShadercSPVCBindingInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercSPVCBindingInfo createSafe(long address) {
        return address == NULL ? null : wrap(ShadercSPVCBindingInfo.class, address);
    }

    /**
     * Returns a new {@link ShadercSPVCBindingInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCBindingInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCBindingInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCBindingInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCBindingInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCBindingInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ShadercSPVCBindingInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCBindingInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercSPVCBindingInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code ShadercSPVCBindingInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static ShadercSPVCBindingInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ShadercSPVCBindingInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ShadercSPVCBindingInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ShadercSPVCBindingInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercSPVCBindingInfo mallocStack(MemoryStack stack) {
        return wrap(ShadercSPVCBindingInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ShadercSPVCBindingInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercSPVCBindingInfo callocStack(MemoryStack stack) {
        return wrap(ShadercSPVCBindingInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ShadercSPVCBindingInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCBindingInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercSPVCBindingInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCBindingInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercSPVCBindingInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCBindingInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCBindingInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCBindingInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #set}. */
    public static int nset(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCBindingInfo.SET); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCBindingInfo.BINDING); }
    /** Unsafe version of {@link #id}. */
    public static int nid(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCBindingInfo.ID); }
    /** Unsafe version of {@link #base_type_id}. */
    public static int nbase_type_id(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCBindingInfo.BASE_TYPE_ID); }
    /** Unsafe version of {@link #binding_type}. */
    public static int nbinding_type(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCBindingInfo.BINDING_TYPE); }
    /** Unsafe version of {@link #texture_dimension}. */
    public static int ntexture_dimension(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCBindingInfo.TEXTURE_DIMENSION); }
    /** Unsafe version of {@link #texture_component_type}. */
    public static int ntexture_component_type(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCBindingInfo.TEXTURE_COMPONENT_TYPE); }
    /** Unsafe version of {@link #multisampled}. */
    public static boolean nmultisampled(long struct) { return UNSAFE.getByte(null, struct + ShadercSPVCBindingInfo.MULTISAMPLED) != 0; }

    // -----------------------------------

    /** An array of {@link ShadercSPVCBindingInfo} structs. */
    public static class Buffer extends StructBuffer<ShadercSPVCBindingInfo, Buffer> implements NativeResource {

        private static final ShadercSPVCBindingInfo ELEMENT_FACTORY = ShadercSPVCBindingInfo.create(-1L);

        /**
         * Creates a new {@code ShadercSPVCBindingInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ShadercSPVCBindingInfo#SIZEOF}, and its mark will be undefined.
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
        protected ShadercSPVCBindingInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code set} field. */
        @NativeType("uint32_t")
        public int set() { return ShadercSPVCBindingInfo.nset(address()); }
        /** Returns the value of the {@code binding} field. */
        @NativeType("uint32_t")
        public int binding() { return ShadercSPVCBindingInfo.nbinding(address()); }
        /** Returns the value of the {@code id} field. */
        @NativeType("uint32_t")
        public int id() { return ShadercSPVCBindingInfo.nid(address()); }
        /** Returns the value of the {@code base_type_id} field. */
        @NativeType("uint32_t")
        public int base_type_id() { return ShadercSPVCBindingInfo.nbase_type_id(address()); }
        /** Returns the value of the {@code binding_type} field. */
        @NativeType("shaderc_spvc_binding_type")
        public int binding_type() { return ShadercSPVCBindingInfo.nbinding_type(address()); }
        /** Returns the value of the {@code texture_dimension} field. */
        @NativeType("shaderc_spvc_texture_view_dimension")
        public int texture_dimension() { return ShadercSPVCBindingInfo.ntexture_dimension(address()); }
        /** Returns the value of the {@code texture_component_type} field. */
        @NativeType("shaderc_spvc_texture_format_type")
        public int texture_component_type() { return ShadercSPVCBindingInfo.ntexture_component_type(address()); }
        /** Returns the value of the {@code multisampled} field. */
        @NativeType("bool")
        public boolean multisampled() { return ShadercSPVCBindingInfo.nmultisampled(address()); }

    }

}