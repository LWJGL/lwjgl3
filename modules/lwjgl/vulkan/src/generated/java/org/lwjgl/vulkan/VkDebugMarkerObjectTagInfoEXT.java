/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkDebugMarkerObjectTagInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDebugReportObjectTypeEXT objectType;
 *     uint64_t object;
 *     uint64_t tagName;
 *     size_t tagSize;
 *     void const * pTag;
 * }}</pre>
 */
public class VkDebugMarkerObjectTagInfoEXT extends Struct<VkDebugMarkerObjectTagInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OBJECTTYPE,
        OBJECT,
        TAGNAME,
        TAGSIZE,
        PTAG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OBJECTTYPE = layout.offsetof(2);
        OBJECT = layout.offsetof(3);
        TAGNAME = layout.offsetof(4);
        TAGSIZE = layout.offsetof(5);
        PTAG = layout.offsetof(6);
    }

    protected VkDebugMarkerObjectTagInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDebugMarkerObjectTagInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDebugMarkerObjectTagInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDebugMarkerObjectTagInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugMarkerObjectTagInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code objectType} field. */
    @NativeType("VkDebugReportObjectTypeEXT")
    public int objectType() { return nobjectType(address()); }
    /** @return the value of the {@code object} field. */
    @NativeType("uint64_t")
    public long object() { return nobject(address()); }
    /** @return the value of the {@code tagName} field. */
    @NativeType("uint64_t")
    public long tagName() { return ntagName(address()); }
    /** @return the value of the {@code tagSize} field. */
    @NativeType("size_t")
    public long tagSize() { return ntagSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pTag} field. */
    @NativeType("void const *")
    public ByteBuffer pTag() { return npTag(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDebugMarkerObjectTagInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT} value to the {@code sType} field. */
    public VkDebugMarkerObjectTagInfoEXT sType$Default() { return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDebugMarkerObjectTagInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code objectType} field. */
    public VkDebugMarkerObjectTagInfoEXT objectType(@NativeType("VkDebugReportObjectTypeEXT") int value) { nobjectType(address(), value); return this; }
    /** Sets the specified value to the {@code object} field. */
    public VkDebugMarkerObjectTagInfoEXT object(@NativeType("uint64_t") long value) { nobject(address(), value); return this; }
    /** Sets the specified value to the {@code tagName} field. */
    public VkDebugMarkerObjectTagInfoEXT tagName(@NativeType("uint64_t") long value) { ntagName(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pTag} field. */
    public VkDebugMarkerObjectTagInfoEXT pTag(@NativeType("void const *") ByteBuffer value) { npTag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugMarkerObjectTagInfoEXT set(
        int sType,
        long pNext,
        int objectType,
        long object,
        long tagName,
        ByteBuffer pTag
    ) {
        sType(sType);
        pNext(pNext);
        objectType(objectType);
        object(object);
        tagName(tagName);
        pTag(pTag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDebugMarkerObjectTagInfoEXT set(VkDebugMarkerObjectTagInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugMarkerObjectTagInfoEXT malloc() {
        return new VkDebugMarkerObjectTagInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugMarkerObjectTagInfoEXT calloc() {
        return new VkDebugMarkerObjectTagInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugMarkerObjectTagInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugMarkerObjectTagInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance for the specified memory address. */
    public static VkDebugMarkerObjectTagInfoEXT create(long address) {
        return new VkDebugMarkerObjectTagInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDebugMarkerObjectTagInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDebugMarkerObjectTagInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDebugMarkerObjectTagInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugMarkerObjectTagInfoEXT malloc(MemoryStack stack) {
        return new VkDebugMarkerObjectTagInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugMarkerObjectTagInfoEXT calloc(MemoryStack stack) {
        return new VkDebugMarkerObjectTagInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDebugMarkerObjectTagInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.PNEXT); }
    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return memGetInt(struct + VkDebugMarkerObjectTagInfoEXT.OBJECTTYPE); }
    /** Unsafe version of {@link #object}. */
    public static long nobject(long struct) { return memGetLong(struct + VkDebugMarkerObjectTagInfoEXT.OBJECT); }
    /** Unsafe version of {@link #tagName}. */
    public static long ntagName(long struct) { return memGetLong(struct + VkDebugMarkerObjectTagInfoEXT.TAGNAME); }
    /** Unsafe version of {@link #tagSize}. */
    public static long ntagSize(long struct) { return memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.TAGSIZE); }
    /** Unsafe version of {@link #pTag() pTag}. */
    public static ByteBuffer npTag(long struct) { return memByteBuffer(memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.PTAG), (int)ntagSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDebugMarkerObjectTagInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugMarkerObjectTagInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #objectType(int) objectType}. */
    public static void nobjectType(long struct, int value) { memPutInt(struct + VkDebugMarkerObjectTagInfoEXT.OBJECTTYPE, value); }
    /** Unsafe version of {@link #object(long) object}. */
    public static void nobject(long struct, long value) { memPutLong(struct + VkDebugMarkerObjectTagInfoEXT.OBJECT, value); }
    /** Unsafe version of {@link #tagName(long) tagName}. */
    public static void ntagName(long struct, long value) { memPutLong(struct + VkDebugMarkerObjectTagInfoEXT.TAGNAME, value); }
    /** Sets the specified value to the {@code tagSize} field of the specified {@code struct}. */
    public static void ntagSize(long struct, long value) { memPutAddress(struct + VkDebugMarkerObjectTagInfoEXT.TAGSIZE, value); }
    /** Unsafe version of {@link #pTag(ByteBuffer) pTag}. */
    public static void npTag(long struct, ByteBuffer value) { memPutAddress(struct + VkDebugMarkerObjectTagInfoEXT.PTAG, memAddress(value)); ntagSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.PTAG));
    }

    // -----------------------------------

    /** An array of {@link VkDebugMarkerObjectTagInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugMarkerObjectTagInfoEXT, Buffer> implements NativeResource {

        private static final VkDebugMarkerObjectTagInfoEXT ELEMENT_FACTORY = VkDebugMarkerObjectTagInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugMarkerObjectTagInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugMarkerObjectTagInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDebugMarkerObjectTagInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugMarkerObjectTagInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugMarkerObjectTagInfoEXT.npNext(address()); }
        /** @return the value of the {@code objectType} field. */
        @NativeType("VkDebugReportObjectTypeEXT")
        public int objectType() { return VkDebugMarkerObjectTagInfoEXT.nobjectType(address()); }
        /** @return the value of the {@code object} field. */
        @NativeType("uint64_t")
        public long object() { return VkDebugMarkerObjectTagInfoEXT.nobject(address()); }
        /** @return the value of the {@code tagName} field. */
        @NativeType("uint64_t")
        public long tagName() { return VkDebugMarkerObjectTagInfoEXT.ntagName(address()); }
        /** @return the value of the {@code tagSize} field. */
        @NativeType("size_t")
        public long tagSize() { return VkDebugMarkerObjectTagInfoEXT.ntagSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pTag} field. */
        @NativeType("void const *")
        public ByteBuffer pTag() { return VkDebugMarkerObjectTagInfoEXT.npTag(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugMarkerObjectTagInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT} value to the {@code sType} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer sType$Default() { return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugMarkerObjectTagInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code objectType} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer objectType(@NativeType("VkDebugReportObjectTypeEXT") int value) { VkDebugMarkerObjectTagInfoEXT.nobjectType(address(), value); return this; }
        /** Sets the specified value to the {@code object} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer object(@NativeType("uint64_t") long value) { VkDebugMarkerObjectTagInfoEXT.nobject(address(), value); return this; }
        /** Sets the specified value to the {@code tagName} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer tagName(@NativeType("uint64_t") long value) { VkDebugMarkerObjectTagInfoEXT.ntagName(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pTag} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer pTag(@NativeType("void const *") ByteBuffer value) { VkDebugMarkerObjectTagInfoEXT.npTag(address(), value); return this; }

    }

}