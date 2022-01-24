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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct spvc_reflected_resource {
 *     spvc_variable_id {@link #id};
 *     spvc_type_id {@link #base_type_id};
 *     spvc_type_id {@link #type_id};
 *     char const * {@link #name};
 * }</code></pre>
 */
@NativeType("struct spvc_reflected_resource")
public class SpvcReflectedResource extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ID,
        BASE_TYPE_ID,
        TYPE_ID,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ID = layout.offsetof(0);
        BASE_TYPE_ID = layout.offsetof(1);
        TYPE_ID = layout.offsetof(2);
        NAME = layout.offsetof(3);
    }

    /**
     * Creates a {@code SpvcReflectedResource} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcReflectedResource(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Resources are identified with their SPIR-V ID. This is the ID of the OpVariable. */
    @NativeType("spvc_variable_id")
    public int id() { return nid(address()); }
    /**
     * The base type of the declared resource.
     * 
     * <p>This type is the base type which ignores pointers and arrays of the {@code type_id}. This is mostly useful to parse decorations of the underlying
     * type. {@code base_type_id} can also be obtained with {@code get_type(get_type(type_id).self)}.</p>
     */
    @NativeType("spvc_type_id")
    public int base_type_id() { return nbase_type_id(address()); }
    /**
     * The type ID of the variable which includes arrays and all type modifications.
     * 
     * <p>This type ID is not suitable for parsing {@code OpMemberDecoration} of a struct and other decorations in general since these modifications typically
     * happen on the {@code base_type_id}.</p>
     */
    @NativeType("spvc_type_id")
    public int type_id() { return ntype_id(address()); }
    /**
     * The declared name ({@code OpName}) of the resource.
     * 
     * <p>For Buffer blocks, the name actually reflects the externally visible {@code Block} name. This name can be retrieved again by using either
     * {@code get_name(id)} or {@code get_name(base_type_id)} depending if it's a buffer block or not. This name can be an empty string in which case
     * {@code get_fallback_name(id)} can be used which obtains a suitable fallback identifier for an ID.</p>
     */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /**
     * The declared name ({@code OpName}) of the resource.
     * 
     * <p>For Buffer blocks, the name actually reflects the externally visible {@code Block} name. This name can be retrieved again by using either
     * {@code get_name(id)} or {@code get_name(base_type_id)} depending if it's a buffer block or not. This name can be an empty string in which case
     * {@code get_fallback_name(id)} can be used which obtains a suitable fallback identifier for an ID.</p>
     */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }

    /** Sets the specified value to the {@link #id} field. */
    public SpvcReflectedResource id(@NativeType("spvc_variable_id") int value) { nid(address(), value); return this; }
    /** Sets the specified value to the {@link #base_type_id} field. */
    public SpvcReflectedResource base_type_id(@NativeType("spvc_type_id") int value) { nbase_type_id(address(), value); return this; }
    /** Sets the specified value to the {@link #type_id} field. */
    public SpvcReflectedResource type_id(@NativeType("spvc_type_id") int value) { ntype_id(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #name} field. */
    public SpvcReflectedResource name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcReflectedResource set(
        int id,
        int base_type_id,
        int type_id,
        ByteBuffer name
    ) {
        id(id);
        base_type_id(base_type_id);
        type_id(type_id);
        name(name);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcReflectedResource set(SpvcReflectedResource src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcReflectedResource} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcReflectedResource malloc() {
        return wrap(SpvcReflectedResource.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SpvcReflectedResource} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcReflectedResource calloc() {
        return wrap(SpvcReflectedResource.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SpvcReflectedResource} instance allocated with {@link BufferUtils}. */
    public static SpvcReflectedResource create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SpvcReflectedResource.class, memAddress(container), container);
    }

    /** Returns a new {@code SpvcReflectedResource} instance for the specified memory address. */
    public static SpvcReflectedResource create(long address) {
        return wrap(SpvcReflectedResource.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcReflectedResource createSafe(long address) {
        return address == NULL ? null : wrap(SpvcReflectedResource.class, address);
    }

    /**
     * Returns a new {@link SpvcReflectedResource.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedResource.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcReflectedResource.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedResource.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcReflectedResource.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedResource.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SpvcReflectedResource.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedResource.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcReflectedResource.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code SpvcReflectedResource} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcReflectedResource malloc(MemoryStack stack) {
        return wrap(SpvcReflectedResource.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SpvcReflectedResource} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcReflectedResource calloc(MemoryStack stack) {
        return wrap(SpvcReflectedResource.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpvcReflectedResource.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedResource.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcReflectedResource.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcReflectedResource.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #id}. */
    public static int nid(long struct) { return UNSAFE.getInt(null, struct + SpvcReflectedResource.ID); }
    /** Unsafe version of {@link #base_type_id}. */
    public static int nbase_type_id(long struct) { return UNSAFE.getInt(null, struct + SpvcReflectedResource.BASE_TYPE_ID); }
    /** Unsafe version of {@link #type_id}. */
    public static int ntype_id(long struct) { return UNSAFE.getInt(null, struct + SpvcReflectedResource.TYPE_ID); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + SpvcReflectedResource.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + SpvcReflectedResource.NAME)); }

    /** Unsafe version of {@link #id(int) id}. */
    public static void nid(long struct, int value) { UNSAFE.putInt(null, struct + SpvcReflectedResource.ID, value); }
    /** Unsafe version of {@link #base_type_id(int) base_type_id}. */
    public static void nbase_type_id(long struct, int value) { UNSAFE.putInt(null, struct + SpvcReflectedResource.BASE_TYPE_ID, value); }
    /** Unsafe version of {@link #type_id(int) type_id}. */
    public static void ntype_id(long struct, int value) { UNSAFE.putInt(null, struct + SpvcReflectedResource.TYPE_ID, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SpvcReflectedResource.NAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SpvcReflectedResource.NAME));
    }

    // -----------------------------------

    /** An array of {@link SpvcReflectedResource} structs. */
    public static class Buffer extends StructBuffer<SpvcReflectedResource, Buffer> implements NativeResource {

        private static final SpvcReflectedResource ELEMENT_FACTORY = SpvcReflectedResource.create(-1L);

        /**
         * Creates a new {@code SpvcReflectedResource.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcReflectedResource#SIZEOF}, and its mark will be undefined.
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
        protected SpvcReflectedResource getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link SpvcReflectedResource#id} field. */
        @NativeType("spvc_variable_id")
        public int id() { return SpvcReflectedResource.nid(address()); }
        /** @return the value of the {@link SpvcReflectedResource#base_type_id} field. */
        @NativeType("spvc_type_id")
        public int base_type_id() { return SpvcReflectedResource.nbase_type_id(address()); }
        /** @return the value of the {@link SpvcReflectedResource#type_id} field. */
        @NativeType("spvc_type_id")
        public int type_id() { return SpvcReflectedResource.ntype_id(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link SpvcReflectedResource#name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return SpvcReflectedResource.nname(address()); }
        /** @return the null-terminated string pointed to by the {@link SpvcReflectedResource#name} field. */
        @NativeType("char const *")
        public String nameString() { return SpvcReflectedResource.nnameString(address()); }

        /** Sets the specified value to the {@link SpvcReflectedResource#id} field. */
        public SpvcReflectedResource.Buffer id(@NativeType("spvc_variable_id") int value) { SpvcReflectedResource.nid(address(), value); return this; }
        /** Sets the specified value to the {@link SpvcReflectedResource#base_type_id} field. */
        public SpvcReflectedResource.Buffer base_type_id(@NativeType("spvc_type_id") int value) { SpvcReflectedResource.nbase_type_id(address(), value); return this; }
        /** Sets the specified value to the {@link SpvcReflectedResource#type_id} field. */
        public SpvcReflectedResource.Buffer type_id(@NativeType("spvc_type_id") int value) { SpvcReflectedResource.ntype_id(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link SpvcReflectedResource#name} field. */
        public SpvcReflectedResource.Buffer name(@NativeType("char const *") ByteBuffer value) { SpvcReflectedResource.nname(address(), value); return this; }

    }

}