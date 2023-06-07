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
 * Interface which remaps vertex inputs to a fixed semantic name to make linking easier.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct spvc_hlsl_vertex_attribute_remap {
 *     unsigned int location;
 *     char const * semantic;
 * }</code></pre>
 */
@NativeType("struct spvc_hlsl_vertex_attribute_remap")
public class SpvcHlslVertexAttributeRemap extends Struct<SpvcHlslVertexAttributeRemap> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATION,
        SEMANTIC;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATION = layout.offsetof(0);
        SEMANTIC = layout.offsetof(1);
    }

    protected SpvcHlslVertexAttributeRemap(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpvcHlslVertexAttributeRemap create(long address, @Nullable ByteBuffer container) {
        return new SpvcHlslVertexAttributeRemap(address, container);
    }

    /**
     * Creates a {@code SpvcHlslVertexAttributeRemap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcHlslVertexAttributeRemap(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code location} field. */
    @NativeType("unsigned int")
    public int location() { return nlocation(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code semantic} field. */
    @NativeType("char const *")
    public ByteBuffer semantic() { return nsemantic(address()); }
    /** @return the null-terminated string pointed to by the {@code semantic} field. */
    @NativeType("char const *")
    public String semanticString() { return nsemanticString(address()); }

    /** Sets the specified value to the {@code location} field. */
    public SpvcHlslVertexAttributeRemap location(@NativeType("unsigned int") int value) { nlocation(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code semantic} field. */
    public SpvcHlslVertexAttributeRemap semantic(@NativeType("char const *") ByteBuffer value) { nsemantic(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcHlslVertexAttributeRemap set(
        int location,
        ByteBuffer semantic
    ) {
        location(location);
        semantic(semantic);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcHlslVertexAttributeRemap set(SpvcHlslVertexAttributeRemap src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcHlslVertexAttributeRemap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcHlslVertexAttributeRemap malloc() {
        return new SpvcHlslVertexAttributeRemap(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpvcHlslVertexAttributeRemap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcHlslVertexAttributeRemap calloc() {
        return new SpvcHlslVertexAttributeRemap(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpvcHlslVertexAttributeRemap} instance allocated with {@link BufferUtils}. */
    public static SpvcHlslVertexAttributeRemap create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcHlslVertexAttributeRemap(memAddress(container), container);
    }

    /** Returns a new {@code SpvcHlslVertexAttributeRemap} instance for the specified memory address. */
    public static SpvcHlslVertexAttributeRemap create(long address) {
        return new SpvcHlslVertexAttributeRemap(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcHlslVertexAttributeRemap createSafe(long address) {
        return address == NULL ? null : new SpvcHlslVertexAttributeRemap(address, null);
    }

    /**
     * Returns a new {@link SpvcHlslVertexAttributeRemap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHlslVertexAttributeRemap.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcHlslVertexAttributeRemap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHlslVertexAttributeRemap.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcHlslVertexAttributeRemap.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHlslVertexAttributeRemap.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpvcHlslVertexAttributeRemap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcHlslVertexAttributeRemap.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcHlslVertexAttributeRemap.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpvcHlslVertexAttributeRemap} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcHlslVertexAttributeRemap malloc(MemoryStack stack) {
        return new SpvcHlslVertexAttributeRemap(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpvcHlslVertexAttributeRemap} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcHlslVertexAttributeRemap calloc(MemoryStack stack) {
        return new SpvcHlslVertexAttributeRemap(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpvcHlslVertexAttributeRemap.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcHlslVertexAttributeRemap.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcHlslVertexAttributeRemap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcHlslVertexAttributeRemap.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return UNSAFE.getInt(null, struct + SpvcHlslVertexAttributeRemap.LOCATION); }
    /** Unsafe version of {@link #semantic}. */
    public static ByteBuffer nsemantic(long struct) { return memByteBufferNT1(memGetAddress(struct + SpvcHlslVertexAttributeRemap.SEMANTIC)); }
    /** Unsafe version of {@link #semanticString}. */
    public static String nsemanticString(long struct) { return memUTF8(memGetAddress(struct + SpvcHlslVertexAttributeRemap.SEMANTIC)); }

    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { UNSAFE.putInt(null, struct + SpvcHlslVertexAttributeRemap.LOCATION, value); }
    /** Unsafe version of {@link #semantic(ByteBuffer) semantic}. */
    public static void nsemantic(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SpvcHlslVertexAttributeRemap.SEMANTIC, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SpvcHlslVertexAttributeRemap.SEMANTIC));
    }

    // -----------------------------------

    /** An array of {@link SpvcHlslVertexAttributeRemap} structs. */
    public static class Buffer extends StructBuffer<SpvcHlslVertexAttributeRemap, Buffer> implements NativeResource {

        private static final SpvcHlslVertexAttributeRemap ELEMENT_FACTORY = SpvcHlslVertexAttributeRemap.create(-1L);

        /**
         * Creates a new {@code SpvcHlslVertexAttributeRemap.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcHlslVertexAttributeRemap#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpvcHlslVertexAttributeRemap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code location} field. */
        @NativeType("unsigned int")
        public int location() { return SpvcHlslVertexAttributeRemap.nlocation(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code semantic} field. */
        @NativeType("char const *")
        public ByteBuffer semantic() { return SpvcHlslVertexAttributeRemap.nsemantic(address()); }
        /** @return the null-terminated string pointed to by the {@code semantic} field. */
        @NativeType("char const *")
        public String semanticString() { return SpvcHlslVertexAttributeRemap.nsemanticString(address()); }

        /** Sets the specified value to the {@code location} field. */
        public SpvcHlslVertexAttributeRemap.Buffer location(@NativeType("unsigned int") int value) { SpvcHlslVertexAttributeRemap.nlocation(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code semantic} field. */
        public SpvcHlslVertexAttributeRemap.Buffer semantic(@NativeType("char const *") ByteBuffer value) { SpvcHlslVertexAttributeRemap.nsemantic(address(), value); return this; }

    }

}