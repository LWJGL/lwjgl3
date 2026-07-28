/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrInteractionRenderModelTopLevelUserPathGetInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t topLevelUserPathCount;
 *     XrPath const * topLevelUserPaths;
 * }}</pre>
 */
public class XrInteractionRenderModelTopLevelUserPathGetInfoEXT extends Struct<XrInteractionRenderModelTopLevelUserPathGetInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TOPLEVELUSERPATHCOUNT,
        TOPLEVELUSERPATHS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TOPLEVELUSERPATHCOUNT = layout.offsetof(2);
        TOPLEVELUSERPATHS = layout.offsetof(3);
    }

    protected XrInteractionRenderModelTopLevelUserPathGetInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrInteractionRenderModelTopLevelUserPathGetInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrInteractionRenderModelTopLevelUserPathGetInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrInteractionRenderModelTopLevelUserPathGetInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code topLevelUserPathCount} field. */
    @NativeType("uint32_t")
    public int topLevelUserPathCount() { return ntopLevelUserPathCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code topLevelUserPaths} field. */
    @NativeType("XrPath const *")
    public LongBuffer topLevelUserPaths() { return ntopLevelUserPaths(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTInteractionRenderModel#XR_TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT} value to the {@code type} field. */
    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT type$Default() { return type(EXTInteractionRenderModel.XR_TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code topLevelUserPaths} field. */
    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT topLevelUserPaths(@NativeType("XrPath const *") LongBuffer value) { ntopLevelUserPaths(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT set(
        int type,
        long next,
        LongBuffer topLevelUserPaths
    ) {
        type(type);
        next(next);
        topLevelUserPaths(topLevelUserPaths);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrInteractionRenderModelTopLevelUserPathGetInfoEXT set(XrInteractionRenderModelTopLevelUserPathGetInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrInteractionRenderModelTopLevelUserPathGetInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT malloc() {
        return new XrInteractionRenderModelTopLevelUserPathGetInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrInteractionRenderModelTopLevelUserPathGetInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT calloc() {
        return new XrInteractionRenderModelTopLevelUserPathGetInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrInteractionRenderModelTopLevelUserPathGetInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrInteractionRenderModelTopLevelUserPathGetInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrInteractionRenderModelTopLevelUserPathGetInfoEXT} instance for the specified memory address. */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT create(long address) {
        return new XrInteractionRenderModelTopLevelUserPathGetInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrInteractionRenderModelTopLevelUserPathGetInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrInteractionRenderModelTopLevelUserPathGetInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrInteractionRenderModelTopLevelUserPathGetInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT malloc(MemoryStack stack) {
        return new XrInteractionRenderModelTopLevelUserPathGetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrInteractionRenderModelTopLevelUserPathGetInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT calloc(MemoryStack stack) {
        return new XrInteractionRenderModelTopLevelUserPathGetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrInteractionRenderModelTopLevelUserPathGetInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInteractionRenderModelTopLevelUserPathGetInfoEXT.NEXT); }
    /** Unsafe version of {@link #topLevelUserPathCount}. */
    public static int ntopLevelUserPathCount(long struct) { return memGetInt(struct + XrInteractionRenderModelTopLevelUserPathGetInfoEXT.TOPLEVELUSERPATHCOUNT); }
    /** Unsafe version of {@link #topLevelUserPaths() topLevelUserPaths}. */
    public static LongBuffer ntopLevelUserPaths(long struct) { return memLongBuffer(memGetAddress(struct + XrInteractionRenderModelTopLevelUserPathGetInfoEXT.TOPLEVELUSERPATHS), ntopLevelUserPathCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrInteractionRenderModelTopLevelUserPathGetInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInteractionRenderModelTopLevelUserPathGetInfoEXT.NEXT, value); }
    /** Sets the specified value to the {@code topLevelUserPathCount} field of the specified {@code struct}. */
    public static void ntopLevelUserPathCount(long struct, int value) { memPutInt(struct + XrInteractionRenderModelTopLevelUserPathGetInfoEXT.TOPLEVELUSERPATHCOUNT, value); }
    /** Unsafe version of {@link #topLevelUserPaths(LongBuffer) topLevelUserPaths}. */
    public static void ntopLevelUserPaths(long struct, LongBuffer value) { memPutAddress(struct + XrInteractionRenderModelTopLevelUserPathGetInfoEXT.TOPLEVELUSERPATHS, memAddress(value)); ntopLevelUserPathCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrInteractionRenderModelTopLevelUserPathGetInfoEXT.TOPLEVELUSERPATHS));
    }

    // -----------------------------------

    /** An array of {@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrInteractionRenderModelTopLevelUserPathGetInfoEXT, Buffer> implements NativeResource {

        private static final XrInteractionRenderModelTopLevelUserPathGetInfoEXT ELEMENT_FACTORY = XrInteractionRenderModelTopLevelUserPathGetInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInteractionRenderModelTopLevelUserPathGetInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrInteractionRenderModelTopLevelUserPathGetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInteractionRenderModelTopLevelUserPathGetInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrInteractionRenderModelTopLevelUserPathGetInfoEXT.nnext(address()); }
        /** @return the value of the {@code topLevelUserPathCount} field. */
        @NativeType("uint32_t")
        public int topLevelUserPathCount() { return XrInteractionRenderModelTopLevelUserPathGetInfoEXT.ntopLevelUserPathCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code topLevelUserPaths} field. */
        @NativeType("XrPath const *")
        public LongBuffer topLevelUserPaths() { return XrInteractionRenderModelTopLevelUserPathGetInfoEXT.ntopLevelUserPaths(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrInteractionRenderModelTopLevelUserPathGetInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTInteractionRenderModel#XR_TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT} value to the {@code type} field. */
        public XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer type$Default() { return type(EXTInteractionRenderModel.XR_TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer next(@NativeType("void const *") long value) { XrInteractionRenderModelTopLevelUserPathGetInfoEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code topLevelUserPaths} field. */
        public XrInteractionRenderModelTopLevelUserPathGetInfoEXT.Buffer topLevelUserPaths(@NativeType("XrPath const *") LongBuffer value) { XrInteractionRenderModelTopLevelUserPathGetInfoEXT.ntopLevelUserPaths(address(), value); return this; }

    }

}