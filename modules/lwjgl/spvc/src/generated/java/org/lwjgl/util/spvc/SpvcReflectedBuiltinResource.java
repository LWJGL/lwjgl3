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
 * struct spvc_reflected_builtin_resource {
 *     SpvBuiltIn {@link #builtin};
 *     spvc_type_id {@link #value_type_id};
 *     {@link SpvcReflectedResource spvc_reflected_resource} {@link #resource};
 * }</code></pre>
 */
@NativeType("struct spvc_reflected_builtin_resource")
public class SpvcReflectedBuiltinResource extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUILTIN,
        VALUE_TYPE_ID,
        RESOURCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(SpvcReflectedResource.SIZEOF, SpvcReflectedResource.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUILTIN = layout.offsetof(0);
        VALUE_TYPE_ID = layout.offsetof(1);
        RESOURCE = layout.offsetof(2);
    }

    /**
     * Creates a {@code SpvcReflectedBuiltinResource} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcReflectedBuiltinResource(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * This is mostly here to support reflection of builtins such as {@code Position/PointSize/CullDistance/ClipDistance}.
     * 
     * <p>This needs to be different from {@code Resource} since we can collect builtins from blocks. A builtin present here does not necessarily mean it's
     * considered an active builtin, since variable ID "activeness" is only tracked on {@code OpVariable} level, not {@code Block} members. For that,
     * {@link Spvc#spvc_compiler_update_active_builtins compiler_update_active_builtins} -&gt; {@link Spvc#spvc_compiler_has_active_builtin compiler_has_active_builtin} can be used to further refine the reflection.</p>
     */
    @NativeType("SpvBuiltIn")
    public int builtin() { return nbuiltin(address()); }
    /**
     * This is the actual value type of the builtin.
     * 
     * <p>Typically {@code float4}, {@code float}, {@code array<float, N>} for the {@code gl_PerVertex} builtins. If the builtin is a control point, the control
     * point array type will be stripped away here as appropriate.</p>
     */
    @NativeType("spvc_type_id")
    public int value_type_id() { return nvalue_type_id(address()); }
    /**
     * This refers to the base resource which contains the builtin.
     * 
     * <p>If resource is a {@code Block}, it can hold multiple builtins, or it might not be a block. For advanced reflection scenarios, all information in
     * builtin/{@code value_type_id} can be deduced, it's just more convenient this way.</p>
     */
    @NativeType("spvc_reflected_resource")
    public SpvcReflectedResource resource() { return nresource(address()); }

    /** Sets the specified value to the {@link #builtin} field. */
    public SpvcReflectedBuiltinResource builtin(@NativeType("SpvBuiltIn") int value) { nbuiltin(address(), value); return this; }
    /** Sets the specified value to the {@link #value_type_id} field. */
    public SpvcReflectedBuiltinResource value_type_id(@NativeType("spvc_type_id") int value) { nvalue_type_id(address(), value); return this; }
    /** Copies the specified {@link SpvcReflectedResource} to the {@link #resource} field. */
    public SpvcReflectedBuiltinResource resource(@NativeType("spvc_reflected_resource") SpvcReflectedResource value) { nresource(address(), value); return this; }
    /** Passes the {@link #resource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SpvcReflectedBuiltinResource resource(java.util.function.Consumer<SpvcReflectedResource> consumer) { consumer.accept(resource()); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcReflectedBuiltinResource set(
        int builtin,
        int value_type_id,
        SpvcReflectedResource resource
    ) {
        builtin(builtin);
        value_type_id(value_type_id);
        resource(resource);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcReflectedBuiltinResource set(SpvcReflectedBuiltinResource src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcReflectedBuiltinResource} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcReflectedBuiltinResource malloc() {
        return wrap(SpvcReflectedBuiltinResource.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SpvcReflectedBuiltinResource} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcReflectedBuiltinResource calloc() {
        return wrap(SpvcReflectedBuiltinResource.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SpvcReflectedBuiltinResource} instance allocated with {@link BufferUtils}. */
    public static SpvcReflectedBuiltinResource create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SpvcReflectedBuiltinResource.class, memAddress(container), container);
    }

    /** Returns a new {@code SpvcReflectedBuiltinResource} instance for the specified memory address. */
    public static SpvcReflectedBuiltinResource create(long address) {
        return wrap(SpvcReflectedBuiltinResource.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcReflectedBuiltinResource createSafe(long address) {
        return address == NULL ? null : wrap(SpvcReflectedBuiltinResource.class, address);
    }

    /**
     * Returns a new {@link SpvcReflectedBuiltinResource.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedBuiltinResource.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcReflectedBuiltinResource.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedBuiltinResource.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcReflectedBuiltinResource.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedBuiltinResource.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SpvcReflectedBuiltinResource.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedBuiltinResource.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcReflectedBuiltinResource.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code SpvcReflectedBuiltinResource} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcReflectedBuiltinResource malloc(MemoryStack stack) {
        return wrap(SpvcReflectedBuiltinResource.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SpvcReflectedBuiltinResource} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcReflectedBuiltinResource calloc(MemoryStack stack) {
        return wrap(SpvcReflectedBuiltinResource.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpvcReflectedBuiltinResource.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedBuiltinResource.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcReflectedBuiltinResource.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedBuiltinResource.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #builtin}. */
    public static int nbuiltin(long struct) { return UNSAFE.getInt(null, struct + SpvcReflectedBuiltinResource.BUILTIN); }
    /** Unsafe version of {@link #value_type_id}. */
    public static int nvalue_type_id(long struct) { return UNSAFE.getInt(null, struct + SpvcReflectedBuiltinResource.VALUE_TYPE_ID); }
    /** Unsafe version of {@link #resource}. */
    public static SpvcReflectedResource nresource(long struct) { return SpvcReflectedResource.create(struct + SpvcReflectedBuiltinResource.RESOURCE); }

    /** Unsafe version of {@link #builtin(int) builtin}. */
    public static void nbuiltin(long struct, int value) { UNSAFE.putInt(null, struct + SpvcReflectedBuiltinResource.BUILTIN, value); }
    /** Unsafe version of {@link #value_type_id(int) value_type_id}. */
    public static void nvalue_type_id(long struct, int value) { UNSAFE.putInt(null, struct + SpvcReflectedBuiltinResource.VALUE_TYPE_ID, value); }
    /** Unsafe version of {@link #resource(SpvcReflectedResource) resource}. */
    public static void nresource(long struct, SpvcReflectedResource value) { memCopy(value.address(), struct + SpvcReflectedBuiltinResource.RESOURCE, SpvcReflectedResource.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        SpvcReflectedResource.validate(struct + SpvcReflectedBuiltinResource.RESOURCE);
    }

    // -----------------------------------

    /** An array of {@link SpvcReflectedBuiltinResource} structs. */
    public static class Buffer extends StructBuffer<SpvcReflectedBuiltinResource, Buffer> implements NativeResource {

        private static final SpvcReflectedBuiltinResource ELEMENT_FACTORY = SpvcReflectedBuiltinResource.create(-1L);

        /**
         * Creates a new {@code SpvcReflectedBuiltinResource.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcReflectedBuiltinResource#SIZEOF}, and its mark will be undefined.
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
        protected SpvcReflectedBuiltinResource getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link SpvcReflectedBuiltinResource#builtin} field. */
        @NativeType("SpvBuiltIn")
        public int builtin() { return SpvcReflectedBuiltinResource.nbuiltin(address()); }
        /** @return the value of the {@link SpvcReflectedBuiltinResource#value_type_id} field. */
        @NativeType("spvc_type_id")
        public int value_type_id() { return SpvcReflectedBuiltinResource.nvalue_type_id(address()); }
        /** @return a {@link SpvcReflectedResource} view of the {@link SpvcReflectedBuiltinResource#resource} field. */
        @NativeType("spvc_reflected_resource")
        public SpvcReflectedResource resource() { return SpvcReflectedBuiltinResource.nresource(address()); }

        /** Sets the specified value to the {@link SpvcReflectedBuiltinResource#builtin} field. */
        public SpvcReflectedBuiltinResource.Buffer builtin(@NativeType("SpvBuiltIn") int value) { SpvcReflectedBuiltinResource.nbuiltin(address(), value); return this; }
        /** Sets the specified value to the {@link SpvcReflectedBuiltinResource#value_type_id} field. */
        public SpvcReflectedBuiltinResource.Buffer value_type_id(@NativeType("spvc_type_id") int value) { SpvcReflectedBuiltinResource.nvalue_type_id(address(), value); return this; }
        /** Copies the specified {@link SpvcReflectedResource} to the {@link SpvcReflectedBuiltinResource#resource} field. */
        public SpvcReflectedBuiltinResource.Buffer resource(@NativeType("spvc_reflected_resource") SpvcReflectedResource value) { SpvcReflectedBuiltinResource.nresource(address(), value); return this; }
        /** Passes the {@link SpvcReflectedBuiltinResource#resource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SpvcReflectedBuiltinResource.Buffer resource(java.util.function.Consumer<SpvcReflectedResource> consumer) { consumer.accept(resource()); return this; }

    }

}